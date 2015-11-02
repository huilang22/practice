
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: ServerDefinitionBean.java
 * Definition File: Catalog/ServerDefinition.xml
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
import com.csgsystems.bp.interfaces.ServerDefinitionInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="ServerDefinitionSessionBean"
 * display-name="ServerDefinition Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/ServerDefinitionBean"
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

@Stateless(name="ServerDefinitionBean", mappedName = "ServerDefinition")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("ServerDefinitions")

public class ServerDefinitionBean implements ServerDefinitionInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _ServerDefinitionGetSpec = null;
  /**
   * Retrieve a unique ServerDefinition row..
   * Convenience method using default BSDMSessionContext.
   * @param SDGetIn Input Object Key.
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServerDefinitionObjectData get (ServerDefinitionObjectKeyData SDGetIn) throws BSDMResourceException
  {
    return get (null, SDGetIn);
  }
  /**
   * Retrieve a unique ServerDefinition row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SDGetIn Input Object Key.
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public ServerDefinitionObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam ServerDefinitionObjectKeyData SDGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServerDefinitionGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SDGetIn != null) ServerDefinitionObjectKeyHelper.toMap (SDGetIn, record, "ServerDefinition");
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
return ServerDefinitionObjectHelper.fromMap (record, "ServerDefinition");
}

  private BSDMInteractionSpec _ServerDefinitionFindSpec = null;
  /**
   * Find ServerDefinition rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SDFindIn Input Filter Object.
   * @return ServerDefinitionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServerDefinitionObjectDataList find (ServerDefinitionObjectFilter SDFindIn) throws BSDMResourceException
  {
    return find (null, SDFindIn);
  }
  /**
   * Find ServerDefinition rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SDFindIn Input Filter Object.
   * @return ServerDefinitionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ServerDefinitionObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,ServerDefinitionObjectFilter SDFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServerDefinitionFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SDFindIn != null) ServerDefinitionObjectHelper.toMap (SDFindIn, record, "ServerDefinition");
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
return ServerDefinitionObjectHelper.fromMapList (record, "ServerDefinitionList");
}

  private BSDMInteractionSpec _ServerDefinitionUpdateSpec = null;
  /**
   * Update non-key fields of a ServerDefinition..
   * Convenience method using default BSDMSessionContext.
   * @param SDUpdateIn Input  Object.
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServerDefinitionObjectData update (ServerDefinitionObjectData SDUpdateIn) throws BSDMResourceException
  {
    return update (null, SDUpdateIn);
  }
  /**
   * Update non-key fields of a ServerDefinition..
   * @param context The session context to use when connecting to the APITS server.
   * @param SDUpdateIn Input  Object.
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ServerDefinitionObjectData update (@HeaderParam ("context")BSDMSessionContext context,ServerDefinitionObjectData SDUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServerDefinitionUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SDUpdateIn != null) ServerDefinitionObjectHelper.toMap (SDUpdateIn, record, "ServerDefinition");
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
return ServerDefinitionObjectHelper.fromMap (record, "ServerDefinition");
}

  private BSDMInteractionSpec _ServerDefinitionDeleteSpec = null;
  /**
   * Delete a ServerDefinition row..
   * Convenience method using default BSDMSessionContext.
   * @param SDDeleteIn Input Object Key.
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServerDefinitionObjectData delete (ServerDefinitionObjectKeyData SDDeleteIn) throws BSDMResourceException
  {
    return delete (null, SDDeleteIn);
  }
  /**
   * Delete a ServerDefinition row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SDDeleteIn Input Object Key.
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ServerDefinitionObjectData delete (@HeaderParam ("context")BSDMSessionContext context,ServerDefinitionObjectKeyData SDDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServerDefinitionDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SDDeleteIn != null) ServerDefinitionObjectKeyHelper.toMap (SDDeleteIn, record, "ServerDefinition");
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
return ServerDefinitionObjectHelper.fromMap (record, "ServerDefinition");
}

  private BSDMInteractionSpec _ServerDefinitionCreateSpec = null;
  /**
   * Create a new ServerDefinition row..
   * Convenience method using default BSDMSessionContext.
   * @param SDCreateIn Input  Object.
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServerDefinitionObjectData create (ServerDefinitionObjectData SDCreateIn) throws BSDMResourceException
  {
    return create (null, SDCreateIn);
  }
  /**
   * Create a new ServerDefinition row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SDCreateIn Input  Object.
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ServerDefinitionObjectData create (@HeaderParam ("context")BSDMSessionContext context,ServerDefinitionObjectData SDCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServerDefinitionCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SDCreateIn != null) ServerDefinitionObjectHelper.toMap (SDCreateIn, record, "ServerDefinition");
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
return ServerDefinitionObjectHelper.fromMap (record, "ServerDefinition");
}

  /**

   * Retrieve a unique ServerDefinition row..

   * Convenience method using default BSDMSessionContext.

   * @param SDGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServerDefinitionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServerDefinitionObjectData get (ServerDefinitionObjectKeyData SDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, SDGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a unique ServerDefinition row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SDGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServerDefinitionObjectData get (BSDMSessionContext context, ServerDefinitionObjectKeyData SDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SDGetIn, defaultAction);
       
     cManager.checkConstraints(SDGetIn, constraintAction);
       return get (context, SDGetIn);
  }

  /**

   * Find ServerDefinition rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param SDFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServerDefinitionObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServerDefinitionObjectDataList find (ServerDefinitionObjectFilter SDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, SDFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find ServerDefinition rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SDFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServerDefinitionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServerDefinitionObjectDataList find (BSDMSessionContext context, ServerDefinitionObjectFilter SDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SDFindIn, defaultAction);
       
     cManager.checkConstraints(SDFindIn, constraintAction);
       return find (context, SDFindIn);
  }

  /**

   * Update non-key fields of a ServerDefinition..

   * Convenience method using default BSDMSessionContext.

   * @param SDUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServerDefinitionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServerDefinitionObjectData update (ServerDefinitionObjectData SDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, SDUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a ServerDefinition..
   * @param context The session context to use when connecting to the APITS server.
   * @param SDUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServerDefinitionObjectData update (BSDMSessionContext context, ServerDefinitionObjectData SDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SDUpdateIn, defaultAction);
       
     cManager.checkConstraints(SDUpdateIn, constraintAction);
       return update (context, SDUpdateIn);
  }

  /**

   * Delete a ServerDefinition row..

   * Convenience method using default BSDMSessionContext.

   * @param SDDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServerDefinitionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServerDefinitionObjectData delete (ServerDefinitionObjectKeyData SDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, SDDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a ServerDefinition row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SDDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServerDefinitionObjectData delete (BSDMSessionContext context, ServerDefinitionObjectKeyData SDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SDDeleteIn, defaultAction);
       
     cManager.checkConstraints(SDDeleteIn, constraintAction);
       return delete (context, SDDeleteIn);
  }

  /**

   * Create a new ServerDefinition row..

   * Convenience method using default BSDMSessionContext.

   * @param SDCreateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServerDefinitionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServerDefinitionObjectData create (ServerDefinitionObjectData SDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, SDCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new ServerDefinition row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SDCreateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServerDefinitionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServerDefinitionObjectData create (BSDMSessionContext context, ServerDefinitionObjectData SDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SDCreateIn, defaultAction);
       
     cManager.checkConstraints(SDCreateIn, constraintAction);
       return create (context, SDCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public ServerDefinitionBean ()
  {
    try
    {
      _ServerDefinitionGetSpec = new BSDMInteractionSpec("ServerDefinitionGet", ApiMappings.getCallName ("ServerDefinitionGet"), Boolean.TRUE);

      _ServerDefinitionFindSpec = new BSDMInteractionSpec("ServerDefinitionFind", ApiMappings.getCallName ("ServerDefinitionFind"), Boolean.TRUE);

      _ServerDefinitionUpdateSpec = new BSDMInteractionSpec("ServerDefinitionUpdate", ApiMappings.getCallName ("ServerDefinitionUpdate"), Boolean.TRUE);

      _ServerDefinitionDeleteSpec = new BSDMInteractionSpec("ServerDefinitionDelete", ApiMappings.getCallName ("ServerDefinitionDelete"), Boolean.TRUE);

      _ServerDefinitionCreateSpec = new BSDMInteractionSpec("ServerDefinitionCreate", ApiMappings.getCallName ("ServerDefinitionCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public ServerDefinitionBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public ServerDefinitionBean(BSDMSettings settings, BSDMConnectionManager cm)
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
