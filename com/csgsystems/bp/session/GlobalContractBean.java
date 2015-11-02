
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: GlobalContractBean.java
 * Definition File: Customer/GlobalContract.xml
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
import com.csgsystems.bp.interfaces.GlobalContractInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="GlobalContractSessionBean"
 * display-name="GlobalContract Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/GlobalContractBean"
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

@Stateless(name="GlobalContractBean", mappedName = "GlobalContract")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("GlobalContracts")

public class GlobalContractBean implements GlobalContractInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _GlobalContractCreateSpec = null;
  /**
   * Create a new GlobalContract..
   * Convenience method using default BSDMSessionContext.
   * @param GlobalContractCreateIn Input  Object.  Read-Only fields: ViewEffectiveDt, StartByDt.  Defaulted Fields: CreateDt, ArchFlag, CommitmentAmount, TotalSavingsAmount, TotalElementAmount, ViewStatus, ViewCreatedDt, IntendedViewEffectiveDt, StartDt, GracePeriod, TrackTotalAmounts, DistributePayback, ProrateContractStrtOverride, ProrateContractEndOverride, ProrateInterimBillOverride, ProratePeriodChangeOverride, ProrateAccountStartOverride, ProrateAccountEndOverride, ProrateTgtThresholdOverride, ProrateTgtRebatesOverride, DurationOverride, NoticeOverride, IsPartOfComponent.  Derived Fields: ViewId, ViewEffectiveDt.
   * @return GlobalContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GlobalContractObjectData create (GlobalContractObjectData GlobalContractCreateIn) throws BSDMResourceException
  {
    return create (null, GlobalContractCreateIn);
  }
  /**
   * Create a new GlobalContract..
   * @param context The session context to use when connecting to the APITS server.
   * @param GlobalContractCreateIn Input  Object.  Read-Only fields: ViewEffectiveDt, StartByDt.  Defaulted Fields: CreateDt, ArchFlag, CommitmentAmount, TotalSavingsAmount, TotalElementAmount, ViewStatus, ViewCreatedDt, IntendedViewEffectiveDt, StartDt, GracePeriod, TrackTotalAmounts, DistributePayback, ProrateContractStrtOverride, ProrateContractEndOverride, ProrateInterimBillOverride, ProratePeriodChangeOverride, ProrateAccountStartOverride, ProrateAccountEndOverride, ProrateTgtThresholdOverride, ProrateTgtRebatesOverride, DurationOverride, NoticeOverride, IsPartOfComponent.  Derived Fields: ViewId, ViewEffectiveDt.
   * @return GlobalContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GlobalContractObjectData create (@HeaderParam ("context")BSDMSessionContext context,GlobalContractObjectData GlobalContractCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GlobalContractCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GlobalContractCreateIn != null) GlobalContractObjectHelper.toMap (GlobalContractCreateIn, record, "GlobalContract");
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
return GlobalContractObjectHelper.fromMap (record, "GlobalContract");
}

  private BSDMInteractionSpec _GlobalContractGetSpec = null;
  /**
   * Get a unique GlobalContract row..
   * Convenience method using default BSDMSessionContext.
   * @param GlobalContractGetIn Input Object Key.
   * @return GlobalContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GlobalContractObjectData get (GlobalContractObjectKeyData GlobalContractGetIn) throws BSDMResourceException
  {
    return get (null, GlobalContractGetIn);
  }
  /**
   * Get a unique GlobalContract row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GlobalContractGetIn Input Object Key.
   * @return GlobalContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public GlobalContractObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam GlobalContractObjectKeyData GlobalContractGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GlobalContractGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GlobalContractGetIn != null) GlobalContractObjectKeyHelper.toMap (GlobalContractGetIn, record, "GlobalContract");
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
return GlobalContractObjectHelper.fromMap (record, "GlobalContract");
}

  private BSDMInteractionSpec _GlobalContractFindSpec = null;
  /**
   * Find GlobalContracts that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GlobalContractFindIn Input Filter Object.
   * @return GlobalContractObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GlobalContractObjectDataList find (GlobalContractObjectFilter GlobalContractFindIn) throws BSDMResourceException
  {
    return find (null, GlobalContractFindIn);
  }
  /**
   * Find GlobalContracts that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GlobalContractFindIn Input Filter Object.
   * @return GlobalContractObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GlobalContractObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,GlobalContractObjectFilter GlobalContractFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GlobalContractFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GlobalContractFindIn != null) GlobalContractObjectHelper.toMap (GlobalContractFindIn, record, "GlobalContract");
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
return GlobalContractObjectHelper.fromMapList (record, "GlobalContractList");
}

  private BSDMInteractionSpec _GlobalContractUpdateSpec = null;
  /**
   * Update the non-key fields of a GlobalContract..
   * Convenience method using default BSDMSessionContext.
   * @param GlobalContractUpdateIn Input  Object.  Read-Only fields: ContractId, ParentGroupNo, ContractType, IsPartOfComponent, TotalPeriods, ViewEffectiveDt, StartByDt.
   * @return GlobalContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GlobalContractObjectData update (GlobalContractObjectData GlobalContractUpdateIn) throws BSDMResourceException
  {
    return update (null, GlobalContractUpdateIn);
  }
  /**
   * Update the non-key fields of a GlobalContract..
   * @param context The session context to use when connecting to the APITS server.
   * @param GlobalContractUpdateIn Input  Object.  Read-Only fields: ContractId, ParentGroupNo, ContractType, IsPartOfComponent, TotalPeriods, ViewEffectiveDt, StartByDt.
   * @return GlobalContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GlobalContractObjectData update (@HeaderParam ("context")BSDMSessionContext context,GlobalContractObjectData GlobalContractUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GlobalContractUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GlobalContractUpdateIn != null) GlobalContractObjectHelper.toMap (GlobalContractUpdateIn, record, "GlobalContract");
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
return GlobalContractObjectHelper.fromMap (record, "GlobalContract");
}

  /**

   * Create a new GlobalContract..

   * Convenience method using default BSDMSessionContext.

   * @param GlobalContractCreateIn Input  Object.  Read-Only fields: ViewEffectiveDt, StartByDt.  Defaulted Fields: CreateDt, ArchFlag, CommitmentAmount, TotalSavingsAmount, TotalElementAmount, ViewStatus, ViewCreatedDt, IntendedViewEffectiveDt, StartDt, GracePeriod, TrackTotalAmounts, DistributePayback, ProrateContractStrtOverride, ProrateContractEndOverride, ProrateInterimBillOverride, ProratePeriodChangeOverride, ProrateAccountStartOverride, ProrateAccountEndOverride, ProrateTgtThresholdOverride, ProrateTgtRebatesOverride, DurationOverride, NoticeOverride, IsPartOfComponent.  Derived Fields: ViewId, ViewEffectiveDt.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GlobalContractObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GlobalContractObjectData create (GlobalContractObjectData GlobalContractCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, GlobalContractCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new GlobalContract..
   * @param context The session context to use when connecting to the APITS server.
   * @param GlobalContractCreateIn Input  Object.  Read-Only fields: ViewEffectiveDt, StartByDt.  Defaulted Fields: CreateDt, ArchFlag, CommitmentAmount, TotalSavingsAmount, TotalElementAmount, ViewStatus, ViewCreatedDt, IntendedViewEffectiveDt, StartDt, GracePeriod, TrackTotalAmounts, DistributePayback, ProrateContractStrtOverride, ProrateContractEndOverride, ProrateInterimBillOverride, ProratePeriodChangeOverride, ProrateAccountStartOverride, ProrateAccountEndOverride, ProrateTgtThresholdOverride, ProrateTgtRebatesOverride, DurationOverride, NoticeOverride, IsPartOfComponent.  Derived Fields: ViewId, ViewEffectiveDt.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GlobalContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GlobalContractObjectData create (BSDMSessionContext context, GlobalContractObjectData GlobalContractCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GlobalContractCreateIn, defaultAction);
       
     cManager.checkConstraints(GlobalContractCreateIn, constraintAction);
       return create (context, GlobalContractCreateIn);
  }

  /**

   * Get a unique GlobalContract row..

   * Convenience method using default BSDMSessionContext.

   * @param GlobalContractGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GlobalContractObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GlobalContractObjectData get (GlobalContractObjectKeyData GlobalContractGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, GlobalContractGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique GlobalContract row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GlobalContractGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GlobalContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GlobalContractObjectData get (BSDMSessionContext context, GlobalContractObjectKeyData GlobalContractGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GlobalContractGetIn, defaultAction);
       
     cManager.checkConstraints(GlobalContractGetIn, constraintAction);
       return get (context, GlobalContractGetIn);
  }

  /**

   * Find GlobalContracts that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param GlobalContractFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GlobalContractObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GlobalContractObjectDataList find (GlobalContractObjectFilter GlobalContractFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, GlobalContractFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find GlobalContracts that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GlobalContractFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GlobalContractObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GlobalContractObjectDataList find (BSDMSessionContext context, GlobalContractObjectFilter GlobalContractFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GlobalContractFindIn, defaultAction);
       
     cManager.checkConstraints(GlobalContractFindIn, constraintAction);
       return find (context, GlobalContractFindIn);
  }

  /**

   * Update the non-key fields of a GlobalContract..

   * Convenience method using default BSDMSessionContext.

   * @param GlobalContractUpdateIn Input  Object.  Read-Only fields: ContractId, ParentGroupNo, ContractType, IsPartOfComponent, TotalPeriods, ViewEffectiveDt, StartByDt.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GlobalContractObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GlobalContractObjectData update (GlobalContractObjectData GlobalContractUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, GlobalContractUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of a GlobalContract..
   * @param context The session context to use when connecting to the APITS server.
   * @param GlobalContractUpdateIn Input  Object.  Read-Only fields: ContractId, ParentGroupNo, ContractType, IsPartOfComponent, TotalPeriods, ViewEffectiveDt, StartByDt.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GlobalContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GlobalContractObjectData update (BSDMSessionContext context, GlobalContractObjectData GlobalContractUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GlobalContractUpdateIn, defaultAction);
       
     cManager.checkConstraints(GlobalContractUpdateIn, constraintAction);
       return update (context, GlobalContractUpdateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public GlobalContractBean ()
  {
    try
    {
      _GlobalContractCreateSpec = new BSDMInteractionSpec("GlobalContractCreate", ApiMappings.getCallName ("GlobalContractCreate"), Boolean.TRUE);

      _GlobalContractGetSpec = new BSDMInteractionSpec("GlobalContractGet", ApiMappings.getCallName ("GlobalContractGet"), Boolean.TRUE);

      _GlobalContractFindSpec = new BSDMInteractionSpec("GlobalContractFind", ApiMappings.getCallName ("GlobalContractFind"), Boolean.TRUE);

      _GlobalContractUpdateSpec = new BSDMInteractionSpec("GlobalContractUpdate", ApiMappings.getCallName ("GlobalContractUpdate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public GlobalContractBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public GlobalContractBean(BSDMSettings settings, BSDMConnectionManager cm)
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
