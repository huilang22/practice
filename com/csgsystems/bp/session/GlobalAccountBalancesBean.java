
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: GlobalAccountBalancesBean.java
 * Definition File: Admin/GlobalAccountBalances.xml
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
import com.csgsystems.bp.interfaces.GlobalAccountBalancesInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="GlobalAccountBalancesSessionBean"
 * display-name="GlobalAccountBalances Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/GlobalAccountBalancesBean"
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

@Stateless(name="GlobalAccountBalancesBean", mappedName = "GlobalAccountBalances")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("GlobalAccountBalances")

public class GlobalAccountBalancesBean implements GlobalAccountBalancesInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _GlobalAccountBalancesGetSpec = null;
  /**
   * Retrieve a unique GlobalAccountBalances row..
   * Convenience method using default BSDMSessionContext.
   * @param GABGetIn Input Object Key.
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GlobalAccountBalancesObjectData get (GlobalAccountBalancesObjectKeyData GABGetIn) throws BSDMResourceException
  {
    return get (null, GABGetIn);
  }
  /**
   * Retrieve a unique GlobalAccountBalances row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GABGetIn Input Object Key.
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public GlobalAccountBalancesObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam GlobalAccountBalancesObjectKeyData GABGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GlobalAccountBalancesGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GABGetIn != null) GlobalAccountBalancesObjectKeyHelper.toMap (GABGetIn, record, "GlobalAccountBalances");
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
return GlobalAccountBalancesObjectHelper.fromMap (record, "GlobalAccountBalances");
}

  private BSDMInteractionSpec _GlobalAccountBalancesFindSpec = null;
  /**
   * Find GlobalAccountBalances rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GABFindIn Input Filter Object.
   * @return GlobalAccountBalancesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GlobalAccountBalancesObjectDataList find (GlobalAccountBalancesObjectFilter GABFindIn) throws BSDMResourceException
  {
    return find (null, GABFindIn);
  }
  /**
   * Find GlobalAccountBalances rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GABFindIn Input Filter Object.
   * @return GlobalAccountBalancesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GlobalAccountBalancesObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,GlobalAccountBalancesObjectFilter GABFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GlobalAccountBalancesFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GABFindIn != null) GlobalAccountBalancesObjectHelper.toMap (GABFindIn, record, "GlobalAccountBalances");
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
return GlobalAccountBalancesObjectHelper.fromMapList (record, "GlobalAccountBalancesList");
}

  private BSDMInteractionSpec _GlobalAccountBalancesUpdateSpec = null;
  /**
   * Update non-key fields of a GlobalAccountBalances..
   * Convenience method using default BSDMSessionContext.
   * @param GABUpdateIn Input  Object.
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GlobalAccountBalancesObjectData update (GlobalAccountBalancesObjectData GABUpdateIn) throws BSDMResourceException
  {
    return update (null, GABUpdateIn);
  }
  /**
   * Update non-key fields of a GlobalAccountBalances..
   * @param context The session context to use when connecting to the APITS server.
   * @param GABUpdateIn Input  Object.
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GlobalAccountBalancesObjectData update (@HeaderParam ("context")BSDMSessionContext context,GlobalAccountBalancesObjectData GABUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GlobalAccountBalancesUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GABUpdateIn != null) GlobalAccountBalancesObjectHelper.toMap (GABUpdateIn, record, "GlobalAccountBalances");
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
return GlobalAccountBalancesObjectHelper.fromMap (record, "GlobalAccountBalances");
}

  private BSDMInteractionSpec _GlobalAccountBalancesDeleteSpec = null;
  /**
   * Delete a GlobalAccountBalances row..
   * Convenience method using default BSDMSessionContext.
   * @param GABDeleteIn Input Object Key.
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GlobalAccountBalancesObjectData delete (GlobalAccountBalancesObjectKeyData GABDeleteIn) throws BSDMResourceException
  {
    return delete (null, GABDeleteIn);
  }
  /**
   * Delete a GlobalAccountBalances row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GABDeleteIn Input Object Key.
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GlobalAccountBalancesObjectData delete (@HeaderParam ("context")BSDMSessionContext context,GlobalAccountBalancesObjectKeyData GABDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GlobalAccountBalancesDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GABDeleteIn != null) GlobalAccountBalancesObjectKeyHelper.toMap (GABDeleteIn, record, "GlobalAccountBalances");
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
return GlobalAccountBalancesObjectHelper.fromMap (record, "GlobalAccountBalances");
}

  private BSDMInteractionSpec _GlobalAccountBalancesCreateSpec = null;
  /**
   * Create a new GlobalAccountBalances row..
   * Convenience method using default BSDMSessionContext.
   * @param GABCreateIn Input  Object.
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GlobalAccountBalancesObjectData create (GlobalAccountBalancesObjectData GABCreateIn) throws BSDMResourceException
  {
    return create (null, GABCreateIn);
  }
  /**
   * Create a new GlobalAccountBalances row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GABCreateIn Input  Object.
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GlobalAccountBalancesObjectData create (@HeaderParam ("context")BSDMSessionContext context,GlobalAccountBalancesObjectData GABCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GlobalAccountBalancesCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GABCreateIn != null) GlobalAccountBalancesObjectHelper.toMap (GABCreateIn, record, "GlobalAccountBalances");
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
return GlobalAccountBalancesObjectHelper.fromMap (record, "GlobalAccountBalances");
}

  /**

   * Retrieve a unique GlobalAccountBalances row..

   * Convenience method using default BSDMSessionContext.

   * @param GABGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GlobalAccountBalancesObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GlobalAccountBalancesObjectData get (GlobalAccountBalancesObjectKeyData GABGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, GABGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a unique GlobalAccountBalances row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GABGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GlobalAccountBalancesObjectData get (BSDMSessionContext context, GlobalAccountBalancesObjectKeyData GABGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GABGetIn, defaultAction);
       
     cManager.checkConstraints(GABGetIn, constraintAction);
       return get (context, GABGetIn);
  }

  /**

   * Find GlobalAccountBalances rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param GABFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GlobalAccountBalancesObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GlobalAccountBalancesObjectDataList find (GlobalAccountBalancesObjectFilter GABFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, GABFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find GlobalAccountBalances rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GABFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GlobalAccountBalancesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GlobalAccountBalancesObjectDataList find (BSDMSessionContext context, GlobalAccountBalancesObjectFilter GABFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GABFindIn, defaultAction);
       
     cManager.checkConstraints(GABFindIn, constraintAction);
       return find (context, GABFindIn);
  }

  /**

   * Update non-key fields of a GlobalAccountBalances..

   * Convenience method using default BSDMSessionContext.

   * @param GABUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GlobalAccountBalancesObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GlobalAccountBalancesObjectData update (GlobalAccountBalancesObjectData GABUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, GABUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a GlobalAccountBalances..
   * @param context The session context to use when connecting to the APITS server.
   * @param GABUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GlobalAccountBalancesObjectData update (BSDMSessionContext context, GlobalAccountBalancesObjectData GABUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GABUpdateIn, defaultAction);
       
     cManager.checkConstraints(GABUpdateIn, constraintAction);
       return update (context, GABUpdateIn);
  }

  /**

   * Delete a GlobalAccountBalances row..

   * Convenience method using default BSDMSessionContext.

   * @param GABDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GlobalAccountBalancesObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GlobalAccountBalancesObjectData delete (GlobalAccountBalancesObjectKeyData GABDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, GABDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a GlobalAccountBalances row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GABDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GlobalAccountBalancesObjectData delete (BSDMSessionContext context, GlobalAccountBalancesObjectKeyData GABDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GABDeleteIn, defaultAction);
       
     cManager.checkConstraints(GABDeleteIn, constraintAction);
       return delete (context, GABDeleteIn);
  }

  /**

   * Create a new GlobalAccountBalances row..

   * Convenience method using default BSDMSessionContext.

   * @param GABCreateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GlobalAccountBalancesObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GlobalAccountBalancesObjectData create (GlobalAccountBalancesObjectData GABCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, GABCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new GlobalAccountBalances row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GABCreateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GlobalAccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GlobalAccountBalancesObjectData create (BSDMSessionContext context, GlobalAccountBalancesObjectData GABCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GABCreateIn, defaultAction);
       
     cManager.checkConstraints(GABCreateIn, constraintAction);
       return create (context, GABCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public GlobalAccountBalancesBean ()
  {
    try
    {
      _GlobalAccountBalancesGetSpec = new BSDMInteractionSpec("GlobalAccountBalancesGet", ApiMappings.getCallName ("GlobalAccountBalancesGet"), Boolean.TRUE);

      _GlobalAccountBalancesFindSpec = new BSDMInteractionSpec("GlobalAccountBalancesFind", ApiMappings.getCallName ("GlobalAccountBalancesFind"), Boolean.TRUE);

      _GlobalAccountBalancesUpdateSpec = new BSDMInteractionSpec("GlobalAccountBalancesUpdate", ApiMappings.getCallName ("GlobalAccountBalancesUpdate"), Boolean.TRUE);

      _GlobalAccountBalancesDeleteSpec = new BSDMInteractionSpec("GlobalAccountBalancesDelete", ApiMappings.getCallName ("GlobalAccountBalancesDelete"), Boolean.TRUE);

      _GlobalAccountBalancesCreateSpec = new BSDMInteractionSpec("GlobalAccountBalancesCreate", ApiMappings.getCallName ("GlobalAccountBalancesCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public GlobalAccountBalancesBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public GlobalAccountBalancesBean(BSDMSettings settings, BSDMConnectionManager cm)
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
