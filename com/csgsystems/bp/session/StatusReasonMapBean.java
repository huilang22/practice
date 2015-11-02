
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: StatusReasonMapBean.java
 * Definition File: Admin/StatusReasonMap.xml
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
import com.csgsystems.bp.interfaces.StatusReasonMapInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="StatusReasonMapSessionBean"
 * display-name="StatusReasonMap Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/StatusReasonMapBean"
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

@Stateless(name="StatusReasonMapBean", mappedName = "StatusReasonMap")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("StatusReasonMaps")

public class StatusReasonMapBean implements StatusReasonMapInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _StatusReasonMapGetSpec = null;
  /**
   * Get a unique StatusReasonMap row..
   * Convenience method using default BSDMSessionContext.
   * @param SRMGetIn Input Object Key.
   * @return SRMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public SRMObjectData get (SRMObjectKeyData SRMGetIn) throws BSDMResourceException
  {
    return get (null, SRMGetIn);
  }
  /**
   * Get a unique StatusReasonMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SRMGetIn Input Object Key.
   * @return SRMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public SRMObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam SRMObjectKeyData SRMGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_StatusReasonMapGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SRMGetIn != null) SRMObjectKeyHelper.toMap (SRMGetIn, record, "StatusReasonMap");
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
return SRMObjectHelper.fromMap (record, "StatusReasonMap");
}

  private BSDMInteractionSpec _StatusReasonMapFindSpec = null;
  /**
   * Find StatusReasonMap rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SRMFindIn Input Filter Object.
   * @return SRMObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public SRMObjectDataList find (SRMObjectFilter SRMFindIn) throws BSDMResourceException
  {
    return find (null, SRMFindIn);
  }
  /**
   * Find StatusReasonMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SRMFindIn Input Filter Object.
   * @return SRMObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public SRMObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,SRMObjectFilter SRMFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_StatusReasonMapFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SRMFindIn != null) SRMObjectHelper.toMap (SRMFindIn, record, "StatusReasonMap");
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
return SRMObjectHelper.fromMapList (record, "StatusReasonMapList");
}

  private BSDMInteractionSpec _StatusReasonMapCreateSpec = null;
  /**
   * Create a new StatusReasonMap row..
   * Convenience method using default BSDMSessionContext.
   * @param SRMCreateIn Input  Object.  Defaulted Fields: LanguageCode.
   * @return SRMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public SRMObjectData create (SRMObjectData SRMCreateIn) throws BSDMResourceException
  {
    return create (null, SRMCreateIn);
  }
  /**
   * Create a new StatusReasonMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SRMCreateIn Input  Object.  Defaulted Fields: LanguageCode.
   * @return SRMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public SRMObjectData create (@HeaderParam ("context")BSDMSessionContext context,SRMObjectData SRMCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_StatusReasonMapCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SRMCreateIn != null) SRMObjectHelper.toMap (SRMCreateIn, record, "StatusReasonMap");
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
return SRMObjectHelper.fromMap (record, "StatusReasonMap");
}

  /**

   * Get a unique StatusReasonMap row..

   * Convenience method using default BSDMSessionContext.

   * @param SRMGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return SRMObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public SRMObjectData get (SRMObjectKeyData SRMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, SRMGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique StatusReasonMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SRMGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return SRMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public SRMObjectData get (BSDMSessionContext context, SRMObjectKeyData SRMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SRMGetIn, defaultAction);
       
     cManager.checkConstraints(SRMGetIn, constraintAction);
       return get (context, SRMGetIn);
  }

  /**

   * Find StatusReasonMap rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param SRMFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return SRMObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public SRMObjectDataList find (SRMObjectFilter SRMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, SRMFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find StatusReasonMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SRMFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return SRMObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public SRMObjectDataList find (BSDMSessionContext context, SRMObjectFilter SRMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SRMFindIn, defaultAction);
       
     cManager.checkConstraints(SRMFindIn, constraintAction);
       return find (context, SRMFindIn);
  }

  /**

   * Create a new StatusReasonMap row..

   * Convenience method using default BSDMSessionContext.

   * @param SRMCreateIn Input  Object.  Defaulted Fields: LanguageCode.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return SRMObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public SRMObjectData create (SRMObjectData SRMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, SRMCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new StatusReasonMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param SRMCreateIn Input  Object.  Defaulted Fields: LanguageCode.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return SRMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public SRMObjectData create (BSDMSessionContext context, SRMObjectData SRMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SRMCreateIn, defaultAction);
       
     cManager.checkConstraints(SRMCreateIn, constraintAction);
       return create (context, SRMCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public StatusReasonMapBean ()
  {
    try
    {
      _StatusReasonMapGetSpec = new BSDMInteractionSpec("StatusReasonMapGet", ApiMappings.getCallName ("StatusReasonMapGet"), Boolean.TRUE);

      _StatusReasonMapFindSpec = new BSDMInteractionSpec("StatusReasonMapFind", ApiMappings.getCallName ("StatusReasonMapFind"), Boolean.TRUE);

      _StatusReasonMapCreateSpec = new BSDMInteractionSpec("StatusReasonMapCreate", ApiMappings.getCallName ("StatusReasonMapCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public StatusReasonMapBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public StatusReasonMapBean(BSDMSettings settings, BSDMConnectionManager cm)
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
