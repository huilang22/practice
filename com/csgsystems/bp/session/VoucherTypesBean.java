
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: VoucherTypesBean.java
 * Definition File: Catalog/VoucherTypes.xml
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
import com.csgsystems.bp.interfaces.VoucherTypesInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="VoucherTypesSessionBean"
 * display-name="VoucherTypes Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/VoucherTypesBean"
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

@Stateless(name="VoucherTypesBean", mappedName = "VoucherTypes")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("VoucherTypes")

public class VoucherTypesBean implements VoucherTypesInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _VoucherTypesCreateSpec = null;
  /**
   * Create A New Record Using Required Fields In voucher_types..
   * Convenience method using default BSDMSessionContext.
   * @param VouTCIn Input  Object.
   * @return VoucherTypesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherTypesObjectData create (VoucherTypesObjectData VouTCIn) throws BSDMResourceException
  {
    return create (null, VouTCIn);
  }
  /**
   * Create A New Record Using Required Fields In voucher_types..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouTCIn Input  Object.
   * @return VoucherTypesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VoucherTypesObjectData create (@HeaderParam ("context")BSDMSessionContext context,VoucherTypesObjectData VouTCIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherTypesCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouTCIn != null) VoucherTypesObjectHelper.toMap (VouTCIn, record, "VoucherTypes");
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
return VoucherTypesObjectHelper.fromMap (record, "VoucherTypes");
}

  private BSDMInteractionSpec _VoucherTypesUpdateSpec = null;
  /**
   * Update Non-key Fields For A Row In voucher_types..
   * Convenience method using default BSDMSessionContext.
   * @param VouTUIn Input  Object.
   * @return VoucherTypesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherTypesObjectData update (VoucherTypesObjectData VouTUIn) throws BSDMResourceException
  {
    return update (null, VouTUIn);
  }
  /**
   * Update Non-key Fields For A Row In voucher_types..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouTUIn Input  Object.
   * @return VoucherTypesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VoucherTypesObjectData update (@HeaderParam ("context")BSDMSessionContext context,VoucherTypesObjectData VouTUIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherTypesUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouTUIn != null) VoucherTypesObjectHelper.toMap (VouTUIn, record, "VoucherTypes");
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
return VoucherTypesObjectHelper.fromMap (record, "VoucherTypes");
}

  private BSDMInteractionSpec _VoucherTypesGetSpec = null;
  /**
   * Get Voucher Types That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouTGIn Input Object Key.
   * @return VoucherTypesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherTypesObjectData get (VoucherTypesObjectKeyData VouTGIn) throws BSDMResourceException
  {
    return get (null, VouTGIn);
  }
  /**
   * Get Voucher Types That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouTGIn Input Object Key.
   * @return VoucherTypesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public VoucherTypesObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam VoucherTypesObjectKeyData VouTGIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherTypesGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouTGIn != null) VoucherTypesObjectKeyHelper.toMap (VouTGIn, record, "VoucherTypes");
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
return VoucherTypesObjectHelper.fromMap (record, "VoucherTypes");
}

  private BSDMInteractionSpec _VoucherTypesFindSpec = null;
  /**
   * Find Voucher Types That Match The Supplied Filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouTFIn Input Filter Object.
   * @return VoucherTypesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherTypesObjectDataList find (VoucherTypesObjectFilter VouTFIn) throws BSDMResourceException
  {
    return find (null, VouTFIn);
  }
  /**
   * Find Voucher Types That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouTFIn Input Filter Object.
   * @return VoucherTypesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VoucherTypesObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,VoucherTypesObjectFilter VouTFIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherTypesFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouTFIn != null) VoucherTypesObjectHelper.toMap (VouTFIn, record, "VoucherTypes");
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
return VoucherTypesObjectHelper.fromMapList (record, "VoucherTypesList");
}

  /**

   * Create A New Record Using Required Fields In voucher_types..

   * Convenience method using default BSDMSessionContext.

   * @param VouTCIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherTypesObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherTypesObjectData create (VoucherTypesObjectData VouTCIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, VouTCIn, defaultAction, constraintAction);
  }
  /** 
   * Create A New Record Using Required Fields In voucher_types..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouTCIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherTypesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherTypesObjectData create (BSDMSessionContext context, VoucherTypesObjectData VouTCIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouTCIn, defaultAction);
       
     cManager.checkConstraints(VouTCIn, constraintAction);
       return create (context, VouTCIn);
  }

  /**

   * Update Non-key Fields For A Row In voucher_types..

   * Convenience method using default BSDMSessionContext.

   * @param VouTUIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherTypesObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherTypesObjectData update (VoucherTypesObjectData VouTUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, VouTUIn, defaultAction, constraintAction);
  }
  /** 
   * Update Non-key Fields For A Row In voucher_types..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouTUIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherTypesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherTypesObjectData update (BSDMSessionContext context, VoucherTypesObjectData VouTUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouTUIn, defaultAction);
       
     cManager.checkConstraints(VouTUIn, constraintAction);
       return update (context, VouTUIn);
  }

  /**

   * Get Voucher Types That Match The Supplied Filter..

   * Convenience method using default BSDMSessionContext.

   * @param VouTGIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherTypesObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherTypesObjectData get (VoucherTypesObjectKeyData VouTGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, VouTGIn, defaultAction, constraintAction);
  }
  /** 
   * Get Voucher Types That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouTGIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherTypesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherTypesObjectData get (BSDMSessionContext context, VoucherTypesObjectKeyData VouTGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouTGIn, defaultAction);
       
     cManager.checkConstraints(VouTGIn, constraintAction);
       return get (context, VouTGIn);
  }

  /**

   * Find Voucher Types That Match The Supplied Filter..

   * Convenience method using default BSDMSessionContext.

   * @param VouTFIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherTypesObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherTypesObjectDataList find (VoucherTypesObjectFilter VouTFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, VouTFIn, defaultAction, constraintAction);
  }
  /** 
   * Find Voucher Types That Match The Supplied Filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouTFIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherTypesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherTypesObjectDataList find (BSDMSessionContext context, VoucherTypesObjectFilter VouTFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouTFIn, defaultAction);
       
     cManager.checkConstraints(VouTFIn, constraintAction);
       return find (context, VouTFIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public VoucherTypesBean ()
  {
    try
    {
      _VoucherTypesCreateSpec = new BSDMInteractionSpec("VoucherTypesCreate", ApiMappings.getCallName ("VoucherTypesCreate"), Boolean.TRUE);

      _VoucherTypesUpdateSpec = new BSDMInteractionSpec("VoucherTypesUpdate", ApiMappings.getCallName ("VoucherTypesUpdate"), Boolean.TRUE);

      _VoucherTypesGetSpec = new BSDMInteractionSpec("VoucherTypesGet", ApiMappings.getCallName ("VoucherTypesGet"), Boolean.TRUE);

      _VoucherTypesFindSpec = new BSDMInteractionSpec("VoucherTypesFind", ApiMappings.getCallName ("VoucherTypesFind"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public VoucherTypesBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public VoucherTypesBean(BSDMSettings settings, BSDMConnectionManager cm)
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
