
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: AccountCodeGroupBean.java
 * Definition File: Customer/AccountCodeGroup.xml
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
import com.csgsystems.bp.interfaces.AccountCodeGroupInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="AccountCodeGroupSessionBean"
 * display-name="AccountCodeGroup Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/AccountCodeGroupBean"
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

@Stateless(name="AccountCodeGroupBean", mappedName = "AccountCodeGroup")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("AccountCodeGroups")

public class AccountCodeGroupBean implements AccountCodeGroupInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _AccountCodeGroupGetSpec = null;
  /**
   * Fetch an AccountCodeGroup row..
   * Convenience method using default BSDMSessionContext.
   * @param CACGgetIn Input Object Key.
   * @return AccountCodeGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountCodeGroupObjectData get (AccountCodeGroupObjectKeyData CACGgetIn) throws BSDMResourceException
  {
    return get (null, CACGgetIn);
  }
  /**
   * Fetch an AccountCodeGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACGgetIn Input Object Key.
   * @return AccountCodeGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public AccountCodeGroupObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam AccountCodeGroupObjectKeyData CACGgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountCodeGroupGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CACGgetIn != null) AccountCodeGroupObjectKeyHelper.toMap (CACGgetIn, record, "AccountCodeGroup");
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
return AccountCodeGroupObjectHelper.fromMap (record, "AccountCodeGroup");
}

  private BSDMInteractionSpec _AccountCodeGroupFindSpec = null;
  /**
   * Find AccountCodeGroups based on the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CACGfindIn Input Filter Object.
   * @return AccountCodeGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountCodeGroupObjectDataList find (AccountCodeGroupObjectFilter CACGfindIn) throws BSDMResourceException
  {
    return find (null, CACGfindIn);
  }
  /**
   * Find AccountCodeGroups based on the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACGfindIn Input Filter Object.
   * @return AccountCodeGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountCodeGroupObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,AccountCodeGroupObjectFilter CACGfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountCodeGroupFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CACGfindIn != null) AccountCodeGroupObjectHelper.toMap (CACGfindIn, record, "AccountCodeGroup");
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
return AccountCodeGroupObjectHelper.fromMapList (record, "AccountCodeGroupList");
}

  private BSDMInteractionSpec _AccountCodeGroupCreateSpec = null;
  /**
   * Create a new AccountCodeGroup..
   * Convenience method using default BSDMSessionContext.
   * @param CACGcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AcgTrackingId, AcgTrackingIdServ.  Derived Fields: AcgTrackingId, AcgTrackingIdServ.
   * @return AccountCodeGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountCodeGroupObjectData create (AccountCodeGroupObjectData CACGcreateIn) throws BSDMResourceException
  {
    return create (null, CACGcreateIn);
  }
  /**
   * Create a new AccountCodeGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACGcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AcgTrackingId, AcgTrackingIdServ.  Derived Fields: AcgTrackingId, AcgTrackingIdServ.
   * @return AccountCodeGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountCodeGroupObjectData create (@HeaderParam ("context")BSDMSessionContext context,AccountCodeGroupObjectData CACGcreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountCodeGroupCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CACGcreateIn != null) AccountCodeGroupObjectHelper.toMap (CACGcreateIn, record, "AccountCodeGroup");
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
return AccountCodeGroupObjectHelper.fromMap (record, "AccountCodeGroup");
}

  private BSDMInteractionSpec _AccountCodeGroupUpdateSpec = null;
  /**
   * Update non-key fields of an AccountCodeGroup..
   * Convenience method using default BSDMSessionContext.
   * @param CACGupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @return AccountCodeGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountCodeGroupObjectData update (AccountCodeGroupObjectData CACGupdateIn) throws BSDMResourceException
  {
    return update (null, CACGupdateIn);
  }
  /**
   * Update non-key fields of an AccountCodeGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACGupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @return AccountCodeGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountCodeGroupObjectData update (@HeaderParam ("context")BSDMSessionContext context,AccountCodeGroupObjectData CACGupdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountCodeGroupUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CACGupdateIn != null) AccountCodeGroupObjectHelper.toMap (CACGupdateIn, record, "AccountCodeGroup");
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
return AccountCodeGroupObjectHelper.fromMap (record, "AccountCodeGroup");
}

  /**

   * Fetch an AccountCodeGroup row..

   * Convenience method using default BSDMSessionContext.

   * @param CACGgetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountCodeGroupObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountCodeGroupObjectData get (AccountCodeGroupObjectKeyData CACGgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, CACGgetIn, defaultAction, constraintAction);
  }
  /** 
   * Fetch an AccountCodeGroup row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACGgetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountCodeGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountCodeGroupObjectData get (BSDMSessionContext context, AccountCodeGroupObjectKeyData CACGgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CACGgetIn, defaultAction);
       
     cManager.checkConstraints(CACGgetIn, constraintAction);
       return get (context, CACGgetIn);
  }

  /**

   * Find AccountCodeGroups based on the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param CACGfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountCodeGroupObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountCodeGroupObjectDataList find (AccountCodeGroupObjectFilter CACGfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, CACGfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find AccountCodeGroups based on the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACGfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountCodeGroupObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountCodeGroupObjectDataList find (BSDMSessionContext context, AccountCodeGroupObjectFilter CACGfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CACGfindIn, defaultAction);
       
     cManager.checkConstraints(CACGfindIn, constraintAction);
       return find (context, CACGfindIn);
  }

  /**

   * Create a new AccountCodeGroup..

   * Convenience method using default BSDMSessionContext.

   * @param CACGcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AcgTrackingId, AcgTrackingIdServ.  Derived Fields: AcgTrackingId, AcgTrackingIdServ.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountCodeGroupObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountCodeGroupObjectData create (AccountCodeGroupObjectData CACGcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, CACGcreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new AccountCodeGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACGcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, AcgTrackingId, AcgTrackingIdServ.  Derived Fields: AcgTrackingId, AcgTrackingIdServ.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountCodeGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountCodeGroupObjectData create (BSDMSessionContext context, AccountCodeGroupObjectData CACGcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CACGcreateIn, defaultAction);
       
     cManager.checkConstraints(CACGcreateIn, constraintAction);
       return create (context, CACGcreateIn);
  }

  /**

   * Update non-key fields of an AccountCodeGroup..

   * Convenience method using default BSDMSessionContext.

   * @param CACGupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountCodeGroupObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountCodeGroupObjectData update (AccountCodeGroupObjectData CACGupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, CACGupdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of an AccountCodeGroup..
   * @param context The session context to use when connecting to the APITS server.
   * @param CACGupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountCodeGroupObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountCodeGroupObjectData update (BSDMSessionContext context, AccountCodeGroupObjectData CACGupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CACGupdateIn, defaultAction);
       
     cManager.checkConstraints(CACGupdateIn, constraintAction);
       return update (context, CACGupdateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public AccountCodeGroupBean ()
  {
    try
    {
      _AccountCodeGroupGetSpec = new BSDMInteractionSpec("AccountCodeGroupGet", ApiMappings.getCallName ("AccountCodeGroupGet"), Boolean.TRUE);

      _AccountCodeGroupFindSpec = new BSDMInteractionSpec("AccountCodeGroupFind", ApiMappings.getCallName ("AccountCodeGroupFind"), Boolean.TRUE);

      _AccountCodeGroupCreateSpec = new BSDMInteractionSpec("AccountCodeGroupCreate", ApiMappings.getCallName ("AccountCodeGroupCreate"), Boolean.TRUE);

      _AccountCodeGroupUpdateSpec = new BSDMInteractionSpec("AccountCodeGroupUpdate", ApiMappings.getCallName ("AccountCodeGroupUpdate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public AccountCodeGroupBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public AccountCodeGroupBean(BSDMSettings settings, BSDMConnectionManager cm)
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
