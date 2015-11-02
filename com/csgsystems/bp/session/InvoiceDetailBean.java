
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: InvoiceDetailBean.java
 * Definition File: Customer/InvoiceDetail.xml
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
import com.csgsystems.bp.interfaces.InvoiceDetailInterface;
import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="InvoiceDetailSessionBean"
 * display-name="InvoiceDetail Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/InvoiceDetailBean"
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

@Stateless(name="InvoiceDetailBean", mappedName = "InvoiceDetail")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("InvoiceDetails")

public class InvoiceDetailBean implements InvoiceDetailInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _InvoiceDetailGetSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailgetIn Input Object Key.
   * @return InvoiceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InvoiceDetailObjectData get (InvoiceDetailObjectKeyData InvoiceDetailgetIn) throws BSDMResourceException
  {
    return get (null, InvoiceDetailgetIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailgetIn Input Object Key.
   * @return InvoiceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public InvoiceDetailObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam InvoiceDetailObjectKeyData InvoiceDetailgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoiceDetailGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (InvoiceDetailgetIn != null) InvoiceDetailObjectKeyHelper.toMap (InvoiceDetailgetIn, record, "InvoiceDetail");
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
return InvoiceDetailObjectHelper.fromMap (record, "InvoiceDetail");
}

  private BSDMInteractionSpec _InvoiceDetailFindSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailfindIn Input Filter Object.  Defaulted Fields: LanguageCode.
   * @return InvoiceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InvoiceDetailObjectDataList find (InvoiceDetailObjectFilter InvoiceDetailfindIn) throws BSDMResourceException
  {
    return find (null, InvoiceDetailfindIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailfindIn Input Filter Object.  Defaulted Fields: LanguageCode.
   * @return InvoiceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public InvoiceDetailObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,InvoiceDetailObjectFilter InvoiceDetailfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoiceDetailFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (InvoiceDetailfindIn != null) InvoiceDetailObjectHelper.toMap (InvoiceDetailfindIn, record, "InvoiceDetail");
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
return InvoiceDetailObjectHelper.fromMapList (record, "InvoiceDetailList");
}

  private BSDMInteractionSpec _InvoiceDetailAdjustmentFindSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailAdjfindIn Input Filter Object.
   * @return InvoiceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InvoiceDetailObjectDataList adjustmentFind (InvoiceDetailObjectFilter InvoiceDetailAdjfindIn) throws BSDMResourceException
  {
    return adjustmentFind (null, InvoiceDetailAdjfindIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailAdjfindIn Input Filter Object.
   * @return InvoiceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("adjustmentFind")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public InvoiceDetailObjectDataList adjustmentFind (@HeaderParam ("context")BSDMSessionContext context,InvoiceDetailObjectFilter InvoiceDetailAdjfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoiceDetailAdjustmentFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (InvoiceDetailAdjfindIn != null) InvoiceDetailObjectHelper.toMap (InvoiceDetailAdjfindIn, record, "InvoiceDetail");
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
return InvoiceDetailObjectHelper.fromMapList (record, "InvoiceDetailList");
}

  private BSDMInteractionSpec _InvoiceDetailByAccountFindSpec = null;
  /**
   * Return InvoiceDetail and filter on Invoice and Account attributes..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailAccountfindIn Input Filter Object.
   * @param LatestInvoice (null is allowed) (has a default).
   * @return InvoiceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InvoiceDetailObjectDataList byAccountFind (InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindIn, Boolean LatestInvoice) throws BSDMResourceException
  {
    return byAccountFind (null, InvoiceDetailAccountfindIn, LatestInvoice);
  }
  /**
   * Return InvoiceDetail and filter on Invoice and Account attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailAccountfindIn Input Filter Object.
   * @param LatestInvoice (null is allowed) (has a default).
   * @return InvoiceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("byAccountFind")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public InvoiceDetailObjectDataList byAccountFind (@HeaderParam ("context")BSDMSessionContext context,InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindIn,@FormParam("LatestInvoice")Boolean LatestInvoice) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoiceDetailByAccountFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (InvoiceDetailAccountfindIn != null) InvoiceDetailAccountObjectHelper.toMap (InvoiceDetailAccountfindIn, record, "InvoiceDetail");

      if (LatestInvoice != null) record.put ("LatestInvoice", LatestInvoice);
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
return InvoiceDetailObjectHelper.fromMapList (record, "InvoiceDetailList");
}

  private BSDMInteractionSpec _InvoiceDetailByAccountFindCountSpec = null;
  /**
   * Return COUNT of InvoiceDetail and filter on Invoice and Account attributes..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailAccountfindCountIn Input Filter Object.
   * @param LatestInvoice1 (null is allowed) (has a default).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer byAccountFindCount (InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindCountIn, Boolean LatestInvoice1) throws BSDMResourceException
  {
    return byAccountFindCount (null, InvoiceDetailAccountfindCountIn, LatestInvoice1);
  }
  /**
   * Return COUNT of InvoiceDetail and filter on Invoice and Account attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailAccountfindCountIn Input Filter Object.
   * @param LatestInvoice1 (null is allowed) (has a default).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("byAccountFindCount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer byAccountFindCount (@HeaderParam ("context")BSDMSessionContext context,InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindCountIn,@FormParam("LatestInvoice1")Boolean LatestInvoice1) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoiceDetailByAccountFindCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (InvoiceDetailAccountfindCountIn != null) InvoiceDetailAccountObjectHelper.toMap (InvoiceDetailAccountfindCountIn, record, "InvoiceDetail");

      if (LatestInvoice1 != null) record.put ("LatestInvoice", LatestInvoice1);
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
Object _tmp = record.get ("TotalCount");
    Integer _out = null;
        _out = (Integer) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _InvoiceDetailAdjustSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailAdjustIn Input  Object.  Read-Only fields: ServerId.
   * @param TransCode.
   * @param AdjReasonCode.
   * @param RequestStatus.
   * @param FraudIndicator.
   * @param Annotation (null is allowed).
   * @param PrimaryUnitsType.
   * @param PrimaryUnits.
   * @param Amount.
   * @param BillOrderNumber (null is allowed).
   * @param EffectiveDate.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AdjustmentObjectData adjust (InvoiceDetailObjectData InvoiceDetailAdjustIn, Integer TransCode, Integer AdjReasonCode, Integer RequestStatus, Integer FraudIndicator, String Annotation, Integer PrimaryUnitsType, BigInteger PrimaryUnits, BigInteger Amount, String BillOrderNumber, Date EffectiveDate) throws BSDMResourceException
  {
    return adjust (null, InvoiceDetailAdjustIn, TransCode, AdjReasonCode, RequestStatus, FraudIndicator, Annotation, PrimaryUnitsType, PrimaryUnits, Amount, BillOrderNumber, EffectiveDate);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailAdjustIn Input  Object.  Read-Only fields: ServerId.
   * @param TransCode.
   * @param AdjReasonCode.
   * @param RequestStatus.
   * @param FraudIndicator.
   * @param Annotation (null is allowed).
   * @param PrimaryUnitsType.
   * @param PrimaryUnits.
   * @param Amount.
   * @param BillOrderNumber (null is allowed).
   * @param EffectiveDate.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("adjust")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AdjustmentObjectData adjust (@HeaderParam ("context")BSDMSessionContext context,InvoiceDetailObjectData InvoiceDetailAdjustIn,@FormParam("TransCode")Integer TransCode,@FormParam("AdjReasonCode")Integer AdjReasonCode,@FormParam("RequestStatus")Integer RequestStatus,@FormParam("FraudIndicator")Integer FraudIndicator,@FormParam("Annotation")String Annotation,@FormParam("PrimaryUnitsType")Integer PrimaryUnitsType,@FormParam("PrimaryUnits")BigInteger PrimaryUnits,@FormParam("Amount")BigInteger Amount,@FormParam("BillOrderNumber")String BillOrderNumber,@FormParam("EffectiveDate")Date EffectiveDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoiceDetailAdjustSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (InvoiceDetailAdjustIn != null) InvoiceDetailObjectHelper.toMap (InvoiceDetailAdjustIn, record, "InvoiceDetail");

      if (TransCode != null) record.put ("TransCode", TransCode);

      if (AdjReasonCode != null) record.put ("AdjReasonCode", AdjReasonCode);

      if (RequestStatus != null) record.put ("RequestStatus", RequestStatus);

      if (FraudIndicator != null) record.put ("FraudIndicator", FraudIndicator);

      if (Annotation != null) record.put ("Annotation", Annotation);

      if (PrimaryUnitsType != null) record.put ("PrimaryUnitsType", PrimaryUnitsType);

      if (PrimaryUnits != null) record.put ("PrimaryUnits", PrimaryUnits);

      if (Amount != null) record.put ("Amount", Amount);

      if (BillOrderNumber != null) record.put ("BillOrderNumber", BillOrderNumber);

      if (EffectiveDate != null) record.put ("EffectiveDate", EffectiveDate);
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
return AdjustmentObjectHelper.fromMap (record, "Adjustment");
}

  private BSDMInteractionSpec _InvoiceDetailAmountGetSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailAmountIn Input Object Key.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BigInteger amountGet (InvoiceDetailObjectKeyData InvoiceDetailAmountIn) throws BSDMResourceException
  {
    return amountGet (null, InvoiceDetailAmountIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailAmountIn Input Object Key.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("amountGet")
@Produces({"application/json","application/xml"})
  public BigInteger amountGet (@HeaderParam ("context")BSDMSessionContext context,@BeanParam InvoiceDetailObjectKeyData InvoiceDetailAmountIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoiceDetailAmountGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (InvoiceDetailAmountIn != null) InvoiceDetailObjectKeyHelper.toMap (InvoiceDetailAmountIn, record, "InvoiceDetail");
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
Object _tmp = record.get ("AdjustmentEligibleAmount");
    BigInteger _out = null;
        _out = (BigInteger) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _BillInvoiceDetailAmountGetSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param open_item_id (null is allowed).
   * @return BillInvoiceDetailAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BillInvoiceDetailAmountObjectData billInvoiceDetailAmountGet (Integer bill_ref_no, Integer bill_ref_resets, Integer open_item_id) throws BSDMResourceException
  {
    return billInvoiceDetailAmountGet (null, bill_ref_no, bill_ref_resets, open_item_id);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param open_item_id (null is allowed).
   * @return BillInvoiceDetailAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("billInvoiceDetailAmountGet")
@Produces({"application/json","application/xml"})
  public BillInvoiceDetailAmountObjectData billInvoiceDetailAmountGet (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("bill_ref_no")Integer bill_ref_no,@QueryParam("bill_ref_resets")Integer bill_ref_resets,@QueryParam("open_item_id")Integer open_item_id) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BillInvoiceDetailAmountGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (bill_ref_no != null) record.put ("BillRefNo", bill_ref_no);

      if (bill_ref_resets != null) record.put ("BillRefResets", bill_ref_resets);

      if (open_item_id != null) record.put ("OpenItemId", open_item_id);
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
return BillInvoiceDetailAmountObjectHelper.fromMap (record, "BillInvoiceDetailAmount");
}

  private BSDMInteractionSpec _InvoiceDetailFindCountSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceDetailfindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer findCount (InvoiceDetailObjectFilter InvoiceDetailfindCountIn) throws BSDMResourceException
  {
    return findCount (null, InvoiceDetailfindCountIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailfindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findCount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer findCount (@HeaderParam ("context")BSDMSessionContext context,InvoiceDetailObjectFilter InvoiceDetailfindCountIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoiceDetailFindCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (InvoiceDetailfindCountIn != null) InvoiceDetailObjectHelper.toMap (InvoiceDetailfindCountIn, record, "InvoiceDetail");
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
Object _tmp = record.get ("TotalCount");
    Integer _out = null;
        _out = (Integer) _tmp;
          
    return _out
 ;
}

  /**

   * Convenience method using default BSDMSessionContext.

   * @param InvoiceDetailgetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InvoiceDetailObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InvoiceDetailObjectData get (InvoiceDetailObjectKeyData InvoiceDetailgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, InvoiceDetailgetIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailgetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InvoiceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InvoiceDetailObjectData get (BSDMSessionContext context, InvoiceDetailObjectKeyData InvoiceDetailgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(InvoiceDetailgetIn, defaultAction);
       
     cManager.checkConstraints(InvoiceDetailgetIn, constraintAction);
       return get (context, InvoiceDetailgetIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param InvoiceDetailfindIn Input Filter Object.  Defaulted Fields: LanguageCode.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InvoiceDetailObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InvoiceDetailObjectDataList find (InvoiceDetailObjectFilter InvoiceDetailfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, InvoiceDetailfindIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailfindIn Input Filter Object.  Defaulted Fields: LanguageCode.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InvoiceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InvoiceDetailObjectDataList find (BSDMSessionContext context, InvoiceDetailObjectFilter InvoiceDetailfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(InvoiceDetailfindIn, defaultAction);
       
     cManager.checkConstraints(InvoiceDetailfindIn, constraintAction);
       return find (context, InvoiceDetailfindIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param InvoiceDetailAdjfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InvoiceDetailObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InvoiceDetailObjectDataList adjustmentFind (InvoiceDetailObjectFilter InvoiceDetailAdjfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return adjustmentFind (null, InvoiceDetailAdjfindIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailAdjfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InvoiceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InvoiceDetailObjectDataList adjustmentFind (BSDMSessionContext context, InvoiceDetailObjectFilter InvoiceDetailAdjfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(InvoiceDetailAdjfindIn, defaultAction);
       
     cManager.checkConstraints(InvoiceDetailAdjfindIn, constraintAction);
       return adjustmentFind (context, InvoiceDetailAdjfindIn);
  }

  /**

   * Return InvoiceDetail and filter on Invoice and Account attributes..

   * Convenience method using default BSDMSessionContext.

   * @param InvoiceDetailAccountfindIn Input Filter Object.

   * @param LatestInvoice (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InvoiceDetailObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InvoiceDetailObjectDataList byAccountFind (InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindIn, Boolean LatestInvoice, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return byAccountFind (null, InvoiceDetailAccountfindIn, LatestInvoice, defaultAction, constraintAction);
  }
  /** 
   * Return InvoiceDetail and filter on Invoice and Account attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailAccountfindIn Input Filter Object.
   * @param LatestInvoice (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InvoiceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InvoiceDetailObjectDataList byAccountFind (BSDMSessionContext context, InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindIn, Boolean LatestInvoice, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(InvoiceDetailAccountfindIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(InvoiceDetailAccountfindIn, constraintAction);
       
    //Constraints not supported on Input-Column
return byAccountFind (context, InvoiceDetailAccountfindIn, LatestInvoice);
  }

  /**

   * Return COUNT of InvoiceDetail and filter on Invoice and Account attributes..

   * Convenience method using default BSDMSessionContext.

   * @param InvoiceDetailAccountfindCountIn Input Filter Object.

   * @param LatestInvoice1 (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer byAccountFindCount (InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindCountIn, Boolean LatestInvoice1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return byAccountFindCount (null, InvoiceDetailAccountfindCountIn, LatestInvoice1, defaultAction, constraintAction);
  }
  /** 
   * Return COUNT of InvoiceDetail and filter on Invoice and Account attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailAccountfindCountIn Input Filter Object.
   * @param LatestInvoice1 (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer byAccountFindCount (BSDMSessionContext context, InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindCountIn, Boolean LatestInvoice1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(InvoiceDetailAccountfindCountIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(InvoiceDetailAccountfindCountIn, constraintAction);
       
    //Constraints not supported on Input-Column
return byAccountFindCount (context, InvoiceDetailAccountfindCountIn, LatestInvoice1);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param InvoiceDetailAdjustIn Input  Object.  Read-Only fields: ServerId.

   * @param TransCode.

   * @param AdjReasonCode.

   * @param RequestStatus.

   * @param FraudIndicator.

   * @param Annotation (null is allowed).

   * @param PrimaryUnitsType.

   * @param PrimaryUnits.

   * @param Amount.

   * @param BillOrderNumber (null is allowed).

   * @param EffectiveDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AdjustmentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AdjustmentObjectData adjust (InvoiceDetailObjectData InvoiceDetailAdjustIn, Integer TransCode, Integer AdjReasonCode, Integer RequestStatus, Integer FraudIndicator, String Annotation, Integer PrimaryUnitsType, BigInteger PrimaryUnits, BigInteger Amount, String BillOrderNumber, Date EffectiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return adjust (null, InvoiceDetailAdjustIn, TransCode, AdjReasonCode, RequestStatus, FraudIndicator, Annotation, PrimaryUnitsType, PrimaryUnits, Amount, BillOrderNumber, EffectiveDate, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailAdjustIn Input  Object.  Read-Only fields: ServerId.
   * @param TransCode.
   * @param AdjReasonCode.
   * @param RequestStatus.
   * @param FraudIndicator.
   * @param Annotation (null is allowed).
   * @param PrimaryUnitsType.
   * @param PrimaryUnits.
   * @param Amount.
   * @param BillOrderNumber (null is allowed).
   * @param EffectiveDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AdjustmentObjectData adjust (BSDMSessionContext context, InvoiceDetailObjectData InvoiceDetailAdjustIn, Integer TransCode, Integer AdjReasonCode, Integer RequestStatus, Integer FraudIndicator, String Annotation, Integer PrimaryUnitsType, BigInteger PrimaryUnits, BigInteger Amount, String BillOrderNumber, Date EffectiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(InvoiceDetailAdjustIn, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     cManager.checkConstraints(InvoiceDetailAdjustIn, constraintAction);
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return adjust (context, InvoiceDetailAdjustIn, TransCode, AdjReasonCode, RequestStatus, FraudIndicator, Annotation, PrimaryUnitsType, PrimaryUnits, Amount, BillOrderNumber, EffectiveDate);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param InvoiceDetailAmountIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BigInteger as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BigInteger amountGet (InvoiceDetailObjectKeyData InvoiceDetailAmountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return amountGet (null, InvoiceDetailAmountIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailAmountIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BigInteger amountGet (BSDMSessionContext context, InvoiceDetailObjectKeyData InvoiceDetailAmountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(InvoiceDetailAmountIn, defaultAction);
       
     cManager.checkConstraints(InvoiceDetailAmountIn, constraintAction);
       return amountGet (context, InvoiceDetailAmountIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param bill_ref_no.

   * @param bill_ref_resets.

   * @param open_item_id (null is allowed).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BillInvoiceDetailAmountObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BillInvoiceDetailAmountObjectData billInvoiceDetailAmountGet (Integer bill_ref_no, Integer bill_ref_resets, Integer open_item_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return billInvoiceDetailAmountGet (null, bill_ref_no, bill_ref_resets, open_item_id, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param open_item_id (null is allowed).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BillInvoiceDetailAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BillInvoiceDetailAmountObjectData billInvoiceDetailAmountGet (BSDMSessionContext context, Integer bill_ref_no, Integer bill_ref_resets, Integer open_item_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return billInvoiceDetailAmountGet (context, bill_ref_no, bill_ref_resets, open_item_id);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param InvoiceDetailfindCountIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer findCount (InvoiceDetailObjectFilter InvoiceDetailfindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findCount (null, InvoiceDetailfindCountIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceDetailfindCountIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer findCount (BSDMSessionContext context, InvoiceDetailObjectFilter InvoiceDetailfindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(InvoiceDetailfindCountIn, defaultAction);
       
     cManager.checkConstraints(InvoiceDetailfindCountIn, constraintAction);
       return findCount (context, InvoiceDetailfindCountIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public InvoiceDetailBean ()
  {
    try
    {
      _InvoiceDetailGetSpec = new BSDMInteractionSpec("InvoiceDetailGet", ApiMappings.getCallName ("InvoiceDetailGet"), Boolean.TRUE);

      _InvoiceDetailFindSpec = new BSDMInteractionSpec("InvoiceDetailFind", ApiMappings.getCallName ("InvoiceDetailFind"), Boolean.TRUE);

      _InvoiceDetailAdjustmentFindSpec = new BSDMInteractionSpec("InvoiceDetailAdjustmentFind", ApiMappings.getCallName ("InvoiceDetailAdjustmentFind"), Boolean.TRUE);

      _InvoiceDetailByAccountFindSpec = new BSDMInteractionSpec("InvoiceDetailByAccountFind", ApiMappings.getCallName ("InvoiceDetailByAccountFind"), Boolean.TRUE);

      _InvoiceDetailByAccountFindCountSpec = new BSDMInteractionSpec("InvoiceDetailByAccountFindCount", ApiMappings.getCallName ("InvoiceDetailByAccountFindCount"), Boolean.TRUE);

      _InvoiceDetailAdjustSpec = new BSDMInteractionSpec("InvoiceDetailAdjust", ApiMappings.getCallName ("InvoiceDetailAdjust"), Boolean.TRUE);

      _InvoiceDetailAmountGetSpec = new BSDMInteractionSpec("InvoiceDetailAmountGet", ApiMappings.getCallName ("InvoiceDetailAmountGet"), Boolean.TRUE);

      _BillInvoiceDetailAmountGetSpec = new BSDMInteractionSpec("BillInvoiceDetailAmountGet", ApiMappings.getCallName ("BillInvoiceDetailAmountGet"), Boolean.TRUE);

      _InvoiceDetailFindCountSpec = new BSDMInteractionSpec("InvoiceDetailFindCount", ApiMappings.getCallName ("InvoiceDetailFindCount"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public InvoiceDetailBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public InvoiceDetailBean(BSDMSettings settings, BSDMConnectionManager cm)
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
