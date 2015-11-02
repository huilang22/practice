
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: SecurityRoleBean.java
 * Definition File: Admin/SecurityRole.xml
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
import com.csgsystems.bp.interfaces.SecurityRoleInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="SecurityRoleSessionBean"
 * display-name="SecurityRole Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/SecurityRoleBean"
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

@Stateless(name="SecurityRoleBean", mappedName = "SecurityRole")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("SecurityRoles")

public class SecurityRoleBean implements SecurityRoleInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _SecurityRoleFindSpec = null;
  /**
   * Find SecurityRoles that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SecurityRoleFindIn Input Filter Object.
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public SecurityRoleObjectDataList find (SecurityRoleObjectFilter SecurityRoleFindIn) throws BSDMResourceException
  {
    return find (null, SecurityRoleFindIn);
  }
  /**
   * Find SecurityRoles that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityRoleFindIn Input Filter Object.
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public SecurityRoleObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,SecurityRoleObjectFilter SecurityRoleFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_SecurityRoleFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SecurityRoleFindIn != null) SecurityRoleObjectHelper.toMap (SecurityRoleFindIn, record, "SecurityRole");
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
return SecurityRoleObjectHelper.fromMapList (record, "SecurityRoleList");
}

  private BSDMInteractionSpec _SecurityRoleFindByResourceNameSpec = null;
  /**
   * Get security role list bound to a security resource..
   * Convenience method using default BSDMSessionContext.
   * @param res_name.
   * @param language_code.
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public SecurityRoleObjectDataList findByResourceName (String res_name, Integer language_code) throws BSDMResourceException
  {
    return findByResourceName (null, res_name, language_code);
  }
  /**
   * Get security role list bound to a security resource..
   * @param context The session context to use when connecting to the APITS server.
   * @param res_name.
   * @param language_code.
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findByResourceName")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public SecurityRoleObjectDataList findByResourceName (@HeaderParam ("context")BSDMSessionContext context,String res_name,@FormParam("language_code")Integer language_code) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_SecurityRoleFindByResourceNameSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (res_name != null) record.put ("ResName", res_name);

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
return SecurityRoleObjectHelper.fromMapList (record, "SecurityRoleList");
}

  private BSDMInteractionSpec _SecurityRoleAssignSpec = null;
  /**
   * Assign Security Roles to A Security Resource..
   * Convenience method using default BSDMSessionContext.
   * @param SecurityRoleAssignIn Input List Object.
   * @param a_res_id.
   * @param a_user_name.
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public SecurityRoleObjectDataList assign (SecurityRoleObjectData[] SecurityRoleAssignIn, BigInteger a_res_id, String a_user_name) throws BSDMResourceException
  {
    return assign (null, SecurityRoleAssignIn, a_res_id, a_user_name);
  }
  /**
   * Assign Security Roles to A Security Resource..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityRoleAssignIn Input List Object.
   * @param a_res_id.
   * @param a_user_name.
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("assign")
@Produces({"application/json","application/xml"})
  public SecurityRoleObjectDataList assign (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("SecurityRoleObject")SecurityRoleObjectData[] SecurityRoleAssignIn,@QueryParam("a_res_id")BigInteger a_res_id,@QueryParam("a_user_name")String a_user_name) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_SecurityRoleAssignSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SecurityRoleAssignIn != null)
    {
      Object[] list = new Object[SecurityRoleAssignIn.length];
      for (int i = 0; i < SecurityRoleAssignIn.length; i++)
      {
        list[i] = null;
        list[i] = SecurityRoleObjectHelper.getMap (SecurityRoleAssignIn[i], (Map) list[i]);

        if (list[i] != null) ((Map) list[i]).put ("#NAME", "SecurityRole");
      }
      record.put ("SecurityRoleList", list);
    }

      if (a_res_id != null) record.put ("AResId", a_res_id);

      if (a_user_name != null) record.put ("AUserName", a_user_name);
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
return SecurityRoleObjectHelper.fromMapList (record, "SecurityRoleList");
}

  private BSDMInteractionSpec _SecurityRoleUnassignSpec = null;
  /**
   * Remove the bindings between Security Roles and A Security Resource..
   * Convenience method using default BSDMSessionContext.
   * @param SecurityRoleUnassignIn Input List Object.
   * @param b_res_id.
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public SecurityRoleObjectDataList unassign (SecurityRoleObjectData[] SecurityRoleUnassignIn, BigInteger b_res_id) throws BSDMResourceException
  {
    return unassign (null, SecurityRoleUnassignIn, b_res_id);
  }
  /**
   * Remove the bindings between Security Roles and A Security Resource..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityRoleUnassignIn Input List Object.
   * @param b_res_id.
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("unassign")
@Produces({"application/json","application/xml"})
  public SecurityRoleObjectDataList unassign (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("SecurityRoleObject")SecurityRoleObjectData[] SecurityRoleUnassignIn,@QueryParam("b_res_id")BigInteger b_res_id) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_SecurityRoleUnassignSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SecurityRoleUnassignIn != null)
    {
      Object[] list = new Object[SecurityRoleUnassignIn.length];
      for (int i = 0; i < SecurityRoleUnassignIn.length; i++)
      {
        list[i] = null;
        list[i] = SecurityRoleObjectHelper.getMap (SecurityRoleUnassignIn[i], (Map) list[i]);

        if (list[i] != null) ((Map) list[i]).put ("#NAME", "SecurityRole");
      }
      record.put ("SecurityRoleList", list);
    }

      if (b_res_id != null) record.put ("BResId", b_res_id);
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
return SecurityRoleObjectHelper.fromMapList (record, "SecurityRoleList");
}

  /**

   * Find SecurityRoles that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param SecurityRoleFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return SecurityRoleObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public SecurityRoleObjectDataList find (SecurityRoleObjectFilter SecurityRoleFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, SecurityRoleFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find SecurityRoles that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityRoleFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public SecurityRoleObjectDataList find (BSDMSessionContext context, SecurityRoleObjectFilter SecurityRoleFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SecurityRoleFindIn, defaultAction);
       
     cManager.checkConstraints(SecurityRoleFindIn, constraintAction);
       return find (context, SecurityRoleFindIn);
  }

  /**

   * Get security role list bound to a security resource..

   * Convenience method using default BSDMSessionContext.

   * @param res_name.

   * @param language_code.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return SecurityRoleObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public SecurityRoleObjectDataList findByResourceName (String res_name, Integer language_code, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findByResourceName (null, res_name, language_code, defaultAction, constraintAction);
  }
  /** 
   * Get security role list bound to a security resource..
   * @param context The session context to use when connecting to the APITS server.
   * @param res_name.
   * @param language_code.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public SecurityRoleObjectDataList findByResourceName (BSDMSessionContext context, String res_name, Integer language_code, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return findByResourceName (context, res_name, language_code);
  }

  /**

   * Assign Security Roles to A Security Resource..

   * Convenience method using default BSDMSessionContext.

   * @param SecurityRoleAssignIn Input List Object.

   * @param a_res_id.

   * @param a_user_name.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return SecurityRoleObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public SecurityRoleObjectDataList assign (SecurityRoleObjectData[] SecurityRoleAssignIn, BigInteger a_res_id, String a_user_name, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return assign (null, SecurityRoleAssignIn, a_res_id, a_user_name, defaultAction, constraintAction);
  }
  /** 
   * Assign Security Roles to A Security Resource..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityRoleAssignIn Input List Object.
   * @param a_res_id.
   * @param a_user_name.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public SecurityRoleObjectDataList assign (BSDMSessionContext context, SecurityRoleObjectData[] SecurityRoleAssignIn, BigInteger a_res_id, String a_user_name, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     //Defaulting not supported on Arrays
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     //Constraints not supported on Arrays
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return assign (context, SecurityRoleAssignIn, a_res_id, a_user_name);
  }

  /**

   * Remove the bindings between Security Roles and A Security Resource..

   * Convenience method using default BSDMSessionContext.

   * @param SecurityRoleUnassignIn Input List Object.

   * @param b_res_id.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return SecurityRoleObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public SecurityRoleObjectDataList unassign (SecurityRoleObjectData[] SecurityRoleUnassignIn, BigInteger b_res_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return unassign (null, SecurityRoleUnassignIn, b_res_id, defaultAction, constraintAction);
  }
  /** 
   * Remove the bindings between Security Roles and A Security Resource..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityRoleUnassignIn Input List Object.
   * @param b_res_id.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return SecurityRoleObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public SecurityRoleObjectDataList unassign (BSDMSessionContext context, SecurityRoleObjectData[] SecurityRoleUnassignIn, BigInteger b_res_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     //Defaulting not supported on Arrays
       
    //Defaulting not supported on Input-Column

     //Constraints not supported on Arrays
       
    //Constraints not supported on Input-Column
return unassign (context, SecurityRoleUnassignIn, b_res_id);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public SecurityRoleBean ()
  {
    try
    {
      _SecurityRoleFindSpec = new BSDMInteractionSpec("SecurityRoleFind", ApiMappings.getCallName ("SecurityRoleFind"), Boolean.TRUE);

      _SecurityRoleFindByResourceNameSpec = new BSDMInteractionSpec("SecurityRoleFindByResourceName", ApiMappings.getCallName ("SecurityRoleFindByResourceName"), Boolean.TRUE);

      _SecurityRoleAssignSpec = new BSDMInteractionSpec("SecurityRoleAssign", ApiMappings.getCallName ("SecurityRoleAssign"), Boolean.TRUE);

      _SecurityRoleUnassignSpec = new BSDMInteractionSpec("SecurityRoleUnassign", ApiMappings.getCallName ("SecurityRoleUnassign"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public SecurityRoleBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public SecurityRoleBean(BSDMSettings settings, BSDMConnectionManager cm)
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
