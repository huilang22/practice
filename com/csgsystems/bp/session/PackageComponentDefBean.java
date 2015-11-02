
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: PackageComponentDefBean.java
 * Definition File: Admin/PackageComponentDef.xml
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
import com.csgsystems.bp.interfaces.PackageComponentDefInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="PackageComponentDefSessionBean"
 * display-name="PackageComponentDef Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/PackageComponentDefBean"
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

@Stateless(name="PackageComponentDefBean", mappedName = "PackageComponentDef")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("PackageComponentDefs")

public class PackageComponentDefBean implements PackageComponentDefInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _PackageComponentDefGetSpec = null;
  /**
   * Retrieve a unique PackageComponentDef row..
   * Convenience method using default BSDMSessionContext.
   * @param PCDGetIn Input Object Key.
   * @return PCDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PCDObjectData get (PCDObjectKeyData PCDGetIn) throws BSDMResourceException
  {
    return get (null, PCDGetIn);
  }
  /**
   * Retrieve a unique PackageComponentDef row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCDGetIn Input Object Key.
   * @return PCDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public PCDObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam PCDObjectKeyData PCDGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PackageComponentDefGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PCDGetIn != null) PCDObjectKeyHelper.toMap (PCDGetIn, record, "PackageComponentDef");
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
return PCDObjectHelper.fromMap (record, "PackageComponentDef");
}

  private BSDMInteractionSpec _PackageComponentDefFindSpec = null;
  /**
   * Find PackageComponentDef rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PCDFindIn Input Filter Object.
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PCDObjectDataList find (PCDObjectFilter PCDFindIn) throws BSDMResourceException
  {
    return find (null, PCDFindIn);
  }
  /**
   * Find PackageComponentDef rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCDFindIn Input Filter Object.
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PCDObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,PCDObjectFilter PCDFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PackageComponentDefFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PCDFindIn != null) PCDObjectHelper.toMap (PCDFindIn, record, "PackageComponentDef");
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
return PCDObjectHelper.fromMapList (record, "PackageComponentDefList");
}

  private BSDMInteractionSpec _PackageComponentDefFindByAccountSpec = null;
  /**
   * Find PackageComponentDef rows for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param language_code.
   * @param account_internal_id.
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PCDObjectDataList findByAccount (Integer language_code, Integer account_internal_id) throws BSDMResourceException
  {
    return findByAccount (null, language_code, account_internal_id);
  }
  /**
   * Find PackageComponentDef rows for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param language_code.
   * @param account_internal_id.
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findByAccount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PCDObjectDataList findByAccount (@HeaderParam ("context")BSDMSessionContext context,Integer language_code,@FormParam("account_internal_id")Integer account_internal_id) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PackageComponentDefFindByAccountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (language_code != null) record.put ("LanguageCode", language_code);

      if (account_internal_id != null) record.put ("AccountInternalId", account_internal_id);
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
return PCDObjectHelper.fromMapList (record, "PackageComponentDefList");
}

  private BSDMInteractionSpec _PackageComponentDefFindByServiceSpec = null;
  /**
   * Find PackageComponentDef rows for a Service..
   * Convenience method using default BSDMSessionContext.
   * @param LanguageCode.
   * @param service_internal_id.
   * @param service_internal_id_resets.
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PCDObjectDataList findByService (Integer LanguageCode, Integer service_internal_id, Integer service_internal_id_resets) throws BSDMResourceException
  {
    return findByService (null, LanguageCode, service_internal_id, service_internal_id_resets);
  }
  /**
   * Find PackageComponentDef rows for a Service..
   * @param context The session context to use when connecting to the APITS server.
   * @param LanguageCode.
   * @param service_internal_id.
   * @param service_internal_id_resets.
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findByService")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PCDObjectDataList findByService (@HeaderParam ("context")BSDMSessionContext context,Integer LanguageCode,@FormParam("service_internal_id")Integer service_internal_id,@FormParam("service_internal_id_resets")Integer service_internal_id_resets) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PackageComponentDefFindByServiceSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (LanguageCode != null) record.put ("LanguageCode", LanguageCode);

      if (service_internal_id != null) record.put ("ServiceInternalId", service_internal_id);

      if (service_internal_id_resets != null) record.put ("ServiceInternalIdResets", service_internal_id_resets);
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
return PCDObjectHelper.fromMapList (record, "PackageComponentDefList");
}

  /**

   * Retrieve a unique PackageComponentDef row..

   * Convenience method using default BSDMSessionContext.

   * @param PCDGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PCDObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PCDObjectData get (PCDObjectKeyData PCDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, PCDGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a unique PackageComponentDef row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCDGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PCDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PCDObjectData get (BSDMSessionContext context, PCDObjectKeyData PCDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PCDGetIn, defaultAction);
       
     cManager.checkConstraints(PCDGetIn, constraintAction);
       return get (context, PCDGetIn);
  }

  /**

   * Find PackageComponentDef rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param PCDFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PCDObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PCDObjectDataList find (PCDObjectFilter PCDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, PCDFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find PackageComponentDef rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PCDFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PCDObjectDataList find (BSDMSessionContext context, PCDObjectFilter PCDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PCDFindIn, defaultAction);
       
     cManager.checkConstraints(PCDFindIn, constraintAction);
       return find (context, PCDFindIn);
  }

  /**

   * Find PackageComponentDef rows for an Account..

   * Convenience method using default BSDMSessionContext.

   * @param language_code.

   * @param account_internal_id.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PCDObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PCDObjectDataList findByAccount (Integer language_code, Integer account_internal_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findByAccount (null, language_code, account_internal_id, defaultAction, constraintAction);
  }
  /** 
   * Find PackageComponentDef rows for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param language_code.
   * @param account_internal_id.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PCDObjectDataList findByAccount (BSDMSessionContext context, Integer language_code, Integer account_internal_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return findByAccount (context, language_code, account_internal_id);
  }

  /**

   * Find PackageComponentDef rows for a Service..

   * Convenience method using default BSDMSessionContext.

   * @param LanguageCode.

   * @param service_internal_id.

   * @param service_internal_id_resets.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PCDObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PCDObjectDataList findByService (Integer LanguageCode, Integer service_internal_id, Integer service_internal_id_resets, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findByService (null, LanguageCode, service_internal_id, service_internal_id_resets, defaultAction, constraintAction);
  }
  /** 
   * Find PackageComponentDef rows for a Service..
   * @param context The session context to use when connecting to the APITS server.
   * @param LanguageCode.
   * @param service_internal_id.
   * @param service_internal_id_resets.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PCDObjectDataList findByService (BSDMSessionContext context, Integer LanguageCode, Integer service_internal_id, Integer service_internal_id_resets, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return findByService (context, LanguageCode, service_internal_id, service_internal_id_resets);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public PackageComponentDefBean ()
  {
    try
    {
      _PackageComponentDefGetSpec = new BSDMInteractionSpec("PackageComponentDefGet", ApiMappings.getCallName ("PackageComponentDefGet"), Boolean.TRUE);

      _PackageComponentDefFindSpec = new BSDMInteractionSpec("PackageComponentDefFind", ApiMappings.getCallName ("PackageComponentDefFind"), Boolean.TRUE);

      _PackageComponentDefFindByAccountSpec = new BSDMInteractionSpec("PackageComponentDefFindByAccount", ApiMappings.getCallName ("PackageComponentDefFindByAccount"), Boolean.TRUE);

      _PackageComponentDefFindByServiceSpec = new BSDMInteractionSpec("PackageComponentDefFindByService", ApiMappings.getCallName ("PackageComponentDefFindByService"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public PackageComponentDefBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public PackageComponentDefBean(BSDMSettings settings, BSDMConnectionManager cm)
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
