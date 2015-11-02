
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: CsrBean.java
 * Definition File: Admin/Csr.xml
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
import com.csgsystems.bp.interfaces.CsrInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="CsrSessionBean"
 * display-name="Csr Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/CsrBean"
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

@Stateless(name="CsrBean", mappedName = "Csr")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("Csrs")

public class CsrBean implements CsrInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _CsrGetSpec = null;
  /**
   * Get a unique Csr row..
   * Convenience method using default BSDMSessionContext.
   * @param CSRgetIn Input Object Key.
   * @return CsrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CsrObjectData get (CsrObjectKeyData CSRgetIn) throws BSDMResourceException
  {
    return get (null, CSRgetIn);
  }
  /**
   * Get a unique Csr row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSRgetIn Input Object Key.
   * @return CsrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public CsrObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam CsrObjectKeyData CSRgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CsrGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CSRgetIn != null) CsrObjectKeyHelper.toMap (CSRgetIn, record, "Csr");
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
return CsrObjectHelper.fromMap (record, "Csr");
}

  private BSDMInteractionSpec _CsrFindSpec = null;
  /**
   * Find Csr's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CSRfindIn Input Filter Object.
   * @return CsrObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CsrObjectDataList find (CsrObjectFilter CSRfindIn) throws BSDMResourceException
  {
    return find (null, CSRfindIn);
  }
  /**
   * Find Csr's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSRfindIn Input Filter Object.
   * @return CsrObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CsrObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,CsrObjectFilter CSRfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CsrFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CSRfindIn != null) CsrObjectHelper.toMap (CSRfindIn, record, "Csr");
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
return CsrObjectHelper.fromMapList (record, "CsrList");
}

  private BSDMInteractionSpec _CsrGroupSpec = null;
  /**
   * Get a list of Groups the Csr is a member of..
   * Convenience method using default BSDMSessionContext.
   * @param user_name.
   * @return CsrGroupOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CsrGroupOutputData group (String user_name) throws BSDMResourceException
  {
    return group (null, user_name);
  }
  /**
   * Get a list of Groups the Csr is a member of..
   * @param context The session context to use when connecting to the APITS server.
   * @param user_name.
   * @return CsrGroupOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("group")
@Produces({"application/json","application/xml"})
  public CsrGroupOutputData group (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("user_name")String user_name) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CsrGroupSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

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
return CsrGroupOutputHelper.fromMap (record);
}

  /**

   * Get a unique Csr row..

   * Convenience method using default BSDMSessionContext.

   * @param CSRgetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CsrObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CsrObjectData get (CsrObjectKeyData CSRgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, CSRgetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique Csr row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSRgetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CsrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CsrObjectData get (BSDMSessionContext context, CsrObjectKeyData CSRgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CSRgetIn, defaultAction);
       
     cManager.checkConstraints(CSRgetIn, constraintAction);
       return get (context, CSRgetIn);
  }

  /**

   * Find Csr's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param CSRfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CsrObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CsrObjectDataList find (CsrObjectFilter CSRfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, CSRfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find Csr's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSRfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CsrObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CsrObjectDataList find (BSDMSessionContext context, CsrObjectFilter CSRfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CSRfindIn, defaultAction);
       
     cManager.checkConstraints(CSRfindIn, constraintAction);
       return find (context, CSRfindIn);
  }

  /**

   * Get a list of Groups the Csr is a member of..

   * Convenience method using default BSDMSessionContext.

   * @param user_name.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CsrGroupOutputData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CsrGroupOutputData group (String user_name, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return group (null, user_name, defaultAction, constraintAction);
  }
  /** 
   * Get a list of Groups the Csr is a member of..
   * @param context The session context to use when connecting to the APITS server.
   * @param user_name.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CsrGroupOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CsrGroupOutputData group (BSDMSessionContext context, String user_name, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column
return group (context, user_name);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public CsrBean ()
  {
    try
    {
      _CsrGetSpec = new BSDMInteractionSpec("CsrGet", ApiMappings.getCallName ("CsrGet"), Boolean.TRUE);

      _CsrFindSpec = new BSDMInteractionSpec("CsrFind", ApiMappings.getCallName ("CsrFind"), Boolean.TRUE);

      _CsrGroupSpec = new BSDMInteractionSpec("CsrGroup", ApiMappings.getCallName ("CsrGroup"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public CsrBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public CsrBean(BSDMSettings settings, BSDMConnectionManager cm)
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
