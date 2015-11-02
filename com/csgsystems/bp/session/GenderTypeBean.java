
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: GenderTypeBean.java
 * Definition File: Admin/GenderType.xml
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
import com.csgsystems.bp.interfaces.GenderTypeInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="GenderTypeSessionBean"
 * display-name="GenderType Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/GenderTypeBean"
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

@Stateless(name="GenderTypeBean", mappedName = "GenderType")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("GenderTypes")

public class GenderTypeBean implements GenderTypeInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _GenderTypeGetSpec = null;
  /**
   * Get a unique GenderType row..
   * Convenience method using default BSDMSessionContext.
   * @param GGetIn Input Object Key.
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GenderTypeObjectData get (GenderTypeObjectKeyData GGetIn) throws BSDMResourceException
  {
    return get (null, GGetIn);
  }
  /**
   * Get a unique GenderType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GGetIn Input Object Key.
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public GenderTypeObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam GenderTypeObjectKeyData GGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GenderTypeGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GGetIn != null) GenderTypeObjectKeyHelper.toMap (GGetIn, record, "GenderType");
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
return GenderTypeObjectHelper.fromMap (record, "GenderType");
}

  private BSDMInteractionSpec _GenderTypeFindSpec = null;
  /**
   * Find GenderType rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GFindIn Input Filter Object.
   * @return GenderTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GenderTypeObjectDataList find (GenderTypeObjectFilter GFindIn) throws BSDMResourceException
  {
    return find (null, GFindIn);
  }
  /**
   * Find GenderType rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFindIn Input Filter Object.
   * @return GenderTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GenderTypeObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,GenderTypeObjectFilter GFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GenderTypeFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GFindIn != null) GenderTypeObjectHelper.toMap (GFindIn, record, "GenderType");
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
return GenderTypeObjectHelper.fromMapList (record, "GenderTypeList");
}

  private BSDMInteractionSpec _GenderTypeUpdateSpec = null;
  /**
   * Update non-key fields of a GenderType row..
   * Convenience method using default BSDMSessionContext.
   * @param GUpdateIn Input  Object.
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GenderTypeObjectData update (GenderTypeObjectData GUpdateIn) throws BSDMResourceException
  {
    return update (null, GUpdateIn);
  }
  /**
   * Update non-key fields of a GenderType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GUpdateIn Input  Object.
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GenderTypeObjectData update (@HeaderParam ("context")BSDMSessionContext context,GenderTypeObjectData GUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GenderTypeUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GUpdateIn != null) GenderTypeObjectHelper.toMap (GUpdateIn, record, "GenderType");
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
return GenderTypeObjectHelper.fromMap (record, "GenderType");
}

  private BSDMInteractionSpec _GenderTypeDeleteSpec = null;
  /**
   * Delete a unique GenderType row..
   * Convenience method using default BSDMSessionContext.
   * @param GDeleteIn Input Object Key.
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GenderTypeObjectData delete (GenderTypeObjectKeyData GDeleteIn) throws BSDMResourceException
  {
    return delete (null, GDeleteIn);
  }
  /**
   * Delete a unique GenderType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GDeleteIn Input Object Key.
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GenderTypeObjectData delete (@HeaderParam ("context")BSDMSessionContext context,GenderTypeObjectKeyData GDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GenderTypeDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GDeleteIn != null) GenderTypeObjectKeyHelper.toMap (GDeleteIn, record, "GenderType");
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
return GenderTypeObjectHelper.fromMap (record, "GenderType");
}

  private BSDMInteractionSpec _GenderTypeCreateSpec = null;
  /**
   * Create a new GenderType row..
   * Convenience method using default BSDMSessionContext.
   * @param GCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GenderTypeObjectData create (GenderTypeObjectData GCreateIn) throws BSDMResourceException
  {
    return create (null, GCreateIn);
  }
  /**
   * Create a new GenderType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GenderTypeObjectData create (@HeaderParam ("context")BSDMSessionContext context,GenderTypeObjectData GCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GenderTypeCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GCreateIn != null) GenderTypeObjectHelper.toMap (GCreateIn, record, "GenderType");
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
return GenderTypeObjectHelper.fromMap (record, "GenderType");
}

  /**

   * Get a unique GenderType row..

   * Convenience method using default BSDMSessionContext.

   * @param GGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GenderTypeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GenderTypeObjectData get (GenderTypeObjectKeyData GGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, GGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique GenderType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GenderTypeObjectData get (BSDMSessionContext context, GenderTypeObjectKeyData GGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GGetIn, defaultAction);
       
     cManager.checkConstraints(GGetIn, constraintAction);
       return get (context, GGetIn);
  }

  /**

   * Find GenderType rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param GFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GenderTypeObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GenderTypeObjectDataList find (GenderTypeObjectFilter GFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, GFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find GenderType rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GenderTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GenderTypeObjectDataList find (BSDMSessionContext context, GenderTypeObjectFilter GFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GFindIn, defaultAction);
       
     cManager.checkConstraints(GFindIn, constraintAction);
       return find (context, GFindIn);
  }

  /**

   * Update non-key fields of a GenderType row..

   * Convenience method using default BSDMSessionContext.

   * @param GUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GenderTypeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GenderTypeObjectData update (GenderTypeObjectData GUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, GUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a GenderType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GenderTypeObjectData update (BSDMSessionContext context, GenderTypeObjectData GUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GUpdateIn, defaultAction);
       
     cManager.checkConstraints(GUpdateIn, constraintAction);
       return update (context, GUpdateIn);
  }

  /**

   * Delete a unique GenderType row..

   * Convenience method using default BSDMSessionContext.

   * @param GDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GenderTypeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GenderTypeObjectData delete (GenderTypeObjectKeyData GDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, GDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a unique GenderType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GenderTypeObjectData delete (BSDMSessionContext context, GenderTypeObjectKeyData GDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GDeleteIn, defaultAction);
       
     cManager.checkConstraints(GDeleteIn, constraintAction);
       return delete (context, GDeleteIn);
  }

  /**

   * Create a new GenderType row..

   * Convenience method using default BSDMSessionContext.

   * @param GCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GenderTypeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GenderTypeObjectData create (GenderTypeObjectData GCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, GCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new GenderType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GenderTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GenderTypeObjectData create (BSDMSessionContext context, GenderTypeObjectData GCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GCreateIn, defaultAction);
       
     cManager.checkConstraints(GCreateIn, constraintAction);
       return create (context, GCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public GenderTypeBean ()
  {
    try
    {
      _GenderTypeGetSpec = new BSDMInteractionSpec("GenderTypeGet", ApiMappings.getCallName ("GenderTypeGet"), Boolean.TRUE);

      _GenderTypeFindSpec = new BSDMInteractionSpec("GenderTypeFind", ApiMappings.getCallName ("GenderTypeFind"), Boolean.TRUE);

      _GenderTypeUpdateSpec = new BSDMInteractionSpec("GenderTypeUpdate", ApiMappings.getCallName ("GenderTypeUpdate"), Boolean.TRUE);

      _GenderTypeDeleteSpec = new BSDMInteractionSpec("GenderTypeDelete", ApiMappings.getCallName ("GenderTypeDelete"), Boolean.TRUE);

      _GenderTypeCreateSpec = new BSDMInteractionSpec("GenderTypeCreate", ApiMappings.getCallName ("GenderTypeCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public GenderTypeBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public GenderTypeBean(BSDMSettings settings, BSDMConnectionManager cm)
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
