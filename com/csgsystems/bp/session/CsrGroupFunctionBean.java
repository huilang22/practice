
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: CsrGroupFunctionBean.java
 * Definition File: Admin/CsrGroupFunction.xml
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
import com.csgsystems.bp.interfaces.CsrGroupFunctionInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="CsrGroupFunctionSessionBean"
 * display-name="CsrGroupFunction Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/CsrGroupFunctionBean"
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

@Stateless(name="CsrGroupFunctionBean", mappedName = "CsrGroupFunction")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("CsrGroupFunctions")

public class CsrGroupFunctionBean implements CsrGroupFunctionInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _CsrGroupFunctionGetSpec = null;
  /**
   * Retrieve a unique CsrGroupFunction row..
   * Convenience method using default BSDMSessionContext.
   * @param GFGetIn Input Object Key.
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CsrGroupFunctionObjectData get (CsrGroupFunctionObjectKeyData GFGetIn) throws BSDMResourceException
  {
    return get (null, GFGetIn);
  }
  /**
   * Retrieve a unique CsrGroupFunction row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFGetIn Input Object Key.
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public CsrGroupFunctionObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam CsrGroupFunctionObjectKeyData GFGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CsrGroupFunctionGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GFGetIn != null) CsrGroupFunctionObjectKeyHelper.toMap (GFGetIn, record, "CsrGroupFunction");
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
return CsrGroupFunctionObjectHelper.fromMap (record, "CsrGroupFunction");
}

  private BSDMInteractionSpec _CsrGroupFunctionFindSpec = null;
  /**
   * Find CsrGroupFunction rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GFFindIn Input Filter Object.
   * @return CsrGroupFunctionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CsrGroupFunctionObjectDataList find (CsrGroupFunctionObjectFilter GFFindIn) throws BSDMResourceException
  {
    return find (null, GFFindIn);
  }
  /**
   * Find CsrGroupFunction rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFFindIn Input Filter Object.
   * @return CsrGroupFunctionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CsrGroupFunctionObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,CsrGroupFunctionObjectFilter GFFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CsrGroupFunctionFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GFFindIn != null) CsrGroupFunctionObjectHelper.toMap (GFFindIn, record, "CsrGroupFunction");
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
return CsrGroupFunctionObjectHelper.fromMapList (record, "CsrGroupFunctionList");
}

  private BSDMInteractionSpec _CsrGroupFunctionUpdateSpec = null;
  /**
   * Update non-key fields of a CsrGroupFunction..
   * Convenience method using default BSDMSessionContext.
   * @param GFUpdateIn Input  Object.
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CsrGroupFunctionObjectData update (CsrGroupFunctionObjectData GFUpdateIn) throws BSDMResourceException
  {
    return update (null, GFUpdateIn);
  }
  /**
   * Update non-key fields of a CsrGroupFunction..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFUpdateIn Input  Object.
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CsrGroupFunctionObjectData update (@HeaderParam ("context")BSDMSessionContext context,CsrGroupFunctionObjectData GFUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CsrGroupFunctionUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GFUpdateIn != null) CsrGroupFunctionObjectHelper.toMap (GFUpdateIn, record, "CsrGroupFunction");
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
return CsrGroupFunctionObjectHelper.fromMap (record, "CsrGroupFunction");
}

  private BSDMInteractionSpec _CsrGroupFunctionDeleteSpec = null;
  /**
   * Delete a CsrGroupFunction row..
   * Convenience method using default BSDMSessionContext.
   * @param GFDeleteIn Input Object Key.
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CsrGroupFunctionObjectData delete (CsrGroupFunctionObjectKeyData GFDeleteIn) throws BSDMResourceException
  {
    return delete (null, GFDeleteIn);
  }
  /**
   * Delete a CsrGroupFunction row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFDeleteIn Input Object Key.
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CsrGroupFunctionObjectData delete (@HeaderParam ("context")BSDMSessionContext context,CsrGroupFunctionObjectKeyData GFDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CsrGroupFunctionDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GFDeleteIn != null) CsrGroupFunctionObjectKeyHelper.toMap (GFDeleteIn, record, "CsrGroupFunction");
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
return CsrGroupFunctionObjectHelper.fromMap (record, "CsrGroupFunction");
}

  private BSDMInteractionSpec _CsrGroupFunctionCreateSpec = null;
  /**
   * Create a new CsrGroupFunction row..
   * Convenience method using default BSDMSessionContext.
   * @param GFCreateIn Input  Object.
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CsrGroupFunctionObjectData create (CsrGroupFunctionObjectData GFCreateIn) throws BSDMResourceException
  {
    return create (null, GFCreateIn);
  }
  /**
   * Create a new CsrGroupFunction row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFCreateIn Input  Object.
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CsrGroupFunctionObjectData create (@HeaderParam ("context")BSDMSessionContext context,CsrGroupFunctionObjectData GFCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CsrGroupFunctionCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GFCreateIn != null) CsrGroupFunctionObjectHelper.toMap (GFCreateIn, record, "CsrGroupFunction");
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
return CsrGroupFunctionObjectHelper.fromMap (record, "CsrGroupFunction");
}

  /**

   * Retrieve a unique CsrGroupFunction row..

   * Convenience method using default BSDMSessionContext.

   * @param GFGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CsrGroupFunctionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CsrGroupFunctionObjectData get (CsrGroupFunctionObjectKeyData GFGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, GFGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a unique CsrGroupFunction row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CsrGroupFunctionObjectData get (BSDMSessionContext context, CsrGroupFunctionObjectKeyData GFGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GFGetIn, defaultAction);
       
     cManager.checkConstraints(GFGetIn, constraintAction);
       return get (context, GFGetIn);
  }

  /**

   * Find CsrGroupFunction rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param GFFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CsrGroupFunctionObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CsrGroupFunctionObjectDataList find (CsrGroupFunctionObjectFilter GFFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, GFFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find CsrGroupFunction rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CsrGroupFunctionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CsrGroupFunctionObjectDataList find (BSDMSessionContext context, CsrGroupFunctionObjectFilter GFFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GFFindIn, defaultAction);
       
     cManager.checkConstraints(GFFindIn, constraintAction);
       return find (context, GFFindIn);
  }

  /**

   * Update non-key fields of a CsrGroupFunction..

   * Convenience method using default BSDMSessionContext.

   * @param GFUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CsrGroupFunctionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CsrGroupFunctionObjectData update (CsrGroupFunctionObjectData GFUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, GFUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a CsrGroupFunction..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CsrGroupFunctionObjectData update (BSDMSessionContext context, CsrGroupFunctionObjectData GFUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GFUpdateIn, defaultAction);
       
     cManager.checkConstraints(GFUpdateIn, constraintAction);
       return update (context, GFUpdateIn);
  }

  /**

   * Delete a CsrGroupFunction row..

   * Convenience method using default BSDMSessionContext.

   * @param GFDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CsrGroupFunctionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CsrGroupFunctionObjectData delete (CsrGroupFunctionObjectKeyData GFDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, GFDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a CsrGroupFunction row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CsrGroupFunctionObjectData delete (BSDMSessionContext context, CsrGroupFunctionObjectKeyData GFDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GFDeleteIn, defaultAction);
       
     cManager.checkConstraints(GFDeleteIn, constraintAction);
       return delete (context, GFDeleteIn);
  }

  /**

   * Create a new CsrGroupFunction row..

   * Convenience method using default BSDMSessionContext.

   * @param GFCreateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CsrGroupFunctionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CsrGroupFunctionObjectData create (CsrGroupFunctionObjectData GFCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, GFCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new CsrGroupFunction row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GFCreateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CsrGroupFunctionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CsrGroupFunctionObjectData create (BSDMSessionContext context, CsrGroupFunctionObjectData GFCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GFCreateIn, defaultAction);
       
     cManager.checkConstraints(GFCreateIn, constraintAction);
       return create (context, GFCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public CsrGroupFunctionBean ()
  {
    try
    {
      _CsrGroupFunctionGetSpec = new BSDMInteractionSpec("CsrGroupFunctionGet", ApiMappings.getCallName ("CsrGroupFunctionGet"), Boolean.TRUE);

      _CsrGroupFunctionFindSpec = new BSDMInteractionSpec("CsrGroupFunctionFind", ApiMappings.getCallName ("CsrGroupFunctionFind"), Boolean.TRUE);

      _CsrGroupFunctionUpdateSpec = new BSDMInteractionSpec("CsrGroupFunctionUpdate", ApiMappings.getCallName ("CsrGroupFunctionUpdate"), Boolean.TRUE);

      _CsrGroupFunctionDeleteSpec = new BSDMInteractionSpec("CsrGroupFunctionDelete", ApiMappings.getCallName ("CsrGroupFunctionDelete"), Boolean.TRUE);

      _CsrGroupFunctionCreateSpec = new BSDMInteractionSpec("CsrGroupFunctionCreate", ApiMappings.getCallName ("CsrGroupFunctionCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public CsrGroupFunctionBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public CsrGroupFunctionBean(BSDMSettings settings, BSDMConnectionManager cm)
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
