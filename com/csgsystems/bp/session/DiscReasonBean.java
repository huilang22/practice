
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: DiscReasonBean.java
 * Definition File: Admin/DiscReason.xml
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
import com.csgsystems.bp.interfaces.DiscReasonInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="DiscReasonSessionBean"
 * display-name="DiscReason Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/DiscReasonBean"
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

@Stateless(name="DiscReasonBean", mappedName = "DiscReason")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("DiscReasons")

public class DiscReasonBean implements DiscReasonInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _DiscReasonGetSpec = null;
  /**
   * Get the DiscReason for the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param DRGetIn Input Object Key.
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public DiscReasonObjectData get (DiscReasonObjectKeyData DRGetIn) throws BSDMResourceException
  {
    return get (null, DRGetIn);
  }
  /**
   * Get the DiscReason for the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param DRGetIn Input Object Key.
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public DiscReasonObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam DiscReasonObjectKeyData DRGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_DiscReasonGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (DRGetIn != null) DiscReasonObjectKeyHelper.toMap (DRGetIn, record, "DiscReason");
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
return DiscReasonObjectHelper.fromMap (record, "DiscReason");
}

  private BSDMInteractionSpec _DiscReasonFindSpec = null;
  /**
   * Find DiscReason's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param DRFindIn Input Filter Object.
   * @return DiscReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public DiscReasonObjectDataList find (DiscReasonObjectFilter DRFindIn) throws BSDMResourceException
  {
    return find (null, DRFindIn);
  }
  /**
   * Find DiscReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param DRFindIn Input Filter Object.
   * @return DiscReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public DiscReasonObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,DiscReasonObjectFilter DRFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_DiscReasonFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (DRFindIn != null) DiscReasonObjectHelper.toMap (DRFindIn, record, "DiscReason");
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
return DiscReasonObjectHelper.fromMapList (record, "DiscReasonList");
}

  private BSDMInteractionSpec _DiscReasonUpdateSpec = null;
  /**
   * Update non-key fields for this DiscReason row..
   * Convenience method using default BSDMSessionContext.
   * @param DRUpdateIn Input  Object.
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public DiscReasonObjectData update (DiscReasonObjectData DRUpdateIn) throws BSDMResourceException
  {
    return update (null, DRUpdateIn);
  }
  /**
   * Update non-key fields for this DiscReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param DRUpdateIn Input  Object.
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public DiscReasonObjectData update (@HeaderParam ("context")BSDMSessionContext context,DiscReasonObjectData DRUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_DiscReasonUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (DRUpdateIn != null) DiscReasonObjectHelper.toMap (DRUpdateIn, record, "DiscReason");
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
return DiscReasonObjectHelper.fromMap (record, "DiscReason");
}

  private BSDMInteractionSpec _DiscReasonDeleteSpec = null;
  /**
   * Delete the DiscReason row..
   * Convenience method using default BSDMSessionContext.
   * @param DRDeleteIn Input Object Key.
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public DiscReasonObjectData delete (DiscReasonObjectKeyData DRDeleteIn) throws BSDMResourceException
  {
    return delete (null, DRDeleteIn);
  }
  /**
   * Delete the DiscReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param DRDeleteIn Input Object Key.
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public DiscReasonObjectData delete (@HeaderParam ("context")BSDMSessionContext context,DiscReasonObjectKeyData DRDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_DiscReasonDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (DRDeleteIn != null) DiscReasonObjectKeyHelper.toMap (DRDeleteIn, record, "DiscReason");
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
return DiscReasonObjectHelper.fromMap (record, "DiscReason");
}

  private BSDMInteractionSpec _DiscReasonCreateSpec = null;
  /**
   * Create a new DiscReason row..
   * Convenience method using default BSDMSessionContext.
   * @param DRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public DiscReasonObjectData create (DiscReasonObjectData DRCreateIn) throws BSDMResourceException
  {
    return create (null, DRCreateIn);
  }
  /**
   * Create a new DiscReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param DRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public DiscReasonObjectData create (@HeaderParam ("context")BSDMSessionContext context,DiscReasonObjectData DRCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_DiscReasonCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (DRCreateIn != null) DiscReasonObjectHelper.toMap (DRCreateIn, record, "DiscReason");
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
return DiscReasonObjectHelper.fromMap (record, "DiscReason");
}

  /**

   * Get the DiscReason for the supplied key..

   * Convenience method using default BSDMSessionContext.

   * @param DRGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return DiscReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public DiscReasonObjectData get (DiscReasonObjectKeyData DRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, DRGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get the DiscReason for the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param DRGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public DiscReasonObjectData get (BSDMSessionContext context, DiscReasonObjectKeyData DRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(DRGetIn, defaultAction);
       
     cManager.checkConstraints(DRGetIn, constraintAction);
       return get (context, DRGetIn);
  }

  /**

   * Find DiscReason's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param DRFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return DiscReasonObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public DiscReasonObjectDataList find (DiscReasonObjectFilter DRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, DRFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find DiscReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param DRFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return DiscReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public DiscReasonObjectDataList find (BSDMSessionContext context, DiscReasonObjectFilter DRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(DRFindIn, defaultAction);
       
     cManager.checkConstraints(DRFindIn, constraintAction);
       return find (context, DRFindIn);
  }

  /**

   * Update non-key fields for this DiscReason row..

   * Convenience method using default BSDMSessionContext.

   * @param DRUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return DiscReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public DiscReasonObjectData update (DiscReasonObjectData DRUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, DRUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields for this DiscReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param DRUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public DiscReasonObjectData update (BSDMSessionContext context, DiscReasonObjectData DRUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(DRUpdateIn, defaultAction);
       
     cManager.checkConstraints(DRUpdateIn, constraintAction);
       return update (context, DRUpdateIn);
  }

  /**

   * Delete the DiscReason row..

   * Convenience method using default BSDMSessionContext.

   * @param DRDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return DiscReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public DiscReasonObjectData delete (DiscReasonObjectKeyData DRDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, DRDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete the DiscReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param DRDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public DiscReasonObjectData delete (BSDMSessionContext context, DiscReasonObjectKeyData DRDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(DRDeleteIn, defaultAction);
       
     cManager.checkConstraints(DRDeleteIn, constraintAction);
       return delete (context, DRDeleteIn);
  }

  /**

   * Create a new DiscReason row..

   * Convenience method using default BSDMSessionContext.

   * @param DRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return DiscReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public DiscReasonObjectData create (DiscReasonObjectData DRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, DRCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new DiscReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param DRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return DiscReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public DiscReasonObjectData create (BSDMSessionContext context, DiscReasonObjectData DRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(DRCreateIn, defaultAction);
       
     cManager.checkConstraints(DRCreateIn, constraintAction);
       return create (context, DRCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public DiscReasonBean ()
  {
    try
    {
      _DiscReasonGetSpec = new BSDMInteractionSpec("DiscReasonGet", ApiMappings.getCallName ("DiscReasonGet"), Boolean.TRUE);

      _DiscReasonFindSpec = new BSDMInteractionSpec("DiscReasonFind", ApiMappings.getCallName ("DiscReasonFind"), Boolean.TRUE);

      _DiscReasonUpdateSpec = new BSDMInteractionSpec("DiscReasonUpdate", ApiMappings.getCallName ("DiscReasonUpdate"), Boolean.TRUE);

      _DiscReasonDeleteSpec = new BSDMInteractionSpec("DiscReasonDelete", ApiMappings.getCallName ("DiscReasonDelete"), Boolean.TRUE);

      _DiscReasonCreateSpec = new BSDMInteractionSpec("DiscReasonCreate", ApiMappings.getCallName ("DiscReasonCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public DiscReasonBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public DiscReasonBean(BSDMSettings settings, BSDMConnectionManager cm)
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
