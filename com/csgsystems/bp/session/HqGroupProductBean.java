
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: HqGroupProductBean.java
 * Definition File: Catalog/HqGroupProduct.xml
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
import com.csgsystems.bp.interfaces.HqGroupProductInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="HqGroupProductSessionBean"
 * display-name="HqGroupProduct Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/HqGroupProductBean"
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

@Stateless(name="HqGroupProductBean", mappedName = "HqGroupProduct")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("HqGroupProducts")

public class HqGroupProductBean implements HqGroupProductInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _HqGroupProductGetSpec = null;
  /**
   * Retrieve a unique Group Product..
   * Convenience method using default BSDMSessionContext.
   * @param HQGPgetIn Input  Object.
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupProductObjectData get (HqGroupProductObjectData HQGPgetIn) throws BSDMResourceException
  {
    return get (null, HQGPgetIn);
  }
  /**
   * Retrieve a unique Group Product..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPgetIn Input  Object.
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
 
public HqGroupProductObjectData get (BSDMSessionContext context, HqGroupProductObjectData HQGPgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupProductGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HQGPgetIn != null) HqGroupProductObjectHelper.toMap (HQGPgetIn, record, "HqGroupProduct");
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
return HqGroupProductObjectHelper.fromMap (record, "HqGroupProduct");
}

  private BSDMInteractionSpec _HqGroupProductFindSpec = null;
  /**
   * Find Group Product's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HQGPfindIn Input Filter Object.
   * @return HqGroupProductObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupProductObjectDataList find (HqGroupProductObjectFilter HQGPfindIn) throws BSDMResourceException
  {
    return find (null, HQGPfindIn);
  }
  /**
   * Find Group Product's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPfindIn Input Filter Object.
   * @return HqGroupProductObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
 
public HqGroupProductObjectDataList find (BSDMSessionContext context, HqGroupProductObjectFilter HQGPfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupProductFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HQGPfindIn != null) HqGroupProductObjectHelper.toMap (HQGPfindIn, record, "HqGroupProduct");
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
return HqGroupProductObjectHelper.fromMapList (record, "HqGroupProductList");
}

  private BSDMInteractionSpec _HqGroupProductCreateSpec = null;
  /**
   * Create a new Group Product row..
   * Convenience method using default BSDMSessionContext.
   * @param HQGPcreateIn Input  Object.
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupProductObjectData create (HqGroupProductObjectData HQGPcreateIn) throws BSDMResourceException
  {
    return create (null, HQGPcreateIn);
  }
  /**
   * Create a new Group Product row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPcreateIn Input  Object.
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupProductObjectData create (@HeaderParam ("context")BSDMSessionContext context,HqGroupProductObjectData HQGPcreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupProductCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HQGPcreateIn != null) HqGroupProductObjectHelper.toMap (HQGPcreateIn, record, "HqGroupProduct");
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
return HqGroupProductObjectHelper.fromMap (record, "HqGroupProduct");
}

  private BSDMInteractionSpec _HqGroupProductUpdateSpec = null;
  /**
   * Update a GroupProduct..
   * Convenience method using default BSDMSessionContext.
   * @param HQGPupdateIn Input  Object.
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupProductObjectData update (HqGroupProductObjectData HQGPupdateIn) throws BSDMResourceException
  {
    return update (null, HQGPupdateIn);
  }
  /**
   * Update a GroupProduct..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPupdateIn Input  Object.
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupProductObjectData update (@HeaderParam ("context")BSDMSessionContext context,HqGroupProductObjectData HQGPupdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupProductUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HQGPupdateIn != null) HqGroupProductObjectHelper.toMap (HQGPupdateIn, record, "HqGroupProduct");
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
return HqGroupProductObjectHelper.fromMap (record, "HqGroupProduct");
}

  private BSDMInteractionSpec _HqGroupProductDeleteSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param HQGPdeleteIn Input  Object.
   * @param ProductViewId.
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupProductObjectData delete (HqGroupProductObjectData HQGPdeleteIn, Integer ProductViewId) throws BSDMResourceException
  {
    return delete (null, HQGPdeleteIn, ProductViewId);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPdeleteIn Input  Object.
   * @param ProductViewId.
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupProductObjectData delete (@HeaderParam ("context")BSDMSessionContext context,HqGroupProductObjectData HQGPdeleteIn,@FormParam("ProductViewId")Integer ProductViewId) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupProductDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HQGPdeleteIn != null) HqGroupProductObjectHelper.toMap (HQGPdeleteIn, record, "HqGroupProduct");

      if (ProductViewId != null) record.put ("ProductViewId", ProductViewId);
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
return HqGroupProductObjectHelper.fromMap (record, "HqGroupProduct");
}

  private BSDMInteractionSpec _HqGroupProductDeleteListSpec = null;
  /**
   * Delete GroupProducts..
   * Convenience method using default BSDMSessionContext.
   * @param HQGPdeleteListIn Input Filter Object.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void deleteList (HqGroupProductObjectFilter HQGPdeleteListIn) throws BSDMResourceException
  {
    deleteList (null, HQGPdeleteListIn);
  }
  /**
   * Delete GroupProducts..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPdeleteListIn Input Filter Object.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteList")
@Consumes({"application/json","application/xml"})

 public void deleteList (@HeaderParam ("context")BSDMSessionContext context,HqGroupProductObjectFilter HQGPdeleteListIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupProductDeleteListSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HQGPdeleteListIn != null) HqGroupProductObjectHelper.toMap (HQGPdeleteListIn, record, "HqGroupProduct");
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

   * Retrieve a unique Group Product..

   * Convenience method using default BSDMSessionContext.

   * @param HQGPgetIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupProductObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupProductObjectData get (HqGroupProductObjectData HQGPgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, HQGPgetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a unique Group Product..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPgetIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupProductObjectData get (BSDMSessionContext context, HqGroupProductObjectData HQGPgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HQGPgetIn, defaultAction);
       
     cManager.checkConstraints(HQGPgetIn, constraintAction);
       return get (context, HQGPgetIn);
  }

  /**

   * Find Group Product's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param HQGPfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupProductObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupProductObjectDataList find (HqGroupProductObjectFilter HQGPfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, HQGPfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find Group Product's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupProductObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupProductObjectDataList find (BSDMSessionContext context, HqGroupProductObjectFilter HQGPfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HQGPfindIn, defaultAction);
       
     cManager.checkConstraints(HQGPfindIn, constraintAction);
       return find (context, HQGPfindIn);
  }

  /**

   * Create a new Group Product row..

   * Convenience method using default BSDMSessionContext.

   * @param HQGPcreateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupProductObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupProductObjectData create (HqGroupProductObjectData HQGPcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, HQGPcreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new Group Product row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPcreateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupProductObjectData create (BSDMSessionContext context, HqGroupProductObjectData HQGPcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HQGPcreateIn, defaultAction);
       
     cManager.checkConstraints(HQGPcreateIn, constraintAction);
       return create (context, HQGPcreateIn);
  }

  /**

   * Update a GroupProduct..

   * Convenience method using default BSDMSessionContext.

   * @param HQGPupdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupProductObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupProductObjectData update (HqGroupProductObjectData HQGPupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, HQGPupdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update a GroupProduct..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPupdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupProductObjectData update (BSDMSessionContext context, HqGroupProductObjectData HQGPupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HQGPupdateIn, defaultAction);
       
     cManager.checkConstraints(HQGPupdateIn, constraintAction);
       return update (context, HQGPupdateIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param HQGPdeleteIn Input  Object.

   * @param ProductViewId.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupProductObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupProductObjectData delete (HqGroupProductObjectData HQGPdeleteIn, Integer ProductViewId, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, HQGPdeleteIn, ProductViewId, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPdeleteIn Input  Object.
   * @param ProductViewId.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupProductObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupProductObjectData delete (BSDMSessionContext context, HqGroupProductObjectData HQGPdeleteIn, Integer ProductViewId, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HQGPdeleteIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(HQGPdeleteIn, constraintAction);
       
    //Constraints not supported on Input-Column
return delete (context, HQGPdeleteIn, ProductViewId);
  }

  /**

   * Delete GroupProducts..

   * Convenience method using default BSDMSessionContext.

   * @param HQGPdeleteListIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void deleteList (HqGroupProductObjectFilter HQGPdeleteListIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    deleteList (null, HQGPdeleteListIn, defaultAction, constraintAction);
  }
  /** 
   * Delete GroupProducts..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGPdeleteListIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void deleteList (BSDMSessionContext context, HqGroupProductObjectFilter HQGPdeleteListIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HQGPdeleteListIn, defaultAction);
       
     cManager.checkConstraints(HQGPdeleteListIn, constraintAction);
       deleteList (context, HQGPdeleteListIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public HqGroupProductBean ()
  {
    try
    {
      _HqGroupProductGetSpec = new BSDMInteractionSpec("HqGroupProductGet", ApiMappings.getCallName ("HqGroupProductGet"), Boolean.FALSE);

      _HqGroupProductFindSpec = new BSDMInteractionSpec("HqGroupProductFind", ApiMappings.getCallName ("HqGroupProductFind"), Boolean.FALSE);

      _HqGroupProductCreateSpec = new BSDMInteractionSpec("HqGroupProductCreate", ApiMappings.getCallName ("HqGroupProductCreate"), Boolean.TRUE);

      _HqGroupProductUpdateSpec = new BSDMInteractionSpec("HqGroupProductUpdate", ApiMappings.getCallName ("HqGroupProductUpdate"), Boolean.TRUE);

      _HqGroupProductDeleteSpec = new BSDMInteractionSpec("HqGroupProductDelete", ApiMappings.getCallName ("HqGroupProductDelete"), Boolean.TRUE);

      _HqGroupProductDeleteListSpec = new BSDMInteractionSpec("HqGroupProductDeleteList", ApiMappings.getCallName ("HqGroupProductDeleteList"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public HqGroupProductBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public HqGroupProductBean(BSDMSettings settings, BSDMConnectionManager cm)
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
