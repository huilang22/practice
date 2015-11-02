
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: AccountCodeBean.java
 * Definition File: Customer/AccountCode.xml
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Current generator limitations
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Object Summary Information
 *---------------------------------------------------------------------------*/
 /**--------------------------------------------------------------------------
 * Product    : BP
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Copyright 2006 Comverse, Inc.  All Rights Reserved.
 *----------------------------------------------------------------------------
 */

package com.csgsystems.bp.session;

import java.io.*;
import java.math.*;
import java.util.*;

import javax.ejb.*;
import javax.naming.*;
import javax.resource.*;
import javax.resource.cci.*;

import com.csgsystems.api.defaults.*;
import com.csgsystems.api.constraint.*;

import com.csgsystems.aruba.connection.BSDMConnectionManager;
import com.csgsystems.aruba.connection.BSDMConnectionSpec;
import com.csgsystems.aruba.connection.BSDMInteractionSpec;
import com.csgsystems.aruba.connection.BSDMResourceException;
import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.aruba.connection.BSDMSettings;
import com.csgsystems.bali.connection.ApiMappings;

import javax.ejb.Stateless;  
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.BeanParam;
import javax.inject.Inject;



import com.csgsystems.bp.data.*;
import com.csgsystems.bp.interfaces.AccountCodeInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="AccountCodeSessionBean"
 * display-name="AccountCode Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/AccountCodeBean"
 * transaction-type="Bean"
 * @ejb:permission role-name="ArubaUser"
 * @ejb:security-identity run-as="ArubaUser"
 * @ejb:resource-ref res-name="BSDMEIS"
 * res-type="javax.resource.cci.ConnectionFactory"
 * res-auth="Container"
 * @jboss:resource-manager res-man-class="javax.resource.cci.ConnectionFactory"
 * res-man-name="BSDMEIS"
 * res-man-jndi-name="java:/eis/JNITux"
 * @weblogic:resource-description res-ref-name="BSDMEIS"
 * jndi-name="eis/JNITux"
 * @websphere:resource-ref res-name="BSDMEIS"
 * jndi-name="eis/JNITux"
 * @jrun:resource-ref resource-ref-name="BSDMEIS"
 * jndi-name="eis/JNITux"
 * @ejb:transaction type="NotSupported"
 * @ejb:bean view-type="remote"
 */

@Stateless(name="AccountCodeBean", mappedName = "AccountCode")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("AccountCodes")

public class AccountCodeBean implements AccountCodeInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _AccountCodeGetSpec = null;
  /**
   * Retrieve a unique AccountCode row..
   * Convenience method using default BSDMSessionContext.
   * @param CACgetIn Input Object Key.
   * @return AccountCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountCodeObjectData get (AccountCodeObjectKeyData CACgetIn) throws BSDMResourceException
  {
    return get (null, CACgetIn);
  }
  /**
   * Retrieve a unique AccountCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACgetIn Input Object Key.
   * @return AccountCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public AccountCodeObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam AccountCodeObjectKeyData CACgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountCodeGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CACgetIn != null) AccountCodeObjectKeyHelper.toMap (CACgetIn, record, "AccountCode");
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return AccountCodeObjectHelper.fromMap (record, "AccountCode");
}

  private BSDMInteractionSpec _AccountCodeFindSpec = null;
  /**
   * Find AccountCodes that match a filter..
   * Convenience method using default BSDMSessionContext.
   * @param CACfindIn Input Filter Object.
   * @return AccountCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountCodeObjectDataList find (AccountCodeObjectFilter CACfindIn) throws BSDMResourceException
  {
    return find (null, CACfindIn);
  }
  /**
   * Find AccountCodes that match a filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACfindIn Input Filter Object.
   * @return AccountCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountCodeObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,AccountCodeObjectFilter CACfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountCodeFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CACfindIn != null) AccountCodeObjectHelper.toMap (CACfindIn, record, "AccountCode");
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return AccountCodeObjectHelper.fromMapList (record, "AccountCodeList");
}

  private BSDMInteractionSpec _AccountCodeCreateSpec = null;
  /**
   * Create a new AccountCode..
   * Convenience method using default BSDMSessionContext.
   * @param CACcreateIn Input  Object.
   * @return AccountCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountCodeObjectData create (AccountCodeObjectData CACcreateIn) throws BSDMResourceException
  {
    return create (null, CACcreateIn);
  }
  /**
   * Create a new AccountCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACcreateIn Input  Object.
   * @return AccountCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountCodeObjectData create (@HeaderParam ("context")BSDMSessionContext context,AccountCodeObjectData CACcreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountCodeCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CACcreateIn != null) AccountCodeObjectHelper.toMap (CACcreateIn, record, "AccountCode");
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return AccountCodeObjectHelper.fromMap (record, "AccountCode");
}

  private BSDMInteractionSpec _AccountCodeUpdateSpec = null;
  /**
   * Update non-key fields of an AccountCode row..
   * Convenience method using default BSDMSessionContext.
   * @param CACupdateIn Input  Object.
   * @return AccountCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountCodeObjectData update (AccountCodeObjectData CACupdateIn) throws BSDMResourceException
  {
    return update (null, CACupdateIn);
  }
  /**
   * Update non-key fields of an AccountCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACupdateIn Input  Object.
   * @return AccountCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountCodeObjectData update (@HeaderParam ("context")BSDMSessionContext context,AccountCodeObjectData CACupdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountCodeUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CACupdateIn != null) AccountCodeObjectHelper.toMap (CACupdateIn, record, "AccountCode");
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return AccountCodeObjectHelper.fromMap (record, "AccountCode");
}

  private BSDMInteractionSpec _AccountCodeDeleteSpec = null;
  /**
   * Delete an AccountCode row..
   * Convenience method using default BSDMSessionContext.
   * @param CACdeleteIn Input Object Key.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void delete (AccountCodeObjectKeyData CACdeleteIn) throws BSDMResourceException
  {
    delete (null, CACdeleteIn);
  }
  /**
   * Delete an AccountCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACdeleteIn Input Object Key.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})

 public void delete (@HeaderParam ("context")BSDMSessionContext context,AccountCodeObjectKeyData CACdeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountCodeDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CACdeleteIn != null) AccountCodeObjectKeyHelper.toMap (CACdeleteIn, record, "AccountCode");
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return;
}

  private BSDMInteractionSpec _AccountCodeDeleteListSpec = null;
  /**
   * Delete AccountCodes that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CACLdeleteIn Input Filter Object.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void deleteList (AccountCodeObjectFilter CACLdeleteIn) throws BSDMResourceException
  {
    deleteList (null, CACLdeleteIn);
  }
  /**
   * Delete AccountCodes that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACLdeleteIn Input Filter Object.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteList")
@Consumes({"application/json","application/xml"})

 public void deleteList (@HeaderParam ("context")BSDMSessionContext context,AccountCodeObjectFilter CACLdeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountCodeDeleteListSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CACLdeleteIn != null) AccountCodeObjectHelper.toMap (CACLdeleteIn, record, "AccountCode");
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return;
}

  /**

   * Retrieve a unique AccountCode row..

   * Convenience method using default BSDMSessionContext.

   * @param CACgetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountCodeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountCodeObjectData get (AccountCodeObjectKeyData CACgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, CACgetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a unique AccountCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACgetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountCodeObjectData get (BSDMSessionContext context, AccountCodeObjectKeyData CACgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CACgetIn, defaultAction);
       
     cManager.checkConstraints(CACgetIn, constraintAction);
       return get (context, CACgetIn);
  }

  /**

   * Find AccountCodes that match a filter..

   * Convenience method using default BSDMSessionContext.

   * @param CACfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountCodeObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountCodeObjectDataList find (AccountCodeObjectFilter CACfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, CACfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find AccountCodes that match a filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountCodeObjectDataList find (BSDMSessionContext context, AccountCodeObjectFilter CACfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CACfindIn, defaultAction);
       
     cManager.checkConstraints(CACfindIn, constraintAction);
       return find (context, CACfindIn);
  }

  /**

   * Create a new AccountCode..

   * Convenience method using default BSDMSessionContext.

   * @param CACcreateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountCodeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountCodeObjectData create (AccountCodeObjectData CACcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, CACcreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new AccountCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACcreateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountCodeObjectData create (BSDMSessionContext context, AccountCodeObjectData CACcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CACcreateIn, defaultAction);
       
     cManager.checkConstraints(CACcreateIn, constraintAction);
       return create (context, CACcreateIn);
  }

  /**

   * Update non-key fields of an AccountCode row..

   * Convenience method using default BSDMSessionContext.

   * @param CACupdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountCodeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountCodeObjectData update (AccountCodeObjectData CACupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, CACupdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of an AccountCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACupdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountCodeObjectData update (BSDMSessionContext context, AccountCodeObjectData CACupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CACupdateIn, defaultAction);
       
     cManager.checkConstraints(CACupdateIn, constraintAction);
       return update (context, CACupdateIn);
  }

  /**

   * Delete an AccountCode row..

   * Convenience method using default BSDMSessionContext.

   * @param CACdeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void delete (AccountCodeObjectKeyData CACdeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    delete (null, CACdeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete an AccountCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACdeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void delete (BSDMSessionContext context, AccountCodeObjectKeyData CACdeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CACdeleteIn, defaultAction);
       
     cManager.checkConstraints(CACdeleteIn, constraintAction);
       delete (context, CACdeleteIn);
  }

  /**

   * Delete AccountCodes that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param CACLdeleteIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void deleteList (AccountCodeObjectFilter CACLdeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    deleteList (null, CACLdeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete AccountCodes that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACLdeleteIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void deleteList (BSDMSessionContext context, AccountCodeObjectFilter CACLdeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CACLdeleteIn, defaultAction);
       
     cManager.checkConstraints(CACLdeleteIn, constraintAction);
       deleteList (context, CACLdeleteIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public AccountCodeBean ()
  {
    try
    {
      _AccountCodeGetSpec = new BSDMInteractionSpec("AccountCodeGet", ApiMappings.getCallName ("AccountCodeGet"), Boolean.TRUE);

      _AccountCodeFindSpec = new BSDMInteractionSpec("AccountCodeFind", ApiMappings.getCallName ("AccountCodeFind"), Boolean.TRUE);

      _AccountCodeCreateSpec = new BSDMInteractionSpec("AccountCodeCreate", ApiMappings.getCallName ("AccountCodeCreate"), Boolean.TRUE);

      _AccountCodeUpdateSpec = new BSDMInteractionSpec("AccountCodeUpdate", ApiMappings.getCallName ("AccountCodeUpdate"), Boolean.TRUE);

      _AccountCodeDeleteSpec = new BSDMInteractionSpec("AccountCodeDelete", ApiMappings.getCallName ("AccountCodeDelete"), Boolean.TRUE);

      _AccountCodeDeleteListSpec = new BSDMInteractionSpec("AccountCodeDeleteList", ApiMappings.getCallName ("AccountCodeDeleteList"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public AccountCodeBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public AccountCodeBean(BSDMSettings settings, BSDMConnectionManager cm)
  {
    this();
    this.settings = settings;
    cf = cm.getConnectionFactory ();
  }
  /** Method used by EJB App Servers. */
  public void setSessionContext(SessionContext sc)
  {
    this.sc = sc;
    Properties props = new Properties();
    String lookupName = "java:comp/env/BSDMEIS";
    try
    {
      props.load(this.getClass().getResourceAsStream("/bsdJndi.properties"));
      String url = props.getProperty("jndi.url");
      String principal = props.getProperty("jndi.principal");
      String credentials = props.getProperty("jndi.credentials");
      String factory = props.getProperty("jndi.factory");
      if (url != null) props.put(Context.PROVIDER_URL, url);
      if (principal != null) props.put(Context.SECURITY_PRINCIPAL, principal);
      if (credentials != null) props.put(Context.SECURITY_CREDENTIALS, credentials);
      if (factory != null) props.put(Context.INITIAL_CONTEXT_FACTORY, factory);
      lookupName = props.getProperty("ConnectorJndiName", "java:comp/env/BSDMEIS");
    }
    catch (Exception x)
    {
      x.printStackTrace();
      props = new Properties();
      lookupName = "java:comp/env/BSDMEIS";
    }
    try
    {
      Context ic = new InitialContext(props);
      cf = (ConnectionFactory) ic.lookup(lookupName);
      settings = BSDMSettings.getDefault ();
    }
    catch (NamingException ex)
    {
      ex.printStackTrace();
    }
  }
  private Connection openConnection() throws ResourceException
  {
    return cf.getConnection();
  }
  private void closeConnection(Connection connection) throws ResourceException
  {
    connection.close();
  }
}
