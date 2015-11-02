
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: PaymentMerchantIdAssignBean.java
 * Definition File: Admin/PaymentMerchantIdAssign.xml
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
import com.csgsystems.bp.interfaces.PaymentMerchantIdAssignInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="PaymentMerchantIdAssignSessionBean"
 * display-name="PaymentMerchantIdAssign Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/PaymentMerchantIdAssignBean"
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

@Stateless(name="PaymentMerchantIdAssignBean", mappedName = "PaymentMerchantIdAssign")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("PaymentMerchantIdAssigns")

public class PaymentMerchantIdAssignBean implements PaymentMerchantIdAssignInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _PaymentMerchantIdAssignGetSpec = null;
  /**
   * Get a PaymentMerchantIdAssign..
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdAssigngetIn Input Object Key.
   * @return PaymentMerchantIdAssignObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentMerchantIdAssignObjectData get (PaymentMerchantIdAssignObjectKeyData PaymentMerchantIdAssigngetIn) throws BSDMResourceException
  {
    return get (null, PaymentMerchantIdAssigngetIn);
  }
  /**
   * Get a PaymentMerchantIdAssign..
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdAssigngetIn Input Object Key.
   * @return PaymentMerchantIdAssignObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public PaymentMerchantIdAssignObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam PaymentMerchantIdAssignObjectKeyData PaymentMerchantIdAssigngetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentMerchantIdAssignGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PaymentMerchantIdAssigngetIn != null) PaymentMerchantIdAssignObjectKeyHelper.toMap (PaymentMerchantIdAssigngetIn, record, "PaymentMerchantIdAssign");
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
return PaymentMerchantIdAssignObjectHelper.fromMap (record, "PaymentMerchantIdAssign");
}

  private BSDMInteractionSpec _PaymentMerchantIdAssignFindSpec = null;
  /**
   * Find PaymentMerchantIdAssigns..
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdAssignfindIn Input Filter Object.
   * @return PaymentMerchantIdAssignObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentMerchantIdAssignObjectDataList find (PaymentMerchantIdAssignObjectFilter PaymentMerchantIdAssignfindIn) throws BSDMResourceException
  {
    return find (null, PaymentMerchantIdAssignfindIn);
  }
  /**
   * Find PaymentMerchantIdAssigns..
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdAssignfindIn Input Filter Object.
   * @return PaymentMerchantIdAssignObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentMerchantIdAssignObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,PaymentMerchantIdAssignObjectFilter PaymentMerchantIdAssignfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentMerchantIdAssignFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PaymentMerchantIdAssignfindIn != null) PaymentMerchantIdAssignObjectHelper.toMap (PaymentMerchantIdAssignfindIn, record, "PaymentMerchantIdAssign");
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
return PaymentMerchantIdAssignObjectHelper.fromMapList (record, "PaymentMerchantIdAssignList");
}

  private BSDMInteractionSpec _PaymentMerchantIdAssignUpdateSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdAssignUpdateIn Input  Object.
   * @return PaymentMerchantIdAssignObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentMerchantIdAssignObjectData update (PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignUpdateIn) throws BSDMResourceException
  {
    return update (null, PaymentMerchantIdAssignUpdateIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdAssignUpdateIn Input  Object.
   * @return PaymentMerchantIdAssignObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentMerchantIdAssignObjectData update (@HeaderParam ("context")BSDMSessionContext context,PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentMerchantIdAssignUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PaymentMerchantIdAssignUpdateIn != null) PaymentMerchantIdAssignObjectHelper.toMap (PaymentMerchantIdAssignUpdateIn, record, "PaymentMerchantIdAssign");
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
return PaymentMerchantIdAssignObjectHelper.fromMap (record, "PaymentMerchantIdAssign");
}

  private BSDMInteractionSpec _PaymentMerchantIdAssignCreateSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param PaymentMerchantIdAssignCreateIn Input  Object.
   * @return PaymentMerchantIdAssignObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentMerchantIdAssignObjectData create (PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignCreateIn) throws BSDMResourceException
  {
    return create (null, PaymentMerchantIdAssignCreateIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdAssignCreateIn Input  Object.
   * @return PaymentMerchantIdAssignObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentMerchantIdAssignObjectData create (@HeaderParam ("context")BSDMSessionContext context,PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentMerchantIdAssignCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PaymentMerchantIdAssignCreateIn != null) PaymentMerchantIdAssignObjectHelper.toMap (PaymentMerchantIdAssignCreateIn, record, "PaymentMerchantIdAssign");
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
return PaymentMerchantIdAssignObjectHelper.fromMap (record, "PaymentMerchantIdAssign");
}

  /**

   * Get a PaymentMerchantIdAssign..

   * Convenience method using default BSDMSessionContext.

   * @param PaymentMerchantIdAssigngetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentMerchantIdAssignObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentMerchantIdAssignObjectData get (PaymentMerchantIdAssignObjectKeyData PaymentMerchantIdAssigngetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, PaymentMerchantIdAssigngetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a PaymentMerchantIdAssign..
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdAssigngetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentMerchantIdAssignObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentMerchantIdAssignObjectData get (BSDMSessionContext context, PaymentMerchantIdAssignObjectKeyData PaymentMerchantIdAssigngetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PaymentMerchantIdAssigngetIn, defaultAction);
       
     cManager.checkConstraints(PaymentMerchantIdAssigngetIn, constraintAction);
       return get (context, PaymentMerchantIdAssigngetIn);
  }

  /**

   * Find PaymentMerchantIdAssigns..

   * Convenience method using default BSDMSessionContext.

   * @param PaymentMerchantIdAssignfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentMerchantIdAssignObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentMerchantIdAssignObjectDataList find (PaymentMerchantIdAssignObjectFilter PaymentMerchantIdAssignfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, PaymentMerchantIdAssignfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find PaymentMerchantIdAssigns..
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdAssignfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentMerchantIdAssignObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentMerchantIdAssignObjectDataList find (BSDMSessionContext context, PaymentMerchantIdAssignObjectFilter PaymentMerchantIdAssignfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PaymentMerchantIdAssignfindIn, defaultAction);
       
     cManager.checkConstraints(PaymentMerchantIdAssignfindIn, constraintAction);
       return find (context, PaymentMerchantIdAssignfindIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param PaymentMerchantIdAssignUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentMerchantIdAssignObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentMerchantIdAssignObjectData update (PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, PaymentMerchantIdAssignUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdAssignUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentMerchantIdAssignObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentMerchantIdAssignObjectData update (BSDMSessionContext context, PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PaymentMerchantIdAssignUpdateIn, defaultAction);
       
     cManager.checkConstraints(PaymentMerchantIdAssignUpdateIn, constraintAction);
       return update (context, PaymentMerchantIdAssignUpdateIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param PaymentMerchantIdAssignCreateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentMerchantIdAssignObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentMerchantIdAssignObjectData create (PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, PaymentMerchantIdAssignCreateIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param PaymentMerchantIdAssignCreateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentMerchantIdAssignObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentMerchantIdAssignObjectData create (BSDMSessionContext context, PaymentMerchantIdAssignObjectData PaymentMerchantIdAssignCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PaymentMerchantIdAssignCreateIn, defaultAction);
       
     cManager.checkConstraints(PaymentMerchantIdAssignCreateIn, constraintAction);
       return create (context, PaymentMerchantIdAssignCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public PaymentMerchantIdAssignBean ()
  {
    try
    {
      _PaymentMerchantIdAssignGetSpec = new BSDMInteractionSpec("PaymentMerchantIdAssignGet", ApiMappings.getCallName ("PaymentMerchantIdAssignGet"), Boolean.TRUE);

      _PaymentMerchantIdAssignFindSpec = new BSDMInteractionSpec("PaymentMerchantIdAssignFind", ApiMappings.getCallName ("PaymentMerchantIdAssignFind"), Boolean.TRUE);

      _PaymentMerchantIdAssignUpdateSpec = new BSDMInteractionSpec("PaymentMerchantIdAssignUpdate", ApiMappings.getCallName ("PaymentMerchantIdAssignUpdate"), Boolean.TRUE);

      _PaymentMerchantIdAssignCreateSpec = new BSDMInteractionSpec("PaymentMerchantIdAssignCreate", ApiMappings.getCallName ("PaymentMerchantIdAssignCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public PaymentMerchantIdAssignBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public PaymentMerchantIdAssignBean(BSDMSettings settings, BSDMConnectionManager cm)
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
