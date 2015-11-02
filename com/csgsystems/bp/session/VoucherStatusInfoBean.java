
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: VoucherStatusInfoBean.java
 * Definition File: Catalog/VoucherStatusInfo.xml
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
import com.csgsystems.bp.interfaces.VoucherStatusInfoInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="VoucherStatusInfoSessionBean"
 * display-name="VoucherStatusInfo Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/VoucherStatusInfoBean"
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

@Stateless(name="VoucherStatusInfoBean", mappedName = "VoucherStatusInfo")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("VoucherStatusInfos")

public class VoucherStatusInfoBean implements VoucherStatusInfoInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _VoucherStatusInfoAssignSpec = null;
  /**
   * Assign Account or Service to a row in voucher_status_info..
   * Convenience method using default BSDMSessionContext.
   * @param VouAsIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherStatusInfoObjectData assign (VoucherStatusInfoObjectData VouAsIn) throws BSDMResourceException
  {
    return assign (null, VouAsIn);
  }
  /**
   * Assign Account or Service to a row in voucher_status_info..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouAsIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("assign")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VoucherStatusInfoObjectData assign (@HeaderParam ("context")BSDMSessionContext context,VoucherStatusInfoObjectData VouAsIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherStatusInfoAssignSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouAsIn != null) VoucherStatusInfoObjectHelper.toMap (VouAsIn, record, "VoucherStatusInfo");
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
return VoucherStatusInfoObjectHelper.fromMap (record, "VoucherStatusInfo");
}

  private BSDMInteractionSpec _VoucherStatusInfoActivateSpec = null;
  /**
   * Activate is Update Required fields for Activation in voucher_status_info..
   * Convenience method using default BSDMSessionContext.
   * @param VouAcIn Input  Object.  Read-Only fields: UniqueVoucherId, AccountInternalId, ServiceInternalId, ServiceInternalIdResets, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherStatusInfoObjectData activate (VoucherStatusInfoObjectData VouAcIn) throws BSDMResourceException
  {
    return activate (null, VouAcIn);
  }
  /**
   * Activate is Update Required fields for Activation in voucher_status_info..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouAcIn Input  Object.  Read-Only fields: UniqueVoucherId, AccountInternalId, ServiceInternalId, ServiceInternalIdResets, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("activate")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VoucherStatusInfoObjectData activate (@HeaderParam ("context")BSDMSessionContext context,VoucherStatusInfoObjectData VouAcIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherStatusInfoActivateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouAcIn != null) VoucherStatusInfoObjectHelper.toMap (VouAcIn, record, "VoucherStatusInfo");
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
return VoucherStatusInfoObjectHelper.fromMap (record, "VoucherStatusInfo");
}

  private BSDMInteractionSpec _VoucherStatusInfoUpdateSpec = null;
  /**
   * Update non-key fields for a row in voucher_status_info..
   * Convenience method using default BSDMSessionContext.
   * @param VouUIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Derived Fields: ChgWho, ChgDate.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherStatusInfoObjectData update (VoucherStatusInfoObjectData VouUIn) throws BSDMResourceException
  {
    return update (null, VouUIn);
  }
  /**
   * Update non-key fields for a row in voucher_status_info..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouUIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Derived Fields: ChgWho, ChgDate.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VoucherStatusInfoObjectData update (@HeaderParam ("context")BSDMSessionContext context,VoucherStatusInfoObjectData VouUIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherStatusInfoUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouUIn != null) VoucherStatusInfoObjectHelper.toMap (VouUIn, record, "VoucherStatusInfo");
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
return VoucherStatusInfoObjectHelper.fromMap (record, "VoucherStatusInfo");
}

  private BSDMInteractionSpec _VoucherStatusInfoConsumedSpec = null;
  /**
   * Update Status to Consumed state for a row in voucher_status_info..
   * Convenience method using default BSDMSessionContext.
   * @param VouCoIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherStatusInfoObjectData consumed (VoucherStatusInfoObjectData VouCoIn) throws BSDMResourceException
  {
    return consumed (null, VouCoIn);
  }
  /**
   * Update Status to Consumed state for a row in voucher_status_info..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouCoIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("consumed")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VoucherStatusInfoObjectData consumed (@HeaderParam ("context")BSDMSessionContext context,VoucherStatusInfoObjectData VouCoIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherStatusInfoConsumedSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouCoIn != null) VoucherStatusInfoObjectHelper.toMap (VouCoIn, record, "VoucherStatusInfo");
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
return VoucherStatusInfoObjectHelper.fromMap (record, "VoucherStatusInfo");
}

  private BSDMInteractionSpec _VoucherStatusInfoGetSpec = null;
  /**
   * Get Unique Voucher Status Info that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouGIn Input Object Key.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherStatusInfoObjectData get (VoucherStatusInfoObjectKeyData VouGIn) throws BSDMResourceException
  {
    return get (null, VouGIn);
  }
  /**
   * Get Unique Voucher Status Info that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouGIn Input Object Key.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public VoucherStatusInfoObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam VoucherStatusInfoObjectKeyData VouGIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherStatusInfoGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouGIn != null) VoucherStatusInfoObjectKeyHelper.toMap (VouGIn, record, "VoucherStatusInfo");
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
return VoucherStatusInfoObjectHelper.fromMap (record, "VoucherStatusInfo");
}

  private BSDMInteractionSpec _VoucherStatusInfoFindSpec = null;
  /**
   * Find Voucher Status Info that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouFIn Input Filter Object.
   * @return VoucherStatusInfoObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherStatusInfoObjectDataList find (VoucherStatusInfoObjectFilter VouFIn) throws BSDMResourceException
  {
    return find (null, VouFIn);
  }
  /**
   * Find Voucher Status Info that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouFIn Input Filter Object.
   * @return VoucherStatusInfoObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VoucherStatusInfoObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,VoucherStatusInfoObjectFilter VouFIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherStatusInfoFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouFIn != null) VoucherStatusInfoObjectHelper.toMap (VouFIn, record, "VoucherStatusInfo");
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
return VoucherStatusInfoObjectHelper.fromMapList (record, "VoucherStatusInfoList");
}

  /**

   * Assign Account or Service to a row in voucher_status_info..

   * Convenience method using default BSDMSessionContext.

   * @param VouAsIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherStatusInfoObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherStatusInfoObjectData assign (VoucherStatusInfoObjectData VouAsIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return assign (null, VouAsIn, defaultAction, constraintAction);
  }
  /** 
   * Assign Account or Service to a row in voucher_status_info..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouAsIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherStatusInfoObjectData assign (BSDMSessionContext context, VoucherStatusInfoObjectData VouAsIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouAsIn, defaultAction);
       
     cManager.checkConstraints(VouAsIn, constraintAction);
       return assign (context, VouAsIn);
  }

  /**

   * Activate is Update Required fields for Activation in voucher_status_info..

   * Convenience method using default BSDMSessionContext.

   * @param VouAcIn Input  Object.  Read-Only fields: UniqueVoucherId, AccountInternalId, ServiceInternalId, ServiceInternalIdResets, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherStatusInfoObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherStatusInfoObjectData activate (VoucherStatusInfoObjectData VouAcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return activate (null, VouAcIn, defaultAction, constraintAction);
  }
  /** 
   * Activate is Update Required fields for Activation in voucher_status_info..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouAcIn Input  Object.  Read-Only fields: UniqueVoucherId, AccountInternalId, ServiceInternalId, ServiceInternalIdResets, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherStatusInfoObjectData activate (BSDMSessionContext context, VoucherStatusInfoObjectData VouAcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouAcIn, defaultAction);
       
     cManager.checkConstraints(VouAcIn, constraintAction);
       return activate (context, VouAcIn);
  }

  /**

   * Update non-key fields for a row in voucher_status_info..

   * Convenience method using default BSDMSessionContext.

   * @param VouUIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherStatusInfoObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherStatusInfoObjectData update (VoucherStatusInfoObjectData VouUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, VouUIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields for a row in voucher_status_info..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouUIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Derived Fields: ChgWho, ChgDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherStatusInfoObjectData update (BSDMSessionContext context, VoucherStatusInfoObjectData VouUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouUIn, defaultAction);
       
     cManager.checkConstraints(VouUIn, constraintAction);
       return update (context, VouUIn);
  }

  /**

   * Update Status to Consumed state for a row in voucher_status_info..

   * Convenience method using default BSDMSessionContext.

   * @param VouCoIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherStatusInfoObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherStatusInfoObjectData consumed (VoucherStatusInfoObjectData VouCoIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return consumed (null, VouCoIn, defaultAction, constraintAction);
  }
  /** 
   * Update Status to Consumed state for a row in voucher_status_info..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouCoIn Input  Object.  Read-Only fields: UniqueVoucherId, ActiveDate, InactiveDate.  Defaulted Fields: Status.  Derived Fields: ChgWho, ChgDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherStatusInfoObjectData consumed (BSDMSessionContext context, VoucherStatusInfoObjectData VouCoIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouCoIn, defaultAction);
       
     cManager.checkConstraints(VouCoIn, constraintAction);
       return consumed (context, VouCoIn);
  }

  /**

   * Get Unique Voucher Status Info that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param VouGIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherStatusInfoObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherStatusInfoObjectData get (VoucherStatusInfoObjectKeyData VouGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, VouGIn, defaultAction, constraintAction);
  }
  /** 
   * Get Unique Voucher Status Info that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouGIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherStatusInfoObjectData get (BSDMSessionContext context, VoucherStatusInfoObjectKeyData VouGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouGIn, defaultAction);
       
     cManager.checkConstraints(VouGIn, constraintAction);
       return get (context, VouGIn);
  }

  /**

   * Find Voucher Status Info that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param VouFIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherStatusInfoObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherStatusInfoObjectDataList find (VoucherStatusInfoObjectFilter VouFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, VouFIn, defaultAction, constraintAction);
  }
  /** 
   * Find Voucher Status Info that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouFIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherStatusInfoObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherStatusInfoObjectDataList find (BSDMSessionContext context, VoucherStatusInfoObjectFilter VouFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouFIn, defaultAction);
       
     cManager.checkConstraints(VouFIn, constraintAction);
       return find (context, VouFIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public VoucherStatusInfoBean ()
  {
    try
    {
      _VoucherStatusInfoAssignSpec = new BSDMInteractionSpec("VoucherStatusInfoAssign", ApiMappings.getCallName ("VoucherStatusInfoAssign"), Boolean.TRUE);

      _VoucherStatusInfoActivateSpec = new BSDMInteractionSpec("VoucherStatusInfoActivate", ApiMappings.getCallName ("VoucherStatusInfoActivate"), Boolean.TRUE);

      _VoucherStatusInfoUpdateSpec = new BSDMInteractionSpec("VoucherStatusInfoUpdate", ApiMappings.getCallName ("VoucherStatusInfoUpdate"), Boolean.TRUE);

      _VoucherStatusInfoConsumedSpec = new BSDMInteractionSpec("VoucherStatusInfoConsumed", ApiMappings.getCallName ("VoucherStatusInfoConsumed"), Boolean.TRUE);

      _VoucherStatusInfoGetSpec = new BSDMInteractionSpec("VoucherStatusInfoGet", ApiMappings.getCallName ("VoucherStatusInfoGet"), Boolean.TRUE);

      _VoucherStatusInfoFindSpec = new BSDMInteractionSpec("VoucherStatusInfoFind", ApiMappings.getCallName ("VoucherStatusInfoFind"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public VoucherStatusInfoBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public VoucherStatusInfoBean(BSDMSettings settings, BSDMConnectionManager cm)
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
