
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: VoucherLocationBean.java
 * Definition File: Catalog/VoucherLocation.xml
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
import com.csgsystems.bp.interfaces.VoucherLocationInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="VoucherLocationSessionBean"
 * display-name="VoucherLocation Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/VoucherLocationBean"
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

@Stateless(name="VoucherLocationBean", mappedName = "VoucherLocation")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("VoucherLocations")

public class VoucherLocationBean implements VoucherLocationInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _VoucherLocationCreateSpec = null;
  /**
   * Create A New Record Using Required Fields In voucher_location..
   * Convenience method using default BSDMSessionContext.
   * @param VouLCIn Input  Object.
   * @return VoucherLocationObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherLocationObjectData create (VoucherLocationObjectData VouLCIn) throws BSDMResourceException
  {
    return create (null, VouLCIn);
  }
  /**
   * Create A New Record Using Required Fields In voucher_location..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouLCIn Input  Object.
   * @return VoucherLocationObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VoucherLocationObjectData create (@HeaderParam ("context")BSDMSessionContext context,VoucherLocationObjectData VouLCIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherLocationCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouLCIn != null) VoucherLocationObjectHelper.toMap (VouLCIn, record, "VoucherLocation");
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
return VoucherLocationObjectHelper.fromMap (record, "VoucherLocation");
}

  private BSDMInteractionSpec _VoucherLocationUpdateSpec = null;
  /**
   * Update Non-key Fields For A Row In voucher_location..
   * Convenience method using default BSDMSessionContext.
   * @param VouLUIn Input  Object.
   * @return VoucherLocationObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherLocationObjectData update (VoucherLocationObjectData VouLUIn) throws BSDMResourceException
  {
    return update (null, VouLUIn);
  }
  /**
   * Update Non-key Fields For A Row In voucher_location..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouLUIn Input  Object.
   * @return VoucherLocationObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VoucherLocationObjectData update (@HeaderParam ("context")BSDMSessionContext context,VoucherLocationObjectData VouLUIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherLocationUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouLUIn != null) VoucherLocationObjectHelper.toMap (VouLUIn, record, "VoucherLocation");
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
return VoucherLocationObjectHelper.fromMap (record, "VoucherLocation");
}

  private BSDMInteractionSpec _VoucherLocationGetSpec = null;
  /**
   * Get Voucher Location That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouLGIn Input Object Key.
   * @return VoucherLocationObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherLocationObjectData get (VoucherLocationObjectKeyData VouLGIn) throws BSDMResourceException
  {
    return get (null, VouLGIn);
  }
  /**
   * Get Voucher Location That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouLGIn Input Object Key.
   * @return VoucherLocationObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public VoucherLocationObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam VoucherLocationObjectKeyData VouLGIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherLocationGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouLGIn != null) VoucherLocationObjectKeyHelper.toMap (VouLGIn, record, "VoucherLocation");
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
return VoucherLocationObjectHelper.fromMap (record, "VoucherLocation");
}

  private BSDMInteractionSpec _VoucherLocationFindSpec = null;
  /**
   * Find Voucher Location That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouLFIn Input Filter Object.
   * @return VoucherLocationObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherLocationObjectDataList find (VoucherLocationObjectFilter VouLFIn) throws BSDMResourceException
  {
    return find (null, VouLFIn);
  }
  /**
   * Find Voucher Location That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouLFIn Input Filter Object.
   * @return VoucherLocationObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VoucherLocationObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,VoucherLocationObjectFilter VouLFIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherLocationFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouLFIn != null) VoucherLocationObjectHelper.toMap (VouLFIn, record, "VoucherLocation");
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
return VoucherLocationObjectHelper.fromMapList (record, "VoucherLocationList");
}

  /**

   * Create A New Record Using Required Fields In voucher_location..

   * Convenience method using default BSDMSessionContext.

   * @param VouLCIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherLocationObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherLocationObjectData create (VoucherLocationObjectData VouLCIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, VouLCIn, defaultAction, constraintAction);
  }
  /** 
   * Create A New Record Using Required Fields In voucher_location..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouLCIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherLocationObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherLocationObjectData create (BSDMSessionContext context, VoucherLocationObjectData VouLCIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouLCIn, defaultAction);
       
     cManager.checkConstraints(VouLCIn, constraintAction);
       return create (context, VouLCIn);
  }

  /**

   * Update Non-key Fields For A Row In voucher_location..

   * Convenience method using default BSDMSessionContext.

   * @param VouLUIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherLocationObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherLocationObjectData update (VoucherLocationObjectData VouLUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, VouLUIn, defaultAction, constraintAction);
  }
  /** 
   * Update Non-key Fields For A Row In voucher_location..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouLUIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherLocationObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherLocationObjectData update (BSDMSessionContext context, VoucherLocationObjectData VouLUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouLUIn, defaultAction);
       
     cManager.checkConstraints(VouLUIn, constraintAction);
       return update (context, VouLUIn);
  }

  /**

   * Get Voucher Location That Match The Supplied Filter..

   * Convenience method using default BSDMSessionContext.

   * @param VouLGIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherLocationObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherLocationObjectData get (VoucherLocationObjectKeyData VouLGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, VouLGIn, defaultAction, constraintAction);
  }
  /** 
   * Get Voucher Location That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouLGIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherLocationObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherLocationObjectData get (BSDMSessionContext context, VoucherLocationObjectKeyData VouLGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouLGIn, defaultAction);
       
     cManager.checkConstraints(VouLGIn, constraintAction);
       return get (context, VouLGIn);
  }

  /**

   * Find Voucher Location That Match The Supplied Filter..

   * Convenience method using default BSDMSessionContext.

   * @param VouLFIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherLocationObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherLocationObjectDataList find (VoucherLocationObjectFilter VouLFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, VouLFIn, defaultAction, constraintAction);
  }
  /** 
   * Find Voucher Location That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouLFIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherLocationObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherLocationObjectDataList find (BSDMSessionContext context, VoucherLocationObjectFilter VouLFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouLFIn, defaultAction);
       
     cManager.checkConstraints(VouLFIn, constraintAction);
       return find (context, VouLFIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public VoucherLocationBean ()
  {
    try
    {
      _VoucherLocationCreateSpec = new BSDMInteractionSpec("VoucherLocationCreate", ApiMappings.getCallName ("VoucherLocationCreate"), Boolean.TRUE);

      _VoucherLocationUpdateSpec = new BSDMInteractionSpec("VoucherLocationUpdate", ApiMappings.getCallName ("VoucherLocationUpdate"), Boolean.TRUE);

      _VoucherLocationGetSpec = new BSDMInteractionSpec("VoucherLocationGet", ApiMappings.getCallName ("VoucherLocationGet"), Boolean.TRUE);

      _VoucherLocationFindSpec = new BSDMInteractionSpec("VoucherLocationFind", ApiMappings.getCallName ("VoucherLocationFind"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public VoucherLocationBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public VoucherLocationBean(BSDMSettings settings, BSDMConnectionManager cm)
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
