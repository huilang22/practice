
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: GlobalOpenItemIdMapBean.java
 * Definition File: Admin/GlobalOpenItemIdMap.xml
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
import com.csgsystems.bp.interfaces.GlobalOpenItemIdMapInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="GlobalOpenItemIdMapSessionBean"
 * display-name="GlobalOpenItemIdMap Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/GlobalOpenItemIdMapBean"
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

@Stateless(name="GlobalOpenItemIdMapBean", mappedName = "GlobalOpenItemIdMap")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("GlobalOpenItemIdMaps")

public class GlobalOpenItemIdMapBean implements GlobalOpenItemIdMapInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _GlobalOpenItemIdMapGetSpec = null;
  /**
   * Retrieve a unique GlobalOpenItemIdMap row..
   * Convenience method using default BSDMSessionContext.
   * @param GOIIMGetIn Input Object Key.
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GlobalOpenItemIdMapObjectData get (GlobalOpenItemIdMapObjectKeyData GOIIMGetIn) throws BSDMResourceException
  {
    return get (null, GOIIMGetIn);
  }
  /**
   * Retrieve a unique GlobalOpenItemIdMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GOIIMGetIn Input Object Key.
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public GlobalOpenItemIdMapObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam GlobalOpenItemIdMapObjectKeyData GOIIMGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GlobalOpenItemIdMapGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GOIIMGetIn != null) GlobalOpenItemIdMapObjectKeyHelper.toMap (GOIIMGetIn, record, "GlobalOpenItemIdMap");
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
return GlobalOpenItemIdMapObjectHelper.fromMap (record, "GlobalOpenItemIdMap");
}

  private BSDMInteractionSpec _GlobalOpenItemIdMapFindSpec = null;
  /**
   * Find GlobalOpenItemIdMap rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GOIIMFindIn Input Filter Object.
   * @return GlobalOpenItemIdMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GlobalOpenItemIdMapObjectDataList find (GlobalOpenItemIdMapObjectFilter GOIIMFindIn) throws BSDMResourceException
  {
    return find (null, GOIIMFindIn);
  }
  /**
   * Find GlobalOpenItemIdMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GOIIMFindIn Input Filter Object.
   * @return GlobalOpenItemIdMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GlobalOpenItemIdMapObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,GlobalOpenItemIdMapObjectFilter GOIIMFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GlobalOpenItemIdMapFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GOIIMFindIn != null) GlobalOpenItemIdMapObjectHelper.toMap (GOIIMFindIn, record, "GlobalOpenItemIdMap");
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
return GlobalOpenItemIdMapObjectHelper.fromMapList (record, "GlobalOpenItemIdMapList");
}

  private BSDMInteractionSpec _GlobalOpenItemIdMapUpdateSpec = null;
  /**
   * Update non-key fields of a GlobalOpenItemIdMap..
   * Convenience method using default BSDMSessionContext.
   * @param GOIIMUpdateIn Input  Object.
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GlobalOpenItemIdMapObjectData update (GlobalOpenItemIdMapObjectData GOIIMUpdateIn) throws BSDMResourceException
  {
    return update (null, GOIIMUpdateIn);
  }
  /**
   * Update non-key fields of a GlobalOpenItemIdMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param GOIIMUpdateIn Input  Object.
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GlobalOpenItemIdMapObjectData update (@HeaderParam ("context")BSDMSessionContext context,GlobalOpenItemIdMapObjectData GOIIMUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GlobalOpenItemIdMapUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GOIIMUpdateIn != null) GlobalOpenItemIdMapObjectHelper.toMap (GOIIMUpdateIn, record, "GlobalOpenItemIdMap");
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
return GlobalOpenItemIdMapObjectHelper.fromMap (record, "GlobalOpenItemIdMap");
}

  private BSDMInteractionSpec _GlobalOpenItemIdMapDeleteSpec = null;
  /**
   * Delete a GlobalOpenItemIdMap row..
   * Convenience method using default BSDMSessionContext.
   * @param GOIIMDeleteIn Input Object Key.
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GlobalOpenItemIdMapObjectData delete (GlobalOpenItemIdMapObjectKeyData GOIIMDeleteIn) throws BSDMResourceException
  {
    return delete (null, GOIIMDeleteIn);
  }
  /**
   * Delete a GlobalOpenItemIdMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GOIIMDeleteIn Input Object Key.
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GlobalOpenItemIdMapObjectData delete (@HeaderParam ("context")BSDMSessionContext context,GlobalOpenItemIdMapObjectKeyData GOIIMDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GlobalOpenItemIdMapDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GOIIMDeleteIn != null) GlobalOpenItemIdMapObjectKeyHelper.toMap (GOIIMDeleteIn, record, "GlobalOpenItemIdMap");
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
return GlobalOpenItemIdMapObjectHelper.fromMap (record, "GlobalOpenItemIdMap");
}

  private BSDMInteractionSpec _GlobalOpenItemIdMapCreateSpec = null;
  /**
   * Create a new GlobalOpenItemIdMap row..
   * Convenience method using default BSDMSessionContext.
   * @param GOIIMCreateIn Input  Object.
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GlobalOpenItemIdMapObjectData create (GlobalOpenItemIdMapObjectData GOIIMCreateIn) throws BSDMResourceException
  {
    return create (null, GOIIMCreateIn);
  }
  /**
   * Create a new GlobalOpenItemIdMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GOIIMCreateIn Input  Object.
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GlobalOpenItemIdMapObjectData create (@HeaderParam ("context")BSDMSessionContext context,GlobalOpenItemIdMapObjectData GOIIMCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GlobalOpenItemIdMapCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GOIIMCreateIn != null) GlobalOpenItemIdMapObjectHelper.toMap (GOIIMCreateIn, record, "GlobalOpenItemIdMap");
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
return GlobalOpenItemIdMapObjectHelper.fromMap (record, "GlobalOpenItemIdMap");
}

  /**

   * Retrieve a unique GlobalOpenItemIdMap row..

   * Convenience method using default BSDMSessionContext.

   * @param GOIIMGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GlobalOpenItemIdMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GlobalOpenItemIdMapObjectData get (GlobalOpenItemIdMapObjectKeyData GOIIMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, GOIIMGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a unique GlobalOpenItemIdMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GOIIMGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GlobalOpenItemIdMapObjectData get (BSDMSessionContext context, GlobalOpenItemIdMapObjectKeyData GOIIMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GOIIMGetIn, defaultAction);
       
     cManager.checkConstraints(GOIIMGetIn, constraintAction);
       return get (context, GOIIMGetIn);
  }

  /**

   * Find GlobalOpenItemIdMap rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param GOIIMFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GlobalOpenItemIdMapObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GlobalOpenItemIdMapObjectDataList find (GlobalOpenItemIdMapObjectFilter GOIIMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, GOIIMFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find GlobalOpenItemIdMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GOIIMFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GlobalOpenItemIdMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GlobalOpenItemIdMapObjectDataList find (BSDMSessionContext context, GlobalOpenItemIdMapObjectFilter GOIIMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GOIIMFindIn, defaultAction);
       
     cManager.checkConstraints(GOIIMFindIn, constraintAction);
       return find (context, GOIIMFindIn);
  }

  /**

   * Update non-key fields of a GlobalOpenItemIdMap..

   * Convenience method using default BSDMSessionContext.

   * @param GOIIMUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GlobalOpenItemIdMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GlobalOpenItemIdMapObjectData update (GlobalOpenItemIdMapObjectData GOIIMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, GOIIMUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a GlobalOpenItemIdMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param GOIIMUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GlobalOpenItemIdMapObjectData update (BSDMSessionContext context, GlobalOpenItemIdMapObjectData GOIIMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GOIIMUpdateIn, defaultAction);
       
     cManager.checkConstraints(GOIIMUpdateIn, constraintAction);
       return update (context, GOIIMUpdateIn);
  }

  /**

   * Delete a GlobalOpenItemIdMap row..

   * Convenience method using default BSDMSessionContext.

   * @param GOIIMDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GlobalOpenItemIdMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GlobalOpenItemIdMapObjectData delete (GlobalOpenItemIdMapObjectKeyData GOIIMDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, GOIIMDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a GlobalOpenItemIdMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GOIIMDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GlobalOpenItemIdMapObjectData delete (BSDMSessionContext context, GlobalOpenItemIdMapObjectKeyData GOIIMDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GOIIMDeleteIn, defaultAction);
       
     cManager.checkConstraints(GOIIMDeleteIn, constraintAction);
       return delete (context, GOIIMDeleteIn);
  }

  /**

   * Create a new GlobalOpenItemIdMap row..

   * Convenience method using default BSDMSessionContext.

   * @param GOIIMCreateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GlobalOpenItemIdMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GlobalOpenItemIdMapObjectData create (GlobalOpenItemIdMapObjectData GOIIMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, GOIIMCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new GlobalOpenItemIdMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GOIIMCreateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GlobalOpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GlobalOpenItemIdMapObjectData create (BSDMSessionContext context, GlobalOpenItemIdMapObjectData GOIIMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GOIIMCreateIn, defaultAction);
       
     cManager.checkConstraints(GOIIMCreateIn, constraintAction);
       return create (context, GOIIMCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public GlobalOpenItemIdMapBean ()
  {
    try
    {
      _GlobalOpenItemIdMapGetSpec = new BSDMInteractionSpec("GlobalOpenItemIdMapGet", ApiMappings.getCallName ("GlobalOpenItemIdMapGet"), Boolean.TRUE);

      _GlobalOpenItemIdMapFindSpec = new BSDMInteractionSpec("GlobalOpenItemIdMapFind", ApiMappings.getCallName ("GlobalOpenItemIdMapFind"), Boolean.TRUE);

      _GlobalOpenItemIdMapUpdateSpec = new BSDMInteractionSpec("GlobalOpenItemIdMapUpdate", ApiMappings.getCallName ("GlobalOpenItemIdMapUpdate"), Boolean.TRUE);

      _GlobalOpenItemIdMapDeleteSpec = new BSDMInteractionSpec("GlobalOpenItemIdMapDelete", ApiMappings.getCallName ("GlobalOpenItemIdMapDelete"), Boolean.TRUE);

      _GlobalOpenItemIdMapCreateSpec = new BSDMInteractionSpec("GlobalOpenItemIdMapCreate", ApiMappings.getCallName ("GlobalOpenItemIdMapCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public GlobalOpenItemIdMapBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public GlobalOpenItemIdMapBean(BSDMSettings settings, BSDMConnectionManager cm)
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
