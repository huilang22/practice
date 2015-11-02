
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: ServiceMasterGroupBean.java
 * Definition File: Customer/ServiceMasterGroup.xml
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
import com.csgsystems.bp.interfaces.ServiceMasterGroupInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="ServiceMasterGroupSessionBean"
 * display-name="ServiceMasterGroup Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/ServiceMasterGroupBean"
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

@Stateless(name="ServiceMasterGroupBean", mappedName = "ServiceMasterGroup")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("ServiceMasterGroups")

public class ServiceMasterGroupBean implements ServiceMasterGroupInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _ServiceMasterGroupGetSpec = null;
  /**
   * Get a unique ServiceMasterGroup..
   * Convenience method using default BSDMSessionContext.
   * @param EMGgetIn Input Object Key.
   * @return ServiceMasterGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServiceMasterGroupObjectData get (ServiceMasterGroupObjectKeyData EMGgetIn) throws BSDMResourceException
  {
    return get (null, EMGgetIn);
  }
  /**
   * Get a unique ServiceMasterGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param EMGgetIn Input Object Key.
   * @return ServiceMasterGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public ServiceMasterGroupObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam ServiceMasterGroupObjectKeyData EMGgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServiceMasterGroupGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (EMGgetIn != null) ServiceMasterGroupObjectKeyHelper.toMap (EMGgetIn, record, "ServiceMasterGroup");
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
return ServiceMasterGroupObjectHelper.fromMap (record, "ServiceMasterGroup");
}

  private BSDMInteractionSpec _ServiceMasterGroupFindSpec = null;
  /**
   * Find ServiceMasterGroup's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param EMGfindIn Input Filter Object.
   * @return ServiceMasterGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServiceMasterGroupObjectDataList find (ServiceMasterGroupObjectFilter EMGfindIn) throws BSDMResourceException
  {
    return find (null, EMGfindIn);
  }
  /**
   * Find ServiceMasterGroup's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param EMGfindIn Input Filter Object.
   * @return ServiceMasterGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ServiceMasterGroupObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,ServiceMasterGroupObjectFilter EMGfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServiceMasterGroupFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (EMGfindIn != null) ServiceMasterGroupObjectHelper.toMap (EMGfindIn, record, "ServiceMasterGroup");
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
return ServiceMasterGroupObjectHelper.fromMapList (record, "ServiceMasterGroupList");
}

  private BSDMInteractionSpec _ServiceMasterGroupCreateSpec = null;
  /**
   * Create a new ServiceMasterGroup..
   * Convenience method using default BSDMSessionContext.
   * @param EMGcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, CreateDt.  Derived Fields: CreateDt.
   * @return ServiceMasterGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServiceMasterGroupObjectData create (ServiceMasterGroupObjectData EMGcreateIn) throws BSDMResourceException
  {
    return create (null, EMGcreateIn);
  }
  /**
   * Create a new ServiceMasterGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param EMGcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, CreateDt.  Derived Fields: CreateDt.
   * @return ServiceMasterGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ServiceMasterGroupObjectData create (@HeaderParam ("context")BSDMSessionContext context,ServiceMasterGroupObjectData EMGcreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServiceMasterGroupCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (EMGcreateIn != null) ServiceMasterGroupObjectHelper.toMap (EMGcreateIn, record, "ServiceMasterGroup");
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
return ServiceMasterGroupObjectHelper.fromMap (record, "ServiceMasterGroup");
}

  private BSDMInteractionSpec _ServiceMasterGroupUpdateSpec = null;
  /**
   * Update the non-key fields of a ServiceMasterGroup..
   * Convenience method using default BSDMSessionContext.
   * @param EMGupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, CreateDt.
   * @return ServiceMasterGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServiceMasterGroupObjectData update (ServiceMasterGroupObjectData EMGupdateIn) throws BSDMResourceException
  {
    return update (null, EMGupdateIn);
  }
  /**
   * Update the non-key fields of a ServiceMasterGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param EMGupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, CreateDt.
   * @return ServiceMasterGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ServiceMasterGroupObjectData update (@HeaderParam ("context")BSDMSessionContext context,ServiceMasterGroupObjectData EMGupdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServiceMasterGroupUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (EMGupdateIn != null) ServiceMasterGroupObjectHelper.toMap (EMGupdateIn, record, "ServiceMasterGroup");
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
return ServiceMasterGroupObjectHelper.fromMap (record, "ServiceMasterGroup");
}

  /**

   * Get a unique ServiceMasterGroup..

   * Convenience method using default BSDMSessionContext.

   * @param EMGgetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServiceMasterGroupObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServiceMasterGroupObjectData get (ServiceMasterGroupObjectKeyData EMGgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, EMGgetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique ServiceMasterGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param EMGgetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServiceMasterGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServiceMasterGroupObjectData get (BSDMSessionContext context, ServiceMasterGroupObjectKeyData EMGgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(EMGgetIn, defaultAction);
       
     cManager.checkConstraints(EMGgetIn, constraintAction);
       return get (context, EMGgetIn);
  }

  /**

   * Find ServiceMasterGroup's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param EMGfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServiceMasterGroupObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServiceMasterGroupObjectDataList find (ServiceMasterGroupObjectFilter EMGfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, EMGfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find ServiceMasterGroup's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param EMGfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServiceMasterGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServiceMasterGroupObjectDataList find (BSDMSessionContext context, ServiceMasterGroupObjectFilter EMGfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(EMGfindIn, defaultAction);
       
     cManager.checkConstraints(EMGfindIn, constraintAction);
       return find (context, EMGfindIn);
  }

  /**

   * Create a new ServiceMasterGroup..

   * Convenience method using default BSDMSessionContext.

   * @param EMGcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, CreateDt.  Derived Fields: CreateDt.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServiceMasterGroupObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServiceMasterGroupObjectData create (ServiceMasterGroupObjectData EMGcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, EMGcreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new ServiceMasterGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param EMGcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, CreateDt.  Derived Fields: CreateDt.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServiceMasterGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServiceMasterGroupObjectData create (BSDMSessionContext context, ServiceMasterGroupObjectData EMGcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(EMGcreateIn, defaultAction);
       
     cManager.checkConstraints(EMGcreateIn, constraintAction);
       return create (context, EMGcreateIn);
  }

  /**

   * Update the non-key fields of a ServiceMasterGroup..

   * Convenience method using default BSDMSessionContext.

   * @param EMGupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, CreateDt.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServiceMasterGroupObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServiceMasterGroupObjectData update (ServiceMasterGroupObjectData EMGupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, EMGupdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of a ServiceMasterGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param EMGupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, CreateDt.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServiceMasterGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServiceMasterGroupObjectData update (BSDMSessionContext context, ServiceMasterGroupObjectData EMGupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(EMGupdateIn, defaultAction);
       
     cManager.checkConstraints(EMGupdateIn, constraintAction);
       return update (context, EMGupdateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public ServiceMasterGroupBean ()
  {
    try
    {
      _ServiceMasterGroupGetSpec = new BSDMInteractionSpec("ServiceMasterGroupGet", ApiMappings.getCallName ("ServiceMasterGroupGet"), Boolean.TRUE);

      _ServiceMasterGroupFindSpec = new BSDMInteractionSpec("ServiceMasterGroupFind", ApiMappings.getCallName ("ServiceMasterGroupFind"), Boolean.TRUE);

      _ServiceMasterGroupCreateSpec = new BSDMInteractionSpec("ServiceMasterGroupCreate", ApiMappings.getCallName ("ServiceMasterGroupCreate"), Boolean.TRUE);

      _ServiceMasterGroupUpdateSpec = new BSDMInteractionSpec("ServiceMasterGroupUpdate", ApiMappings.getCallName ("ServiceMasterGroupUpdate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public ServiceMasterGroupBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public ServiceMasterGroupBean(BSDMSettings settings, BSDMConnectionManager cm)
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
