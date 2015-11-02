
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: TransferReasonBean.java
 * Definition File: Admin/TransferReason.xml
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
import com.csgsystems.bp.interfaces.TransferReasonInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="TransferReasonSessionBean"
 * display-name="TransferReason Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/TransferReasonBean"
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

@Stateless(name="TransferReasonBean", mappedName = "TransferReason")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("TransferReasons")

public class TransferReasonBean implements TransferReasonInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _TransferReasonGetSpec = null;
  /**
   * Get a unique TransferReason..
   * Convenience method using default BSDMSessionContext.
   * @param XRGetIn Input Object Key.
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TransferReasonObjectData get (TransferReasonObjectKeyData XRGetIn) throws BSDMResourceException
  {
    return get (null, XRGetIn);
  }
  /**
   * Get a unique TransferReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param XRGetIn Input Object Key.
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public TransferReasonObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam TransferReasonObjectKeyData XRGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TransferReasonGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (XRGetIn != null) TransferReasonObjectKeyHelper.toMap (XRGetIn, record, "TransferReason");
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
return TransferReasonObjectHelper.fromMap (record, "TransferReason");
}

  private BSDMInteractionSpec _TransferReasonFindSpec = null;
  /**
   * Find TransferReason's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param XRFindIn Input Filter Object.
   * @return TransferReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TransferReasonObjectDataList find (TransferReasonObjectFilter XRFindIn) throws BSDMResourceException
  {
    return find (null, XRFindIn);
  }
  /**
   * Find TransferReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param XRFindIn Input Filter Object.
   * @return TransferReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public TransferReasonObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,TransferReasonObjectFilter XRFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TransferReasonFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (XRFindIn != null) TransferReasonObjectHelper.toMap (XRFindIn, record, "TransferReason");
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
return TransferReasonObjectHelper.fromMapList (record, "TransferReasonList");
}

  private BSDMInteractionSpec _TransferReasonUpdateSpec = null;
  /**
   * Update non key fields of a TransferReason..
   * Convenience method using default BSDMSessionContext.
   * @param XRUpdateIn Input  Object.
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TransferReasonObjectData update (TransferReasonObjectData XRUpdateIn) throws BSDMResourceException
  {
    return update (null, XRUpdateIn);
  }
  /**
   * Update non key fields of a TransferReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param XRUpdateIn Input  Object.
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public TransferReasonObjectData update (@HeaderParam ("context")BSDMSessionContext context,TransferReasonObjectData XRUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TransferReasonUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (XRUpdateIn != null) TransferReasonObjectHelper.toMap (XRUpdateIn, record, "TransferReason");
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
return TransferReasonObjectHelper.fromMap (record, "TransferReason");
}

  private BSDMInteractionSpec _TransferReasonDeleteSpec = null;
  /**
   * Delete a TransferReason..
   * Convenience method using default BSDMSessionContext.
   * @param XRDeleteIn Input Object Key.
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TransferReasonObjectData delete (TransferReasonObjectKeyData XRDeleteIn) throws BSDMResourceException
  {
    return delete (null, XRDeleteIn);
  }
  /**
   * Delete a TransferReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param XRDeleteIn Input Object Key.
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public TransferReasonObjectData delete (@HeaderParam ("context")BSDMSessionContext context,TransferReasonObjectKeyData XRDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TransferReasonDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (XRDeleteIn != null) TransferReasonObjectKeyHelper.toMap (XRDeleteIn, record, "TransferReason");
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
return TransferReasonObjectHelper.fromMap (record, "TransferReason");
}

  private BSDMInteractionSpec _TransferReasonCreateSpec = null;
  /**
   * Create a new TransferReason..
   * Convenience method using default BSDMSessionContext.
   * @param XRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TransferReasonObjectData create (TransferReasonObjectData XRCreateIn) throws BSDMResourceException
  {
    return create (null, XRCreateIn);
  }
  /**
   * Create a new TransferReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param XRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public TransferReasonObjectData create (@HeaderParam ("context")BSDMSessionContext context,TransferReasonObjectData XRCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TransferReasonCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (XRCreateIn != null) TransferReasonObjectHelper.toMap (XRCreateIn, record, "TransferReason");
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
return TransferReasonObjectHelper.fromMap (record, "TransferReason");
}

  /**

   * Get a unique TransferReason..

   * Convenience method using default BSDMSessionContext.

   * @param XRGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TransferReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TransferReasonObjectData get (TransferReasonObjectKeyData XRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, XRGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique TransferReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param XRGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TransferReasonObjectData get (BSDMSessionContext context, TransferReasonObjectKeyData XRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(XRGetIn, defaultAction);
       
     cManager.checkConstraints(XRGetIn, constraintAction);
       return get (context, XRGetIn);
  }

  /**

   * Find TransferReason's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param XRFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TransferReasonObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TransferReasonObjectDataList find (TransferReasonObjectFilter XRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, XRFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find TransferReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param XRFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TransferReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TransferReasonObjectDataList find (BSDMSessionContext context, TransferReasonObjectFilter XRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(XRFindIn, defaultAction);
       
     cManager.checkConstraints(XRFindIn, constraintAction);
       return find (context, XRFindIn);
  }

  /**

   * Update non key fields of a TransferReason..

   * Convenience method using default BSDMSessionContext.

   * @param XRUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TransferReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TransferReasonObjectData update (TransferReasonObjectData XRUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, XRUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non key fields of a TransferReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param XRUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TransferReasonObjectData update (BSDMSessionContext context, TransferReasonObjectData XRUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(XRUpdateIn, defaultAction);
       
     cManager.checkConstraints(XRUpdateIn, constraintAction);
       return update (context, XRUpdateIn);
  }

  /**

   * Delete a TransferReason..

   * Convenience method using default BSDMSessionContext.

   * @param XRDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TransferReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TransferReasonObjectData delete (TransferReasonObjectKeyData XRDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, XRDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a TransferReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param XRDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TransferReasonObjectData delete (BSDMSessionContext context, TransferReasonObjectKeyData XRDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(XRDeleteIn, defaultAction);
       
     cManager.checkConstraints(XRDeleteIn, constraintAction);
       return delete (context, XRDeleteIn);
  }

  /**

   * Create a new TransferReason..

   * Convenience method using default BSDMSessionContext.

   * @param XRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TransferReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TransferReasonObjectData create (TransferReasonObjectData XRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, XRCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new TransferReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param XRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TransferReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TransferReasonObjectData create (BSDMSessionContext context, TransferReasonObjectData XRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(XRCreateIn, defaultAction);
       
     cManager.checkConstraints(XRCreateIn, constraintAction);
       return create (context, XRCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public TransferReasonBean ()
  {
    try
    {
      _TransferReasonGetSpec = new BSDMInteractionSpec("TransferReasonGet", ApiMappings.getCallName ("TransferReasonGet"), Boolean.TRUE);

      _TransferReasonFindSpec = new BSDMInteractionSpec("TransferReasonFind", ApiMappings.getCallName ("TransferReasonFind"), Boolean.TRUE);

      _TransferReasonUpdateSpec = new BSDMInteractionSpec("TransferReasonUpdate", ApiMappings.getCallName ("TransferReasonUpdate"), Boolean.TRUE);

      _TransferReasonDeleteSpec = new BSDMInteractionSpec("TransferReasonDelete", ApiMappings.getCallName ("TransferReasonDelete"), Boolean.TRUE);

      _TransferReasonCreateSpec = new BSDMInteractionSpec("TransferReasonCreate", ApiMappings.getCallName ("TransferReasonCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public TransferReasonBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public TransferReasonBean(BSDMSettings settings, BSDMConnectionManager cm)
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
