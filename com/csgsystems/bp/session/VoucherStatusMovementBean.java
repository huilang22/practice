
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: VoucherStatusMovementBean.java
 * Definition File: Catalog/VoucherStatusMovement.xml
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
import com.csgsystems.bp.interfaces.VoucherStatusMovementInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="VoucherStatusMovementSessionBean"
 * display-name="VoucherStatusMovement Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/VoucherStatusMovementBean"
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

@Stateless(name="VoucherStatusMovementBean", mappedName = "VoucherStatusMovement")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("VoucherStatusMovements")

public class VoucherStatusMovementBean implements VoucherStatusMovementInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _VoucherStatusMovementCreateSpec = null;
  /**
   * Create A New Record Using Required Fields In voucher_status_movement..
   * Convenience method using default BSDMSessionContext.
   * @param VouSMCIn Input  Object.
   * @return VoucherStatusMovementObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherStatusMovementObjectData create (VoucherStatusMovementObjectData VouSMCIn) throws BSDMResourceException
  {
    return create (null, VouSMCIn);
  }
  /**
   * Create A New Record Using Required Fields In voucher_status_movement..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSMCIn Input  Object.
   * @return VoucherStatusMovementObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VoucherStatusMovementObjectData create (@HeaderParam ("context")BSDMSessionContext context,VoucherStatusMovementObjectData VouSMCIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherStatusMovementCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouSMCIn != null) VoucherStatusMovementObjectHelper.toMap (VouSMCIn, record, "VoucherStatusMovement");
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
return VoucherStatusMovementObjectHelper.fromMap (record, "VoucherStatusMovement");
}

  private BSDMInteractionSpec _VoucherStatusMovementUpdateSpec = null;
  /**
   * Update Non-key Fields For A Row In voucher_status_movement..
   * Convenience method using default BSDMSessionContext.
   * @param VouSMUIn Input  Object.
   * @return VoucherStatusMovementObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherStatusMovementObjectData update (VoucherStatusMovementObjectData VouSMUIn) throws BSDMResourceException
  {
    return update (null, VouSMUIn);
  }
  /**
   * Update Non-key Fields For A Row In voucher_status_movement..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSMUIn Input  Object.
   * @return VoucherStatusMovementObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VoucherStatusMovementObjectData update (@HeaderParam ("context")BSDMSessionContext context,VoucherStatusMovementObjectData VouSMUIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherStatusMovementUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouSMUIn != null) VoucherStatusMovementObjectHelper.toMap (VouSMUIn, record, "VoucherStatusMovement");
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
return VoucherStatusMovementObjectHelper.fromMap (record, "VoucherStatusMovement");
}

  private BSDMInteractionSpec _VoucherStatusMovementGetSpec = null;
  /**
   * Get Voucher Status Movement That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouSMGIn Input Object Key.
   * @return VoucherStatusMovementObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherStatusMovementObjectData get (VoucherStatusMovementObjectKeyData VouSMGIn) throws BSDMResourceException
  {
    return get (null, VouSMGIn);
  }
  /**
   * Get Voucher Status Movement That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSMGIn Input Object Key.
   * @return VoucherStatusMovementObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public VoucherStatusMovementObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam VoucherStatusMovementObjectKeyData VouSMGIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherStatusMovementGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouSMGIn != null) VoucherStatusMovementObjectKeyHelper.toMap (VouSMGIn, record, "VoucherStatusMovement");
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
return VoucherStatusMovementObjectHelper.fromMap (record, "VoucherStatusMovement");
}

  private BSDMInteractionSpec _VoucherStatusMovementFindSpec = null;
  /**
   * Find Voucher Status Movement That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouSMFIn Input Filter Object.
   * @return VoucherStatusMovementObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherStatusMovementObjectDataList find (VoucherStatusMovementObjectFilter VouSMFIn) throws BSDMResourceException
  {
    return find (null, VouSMFIn);
  }
  /**
   * Find Voucher Status Movement That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSMFIn Input Filter Object.
   * @return VoucherStatusMovementObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VoucherStatusMovementObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,VoucherStatusMovementObjectFilter VouSMFIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherStatusMovementFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouSMFIn != null) VoucherStatusMovementObjectHelper.toMap (VouSMFIn, record, "VoucherStatusMovement");
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
return VoucherStatusMovementObjectHelper.fromMapList (record, "VoucherStatusMovementList");
}

  /**

   * Create A New Record Using Required Fields In voucher_status_movement..

   * Convenience method using default BSDMSessionContext.

   * @param VouSMCIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherStatusMovementObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherStatusMovementObjectData create (VoucherStatusMovementObjectData VouSMCIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, VouSMCIn, defaultAction, constraintAction);
  }
  /** 
   * Create A New Record Using Required Fields In voucher_status_movement..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSMCIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherStatusMovementObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherStatusMovementObjectData create (BSDMSessionContext context, VoucherStatusMovementObjectData VouSMCIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouSMCIn, defaultAction);
       
     cManager.checkConstraints(VouSMCIn, constraintAction);
       return create (context, VouSMCIn);
  }

  /**

   * Update Non-key Fields For A Row In voucher_status_movement..

   * Convenience method using default BSDMSessionContext.

   * @param VouSMUIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherStatusMovementObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherStatusMovementObjectData update (VoucherStatusMovementObjectData VouSMUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, VouSMUIn, defaultAction, constraintAction);
  }
  /** 
   * Update Non-key Fields For A Row In voucher_status_movement..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSMUIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherStatusMovementObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherStatusMovementObjectData update (BSDMSessionContext context, VoucherStatusMovementObjectData VouSMUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouSMUIn, defaultAction);
       
     cManager.checkConstraints(VouSMUIn, constraintAction);
       return update (context, VouSMUIn);
  }

  /**

   * Get Voucher Status Movement That Match The Supplied Filter..

   * Convenience method using default BSDMSessionContext.

   * @param VouSMGIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherStatusMovementObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherStatusMovementObjectData get (VoucherStatusMovementObjectKeyData VouSMGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, VouSMGIn, defaultAction, constraintAction);
  }
  /** 
   * Get Voucher Status Movement That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSMGIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherStatusMovementObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherStatusMovementObjectData get (BSDMSessionContext context, VoucherStatusMovementObjectKeyData VouSMGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouSMGIn, defaultAction);
       
     cManager.checkConstraints(VouSMGIn, constraintAction);
       return get (context, VouSMGIn);
  }

  /**

   * Find Voucher Status Movement That Match The Supplied Filter..

   * Convenience method using default BSDMSessionContext.

   * @param VouSMFIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherStatusMovementObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherStatusMovementObjectDataList find (VoucherStatusMovementObjectFilter VouSMFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, VouSMFIn, defaultAction, constraintAction);
  }
  /** 
   * Find Voucher Status Movement That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouSMFIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherStatusMovementObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherStatusMovementObjectDataList find (BSDMSessionContext context, VoucherStatusMovementObjectFilter VouSMFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouSMFIn, defaultAction);
       
     cManager.checkConstraints(VouSMFIn, constraintAction);
       return find (context, VouSMFIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public VoucherStatusMovementBean ()
  {
    try
    {
      _VoucherStatusMovementCreateSpec = new BSDMInteractionSpec("VoucherStatusMovementCreate", ApiMappings.getCallName ("VoucherStatusMovementCreate"), Boolean.TRUE);

      _VoucherStatusMovementUpdateSpec = new BSDMInteractionSpec("VoucherStatusMovementUpdate", ApiMappings.getCallName ("VoucherStatusMovementUpdate"), Boolean.TRUE);

      _VoucherStatusMovementGetSpec = new BSDMInteractionSpec("VoucherStatusMovementGet", ApiMappings.getCallName ("VoucherStatusMovementGet"), Boolean.TRUE);

      _VoucherStatusMovementFindSpec = new BSDMInteractionSpec("VoucherStatusMovementFind", ApiMappings.getCallName ("VoucherStatusMovementFind"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public VoucherStatusMovementBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public VoucherStatusMovementBean(BSDMSettings settings, BSDMConnectionManager cm)
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
