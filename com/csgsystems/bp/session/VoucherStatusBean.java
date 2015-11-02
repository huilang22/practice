
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: VoucherStatusBean.java
 * Definition File: Catalog/VoucherStatus.xml
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
import com.csgsystems.bp.interfaces.VoucherStatusInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="VoucherStatusSessionBean"
 * display-name="VoucherStatus Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/VoucherStatusBean"
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

@Stateless(name="VoucherStatusBean", mappedName = "VoucherStatus")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("VoucherStatus")

public class VoucherStatusBean implements VoucherStatusInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _VoucherStatusCreateSpec = null;
  /**
   * Create A New Record Using Required Fields In voucher_status..
   * Convenience method using default BSDMSessionContext.
   * @param VouSCIn Input  Object.
   * @return VoucherStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherStatusObjectData create (VoucherStatusObjectData VouSCIn) throws BSDMResourceException
  {
    return create (null, VouSCIn);
  }
  /**
   * Create A New Record Using Required Fields In voucher_status..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSCIn Input  Object.
   * @return VoucherStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VoucherStatusObjectData create (@HeaderParam ("context")BSDMSessionContext context,VoucherStatusObjectData VouSCIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherStatusCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouSCIn != null) VoucherStatusObjectHelper.toMap (VouSCIn, record, "VoucherStatus");
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
return VoucherStatusObjectHelper.fromMap (record, "VoucherStatus");
}

  private BSDMInteractionSpec _VoucherStatusUpdateSpec = null;
  /**
   * Update Non-key Fields For A Row In voucher_status..
   * Convenience method using default BSDMSessionContext.
   * @param VouSUIn Input  Object.
   * @return VoucherStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherStatusObjectData update (VoucherStatusObjectData VouSUIn) throws BSDMResourceException
  {
    return update (null, VouSUIn);
  }
  /**
   * Update Non-key Fields For A Row In voucher_status..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSUIn Input  Object.
   * @return VoucherStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VoucherStatusObjectData update (@HeaderParam ("context")BSDMSessionContext context,VoucherStatusObjectData VouSUIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherStatusUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouSUIn != null) VoucherStatusObjectHelper.toMap (VouSUIn, record, "VoucherStatus");
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
return VoucherStatusObjectHelper.fromMap (record, "VoucherStatus");
}

  private BSDMInteractionSpec _VoucherStatusGetSpec = null;
  /**
   * Get Voucher Status That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouSGIn Input Object Key.
   * @return VoucherStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherStatusObjectData get (VoucherStatusObjectKeyData VouSGIn) throws BSDMResourceException
  {
    return get (null, VouSGIn);
  }
  /**
   * Get Voucher Status That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSGIn Input Object Key.
   * @return VoucherStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public VoucherStatusObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam VoucherStatusObjectKeyData VouSGIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherStatusGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouSGIn != null) VoucherStatusObjectKeyHelper.toMap (VouSGIn, record, "VoucherStatus");
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
return VoucherStatusObjectHelper.fromMap (record, "VoucherStatus");
}

  private BSDMInteractionSpec _VoucherStatusFindSpec = null;
  /**
   * Find Voucher Status That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouSFIn Input Filter Object.
   * @return VoucherStatusObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherStatusObjectDataList find (VoucherStatusObjectFilter VouSFIn) throws BSDMResourceException
  {
    return find (null, VouSFIn);
  }
  /**
   * Find Voucher Status That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSFIn Input Filter Object.
   * @return VoucherStatusObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VoucherStatusObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,VoucherStatusObjectFilter VouSFIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherStatusFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouSFIn != null) VoucherStatusObjectHelper.toMap (VouSFIn, record, "VoucherStatus");
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
return VoucherStatusObjectHelper.fromMapList (record, "VoucherStatusList");
}

  /**

   * Create A New Record Using Required Fields In voucher_status..

   * Convenience method using default BSDMSessionContext.

   * @param VouSCIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherStatusObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherStatusObjectData create (VoucherStatusObjectData VouSCIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, VouSCIn, defaultAction, constraintAction);
  }
  /** 
   * Create A New Record Using Required Fields In voucher_status..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSCIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherStatusObjectData create (BSDMSessionContext context, VoucherStatusObjectData VouSCIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouSCIn, defaultAction);
       
     cManager.checkConstraints(VouSCIn, constraintAction);
       return create (context, VouSCIn);
  }

  /**

   * Update Non-key Fields For A Row In voucher_status..

   * Convenience method using default BSDMSessionContext.

   * @param VouSUIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherStatusObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherStatusObjectData update (VoucherStatusObjectData VouSUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, VouSUIn, defaultAction, constraintAction);
  }
  /** 
   * Update Non-key Fields For A Row In voucher_status..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSUIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherStatusObjectData update (BSDMSessionContext context, VoucherStatusObjectData VouSUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouSUIn, defaultAction);
       
     cManager.checkConstraints(VouSUIn, constraintAction);
       return update (context, VouSUIn);
  }

  /**

   * Get Voucher Status That Match The Supplied Filter..

   * Convenience method using default BSDMSessionContext.

   * @param VouSGIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherStatusObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherStatusObjectData get (VoucherStatusObjectKeyData VouSGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, VouSGIn, defaultAction, constraintAction);
  }
  /** 
   * Get Voucher Status That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSGIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherStatusObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherStatusObjectData get (BSDMSessionContext context, VoucherStatusObjectKeyData VouSGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouSGIn, defaultAction);
       
     cManager.checkConstraints(VouSGIn, constraintAction);
       return get (context, VouSGIn);
  }

  /**

   * Find Voucher Status That Match The Supplied Filter..

   * Convenience method using default BSDMSessionContext.

   * @param VouSFIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherStatusObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherStatusObjectDataList find (VoucherStatusObjectFilter VouSFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, VouSFIn, defaultAction, constraintAction);
  }
  /** 
   * Find Voucher Status That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSFIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherStatusObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherStatusObjectDataList find (BSDMSessionContext context, VoucherStatusObjectFilter VouSFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouSFIn, defaultAction);
       
     cManager.checkConstraints(VouSFIn, constraintAction);
       return find (context, VouSFIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public VoucherStatusBean ()
  {
    try
    {
      _VoucherStatusCreateSpec = new BSDMInteractionSpec("VoucherStatusCreate", ApiMappings.getCallName ("VoucherStatusCreate"), Boolean.TRUE);

      _VoucherStatusUpdateSpec = new BSDMInteractionSpec("VoucherStatusUpdate", ApiMappings.getCallName ("VoucherStatusUpdate"), Boolean.TRUE);

      _VoucherStatusGetSpec = new BSDMInteractionSpec("VoucherStatusGet", ApiMappings.getCallName ("VoucherStatusGet"), Boolean.TRUE);

      _VoucherStatusFindSpec = new BSDMInteractionSpec("VoucherStatusFind", ApiMappings.getCallName ("VoucherStatusFind"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public VoucherStatusBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public VoucherStatusBean(BSDMSettings settings, BSDMConnectionManager cm)
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
