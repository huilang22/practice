
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: SecurityAciBean.java
 * Definition File: Admin/SecurityAci.xml
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
import com.csgsystems.bp.interfaces.SecurityAciInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="SecurityAciSessionBean"
 * display-name="SecurityAci Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/SecurityAciBean"
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

@Stateless(name="SecurityAciBean", mappedName = "SecurityAci")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("SecurityAcis")

public class SecurityAciBean implements SecurityAciInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _SecurityAciCreateInternalSpec = null;
  /**
   * Create a ACI record..
   * Convenience method using default BSDMSessionContext.
   * @param AciCreateIn Input  Object.
   * @param user_name.
   * @return SecurityAciObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public SecurityAciObjectData createInternal (SecurityAciObjectData AciCreateIn, String user_name) throws BSDMResourceException
  {
    return createInternal (null, AciCreateIn, user_name);
  }
  /**
   * Create a ACI record..
   * @param context The session context to use when connecting to the APITS server.
   * @param AciCreateIn Input  Object.
   * @param user_name.
   * @return SecurityAciObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("createInternal")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public SecurityAciObjectData createInternal (@HeaderParam ("context")BSDMSessionContext context,SecurityAciObjectData AciCreateIn,@FormParam("user_name")String user_name) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_SecurityAciCreateInternalSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AciCreateIn != null) SecurityAciObjectHelper.toMap (AciCreateIn, record, "SecurityAci");

      if (user_name != null) record.put ("UserName", user_name);
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
return SecurityAciObjectHelper.fromMap (record, "SecurityAci");
}

  private BSDMInteractionSpec _SecurityAciDeleteInternalSpec = null;
  /**
   * Delete a ACI record..
   * Convenience method using default BSDMSessionContext.
   * @param AciDeleteIn Input  Object.
   * @return SecurityAciObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public SecurityAciObjectData deleteInternal (SecurityAciObjectData AciDeleteIn) throws BSDMResourceException
  {
    return deleteInternal (null, AciDeleteIn);
  }
  /**
   * Delete a ACI record..
   * @param context The session context to use when connecting to the APITS server.
   * @param AciDeleteIn Input  Object.
   * @return SecurityAciObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteInternal")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public SecurityAciObjectData deleteInternal (@HeaderParam ("context")BSDMSessionContext context,SecurityAciObjectData AciDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_SecurityAciDeleteInternalSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AciDeleteIn != null) SecurityAciObjectHelper.toMap (AciDeleteIn, record, "SecurityAci");
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
return SecurityAciObjectHelper.fromMap (record, "SecurityAci");
}

  private BSDMInteractionSpec _SecurityAciFindSpec = null;
  /**
   * Find SecurityAci that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SecurityAciFindIn Input Filter Object.
   * @return SecurityAciObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public SecurityAciObjectDataList find (SecurityAciObjectFilter SecurityAciFindIn) throws BSDMResourceException
  {
    return find (null, SecurityAciFindIn);
  }
  /**
   * Find SecurityAci that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityAciFindIn Input Filter Object.
   * @return SecurityAciObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public SecurityAciObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,SecurityAciObjectFilter SecurityAciFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_SecurityAciFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SecurityAciFindIn != null) SecurityAciObjectHelper.toMap (SecurityAciFindIn, record, "SecurityAci");
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
return SecurityAciObjectHelper.fromMapList (record, "SecurityAciList");
}

  /**

   * Create a ACI record..

   * Convenience method using default BSDMSessionContext.

   * @param AciCreateIn Input  Object.

   * @param user_name.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return SecurityAciObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public SecurityAciObjectData createInternal (SecurityAciObjectData AciCreateIn, String user_name, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return createInternal (null, AciCreateIn, user_name, defaultAction, constraintAction);
  }
  /** 
   * Create a ACI record..
   * @param context The session context to use when connecting to the APITS server.
   * @param AciCreateIn Input  Object.
   * @param user_name.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return SecurityAciObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public SecurityAciObjectData createInternal (BSDMSessionContext context, SecurityAciObjectData AciCreateIn, String user_name, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AciCreateIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(AciCreateIn, constraintAction);
       
    //Constraints not supported on Input-Column
return createInternal (context, AciCreateIn, user_name);
  }

  /**

   * Delete a ACI record..

   * Convenience method using default BSDMSessionContext.

   * @param AciDeleteIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return SecurityAciObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public SecurityAciObjectData deleteInternal (SecurityAciObjectData AciDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return deleteInternal (null, AciDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a ACI record..
   * @param context The session context to use when connecting to the APITS server.
   * @param AciDeleteIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return SecurityAciObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public SecurityAciObjectData deleteInternal (BSDMSessionContext context, SecurityAciObjectData AciDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AciDeleteIn, defaultAction);
       
     cManager.checkConstraints(AciDeleteIn, constraintAction);
       return deleteInternal (context, AciDeleteIn);
  }

  /**

   * Find SecurityAci that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param SecurityAciFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return SecurityAciObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public SecurityAciObjectDataList find (SecurityAciObjectFilter SecurityAciFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, SecurityAciFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find SecurityAci that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityAciFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return SecurityAciObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public SecurityAciObjectDataList find (BSDMSessionContext context, SecurityAciObjectFilter SecurityAciFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SecurityAciFindIn, defaultAction);
       
     cManager.checkConstraints(SecurityAciFindIn, constraintAction);
       return find (context, SecurityAciFindIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public SecurityAciBean ()
  {
    try
    {
      _SecurityAciCreateInternalSpec = new BSDMInteractionSpec("SecurityAciCreateInternal", ApiMappings.getCallName ("SecurityAciCreateInternal"), Boolean.TRUE);

      _SecurityAciDeleteInternalSpec = new BSDMInteractionSpec("SecurityAciDeleteInternal", ApiMappings.getCallName ("SecurityAciDeleteInternal"), Boolean.TRUE);

      _SecurityAciFindSpec = new BSDMInteractionSpec("SecurityAciFind", ApiMappings.getCallName ("SecurityAciFind"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public SecurityAciBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public SecurityAciBean(BSDMSettings settings, BSDMConnectionManager cm)
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
