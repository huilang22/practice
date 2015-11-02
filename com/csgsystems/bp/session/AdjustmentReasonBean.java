
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: AdjustmentReasonBean.java
 * Definition File: Admin/AdjustmentReason.xml
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
import com.csgsystems.bp.interfaces.AdjustmentReasonInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="AdjustmentReasonSessionBean"
 * display-name="AdjustmentReason Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/AdjustmentReasonBean"
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

@Stateless(name="AdjustmentReasonBean", mappedName = "AdjustmentReason")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("AdjustmentReasons")

public class AdjustmentReasonBean implements AdjustmentReasonInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _AdjustmentReasonGetSpec = null;
  /**
   * Get a unique AdjustmentReason..
   * Convenience method using default BSDMSessionContext.
   * @param ARGetIn Input Object Key.
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AdjustmentReasonObjectData get (AdjustmentReasonObjectKeyData ARGetIn) throws BSDMResourceException
  {
    return get (null, ARGetIn);
  }
  /**
   * Get a unique AdjustmentReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param ARGetIn Input Object Key.
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public AdjustmentReasonObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam AdjustmentReasonObjectKeyData ARGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AdjustmentReasonGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ARGetIn != null) AdjustmentReasonObjectKeyHelper.toMap (ARGetIn, record, "AdjustmentReason");
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
return AdjustmentReasonObjectHelper.fromMap (record, "AdjustmentReason");
}

  private BSDMInteractionSpec _AdjustmentReasonFindSpec = null;
  /**
   * Find AdjustmentReason's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ARFindIn Input Filter Object.
   * @return AdjustmentReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AdjustmentReasonObjectDataList find (AdjustmentReasonObjectFilter ARFindIn) throws BSDMResourceException
  {
    return find (null, ARFindIn);
  }
  /**
   * Find AdjustmentReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ARFindIn Input Filter Object.
   * @return AdjustmentReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AdjustmentReasonObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,AdjustmentReasonObjectFilter ARFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AdjustmentReasonFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ARFindIn != null) AdjustmentReasonObjectHelper.toMap (ARFindIn, record, "AdjustmentReason");
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
return AdjustmentReasonObjectHelper.fromMapList (record, "AdjustmentReasonList");
}

  private BSDMInteractionSpec _AdjustmentReasonUpdateSpec = null;
  /**
   * Update non-key fields of an AdjustmentReason object..
   * Convenience method using default BSDMSessionContext.
   * @param ARUpdateIn Input  Object.
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AdjustmentReasonObjectData update (AdjustmentReasonObjectData ARUpdateIn) throws BSDMResourceException
  {
    return update (null, ARUpdateIn);
  }
  /**
   * Update non-key fields of an AdjustmentReason object..
   * @param context The session context to use when connecting to the APITS server.
   * @param ARUpdateIn Input  Object.
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AdjustmentReasonObjectData update (@HeaderParam ("context")BSDMSessionContext context,AdjustmentReasonObjectData ARUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AdjustmentReasonUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ARUpdateIn != null) AdjustmentReasonObjectHelper.toMap (ARUpdateIn, record, "AdjustmentReason");
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
return AdjustmentReasonObjectHelper.fromMap (record, "AdjustmentReason");
}

  private BSDMInteractionSpec _AdjustmentReasonDeleteSpec = null;
  /**
   * Delete an AdjustmentReason..
   * Convenience method using default BSDMSessionContext.
   * @param ARDeleteIn Input Object Key.
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AdjustmentReasonObjectData delete (AdjustmentReasonObjectKeyData ARDeleteIn) throws BSDMResourceException
  {
    return delete (null, ARDeleteIn);
  }
  /**
   * Delete an AdjustmentReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param ARDeleteIn Input Object Key.
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AdjustmentReasonObjectData delete (@HeaderParam ("context")BSDMSessionContext context,AdjustmentReasonObjectKeyData ARDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AdjustmentReasonDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ARDeleteIn != null) AdjustmentReasonObjectKeyHelper.toMap (ARDeleteIn, record, "AdjustmentReason");
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
return AdjustmentReasonObjectHelper.fromMap (record, "AdjustmentReason");
}

  private BSDMInteractionSpec _AdjustmentReasonCreateSpec = null;
  /**
   * Create an AdjustmentReason..
   * Convenience method using default BSDMSessionContext.
   * @param ARCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AdjustmentReasonObjectData create (AdjustmentReasonObjectData ARCreateIn) throws BSDMResourceException
  {
    return create (null, ARCreateIn);
  }
  /**
   * Create an AdjustmentReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param ARCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AdjustmentReasonObjectData create (@HeaderParam ("context")BSDMSessionContext context,AdjustmentReasonObjectData ARCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AdjustmentReasonCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ARCreateIn != null) AdjustmentReasonObjectHelper.toMap (ARCreateIn, record, "AdjustmentReason");
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
return AdjustmentReasonObjectHelper.fromMap (record, "AdjustmentReason");
}

  /**

   * Get a unique AdjustmentReason..

   * Convenience method using default BSDMSessionContext.

   * @param ARGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AdjustmentReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AdjustmentReasonObjectData get (AdjustmentReasonObjectKeyData ARGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, ARGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique AdjustmentReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param ARGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AdjustmentReasonObjectData get (BSDMSessionContext context, AdjustmentReasonObjectKeyData ARGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ARGetIn, defaultAction);
       
     cManager.checkConstraints(ARGetIn, constraintAction);
       return get (context, ARGetIn);
  }

  /**

   * Find AdjustmentReason's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param ARFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AdjustmentReasonObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AdjustmentReasonObjectDataList find (AdjustmentReasonObjectFilter ARFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, ARFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find AdjustmentReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ARFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AdjustmentReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AdjustmentReasonObjectDataList find (BSDMSessionContext context, AdjustmentReasonObjectFilter ARFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ARFindIn, defaultAction);
       
     cManager.checkConstraints(ARFindIn, constraintAction);
       return find (context, ARFindIn);
  }

  /**

   * Update non-key fields of an AdjustmentReason object..

   * Convenience method using default BSDMSessionContext.

   * @param ARUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AdjustmentReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AdjustmentReasonObjectData update (AdjustmentReasonObjectData ARUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, ARUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of an AdjustmentReason object..
   * @param context The session context to use when connecting to the APITS server.
   * @param ARUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AdjustmentReasonObjectData update (BSDMSessionContext context, AdjustmentReasonObjectData ARUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ARUpdateIn, defaultAction);
       
     cManager.checkConstraints(ARUpdateIn, constraintAction);
       return update (context, ARUpdateIn);
  }

  /**

   * Delete an AdjustmentReason..

   * Convenience method using default BSDMSessionContext.

   * @param ARDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AdjustmentReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AdjustmentReasonObjectData delete (AdjustmentReasonObjectKeyData ARDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, ARDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete an AdjustmentReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param ARDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AdjustmentReasonObjectData delete (BSDMSessionContext context, AdjustmentReasonObjectKeyData ARDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ARDeleteIn, defaultAction);
       
     cManager.checkConstraints(ARDeleteIn, constraintAction);
       return delete (context, ARDeleteIn);
  }

  /**

   * Create an AdjustmentReason..

   * Convenience method using default BSDMSessionContext.

   * @param ARCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AdjustmentReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AdjustmentReasonObjectData create (AdjustmentReasonObjectData ARCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, ARCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create an AdjustmentReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param ARCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AdjustmentReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AdjustmentReasonObjectData create (BSDMSessionContext context, AdjustmentReasonObjectData ARCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ARCreateIn, defaultAction);
       
     cManager.checkConstraints(ARCreateIn, constraintAction);
       return create (context, ARCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public AdjustmentReasonBean ()
  {
    try
    {
      _AdjustmentReasonGetSpec = new BSDMInteractionSpec("AdjustmentReasonGet", ApiMappings.getCallName ("AdjustmentReasonGet"), Boolean.TRUE);

      _AdjustmentReasonFindSpec = new BSDMInteractionSpec("AdjustmentReasonFind", ApiMappings.getCallName ("AdjustmentReasonFind"), Boolean.TRUE);

      _AdjustmentReasonUpdateSpec = new BSDMInteractionSpec("AdjustmentReasonUpdate", ApiMappings.getCallName ("AdjustmentReasonUpdate"), Boolean.TRUE);

      _AdjustmentReasonDeleteSpec = new BSDMInteractionSpec("AdjustmentReasonDelete", ApiMappings.getCallName ("AdjustmentReasonDelete"), Boolean.TRUE);

      _AdjustmentReasonCreateSpec = new BSDMInteractionSpec("AdjustmentReasonCreate", ApiMappings.getCallName ("AdjustmentReasonCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public AdjustmentReasonBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public AdjustmentReasonBean(BSDMSettings settings, BSDMConnectionManager cm)
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
