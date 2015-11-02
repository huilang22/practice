
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: RefundReasonBean.java
 * Definition File: Admin/RefundReason.xml
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
import com.csgsystems.bp.interfaces.RefundReasonInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="RefundReasonSessionBean"
 * display-name="RefundReason Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/RefundReasonBean"
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

@Stateless(name="RefundReasonBean", mappedName = "RefundReason")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("RefundReasons")

public class RefundReasonBean implements RefundReasonInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _RefundReasonGetSpec = null;
  /**
   * Get a unique RefundReason..
   * Convenience method using default BSDMSessionContext.
   * @param RRGetIn Input Object Key.
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RefundReasonObjectData get (RefundReasonObjectKeyData RRGetIn) throws BSDMResourceException
  {
    return get (null, RRGetIn);
  }
  /**
   * Get a unique RefundReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRGetIn Input Object Key.
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public RefundReasonObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam RefundReasonObjectKeyData RRGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RefundReasonGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RRGetIn != null) RefundReasonObjectKeyHelper.toMap (RRGetIn, record, "RefundReason");
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
return RefundReasonObjectHelper.fromMap (record, "RefundReason");
}

  private BSDMInteractionSpec _RefundReasonFindSpec = null;
  /**
   * Find RefundReason's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RRFindIn Input Filter Object.
   * @return RefundReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RefundReasonObjectDataList find (RefundReasonObjectFilter RRFindIn) throws BSDMResourceException
  {
    return find (null, RRFindIn);
  }
  /**
   * Find RefundReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRFindIn Input Filter Object.
   * @return RefundReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RefundReasonObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,RefundReasonObjectFilter RRFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RefundReasonFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RRFindIn != null) RefundReasonObjectHelper.toMap (RRFindIn, record, "RefundReason");
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
return RefundReasonObjectHelper.fromMapList (record, "RefundReasonList");
}

  private BSDMInteractionSpec _RefundReasonUpdateSpec = null;
  /**
   * Update the non-key fields of a RefundReason row..
   * Convenience method using default BSDMSessionContext.
   * @param RRUpdateIn Input  Object.
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RefundReasonObjectData update (RefundReasonObjectData RRUpdateIn) throws BSDMResourceException
  {
    return update (null, RRUpdateIn);
  }
  /**
   * Update the non-key fields of a RefundReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRUpdateIn Input  Object.
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RefundReasonObjectData update (@HeaderParam ("context")BSDMSessionContext context,RefundReasonObjectData RRUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RefundReasonUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RRUpdateIn != null) RefundReasonObjectHelper.toMap (RRUpdateIn, record, "RefundReason");
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
return RefundReasonObjectHelper.fromMap (record, "RefundReason");
}

  private BSDMInteractionSpec _RefundReasonDeleteSpec = null;
  /**
   * Delete a RefundReason row..
   * Convenience method using default BSDMSessionContext.
   * @param RRDeleteIn Input Object Key.
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RefundReasonObjectData delete (RefundReasonObjectKeyData RRDeleteIn) throws BSDMResourceException
  {
    return delete (null, RRDeleteIn);
  }
  /**
   * Delete a RefundReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRDeleteIn Input Object Key.
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RefundReasonObjectData delete (@HeaderParam ("context")BSDMSessionContext context,RefundReasonObjectKeyData RRDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RefundReasonDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RRDeleteIn != null) RefundReasonObjectKeyHelper.toMap (RRDeleteIn, record, "RefundReason");
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
return RefundReasonObjectHelper.fromMap (record, "RefundReason");
}

  private BSDMInteractionSpec _RefundReasonCreateSpec = null;
  /**
   * Create a new RefundReason..
   * Convenience method using default BSDMSessionContext.
   * @param RRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RefundReasonObjectData create (RefundReasonObjectData RRCreateIn) throws BSDMResourceException
  {
    return create (null, RRCreateIn);
  }
  /**
   * Create a new RefundReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RefundReasonObjectData create (@HeaderParam ("context")BSDMSessionContext context,RefundReasonObjectData RRCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RefundReasonCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RRCreateIn != null) RefundReasonObjectHelper.toMap (RRCreateIn, record, "RefundReason");
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
return RefundReasonObjectHelper.fromMap (record, "RefundReason");
}

  /**

   * Get a unique RefundReason..

   * Convenience method using default BSDMSessionContext.

   * @param RRGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RefundReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RefundReasonObjectData get (RefundReasonObjectKeyData RRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, RRGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique RefundReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RefundReasonObjectData get (BSDMSessionContext context, RefundReasonObjectKeyData RRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RRGetIn, defaultAction);
       
     cManager.checkConstraints(RRGetIn, constraintAction);
       return get (context, RRGetIn);
  }

  /**

   * Find RefundReason's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param RRFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RefundReasonObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RefundReasonObjectDataList find (RefundReasonObjectFilter RRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, RRFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find RefundReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RefundReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RefundReasonObjectDataList find (BSDMSessionContext context, RefundReasonObjectFilter RRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RRFindIn, defaultAction);
       
     cManager.checkConstraints(RRFindIn, constraintAction);
       return find (context, RRFindIn);
  }

  /**

   * Update the non-key fields of a RefundReason row..

   * Convenience method using default BSDMSessionContext.

   * @param RRUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RefundReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RefundReasonObjectData update (RefundReasonObjectData RRUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, RRUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of a RefundReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RefundReasonObjectData update (BSDMSessionContext context, RefundReasonObjectData RRUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RRUpdateIn, defaultAction);
       
     cManager.checkConstraints(RRUpdateIn, constraintAction);
       return update (context, RRUpdateIn);
  }

  /**

   * Delete a RefundReason row..

   * Convenience method using default BSDMSessionContext.

   * @param RRDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RefundReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RefundReasonObjectData delete (RefundReasonObjectKeyData RRDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, RRDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a RefundReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RefundReasonObjectData delete (BSDMSessionContext context, RefundReasonObjectKeyData RRDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RRDeleteIn, defaultAction);
       
     cManager.checkConstraints(RRDeleteIn, constraintAction);
       return delete (context, RRDeleteIn);
  }

  /**

   * Create a new RefundReason..

   * Convenience method using default BSDMSessionContext.

   * @param RRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RefundReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RefundReasonObjectData create (RefundReasonObjectData RRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, RRCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new RefundReason..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RefundReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RefundReasonObjectData create (BSDMSessionContext context, RefundReasonObjectData RRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RRCreateIn, defaultAction);
       
     cManager.checkConstraints(RRCreateIn, constraintAction);
       return create (context, RRCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public RefundReasonBean ()
  {
    try
    {
      _RefundReasonGetSpec = new BSDMInteractionSpec("RefundReasonGet", ApiMappings.getCallName ("RefundReasonGet"), Boolean.TRUE);

      _RefundReasonFindSpec = new BSDMInteractionSpec("RefundReasonFind", ApiMappings.getCallName ("RefundReasonFind"), Boolean.TRUE);

      _RefundReasonUpdateSpec = new BSDMInteractionSpec("RefundReasonUpdate", ApiMappings.getCallName ("RefundReasonUpdate"), Boolean.TRUE);

      _RefundReasonDeleteSpec = new BSDMInteractionSpec("RefundReasonDelete", ApiMappings.getCallName ("RefundReasonDelete"), Boolean.TRUE);

      _RefundReasonCreateSpec = new BSDMInteractionSpec("RefundReasonCreate", ApiMappings.getCallName ("RefundReasonCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public RefundReasonBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public RefundReasonBean(BSDMSettings settings, BSDMConnectionManager cm)
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
