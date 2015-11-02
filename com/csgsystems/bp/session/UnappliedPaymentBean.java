
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: UnappliedPaymentBean.java
 * Definition File: Customer/UnappliedPayment.xml
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
import com.csgsystems.bp.interfaces.UnappliedPaymentInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="UnappliedPaymentSessionBean"
 * display-name="UnappliedPayment Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/UnappliedPaymentBean"
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

@Stateless(name="UnappliedPaymentBean", mappedName = "UnappliedPayment")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("UnappliedPayments")

public class UnappliedPaymentBean implements UnappliedPaymentInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _UnappliedPaymentGetSpec = null;
  /**
   * Retrieve a UnappliedPayment based upon its key..
   * Convenience method using default BSDMSessionContext.
   * @param unappliedPaymentGetIn Input Object Key.
   * @return UnappliedPaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public UnappliedPaymentObjectData get (UnappliedPaymentObjectKeyData unappliedPaymentGetIn) throws BSDMResourceException
  {
    return get (null, unappliedPaymentGetIn);
  }
  /**
   * Retrieve a UnappliedPayment based upon its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param unappliedPaymentGetIn Input Object Key.
   * @return UnappliedPaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public UnappliedPaymentObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam UnappliedPaymentObjectKeyData unappliedPaymentGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_UnappliedPaymentGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (unappliedPaymentGetIn != null) UnappliedPaymentObjectKeyHelper.toMap (unappliedPaymentGetIn, record, "UnappliedPayment");
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
return UnappliedPaymentObjectHelper.fromMap (record, "UnappliedPayment");
}

  private BSDMInteractionSpec _UnappliedPaymentFindSpec = null;
  /**
   * Find UnappliedPayments that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param unappliedPaymentFindIn Input Filter Object.
   * @return UnappliedPaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public UnappliedPaymentObjectDataList find (UnappliedPaymentObjectFilter unappliedPaymentFindIn) throws BSDMResourceException
  {
    return find (null, unappliedPaymentFindIn);
  }
  /**
   * Find UnappliedPayments that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param unappliedPaymentFindIn Input Filter Object.
   * @return UnappliedPaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public UnappliedPaymentObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,UnappliedPaymentObjectFilter unappliedPaymentFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_UnappliedPaymentFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (unappliedPaymentFindIn != null) UnappliedPaymentObjectHelper.toMap (unappliedPaymentFindIn, record, "UnappliedPayment");
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
return UnappliedPaymentObjectHelper.fromMapList (record, "UnappliedPaymentList");
}

  private BSDMInteractionSpec _UnappliedPaymentUpdateSpec = null;
  /**
   * Update an UnappliedPayment based upon its key..
   * Convenience method using default BSDMSessionContext.
   * @param unappliedPaymentUpdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BmfErrorText, OrigBillRefNo, OrigBillRefResets, CrNoteBillRefNo, CrNoteBillRefResets, BmfTransType, TransDate, PostDate, CurrencyCode, TransAmount, GlAmount, OrigTrackingId, OrigTrackingIdServ, TransSource, ChgDate, SourceType, SourceIdServ, SourceId, BatchId, BatchIdServ, TransSubmitter, ActionCode, ProfileId, MicrBankId, MicrDdaNum, MicrCheckNum, ArchFlag, ManualCcauthCode, ManualCcauthDate, FileId, ResponseCode, BillOrderNumber, ExternalAmount, ExternalCurrency, OpenItemId, Annotation.
   * @return UnappliedPaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public UnappliedPaymentObjectData update (UnappliedPaymentObjectData unappliedPaymentUpdateIn) throws BSDMResourceException
  {
    return update (null, unappliedPaymentUpdateIn);
  }
  /**
   * Update an UnappliedPayment based upon its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param unappliedPaymentUpdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BmfErrorText, OrigBillRefNo, OrigBillRefResets, CrNoteBillRefNo, CrNoteBillRefResets, BmfTransType, TransDate, PostDate, CurrencyCode, TransAmount, GlAmount, OrigTrackingId, OrigTrackingIdServ, TransSource, ChgDate, SourceType, SourceIdServ, SourceId, BatchId, BatchIdServ, TransSubmitter, ActionCode, ProfileId, MicrBankId, MicrDdaNum, MicrCheckNum, ArchFlag, ManualCcauthCode, ManualCcauthDate, FileId, ResponseCode, BillOrderNumber, ExternalAmount, ExternalCurrency, OpenItemId, Annotation.
   * @return UnappliedPaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public UnappliedPaymentObjectData update (@HeaderParam ("context")BSDMSessionContext context,UnappliedPaymentObjectData unappliedPaymentUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_UnappliedPaymentUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (unappliedPaymentUpdateIn != null) UnappliedPaymentObjectHelper.toMap (unappliedPaymentUpdateIn, record, "UnappliedPayment");
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
return UnappliedPaymentObjectHelper.fromMap (record, "UnappliedPayment");
}

  /**

   * Retrieve a UnappliedPayment based upon its key..

   * Convenience method using default BSDMSessionContext.

   * @param unappliedPaymentGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return UnappliedPaymentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public UnappliedPaymentObjectData get (UnappliedPaymentObjectKeyData unappliedPaymentGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, unappliedPaymentGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a UnappliedPayment based upon its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param unappliedPaymentGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return UnappliedPaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public UnappliedPaymentObjectData get (BSDMSessionContext context, UnappliedPaymentObjectKeyData unappliedPaymentGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(unappliedPaymentGetIn, defaultAction);
       
     cManager.checkConstraints(unappliedPaymentGetIn, constraintAction);
       return get (context, unappliedPaymentGetIn);
  }

  /**

   * Find UnappliedPayments that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param unappliedPaymentFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return UnappliedPaymentObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public UnappliedPaymentObjectDataList find (UnappliedPaymentObjectFilter unappliedPaymentFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, unappliedPaymentFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find UnappliedPayments that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param unappliedPaymentFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return UnappliedPaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public UnappliedPaymentObjectDataList find (BSDMSessionContext context, UnappliedPaymentObjectFilter unappliedPaymentFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(unappliedPaymentFindIn, defaultAction);
       
     cManager.checkConstraints(unappliedPaymentFindIn, constraintAction);
       return find (context, unappliedPaymentFindIn);
  }

  /**

   * Update an UnappliedPayment based upon its key..

   * Convenience method using default BSDMSessionContext.

   * @param unappliedPaymentUpdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BmfErrorText, OrigBillRefNo, OrigBillRefResets, CrNoteBillRefNo, CrNoteBillRefResets, BmfTransType, TransDate, PostDate, CurrencyCode, TransAmount, GlAmount, OrigTrackingId, OrigTrackingIdServ, TransSource, ChgDate, SourceType, SourceIdServ, SourceId, BatchId, BatchIdServ, TransSubmitter, ActionCode, ProfileId, MicrBankId, MicrDdaNum, MicrCheckNum, ArchFlag, ManualCcauthCode, ManualCcauthDate, FileId, ResponseCode, BillOrderNumber, ExternalAmount, ExternalCurrency, OpenItemId, Annotation.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return UnappliedPaymentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public UnappliedPaymentObjectData update (UnappliedPaymentObjectData unappliedPaymentUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, unappliedPaymentUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update an UnappliedPayment based upon its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param unappliedPaymentUpdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AccountInternalId, BmfErrorText, OrigBillRefNo, OrigBillRefResets, CrNoteBillRefNo, CrNoteBillRefResets, BmfTransType, TransDate, PostDate, CurrencyCode, TransAmount, GlAmount, OrigTrackingId, OrigTrackingIdServ, TransSource, ChgDate, SourceType, SourceIdServ, SourceId, BatchId, BatchIdServ, TransSubmitter, ActionCode, ProfileId, MicrBankId, MicrDdaNum, MicrCheckNum, ArchFlag, ManualCcauthCode, ManualCcauthDate, FileId, ResponseCode, BillOrderNumber, ExternalAmount, ExternalCurrency, OpenItemId, Annotation.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return UnappliedPaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public UnappliedPaymentObjectData update (BSDMSessionContext context, UnappliedPaymentObjectData unappliedPaymentUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(unappliedPaymentUpdateIn, defaultAction);
       
     cManager.checkConstraints(unappliedPaymentUpdateIn, constraintAction);
       return update (context, unappliedPaymentUpdateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public UnappliedPaymentBean ()
  {
    try
    {
      _UnappliedPaymentGetSpec = new BSDMInteractionSpec("UnappliedPaymentGet", ApiMappings.getCallName ("UnappliedPaymentGet"), Boolean.TRUE);

      _UnappliedPaymentFindSpec = new BSDMInteractionSpec("UnappliedPaymentFind", ApiMappings.getCallName ("UnappliedPaymentFind"), Boolean.TRUE);

      _UnappliedPaymentUpdateSpec = new BSDMInteractionSpec("UnappliedPaymentUpdate", ApiMappings.getCallName ("UnappliedPaymentUpdate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public UnappliedPaymentBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public UnappliedPaymentBean(BSDMSettings settings, BSDMConnectionManager cm)
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
