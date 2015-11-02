
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: DepositTypeBean.java
 * Definition File: Admin/DepositType.xml
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
import com.csgsystems.bp.interfaces.DepositTypeInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="DepositTypeSessionBean"
 * display-name="DepositType Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/DepositTypeBean"
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

@Stateless(name="DepositTypeBean", mappedName = "DepositType")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("DepositTypes")

public class DepositTypeBean implements DepositTypeInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _DepositTypeGetSpec = null;
  /**
   * Retrieve the DepositType for the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param DTGetIn Input Object Key.
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public DepositTypeObjectData get (DepositTypeObjectKeyData DTGetIn) throws BSDMResourceException
  {
    return get (null, DTGetIn);
  }
  /**
   * Retrieve the DepositType for the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param DTGetIn Input Object Key.
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public DepositTypeObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam DepositTypeObjectKeyData DTGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_DepositTypeGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (DTGetIn != null) DepositTypeObjectKeyHelper.toMap (DTGetIn, record, "DepositType");
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
return DepositTypeObjectHelper.fromMap (record, "DepositType");
}

  private BSDMInteractionSpec _DepositTypeFindSpec = null;
  /**
   * Find DepositType's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param DTFindIn Input Filter Object.
   * @return DepositTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public DepositTypeObjectDataList find (DepositTypeObjectFilter DTFindIn) throws BSDMResourceException
  {
    return find (null, DTFindIn);
  }
  /**
   * Find DepositType's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param DTFindIn Input Filter Object.
   * @return DepositTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public DepositTypeObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,DepositTypeObjectFilter DTFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_DepositTypeFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (DTFindIn != null) DepositTypeObjectHelper.toMap (DTFindIn, record, "DepositType");
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
return DepositTypeObjectHelper.fromMapList (record, "DepositTypeList");
}

  private BSDMInteractionSpec _DepositTypeUpdateSpec = null;
  /**
   * Update the non key fields for a DepositType row..
   * Convenience method using default BSDMSessionContext.
   * @param DTUpdateIn Input  Object.
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public DepositTypeObjectData update (DepositTypeObjectData DTUpdateIn) throws BSDMResourceException
  {
    return update (null, DTUpdateIn);
  }
  /**
   * Update the non key fields for a DepositType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param DTUpdateIn Input  Object.
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public DepositTypeObjectData update (@HeaderParam ("context")BSDMSessionContext context,DepositTypeObjectData DTUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_DepositTypeUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (DTUpdateIn != null) DepositTypeObjectHelper.toMap (DTUpdateIn, record, "DepositType");
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
return DepositTypeObjectHelper.fromMap (record, "DepositType");
}

  private BSDMInteractionSpec _DepositTypeDeleteSpec = null;
  /**
   * Delete this DepositType row..
   * Convenience method using default BSDMSessionContext.
   * @param DTDeleteIn Input Object Key.
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public DepositTypeObjectData delete (DepositTypeObjectKeyData DTDeleteIn) throws BSDMResourceException
  {
    return delete (null, DTDeleteIn);
  }
  /**
   * Delete this DepositType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param DTDeleteIn Input Object Key.
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public DepositTypeObjectData delete (@HeaderParam ("context")BSDMSessionContext context,DepositTypeObjectKeyData DTDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_DepositTypeDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (DTDeleteIn != null) DepositTypeObjectKeyHelper.toMap (DTDeleteIn, record, "DepositType");
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
return DepositTypeObjectHelper.fromMap (record, "DepositType");
}

  private BSDMInteractionSpec _DepositTypeCreateSpec = null;
  /**
   * Create a new DepositType..
   * Convenience method using default BSDMSessionContext.
   * @param DTCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public DepositTypeObjectData create (DepositTypeObjectData DTCreateIn) throws BSDMResourceException
  {
    return create (null, DTCreateIn);
  }
  /**
   * Create a new DepositType..
   * @param context The session context to use when connecting to the APITS server.
   * @param DTCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public DepositTypeObjectData create (@HeaderParam ("context")BSDMSessionContext context,DepositTypeObjectData DTCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_DepositTypeCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (DTCreateIn != null) DepositTypeObjectHelper.toMap (DTCreateIn, record, "DepositType");
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
return DepositTypeObjectHelper.fromMap (record, "DepositType");
}

  /**

   * Retrieve the DepositType for the supplied key..

   * Convenience method using default BSDMSessionContext.

   * @param DTGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return DepositTypeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public DepositTypeObjectData get (DepositTypeObjectKeyData DTGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, DTGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve the DepositType for the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param DTGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public DepositTypeObjectData get (BSDMSessionContext context, DepositTypeObjectKeyData DTGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(DTGetIn, defaultAction);
       
     cManager.checkConstraints(DTGetIn, constraintAction);
       return get (context, DTGetIn);
  }

  /**

   * Find DepositType's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param DTFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return DepositTypeObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public DepositTypeObjectDataList find (DepositTypeObjectFilter DTFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, DTFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find DepositType's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param DTFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return DepositTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public DepositTypeObjectDataList find (BSDMSessionContext context, DepositTypeObjectFilter DTFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(DTFindIn, defaultAction);
       
     cManager.checkConstraints(DTFindIn, constraintAction);
       return find (context, DTFindIn);
  }

  /**

   * Update the non key fields for a DepositType row..

   * Convenience method using default BSDMSessionContext.

   * @param DTUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return DepositTypeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public DepositTypeObjectData update (DepositTypeObjectData DTUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, DTUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non key fields for a DepositType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param DTUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public DepositTypeObjectData update (BSDMSessionContext context, DepositTypeObjectData DTUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(DTUpdateIn, defaultAction);
       
     cManager.checkConstraints(DTUpdateIn, constraintAction);
       return update (context, DTUpdateIn);
  }

  /**

   * Delete this DepositType row..

   * Convenience method using default BSDMSessionContext.

   * @param DTDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return DepositTypeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public DepositTypeObjectData delete (DepositTypeObjectKeyData DTDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, DTDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete this DepositType row..
   * @param context The session context to use when connecting to the APITS server.
   * @param DTDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public DepositTypeObjectData delete (BSDMSessionContext context, DepositTypeObjectKeyData DTDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(DTDeleteIn, defaultAction);
       
     cManager.checkConstraints(DTDeleteIn, constraintAction);
       return delete (context, DTDeleteIn);
  }

  /**

   * Create a new DepositType..

   * Convenience method using default BSDMSessionContext.

   * @param DTCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return DepositTypeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public DepositTypeObjectData create (DepositTypeObjectData DTCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, DTCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new DepositType..
   * @param context The session context to use when connecting to the APITS server.
   * @param DTCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return DepositTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public DepositTypeObjectData create (BSDMSessionContext context, DepositTypeObjectData DTCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(DTCreateIn, defaultAction);
       
     cManager.checkConstraints(DTCreateIn, constraintAction);
       return create (context, DTCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public DepositTypeBean ()
  {
    try
    {
      _DepositTypeGetSpec = new BSDMInteractionSpec("DepositTypeGet", ApiMappings.getCallName ("DepositTypeGet"), Boolean.TRUE);

      _DepositTypeFindSpec = new BSDMInteractionSpec("DepositTypeFind", ApiMappings.getCallName ("DepositTypeFind"), Boolean.TRUE);

      _DepositTypeUpdateSpec = new BSDMInteractionSpec("DepositTypeUpdate", ApiMappings.getCallName ("DepositTypeUpdate"), Boolean.TRUE);

      _DepositTypeDeleteSpec = new BSDMInteractionSpec("DepositTypeDelete", ApiMappings.getCallName ("DepositTypeDelete"), Boolean.TRUE);

      _DepositTypeCreateSpec = new BSDMInteractionSpec("DepositTypeCreate", ApiMappings.getCallName ("DepositTypeCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public DepositTypeBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public DepositTypeBean(BSDMSettings settings, BSDMConnectionManager cm)
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
