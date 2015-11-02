
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: AbiAutoPayCmfMapBean.java
 * Definition File: Customer/AbiAutoPayCmfMap.xml
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
import com.csgsystems.bp.interfaces.AbiAutoPayCmfMapInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="AbiAutoPayCmfMapSessionBean"
 * display-name="AbiAutoPayCmfMap Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/AbiAutoPayCmfMapBean"
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

@Stateless(name="AbiAutoPayCmfMapBean", mappedName = "AbiAutoPayCmfMap")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("AbiAutoPayCmfMaps")

public class AbiAutoPayCmfMapBean implements AbiAutoPayCmfMapInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _AbiAutoPayCmfMapGetSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiAutoPayCmfMapGetIn Input Object Key.
   * @return AbiAutoPayCmfMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AbiAutoPayCmfMapObjectData get (AbiAutoPayCmfMapObjectKeyData AbiAutoPayCmfMapGetIn) throws BSDMResourceException
  {
    return get (null, AbiAutoPayCmfMapGetIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiAutoPayCmfMapGetIn Input Object Key.
   * @return AbiAutoPayCmfMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public AbiAutoPayCmfMapObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam AbiAutoPayCmfMapObjectKeyData AbiAutoPayCmfMapGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AbiAutoPayCmfMapGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AbiAutoPayCmfMapGetIn != null) AbiAutoPayCmfMapObjectKeyHelper.toMap (AbiAutoPayCmfMapGetIn, record, "AbiAutoPayCmfMap");
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
return AbiAutoPayCmfMapObjectHelper.fromMap (record, "AbiAutoPayCmfMap");
}

  private BSDMInteractionSpec _AbiAutoPayCmfMapFindSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiAutoPayCmfMapFindIn Input Filter Object.
   * @return AbiAutoPayCmfMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AbiAutoPayCmfMapObjectDataList find (AbiAutoPayCmfMapObjectFilter AbiAutoPayCmfMapFindIn) throws BSDMResourceException
  {
    return find (null, AbiAutoPayCmfMapFindIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiAutoPayCmfMapFindIn Input Filter Object.
   * @return AbiAutoPayCmfMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AbiAutoPayCmfMapObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,AbiAutoPayCmfMapObjectFilter AbiAutoPayCmfMapFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AbiAutoPayCmfMapFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AbiAutoPayCmfMapFindIn != null) AbiAutoPayCmfMapObjectHelper.toMap (AbiAutoPayCmfMapFindIn, record, "AbiAutoPayCmfMap");
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
return AbiAutoPayCmfMapObjectHelper.fromMapList (record, "AbiAutoPayCmfMapList");
}

  private BSDMInteractionSpec _AbiAutoPayCmfMapUpdateSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiAutoPayCmfMapUpdateIn Input  Object.
   * @return AbiAutoPayCmfMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AbiAutoPayCmfMapObjectData update (AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapUpdateIn) throws BSDMResourceException
  {
    return update (null, AbiAutoPayCmfMapUpdateIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiAutoPayCmfMapUpdateIn Input  Object.
   * @return AbiAutoPayCmfMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AbiAutoPayCmfMapObjectData update (@HeaderParam ("context")BSDMSessionContext context,AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AbiAutoPayCmfMapUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AbiAutoPayCmfMapUpdateIn != null) AbiAutoPayCmfMapObjectHelper.toMap (AbiAutoPayCmfMapUpdateIn, record, "AbiAutoPayCmfMap");
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
return AbiAutoPayCmfMapObjectHelper.fromMap (record, "AbiAutoPayCmfMap");
}

  private BSDMInteractionSpec _AbiAutoPayCmfMapCreateSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param AbiAutoPayCmfMapCreateIn Input  Object.
   * @return AbiAutoPayCmfMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AbiAutoPayCmfMapObjectData create (AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapCreateIn) throws BSDMResourceException
  {
    return create (null, AbiAutoPayCmfMapCreateIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiAutoPayCmfMapCreateIn Input  Object.
   * @return AbiAutoPayCmfMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AbiAutoPayCmfMapObjectData create (@HeaderParam ("context")BSDMSessionContext context,AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AbiAutoPayCmfMapCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AbiAutoPayCmfMapCreateIn != null) AbiAutoPayCmfMapObjectHelper.toMap (AbiAutoPayCmfMapCreateIn, record, "AbiAutoPayCmfMap");
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
return AbiAutoPayCmfMapObjectHelper.fromMap (record, "AbiAutoPayCmfMap");
}

  /**

   * Convenience method using default BSDMSessionContext.

   * @param AbiAutoPayCmfMapGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AbiAutoPayCmfMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AbiAutoPayCmfMapObjectData get (AbiAutoPayCmfMapObjectKeyData AbiAutoPayCmfMapGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, AbiAutoPayCmfMapGetIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiAutoPayCmfMapGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AbiAutoPayCmfMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AbiAutoPayCmfMapObjectData get (BSDMSessionContext context, AbiAutoPayCmfMapObjectKeyData AbiAutoPayCmfMapGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AbiAutoPayCmfMapGetIn, defaultAction);
       
     cManager.checkConstraints(AbiAutoPayCmfMapGetIn, constraintAction);
       return get (context, AbiAutoPayCmfMapGetIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param AbiAutoPayCmfMapFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AbiAutoPayCmfMapObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AbiAutoPayCmfMapObjectDataList find (AbiAutoPayCmfMapObjectFilter AbiAutoPayCmfMapFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, AbiAutoPayCmfMapFindIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiAutoPayCmfMapFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AbiAutoPayCmfMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AbiAutoPayCmfMapObjectDataList find (BSDMSessionContext context, AbiAutoPayCmfMapObjectFilter AbiAutoPayCmfMapFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AbiAutoPayCmfMapFindIn, defaultAction);
       
     cManager.checkConstraints(AbiAutoPayCmfMapFindIn, constraintAction);
       return find (context, AbiAutoPayCmfMapFindIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param AbiAutoPayCmfMapUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AbiAutoPayCmfMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AbiAutoPayCmfMapObjectData update (AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, AbiAutoPayCmfMapUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiAutoPayCmfMapUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AbiAutoPayCmfMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AbiAutoPayCmfMapObjectData update (BSDMSessionContext context, AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AbiAutoPayCmfMapUpdateIn, defaultAction);
       
     cManager.checkConstraints(AbiAutoPayCmfMapUpdateIn, constraintAction);
       return update (context, AbiAutoPayCmfMapUpdateIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param AbiAutoPayCmfMapCreateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AbiAutoPayCmfMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AbiAutoPayCmfMapObjectData create (AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, AbiAutoPayCmfMapCreateIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param AbiAutoPayCmfMapCreateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AbiAutoPayCmfMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AbiAutoPayCmfMapObjectData create (BSDMSessionContext context, AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AbiAutoPayCmfMapCreateIn, defaultAction);
       
     cManager.checkConstraints(AbiAutoPayCmfMapCreateIn, constraintAction);
       return create (context, AbiAutoPayCmfMapCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public AbiAutoPayCmfMapBean ()
  {
    try
    {
      _AbiAutoPayCmfMapGetSpec = new BSDMInteractionSpec("AbiAutoPayCmfMapGet", ApiMappings.getCallName ("AbiAutoPayCmfMapGet"), Boolean.TRUE);

      _AbiAutoPayCmfMapFindSpec = new BSDMInteractionSpec("AbiAutoPayCmfMapFind", ApiMappings.getCallName ("AbiAutoPayCmfMapFind"), Boolean.TRUE);

      _AbiAutoPayCmfMapUpdateSpec = new BSDMInteractionSpec("AbiAutoPayCmfMapUpdate", ApiMappings.getCallName ("AbiAutoPayCmfMapUpdate"), Boolean.TRUE);

      _AbiAutoPayCmfMapCreateSpec = new BSDMInteractionSpec("AbiAutoPayCmfMapCreate", ApiMappings.getCallName ("AbiAutoPayCmfMapCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public AbiAutoPayCmfMapBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public AbiAutoPayCmfMapBean(BSDMSettings settings, BSDMConnectionManager cm)
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
