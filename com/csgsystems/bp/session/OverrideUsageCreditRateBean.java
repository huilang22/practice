
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: OverrideUsageCreditRateBean.java
 * Definition File: Customer/OverrideUsageCreditRate.xml
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
import com.csgsystems.bp.interfaces.OverrideUsageCreditRateInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="OverrideUsageCreditRateSessionBean"
 * display-name="OverrideUsageCreditRate Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/OverrideUsageCreditRateBean"
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

@Stateless(name="OverrideUsageCreditRateBean", mappedName = "OverrideUsageCreditRate")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("OverrideUsageCreditRates")

public class OverrideUsageCreditRateBean implements OverrideUsageCreditRateInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _OverrideUsageCreditRateGetSpec = null;
  /**
   * Get a unique OverrideUsageCreditRate..
   * Convenience method using default BSDMSessionContext.
   * @param fRUCOGetIn Input Object Key.
   * @return RUCOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RUCOverrideObjectData get (RUCBaseOverrideObjectKeyData fRUCOGetIn) throws BSDMResourceException
  {
    return get (null, fRUCOGetIn);
  }
  /**
   * Get a unique OverrideUsageCreditRate..
   * @param context The session context to use when connecting to the APITS server.
   * @param fRUCOGetIn Input Object Key.
   * @return RUCOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public RUCOverrideObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam RUCBaseOverrideObjectKeyData fRUCOGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OverrideUsageCreditRateGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (fRUCOGetIn != null) RUCBaseOverrideObjectKeyHelper.toMap (fRUCOGetIn, record, "OverrideUsageCreditRate");
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
return RUCOverrideObjectHelper.fromMap (record, "OverrideUsageCreditRate");
}

  private BSDMInteractionSpec _OverrideUsageCreditRateFindSpec = null;
  /**
   * Find OverrideUsageCreditRate's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param iRUCOFindIn Input Filter Object.
   * @return RUCOverrideObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RUCOverrideObjectDataList find (RUCOverrideObjectFilter iRUCOFindIn) throws BSDMResourceException
  {
    return find (null, iRUCOFindIn);
  }
  /**
   * Find OverrideUsageCreditRate's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param iRUCOFindIn Input Filter Object.
   * @return RUCOverrideObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RUCOverrideObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,RUCOverrideObjectFilter iRUCOFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OverrideUsageCreditRateFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (iRUCOFindIn != null) RUCOverrideObjectHelper.toMap (iRUCOFindIn, record, "OverrideUsageCreditRate");
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
return RUCOverrideObjectHelper.fromMapList (record, "OverrideUsageCreditRateList");
}

  private BSDMInteractionSpec _OverrideUsageCreditRateUpdateSpec = null;
  /**
   * Update the non-key fields of an OverrideUsageCreditRate row..
   * Convenience method using default BSDMSessionContext.
   * @param iRUCOUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, UnitCrQuantum.  Derived Fields: ChgDt, ChgWho.
   * @return RUCOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RUCOverrideObjectData update (RUCOverrideObjectData iRUCOUpdateIn) throws BSDMResourceException
  {
    return update (null, iRUCOUpdateIn);
  }
  /**
   * Update the non-key fields of an OverrideUsageCreditRate row..
   * @param context The session context to use when connecting to the APITS server.
   * @param iRUCOUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, UnitCrQuantum.  Derived Fields: ChgDt, ChgWho.
   * @return RUCOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RUCOverrideObjectData update (@HeaderParam ("context")BSDMSessionContext context,RUCOverrideObjectData iRUCOUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OverrideUsageCreditRateUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (iRUCOUpdateIn != null) RUCOverrideObjectHelper.toMap (iRUCOUpdateIn, record, "OverrideUsageCreditRate");
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
return RUCOverrideObjectHelper.fromMap (record, "OverrideUsageCreditRate");
}

  private BSDMInteractionSpec _OverrideUsageCreditRateCreateSpec = null;
  /**
   * Create a new OverrideUsageCreditRate..
   * Convenience method using default BSDMSessionContext.
   * @param iRUCOCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, UnitCrQuantum.  Defaulted Fields: UnitsFree, CurrencyCode, AmountFree, CreateDt.  Derived Fields: OverrideTrackingId, OverrideTrackingIdServ, ChgDt, ChgWho.
   * @return RUCOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RUCOverrideObjectData create (RUCOverrideObjectData iRUCOCreateIn) throws BSDMResourceException
  {
    return create (null, iRUCOCreateIn);
  }
  /**
   * Create a new OverrideUsageCreditRate..
   * @param context The session context to use when connecting to the APITS server.
   * @param iRUCOCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, UnitCrQuantum.  Defaulted Fields: UnitsFree, CurrencyCode, AmountFree, CreateDt.  Derived Fields: OverrideTrackingId, OverrideTrackingIdServ, ChgDt, ChgWho.
   * @return RUCOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RUCOverrideObjectData create (@HeaderParam ("context")BSDMSessionContext context,RUCOverrideObjectData iRUCOCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OverrideUsageCreditRateCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (iRUCOCreateIn != null) RUCOverrideObjectHelper.toMap (iRUCOCreateIn, record, "OverrideUsageCreditRate");
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
return RUCOverrideObjectHelper.fromMap (record, "OverrideUsageCreditRate");
}

  /**

   * Get a unique OverrideUsageCreditRate..

   * Convenience method using default BSDMSessionContext.

   * @param fRUCOGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RUCOverrideObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RUCOverrideObjectData get (RUCBaseOverrideObjectKeyData fRUCOGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, fRUCOGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique OverrideUsageCreditRate..
   * @param context The session context to use when connecting to the APITS server.
   * @param fRUCOGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RUCOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RUCOverrideObjectData get (BSDMSessionContext context, RUCBaseOverrideObjectKeyData fRUCOGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(fRUCOGetIn, defaultAction);
       
     cManager.checkConstraints(fRUCOGetIn, constraintAction);
       return get (context, fRUCOGetIn);
  }

  /**

   * Find OverrideUsageCreditRate's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param iRUCOFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RUCOverrideObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RUCOverrideObjectDataList find (RUCOverrideObjectFilter iRUCOFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, iRUCOFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find OverrideUsageCreditRate's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param iRUCOFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RUCOverrideObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RUCOverrideObjectDataList find (BSDMSessionContext context, RUCOverrideObjectFilter iRUCOFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(iRUCOFindIn, defaultAction);
       
     cManager.checkConstraints(iRUCOFindIn, constraintAction);
       return find (context, iRUCOFindIn);
  }

  /**

   * Update the non-key fields of an OverrideUsageCreditRate row..

   * Convenience method using default BSDMSessionContext.

   * @param iRUCOUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, UnitCrQuantum.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RUCOverrideObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RUCOverrideObjectData update (RUCOverrideObjectData iRUCOUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, iRUCOUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of an OverrideUsageCreditRate row..
   * @param context The session context to use when connecting to the APITS server.
   * @param iRUCOUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, UnitCrQuantum.  Derived Fields: ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RUCOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RUCOverrideObjectData update (BSDMSessionContext context, RUCOverrideObjectData iRUCOUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(iRUCOUpdateIn, defaultAction);
       
     cManager.checkConstraints(iRUCOUpdateIn, constraintAction);
       return update (context, iRUCOUpdateIn);
  }

  /**

   * Create a new OverrideUsageCreditRate..

   * Convenience method using default BSDMSessionContext.

   * @param iRUCOCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, UnitCrQuantum.  Defaulted Fields: UnitsFree, CurrencyCode, AmountFree, CreateDt.  Derived Fields: OverrideTrackingId, OverrideTrackingIdServ, ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RUCOverrideObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RUCOverrideObjectData create (RUCOverrideObjectData iRUCOCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, iRUCOCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new OverrideUsageCreditRate..
   * @param context The session context to use when connecting to the APITS server.
   * @param iRUCOCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, UnitCrQuantum.  Defaulted Fields: UnitsFree, CurrencyCode, AmountFree, CreateDt.  Derived Fields: OverrideTrackingId, OverrideTrackingIdServ, ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RUCOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RUCOverrideObjectData create (BSDMSessionContext context, RUCOverrideObjectData iRUCOCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(iRUCOCreateIn, defaultAction);
       
     cManager.checkConstraints(iRUCOCreateIn, constraintAction);
       return create (context, iRUCOCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public OverrideUsageCreditRateBean ()
  {
    try
    {
      _OverrideUsageCreditRateGetSpec = new BSDMInteractionSpec("OverrideUsageCreditRateGet", ApiMappings.getCallName ("OverrideUsageCreditRateGet"), Boolean.TRUE);

      _OverrideUsageCreditRateFindSpec = new BSDMInteractionSpec("OverrideUsageCreditRateFind", ApiMappings.getCallName ("OverrideUsageCreditRateFind"), Boolean.TRUE);

      _OverrideUsageCreditRateUpdateSpec = new BSDMInteractionSpec("OverrideUsageCreditRateUpdate", ApiMappings.getCallName ("OverrideUsageCreditRateUpdate"), Boolean.TRUE);

      _OverrideUsageCreditRateCreateSpec = new BSDMInteractionSpec("OverrideUsageCreditRateCreate", ApiMappings.getCallName ("OverrideUsageCreditRateCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public OverrideUsageCreditRateBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public OverrideUsageCreditRateBean(BSDMSettings settings, BSDMConnectionManager cm)
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
