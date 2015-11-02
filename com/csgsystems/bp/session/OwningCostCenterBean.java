
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: OwningCostCenterBean.java
 * Definition File: Admin/OwningCostCenter.xml
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
import com.csgsystems.bp.interfaces.OwningCostCenterInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="OwningCostCenterSessionBean"
 * display-name="OwningCostCenter Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/OwningCostCenterBean"
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

@Stateless(name="OwningCostCenterBean", mappedName = "OwningCostCenter")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("OwningCostCenters")

public class OwningCostCenterBean implements OwningCostCenterInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _OwningCostCenterGetSpec = null;
  /**
   * Get a unique OwningCostCenter..
   * Convenience method using default BSDMSessionContext.
   * @param OCCGetIn Input Object Key.
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public OwningCostCenterObjectData get (OwningCostCenterObjectKeyData OCCGetIn) throws BSDMResourceException
  {
    return get (null, OCCGetIn);
  }
  /**
   * Get a unique OwningCostCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OCCGetIn Input Object Key.
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public OwningCostCenterObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam OwningCostCenterObjectKeyData OCCGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OwningCostCenterGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (OCCGetIn != null) OwningCostCenterObjectKeyHelper.toMap (OCCGetIn, record, "OwningCostCenter");
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
return OwningCostCenterObjectHelper.fromMap (record, "OwningCostCenter");
}

  private BSDMInteractionSpec _OwningCostCenterFindSpec = null;
  /**
   * Find OwningCostCenters that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param OCCFindIn Input Filter Object.
   * @return OwningCostCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public OwningCostCenterObjectDataList find (OwningCostCenterObjectFilter OCCFindIn) throws BSDMResourceException
  {
    return find (null, OCCFindIn);
  }
  /**
   * Find OwningCostCenters that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OCCFindIn Input Filter Object.
   * @return OwningCostCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public OwningCostCenterObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,OwningCostCenterObjectFilter OCCFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OwningCostCenterFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (OCCFindIn != null) OwningCostCenterObjectHelper.toMap (OCCFindIn, record, "OwningCostCenter");
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
return OwningCostCenterObjectHelper.fromMapList (record, "OwningCostCenterList");
}

  private BSDMInteractionSpec _OwningCostCenterUpdateSpec = null;
  /**
   * Update non-key fields of an OwningCostCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param OCCUpdateIn Input  Object.
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public OwningCostCenterObjectData update (OwningCostCenterObjectData OCCUpdateIn) throws BSDMResourceException
  {
    return update (null, OCCUpdateIn);
  }
  /**
   * Update non-key fields of an OwningCostCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OCCUpdateIn Input  Object.
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public OwningCostCenterObjectData update (@HeaderParam ("context")BSDMSessionContext context,OwningCostCenterObjectData OCCUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OwningCostCenterUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (OCCUpdateIn != null) OwningCostCenterObjectHelper.toMap (OCCUpdateIn, record, "OwningCostCenter");
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
return OwningCostCenterObjectHelper.fromMap (record, "OwningCostCenter");
}

  private BSDMInteractionSpec _OwningCostCenterDeleteSpec = null;
  /**
   * Delete an OwningCostCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param OCCDeleteIn Input Object Key.
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public OwningCostCenterObjectData delete (OwningCostCenterObjectKeyData OCCDeleteIn) throws BSDMResourceException
  {
    return delete (null, OCCDeleteIn);
  }
  /**
   * Delete an OwningCostCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OCCDeleteIn Input Object Key.
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public OwningCostCenterObjectData delete (@HeaderParam ("context")BSDMSessionContext context,OwningCostCenterObjectKeyData OCCDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OwningCostCenterDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (OCCDeleteIn != null) OwningCostCenterObjectKeyHelper.toMap (OCCDeleteIn, record, "OwningCostCenter");
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
return OwningCostCenterObjectHelper.fromMap (record, "OwningCostCenter");
}

  private BSDMInteractionSpec _OwningCostCenterCreateSpec = null;
  /**
   * Create a new OwningCostCenter..
   * Convenience method using default BSDMSessionContext.
   * @param OCCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public OwningCostCenterObjectData create (OwningCostCenterObjectData OCCCreateIn) throws BSDMResourceException
  {
    return create (null, OCCCreateIn);
  }
  /**
   * Create a new OwningCostCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OCCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public OwningCostCenterObjectData create (@HeaderParam ("context")BSDMSessionContext context,OwningCostCenterObjectData OCCCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OwningCostCenterCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (OCCCreateIn != null) OwningCostCenterObjectHelper.toMap (OCCCreateIn, record, "OwningCostCenter");
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
return OwningCostCenterObjectHelper.fromMap (record, "OwningCostCenter");
}

  /**

   * Get a unique OwningCostCenter..

   * Convenience method using default BSDMSessionContext.

   * @param OCCGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return OwningCostCenterObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public OwningCostCenterObjectData get (OwningCostCenterObjectKeyData OCCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, OCCGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique OwningCostCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OCCGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public OwningCostCenterObjectData get (BSDMSessionContext context, OwningCostCenterObjectKeyData OCCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(OCCGetIn, defaultAction);
       
     cManager.checkConstraints(OCCGetIn, constraintAction);
       return get (context, OCCGetIn);
  }

  /**

   * Find OwningCostCenters that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param OCCFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return OwningCostCenterObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public OwningCostCenterObjectDataList find (OwningCostCenterObjectFilter OCCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, OCCFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find OwningCostCenters that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OCCFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return OwningCostCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public OwningCostCenterObjectDataList find (BSDMSessionContext context, OwningCostCenterObjectFilter OCCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(OCCFindIn, defaultAction);
       
     cManager.checkConstraints(OCCFindIn, constraintAction);
       return find (context, OCCFindIn);
  }

  /**

   * Update non-key fields of an OwningCostCenter row..

   * Convenience method using default BSDMSessionContext.

   * @param OCCUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return OwningCostCenterObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public OwningCostCenterObjectData update (OwningCostCenterObjectData OCCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, OCCUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of an OwningCostCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OCCUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public OwningCostCenterObjectData update (BSDMSessionContext context, OwningCostCenterObjectData OCCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(OCCUpdateIn, defaultAction);
       
     cManager.checkConstraints(OCCUpdateIn, constraintAction);
       return update (context, OCCUpdateIn);
  }

  /**

   * Delete an OwningCostCenter row..

   * Convenience method using default BSDMSessionContext.

   * @param OCCDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return OwningCostCenterObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public OwningCostCenterObjectData delete (OwningCostCenterObjectKeyData OCCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, OCCDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete an OwningCostCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OCCDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public OwningCostCenterObjectData delete (BSDMSessionContext context, OwningCostCenterObjectKeyData OCCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(OCCDeleteIn, defaultAction);
       
     cManager.checkConstraints(OCCDeleteIn, constraintAction);
       return delete (context, OCCDeleteIn);
  }

  /**

   * Create a new OwningCostCenter..

   * Convenience method using default BSDMSessionContext.

   * @param OCCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return OwningCostCenterObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public OwningCostCenterObjectData create (OwningCostCenterObjectData OCCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, OCCCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new OwningCostCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OCCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return OwningCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public OwningCostCenterObjectData create (BSDMSessionContext context, OwningCostCenterObjectData OCCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(OCCCreateIn, defaultAction);
       
     cManager.checkConstraints(OCCCreateIn, constraintAction);
       return create (context, OCCCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public OwningCostCenterBean ()
  {
    try
    {
      _OwningCostCenterGetSpec = new BSDMInteractionSpec("OwningCostCenterGet", ApiMappings.getCallName ("OwningCostCenterGet"), Boolean.TRUE);

      _OwningCostCenterFindSpec = new BSDMInteractionSpec("OwningCostCenterFind", ApiMappings.getCallName ("OwningCostCenterFind"), Boolean.TRUE);

      _OwningCostCenterUpdateSpec = new BSDMInteractionSpec("OwningCostCenterUpdate", ApiMappings.getCallName ("OwningCostCenterUpdate"), Boolean.TRUE);

      _OwningCostCenterDeleteSpec = new BSDMInteractionSpec("OwningCostCenterDelete", ApiMappings.getCallName ("OwningCostCenterDelete"), Boolean.TRUE);

      _OwningCostCenterCreateSpec = new BSDMInteractionSpec("OwningCostCenterCreate", ApiMappings.getCallName ("OwningCostCenterCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public OwningCostCenterBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public OwningCostCenterBean(BSDMSettings settings, BSDMConnectionManager cm)
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
