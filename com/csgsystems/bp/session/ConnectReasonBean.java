
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: ConnectReasonBean.java
 * Definition File: Admin/ConnectReason.xml
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
import com.csgsystems.bp.interfaces.ConnectReasonInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="ConnectReasonSessionBean"
 * display-name="ConnectReason Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/ConnectReasonBean"
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

@Stateless(name="ConnectReasonBean", mappedName = "ConnectReason")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("ConnectReasons")

public class ConnectReasonBean implements ConnectReasonInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _ConnectReasonGetSpec = null;
  /**
   * Get a ConnectReason Object..
   * Convenience method using default BSDMSessionContext.
   * @param CRGetIn Input Object Key.
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ConnectReasonObjectData get (ConnectReasonObjectKeyData CRGetIn) throws BSDMResourceException
  {
    return get (null, CRGetIn);
  }
  /**
   * Get a ConnectReason Object..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRGetIn Input Object Key.
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public ConnectReasonObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam ConnectReasonObjectKeyData CRGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ConnectReasonGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CRGetIn != null) ConnectReasonObjectKeyHelper.toMap (CRGetIn, record, "ConnectReason");
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
return ConnectReasonObjectHelper.fromMap (record, "ConnectReason");
}

  private BSDMInteractionSpec _ConnectReasonFindSpec = null;
  /**
   * Find ConnectReason's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CRFindIn Input Filter Object.
   * @return ConnectReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ConnectReasonObjectDataList find (ConnectReasonObjectFilter CRFindIn) throws BSDMResourceException
  {
    return find (null, CRFindIn);
  }
  /**
   * Find ConnectReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRFindIn Input Filter Object.
   * @return ConnectReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ConnectReasonObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,ConnectReasonObjectFilter CRFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ConnectReasonFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CRFindIn != null) ConnectReasonObjectHelper.toMap (CRFindIn, record, "ConnectReason");
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
return ConnectReasonObjectHelper.fromMapList (record, "ConnectReasonList");
}

  private BSDMInteractionSpec _ConnectReasonUpdateSpec = null;
  /**
   * Update non-key fields for a ConnectReason row..
   * Convenience method using default BSDMSessionContext.
   * @param CRUpdateIn Input  Object.
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ConnectReasonObjectData update (ConnectReasonObjectData CRUpdateIn) throws BSDMResourceException
  {
    return update (null, CRUpdateIn);
  }
  /**
   * Update non-key fields for a ConnectReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRUpdateIn Input  Object.
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ConnectReasonObjectData update (@HeaderParam ("context")BSDMSessionContext context,ConnectReasonObjectData CRUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ConnectReasonUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CRUpdateIn != null) ConnectReasonObjectHelper.toMap (CRUpdateIn, record, "ConnectReason");
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
return ConnectReasonObjectHelper.fromMap (record, "ConnectReason");
}

  private BSDMInteractionSpec _ConnectReasonDeleteSpec = null;
  /**
   * Delete a ConnectReason row..
   * Convenience method using default BSDMSessionContext.
   * @param CRDeleteIn Input Object Key.
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ConnectReasonObjectData delete (ConnectReasonObjectKeyData CRDeleteIn) throws BSDMResourceException
  {
    return delete (null, CRDeleteIn);
  }
  /**
   * Delete a ConnectReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRDeleteIn Input Object Key.
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ConnectReasonObjectData delete (@HeaderParam ("context")BSDMSessionContext context,ConnectReasonObjectKeyData CRDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ConnectReasonDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CRDeleteIn != null) ConnectReasonObjectKeyHelper.toMap (CRDeleteIn, record, "ConnectReason");
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
return ConnectReasonObjectHelper.fromMap (record, "ConnectReason");
}

  private BSDMInteractionSpec _ConnectReasonCreateSpec = null;
  /**
   * Create a new ConnectReason..
   * Convenience method using default BSDMSessionContext.
   * @param CRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ConnectReasonObjectData create (ConnectReasonObjectData CRCreateIn) throws BSDMResourceException
  {
    return create (null, CRCreateIn);
  }
  /**
   * Create a new ConnectReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ConnectReasonObjectData create (@HeaderParam ("context")BSDMSessionContext context,ConnectReasonObjectData CRCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ConnectReasonCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CRCreateIn != null) ConnectReasonObjectHelper.toMap (CRCreateIn, record, "ConnectReason");
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
return ConnectReasonObjectHelper.fromMap (record, "ConnectReason");
}

  /**

   * Get a ConnectReason Object..

   * Convenience method using default BSDMSessionContext.

   * @param CRGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ConnectReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ConnectReasonObjectData get (ConnectReasonObjectKeyData CRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, CRGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a ConnectReason Object..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ConnectReasonObjectData get (BSDMSessionContext context, ConnectReasonObjectKeyData CRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CRGetIn, defaultAction);
       
     cManager.checkConstraints(CRGetIn, constraintAction);
       return get (context, CRGetIn);
  }

  /**

   * Find ConnectReason's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param CRFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ConnectReasonObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ConnectReasonObjectDataList find (ConnectReasonObjectFilter CRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, CRFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find ConnectReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ConnectReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ConnectReasonObjectDataList find (BSDMSessionContext context, ConnectReasonObjectFilter CRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CRFindIn, defaultAction);
       
     cManager.checkConstraints(CRFindIn, constraintAction);
       return find (context, CRFindIn);
  }

  /**

   * Update non-key fields for a ConnectReason row..

   * Convenience method using default BSDMSessionContext.

   * @param CRUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ConnectReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ConnectReasonObjectData update (ConnectReasonObjectData CRUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, CRUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields for a ConnectReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ConnectReasonObjectData update (BSDMSessionContext context, ConnectReasonObjectData CRUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CRUpdateIn, defaultAction);
       
     cManager.checkConstraints(CRUpdateIn, constraintAction);
       return update (context, CRUpdateIn);
  }

  /**

   * Delete a ConnectReason row..

   * Convenience method using default BSDMSessionContext.

   * @param CRDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ConnectReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ConnectReasonObjectData delete (ConnectReasonObjectKeyData CRDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, CRDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a ConnectReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ConnectReasonObjectData delete (BSDMSessionContext context, ConnectReasonObjectKeyData CRDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CRDeleteIn, defaultAction);
       
     cManager.checkConstraints(CRDeleteIn, constraintAction);
       return delete (context, CRDeleteIn);
  }

  /**

   * Create a new ConnectReason..

   * Convenience method using default BSDMSessionContext.

   * @param CRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ConnectReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ConnectReasonObjectData create (ConnectReasonObjectData CRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, CRCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new ConnectReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ConnectReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ConnectReasonObjectData create (BSDMSessionContext context, ConnectReasonObjectData CRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CRCreateIn, defaultAction);
       
     cManager.checkConstraints(CRCreateIn, constraintAction);
       return create (context, CRCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public ConnectReasonBean ()
  {
    try
    {
      _ConnectReasonGetSpec = new BSDMInteractionSpec("ConnectReasonGet", ApiMappings.getCallName ("ConnectReasonGet"), Boolean.TRUE);

      _ConnectReasonFindSpec = new BSDMInteractionSpec("ConnectReasonFind", ApiMappings.getCallName ("ConnectReasonFind"), Boolean.TRUE);

      _ConnectReasonUpdateSpec = new BSDMInteractionSpec("ConnectReasonUpdate", ApiMappings.getCallName ("ConnectReasonUpdate"), Boolean.TRUE);

      _ConnectReasonDeleteSpec = new BSDMInteractionSpec("ConnectReasonDelete", ApiMappings.getCallName ("ConnectReasonDelete"), Boolean.TRUE);

      _ConnectReasonCreateSpec = new BSDMInteractionSpec("ConnectReasonCreate", ApiMappings.getCallName ("ConnectReasonCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public ConnectReasonBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public ConnectReasonBean(BSDMSettings settings, BSDMConnectionManager cm)
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
