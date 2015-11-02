
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: CcAuditLogBean.java
 * Definition File: Customer/CcAuditLog.xml
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
import com.csgsystems.bp.interfaces.CcAuditLogInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="CcAuditLogSessionBean"
 * display-name="CcAuditLog Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/CcAuditLogBean"
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

@Stateless(name="CcAuditLogBean", mappedName = "CcAuditLog")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("CcAuditLogs")

public class CcAuditLogBean implements CcAuditLogInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _CcAuditLogGetSpec = null;
  /**
   * 
         The CcAuditLogGet method retrieves one CcAuditLog row.
       .
   * Convenience method using default BSDMSessionContext.
   * @param CALget_In Input Object Key.
   * @return CcAuditLogObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CcAuditLogObjectData get (CcAuditLogObjectKeyData CALget_In) throws BSDMResourceException
  {
    return get (null, CALget_In);
  }
  /**
   * 
         The CcAuditLogGet method retrieves one CcAuditLog row.
       .
   * @param context The session context to use when connecting to the APITS server.
   * @param CALget_In Input Object Key.
   * @return CcAuditLogObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public CcAuditLogObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam CcAuditLogObjectKeyData CALget_In) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CcAuditLogGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CALget_In != null) CcAuditLogObjectKeyHelper.toMap (CALget_In, record, "CcAuditLog");
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
return CcAuditLogObjectHelper.fromMap (record, "CcAuditLog");
}

  private BSDMInteractionSpec _CcAuditLogFindSpec = null;
  /**
   * 
        Finds all CcAuditLog objects matching the supplied filter.
      .
   * Convenience method using default BSDMSessionContext.
   * @param CALfind_In Input Filter Object.
   * @return CcAuditLogObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CcAuditLogObjectDataList find (CcAuditLogObjectFilter CALfind_In) throws BSDMResourceException
  {
    return find (null, CALfind_In);
  }
  /**
   * 
        Finds all CcAuditLog objects matching the supplied filter.
      .
   * @param context The session context to use when connecting to the APITS server.
   * @param CALfind_In Input Filter Object.
   * @return CcAuditLogObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CcAuditLogObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,CcAuditLogObjectFilter CALfind_In) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CcAuditLogFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CALfind_In != null) CcAuditLogObjectHelper.toMap (CALfind_In, record, "CcAuditLog");
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
return CcAuditLogObjectHelper.fromMapList (record, "CcAuditLogList");
}

  private BSDMInteractionSpec _CcAuditLogCreateSpec = null;
  /**
   * 
        Insert a new row in CC_AUDIT_LOG.
      .
   * Convenience method using default BSDMSessionContext.
   * @param CALcreate_In Input  Object.
   * @return CcAuditLogObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CcAuditLogObjectData create (CcAuditLogObjectData CALcreate_In) throws BSDMResourceException
  {
    return create (null, CALcreate_In);
  }
  /**
   * 
        Insert a new row in CC_AUDIT_LOG.
      .
   * @param context The session context to use when connecting to the APITS server.
   * @param CALcreate_In Input  Object.
   * @return CcAuditLogObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CcAuditLogObjectData create (@HeaderParam ("context")BSDMSessionContext context,CcAuditLogObjectData CALcreate_In) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CcAuditLogCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CALcreate_In != null) CcAuditLogObjectHelper.toMap (CALcreate_In, record, "CcAuditLog");
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
return CcAuditLogObjectHelper.fromMap (record, "CcAuditLog");
}

  /**

   * 
         The CcAuditLogGet method retrieves one CcAuditLog row.
       .

   * Convenience method using default BSDMSessionContext.

   * @param CALget_In Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CcAuditLogObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CcAuditLogObjectData get (CcAuditLogObjectKeyData CALget_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, CALget_In, defaultAction, constraintAction);
  }
  /** 
   * 
         The CcAuditLogGet method retrieves one CcAuditLog row.
       .
   * @param context The session context to use when connecting to the APITS server.
   * @param CALget_In Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CcAuditLogObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CcAuditLogObjectData get (BSDMSessionContext context, CcAuditLogObjectKeyData CALget_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CALget_In, defaultAction);
       
     cManager.checkConstraints(CALget_In, constraintAction);
       return get (context, CALget_In);
  }

  /**

   * 
        Finds all CcAuditLog objects matching the supplied filter.
      .

   * Convenience method using default BSDMSessionContext.

   * @param CALfind_In Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CcAuditLogObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CcAuditLogObjectDataList find (CcAuditLogObjectFilter CALfind_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, CALfind_In, defaultAction, constraintAction);
  }
  /** 
   * 
        Finds all CcAuditLog objects matching the supplied filter.
      .
   * @param context The session context to use when connecting to the APITS server.
   * @param CALfind_In Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CcAuditLogObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CcAuditLogObjectDataList find (BSDMSessionContext context, CcAuditLogObjectFilter CALfind_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CALfind_In, defaultAction);
       
     cManager.checkConstraints(CALfind_In, constraintAction);
       return find (context, CALfind_In);
  }

  /**

   * 
        Insert a new row in CC_AUDIT_LOG.
      .

   * Convenience method using default BSDMSessionContext.

   * @param CALcreate_In Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CcAuditLogObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CcAuditLogObjectData create (CcAuditLogObjectData CALcreate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, CALcreate_In, defaultAction, constraintAction);
  }
  /** 
   * 
        Insert a new row in CC_AUDIT_LOG.
      .
   * @param context The session context to use when connecting to the APITS server.
   * @param CALcreate_In Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CcAuditLogObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CcAuditLogObjectData create (BSDMSessionContext context, CcAuditLogObjectData CALcreate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CALcreate_In, defaultAction);
       
     cManager.checkConstraints(CALcreate_In, constraintAction);
       return create (context, CALcreate_In);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public CcAuditLogBean ()
  {
    try
    {
      _CcAuditLogGetSpec = new BSDMInteractionSpec("CcAuditLogGet", ApiMappings.getCallName ("CcAuditLogGet"), Boolean.TRUE);

      _CcAuditLogFindSpec = new BSDMInteractionSpec("CcAuditLogFind", ApiMappings.getCallName ("CcAuditLogFind"), Boolean.TRUE);

      _CcAuditLogCreateSpec = new BSDMInteractionSpec("CcAuditLogCreate", ApiMappings.getCallName ("CcAuditLogCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public CcAuditLogBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public CcAuditLogBean(BSDMSettings settings, BSDMConnectionManager cm)
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
