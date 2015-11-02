
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: HqGroupContractsBean.java
 * Definition File: Catalog/HqGroupContracts.xml
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
import com.csgsystems.bp.interfaces.HqGroupContractsInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="HqGroupContractsSessionBean"
 * display-name="HqGroupContracts Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/HqGroupContractsBean"
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

@Stateless(name="HqGroupContractsBean", mappedName = "HqGroupContracts")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("HqGroupContracts")

public class HqGroupContractsBean implements HqGroupContractsInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _HqGroupContractsGetSpec = null;
  /**
   * Retrieve a unique Group Product..
   * Convenience method using default BSDMSessionContext.
   * @param HQGroupContractsgetIn Input  Object.
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupContractsObjectData get (HqGroupContractsObjectData HQGroupContractsgetIn) throws BSDMResourceException
  {
    return get (null, HQGroupContractsgetIn);
  }
  /**
   * Retrieve a unique Group Product..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGroupContractsgetIn Input  Object.
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public HqGroupContractsObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam HqGroupContractsObjectData HQGroupContractsgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupContractsGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HQGroupContractsgetIn != null) HqGroupContractsObjectHelper.toMap (HQGroupContractsgetIn, record, "HqGroupContracts");
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
return HqGroupContractsObjectHelper.fromMap (record, "HqGroupContracts");
}

  private BSDMInteractionSpec _HqGroupContractsFindSpec = null;
  /**
   * Find Group Product's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HQGroupContractsfindIn Input Filter Object.
   * @return HqGroupContractsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupContractsObjectDataList find (HqGroupContractsObjectFilter HQGroupContractsfindIn) throws BSDMResourceException
  {
    return find (null, HQGroupContractsfindIn);
  }
  /**
   * Find Group Product's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGroupContractsfindIn Input Filter Object.
   * @return HqGroupContractsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupContractsObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,HqGroupContractsObjectFilter HQGroupContractsfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupContractsFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HQGroupContractsfindIn != null) HqGroupContractsObjectHelper.toMap (HQGroupContractsfindIn, record, "HqGroupContracts");
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
return HqGroupContractsObjectHelper.fromMapList (record, "HqGroupContractsList");
}

  private BSDMInteractionSpec _HqGroupContractsCreateSpec = null;
  /**
   * Create a new Group Product row, tracking_id and tracking_id_serv should be present in CUSTOMER_CONTRACTS..
   * Convenience method using default BSDMSessionContext.
   * @param HQGroupContractscreateIn Input  Object.
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupContractsObjectData create (HqGroupContractsObjectData HQGroupContractscreateIn) throws BSDMResourceException
  {
    return create (null, HQGroupContractscreateIn);
  }
  /**
   * Create a new Group Product row, tracking_id and tracking_id_serv should be present in CUSTOMER_CONTRACTS..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGroupContractscreateIn Input  Object.
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupContractsObjectData create (@HeaderParam ("context")BSDMSessionContext context,HqGroupContractsObjectData HQGroupContractscreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupContractsCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HQGroupContractscreateIn != null) HqGroupContractsObjectHelper.toMap (HQGroupContractscreateIn, record, "HqGroupContracts");
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
return HqGroupContractsObjectHelper.fromMap (record, "HqGroupContracts");
}

  private BSDMInteractionSpec _HqGroupContractsDeleteSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param HQGroupContractsDeleteIn Input  Object.
   * @param ContractViewId.
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupContractsObjectData delete (HqGroupContractsObjectData HQGroupContractsDeleteIn, Integer ContractViewId) throws BSDMResourceException
  {
    return delete (null, HQGroupContractsDeleteIn, ContractViewId);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGroupContractsDeleteIn Input  Object.
   * @param ContractViewId.
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupContractsObjectData delete (@HeaderParam ("context")BSDMSessionContext context,HqGroupContractsObjectData HQGroupContractsDeleteIn,@FormParam("ContractViewId")Integer ContractViewId) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupContractsDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HQGroupContractsDeleteIn != null) HqGroupContractsObjectHelper.toMap (HQGroupContractsDeleteIn, record, "HqGroupContracts");

      if (ContractViewId != null) record.put ("ContractViewId", ContractViewId);
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
return HqGroupContractsObjectHelper.fromMap (record, "HqGroupContracts");
}

  private BSDMInteractionSpec _HqGroupContractsUpdateSpec = null;
  /**
   * 
            Update the values (other than the key) of the HqGroupContractsObject.
        .
   * Convenience method using default BSDMSessionContext.
   * @param HqGroupContractsupdate_In Input  Object.
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupContractsObjectData update (HqGroupContractsObjectData HqGroupContractsupdate_In) throws BSDMResourceException
  {
    return update (null, HqGroupContractsupdate_In);
  }
  /**
   * 
            Update the values (other than the key) of the HqGroupContractsObject.
        .
   * @param context The session context to use when connecting to the APITS server.
   * @param HqGroupContractsupdate_In Input  Object.
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupContractsObjectData update (@HeaderParam ("context")BSDMSessionContext context,HqGroupContractsObjectData HqGroupContractsupdate_In) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupContractsUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HqGroupContractsupdate_In != null) HqGroupContractsObjectHelper.toMap (HqGroupContractsupdate_In, record, "HqGroupContracts");
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
return HqGroupContractsObjectHelper.fromMap (record, "HqGroupContracts");
}

  /**

   * Retrieve a unique Group Product..

   * Convenience method using default BSDMSessionContext.

   * @param HQGroupContractsgetIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupContractsObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupContractsObjectData get (HqGroupContractsObjectData HQGroupContractsgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, HQGroupContractsgetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a unique Group Product..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGroupContractsgetIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupContractsObjectData get (BSDMSessionContext context, HqGroupContractsObjectData HQGroupContractsgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HQGroupContractsgetIn, defaultAction);
       
     cManager.checkConstraints(HQGroupContractsgetIn, constraintAction);
       return get (context, HQGroupContractsgetIn);
  }

  /**

   * Find Group Product's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param HQGroupContractsfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupContractsObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupContractsObjectDataList find (HqGroupContractsObjectFilter HQGroupContractsfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, HQGroupContractsfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find Group Product's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGroupContractsfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupContractsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupContractsObjectDataList find (BSDMSessionContext context, HqGroupContractsObjectFilter HQGroupContractsfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HQGroupContractsfindIn, defaultAction);
       
     cManager.checkConstraints(HQGroupContractsfindIn, constraintAction);
       return find (context, HQGroupContractsfindIn);
  }

  /**

   * Create a new Group Product row, tracking_id and tracking_id_serv should be present in CUSTOMER_CONTRACTS..

   * Convenience method using default BSDMSessionContext.

   * @param HQGroupContractscreateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupContractsObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupContractsObjectData create (HqGroupContractsObjectData HQGroupContractscreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, HQGroupContractscreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new Group Product row, tracking_id and tracking_id_serv should be present in CUSTOMER_CONTRACTS..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGroupContractscreateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupContractsObjectData create (BSDMSessionContext context, HqGroupContractsObjectData HQGroupContractscreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HQGroupContractscreateIn, defaultAction);
       
     cManager.checkConstraints(HQGroupContractscreateIn, constraintAction);
       return create (context, HQGroupContractscreateIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param HQGroupContractsDeleteIn Input  Object.

   * @param ContractViewId.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupContractsObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupContractsObjectData delete (HqGroupContractsObjectData HQGroupContractsDeleteIn, Integer ContractViewId, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, HQGroupContractsDeleteIn, ContractViewId, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGroupContractsDeleteIn Input  Object.
   * @param ContractViewId.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupContractsObjectData delete (BSDMSessionContext context, HqGroupContractsObjectData HQGroupContractsDeleteIn, Integer ContractViewId, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HQGroupContractsDeleteIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(HQGroupContractsDeleteIn, constraintAction);
       
    //Constraints not supported on Input-Column
return delete (context, HQGroupContractsDeleteIn, ContractViewId);
  }

  /**

   * 
            Update the values (other than the key) of the HqGroupContractsObject.
        .

   * Convenience method using default BSDMSessionContext.

   * @param HqGroupContractsupdate_In Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupContractsObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupContractsObjectData update (HqGroupContractsObjectData HqGroupContractsupdate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, HqGroupContractsupdate_In, defaultAction, constraintAction);
  }
  /** 
   * 
            Update the values (other than the key) of the HqGroupContractsObject.
        .
   * @param context The session context to use when connecting to the APITS server.
   * @param HqGroupContractsupdate_In Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupContractsObjectData update (BSDMSessionContext context, HqGroupContractsObjectData HqGroupContractsupdate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HqGroupContractsupdate_In, defaultAction);
       
     cManager.checkConstraints(HqGroupContractsupdate_In, constraintAction);
       return update (context, HqGroupContractsupdate_In);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public HqGroupContractsBean ()
  {
    try
    {
      _HqGroupContractsGetSpec = new BSDMInteractionSpec("HqGroupContractsGet", ApiMappings.getCallName ("HqGroupContractsGet"), Boolean.TRUE);

      _HqGroupContractsFindSpec = new BSDMInteractionSpec("HqGroupContractsFind", ApiMappings.getCallName ("HqGroupContractsFind"), Boolean.TRUE);

      _HqGroupContractsCreateSpec = new BSDMInteractionSpec("HqGroupContractsCreate", ApiMappings.getCallName ("HqGroupContractsCreate"), Boolean.TRUE);

      _HqGroupContractsDeleteSpec = new BSDMInteractionSpec("HqGroupContractsDelete", ApiMappings.getCallName ("HqGroupContractsDelete"), Boolean.TRUE);

      _HqGroupContractsUpdateSpec = new BSDMInteractionSpec("HqGroupContractsUpdate", ApiMappings.getCallName ("HqGroupContractsUpdate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public HqGroupContractsBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public HqGroupContractsBean(BSDMSettings settings, BSDMConnectionManager cm)
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
