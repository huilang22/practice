
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: AccountSegmentMapBean.java
 * Definition File: Admin/AccountSegmentMap.xml
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
import com.csgsystems.bp.interfaces.AccountSegmentMapInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="AccountSegmentMapSessionBean"
 * display-name="AccountSegmentMap Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/AccountSegmentMapBean"
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

@Stateless(name="AccountSegmentMapBean", mappedName = "AccountSegmentMap")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("AccountSegmentMaps")

public class AccountSegmentMapBean implements AccountSegmentMapInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _AccountSegmentMapGetSpec = null;
  /**
   * Retrieve a unique AccountSegmentMap row..
   * Convenience method using default BSDMSessionContext.
   * @param ASMGetIn Input Object Key.
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountSegmentMapObjectData get (AccountSegmentMapObjectKeyData ASMGetIn) throws BSDMResourceException
  {
    return get (null, ASMGetIn);
  }
  /**
   * Retrieve a unique AccountSegmentMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASMGetIn Input Object Key.
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public AccountSegmentMapObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam AccountSegmentMapObjectKeyData ASMGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountSegmentMapGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ASMGetIn != null) AccountSegmentMapObjectKeyHelper.toMap (ASMGetIn, record, "AccountSegmentMap");
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
return AccountSegmentMapObjectHelper.fromMap (record, "AccountSegmentMap");
}

  private BSDMInteractionSpec _AccountSegmentMapFindSpec = null;
  /**
   * Find AccountSegmentMap rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ASMFindIn Input Filter Object.
   * @return AccountSegmentMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountSegmentMapObjectDataList find (AccountSegmentMapObjectFilter ASMFindIn) throws BSDMResourceException
  {
    return find (null, ASMFindIn);
  }
  /**
   * Find AccountSegmentMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASMFindIn Input Filter Object.
   * @return AccountSegmentMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountSegmentMapObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,AccountSegmentMapObjectFilter ASMFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountSegmentMapFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ASMFindIn != null) AccountSegmentMapObjectHelper.toMap (ASMFindIn, record, "AccountSegmentMap");
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
return AccountSegmentMapObjectHelper.fromMapList (record, "AccountSegmentMapList");
}

  private BSDMInteractionSpec _AccountSegmentMapUpdateSpec = null;
  /**
   * Update non-key fields of a AccountSegmentMap..
   * Convenience method using default BSDMSessionContext.
   * @param ASMUpdateIn Input  Object.
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountSegmentMapObjectData update (AccountSegmentMapObjectData ASMUpdateIn) throws BSDMResourceException
  {
    return update (null, ASMUpdateIn);
  }
  /**
   * Update non-key fields of a AccountSegmentMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASMUpdateIn Input  Object.
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountSegmentMapObjectData update (@HeaderParam ("context")BSDMSessionContext context,AccountSegmentMapObjectData ASMUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountSegmentMapUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ASMUpdateIn != null) AccountSegmentMapObjectHelper.toMap (ASMUpdateIn, record, "AccountSegmentMap");
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
return AccountSegmentMapObjectHelper.fromMap (record, "AccountSegmentMap");
}

  private BSDMInteractionSpec _AccountSegmentMapDeleteSpec = null;
  /**
   * Delete a AccountSegmentMap row..
   * Convenience method using default BSDMSessionContext.
   * @param ASMDeleteIn Input Object Key.
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountSegmentMapObjectData delete (AccountSegmentMapObjectKeyData ASMDeleteIn) throws BSDMResourceException
  {
    return delete (null, ASMDeleteIn);
  }
  /**
   * Delete a AccountSegmentMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASMDeleteIn Input Object Key.
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountSegmentMapObjectData delete (@HeaderParam ("context")BSDMSessionContext context,AccountSegmentMapObjectKeyData ASMDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountSegmentMapDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ASMDeleteIn != null) AccountSegmentMapObjectKeyHelper.toMap (ASMDeleteIn, record, "AccountSegmentMap");
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
return AccountSegmentMapObjectHelper.fromMap (record, "AccountSegmentMap");
}

  private BSDMInteractionSpec _AccountSegmentMapCreateSpec = null;
  /**
   * Create a new AccountSegmentMap row..
   * Convenience method using default BSDMSessionContext.
   * @param ASMCreateIn Input  Object.
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountSegmentMapObjectData create (AccountSegmentMapObjectData ASMCreateIn) throws BSDMResourceException
  {
    return create (null, ASMCreateIn);
  }
  /**
   * Create a new AccountSegmentMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASMCreateIn Input  Object.
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountSegmentMapObjectData create (@HeaderParam ("context")BSDMSessionContext context,AccountSegmentMapObjectData ASMCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountSegmentMapCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ASMCreateIn != null) AccountSegmentMapObjectHelper.toMap (ASMCreateIn, record, "AccountSegmentMap");
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
return AccountSegmentMapObjectHelper.fromMap (record, "AccountSegmentMap");
}

  /**

   * Retrieve a unique AccountSegmentMap row..

   * Convenience method using default BSDMSessionContext.

   * @param ASMGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountSegmentMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountSegmentMapObjectData get (AccountSegmentMapObjectKeyData ASMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, ASMGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a unique AccountSegmentMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASMGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountSegmentMapObjectData get (BSDMSessionContext context, AccountSegmentMapObjectKeyData ASMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ASMGetIn, defaultAction);
       
     cManager.checkConstraints(ASMGetIn, constraintAction);
       return get (context, ASMGetIn);
  }

  /**

   * Find AccountSegmentMap rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param ASMFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountSegmentMapObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountSegmentMapObjectDataList find (AccountSegmentMapObjectFilter ASMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, ASMFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find AccountSegmentMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASMFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountSegmentMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountSegmentMapObjectDataList find (BSDMSessionContext context, AccountSegmentMapObjectFilter ASMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ASMFindIn, defaultAction);
       
     cManager.checkConstraints(ASMFindIn, constraintAction);
       return find (context, ASMFindIn);
  }

  /**

   * Update non-key fields of a AccountSegmentMap..

   * Convenience method using default BSDMSessionContext.

   * @param ASMUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountSegmentMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountSegmentMapObjectData update (AccountSegmentMapObjectData ASMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, ASMUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a AccountSegmentMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASMUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountSegmentMapObjectData update (BSDMSessionContext context, AccountSegmentMapObjectData ASMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ASMUpdateIn, defaultAction);
       
     cManager.checkConstraints(ASMUpdateIn, constraintAction);
       return update (context, ASMUpdateIn);
  }

  /**

   * Delete a AccountSegmentMap row..

   * Convenience method using default BSDMSessionContext.

   * @param ASMDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountSegmentMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountSegmentMapObjectData delete (AccountSegmentMapObjectKeyData ASMDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, ASMDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a AccountSegmentMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASMDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountSegmentMapObjectData delete (BSDMSessionContext context, AccountSegmentMapObjectKeyData ASMDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ASMDeleteIn, defaultAction);
       
     cManager.checkConstraints(ASMDeleteIn, constraintAction);
       return delete (context, ASMDeleteIn);
  }

  /**

   * Create a new AccountSegmentMap row..

   * Convenience method using default BSDMSessionContext.

   * @param ASMCreateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountSegmentMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountSegmentMapObjectData create (AccountSegmentMapObjectData ASMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, ASMCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new AccountSegmentMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ASMCreateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountSegmentMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountSegmentMapObjectData create (BSDMSessionContext context, AccountSegmentMapObjectData ASMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ASMCreateIn, defaultAction);
       
     cManager.checkConstraints(ASMCreateIn, constraintAction);
       return create (context, ASMCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public AccountSegmentMapBean ()
  {
    try
    {
      _AccountSegmentMapGetSpec = new BSDMInteractionSpec("AccountSegmentMapGet", ApiMappings.getCallName ("AccountSegmentMapGet"), Boolean.TRUE);

      _AccountSegmentMapFindSpec = new BSDMInteractionSpec("AccountSegmentMapFind", ApiMappings.getCallName ("AccountSegmentMapFind"), Boolean.TRUE);

      _AccountSegmentMapUpdateSpec = new BSDMInteractionSpec("AccountSegmentMapUpdate", ApiMappings.getCallName ("AccountSegmentMapUpdate"), Boolean.TRUE);

      _AccountSegmentMapDeleteSpec = new BSDMInteractionSpec("AccountSegmentMapDelete", ApiMappings.getCallName ("AccountSegmentMapDelete"), Boolean.TRUE);

      _AccountSegmentMapCreateSpec = new BSDMInteractionSpec("AccountSegmentMapCreate", ApiMappings.getCallName ("AccountSegmentMapCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public AccountSegmentMapBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public AccountSegmentMapBean(BSDMSettings settings, BSDMConnectionManager cm)
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
