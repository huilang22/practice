
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: CustomerServiceCenterBean.java
 * Definition File: Customer/CustomerServiceCenter.xml
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
import com.csgsystems.bp.interfaces.CustomerServiceCenterInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="CustomerServiceCenterSessionBean"
 * display-name="CustomerServiceCenter Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/CustomerServiceCenterBean"
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

@Stateless(name="CustomerServiceCenterBean", mappedName = "CustomerServiceCenter")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("CustomerServiceCenters")

public class CustomerServiceCenterBean implements CustomerServiceCenterInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _CustomerServiceCenterGetSpec = null;
  /**
   * Get a CustomerServiceCenter..
   * Convenience method using default BSDMSessionContext.
   * @param CSCgetIn Input Object Key.
   * @return CustomerServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CustomerServiceCenterObjectData get (CustomerServiceCenterObjectKeyData CSCgetIn) throws BSDMResourceException
  {
    return get (null, CSCgetIn);
  }
  /**
   * Get a CustomerServiceCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCgetIn Input Object Key.
   * @return CustomerServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public CustomerServiceCenterObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam CustomerServiceCenterObjectKeyData CSCgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CustomerServiceCenterGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CSCgetIn != null) CustomerServiceCenterObjectKeyHelper.toMap (CSCgetIn, record, "CustomerServiceCenter");
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
return CustomerServiceCenterObjectHelper.fromMap (record, "CustomerServiceCenter");
}

  private BSDMInteractionSpec _CustomerServiceCenterFindSpec = null;
  /**
   * Find CustomerServiceCenters..
   * Convenience method using default BSDMSessionContext.
   * @param CSCfindIn Input Filter Object.
   * @return CustomerServiceCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CustomerServiceCenterObjectDataList find (CustomerServiceCenterObjectFilter CSCfindIn) throws BSDMResourceException
  {
    return find (null, CSCfindIn);
  }
  /**
   * Find CustomerServiceCenters..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCfindIn Input Filter Object.
   * @return CustomerServiceCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CustomerServiceCenterObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,CustomerServiceCenterObjectFilter CSCfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CustomerServiceCenterFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CSCfindIn != null) CustomerServiceCenterObjectHelper.toMap (CSCfindIn, record, "CustomerServiceCenter");
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
return CustomerServiceCenterObjectHelper.fromMapList (record, "CustomerServiceCenterList");
}

  private BSDMInteractionSpec _CustomerServiceCenterCreateSpec = null;
  /**
   * Create a new CustomerServiceCenter..
   * Convenience method using default BSDMSessionContext.
   * @param CSCcreateIn Input  Object.  Read-Only fields: ChgWho, ChgDate.  Derived Fields: ChgWho, ChgDate.
   * @return CustomerServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CustomerServiceCenterObjectData create (CustomerServiceCenterObjectData CSCcreateIn) throws BSDMResourceException
  {
    return create (null, CSCcreateIn);
  }
  /**
   * Create a new CustomerServiceCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCcreateIn Input  Object.  Read-Only fields: ChgWho, ChgDate.  Derived Fields: ChgWho, ChgDate.
   * @return CustomerServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CustomerServiceCenterObjectData create (@HeaderParam ("context")BSDMSessionContext context,CustomerServiceCenterObjectData CSCcreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CustomerServiceCenterCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CSCcreateIn != null) CustomerServiceCenterObjectHelper.toMap (CSCcreateIn, record, "CustomerServiceCenter");
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
return CustomerServiceCenterObjectHelper.fromMap (record, "CustomerServiceCenter");
}

  private BSDMInteractionSpec _CustomerServiceCenterUpdateSpec = null;
  /**
   * Update non-key fields of a CustomerServiceCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param CSCupdateIn Input  Object.  Read-Only fields: ChgWho, ChgDate.  Derived Fields: ChgWho, ChgDate.
   * @return CustomerServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CustomerServiceCenterObjectData update (CustomerServiceCenterObjectData CSCupdateIn) throws BSDMResourceException
  {
    return update (null, CSCupdateIn);
  }
  /**
   * Update non-key fields of a CustomerServiceCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCupdateIn Input  Object.  Read-Only fields: ChgWho, ChgDate.  Derived Fields: ChgWho, ChgDate.
   * @return CustomerServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CustomerServiceCenterObjectData update (@HeaderParam ("context")BSDMSessionContext context,CustomerServiceCenterObjectData CSCupdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CustomerServiceCenterUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CSCupdateIn != null) CustomerServiceCenterObjectHelper.toMap (CSCupdateIn, record, "CustomerServiceCenter");
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
return CustomerServiceCenterObjectHelper.fromMap (record, "CustomerServiceCenter");
}

  /**

   * Get a CustomerServiceCenter..

   * Convenience method using default BSDMSessionContext.

   * @param CSCgetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CustomerServiceCenterObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CustomerServiceCenterObjectData get (CustomerServiceCenterObjectKeyData CSCgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, CSCgetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a CustomerServiceCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCgetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CustomerServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CustomerServiceCenterObjectData get (BSDMSessionContext context, CustomerServiceCenterObjectKeyData CSCgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CSCgetIn, defaultAction);
       
     cManager.checkConstraints(CSCgetIn, constraintAction);
       return get (context, CSCgetIn);
  }

  /**

   * Find CustomerServiceCenters..

   * Convenience method using default BSDMSessionContext.

   * @param CSCfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CustomerServiceCenterObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CustomerServiceCenterObjectDataList find (CustomerServiceCenterObjectFilter CSCfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, CSCfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find CustomerServiceCenters..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CustomerServiceCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CustomerServiceCenterObjectDataList find (BSDMSessionContext context, CustomerServiceCenterObjectFilter CSCfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CSCfindIn, defaultAction);
       
     cManager.checkConstraints(CSCfindIn, constraintAction);
       return find (context, CSCfindIn);
  }

  /**

   * Create a new CustomerServiceCenter..

   * Convenience method using default BSDMSessionContext.

   * @param CSCcreateIn Input  Object.  Read-Only fields: ChgWho, ChgDate.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CustomerServiceCenterObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CustomerServiceCenterObjectData create (CustomerServiceCenterObjectData CSCcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, CSCcreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new CustomerServiceCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCcreateIn Input  Object.  Read-Only fields: ChgWho, ChgDate.  Derived Fields: ChgWho, ChgDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CustomerServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CustomerServiceCenterObjectData create (BSDMSessionContext context, CustomerServiceCenterObjectData CSCcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CSCcreateIn, defaultAction);
       
     cManager.checkConstraints(CSCcreateIn, constraintAction);
       return create (context, CSCcreateIn);
  }

  /**

   * Update non-key fields of a CustomerServiceCenter row..

   * Convenience method using default BSDMSessionContext.

   * @param CSCupdateIn Input  Object.  Read-Only fields: ChgWho, ChgDate.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CustomerServiceCenterObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CustomerServiceCenterObjectData update (CustomerServiceCenterObjectData CSCupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, CSCupdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a CustomerServiceCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCupdateIn Input  Object.  Read-Only fields: ChgWho, ChgDate.  Derived Fields: ChgWho, ChgDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CustomerServiceCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CustomerServiceCenterObjectData update (BSDMSessionContext context, CustomerServiceCenterObjectData CSCupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CSCupdateIn, defaultAction);
       
     cManager.checkConstraints(CSCupdateIn, constraintAction);
       return update (context, CSCupdateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public CustomerServiceCenterBean ()
  {
    try
    {
      _CustomerServiceCenterGetSpec = new BSDMInteractionSpec("CustomerServiceCenterGet", ApiMappings.getCallName ("CustomerServiceCenterGet"), Boolean.TRUE);

      _CustomerServiceCenterFindSpec = new BSDMInteractionSpec("CustomerServiceCenterFind", ApiMappings.getCallName ("CustomerServiceCenterFind"), Boolean.TRUE);

      _CustomerServiceCenterCreateSpec = new BSDMInteractionSpec("CustomerServiceCenterCreate", ApiMappings.getCallName ("CustomerServiceCenterCreate"), Boolean.TRUE);

      _CustomerServiceCenterUpdateSpec = new BSDMInteractionSpec("CustomerServiceCenterUpdate", ApiMappings.getCallName ("CustomerServiceCenterUpdate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public CustomerServiceCenterBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public CustomerServiceCenterBean(BSDMSettings settings, BSDMConnectionManager cm)
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
