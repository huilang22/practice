
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: ServiceCenterBean.java
 * Definition File: Admin/ServiceCenter.xml
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
import com.csgsystems.bp.interfaces.ServiceCenterInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="ServiceCenterSessionBean"
 * display-name="ServiceCenter Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/ServiceCenterBean"
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

@Stateless(name="ServiceCenterBean", mappedName = "ServiceCenter")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("ServiceCenters")

public class ServiceCenterBean implements ServiceCenterInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _ServiceCenterGetSpec = null;
  /**
   * Retrieve a unique ServiceCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param SCGetIn Input Object Key.
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServiceCenterObjectData get (ServiceCenterObjectKeyData SCGetIn) throws BSDMResourceException
  {
    return get (null, SCGetIn);
  }
  /**
   * Retrieve a unique ServiceCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCGetIn Input Object Key.
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public ServiceCenterObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam ServiceCenterObjectKeyData SCGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServiceCenterGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SCGetIn != null) ServiceCenterObjectKeyHelper.toMap (SCGetIn, record, "ServiceCenter");
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
return ServiceCenterObjectHelper.fromMap (record, "ServiceCenter");
}

  private BSDMInteractionSpec _ServiceCenterFindSpec = null;
  /**
   * Find ServiceCenter rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SCFindIn Input Filter Object.
   * @return ServiceCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServiceCenterObjectDataList find (ServiceCenterObjectFilter SCFindIn) throws BSDMResourceException
  {
    return find (null, SCFindIn);
  }
  /**
   * Find ServiceCenter rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCFindIn Input Filter Object.
   * @return ServiceCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ServiceCenterObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,ServiceCenterObjectFilter SCFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServiceCenterFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SCFindIn != null) ServiceCenterObjectHelper.toMap (SCFindIn, record, "ServiceCenter");
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
return ServiceCenterObjectHelper.fromMapList (record, "ServiceCenterList");
}

  private BSDMInteractionSpec _ServiceCenterUpdateSpec = null;
  /**
   * Update non-key fields of a ServiceCenter..
   * Convenience method using default BSDMSessionContext.
   * @param SCUpdateIn Input  Object.
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServiceCenterObjectData update (ServiceCenterObjectData SCUpdateIn) throws BSDMResourceException
  {
    return update (null, SCUpdateIn);
  }
  /**
   * Update non-key fields of a ServiceCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCUpdateIn Input  Object.
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ServiceCenterObjectData update (@HeaderParam ("context")BSDMSessionContext context,ServiceCenterObjectData SCUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServiceCenterUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SCUpdateIn != null) ServiceCenterObjectHelper.toMap (SCUpdateIn, record, "ServiceCenter");
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
return ServiceCenterObjectHelper.fromMap (record, "ServiceCenter");
}

  private BSDMInteractionSpec _ServiceCenterDeleteSpec = null;
  /**
   * Delete a ServiceCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param SCDeleteIn Input Object Key.
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServiceCenterObjectData delete (ServiceCenterObjectKeyData SCDeleteIn) throws BSDMResourceException
  {
    return delete (null, SCDeleteIn);
  }
  /**
   * Delete a ServiceCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCDeleteIn Input Object Key.
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ServiceCenterObjectData delete (@HeaderParam ("context")BSDMSessionContext context,ServiceCenterObjectKeyData SCDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServiceCenterDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SCDeleteIn != null) ServiceCenterObjectKeyHelper.toMap (SCDeleteIn, record, "ServiceCenter");
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
return ServiceCenterObjectHelper.fromMap (record, "ServiceCenter");
}

  private BSDMInteractionSpec _ServiceCenterCreateSpec = null;
  /**
   * Create a new ServiceCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param SCCreateIn Input  Object.
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServiceCenterObjectData create (ServiceCenterObjectData SCCreateIn) throws BSDMResourceException
  {
    return create (null, SCCreateIn);
  }
  /**
   * Create a new ServiceCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCCreateIn Input  Object.
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ServiceCenterObjectData create (@HeaderParam ("context")BSDMSessionContext context,ServiceCenterObjectData SCCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServiceCenterCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SCCreateIn != null) ServiceCenterObjectHelper.toMap (SCCreateIn, record, "ServiceCenter");
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
return ServiceCenterObjectHelper.fromMap (record, "ServiceCenter");
}

  /**

   * Retrieve a unique ServiceCenter row..

   * Convenience method using default BSDMSessionContext.

   * @param SCGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServiceCenterObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServiceCenterObjectData get (ServiceCenterObjectKeyData SCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, SCGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a unique ServiceCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServiceCenterObjectData get (BSDMSessionContext context, ServiceCenterObjectKeyData SCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SCGetIn, defaultAction);
       
     cManager.checkConstraints(SCGetIn, constraintAction);
       return get (context, SCGetIn);
  }

  /**

   * Find ServiceCenter rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param SCFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServiceCenterObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServiceCenterObjectDataList find (ServiceCenterObjectFilter SCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, SCFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find ServiceCenter rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServiceCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServiceCenterObjectDataList find (BSDMSessionContext context, ServiceCenterObjectFilter SCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SCFindIn, defaultAction);
       
     cManager.checkConstraints(SCFindIn, constraintAction);
       return find (context, SCFindIn);
  }

  /**

   * Update non-key fields of a ServiceCenter..

   * Convenience method using default BSDMSessionContext.

   * @param SCUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServiceCenterObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServiceCenterObjectData update (ServiceCenterObjectData SCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, SCUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a ServiceCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServiceCenterObjectData update (BSDMSessionContext context, ServiceCenterObjectData SCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SCUpdateIn, defaultAction);
       
     cManager.checkConstraints(SCUpdateIn, constraintAction);
       return update (context, SCUpdateIn);
  }

  /**

   * Delete a ServiceCenter row..

   * Convenience method using default BSDMSessionContext.

   * @param SCDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServiceCenterObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServiceCenterObjectData delete (ServiceCenterObjectKeyData SCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, SCDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a ServiceCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServiceCenterObjectData delete (BSDMSessionContext context, ServiceCenterObjectKeyData SCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SCDeleteIn, defaultAction);
       
     cManager.checkConstraints(SCDeleteIn, constraintAction);
       return delete (context, SCDeleteIn);
  }

  /**

   * Create a new ServiceCenter row..

   * Convenience method using default BSDMSessionContext.

   * @param SCCreateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServiceCenterObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServiceCenterObjectData create (ServiceCenterObjectData SCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, SCCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new ServiceCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SCCreateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServiceCenterObjectData create (BSDMSessionContext context, ServiceCenterObjectData SCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SCCreateIn, defaultAction);
       
     cManager.checkConstraints(SCCreateIn, constraintAction);
       return create (context, SCCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public ServiceCenterBean ()
  {
    try
    {
      _ServiceCenterGetSpec = new BSDMInteractionSpec("ServiceCenterGet", ApiMappings.getCallName ("ServiceCenterGet"), Boolean.TRUE);

      _ServiceCenterFindSpec = new BSDMInteractionSpec("ServiceCenterFind", ApiMappings.getCallName ("ServiceCenterFind"), Boolean.TRUE);

      _ServiceCenterUpdateSpec = new BSDMInteractionSpec("ServiceCenterUpdate", ApiMappings.getCallName ("ServiceCenterUpdate"), Boolean.TRUE);

      _ServiceCenterDeleteSpec = new BSDMInteractionSpec("ServiceCenterDelete", ApiMappings.getCallName ("ServiceCenterDelete"), Boolean.TRUE);

      _ServiceCenterCreateSpec = new BSDMInteractionSpec("ServiceCenterCreate", ApiMappings.getCallName ("ServiceCenterCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public ServiceCenterBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public ServiceCenterBean(BSDMSettings settings, BSDMConnectionManager cm)
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
