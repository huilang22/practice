
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: HqContractUnitCrBean.java
 * Definition File: Catalog/HqContractUnitCr.xml
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
import com.csgsystems.bp.interfaces.HqContractUnitCrInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="HqContractUnitCrSessionBean"
 * display-name="HqContractUnitCr Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/HqContractUnitCrBean"
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

@Stateless(name="HqContractUnitCrBean", mappedName = "HqContractUnitCr")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("HqContractUnitCrs")

public class HqContractUnitCrBean implements HqContractUnitCrInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _HqContractUnitCrGetSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param HqContractUnitCrGetIn Input Object Key.
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqContractUnitCrObjectData get (HqContractUnitCrObjectKeyData HqContractUnitCrGetIn) throws BSDMResourceException
  {
    return get (null, HqContractUnitCrGetIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param HqContractUnitCrGetIn Input Object Key.
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public HqContractUnitCrObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam HqContractUnitCrObjectKeyData HqContractUnitCrGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqContractUnitCrGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HqContractUnitCrGetIn != null) HqContractUnitCrObjectKeyHelper.toMap (HqContractUnitCrGetIn, record, "HqContractUnitCr");
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
return HqContractUnitCrObjectHelper.fromMap (record, "HqContractUnitCr");
}

  private BSDMInteractionSpec _HqContractUnitCrFindSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param HqContractUnitCrFindIn Input Filter Object.
   * @return HqContractUnitCrObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqContractUnitCrObjectDataList find (HqContractUnitCrObjectFilter HqContractUnitCrFindIn) throws BSDMResourceException
  {
    return find (null, HqContractUnitCrFindIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param HqContractUnitCrFindIn Input Filter Object.
   * @return HqContractUnitCrObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqContractUnitCrObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,HqContractUnitCrObjectFilter HqContractUnitCrFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqContractUnitCrFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HqContractUnitCrFindIn != null) HqContractUnitCrObjectHelper.toMap (HqContractUnitCrFindIn, record, "HqContractUnitCr");
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
return HqContractUnitCrObjectHelper.fromMapList (record, "HqContractUnitCrList");
}

  private BSDMInteractionSpec _HqContractUnitCrCreateSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param HqContractUnitCrCreateIn Input  Object.
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqContractUnitCrObjectData create (HqContractUnitCrObjectData HqContractUnitCrCreateIn) throws BSDMResourceException
  {
    return create (null, HqContractUnitCrCreateIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param HqContractUnitCrCreateIn Input  Object.
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqContractUnitCrObjectData create (@HeaderParam ("context")BSDMSessionContext context,HqContractUnitCrObjectData HqContractUnitCrCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqContractUnitCrCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HqContractUnitCrCreateIn != null) HqContractUnitCrObjectHelper.toMap (HqContractUnitCrCreateIn, record, "HqContractUnitCr");
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
return HqContractUnitCrObjectHelper.fromMap (record, "HqContractUnitCr");
}

  private BSDMInteractionSpec _HqContractUnitCrUpdateSpec = null;
  /**
   * 
				Update the values (other than the key) of the HqContractUnitCrObject.
			.
   * Convenience method using default BSDMSessionContext.
   * @param HqContractUnitCrupdate_In Input  Object.
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqContractUnitCrObjectData update (HqContractUnitCrObjectData HqContractUnitCrupdate_In) throws BSDMResourceException
  {
    return update (null, HqContractUnitCrupdate_In);
  }
  /**
   * 
				Update the values (other than the key) of the HqContractUnitCrObject.
			.
   * @param context The session context to use when connecting to the APITS server.
   * @param HqContractUnitCrupdate_In Input  Object.
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqContractUnitCrObjectData update (@HeaderParam ("context")BSDMSessionContext context,HqContractUnitCrObjectData HqContractUnitCrupdate_In) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqContractUnitCrUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HqContractUnitCrupdate_In != null) HqContractUnitCrObjectHelper.toMap (HqContractUnitCrupdate_In, record, "HqContractUnitCr");
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
return HqContractUnitCrObjectHelper.fromMap (record, "HqContractUnitCr");
}

  private BSDMInteractionSpec _HqContractUnitCrDeleteSpec = null;
  /**
   * 
				Delete the HQ_CONTRACT_UNIT_CR row.
			.
   * Convenience method using default BSDMSessionContext.
   * @param HqContractUnitCrdelete_In Input Object Key.
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqContractUnitCrObjectData delete (HqContractUnitCrObjectKeyData HqContractUnitCrdelete_In) throws BSDMResourceException
  {
    return delete (null, HqContractUnitCrdelete_In);
  }
  /**
   * 
				Delete the HQ_CONTRACT_UNIT_CR row.
			.
   * @param context The session context to use when connecting to the APITS server.
   * @param HqContractUnitCrdelete_In Input Object Key.
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqContractUnitCrObjectData delete (@HeaderParam ("context")BSDMSessionContext context,HqContractUnitCrObjectKeyData HqContractUnitCrdelete_In) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqContractUnitCrDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HqContractUnitCrdelete_In != null) HqContractUnitCrObjectKeyHelper.toMap (HqContractUnitCrdelete_In, record, "HqContractUnitCr");
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
return HqContractUnitCrObjectHelper.fromMap (record, "HqContractUnitCr");
}

  /**

   * Convenience method using default BSDMSessionContext.

   * @param HqContractUnitCrGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqContractUnitCrObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqContractUnitCrObjectData get (HqContractUnitCrObjectKeyData HqContractUnitCrGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, HqContractUnitCrGetIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param HqContractUnitCrGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqContractUnitCrObjectData get (BSDMSessionContext context, HqContractUnitCrObjectKeyData HqContractUnitCrGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HqContractUnitCrGetIn, defaultAction);
       
     cManager.checkConstraints(HqContractUnitCrGetIn, constraintAction);
       return get (context, HqContractUnitCrGetIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param HqContractUnitCrFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqContractUnitCrObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqContractUnitCrObjectDataList find (HqContractUnitCrObjectFilter HqContractUnitCrFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, HqContractUnitCrFindIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param HqContractUnitCrFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqContractUnitCrObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqContractUnitCrObjectDataList find (BSDMSessionContext context, HqContractUnitCrObjectFilter HqContractUnitCrFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HqContractUnitCrFindIn, defaultAction);
       
     cManager.checkConstraints(HqContractUnitCrFindIn, constraintAction);
       return find (context, HqContractUnitCrFindIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param HqContractUnitCrCreateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqContractUnitCrObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqContractUnitCrObjectData create (HqContractUnitCrObjectData HqContractUnitCrCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, HqContractUnitCrCreateIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param HqContractUnitCrCreateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqContractUnitCrObjectData create (BSDMSessionContext context, HqContractUnitCrObjectData HqContractUnitCrCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HqContractUnitCrCreateIn, defaultAction);
       
     cManager.checkConstraints(HqContractUnitCrCreateIn, constraintAction);
       return create (context, HqContractUnitCrCreateIn);
  }

  /**

   * 
				Update the values (other than the key) of the HqContractUnitCrObject.
			.

   * Convenience method using default BSDMSessionContext.

   * @param HqContractUnitCrupdate_In Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqContractUnitCrObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqContractUnitCrObjectData update (HqContractUnitCrObjectData HqContractUnitCrupdate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, HqContractUnitCrupdate_In, defaultAction, constraintAction);
  }
  /** 
   * 
				Update the values (other than the key) of the HqContractUnitCrObject.
			.
   * @param context The session context to use when connecting to the APITS server.
   * @param HqContractUnitCrupdate_In Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqContractUnitCrObjectData update (BSDMSessionContext context, HqContractUnitCrObjectData HqContractUnitCrupdate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HqContractUnitCrupdate_In, defaultAction);
       
     cManager.checkConstraints(HqContractUnitCrupdate_In, constraintAction);
       return update (context, HqContractUnitCrupdate_In);
  }

  /**

   * 
				Delete the HQ_CONTRACT_UNIT_CR row.
			.

   * Convenience method using default BSDMSessionContext.

   * @param HqContractUnitCrdelete_In Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqContractUnitCrObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqContractUnitCrObjectData delete (HqContractUnitCrObjectKeyData HqContractUnitCrdelete_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, HqContractUnitCrdelete_In, defaultAction, constraintAction);
  }
  /** 
   * 
				Delete the HQ_CONTRACT_UNIT_CR row.
			.
   * @param context The session context to use when connecting to the APITS server.
   * @param HqContractUnitCrdelete_In Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqContractUnitCrObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqContractUnitCrObjectData delete (BSDMSessionContext context, HqContractUnitCrObjectKeyData HqContractUnitCrdelete_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HqContractUnitCrdelete_In, defaultAction);
       
     cManager.checkConstraints(HqContractUnitCrdelete_In, constraintAction);
       return delete (context, HqContractUnitCrdelete_In);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public HqContractUnitCrBean ()
  {
    try
    {
      _HqContractUnitCrGetSpec = new BSDMInteractionSpec("HqContractUnitCrGet", ApiMappings.getCallName ("HqContractUnitCrGet"), Boolean.TRUE);

      _HqContractUnitCrFindSpec = new BSDMInteractionSpec("HqContractUnitCrFind", ApiMappings.getCallName ("HqContractUnitCrFind"), Boolean.TRUE);

      _HqContractUnitCrCreateSpec = new BSDMInteractionSpec("HqContractUnitCrCreate", ApiMappings.getCallName ("HqContractUnitCrCreate"), Boolean.TRUE);

      _HqContractUnitCrUpdateSpec = new BSDMInteractionSpec("HqContractUnitCrUpdate", ApiMappings.getCallName ("HqContractUnitCrUpdate"), Boolean.TRUE);

      _HqContractUnitCrDeleteSpec = new BSDMInteractionSpec("HqContractUnitCrDelete", ApiMappings.getCallName ("HqContractUnitCrDelete"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public HqContractUnitCrBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public HqContractUnitCrBean(BSDMSettings settings, BSDMConnectionManager cm)
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
