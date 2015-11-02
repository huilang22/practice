
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: DepositBean.java
 * Definition File: Customer/Deposit.xml
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
import com.csgsystems.bp.interfaces.DepositInterface;
import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="DepositSessionBean"
 * display-name="Deposit Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/DepositBean"
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

@Stateless(name="DepositBean", mappedName = "Deposit")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("Deposits")

public class DepositBean implements DepositInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _DepositGetSpec = null;
  /**
   * Retrieve a Deposit based upon its key..
   * Convenience method using default BSDMSessionContext.
   * @param depositGetIn Input Object Key.
   * @return DepositObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public DepositObjectData get (DepositObjectKeyData depositGetIn) throws BSDMResourceException
  {
    return get (null, depositGetIn);
  }
  /**
   * Retrieve a Deposit based upon its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param depositGetIn Input Object Key.
   * @return DepositObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public DepositObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam DepositObjectKeyData depositGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_DepositGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (depositGetIn != null) DepositObjectKeyHelper.toMap (depositGetIn, record, "Deposit");
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
return DepositObjectHelper.fromMap (record, "Deposit");
}

  private BSDMInteractionSpec _DepositFindSpec = null;
  /**
   * Find Deposits that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param depositFindIn Input Filter Object.
   * @return DepositObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public DepositObjectDataList find (DepositObjectFilter depositFindIn) throws BSDMResourceException
  {
    return find (null, depositFindIn);
  }
  /**
   * Find Deposits that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param depositFindIn Input Filter Object.
   * @return DepositObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public DepositObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,DepositObjectFilter depositFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_DepositFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (depositFindIn != null) DepositObjectHelper.toMap (depositFindIn, record, "Deposit");
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
return DepositObjectHelper.fromMapList (record, "DepositList");
}

  private BSDMInteractionSpec _DepositCreateSpec = null;
  /**
   * Create a new Deposit..
   * Convenience method using default BSDMSessionContext.
   * @param depositCreateIn Input  Object.  Read-Only fields: RefundType, ReasonCode, ChgWho, ChgDate.  Derived Fields: TrackingId, TrackingIdServ, ChgDate, ChgWho.
   * @return DepositObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public DepositObjectData create (DepositObjectData depositCreateIn) throws BSDMResourceException
  {
    return create (null, depositCreateIn);
  }
  /**
   * Create a new Deposit..
   * @param context The session context to use when connecting to the APITS server.
   * @param depositCreateIn Input  Object.  Read-Only fields: RefundType, ReasonCode, ChgWho, ChgDate.  Derived Fields: TrackingId, TrackingIdServ, ChgDate, ChgWho.
   * @return DepositObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public DepositObjectData create (@HeaderParam ("context")BSDMSessionContext context,DepositObjectData depositCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_DepositCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (depositCreateIn != null) DepositObjectHelper.toMap (depositCreateIn, record, "Deposit");
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
return DepositObjectHelper.fromMap (record, "Deposit");
}

  private BSDMInteractionSpec _DepositReturnSpec = null;
  /**
   * Return the Account's Deposit..
   * Returns a Deposit.  Also creates a refund payment if refund_type is IN (1,2,3)..
   * Convenience method using default BSDMSessionContext.
   * @param depositReturnIn Input  Object.  Read-Only fields: AccountInternalId, DepositType, DateReceived, DepositAmount, CurrencyCode, ChgWho, ChgDate.  Defaulted Fields: DateReturned.  Derived Fields: ChgDate, ChgWho.
   * @return DepositObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public DepositObjectData depositReturn (DepositObjectData depositReturnIn) throws BSDMResourceException
  {
    return depositReturn (null, depositReturnIn);
  }
  /**
   * Return the Account's Deposit..
   * Returns a Deposit.  Also creates a refund payment if refund_type is IN (1,2,3)..
   * @param context The session context to use when connecting to the APITS server.
   * @param depositReturnIn Input  Object.  Read-Only fields: AccountInternalId, DepositType, DateReceived, DepositAmount, CurrencyCode, ChgWho, ChgDate.  Defaulted Fields: DateReturned.  Derived Fields: ChgDate, ChgWho.
   * @return DepositObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("depositReturn")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public DepositObjectData depositReturn (@HeaderParam ("context")BSDMSessionContext context,DepositObjectData depositReturnIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_DepositReturnSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (depositReturnIn != null) DepositObjectHelper.toMap (depositReturnIn, record, "Deposit");
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
return DepositObjectHelper.fromMap (record, "Deposit");
}

  /**

   * Retrieve a Deposit based upon its key..

   * Convenience method using default BSDMSessionContext.

   * @param depositGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return DepositObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public DepositObjectData get (DepositObjectKeyData depositGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, depositGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a Deposit based upon its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param depositGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return DepositObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public DepositObjectData get (BSDMSessionContext context, DepositObjectKeyData depositGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(depositGetIn, defaultAction);
       
     cManager.checkConstraints(depositGetIn, constraintAction);
       return get (context, depositGetIn);
  }

  /**

   * Find Deposits that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param depositFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return DepositObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public DepositObjectDataList find (DepositObjectFilter depositFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, depositFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find Deposits that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param depositFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return DepositObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public DepositObjectDataList find (BSDMSessionContext context, DepositObjectFilter depositFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(depositFindIn, defaultAction);
       
     cManager.checkConstraints(depositFindIn, constraintAction);
       return find (context, depositFindIn);
  }

  /**

   * Create a new Deposit..

   * Convenience method using default BSDMSessionContext.

   * @param depositCreateIn Input  Object.  Read-Only fields: RefundType, ReasonCode, ChgWho, ChgDate.  Derived Fields: TrackingId, TrackingIdServ, ChgDate, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return DepositObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public DepositObjectData create (DepositObjectData depositCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, depositCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new Deposit..
   * @param context The session context to use when connecting to the APITS server.
   * @param depositCreateIn Input  Object.  Read-Only fields: RefundType, ReasonCode, ChgWho, ChgDate.  Derived Fields: TrackingId, TrackingIdServ, ChgDate, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return DepositObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public DepositObjectData create (BSDMSessionContext context, DepositObjectData depositCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(depositCreateIn, defaultAction);
       
     cManager.checkConstraints(depositCreateIn, constraintAction);
       return create (context, depositCreateIn);
  }

  /**

   * Return the Account's Deposit..

   * Returns a Deposit.  Also creates a refund payment if refund_type is IN (1,2,3)..

   * Convenience method using default BSDMSessionContext.

   * @param depositReturnIn Input  Object.  Read-Only fields: AccountInternalId, DepositType, DateReceived, DepositAmount, CurrencyCode, ChgWho, ChgDate.  Defaulted Fields: DateReturned.  Derived Fields: ChgDate, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return DepositObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public DepositObjectData depositReturn (DepositObjectData depositReturnIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return depositReturn (null, depositReturnIn, defaultAction, constraintAction);
  }
  /** 
   * Return the Account's Deposit..
   * Returns a Deposit.  Also creates a refund payment if refund_type is IN (1,2,3)..
   * @param context The session context to use when connecting to the APITS server.
   * @param depositReturnIn Input  Object.  Read-Only fields: AccountInternalId, DepositType, DateReceived, DepositAmount, CurrencyCode, ChgWho, ChgDate.  Defaulted Fields: DateReturned.  Derived Fields: ChgDate, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return DepositObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public DepositObjectData depositReturn (BSDMSessionContext context, DepositObjectData depositReturnIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(depositReturnIn, defaultAction);
       
     cManager.checkConstraints(depositReturnIn, constraintAction);
       return depositReturn (context, depositReturnIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public DepositBean ()
  {
    try
    {
      _DepositGetSpec = new BSDMInteractionSpec("DepositGet", ApiMappings.getCallName ("DepositGet"), Boolean.TRUE);

      _DepositFindSpec = new BSDMInteractionSpec("DepositFind", ApiMappings.getCallName ("DepositFind"), Boolean.TRUE);

      _DepositCreateSpec = new BSDMInteractionSpec("DepositCreate", ApiMappings.getCallName ("DepositCreate"), Boolean.TRUE);

      _DepositReturnSpec = new BSDMInteractionSpec("DepositReturn", ApiMappings.getCallName ("DepositReturn"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public DepositBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public DepositBean(BSDMSettings settings, BSDMConnectionManager cm)
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
