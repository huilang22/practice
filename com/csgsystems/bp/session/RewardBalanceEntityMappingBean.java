
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: RewardBalanceEntityMappingBean.java
 * Definition File: Admin/RewardBalanceEntityMapping.xml
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
import com.csgsystems.bp.interfaces.RewardBalanceEntityMappingInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="RewardBalanceEntityMappingSessionBean"
 * display-name="RewardBalanceEntityMapping Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/RewardBalanceEntityMappingBean"
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

@Stateless(name="RewardBalanceEntityMappingBean", mappedName = "RewardBalanceEntityMapping")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("RewardBalanceEntityMappings")

public class RewardBalanceEntityMappingBean implements RewardBalanceEntityMappingInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _RewardBalanceEntityMappingGetSpec = null;
  /**
   * Get a unique RewardBalanceEntityMapping..
   * Convenience method using default BSDMSessionContext.
   * @param RBEMGetIn Input Object Key.
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RewardBalanceEntityMappingObjectData get (RewardBalanceEntityMappingObjectKeyData RBEMGetIn) throws BSDMResourceException
  {
    return get (null, RBEMGetIn);
  }
  /**
   * Get a unique RewardBalanceEntityMapping..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBEMGetIn Input Object Key.
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public RewardBalanceEntityMappingObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam RewardBalanceEntityMappingObjectKeyData RBEMGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RewardBalanceEntityMappingGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RBEMGetIn != null) RewardBalanceEntityMappingObjectKeyHelper.toMap (RBEMGetIn, record, "RewardBalanceEntityMapping");
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
return RewardBalanceEntityMappingObjectHelper.fromMap (record, "RewardBalanceEntityMapping");
}

  private BSDMInteractionSpec _RewardBalanceEntityMappingFindSpec = null;
  /**
   * Find RewardBalanceEntityMapping rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RBEMFindIn Input Filter Object.
   * @return RewardBalanceEntityMappingObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RewardBalanceEntityMappingObjectDataList find (RewardBalanceEntityMappingObjectFilter RBEMFindIn) throws BSDMResourceException
  {
    return find (null, RBEMFindIn);
  }
  /**
   * Find RewardBalanceEntityMapping rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBEMFindIn Input Filter Object.
   * @return RewardBalanceEntityMappingObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RewardBalanceEntityMappingObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,RewardBalanceEntityMappingObjectFilter RBEMFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RewardBalanceEntityMappingFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RBEMFindIn != null) RewardBalanceEntityMappingObjectHelper.toMap (RBEMFindIn, record, "RewardBalanceEntityMapping");
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
return RewardBalanceEntityMappingObjectHelper.fromMapList (record, "RewardBalanceEntityMappingList");
}

  private BSDMInteractionSpec _RewardBalanceEntityMappingUpdateSpec = null;
  /**
   * Update the non-key fields of an RewardBalanceEntityMapping row..
   * Convenience method using default BSDMSessionContext.
   * @param RBEMUpdateIn Input  Object.
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RewardBalanceEntityMappingObjectData update (RewardBalanceEntityMappingObjectData RBEMUpdateIn) throws BSDMResourceException
  {
    return update (null, RBEMUpdateIn);
  }
  /**
   * Update the non-key fields of an RewardBalanceEntityMapping row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBEMUpdateIn Input  Object.
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RewardBalanceEntityMappingObjectData update (@HeaderParam ("context")BSDMSessionContext context,RewardBalanceEntityMappingObjectData RBEMUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RewardBalanceEntityMappingUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RBEMUpdateIn != null) RewardBalanceEntityMappingObjectHelper.toMap (RBEMUpdateIn, record, "RewardBalanceEntityMapping");
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
return RewardBalanceEntityMappingObjectHelper.fromMap (record, "RewardBalanceEntityMapping");
}

  private BSDMInteractionSpec _RewardBalanceEntityMappingDeleteSpec = null;
  /**
   * Delete a RewardBalanceEntityMapping row..
   * Convenience method using default BSDMSessionContext.
   * @param RBEMDeleteIn Input Object Key.
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RewardBalanceEntityMappingObjectData delete (RewardBalanceEntityMappingObjectKeyData RBEMDeleteIn) throws BSDMResourceException
  {
    return delete (null, RBEMDeleteIn);
  }
  /**
   * Delete a RewardBalanceEntityMapping row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBEMDeleteIn Input Object Key.
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RewardBalanceEntityMappingObjectData delete (@HeaderParam ("context")BSDMSessionContext context,RewardBalanceEntityMappingObjectKeyData RBEMDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RewardBalanceEntityMappingDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RBEMDeleteIn != null) RewardBalanceEntityMappingObjectKeyHelper.toMap (RBEMDeleteIn, record, "RewardBalanceEntityMapping");
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
return RewardBalanceEntityMappingObjectHelper.fromMap (record, "RewardBalanceEntityMapping");
}

  private BSDMInteractionSpec _RewardBalanceEntityMappingCreateSpec = null;
  /**
   * Create a new RewardBalanceEntityMapping..
   * Convenience method using default BSDMSessionContext.
   * @param RBEMCreateIn Input  Object.  Defaulted Fields: TrackingIdServ.  Derived Fields: TrackingId.
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RewardBalanceEntityMappingObjectData create (RewardBalanceEntityMappingObjectData RBEMCreateIn) throws BSDMResourceException
  {
    return create (null, RBEMCreateIn);
  }
  /**
   * Create a new RewardBalanceEntityMapping..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBEMCreateIn Input  Object.  Defaulted Fields: TrackingIdServ.  Derived Fields: TrackingId.
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RewardBalanceEntityMappingObjectData create (@HeaderParam ("context")BSDMSessionContext context,RewardBalanceEntityMappingObjectData RBEMCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RewardBalanceEntityMappingCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RBEMCreateIn != null) RewardBalanceEntityMappingObjectHelper.toMap (RBEMCreateIn, record, "RewardBalanceEntityMapping");
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
return RewardBalanceEntityMappingObjectHelper.fromMap (record, "RewardBalanceEntityMapping");
}

  /**

   * Get a unique RewardBalanceEntityMapping..

   * Convenience method using default BSDMSessionContext.

   * @param RBEMGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RewardBalanceEntityMappingObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RewardBalanceEntityMappingObjectData get (RewardBalanceEntityMappingObjectKeyData RBEMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, RBEMGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique RewardBalanceEntityMapping..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBEMGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RewardBalanceEntityMappingObjectData get (BSDMSessionContext context, RewardBalanceEntityMappingObjectKeyData RBEMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RBEMGetIn, defaultAction);
       
     cManager.checkConstraints(RBEMGetIn, constraintAction);
       return get (context, RBEMGetIn);
  }

  /**

   * Find RewardBalanceEntityMapping rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param RBEMFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RewardBalanceEntityMappingObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RewardBalanceEntityMappingObjectDataList find (RewardBalanceEntityMappingObjectFilter RBEMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, RBEMFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find RewardBalanceEntityMapping rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBEMFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RewardBalanceEntityMappingObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RewardBalanceEntityMappingObjectDataList find (BSDMSessionContext context, RewardBalanceEntityMappingObjectFilter RBEMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RBEMFindIn, defaultAction);
       
     cManager.checkConstraints(RBEMFindIn, constraintAction);
       return find (context, RBEMFindIn);
  }

  /**

   * Update the non-key fields of an RewardBalanceEntityMapping row..

   * Convenience method using default BSDMSessionContext.

   * @param RBEMUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RewardBalanceEntityMappingObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RewardBalanceEntityMappingObjectData update (RewardBalanceEntityMappingObjectData RBEMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, RBEMUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of an RewardBalanceEntityMapping row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBEMUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RewardBalanceEntityMappingObjectData update (BSDMSessionContext context, RewardBalanceEntityMappingObjectData RBEMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RBEMUpdateIn, defaultAction);
       
     cManager.checkConstraints(RBEMUpdateIn, constraintAction);
       return update (context, RBEMUpdateIn);
  }

  /**

   * Delete a RewardBalanceEntityMapping row..

   * Convenience method using default BSDMSessionContext.

   * @param RBEMDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RewardBalanceEntityMappingObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RewardBalanceEntityMappingObjectData delete (RewardBalanceEntityMappingObjectKeyData RBEMDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, RBEMDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a RewardBalanceEntityMapping row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBEMDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RewardBalanceEntityMappingObjectData delete (BSDMSessionContext context, RewardBalanceEntityMappingObjectKeyData RBEMDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RBEMDeleteIn, defaultAction);
       
     cManager.checkConstraints(RBEMDeleteIn, constraintAction);
       return delete (context, RBEMDeleteIn);
  }

  /**

   * Create a new RewardBalanceEntityMapping..

   * Convenience method using default BSDMSessionContext.

   * @param RBEMCreateIn Input  Object.  Defaulted Fields: TrackingIdServ.  Derived Fields: TrackingId.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RewardBalanceEntityMappingObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RewardBalanceEntityMappingObjectData create (RewardBalanceEntityMappingObjectData RBEMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, RBEMCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new RewardBalanceEntityMapping..
   * @param context The session context to use when connecting to the APITS server.
   * @param RBEMCreateIn Input  Object.  Defaulted Fields: TrackingIdServ.  Derived Fields: TrackingId.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RewardBalanceEntityMappingObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RewardBalanceEntityMappingObjectData create (BSDMSessionContext context, RewardBalanceEntityMappingObjectData RBEMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RBEMCreateIn, defaultAction);
       
     cManager.checkConstraints(RBEMCreateIn, constraintAction);
       return create (context, RBEMCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public RewardBalanceEntityMappingBean ()
  {
    try
    {
      _RewardBalanceEntityMappingGetSpec = new BSDMInteractionSpec("RewardBalanceEntityMappingGet", ApiMappings.getCallName ("RewardBalanceEntityMappingGet"), Boolean.TRUE);

      _RewardBalanceEntityMappingFindSpec = new BSDMInteractionSpec("RewardBalanceEntityMappingFind", ApiMappings.getCallName ("RewardBalanceEntityMappingFind"), Boolean.TRUE);

      _RewardBalanceEntityMappingUpdateSpec = new BSDMInteractionSpec("RewardBalanceEntityMappingUpdate", ApiMappings.getCallName ("RewardBalanceEntityMappingUpdate"), Boolean.TRUE);

      _RewardBalanceEntityMappingDeleteSpec = new BSDMInteractionSpec("RewardBalanceEntityMappingDelete", ApiMappings.getCallName ("RewardBalanceEntityMappingDelete"), Boolean.TRUE);

      _RewardBalanceEntityMappingCreateSpec = new BSDMInteractionSpec("RewardBalanceEntityMappingCreate", ApiMappings.getCallName ("RewardBalanceEntityMappingCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public RewardBalanceEntityMappingBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public RewardBalanceEntityMappingBean(BSDMSettings settings, BSDMConnectionManager cm)
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
