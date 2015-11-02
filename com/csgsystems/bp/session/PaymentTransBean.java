
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: PaymentTransBean.java
 * Definition File: Customer/PaymentTrans.xml
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
import com.csgsystems.bp.interfaces.PaymentTransInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="PaymentTransSessionBean"
 * display-name="PaymentTrans Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/PaymentTransBean"
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

@Stateless(name="PaymentTransBean", mappedName = "PaymentTrans")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("PaymentTrans")

public class PaymentTransBean implements PaymentTransInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _PaymentTransGetSpec = null;
  /**
   * Get the Payment Transaction row that corresponds to the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param PayTransGetIn Input Object Key.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentTransObjectData get (PaymentTransObjectKeyData PayTransGetIn) throws BSDMResourceException
  {
    return get (null, PayTransGetIn);
  }
  /**
   * Get the Payment Transaction row that corresponds to the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param PayTransGetIn Input Object Key.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public PaymentTransObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam PaymentTransObjectKeyData PayTransGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentTransGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PayTransGetIn != null) PaymentTransObjectKeyHelper.toMap (PayTransGetIn, record, "PaymentTrans");
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
return PaymentTransObjectHelper.fromMap (record, "PaymentTrans");
}

  private BSDMInteractionSpec _PaymentTransFindSpec = null;
  /**
   * Find PaymentTransactions that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PayTransFindIn Input Filter Object.
   * @return PaymentTransObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentTransObjectDataList find (PaymentTransObjectFilter PayTransFindIn) throws BSDMResourceException
  {
    return find (null, PayTransFindIn);
  }
  /**
   * Find PaymentTransactions that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PayTransFindIn Input Filter Object.
   * @return PaymentTransObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentTransObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,PaymentTransObjectFilter PayTransFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentTransFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PayTransFindIn != null) PaymentTransObjectHelper.toMap (PayTransFindIn, record, "PaymentTrans");
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
return PaymentTransObjectHelper.fromMapList (record, "PaymentTransList");
}

  private BSDMInteractionSpec _PaymentTransUpdateSpec = null;
  /**
   * Update a real-time Payment Transaction.
   * Convenience method using default BSDMSessionContext.
   * @param PayTransUpdateIn Input  Object.  Read-Only fields: ChgDate, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, TransType, BmfTransType, FileId, ClearingHouseId, ProviderId, ProfileId, CcauthCode, CcauthDate, PmtReqSentCounter, OpenItemId, OrigTrackingId, OrigTrackingIdServ, NoBill, RequestType, RequestedService, PayMethod, IsRealtime, TransDate, Annotation, OneoffCardnum.  Derived Fields: ChgDate.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentTransObjectData update (PaymentTransObjectData PayTransUpdateIn) throws BSDMResourceException
  {
    return update (null, PayTransUpdateIn);
  }
  /**
   * Update a real-time Payment Transaction.
   * @param context The session context to use when connecting to the APITS server.
   * @param PayTransUpdateIn Input  Object.  Read-Only fields: ChgDate, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, TransType, BmfTransType, FileId, ClearingHouseId, ProviderId, ProfileId, CcauthCode, CcauthDate, PmtReqSentCounter, OpenItemId, OrigTrackingId, OrigTrackingIdServ, NoBill, RequestType, RequestedService, PayMethod, IsRealtime, TransDate, Annotation, OneoffCardnum.  Derived Fields: ChgDate.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentTransObjectData update (@HeaderParam ("context")BSDMSessionContext context,PaymentTransObjectData PayTransUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentTransUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PayTransUpdateIn != null) PaymentTransObjectHelper.toMap (PayTransUpdateIn, record, "PaymentTrans");
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
return PaymentTransObjectHelper.fromMap (record, "PaymentTrans");
}

  /**

   * Get the Payment Transaction row that corresponds to the supplied key..

   * Convenience method using default BSDMSessionContext.

   * @param PayTransGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentTransObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentTransObjectData get (PaymentTransObjectKeyData PayTransGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, PayTransGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get the Payment Transaction row that corresponds to the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param PayTransGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentTransObjectData get (BSDMSessionContext context, PaymentTransObjectKeyData PayTransGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PayTransGetIn, defaultAction);
       
     cManager.checkConstraints(PayTransGetIn, constraintAction);
       return get (context, PayTransGetIn);
  }

  /**

   * Find PaymentTransactions that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param PayTransFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentTransObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentTransObjectDataList find (PaymentTransObjectFilter PayTransFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, PayTransFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find PaymentTransactions that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PayTransFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentTransObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentTransObjectDataList find (BSDMSessionContext context, PaymentTransObjectFilter PayTransFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PayTransFindIn, defaultAction);
       
     cManager.checkConstraints(PayTransFindIn, constraintAction);
       return find (context, PayTransFindIn);
  }

  /**

   * Update a real-time Payment Transaction.

   * Convenience method using default BSDMSessionContext.

   * @param PayTransUpdateIn Input  Object.  Read-Only fields: ChgDate, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, TransType, BmfTransType, FileId, ClearingHouseId, ProviderId, ProfileId, CcauthCode, CcauthDate, PmtReqSentCounter, OpenItemId, OrigTrackingId, OrigTrackingIdServ, NoBill, RequestType, RequestedService, PayMethod, IsRealtime, TransDate, Annotation, OneoffCardnum.  Derived Fields: ChgDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentTransObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentTransObjectData update (PaymentTransObjectData PayTransUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, PayTransUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update a real-time Payment Transaction.
   * @param context The session context to use when connecting to the APITS server.
   * @param PayTransUpdateIn Input  Object.  Read-Only fields: ChgDate, AccountInternalId, BillRefNo, BillRefResets, PaymentDueDate, StatementDate, Amount, CurrencyCode, TransType, BmfTransType, FileId, ClearingHouseId, ProviderId, ProfileId, CcauthCode, CcauthDate, PmtReqSentCounter, OpenItemId, OrigTrackingId, OrigTrackingIdServ, NoBill, RequestType, RequestedService, PayMethod, IsRealtime, TransDate, Annotation, OneoffCardnum.  Derived Fields: ChgDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentTransObjectData update (BSDMSessionContext context, PaymentTransObjectData PayTransUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PayTransUpdateIn, defaultAction);
       
     cManager.checkConstraints(PayTransUpdateIn, constraintAction);
       return update (context, PayTransUpdateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public PaymentTransBean ()
  {
    try
    {
      _PaymentTransGetSpec = new BSDMInteractionSpec("PaymentTransGet", ApiMappings.getCallName ("PaymentTransGet"), Boolean.TRUE);

      _PaymentTransFindSpec = new BSDMInteractionSpec("PaymentTransFind", ApiMappings.getCallName ("PaymentTransFind"), Boolean.TRUE);

      _PaymentTransUpdateSpec = new BSDMInteractionSpec("PaymentTransUpdate", ApiMappings.getCallName ("PaymentTransUpdate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public PaymentTransBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public PaymentTransBean(BSDMSettings settings, BSDMConnectionManager cm)
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
