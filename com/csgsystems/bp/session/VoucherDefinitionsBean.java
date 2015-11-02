
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: VoucherDefinitionsBean.java
 * Definition File: Catalog/VoucherDefinitions.xml
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
import com.csgsystems.bp.interfaces.VoucherDefinitionsInterface;
import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="VoucherDefinitionsSessionBean"
 * display-name="VoucherDefinitions Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/VoucherDefinitionsBean"
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

@Stateless(name="VoucherDefinitionsBean", mappedName = "VoucherDefinitions")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("VoucherDefinitions")

public class VoucherDefinitionsBean implements VoucherDefinitionsInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _VoucherDefinitionsCreateSpec = null;
  /**
   * Create New Voucher Definition..
   * Convenience method using default BSDMSessionContext.
   * @param VouCIn Input  Object.
   * @return VoucherDefinitionsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherDefinitionsObjectData create (VoucherDefinitionsObjectData VouCIn) throws BSDMResourceException
  {
    return create (null, VouCIn);
  }
  /**
   * Create New Voucher Definition..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouCIn Input  Object.
   * @return VoucherDefinitionsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VoucherDefinitionsObjectData create (@HeaderParam ("context")BSDMSessionContext context,VoucherDefinitionsObjectData VouCIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherDefinitionsCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouCIn != null) VoucherDefinitionsObjectHelper.toMap (VouCIn, record, "VoucherDefinitions");
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
return VoucherDefinitionsObjectHelper.fromMap (record, "VoucherDefinitions");
}

  private BSDMInteractionSpec _VoucherDefinitionsLocationUpdateSpec = null;
  /**
   * Update Location ID field for a row in VOUCHER_DEFINITIONS..
   * Convenience method using default BSDMSessionContext.
   * @param VouULIn Input  Object.  Read-Only fields: UniqueVoucherId, VoucherTypeId, PinCode1, PinCode2, UnitCreditContractId, NumberOfUnits, Amount, CurrencyCode, BatchId, CheckSum.
   * @return VoucherDefinitionsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherDefinitionsObjectData locationUpdate (VoucherDefinitionsObjectData VouULIn) throws BSDMResourceException
  {
    return locationUpdate (null, VouULIn);
  }
  /**
   * Update Location ID field for a row in VOUCHER_DEFINITIONS..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouULIn Input  Object.  Read-Only fields: UniqueVoucherId, VoucherTypeId, PinCode1, PinCode2, UnitCreditContractId, NumberOfUnits, Amount, CurrencyCode, BatchId, CheckSum.
   * @return VoucherDefinitionsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("locationUpdate")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VoucherDefinitionsObjectData locationUpdate (@HeaderParam ("context")BSDMSessionContext context,VoucherDefinitionsObjectData VouULIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherDefinitionsLocationUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouULIn != null) VoucherDefinitionsObjectHelper.toMap (VouULIn, record, "VoucherDefinitions");
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
return VoucherDefinitionsObjectHelper.fromMap (record, "VoucherDefinitions");
}

  private BSDMInteractionSpec _VoucherDefinitionsPinVerifySpec = null;
  /**
   * Verify the PIN in Voucher Definition..
   * Convenience method using default BSDMSessionContext.
   * @param VouVIn Input  Object.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BigInteger pinVerify (VoucherDefinitionsObjectData VouVIn) throws BSDMResourceException
  {
    return pinVerify (null, VouVIn);
  }
  /**
   * Verify the PIN in Voucher Definition..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouVIn Input  Object.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("pinVerify")
@Produces({"application/json","application/xml"})
  public BigInteger pinVerify (@HeaderParam ("context")BSDMSessionContext context,@BeanParam VoucherDefinitionsObjectData VouVIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherDefinitionsPinVerifySpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouVIn != null) VoucherDefinitionsObjectHelper.toMap (VouVIn, record, "VoucherDefinitions");
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
Object _tmp = record.get ("Ret");
    BigInteger _out = null;
        _out = (BigInteger) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _VoucherDefinitionsPinGetSpec = null;
  /**
   * Get the PIN from Voucher Definition Matching Voucher ID..
   * Convenience method using default BSDMSessionContext.
   * @param VouVGIn Input Object Key.
   * @return VoucherDefinitionsPinGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherDefinitionsPinGetOutputData pinGet (VoucherDefinitionsObjectKeyData VouVGIn) throws BSDMResourceException
  {
    return pinGet (null, VouVGIn);
  }
  /**
   * Get the PIN from Voucher Definition Matching Voucher ID..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouVGIn Input Object Key.
   * @return VoucherDefinitionsPinGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("pinGet")
@Produces({"application/json","application/xml"})
  public VoucherDefinitionsPinGetOutputData pinGet (@HeaderParam ("context")BSDMSessionContext context,@BeanParam VoucherDefinitionsObjectKeyData VouVGIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherDefinitionsPinGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouVGIn != null) VoucherDefinitionsObjectKeyHelper.toMap (VouVGIn, record, "VoucherDefinitions");
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
return VoucherDefinitionsPinGetOutputHelper.fromMap (record);
}

  private BSDMInteractionSpec _VoucherDefinitionsGetSpec = null;
  /**
   * Get Unique Voucher Definition that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouGIn Input Object Key.
   * @return VoucherDefinitionsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherDefinitionsObjectData get (VoucherDefinitionsObjectKeyData VouGIn) throws BSDMResourceException
  {
    return get (null, VouGIn);
  }
  /**
   * Get Unique Voucher Definition that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouGIn Input Object Key.
   * @return VoucherDefinitionsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public VoucherDefinitionsObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam VoucherDefinitionsObjectKeyData VouGIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherDefinitionsGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouGIn != null) VoucherDefinitionsObjectKeyHelper.toMap (VouGIn, record, "VoucherDefinitions");
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
return VoucherDefinitionsObjectHelper.fromMap (record, "VoucherDefinitions");
}

  private BSDMInteractionSpec _VoucherDefinitionsFindSpec = null;
  /**
   * Find Voucher Definition that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param VouFIn Input Filter Object.
   * @return VoucherDefinitionsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherDefinitionsObjectDataList find (VoucherDefinitionsObjectFilter VouFIn) throws BSDMResourceException
  {
    return find (null, VouFIn);
  }
  /**
   * Find Voucher Definition that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouFIn Input Filter Object.
   * @return VoucherDefinitionsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VoucherDefinitionsObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,VoucherDefinitionsObjectFilter VouFIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherDefinitionsFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VouFIn != null) VoucherDefinitionsObjectHelper.toMap (VouFIn, record, "VoucherDefinitions");
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
return VoucherDefinitionsObjectHelper.fromMapList (record, "VoucherDefinitionsList");
}

  private BSDMInteractionSpec _VoucherDefinitionsUpdateByBatchIdSpec = null;
  /**
   * Update Location ID and STatus Id field for rows in VOUCHER_DEFINITIONS and VOUCHER_STATUS_INFO related to supplied Batch ID..
   * Convenience method using default BSDMSessionContext.
   * @param VDUBBatchId_In.
   * @param VDUBLocCode_In (null is allowed).
   * @param VDUBStatus_In (null is allowed).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer updateByBatchId (BigInteger VDUBBatchId_In, BigInteger VDUBLocCode_In, BigInteger VDUBStatus_In) throws BSDMResourceException
  {
    return updateByBatchId (null, VDUBBatchId_In, VDUBLocCode_In, VDUBStatus_In);
  }
  /**
   * Update Location ID and STatus Id field for rows in VOUCHER_DEFINITIONS and VOUCHER_STATUS_INFO related to supplied Batch ID..
   * @param context The session context to use when connecting to the APITS server.
   * @param VDUBBatchId_In.
   * @param VDUBLocCode_In (null is allowed).
   * @param VDUBStatus_In (null is allowed).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("updateByBatchId")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer updateByBatchId (@HeaderParam ("context")BSDMSessionContext context,BigInteger VDUBBatchId_In,@FormParam("VDUBLocCode_In")BigInteger VDUBLocCode_In,@FormParam("VDUBStatus_In")BigInteger VDUBStatus_In) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherDefinitionsUpdateByBatchIdSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (VDUBBatchId_In != null) record.put ("VDUBBatchIdIn", VDUBBatchId_In);

      if (VDUBLocCode_In != null) record.put ("VDUBLocCodeIn", VDUBLocCode_In);

      if (VDUBStatus_In != null) record.put ("VDUBStatusIn", VDUBStatus_In);
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
Object _tmp = record.get ("VDUBUpdateCountOut");
    Integer _out = null;
        _out = (Integer) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _VoucherConsumeSpec = null;
  /**
   * Consume Voucher..
   * Convenience method using default BSDMSessionContext.
   * @param VC_In Input  Object.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public VoucherStatusInfoObjectData voucherConsume (VoucherDefinitionsObjectData VC_In) throws BSDMResourceException
  {
    return voucherConsume (null, VC_In);
  }
  /**
   * Consume Voucher..
   * @param context The session context to use when connecting to the APITS server.
   * @param VC_In Input  Object.
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("voucherConsume")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public VoucherStatusInfoObjectData voucherConsume (@HeaderParam ("context")BSDMSessionContext context,VoucherDefinitionsObjectData VC_In) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_VoucherConsumeSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (VC_In != null) VoucherDefinitionsObjectHelper.toMap (VC_In, record, "VoucherDefinitions");
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
return VoucherStatusInfoObjectHelper.fromMap (record, "VCOut");
}

  /**

   * Create New Voucher Definition..

   * Convenience method using default BSDMSessionContext.

   * @param VouCIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherDefinitionsObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherDefinitionsObjectData create (VoucherDefinitionsObjectData VouCIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, VouCIn, defaultAction, constraintAction);
  }
  /** 
   * Create New Voucher Definition..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouCIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherDefinitionsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherDefinitionsObjectData create (BSDMSessionContext context, VoucherDefinitionsObjectData VouCIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouCIn, defaultAction);
       
     cManager.checkConstraints(VouCIn, constraintAction);
       return create (context, VouCIn);
  }

  /**

   * Update Location ID field for a row in VOUCHER_DEFINITIONS..

   * Convenience method using default BSDMSessionContext.

   * @param VouULIn Input  Object.  Read-Only fields: UniqueVoucherId, VoucherTypeId, PinCode1, PinCode2, UnitCreditContractId, NumberOfUnits, Amount, CurrencyCode, BatchId, CheckSum.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherDefinitionsObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherDefinitionsObjectData locationUpdate (VoucherDefinitionsObjectData VouULIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return locationUpdate (null, VouULIn, defaultAction, constraintAction);
  }
  /** 
   * Update Location ID field for a row in VOUCHER_DEFINITIONS..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouULIn Input  Object.  Read-Only fields: UniqueVoucherId, VoucherTypeId, PinCode1, PinCode2, UnitCreditContractId, NumberOfUnits, Amount, CurrencyCode, BatchId, CheckSum.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherDefinitionsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherDefinitionsObjectData locationUpdate (BSDMSessionContext context, VoucherDefinitionsObjectData VouULIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouULIn, defaultAction);
       
     cManager.checkConstraints(VouULIn, constraintAction);
       return locationUpdate (context, VouULIn);
  }

  /**

   * Verify the PIN in Voucher Definition..

   * Convenience method using default BSDMSessionContext.

   * @param VouVIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BigInteger as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BigInteger pinVerify (VoucherDefinitionsObjectData VouVIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return pinVerify (null, VouVIn, defaultAction, constraintAction);
  }
  /** 
   * Verify the PIN in Voucher Definition..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouVIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BigInteger pinVerify (BSDMSessionContext context, VoucherDefinitionsObjectData VouVIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouVIn, defaultAction);
       
     cManager.checkConstraints(VouVIn, constraintAction);
       return pinVerify (context, VouVIn);
  }

  /**

   * Get the PIN from Voucher Definition Matching Voucher ID..

   * Convenience method using default BSDMSessionContext.

   * @param VouVGIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherDefinitionsPinGetOutputData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherDefinitionsPinGetOutputData pinGet (VoucherDefinitionsObjectKeyData VouVGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return pinGet (null, VouVGIn, defaultAction, constraintAction);
  }
  /** 
   * Get the PIN from Voucher Definition Matching Voucher ID..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouVGIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherDefinitionsPinGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherDefinitionsPinGetOutputData pinGet (BSDMSessionContext context, VoucherDefinitionsObjectKeyData VouVGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouVGIn, defaultAction);
       
     cManager.checkConstraints(VouVGIn, constraintAction);
       return pinGet (context, VouVGIn);
  }

  /**

   * Get Unique Voucher Definition that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param VouGIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherDefinitionsObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherDefinitionsObjectData get (VoucherDefinitionsObjectKeyData VouGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, VouGIn, defaultAction, constraintAction);
  }
  /** 
   * Get Unique Voucher Definition that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouGIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherDefinitionsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherDefinitionsObjectData get (BSDMSessionContext context, VoucherDefinitionsObjectKeyData VouGIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouGIn, defaultAction);
       
     cManager.checkConstraints(VouGIn, constraintAction);
       return get (context, VouGIn);
  }

  /**

   * Find Voucher Definition that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param VouFIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherDefinitionsObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherDefinitionsObjectDataList find (VoucherDefinitionsObjectFilter VouFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, VouFIn, defaultAction, constraintAction);
  }
  /** 
   * Find Voucher Definition that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param VouFIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherDefinitionsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherDefinitionsObjectDataList find (BSDMSessionContext context, VoucherDefinitionsObjectFilter VouFIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VouFIn, defaultAction);
       
     cManager.checkConstraints(VouFIn, constraintAction);
       return find (context, VouFIn);
  }

  /**

   * Update Location ID and STatus Id field for rows in VOUCHER_DEFINITIONS and VOUCHER_STATUS_INFO related to supplied Batch ID..

   * Convenience method using default BSDMSessionContext.

   * @param VDUBBatchId_In.

   * @param VDUBLocCode_In (null is allowed).

   * @param VDUBStatus_In (null is allowed).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer updateByBatchId (BigInteger VDUBBatchId_In, BigInteger VDUBLocCode_In, BigInteger VDUBStatus_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return updateByBatchId (null, VDUBBatchId_In, VDUBLocCode_In, VDUBStatus_In, defaultAction, constraintAction);
  }
  /** 
   * Update Location ID and STatus Id field for rows in VOUCHER_DEFINITIONS and VOUCHER_STATUS_INFO related to supplied Batch ID..
   * @param context The session context to use when connecting to the APITS server.
   * @param VDUBBatchId_In.
   * @param VDUBLocCode_In (null is allowed).
   * @param VDUBStatus_In (null is allowed).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer updateByBatchId (BSDMSessionContext context, BigInteger VDUBBatchId_In, BigInteger VDUBLocCode_In, BigInteger VDUBStatus_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return updateByBatchId (context, VDUBBatchId_In, VDUBLocCode_In, VDUBStatus_In);
  }

  /**

   * Consume Voucher..

   * Convenience method using default BSDMSessionContext.

   * @param VC_In Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return VoucherStatusInfoObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public VoucherStatusInfoObjectData voucherConsume (VoucherDefinitionsObjectData VC_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return voucherConsume (null, VC_In, defaultAction, constraintAction);
  }
  /** 
   * Consume Voucher..
   * @param context The session context to use when connecting to the APITS server.
   * @param VC_In Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return VoucherStatusInfoObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public VoucherStatusInfoObjectData voucherConsume (BSDMSessionContext context, VoucherDefinitionsObjectData VC_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(VC_In, defaultAction);
       
     cManager.checkConstraints(VC_In, constraintAction);
       return voucherConsume (context, VC_In);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public VoucherDefinitionsBean ()
  {
    try
    {
      _VoucherDefinitionsCreateSpec = new BSDMInteractionSpec("VoucherDefinitionsCreate", ApiMappings.getCallName ("VoucherDefinitionsCreate"), Boolean.TRUE);

      _VoucherDefinitionsLocationUpdateSpec = new BSDMInteractionSpec("VoucherDefinitionsLocationUpdate", ApiMappings.getCallName ("VoucherDefinitionsLocationUpdate"), Boolean.TRUE);

      _VoucherDefinitionsPinVerifySpec = new BSDMInteractionSpec("VoucherDefinitionsPinVerify", ApiMappings.getCallName ("VoucherDefinitionsPinVerify"), Boolean.TRUE);

      _VoucherDefinitionsPinGetSpec = new BSDMInteractionSpec("VoucherDefinitionsPinGet", ApiMappings.getCallName ("VoucherDefinitionsPinGet"), Boolean.TRUE);

      _VoucherDefinitionsGetSpec = new BSDMInteractionSpec("VoucherDefinitionsGet", ApiMappings.getCallName ("VoucherDefinitionsGet"), Boolean.TRUE);

      _VoucherDefinitionsFindSpec = new BSDMInteractionSpec("VoucherDefinitionsFind", ApiMappings.getCallName ("VoucherDefinitionsFind"), Boolean.TRUE);

      _VoucherDefinitionsUpdateByBatchIdSpec = new BSDMInteractionSpec("VoucherDefinitionsUpdateByBatchId", ApiMappings.getCallName ("VoucherDefinitionsUpdateByBatchId"), Boolean.TRUE);

      _VoucherConsumeSpec = new BSDMInteractionSpec("VoucherConsume", ApiMappings.getCallName ("VoucherConsume"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public VoucherDefinitionsBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public VoucherDefinitionsBean(BSDMSettings settings, BSDMConnectionManager cm)
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
