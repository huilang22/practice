
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: HqGroupCorridorBean.java
 * Definition File: Catalog/HqGroupCorridor.xml
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
import com.csgsystems.bp.interfaces.HqGroupCorridorInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="HqGroupCorridorSessionBean"
 * display-name="HqGroupCorridor Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/HqGroupCorridorBean"
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

@Stateless(name="HqGroupCorridorBean", mappedName = "HqGroupCorridor")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("HqGroupCorridors")

public class HqGroupCorridorBean implements HqGroupCorridorInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _HqGroupCorridorGetSpec = null;
  /**
   * Retrieve a unique Group Corridor..
   * Convenience method using default BSDMSessionContext.
   * @param HQGCgetIn Input  Object.
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupCorridorObjectData get (HqGroupCorridorObjectData HQGCgetIn) throws BSDMResourceException
  {
    return get (null, HQGCgetIn);
  }
  /**
   * Retrieve a unique Group Corridor..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCgetIn Input  Object.
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
 
public HqGroupCorridorObjectData get (BSDMSessionContext context, HqGroupCorridorObjectData HQGCgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupCorridorGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HQGCgetIn != null) HqGroupCorridorObjectHelper.toMap (HQGCgetIn, record, "HqGroupCorridor");
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
return HqGroupCorridorObjectHelper.fromMap (record, "HqGroupCorridor");
}

  private BSDMInteractionSpec _HqGroupCorridorFindSpec = null;
  /**
   * Find Group Corridor's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HQGCfindIn Input Filter Object.
   * @return HqGroupCorridorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupCorridorObjectDataList find (HqGroupCorridorObjectFilter HQGCfindIn) throws BSDMResourceException
  {
    return find (null, HQGCfindIn);
  }
  /**
   * Find Group Corridor's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCfindIn Input Filter Object.
   * @return HqGroupCorridorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
 
public HqGroupCorridorObjectDataList find (BSDMSessionContext context, HqGroupCorridorObjectFilter HQGCfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupCorridorFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HQGCfindIn != null) HqGroupCorridorObjectHelper.toMap (HQGCfindIn, record, "HqGroupCorridor");
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
return HqGroupCorridorObjectHelper.fromMapList (record, "HqGroupCorridorList");
}

  private BSDMInteractionSpec _HqGroupCorridorCreateSpec = null;
  /**
   * Create a new Group Corridor row..
   * Convenience method using default BSDMSessionContext.
   * @param HQGCcreateIn Input  Object.
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupCorridorObjectData create (HqGroupCorridorObjectData HQGCcreateIn) throws BSDMResourceException
  {
    return create (null, HQGCcreateIn);
  }
  /**
   * Create a new Group Corridor row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCcreateIn Input  Object.
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupCorridorObjectData create (@HeaderParam ("context")BSDMSessionContext context,HqGroupCorridorObjectData HQGCcreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupCorridorCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HQGCcreateIn != null) HqGroupCorridorObjectHelper.toMap (HQGCcreateIn, record, "HqGroupCorridor");
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
return HqGroupCorridorObjectHelper.fromMap (record, "HqGroupCorridor");
}

  private BSDMInteractionSpec _HqGroupCorridorUpdateSpec = null;
  /**
   * Update a GroupCorridor..
   * Convenience method using default BSDMSessionContext.
   * @param HQGCupdateIn Input  Object.
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupCorridorObjectData update (HqGroupCorridorObjectData HQGCupdateIn) throws BSDMResourceException
  {
    return update (null, HQGCupdateIn);
  }
  /**
   * Update a GroupCorridor..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCupdateIn Input  Object.
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupCorridorObjectData update (@HeaderParam ("context")BSDMSessionContext context,HqGroupCorridorObjectData HQGCupdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupCorridorUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HQGCupdateIn != null) HqGroupCorridorObjectHelper.toMap (HQGCupdateIn, record, "HqGroupCorridor");
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
return HqGroupCorridorObjectHelper.fromMap (record, "HqGroupCorridor");
}

  private BSDMInteractionSpec _HqGroupCorridorDeleteSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param HQGCdeleteIn Input  Object.
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupCorridorObjectData delete (HqGroupCorridorObjectData HQGCdeleteIn) throws BSDMResourceException
  {
    return delete (null, HQGCdeleteIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCdeleteIn Input  Object.
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupCorridorObjectData delete (@HeaderParam ("context")BSDMSessionContext context,HqGroupCorridorObjectData HQGCdeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupCorridorDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HQGCdeleteIn != null) HqGroupCorridorObjectHelper.toMap (HQGCdeleteIn, record, "HqGroupCorridor");
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
return HqGroupCorridorObjectHelper.fromMap (record, "HqGroupCorridor");
}

  private BSDMInteractionSpec _HqGroupCorridorDeleteListSpec = null;
  /**
   * Delete HQGroupCorridors..
   * Convenience method using default BSDMSessionContext.
   * @param HQGCdeleteListIn Input Filter Object.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void deleteList (HqGroupCorridorObjectFilter HQGCdeleteListIn) throws BSDMResourceException
  {
    deleteList (null, HQGCdeleteListIn);
  }
  /**
   * Delete HQGroupCorridors..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCdeleteListIn Input Filter Object.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteList")
@Consumes({"application/json","application/xml"})

 public void deleteList (@HeaderParam ("context")BSDMSessionContext context,HqGroupCorridorObjectFilter HQGCdeleteListIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupCorridorDeleteListSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HQGCdeleteListIn != null) HqGroupCorridorObjectHelper.toMap (HQGCdeleteListIn, record, "HqGroupCorridor");
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
return;
}

  /**

   * Retrieve a unique Group Corridor..

   * Convenience method using default BSDMSessionContext.

   * @param HQGCgetIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupCorridorObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupCorridorObjectData get (HqGroupCorridorObjectData HQGCgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, HQGCgetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a unique Group Corridor..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCgetIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupCorridorObjectData get (BSDMSessionContext context, HqGroupCorridorObjectData HQGCgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HQGCgetIn, defaultAction);
       
     cManager.checkConstraints(HQGCgetIn, constraintAction);
       return get (context, HQGCgetIn);
  }

  /**

   * Find Group Corridor's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param HQGCfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupCorridorObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupCorridorObjectDataList find (HqGroupCorridorObjectFilter HQGCfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, HQGCfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find Group Corridor's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupCorridorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupCorridorObjectDataList find (BSDMSessionContext context, HqGroupCorridorObjectFilter HQGCfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HQGCfindIn, defaultAction);
       
     cManager.checkConstraints(HQGCfindIn, constraintAction);
       return find (context, HQGCfindIn);
  }

  /**

   * Create a new Group Corridor row..

   * Convenience method using default BSDMSessionContext.

   * @param HQGCcreateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupCorridorObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupCorridorObjectData create (HqGroupCorridorObjectData HQGCcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, HQGCcreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new Group Corridor row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCcreateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupCorridorObjectData create (BSDMSessionContext context, HqGroupCorridorObjectData HQGCcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HQGCcreateIn, defaultAction);
       
     cManager.checkConstraints(HQGCcreateIn, constraintAction);
       return create (context, HQGCcreateIn);
  }

  /**

   * Update a GroupCorridor..

   * Convenience method using default BSDMSessionContext.

   * @param HQGCupdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupCorridorObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupCorridorObjectData update (HqGroupCorridorObjectData HQGCupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, HQGCupdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update a GroupCorridor..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCupdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupCorridorObjectData update (BSDMSessionContext context, HqGroupCorridorObjectData HQGCupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HQGCupdateIn, defaultAction);
       
     cManager.checkConstraints(HQGCupdateIn, constraintAction);
       return update (context, HQGCupdateIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param HQGCdeleteIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupCorridorObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupCorridorObjectData delete (HqGroupCorridorObjectData HQGCdeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, HQGCdeleteIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCdeleteIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupCorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupCorridorObjectData delete (BSDMSessionContext context, HqGroupCorridorObjectData HQGCdeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HQGCdeleteIn, defaultAction);
       
     cManager.checkConstraints(HQGCdeleteIn, constraintAction);
       return delete (context, HQGCdeleteIn);
  }

  /**

   * Delete HQGroupCorridors..

   * Convenience method using default BSDMSessionContext.

   * @param HQGCdeleteListIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void deleteList (HqGroupCorridorObjectFilter HQGCdeleteListIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    deleteList (null, HQGCdeleteListIn, defaultAction, constraintAction);
  }
  /** 
   * Delete HQGroupCorridors..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGCdeleteListIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void deleteList (BSDMSessionContext context, HqGroupCorridorObjectFilter HQGCdeleteListIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HQGCdeleteListIn, defaultAction);
       
     cManager.checkConstraints(HQGCdeleteListIn, constraintAction);
       deleteList (context, HQGCdeleteListIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public HqGroupCorridorBean ()
  {
    try
    {
      _HqGroupCorridorGetSpec = new BSDMInteractionSpec("HqGroupCorridorGet", ApiMappings.getCallName ("HqGroupCorridorGet"), Boolean.FALSE);

      _HqGroupCorridorFindSpec = new BSDMInteractionSpec("HqGroupCorridorFind", ApiMappings.getCallName ("HqGroupCorridorFind"), Boolean.FALSE);

      _HqGroupCorridorCreateSpec = new BSDMInteractionSpec("HqGroupCorridorCreate", ApiMappings.getCallName ("HqGroupCorridorCreate"), Boolean.TRUE);

      _HqGroupCorridorUpdateSpec = new BSDMInteractionSpec("HqGroupCorridorUpdate", ApiMappings.getCallName ("HqGroupCorridorUpdate"), Boolean.TRUE);

      _HqGroupCorridorDeleteSpec = new BSDMInteractionSpec("HqGroupCorridorDelete", ApiMappings.getCallName ("HqGroupCorridorDelete"), Boolean.TRUE);

      _HqGroupCorridorDeleteListSpec = new BSDMInteractionSpec("HqGroupCorridorDeleteList", ApiMappings.getCallName ("HqGroupCorridorDeleteList"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public HqGroupCorridorBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public HqGroupCorridorBean(BSDMSettings settings, BSDMConnectionManager cm)
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
