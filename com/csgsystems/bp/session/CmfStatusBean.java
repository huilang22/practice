
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: CmfStatusBean.java
 * Definition File: Admin/CmfStatus.xml
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
import com.csgsystems.bp.interfaces.CmfStatusInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="CmfStatusSessionBean"
 * display-name="CmfStatus Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/CmfStatusBean"
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

@Stateless(name="CmfStatusBean", mappedName = "CmfStatus")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("CmfStatus")

public class CmfStatusBean implements CmfStatusInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _CmfStatusGetSpec = null;
  /**
   * Get a CmfStatus row..
   * Convenience method using default BSDMSessionContext.
   * @param CSGetIn Input Object Key.
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CmfStatusObjectData get (CmfStatusObjectKeyData CSGetIn) throws BSDMResourceException
  {
    return get (null, CSGetIn);
  }
  /**
   * Get a CmfStatus row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSGetIn Input Object Key.
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public CmfStatusObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam CmfStatusObjectKeyData CSGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfStatusGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CSGetIn != null) CmfStatusObjectKeyHelper.toMap (CSGetIn, record, "CmfStatus");
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
return CmfStatusObjectHelper.fromMap (record, "CmfStatus");
}

  private BSDMInteractionSpec _CmfStatusFindSpec = null;
  /**
   * Find CmfStatus' that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CSFindIn Input Filter Object.
   * @return CmfStatusObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CmfStatusObjectDataList find (CmfStatusObjectFilter CSFindIn) throws BSDMResourceException
  {
    return find (null, CSFindIn);
  }
  /**
   * Find CmfStatus' that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSFindIn Input Filter Object.
   * @return CmfStatusObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CmfStatusObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,CmfStatusObjectFilter CSFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfStatusFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CSFindIn != null) CmfStatusObjectHelper.toMap (CSFindIn, record, "CmfStatus");
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
return CmfStatusObjectHelper.fromMapList (record, "CmfStatusList");
}

  private BSDMInteractionSpec _CmfStatusUpdateSpec = null;
  /**
   * Update non-key fields of a CmfStatus row..
   * Convenience method using default BSDMSessionContext.
   * @param CSUpdateIn Input  Object.
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CmfStatusObjectData update (CmfStatusObjectData CSUpdateIn) throws BSDMResourceException
  {
    return update (null, CSUpdateIn);
  }
  /**
   * Update non-key fields of a CmfStatus row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSUpdateIn Input  Object.
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CmfStatusObjectData update (@HeaderParam ("context")BSDMSessionContext context,CmfStatusObjectData CSUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfStatusUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CSUpdateIn != null) CmfStatusObjectHelper.toMap (CSUpdateIn, record, "CmfStatus");
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
return CmfStatusObjectHelper.fromMap (record, "CmfStatus");
}

  private BSDMInteractionSpec _CmfStatusDeleteSpec = null;
  /**
   * Delete a CmfStatus row..
   * Convenience method using default BSDMSessionContext.
   * @param CSDeleteIn Input Object Key.
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CmfStatusObjectData delete (CmfStatusObjectKeyData CSDeleteIn) throws BSDMResourceException
  {
    return delete (null, CSDeleteIn);
  }
  /**
   * Delete a CmfStatus row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSDeleteIn Input Object Key.
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CmfStatusObjectData delete (@HeaderParam ("context")BSDMSessionContext context,CmfStatusObjectKeyData CSDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfStatusDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CSDeleteIn != null) CmfStatusObjectKeyHelper.toMap (CSDeleteIn, record, "CmfStatus");
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
return CmfStatusObjectHelper.fromMap (record, "CmfStatus");
}

  private BSDMInteractionSpec _CmfStatusCreateSpec = null;
  /**
   * Create a CmfStatus..
   * Convenience method using default BSDMSessionContext.
   * @param CSCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CmfStatusObjectData create (CmfStatusObjectData CSCreateIn) throws BSDMResourceException
  {
    return create (null, CSCreateIn);
  }
  /**
   * Create a CmfStatus..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CmfStatusObjectData create (@HeaderParam ("context")BSDMSessionContext context,CmfStatusObjectData CSCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfStatusCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CSCreateIn != null) CmfStatusObjectHelper.toMap (CSCreateIn, record, "CmfStatus");
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
return CmfStatusObjectHelper.fromMap (record, "CmfStatus");
}

  /**

   * Get a CmfStatus row..

   * Convenience method using default BSDMSessionContext.

   * @param CSGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CmfStatusObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CmfStatusObjectData get (CmfStatusObjectKeyData CSGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, CSGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a CmfStatus row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CmfStatusObjectData get (BSDMSessionContext context, CmfStatusObjectKeyData CSGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CSGetIn, defaultAction);
       
     cManager.checkConstraints(CSGetIn, constraintAction);
       return get (context, CSGetIn);
  }

  /**

   * Find CmfStatus' that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param CSFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CmfStatusObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CmfStatusObjectDataList find (CmfStatusObjectFilter CSFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, CSFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find CmfStatus' that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CmfStatusObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CmfStatusObjectDataList find (BSDMSessionContext context, CmfStatusObjectFilter CSFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CSFindIn, defaultAction);
       
     cManager.checkConstraints(CSFindIn, constraintAction);
       return find (context, CSFindIn);
  }

  /**

   * Update non-key fields of a CmfStatus row..

   * Convenience method using default BSDMSessionContext.

   * @param CSUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CmfStatusObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CmfStatusObjectData update (CmfStatusObjectData CSUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, CSUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a CmfStatus row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CmfStatusObjectData update (BSDMSessionContext context, CmfStatusObjectData CSUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CSUpdateIn, defaultAction);
       
     cManager.checkConstraints(CSUpdateIn, constraintAction);
       return update (context, CSUpdateIn);
  }

  /**

   * Delete a CmfStatus row..

   * Convenience method using default BSDMSessionContext.

   * @param CSDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CmfStatusObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CmfStatusObjectData delete (CmfStatusObjectKeyData CSDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, CSDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a CmfStatus row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CmfStatusObjectData delete (BSDMSessionContext context, CmfStatusObjectKeyData CSDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CSDeleteIn, defaultAction);
       
     cManager.checkConstraints(CSDeleteIn, constraintAction);
       return delete (context, CSDeleteIn);
  }

  /**

   * Create a CmfStatus..

   * Convenience method using default BSDMSessionContext.

   * @param CSCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CmfStatusObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CmfStatusObjectData create (CmfStatusObjectData CSCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, CSCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a CmfStatus..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CmfStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CmfStatusObjectData create (BSDMSessionContext context, CmfStatusObjectData CSCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CSCreateIn, defaultAction);
       
     cManager.checkConstraints(CSCreateIn, constraintAction);
       return create (context, CSCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public CmfStatusBean ()
  {
    try
    {
      _CmfStatusGetSpec = new BSDMInteractionSpec("CmfStatusGet", ApiMappings.getCallName ("CmfStatusGet"), Boolean.TRUE);

      _CmfStatusFindSpec = new BSDMInteractionSpec("CmfStatusFind", ApiMappings.getCallName ("CmfStatusFind"), Boolean.TRUE);

      _CmfStatusUpdateSpec = new BSDMInteractionSpec("CmfStatusUpdate", ApiMappings.getCallName ("CmfStatusUpdate"), Boolean.TRUE);

      _CmfStatusDeleteSpec = new BSDMInteractionSpec("CmfStatusDelete", ApiMappings.getCallName ("CmfStatusDelete"), Boolean.TRUE);

      _CmfStatusCreateSpec = new BSDMInteractionSpec("CmfStatusCreate", ApiMappings.getCallName ("CmfStatusCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public CmfStatusBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public CmfStatusBean(BSDMSettings settings, BSDMConnectionManager cm)
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
