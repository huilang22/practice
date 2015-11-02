
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: TransSourceTypeBean.java
 * Definition File: Admin/TransSourceType.xml
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
import com.csgsystems.bp.interfaces.TransSourceTypeInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="TransSourceTypeSessionBean"
 * display-name="TransSourceType Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/TransSourceTypeBean"
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

@Stateless(name="TransSourceTypeBean", mappedName = "TransSourceType")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("TransSourceTypes")

public class TransSourceTypeBean implements TransSourceTypeInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _TransSourceTypeGetSpec = null;
  /**
   * Get a unique TransSourceType..
   * Convenience method using default BSDMSessionContext.
   * @param TSGetIn Input Object Key.
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TransSourceTypeObjectData get (TransSourceTypeObjectKeyData TSGetIn) throws BSDMResourceException
  {
    return get (null, TSGetIn);
  }
  /**
   * Get a unique TransSourceType..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSGetIn Input Object Key.
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public TransSourceTypeObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam TransSourceTypeObjectKeyData TSGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TransSourceTypeGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (TSGetIn != null) TransSourceTypeObjectKeyHelper.toMap (TSGetIn, record, "TransSourceType");
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
return TransSourceTypeObjectHelper.fromMap (record, "TransSourceType");
}

  private BSDMInteractionSpec _TransSourceTypeFindSpec = null;
  /**
   * Find TransSourceType's that match a supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TSFindIn Input Filter Object.
   * @return TransSourceTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TransSourceTypeObjectDataList find (TransSourceTypeObjectFilter TSFindIn) throws BSDMResourceException
  {
    return find (null, TSFindIn);
  }
  /**
   * Find TransSourceType's that match a supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSFindIn Input Filter Object.
   * @return TransSourceTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public TransSourceTypeObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,TransSourceTypeObjectFilter TSFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TransSourceTypeFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (TSFindIn != null) TransSourceTypeObjectHelper.toMap (TSFindIn, record, "TransSourceType");
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
return TransSourceTypeObjectHelper.fromMapList (record, "TransSourceTypeList");
}

  private BSDMInteractionSpec _TransSourceTypeUpdateSpec = null;
  /**
   * Update the non key fields of a TransSourceType..
   * Convenience method using default BSDMSessionContext.
   * @param TSUpdateIn Input  Object.
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TransSourceTypeObjectData update (TransSourceTypeObjectData TSUpdateIn) throws BSDMResourceException
  {
    return update (null, TSUpdateIn);
  }
  /**
   * Update the non key fields of a TransSourceType..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSUpdateIn Input  Object.
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public TransSourceTypeObjectData update (@HeaderParam ("context")BSDMSessionContext context,TransSourceTypeObjectData TSUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TransSourceTypeUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (TSUpdateIn != null) TransSourceTypeObjectHelper.toMap (TSUpdateIn, record, "TransSourceType");
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
return TransSourceTypeObjectHelper.fromMap (record, "TransSourceType");
}

  private BSDMInteractionSpec _TransSourceTypeDeleteSpec = null;
  /**
   * Delete a TransSourceType..
   * Convenience method using default BSDMSessionContext.
   * @param TSDeleteIn Input Object Key.
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TransSourceTypeObjectData delete (TransSourceTypeObjectKeyData TSDeleteIn) throws BSDMResourceException
  {
    return delete (null, TSDeleteIn);
  }
  /**
   * Delete a TransSourceType..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSDeleteIn Input Object Key.
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public TransSourceTypeObjectData delete (@HeaderParam ("context")BSDMSessionContext context,TransSourceTypeObjectKeyData TSDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TransSourceTypeDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (TSDeleteIn != null) TransSourceTypeObjectKeyHelper.toMap (TSDeleteIn, record, "TransSourceType");
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
return TransSourceTypeObjectHelper.fromMap (record, "TransSourceType");
}

  private BSDMInteractionSpec _TransSourceTypeCreateSpec = null;
  /**
   * Create a new TransSourceType..
   * Convenience method using default BSDMSessionContext.
   * @param TSCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TransSourceTypeObjectData create (TransSourceTypeObjectData TSCreateIn) throws BSDMResourceException
  {
    return create (null, TSCreateIn);
  }
  /**
   * Create a new TransSourceType..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public TransSourceTypeObjectData create (@HeaderParam ("context")BSDMSessionContext context,TransSourceTypeObjectData TSCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TransSourceTypeCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (TSCreateIn != null) TransSourceTypeObjectHelper.toMap (TSCreateIn, record, "TransSourceType");
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
return TransSourceTypeObjectHelper.fromMap (record, "TransSourceType");
}

  /**

   * Get a unique TransSourceType..

   * Convenience method using default BSDMSessionContext.

   * @param TSGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TransSourceTypeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TransSourceTypeObjectData get (TransSourceTypeObjectKeyData TSGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, TSGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique TransSourceType..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TransSourceTypeObjectData get (BSDMSessionContext context, TransSourceTypeObjectKeyData TSGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(TSGetIn, defaultAction);
       
     cManager.checkConstraints(TSGetIn, constraintAction);
       return get (context, TSGetIn);
  }

  /**

   * Find TransSourceType's that match a supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param TSFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TransSourceTypeObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TransSourceTypeObjectDataList find (TransSourceTypeObjectFilter TSFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, TSFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find TransSourceType's that match a supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TransSourceTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TransSourceTypeObjectDataList find (BSDMSessionContext context, TransSourceTypeObjectFilter TSFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(TSFindIn, defaultAction);
       
     cManager.checkConstraints(TSFindIn, constraintAction);
       return find (context, TSFindIn);
  }

  /**

   * Update the non key fields of a TransSourceType..

   * Convenience method using default BSDMSessionContext.

   * @param TSUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TransSourceTypeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TransSourceTypeObjectData update (TransSourceTypeObjectData TSUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, TSUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non key fields of a TransSourceType..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TransSourceTypeObjectData update (BSDMSessionContext context, TransSourceTypeObjectData TSUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(TSUpdateIn, defaultAction);
       
     cManager.checkConstraints(TSUpdateIn, constraintAction);
       return update (context, TSUpdateIn);
  }

  /**

   * Delete a TransSourceType..

   * Convenience method using default BSDMSessionContext.

   * @param TSDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TransSourceTypeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TransSourceTypeObjectData delete (TransSourceTypeObjectKeyData TSDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, TSDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a TransSourceType..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TransSourceTypeObjectData delete (BSDMSessionContext context, TransSourceTypeObjectKeyData TSDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(TSDeleteIn, defaultAction);
       
     cManager.checkConstraints(TSDeleteIn, constraintAction);
       return delete (context, TSDeleteIn);
  }

  /**

   * Create a new TransSourceType..

   * Convenience method using default BSDMSessionContext.

   * @param TSCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TransSourceTypeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TransSourceTypeObjectData create (TransSourceTypeObjectData TSCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, TSCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new TransSourceType..
   * @param context The session context to use when connecting to the APITS server.
   * @param TSCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TransSourceTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TransSourceTypeObjectData create (BSDMSessionContext context, TransSourceTypeObjectData TSCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(TSCreateIn, defaultAction);
       
     cManager.checkConstraints(TSCreateIn, constraintAction);
       return create (context, TSCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public TransSourceTypeBean ()
  {
    try
    {
      _TransSourceTypeGetSpec = new BSDMInteractionSpec("TransSourceTypeGet", ApiMappings.getCallName ("TransSourceTypeGet"), Boolean.TRUE);

      _TransSourceTypeFindSpec = new BSDMInteractionSpec("TransSourceTypeFind", ApiMappings.getCallName ("TransSourceTypeFind"), Boolean.TRUE);

      _TransSourceTypeUpdateSpec = new BSDMInteractionSpec("TransSourceTypeUpdate", ApiMappings.getCallName ("TransSourceTypeUpdate"), Boolean.TRUE);

      _TransSourceTypeDeleteSpec = new BSDMInteractionSpec("TransSourceTypeDelete", ApiMappings.getCallName ("TransSourceTypeDelete"), Boolean.TRUE);

      _TransSourceTypeCreateSpec = new BSDMInteractionSpec("TransSourceTypeCreate", ApiMappings.getCallName ("TransSourceTypeCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public TransSourceTypeBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public TransSourceTypeBean(BSDMSettings settings, BSDMConnectionManager cm)
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
