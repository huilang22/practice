/*
 * Created on Jul 10, 2003
 * 
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
 */
package com.csgsystems.aruba.test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.resource.ResourceException;
import javax.resource.cci.LocalTransaction;

import com.csgsystems.aruba.connection.BSDMConnectionManager;
import com.csgsystems.aruba.connection.BSDMResourceException;
import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.aruba.connection.BSDMSettings;
import com.csgsystems.aruba.connection.Connection;
import com.csgsystems.aruba.connection.ConnectionFactory;
import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.filter.StringEquals;
import com.csgsystems.aruba.filter.StringFilter;
import com.csgsystems.aruba.filter.StringIsNull;
import com.csgsystems.bp.data.AccountCreateOutputData;
import com.csgsystems.bp.data.AccountLocateXIDObjectDataList;
import com.csgsystems.bp.data.AccountLocateXIDObjectFilter;
import com.csgsystems.bp.data.AccountObjectKeyData;
import com.csgsystems.bp.data.AccountSegmentObjectFilter;
import com.csgsystems.bp.data.AccountXIDObjectData;
import com.csgsystems.bp.data.AccountXIDObjectHelper;
import com.csgsystems.bp.session.AccountBean;
import com.csgsystems.bp.session.AccountLocateBean;
import com.csgsystems.bp.session.AccountSegmentBean;
import com.csgsystems.fx.security.SecurityManagerFactory;
import com.csgsystems.fx.security.util.FxException;

/**
 */
public class AccountJavaBeanTest
{

  public static void main (String[] args)
  {
    BufferedWriter bw = new BufferedWriter (new PrintWriter (System.out));

    if (args.length != 0 && args.length != 5)
    {
      System.err.println ("Usage: java " + AccountJavaBeanTest.class.toString ()
          + " [<user> <client> <pass> <group> <data>]");
      System.err.println ("\tUse null to leave a field blank.");
      System.exit (1);
    }

    ConnectionFactory factory = null;
    Connection connection = null;
    LocalTransaction transaction = null;

    String user = null;
    String pass = null;
    String client = null;
    String group = null;
    String data = null;

    /** 0) Parse command line... */
    if (args.length == 5)
    {
      user = args[0];
      if (user.equals ("null")) user = null;
      client = args[1];
      if (client.equals ("null")) client = null;
      pass = args[2];
      if (pass.equals ("null")) pass = null;
      group = args[3];
      if (group.equals ("null")) group = null;
      data = args[4];
      if (data.equals ("null")) data = null;
    }

    try
    {
      BSDMConnectionManager mgr = null;
      BSDMSessionContext context = null;

      /** authenticate the user, and set the security context. */
      String realm = "KenanFx";
      String userId = "arborsv";
      String sessionId = null;
      String password = "kenanfx";
      com.csgsystems.fx.security.SecurityManager sm = SecurityManagerFactory.createSecurityManager (realm, userId,
          sessionId, password);

      /*
       * 1) Create the javabean (providing BSDMSettings)
       */
      BSDMConnectionManager cm = new BSDMConnectionManager ();
      AccountBean bean = new AccountBean (BSDMSettings.getDefault ());

      /*
       * 2) Create the data to send to the Service
       */
      AccountXIDObjectData obj = new AccountXIDObjectData ();
      obj.setBillLname ("Brady");
      obj.setBillCompany ("Brady Inc");
      /*obj.setPayMethod (new Integer (1));*/
      obj.setAccountCategory (new Integer (1));
      obj.extendedData = new HashMap ();
      // obj.extendedData.put (new Integer (1), new Integer (7));
      System.out.println ("Input: ");
      Map map = new HashMap ();
      ServiceException.printMap (bw, AccountXIDObjectHelper.toMap (obj, map), 2);
      bw.flush ();

      /*
       * 3) Obtain the context.
       */
      context = BSDMSessionContext.getDefaultContext ();
      context.setSecurityContext (sm);

      /*
       * 4) Start the Transaction.
       */
      transaction = cm.getLocalTransaction ();
      transaction.begin ();

      /*
       * 5) Call the Service
       */
      AccountCreateOutputData acout = bean.create (context, obj, null, null, null, null, null, null, null);
      AccountXIDObjectData out = acout.acOut;
      AccountSegmentBean asb = new AccountSegmentBean (BSDMSettings.getDefault ());
      AccountSegmentObjectFilter asf = new AccountSegmentObjectFilter ();
      asb.find(asf);

      /*
       * 6) Handle output.
       */
      System.out.println ("ServerId: " + context.getServerId ());
      System.out.println ("Output: ");
      map = new HashMap ();
      ServiceException.printMap (bw, AccountXIDObjectHelper.toMap (out, map), 2);
      bw.flush ();

      /*
       * 7) Let's find an Account on the Catalog DB. First create data we'll
       * find any account that has a last name that is null or Brady
       */
      AccountLocateXIDObjectFilter objFilter = new AccountLocateXIDObjectFilter ();
      StringFilter[] fieldFilterList = new StringFilter[2];
      fieldFilterList[0] = new StringIsNull (); /*
                                                 * SERVER_LOOKUP.bill_lname IS
                                                 * NULL
                                                 */
      fieldFilterList[1] = new StringEquals ("Brady"); /*
                                                         * OR
                                                         * SERVER_LOOKUP.bill_lname =
                                                         * 'Brady'
                                                         */
      objFilter.setBillLnameFilter (fieldFilterList); /*
                                                       * could use BillLnameFind
                                                       * field if we want case
                                                       * insensitive
                                                       */
      objFilter.setFetch (true); /* return all fields in output */

      /*
       * 8) now get the AccountLocateBean
       */
      AccountLocateBean locateBean = new AccountLocateBean (BSDMSettings.getDefault ());

      /*
       * 9) now call the find method on AccountLocate AccountLocate is on the
       * Catalog server, so serverId is ignored in MSA
       */
      AccountLocateXIDObjectDataList list = locateBean.find (context, objFilter);

      /*
       * 10) handle list output
       */
      System.out.println ("Returned Count: " + list.getLength () + " Total Count: " + list.getTotalCount ());
      for (int i = 0; i < list.getLength (); i++)
      {
        System.out.println ("  AccountNo: " + list.getArray ()[i].getAccountInternalId () + " BillLname: '"
            + list.getArray ()[i].getBillLname () + "' ServerId: " + list.getArray ()[i].getServerId ());
      }

      if (list.getLength () > 0)
      {
        /*
         * 11) lets get the Account on the correct customer server. set serverId
         * first
         */
        context.setServerId (list.getArray ()[0].getServerId ());

        /*
         * 12) set up the data for AccountGet
         */
        AccountObjectKeyData key = new AccountObjectKeyData ();
        key.setAccountInternalId (list.getArray ()[0].getAccountInternalId ());

        /*
         * 13) call bean.get ()
         */
        AccountXIDObjectData account = bean.get (context, key);

        /*
         * 14) Handle output.
         */
        System.out.println ("ServerId: " + context.getServerId ());
        System.out.println ("Output: ");
        map = new HashMap ();
        ServiceException.printMap (bw, AccountXIDObjectHelper.toMap (account, map), 2);
        bw.flush ();
      }

      /*
       * 15) Commit Transaction.
       */
      transaction.rollback ();
    }
    catch (BSDMResourceException be)
    {
      /*
       * 16) handle exceptions.
       */
      System.err.println ("======= Error Executing Test =======");
      be.printStackTrace ();
      if (be.getCause () != null) be.getCause ().printStackTrace ();
      be.printItem ();
      System.err.println ("====================================");
      if (transaction != null)
      {
        try
        {
          transaction.rollback ();
        }
        catch (Exception ex)
        {
          System.err.println ("== Error Rolling Back Transaction ==");
          ex.printStackTrace ();
          System.err.println ("====================================");
        }
      }
    }
    catch (ResourceException re)
    {
      /*
       * 16) handle exceptions.
       */
      System.err.println ("======= Error Executing Test =======");
      re.printStackTrace ();
      if (re.getCause () != null) re.getCause ().printStackTrace ();
      System.err.println ("====================================");
      if (transaction != null)
      {
        try
        {
          transaction.rollback ();
        }
        catch (Exception ex)
        {
          System.err.println ("== Error Rolling Back Transaction ==");
          ex.printStackTrace ();
          System.err.println ("====================================");
        }
      }
    }
    catch (ServiceException se)
    {
      /*
       * 16) handle exceptions.
       */
      System.err.println ("======= Error Executing Test =======");
      se.printStackTrace ();
      if (se.getCause () != null) se.getCause ().printStackTrace ();
      se.printItem ();
      System.err.println ("====================================");
      if (transaction != null)
      {
        try
        {
          transaction.rollback ();
        }
        catch (Exception ex)
        {
          System.err.println ("== Error Rolling Back Transaction ==");
          ex.printStackTrace ();
          System.err.println ("====================================");
        }
      }
    }
    catch (FxException fxe)
    {
      /*
       * 16) handle exceptions.
       */
      System.err.println ("======= Error Executing Test =======");
      fxe.printStackTrace ();
      System.err.println ("====================================");
      if (transaction != null)
      {
        try
        {
          transaction.rollback ();
        }
        catch (Exception ex)
        {
          System.err.println ("== Error Rolling Back Transaction ==");
          ex.printStackTrace ();
          System.err.println ("====================================");
        }
      }
    }
    catch (IOException ioe)
    {
      /*
       * 16) handle exceptions.
       */
      System.err.println ("======= Error Executing Test =======");
      ioe.printStackTrace ();
      System.err.println ("====================================");
      if (transaction != null)
      {
        try
        {
          transaction.rollback ();
        }
        catch (Exception ex)
        {
          System.err.println ("== Error Rolling Back Transaction ==");
          ex.printStackTrace ();
          System.err.println ("====================================");
        }
      }
    }
    System.exit (0);
  }
}
