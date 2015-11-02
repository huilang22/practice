
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: GroupBean.java
 * Definition File: Customer/Group.xml
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
import com.csgsystems.bp.interfaces.GroupInterface;
import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="GroupSessionBean"
 * display-name="Group Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/GroupBean"
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

@Stateless(name="GroupBean", mappedName = "Group")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("Groups")

public class GroupBean implements GroupInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _GroupGetSpec = null;
  /**
   * Get a unique Group row..
   * Convenience method using default BSDMSessionContext.
   * @param GgetIn Input Object Key.
   * @return GroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GroupObjectData get (GroupObjectKeyData GgetIn) throws BSDMResourceException
  {
    return get (null, GgetIn);
  }
  /**
   * Get a unique Group row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GgetIn Input Object Key.
   * @return GroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public GroupObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam GroupObjectKeyData GgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GroupGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GgetIn != null) GroupObjectKeyHelper.toMap (GgetIn, record, "Group");
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
return GroupObjectHelper.fromMap (record, "Group");
}

  private BSDMInteractionSpec _GroupFindSpec = null;
  /**
   * Find Groups that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.
   * @return GroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GroupObjectDataList find (GroupObjectFilter GfindIn) throws BSDMResourceException
  {
    return find (null, GfindIn);
  }
  /**
   * Find Groups that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.
   * @return GroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GroupObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,GroupObjectFilter GfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GroupFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GfindIn != null) GroupObjectHelper.toMap (GfindIn, record, "Group");
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
return GroupObjectHelper.fromMapList (record, "GroupList");
}

  private BSDMInteractionSpec _GroupCreateSpec = null;
  /**
   * Create a new Group..
   * Convenience method using default BSDMSessionContext.
   * @param GcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupNo, ChgWho, ChgDt, CreateDt.  Defaulted Fields: GroupExternalIdType.  Derived Fields: GroupNo, AccountExternalIdType, ChgDt, ChgWho, CreateDt.
   * @return GroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GroupObjectData create (GroupObjectData GcreateIn) throws BSDMResourceException
  {
    return create (null, GcreateIn);
  }
  /**
   * Create a new Group..
   * @param context The session context to use when connecting to the APITS server.
   * @param GcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupNo, ChgWho, ChgDt, CreateDt.  Defaulted Fields: GroupExternalIdType.  Derived Fields: GroupNo, AccountExternalIdType, ChgDt, ChgWho, CreateDt.
   * @return GroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GroupObjectData create (@HeaderParam ("context")BSDMSessionContext context,GroupObjectData GcreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GroupCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GcreateIn != null) GroupObjectHelper.toMap (GcreateIn, record, "Group");
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
return GroupObjectHelper.fromMap (record, "Group");
}

  private BSDMInteractionSpec _GroupUpdateSpec = null;
  /**
   * Update the non-key fields of a Group..
   * Convenience method using default BSDMSessionContext.
   * @param GupdateIn Input  Object.  Read-Only fields: GroupExternalId, GroupExternalIdType, AccountExternalId, AccountExternalIdType, ChgWho, ChgDt, CreateDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.
   * @return GroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GroupObjectData update (GroupObjectData GupdateIn) throws BSDMResourceException
  {
    return update (null, GupdateIn);
  }
  /**
   * Update the non-key fields of a Group..
   * @param context The session context to use when connecting to the APITS server.
   * @param GupdateIn Input  Object.  Read-Only fields: GroupExternalId, GroupExternalIdType, AccountExternalId, AccountExternalIdType, ChgWho, ChgDt, CreateDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.
   * @return GroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GroupObjectData update (@HeaderParam ("context")BSDMSessionContext context,GroupObjectData GupdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GroupUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GupdateIn != null) GroupObjectHelper.toMap (GupdateIn, record, "Group");
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
return GroupObjectHelper.fromMap (record, "Group");
}

  /**

   * Get a unique Group row..

   * Convenience method using default BSDMSessionContext.

   * @param GgetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GroupObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GroupObjectData get (GroupObjectKeyData GgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, GgetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique Group row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GgetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GroupObjectData get (BSDMSessionContext context, GroupObjectKeyData GgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GgetIn, defaultAction);
       
     cManager.checkConstraints(GgetIn, constraintAction);
       return get (context, GgetIn);
  }

  /**

   * Find Groups that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param GfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GroupObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GroupObjectDataList find (GroupObjectFilter GfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, GfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find Groups that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GroupObjectDataList find (BSDMSessionContext context, GroupObjectFilter GfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GfindIn, defaultAction);
       
     cManager.checkConstraints(GfindIn, constraintAction);
       return find (context, GfindIn);
  }

  /**

   * Create a new Group..

   * Convenience method using default BSDMSessionContext.

   * @param GcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupNo, ChgWho, ChgDt, CreateDt.  Defaulted Fields: GroupExternalIdType.  Derived Fields: GroupNo, AccountExternalIdType, ChgDt, ChgWho, CreateDt.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GroupObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GroupObjectData create (GroupObjectData GcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, GcreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new Group..
   * @param context The session context to use when connecting to the APITS server.
   * @param GcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupNo, ChgWho, ChgDt, CreateDt.  Defaulted Fields: GroupExternalIdType.  Derived Fields: GroupNo, AccountExternalIdType, ChgDt, ChgWho, CreateDt.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GroupObjectData create (BSDMSessionContext context, GroupObjectData GcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GcreateIn, defaultAction);
       
     cManager.checkConstraints(GcreateIn, constraintAction);
       return create (context, GcreateIn);
  }

  /**

   * Update the non-key fields of a Group..

   * Convenience method using default BSDMSessionContext.

   * @param GupdateIn Input  Object.  Read-Only fields: GroupExternalId, GroupExternalIdType, AccountExternalId, AccountExternalIdType, ChgWho, ChgDt, CreateDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GroupObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GroupObjectData update (GroupObjectData GupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, GupdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of a Group..
   * @param context The session context to use when connecting to the APITS server.
   * @param GupdateIn Input  Object.  Read-Only fields: GroupExternalId, GroupExternalIdType, AccountExternalId, AccountExternalIdType, ChgWho, ChgDt, CreateDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GroupObjectData update (BSDMSessionContext context, GroupObjectData GupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GupdateIn, defaultAction);
       
     cManager.checkConstraints(GupdateIn, constraintAction);
       return update (context, GupdateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public GroupBean ()
  {
    try
    {
      _GroupGetSpec = new BSDMInteractionSpec("GroupGet", ApiMappings.getCallName ("GroupGet"), Boolean.TRUE);

      _GroupFindSpec = new BSDMInteractionSpec("GroupFind", ApiMappings.getCallName ("GroupFind"), Boolean.TRUE);

      _GroupCreateSpec = new BSDMInteractionSpec("GroupCreate", ApiMappings.getCallName ("GroupCreate"), Boolean.TRUE);

      _GroupUpdateSpec = new BSDMInteractionSpec("GroupUpdate", ApiMappings.getCallName ("GroupUpdate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public GroupBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public GroupBean(BSDMSettings settings, BSDMConnectionManager cm)
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
