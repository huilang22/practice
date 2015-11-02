
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: EftResponseCodeBean.java
 * Definition File: Admin/EftResponseCode.xml
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
import com.csgsystems.bp.interfaces.EftResponseCodeInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="EftResponseCodeSessionBean"
 * display-name="EftResponseCode Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/EftResponseCodeBean"
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

@Stateless(name="EftResponseCodeBean", mappedName = "EftResponseCode")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("EftResponseCodes")

public class EftResponseCodeBean implements EftResponseCodeInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _EftResponseCodeGetSpec = null;
  /**
   * Get a unique EftResponseCode row..
   * Convenience method using default BSDMSessionContext.
   * @param ERCGetIn Input Object Key.
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EftResponseCodeObjectData get (EftResponseCodeObjectKeyData ERCGetIn) throws BSDMResourceException
  {
    return get (null, ERCGetIn);
  }
  /**
   * Get a unique EftResponseCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ERCGetIn Input Object Key.
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public EftResponseCodeObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam EftResponseCodeObjectKeyData ERCGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_EftResponseCodeGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ERCGetIn != null) EftResponseCodeObjectKeyHelper.toMap (ERCGetIn, record, "EftResponseCode");
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
return EftResponseCodeObjectHelper.fromMap (record, "EftResponseCode");
}

  private BSDMInteractionSpec _EftResponseCodeFindSpec = null;
  /**
   * Find EftResponseCode's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ERCFindIn Input Filter Object.
   * @return EftResponseCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EftResponseCodeObjectDataList find (EftResponseCodeObjectFilter ERCFindIn) throws BSDMResourceException
  {
    return find (null, ERCFindIn);
  }
  /**
   * Find EftResponseCode's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ERCFindIn Input Filter Object.
   * @return EftResponseCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public EftResponseCodeObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,EftResponseCodeObjectFilter ERCFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_EftResponseCodeFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ERCFindIn != null) EftResponseCodeObjectHelper.toMap (ERCFindIn, record, "EftResponseCode");
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
return EftResponseCodeObjectHelper.fromMapList (record, "EftResponseCodeList");
}

  private BSDMInteractionSpec _EftResponseCodeUpdateSpec = null;
  /**
   * Update non key fields of a EftResponseCode..
   * Convenience method using default BSDMSessionContext.
   * @param ERCUpdateIn Input  Object.
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EftResponseCodeObjectData update (EftResponseCodeObjectData ERCUpdateIn) throws BSDMResourceException
  {
    return update (null, ERCUpdateIn);
  }
  /**
   * Update non key fields of a EftResponseCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param ERCUpdateIn Input  Object.
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public EftResponseCodeObjectData update (@HeaderParam ("context")BSDMSessionContext context,EftResponseCodeObjectData ERCUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_EftResponseCodeUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ERCUpdateIn != null) EftResponseCodeObjectHelper.toMap (ERCUpdateIn, record, "EftResponseCode");
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
return EftResponseCodeObjectHelper.fromMap (record, "EftResponseCode");
}

  private BSDMInteractionSpec _EftResponseCodeDeleteSpec = null;
  /**
   * Delete a EftResponseCode..
   * Convenience method using default BSDMSessionContext.
   * @param ERCDeleteIn Input Object Key.
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EftResponseCodeObjectData delete (EftResponseCodeObjectKeyData ERCDeleteIn) throws BSDMResourceException
  {
    return delete (null, ERCDeleteIn);
  }
  /**
   * Delete a EftResponseCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param ERCDeleteIn Input Object Key.
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public EftResponseCodeObjectData delete (@HeaderParam ("context")BSDMSessionContext context,EftResponseCodeObjectKeyData ERCDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_EftResponseCodeDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ERCDeleteIn != null) EftResponseCodeObjectKeyHelper.toMap (ERCDeleteIn, record, "EftResponseCode");
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
return EftResponseCodeObjectHelper.fromMap (record, "EftResponseCode");
}

  private BSDMInteractionSpec _EftResponseCodeCreateSpec = null;
  /**
   * Create a new EftResponseCode..
   * Convenience method using default BSDMSessionContext.
   * @param ERCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EftResponseCodeObjectData create (EftResponseCodeObjectData ERCCreateIn) throws BSDMResourceException
  {
    return create (null, ERCCreateIn);
  }
  /**
   * Create a new EftResponseCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param ERCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public EftResponseCodeObjectData create (@HeaderParam ("context")BSDMSessionContext context,EftResponseCodeObjectData ERCCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_EftResponseCodeCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ERCCreateIn != null) EftResponseCodeObjectHelper.toMap (ERCCreateIn, record, "EftResponseCode");
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
return EftResponseCodeObjectHelper.fromMap (record, "EftResponseCode");
}

  /**

   * Get a unique EftResponseCode row..

   * Convenience method using default BSDMSessionContext.

   * @param ERCGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EftResponseCodeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EftResponseCodeObjectData get (EftResponseCodeObjectKeyData ERCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, ERCGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique EftResponseCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ERCGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EftResponseCodeObjectData get (BSDMSessionContext context, EftResponseCodeObjectKeyData ERCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ERCGetIn, defaultAction);
       
     cManager.checkConstraints(ERCGetIn, constraintAction);
       return get (context, ERCGetIn);
  }

  /**

   * Find EftResponseCode's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param ERCFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EftResponseCodeObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EftResponseCodeObjectDataList find (EftResponseCodeObjectFilter ERCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, ERCFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find EftResponseCode's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ERCFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EftResponseCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EftResponseCodeObjectDataList find (BSDMSessionContext context, EftResponseCodeObjectFilter ERCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ERCFindIn, defaultAction);
       
     cManager.checkConstraints(ERCFindIn, constraintAction);
       return find (context, ERCFindIn);
  }

  /**

   * Update non key fields of a EftResponseCode..

   * Convenience method using default BSDMSessionContext.

   * @param ERCUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EftResponseCodeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EftResponseCodeObjectData update (EftResponseCodeObjectData ERCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, ERCUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non key fields of a EftResponseCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param ERCUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EftResponseCodeObjectData update (BSDMSessionContext context, EftResponseCodeObjectData ERCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ERCUpdateIn, defaultAction);
       
     cManager.checkConstraints(ERCUpdateIn, constraintAction);
       return update (context, ERCUpdateIn);
  }

  /**

   * Delete a EftResponseCode..

   * Convenience method using default BSDMSessionContext.

   * @param ERCDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EftResponseCodeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EftResponseCodeObjectData delete (EftResponseCodeObjectKeyData ERCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, ERCDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a EftResponseCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param ERCDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EftResponseCodeObjectData delete (BSDMSessionContext context, EftResponseCodeObjectKeyData ERCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ERCDeleteIn, defaultAction);
       
     cManager.checkConstraints(ERCDeleteIn, constraintAction);
       return delete (context, ERCDeleteIn);
  }

  /**

   * Create a new EftResponseCode..

   * Convenience method using default BSDMSessionContext.

   * @param ERCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EftResponseCodeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EftResponseCodeObjectData create (EftResponseCodeObjectData ERCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, ERCCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new EftResponseCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param ERCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EftResponseCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EftResponseCodeObjectData create (BSDMSessionContext context, EftResponseCodeObjectData ERCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ERCCreateIn, defaultAction);
       
     cManager.checkConstraints(ERCCreateIn, constraintAction);
       return create (context, ERCCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public EftResponseCodeBean ()
  {
    try
    {
      _EftResponseCodeGetSpec = new BSDMInteractionSpec("EftResponseCodeGet", ApiMappings.getCallName ("EftResponseCodeGet"), Boolean.TRUE);

      _EftResponseCodeFindSpec = new BSDMInteractionSpec("EftResponseCodeFind", ApiMappings.getCallName ("EftResponseCodeFind"), Boolean.TRUE);

      _EftResponseCodeUpdateSpec = new BSDMInteractionSpec("EftResponseCodeUpdate", ApiMappings.getCallName ("EftResponseCodeUpdate"), Boolean.TRUE);

      _EftResponseCodeDeleteSpec = new BSDMInteractionSpec("EftResponseCodeDelete", ApiMappings.getCallName ("EftResponseCodeDelete"), Boolean.TRUE);

      _EftResponseCodeCreateSpec = new BSDMInteractionSpec("EftResponseCodeCreate", ApiMappings.getCallName ("EftResponseCodeCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public EftResponseCodeBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public EftResponseCodeBean(BSDMSettings settings, BSDMConnectionManager cm)
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
