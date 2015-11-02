
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: BamErrorCodeBean.java
 * Definition File: Admin/BamErrorCode.xml
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
import com.csgsystems.bp.interfaces.BamErrorCodeInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="BamErrorCodeSessionBean"
 * display-name="BamErrorCode Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/BamErrorCodeBean"
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

@Stateless(name="BamErrorCodeBean", mappedName = "BamErrorCode")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("BamErrorCodes")

public class BamErrorCodeBean implements BamErrorCodeInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _BamErrorCodeGetSpec = null;
  /**
   * Get a BamErrorCode..
   * Convenience method using default BSDMSessionContext.
   * @param BECGetIn Input Object Key.
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BECObjectData get (BECObjectKeyData BECGetIn) throws BSDMResourceException
  {
    return get (null, BECGetIn);
  }
  /**
   * Get a BamErrorCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param BECGetIn Input Object Key.
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public BECObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam BECObjectKeyData BECGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BamErrorCodeGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BECGetIn != null) BECObjectKeyHelper.toMap (BECGetIn, record, "BamErrorCode");
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
return BECObjectHelper.fromMap (record, "BamErrorCode");
}

  private BSDMInteractionSpec _BamErrorCodeFindSpec = null;
  /**
   * Find BamErrorCodes..
   * Convenience method using default BSDMSessionContext.
   * @param BECFindIn Input Filter Object.
   * @return BECObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BECObjectDataList find (BECObjectFilter BECFindIn) throws BSDMResourceException
  {
    return find (null, BECFindIn);
  }
  /**
   * Find BamErrorCodes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BECFindIn Input Filter Object.
   * @return BECObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BECObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,BECObjectFilter BECFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BamErrorCodeFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BECFindIn != null) BECObjectHelper.toMap (BECFindIn, record, "BamErrorCode");
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
return BECObjectHelper.fromMapList (record, "BamErrorCodeList");
}

  private BSDMInteractionSpec _BamErrorCodeUpdateSpec = null;
  /**
   * Update non-key fields of a BamErrorCode row..
   * Convenience method using default BSDMSessionContext.
   * @param BECUpdateIn Input  Object.
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BECObjectData update (BECObjectData BECUpdateIn) throws BSDMResourceException
  {
    return update (null, BECUpdateIn);
  }
  /**
   * Update non-key fields of a BamErrorCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BECUpdateIn Input  Object.
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BECObjectData update (@HeaderParam ("context")BSDMSessionContext context,BECObjectData BECUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BamErrorCodeUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BECUpdateIn != null) BECObjectHelper.toMap (BECUpdateIn, record, "BamErrorCode");
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
return BECObjectHelper.fromMap (record, "BamErrorCode");
}

  private BSDMInteractionSpec _BamErrorCodeDeleteSpec = null;
  /**
   * Delete a BamErrorCode..
   * Convenience method using default BSDMSessionContext.
   * @param BECDeleteIn Input Object Key.
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BECObjectData delete (BECObjectKeyData BECDeleteIn) throws BSDMResourceException
  {
    return delete (null, BECDeleteIn);
  }
  /**
   * Delete a BamErrorCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param BECDeleteIn Input Object Key.
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BECObjectData delete (@HeaderParam ("context")BSDMSessionContext context,BECObjectKeyData BECDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BamErrorCodeDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BECDeleteIn != null) BECObjectKeyHelper.toMap (BECDeleteIn, record, "BamErrorCode");
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
return BECObjectHelper.fromMap (record, "BamErrorCode");
}

  private BSDMInteractionSpec _BamErrorCodeCreateSpec = null;
  /**
   * Create a BamErrorCode..
   * Convenience method using default BSDMSessionContext.
   * @param BECCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BECObjectData create (BECObjectData BECCreateIn) throws BSDMResourceException
  {
    return create (null, BECCreateIn);
  }
  /**
   * Create a BamErrorCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param BECCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BECObjectData create (@HeaderParam ("context")BSDMSessionContext context,BECObjectData BECCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BamErrorCodeCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BECCreateIn != null) BECObjectHelper.toMap (BECCreateIn, record, "BamErrorCode");
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
return BECObjectHelper.fromMap (record, "BamErrorCode");
}

  /**

   * Get a BamErrorCode..

   * Convenience method using default BSDMSessionContext.

   * @param BECGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BECObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BECObjectData get (BECObjectKeyData BECGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, BECGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a BamErrorCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param BECGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BECObjectData get (BSDMSessionContext context, BECObjectKeyData BECGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BECGetIn, defaultAction);
       
     cManager.checkConstraints(BECGetIn, constraintAction);
       return get (context, BECGetIn);
  }

  /**

   * Find BamErrorCodes..

   * Convenience method using default BSDMSessionContext.

   * @param BECFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BECObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BECObjectDataList find (BECObjectFilter BECFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, BECFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find BamErrorCodes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BECFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BECObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BECObjectDataList find (BSDMSessionContext context, BECObjectFilter BECFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BECFindIn, defaultAction);
       
     cManager.checkConstraints(BECFindIn, constraintAction);
       return find (context, BECFindIn);
  }

  /**

   * Update non-key fields of a BamErrorCode row..

   * Convenience method using default BSDMSessionContext.

   * @param BECUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BECObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BECObjectData update (BECObjectData BECUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, BECUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a BamErrorCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BECUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BECObjectData update (BSDMSessionContext context, BECObjectData BECUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BECUpdateIn, defaultAction);
       
     cManager.checkConstraints(BECUpdateIn, constraintAction);
       return update (context, BECUpdateIn);
  }

  /**

   * Delete a BamErrorCode..

   * Convenience method using default BSDMSessionContext.

   * @param BECDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BECObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BECObjectData delete (BECObjectKeyData BECDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, BECDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a BamErrorCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param BECDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BECObjectData delete (BSDMSessionContext context, BECObjectKeyData BECDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BECDeleteIn, defaultAction);
       
     cManager.checkConstraints(BECDeleteIn, constraintAction);
       return delete (context, BECDeleteIn);
  }

  /**

   * Create a BamErrorCode..

   * Convenience method using default BSDMSessionContext.

   * @param BECCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BECObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BECObjectData create (BECObjectData BECCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, BECCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a BamErrorCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param BECCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BECObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BECObjectData create (BSDMSessionContext context, BECObjectData BECCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BECCreateIn, defaultAction);
       
     cManager.checkConstraints(BECCreateIn, constraintAction);
       return create (context, BECCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public BamErrorCodeBean ()
  {
    try
    {
      _BamErrorCodeGetSpec = new BSDMInteractionSpec("BamErrorCodeGet", ApiMappings.getCallName ("BamErrorCodeGet"), Boolean.TRUE);

      _BamErrorCodeFindSpec = new BSDMInteractionSpec("BamErrorCodeFind", ApiMappings.getCallName ("BamErrorCodeFind"), Boolean.TRUE);

      _BamErrorCodeUpdateSpec = new BSDMInteractionSpec("BamErrorCodeUpdate", ApiMappings.getCallName ("BamErrorCodeUpdate"), Boolean.TRUE);

      _BamErrorCodeDeleteSpec = new BSDMInteractionSpec("BamErrorCodeDelete", ApiMappings.getCallName ("BamErrorCodeDelete"), Boolean.TRUE);

      _BamErrorCodeCreateSpec = new BSDMInteractionSpec("BamErrorCodeCreate", ApiMappings.getCallName ("BamErrorCodeCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public BamErrorCodeBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public BamErrorCodeBean(BSDMSettings settings, BSDMConnectionManager cm)
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
