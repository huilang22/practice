
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: VipCodeBean.java
 * Definition File: Admin/VipCode.xml
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
import com.csgsystems.bp.interfaces.VipCodeInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="VipCodeSessionBean"
 * display-name="VipCode Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/VipCodeBean"
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

@Stateless(name="VipCodeBean", mappedName = "VipCode")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("VipCodes")

public class VipCodeBean implements VipCodeInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _VipCodeGetSpec = null;
  /**
   * Get a unique VipCode row..
   * Convenience method using default BSDMSessionContext.
   * @param VCGetIn Input Object Key.
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VipCodeObjectData get (VipCodeObjectKeyData VCGetIn) throws BSDMResourceException
  {
    return get (null, VCGetIn);
  }
  /**
   * Get a unique VipCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param VCGetIn Input Object Key.
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public VipCodeObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam VipCodeObjectKeyData VCGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VipCodeGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VCGetIn != null) VipCodeObjectKeyHelper.toMap (VCGetIn, record, "VipCode");
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
return VipCodeObjectHelper.fromMap (record, "VipCode");
}

  private BSDMInteractionSpec _VipCodeFindSpec = null;
  /**
   * Find VipCode's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param VCFindIn Input Filter Object.
   * @return VipCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VipCodeObjectDataList find (VipCodeObjectFilter VCFindIn) throws BSDMResourceException
  {
    return find (null, VCFindIn);
  }
  /**
   * Find VipCode's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VCFindIn Input Filter Object.
   * @return VipCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VipCodeObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,VipCodeObjectFilter VCFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VipCodeFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VCFindIn != null) VipCodeObjectHelper.toMap (VCFindIn, record, "VipCode");
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
return VipCodeObjectHelper.fromMapList (record, "VipCodeList");
}

  private BSDMInteractionSpec _VipCodeUpdateSpec = null;
  /**
   * Update non key fields of a VipCode..
   * Convenience method using default BSDMSessionContext.
   * @param VCUpdateIn Input  Object.
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VipCodeObjectData update (VipCodeObjectData VCUpdateIn) throws BSDMResourceException
  {
    return update (null, VCUpdateIn);
  }
  /**
   * Update non key fields of a VipCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param VCUpdateIn Input  Object.
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VipCodeObjectData update (@HeaderParam ("context")BSDMSessionContext context,VipCodeObjectData VCUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VipCodeUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VCUpdateIn != null) VipCodeObjectHelper.toMap (VCUpdateIn, record, "VipCode");
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
return VipCodeObjectHelper.fromMap (record, "VipCode");
}

  private BSDMInteractionSpec _VipCodeDeleteSpec = null;
  /**
   * Delete a VipCode..
   * Convenience method using default BSDMSessionContext.
   * @param VCDeleteIn Input Object Key.
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VipCodeObjectData delete (VipCodeObjectKeyData VCDeleteIn) throws BSDMResourceException
  {
    return delete (null, VCDeleteIn);
  }
  /**
   * Delete a VipCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param VCDeleteIn Input Object Key.
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VipCodeObjectData delete (@HeaderParam ("context")BSDMSessionContext context,VipCodeObjectKeyData VCDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VipCodeDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VCDeleteIn != null) VipCodeObjectKeyHelper.toMap (VCDeleteIn, record, "VipCode");
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
return VipCodeObjectHelper.fromMap (record, "VipCode");
}

  private BSDMInteractionSpec _VipCodeCreateSpec = null;
  /**
   * Create a new VipCode..
   * Convenience method using default BSDMSessionContext.
   * @param VCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VipCodeObjectData create (VipCodeObjectData VCCreateIn) throws BSDMResourceException
  {
    return create (null, VCCreateIn);
  }
  /**
   * Create a new VipCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param VCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VipCodeObjectData create (@HeaderParam ("context")BSDMSessionContext context,VipCodeObjectData VCCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VipCodeCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VCCreateIn != null) VipCodeObjectHelper.toMap (VCCreateIn, record, "VipCode");
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
return VipCodeObjectHelper.fromMap (record, "VipCode");
}

  /**

   * Get a unique VipCode row..

   * Convenience method using default BSDMSessionContext.

   * @param VCGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VipCodeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VipCodeObjectData get (VipCodeObjectKeyData VCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, VCGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique VipCode row..
   * @param context The session context to use when connecting to the APITS server.
   * @param VCGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VipCodeObjectData get (BSDMSessionContext context, VipCodeObjectKeyData VCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VCGetIn, defaultAction);
       
     cManager.checkConstraints(VCGetIn, constraintAction);
       return get (context, VCGetIn);
  }

  /**

   * Find VipCode's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param VCFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VipCodeObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VipCodeObjectDataList find (VipCodeObjectFilter VCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, VCFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find VipCode's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VCFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VipCodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VipCodeObjectDataList find (BSDMSessionContext context, VipCodeObjectFilter VCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VCFindIn, defaultAction);
       
     cManager.checkConstraints(VCFindIn, constraintAction);
       return find (context, VCFindIn);
  }

  /**

   * Update non key fields of a VipCode..

   * Convenience method using default BSDMSessionContext.

   * @param VCUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VipCodeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VipCodeObjectData update (VipCodeObjectData VCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, VCUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non key fields of a VipCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param VCUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VipCodeObjectData update (BSDMSessionContext context, VipCodeObjectData VCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VCUpdateIn, defaultAction);
       
     cManager.checkConstraints(VCUpdateIn, constraintAction);
       return update (context, VCUpdateIn);
  }

  /**

   * Delete a VipCode..

   * Convenience method using default BSDMSessionContext.

   * @param VCDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VipCodeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VipCodeObjectData delete (VipCodeObjectKeyData VCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, VCDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a VipCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param VCDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VipCodeObjectData delete (BSDMSessionContext context, VipCodeObjectKeyData VCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VCDeleteIn, defaultAction);
       
     cManager.checkConstraints(VCDeleteIn, constraintAction);
       return delete (context, VCDeleteIn);
  }

  /**

   * Create a new VipCode..

   * Convenience method using default BSDMSessionContext.

   * @param VCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VipCodeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VipCodeObjectData create (VipCodeObjectData VCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, VCCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new VipCode..
   * @param context The session context to use when connecting to the APITS server.
   * @param VCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VipCodeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VipCodeObjectData create (BSDMSessionContext context, VipCodeObjectData VCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VCCreateIn, defaultAction);
       
     cManager.checkConstraints(VCCreateIn, constraintAction);
       return create (context, VCCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public VipCodeBean ()
  {
    try
    {
      _VipCodeGetSpec = new BSDMInteractionSpec("VipCodeGet", ApiMappings.getCallName ("VipCodeGet"), Boolean.TRUE);

      _VipCodeFindSpec = new BSDMInteractionSpec("VipCodeFind", ApiMappings.getCallName ("VipCodeFind"), Boolean.TRUE);

      _VipCodeUpdateSpec = new BSDMInteractionSpec("VipCodeUpdate", ApiMappings.getCallName ("VipCodeUpdate"), Boolean.TRUE);

      _VipCodeDeleteSpec = new BSDMInteractionSpec("VipCodeDelete", ApiMappings.getCallName ("VipCodeDelete"), Boolean.TRUE);

      _VipCodeCreateSpec = new BSDMInteractionSpec("VipCodeCreate", ApiMappings.getCallName ("VipCodeCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public VipCodeBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public VipCodeBean(BSDMSettings settings, BSDMConnectionManager cm)
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
