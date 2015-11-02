
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: ServicePricingPlanBean.java
 * Definition File: Admin/ServicePricingPlan.xml
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
import com.csgsystems.bp.interfaces.ServicePricingPlanInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="ServicePricingPlanSessionBean"
 * display-name="ServicePricingPlan Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/ServicePricingPlanBean"
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

@Stateless(name="ServicePricingPlanBean", mappedName = "ServicePricingPlan")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("ServicePricingPlans")

public class ServicePricingPlanBean implements ServicePricingPlanInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _ServicePricingPlanGetSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param ServicePricingPlanGetIn Input Object Key.
   * @return ServicePricingPlanObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServicePricingPlanObjectData get (ServicePricingPlanObjectKeyData ServicePricingPlanGetIn) throws BSDMResourceException
  {
    return get (null, ServicePricingPlanGetIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param ServicePricingPlanGetIn Input Object Key.
   * @return ServicePricingPlanObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public ServicePricingPlanObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam ServicePricingPlanObjectKeyData ServicePricingPlanGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServicePricingPlanGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ServicePricingPlanGetIn != null) ServicePricingPlanObjectKeyHelper.toMap (ServicePricingPlanGetIn, record, "ServicePricingPlan");
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
return ServicePricingPlanObjectHelper.fromMap (record, "ServicePricingPlan");
}

  private BSDMInteractionSpec _ServicePricingPlanFindSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param ServicePricingPlanFindIn Input Filter Object.
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServicePricingPlanObjectDataList find (ServicePricingPlanObjectFilter ServicePricingPlanFindIn) throws BSDMResourceException
  {
    return find (null, ServicePricingPlanFindIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param ServicePricingPlanFindIn Input Filter Object.
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ServicePricingPlanObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,ServicePricingPlanObjectFilter ServicePricingPlanFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServicePricingPlanFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ServicePricingPlanFindIn != null) ServicePricingPlanObjectHelper.toMap (ServicePricingPlanFindIn, record, "ServicePricingPlan");
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
return ServicePricingPlanObjectHelper.fromMapList (record, "ServicePricingPlanList");
}

  private BSDMInteractionSpec _ServicePricingPlanFindByAccountSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param account_internal_id.
   * @param language_code.
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServicePricingPlanObjectDataList findByAccount (Integer account_internal_id, Integer language_code) throws BSDMResourceException
  {
    return findByAccount (null, account_internal_id, language_code);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param account_internal_id.
   * @param language_code.
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findByAccount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ServicePricingPlanObjectDataList findByAccount (@HeaderParam ("context")BSDMSessionContext context,Integer account_internal_id,@FormParam("language_code")Integer language_code) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServicePricingPlanFindByAccountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (account_internal_id != null) record.put ("AccountInternalId", account_internal_id);

      if (language_code != null) record.put ("LanguageCode", language_code);
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
return ServicePricingPlanObjectHelper.fromMapList (record, "ServicePricingPlanList");
}

  private BSDMInteractionSpec _ServicePricingPlanFindByHierarchySpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param hierarchy_id.
   * @param _language_code.
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServicePricingPlanObjectDataList findByHierarchy (Integer hierarchy_id, Integer _language_code) throws BSDMResourceException
  {
    return findByHierarchy (null, hierarchy_id, _language_code);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param hierarchy_id.
   * @param _language_code.
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findByHierarchy")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ServicePricingPlanObjectDataList findByHierarchy (@HeaderParam ("context")BSDMSessionContext context,Integer hierarchy_id,@FormParam("_language_code")Integer _language_code) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServicePricingPlanFindByHierarchySpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (hierarchy_id != null) record.put ("HierarchyId", hierarchy_id);

      if (_language_code != null) record.put ("LanguageCode", _language_code);
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
return ServicePricingPlanObjectHelper.fromMapList (record, "ServicePricingPlanList");
}

  /**

   * Convenience method using default BSDMSessionContext.

   * @param ServicePricingPlanGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServicePricingPlanObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServicePricingPlanObjectData get (ServicePricingPlanObjectKeyData ServicePricingPlanGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, ServicePricingPlanGetIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param ServicePricingPlanGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServicePricingPlanObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServicePricingPlanObjectData get (BSDMSessionContext context, ServicePricingPlanObjectKeyData ServicePricingPlanGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ServicePricingPlanGetIn, defaultAction);
       
     cManager.checkConstraints(ServicePricingPlanGetIn, constraintAction);
       return get (context, ServicePricingPlanGetIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param ServicePricingPlanFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServicePricingPlanObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServicePricingPlanObjectDataList find (ServicePricingPlanObjectFilter ServicePricingPlanFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, ServicePricingPlanFindIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param ServicePricingPlanFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServicePricingPlanObjectDataList find (BSDMSessionContext context, ServicePricingPlanObjectFilter ServicePricingPlanFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ServicePricingPlanFindIn, defaultAction);
       
     cManager.checkConstraints(ServicePricingPlanFindIn, constraintAction);
       return find (context, ServicePricingPlanFindIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param account_internal_id.

   * @param language_code.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServicePricingPlanObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServicePricingPlanObjectDataList findByAccount (Integer account_internal_id, Integer language_code, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findByAccount (null, account_internal_id, language_code, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param account_internal_id.
   * @param language_code.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServicePricingPlanObjectDataList findByAccount (BSDMSessionContext context, Integer account_internal_id, Integer language_code, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return findByAccount (context, account_internal_id, language_code);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param hierarchy_id.

   * @param _language_code.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServicePricingPlanObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServicePricingPlanObjectDataList findByHierarchy (Integer hierarchy_id, Integer _language_code, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findByHierarchy (null, hierarchy_id, _language_code, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param hierarchy_id.
   * @param _language_code.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServicePricingPlanObjectDataList findByHierarchy (BSDMSessionContext context, Integer hierarchy_id, Integer _language_code, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return findByHierarchy (context, hierarchy_id, _language_code);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public ServicePricingPlanBean ()
  {
    try
    {
      _ServicePricingPlanGetSpec = new BSDMInteractionSpec("ServicePricingPlanGet", ApiMappings.getCallName ("ServicePricingPlanGet"), Boolean.TRUE);

      _ServicePricingPlanFindSpec = new BSDMInteractionSpec("ServicePricingPlanFind", ApiMappings.getCallName ("ServicePricingPlanFind"), Boolean.TRUE);

      _ServicePricingPlanFindByAccountSpec = new BSDMInteractionSpec("ServicePricingPlanFindByAccount", ApiMappings.getCallName ("ServicePricingPlanFindByAccount"), Boolean.TRUE);

      _ServicePricingPlanFindByHierarchySpec = new BSDMInteractionSpec("ServicePricingPlanFindByHierarchy", ApiMappings.getCallName ("ServicePricingPlanFindByHierarchy"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public ServicePricingPlanBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public ServicePricingPlanBean(BSDMSettings settings, BSDMConnectionManager cm)
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
