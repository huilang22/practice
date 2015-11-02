
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: HistoricalContributionBean.java
 * Definition File: Customer/HistoricalContribution.xml
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
import com.csgsystems.bp.interfaces.HistoricalContributionInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="HistoricalContributionSessionBean"
 * display-name="HistoricalContribution Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/HistoricalContributionBean"
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

@Stateless(name="HistoricalContributionBean", mappedName = "HistoricalContribution")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("HistoricalContributions")

public class HistoricalContributionBean implements HistoricalContributionInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _HistoricalContributionGetSpec = null;
  /**
   * Get an HistoricalContribution row..
   * Convenience method using default BSDMSessionContext.
   * @param HCgetIn Input Object Key.
   * @return HistoricalContributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HistoricalContributionObjectData get (HistoricalContributionObjectKeyData HCgetIn) throws BSDMResourceException
  {
    return get (null, HCgetIn);
  }
  /**
   * Get an HistoricalContribution row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCgetIn Input Object Key.
   * @return HistoricalContributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public HistoricalContributionObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam HistoricalContributionObjectKeyData HCgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HistoricalContributionGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HCgetIn != null) HistoricalContributionObjectKeyHelper.toMap (HCgetIn, record, "HistoricalContribution");
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
return HistoricalContributionObjectHelper.fromMap (record, "HistoricalContribution");
}

  private BSDMInteractionSpec _HistoricalContributionFindSpec = null;
  /**
   * Find HistoricalContribution's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HCfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.
   * @return HistoricalContributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HistoricalContributionObjectDataList find (HistoricalContributionObjectFilter HCfindIn) throws BSDMResourceException
  {
    return find (null, HCfindIn);
  }
  /**
   * Find HistoricalContribution's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.
   * @return HistoricalContributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HistoricalContributionObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,HistoricalContributionObjectFilter HCfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HistoricalContributionFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HCfindIn != null) HistoricalContributionObjectHelper.toMap (HCfindIn, record, "HistoricalContribution");
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
return HistoricalContributionObjectHelper.fromMapList (record, "HistoricalContributionList");
}

  private BSDMInteractionSpec _HistoricalContributionCreateSpec = null;
  /**
   * Create a new HistoricalContribution..
   * Convenience method using default BSDMSessionContext.
   * @param HCcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgWho, ChgDt, AccumulationTrackingId, AccumulationTrackingIdServ.  Defaulted Fields: CurrencyCode.  Derived Fields: AccumulationTrackingId, AccumulationTrackingIdServ, AccountExternalIdType, ChgDt, ChgWho.
   * @return HistoricalContributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HistoricalContributionObjectData create (HistoricalContributionObjectData HCcreateIn) throws BSDMResourceException
  {
    return create (null, HCcreateIn);
  }
  /**
   * Create a new HistoricalContribution..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgWho, ChgDt, AccumulationTrackingId, AccumulationTrackingIdServ.  Defaulted Fields: CurrencyCode.  Derived Fields: AccumulationTrackingId, AccumulationTrackingIdServ, AccountExternalIdType, ChgDt, ChgWho.
   * @return HistoricalContributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HistoricalContributionObjectData create (@HeaderParam ("context")BSDMSessionContext context,HistoricalContributionObjectData HCcreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HistoricalContributionCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HCcreateIn != null) HistoricalContributionObjectHelper.toMap (HCcreateIn, record, "HistoricalContribution");
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
return HistoricalContributionObjectHelper.fromMap (record, "HistoricalContribution");
}

  private BSDMInteractionSpec _HistoricalContributionUpdateSpec = null;
  /**
   * Update non-key fields of an HistoricalContribution row..
   * Convenience method using default BSDMSessionContext.
   * @param HCupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgWho, ChgDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.
   * @return HistoricalContributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HistoricalContributionObjectData update (HistoricalContributionObjectData HCupdateIn) throws BSDMResourceException
  {
    return update (null, HCupdateIn);
  }
  /**
   * Update non-key fields of an HistoricalContribution row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgWho, ChgDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.
   * @return HistoricalContributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HistoricalContributionObjectData update (@HeaderParam ("context")BSDMSessionContext context,HistoricalContributionObjectData HCupdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HistoricalContributionUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HCupdateIn != null) HistoricalContributionObjectHelper.toMap (HCupdateIn, record, "HistoricalContribution");
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
return HistoricalContributionObjectHelper.fromMap (record, "HistoricalContribution");
}

  /**

   * Get an HistoricalContribution row..

   * Convenience method using default BSDMSessionContext.

   * @param HCgetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HistoricalContributionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HistoricalContributionObjectData get (HistoricalContributionObjectKeyData HCgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, HCgetIn, defaultAction, constraintAction);
  }
  /** 
   * Get an HistoricalContribution row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCgetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HistoricalContributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HistoricalContributionObjectData get (BSDMSessionContext context, HistoricalContributionObjectKeyData HCgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HCgetIn, defaultAction);
       
     cManager.checkConstraints(HCgetIn, constraintAction);
       return get (context, HCgetIn);
  }

  /**

   * Find HistoricalContribution's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param HCfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HistoricalContributionObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HistoricalContributionObjectDataList find (HistoricalContributionObjectFilter HCfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, HCfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find HistoricalContribution's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HistoricalContributionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HistoricalContributionObjectDataList find (BSDMSessionContext context, HistoricalContributionObjectFilter HCfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HCfindIn, defaultAction);
       
     cManager.checkConstraints(HCfindIn, constraintAction);
       return find (context, HCfindIn);
  }

  /**

   * Create a new HistoricalContribution..

   * Convenience method using default BSDMSessionContext.

   * @param HCcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgWho, ChgDt, AccumulationTrackingId, AccumulationTrackingIdServ.  Defaulted Fields: CurrencyCode.  Derived Fields: AccumulationTrackingId, AccumulationTrackingIdServ, AccountExternalIdType, ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HistoricalContributionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HistoricalContributionObjectData create (HistoricalContributionObjectData HCcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, HCcreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new HistoricalContribution..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgWho, ChgDt, AccumulationTrackingId, AccumulationTrackingIdServ.  Defaulted Fields: CurrencyCode.  Derived Fields: AccumulationTrackingId, AccumulationTrackingIdServ, AccountExternalIdType, ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HistoricalContributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HistoricalContributionObjectData create (BSDMSessionContext context, HistoricalContributionObjectData HCcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HCcreateIn, defaultAction);
       
     cManager.checkConstraints(HCcreateIn, constraintAction);
       return create (context, HCcreateIn);
  }

  /**

   * Update non-key fields of an HistoricalContribution row..

   * Convenience method using default BSDMSessionContext.

   * @param HCupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgWho, ChgDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HistoricalContributionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HistoricalContributionObjectData update (HistoricalContributionObjectData HCupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, HCupdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of an HistoricalContribution row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HCupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgWho, ChgDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HistoricalContributionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HistoricalContributionObjectData update (BSDMSessionContext context, HistoricalContributionObjectData HCupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HCupdateIn, defaultAction);
       
     cManager.checkConstraints(HCupdateIn, constraintAction);
       return update (context, HCupdateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public HistoricalContributionBean ()
  {
    try
    {
      _HistoricalContributionGetSpec = new BSDMInteractionSpec("HistoricalContributionGet", ApiMappings.getCallName ("HistoricalContributionGet"), Boolean.TRUE);

      _HistoricalContributionFindSpec = new BSDMInteractionSpec("HistoricalContributionFind", ApiMappings.getCallName ("HistoricalContributionFind"), Boolean.TRUE);

      _HistoricalContributionCreateSpec = new BSDMInteractionSpec("HistoricalContributionCreate", ApiMappings.getCallName ("HistoricalContributionCreate"), Boolean.TRUE);

      _HistoricalContributionUpdateSpec = new BSDMInteractionSpec("HistoricalContributionUpdate", ApiMappings.getCallName ("HistoricalContributionUpdate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public HistoricalContributionBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public HistoricalContributionBean(BSDMSettings settings, BSDMConnectionManager cm)
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
