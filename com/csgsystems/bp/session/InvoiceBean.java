
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: InvoiceBean.java
 * Definition File: Customer/Invoice.xml
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
import com.csgsystems.bp.interfaces.InvoiceInterface;
import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="InvoiceSessionBean"
 * display-name="Invoice Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/InvoiceBean"
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

@Stateless(name="InvoiceBean", mappedName = "Invoice")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("Invoices")

public class InvoiceBean implements InvoiceInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _InvoiceGetSpec = null;
  /**
   * Get a unique Invoice (including the Suspense Account, Invoice-0)..
   * Convenience method using default BSDMSessionContext.
   * @param InvoicegetIn Input Object Key.
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InvoiceObjectData get (InvoiceObjectKeyData InvoicegetIn) throws BSDMResourceException
  {
    return get (null, InvoicegetIn);
  }
  /**
   * Get a unique Invoice (including the Suspense Account, Invoice-0)..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoicegetIn Input Object Key.
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public InvoiceObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam InvoiceObjectKeyData InvoicegetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoiceGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (InvoicegetIn != null) InvoiceObjectKeyHelper.toMap (InvoicegetIn, record, "Invoice");
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
return InvoiceObjectHelper.fromMap (record, "Invoice");
}

  private BSDMInteractionSpec _InvoiceFindSpec = null;
  /**
   * Find Invoice's that match the supplied filter (including the Suspense Account, Invoice-0)..
   * Convenience method using default BSDMSessionContext.
   * @param InvoicefindIn Input Filter Object.
   * @return InvoiceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InvoiceObjectDataList find (InvoiceObjectFilter InvoicefindIn) throws BSDMResourceException
  {
    return find (null, InvoicefindIn);
  }
  /**
   * Find Invoice's that match the supplied filter (including the Suspense Account, Invoice-0)..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoicefindIn Input Filter Object.
   * @return InvoiceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public InvoiceObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,InvoiceObjectFilter InvoicefindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoiceFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (InvoicefindIn != null) InvoiceObjectHelper.toMap (InvoicefindIn, record, "Invoice");
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
return InvoiceObjectHelper.fromMapList (record, "InvoiceList");
}

  private BSDMInteractionSpec _InvoiceFindCountSpec = null;
  /**
   * Find Count of Invoice's that match the supplied filter (including the Suspense Account, Invoice-0)..
   * Convenience method using default BSDMSessionContext.
   * @param InvoicefindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer findCount (InvoiceObjectFilter InvoicefindCountIn) throws BSDMResourceException
  {
    return findCount (null, InvoicefindCountIn);
  }
  /**
   * Find Count of Invoice's that match the supplied filter (including the Suspense Account, Invoice-0)..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoicefindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findCount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer findCount (@HeaderParam ("context")BSDMSessionContext context,InvoiceObjectFilter InvoicefindCountIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoiceFindCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (InvoicefindCountIn != null) InvoiceObjectHelper.toMap (InvoicefindCountIn, record, "Invoice");
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

  private BSDMInteractionSpec _InvoiceReissueGetSpec = null;
  /**
   * Get a unique Re-Issued invoice..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceRgetIn Input Object Key.
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InvoiceObjectData reissueGet (InvoiceObjectKeyData InvoiceRgetIn) throws BSDMResourceException
  {
    return reissueGet (null, InvoiceRgetIn);
  }
  /**
   * Get a unique Re-Issued invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceRgetIn Input Object Key.
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("reissueGet")
@Produces({"application/json","application/xml"})
  public InvoiceObjectData reissueGet (@HeaderParam ("context")BSDMSessionContext context,@BeanParam InvoiceObjectKeyData InvoiceRgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoiceReissueGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (InvoiceRgetIn != null) InvoiceObjectKeyHelper.toMap (InvoiceRgetIn, record, "Invoice");
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
return InvoiceObjectHelper.fromMap (record, "Invoice");
}

  private BSDMInteractionSpec _InvoiceReissueFindSpec = null;
  /**
   * Find Re-Issue'd Invoice's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceRfindIn Input Filter Object.
   * @return InvoiceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InvoiceObjectDataList reissueFind (InvoiceObjectFilter InvoiceRfindIn) throws BSDMResourceException
  {
    return reissueFind (null, InvoiceRfindIn);
  }
  /**
   * Find Re-Issue'd Invoice's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceRfindIn Input Filter Object.
   * @return InvoiceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("reissueFind")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public InvoiceObjectDataList reissueFind (@HeaderParam ("context")BSDMSessionContext context,InvoiceObjectFilter InvoiceRfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoiceReissueFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (InvoiceRfindIn != null) InvoiceObjectHelper.toMap (InvoiceRfindIn, record, "Invoice");
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
return InvoiceObjectHelper.fromMapList (record, "InvoiceList");
}

  private BSDMInteractionSpec _InvoiceSummaryGetSpec = null;
  /**
   * Retrieve summary information for an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceSumgetIn Input Object Key.
   * @return InvoiceSummaryObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InvoiceSummaryObjectData summaryGet (InvoiceObjectKeyData InvoiceSumgetIn) throws BSDMResourceException
  {
    return summaryGet (null, InvoiceSumgetIn);
  }
  /**
   * Retrieve summary information for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceSumgetIn Input Object Key.
   * @return InvoiceSummaryObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("summaryGet")
@Produces({"application/json","application/xml"})
  public InvoiceSummaryObjectData summaryGet (@HeaderParam ("context")BSDMSessionContext context,@BeanParam InvoiceObjectKeyData InvoiceSumgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoiceSummaryGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (InvoiceSumgetIn != null) InvoiceObjectKeyHelper.toMap (InvoiceSumgetIn, record, "Invoice");
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
return InvoiceSummaryObjectHelper.fromMap (record, "InvoiceSummary");
}

  private BSDMInteractionSpec _InvoiceReIssueSpec = null;
  /**
   * Re-Issue an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceReissueIn Input Object Key.
   * @param bill_disp_meth.
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InvoiceObjectData reIssue (InvoiceObjectKeyData InvoiceReissueIn, Integer bill_disp_meth) throws BSDMResourceException
  {
    return reIssue (null, InvoiceReissueIn, bill_disp_meth);
  }
  /**
   * Re-Issue an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceReissueIn Input Object Key.
   * @param bill_disp_meth.
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("reIssue")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public InvoiceObjectData reIssue (@HeaderParam ("context")BSDMSessionContext context,InvoiceObjectKeyData InvoiceReissueIn,@FormParam("bill_disp_meth")Integer bill_disp_meth) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoiceReIssueSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (InvoiceReissueIn != null) InvoiceObjectKeyHelper.toMap (InvoiceReissueIn, record, "Invoice");

      if (bill_disp_meth != null) record.put ("BillDispMeth", bill_disp_meth);
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
return InvoiceObjectHelper.fromMap (record, "Invoice");
}

  private BSDMInteractionSpec _InvoiceAmountGetSpec = null;
  /**
   * Retrieve the various Invoice amounts for a particular Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceAmountGetIn Input Object Key.
   * @return InvoiceAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InvoiceAmountObjectData amountGet (InvoiceObjectKeyData InvoiceAmountGetIn) throws BSDMResourceException
  {
    return amountGet (null, InvoiceAmountGetIn);
  }
  /**
   * Retrieve the various Invoice amounts for a particular Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceAmountGetIn Input Object Key.
   * @return InvoiceAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("amountGet")
@Produces({"application/json","application/xml"})
  public InvoiceAmountObjectData amountGet (@HeaderParam ("context")BSDMSessionContext context,@BeanParam InvoiceObjectKeyData InvoiceAmountGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoiceAmountGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (InvoiceAmountGetIn != null) InvoiceObjectKeyHelper.toMap (InvoiceAmountGetIn, record, "Invoice");
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
return InvoiceAmountObjectHelper.fromMap (record, "InvoiceAmount");
}

  private BSDMInteractionSpec _InvoiceBalanceSummarySpec = null;
  /**
   * Retrieve the Summary Balance information for an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceBalSumIn Input  Object.  Read-Only fields: PaymentDueDate, OrigBillRefno, OrigBillRefResets, ProcessNum, AccountInternalId, CurrencyCode, OrigPayDueDate, ClosedDate, NewCharges, NetNewCharges, TotalDue, TotalAdj, TotalPaid, BalanceDue, DisputeAmt, LateExemptCharges, CollectionIndicator, ChgDate, ChgWho, GlAmount, BalanceConverted, NewChargeCredits, BillConverted, BillSequenceNum, PrevBillRefno, PrevBillRefResets, PrevBalanceRefno, PrevBalanceRefResets, Zip, FromDate, ToDate, PrepDate, NextToDate, PrevPpdd, PrevCutoffDate, TaxDate, BillPeriod, PayMethod, BillDispMeth, TaxJournalStatus, ImageReq, AccountStatus, ImageDone, SpecialCode, PrepTask, PrepStatus, FormatStatus, DispatchCount, DispatchDate, FileName, StartOffset, EndOffset, PageCount, BillHoldCode, PrepErrorCode, FormatErrorCode, BackoutStatus, CopyType, CollectionHistory, JnlEarnedThruDt, JnlStatus, TestFlag, ArchFlag, InterimBillFlag, IncludeNrc, IncludeRc, IncludeAdj, IncludeUsage, IncludePayment, LanguageCode, WarmBillFlag, BillOrderNumber.  Defaulted Fields: StatementDate.
   * @return InvoiceBalanceSummaryOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InvoiceBalanceSummaryOutputData balanceSummary (InvoiceObjectData InvoiceBalSumIn) throws BSDMResourceException
  {
    return balanceSummary (null, InvoiceBalSumIn);
  }
  /**
   * Retrieve the Summary Balance information for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceBalSumIn Input  Object.  Read-Only fields: PaymentDueDate, OrigBillRefno, OrigBillRefResets, ProcessNum, AccountInternalId, CurrencyCode, OrigPayDueDate, ClosedDate, NewCharges, NetNewCharges, TotalDue, TotalAdj, TotalPaid, BalanceDue, DisputeAmt, LateExemptCharges, CollectionIndicator, ChgDate, ChgWho, GlAmount, BalanceConverted, NewChargeCredits, BillConverted, BillSequenceNum, PrevBillRefno, PrevBillRefResets, PrevBalanceRefno, PrevBalanceRefResets, Zip, FromDate, ToDate, PrepDate, NextToDate, PrevPpdd, PrevCutoffDate, TaxDate, BillPeriod, PayMethod, BillDispMeth, TaxJournalStatus, ImageReq, AccountStatus, ImageDone, SpecialCode, PrepTask, PrepStatus, FormatStatus, DispatchCount, DispatchDate, FileName, StartOffset, EndOffset, PageCount, BillHoldCode, PrepErrorCode, FormatErrorCode, BackoutStatus, CopyType, CollectionHistory, JnlEarnedThruDt, JnlStatus, TestFlag, ArchFlag, InterimBillFlag, IncludeNrc, IncludeRc, IncludeAdj, IncludeUsage, IncludePayment, LanguageCode, WarmBillFlag, BillOrderNumber.  Defaulted Fields: StatementDate.
   * @return InvoiceBalanceSummaryOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("balanceSummary")
@Produces({"application/json","application/xml"})
  public InvoiceBalanceSummaryOutputData balanceSummary (@HeaderParam ("context")BSDMSessionContext context,@BeanParam InvoiceObjectData InvoiceBalSumIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoiceBalanceSummarySpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (InvoiceBalSumIn != null) InvoiceObjectHelper.toMap (InvoiceBalSumIn, record, "Invoice");
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
return InvoiceBalanceSummaryOutputHelper.fromMap (record);
}

  private BSDMInteractionSpec _PaymentDateRescheduleSpec = null;
  /**
   * Reschedule the Payment Due Date for an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param InvoiceUpdateIn Input Object Key.
   * @param payment_due_date (has a default).
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InvoiceObjectData paymentDateReschedule (InvoiceObjectKeyData InvoiceUpdateIn, Date payment_due_date) throws BSDMResourceException
  {
    return paymentDateReschedule (null, InvoiceUpdateIn, payment_due_date);
  }
  /**
   * Reschedule the Payment Due Date for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceUpdateIn Input Object Key.
   * @param payment_due_date (has a default).
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("paymentDateReschedule")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public InvoiceObjectData paymentDateReschedule (@HeaderParam ("context")BSDMSessionContext context,InvoiceObjectKeyData InvoiceUpdateIn,@FormParam("payment_due_date")Date payment_due_date) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentDateRescheduleSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (InvoiceUpdateIn != null) InvoiceObjectKeyHelper.toMap (InvoiceUpdateIn, record, "Invoice");

      if (payment_due_date != null) record.put ("PaymentDueDate", payment_due_date);
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
return InvoiceObjectHelper.fromMap (record, "Invoice");
}

  private BSDMInteractionSpec _InvoicePrepaidBilledUsageTotalSpec = null;
  /**
   * Retrieve the Sum of Prepaid Billed Usage for an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param totalBUPIn Input Object Key.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BigInteger prepaidBilledUsageTotal (InvoiceObjectKeyData totalBUPIn) throws BSDMResourceException
  {
    return prepaidBilledUsageTotal (null, totalBUPIn);
  }
  /**
   * Retrieve the Sum of Prepaid Billed Usage for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param totalBUPIn Input Object Key.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("prepaidBilledUsageTotal")
@Produces({"application/json","application/xml"})
  public BigInteger prepaidBilledUsageTotal (@HeaderParam ("context")BSDMSessionContext context,@BeanParam InvoiceObjectKeyData totalBUPIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoicePrepaidBilledUsageTotalSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (totalBUPIn != null) InvoiceObjectKeyHelper.toMap (totalBUPIn, record, "Invoice");
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
Object _tmp = record.get ("TotalPrepaidBilledUsage");
    BigInteger _out = null;
        _out = (BigInteger) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _InvoicePostpaidBilledUsageTotalSpec = null;
  /**
   * Retrieve the Sum of Postpaid Billed Usage for an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param totalBUIn Input Object Key.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BigInteger postpaidBilledUsageTotal (InvoiceObjectKeyData totalBUIn) throws BSDMResourceException
  {
    return postpaidBilledUsageTotal (null, totalBUIn);
  }
  /**
   * Retrieve the Sum of Postpaid Billed Usage for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param totalBUIn Input Object Key.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("postpaidBilledUsageTotal")
@Produces({"application/json","application/xml"})
  public BigInteger postpaidBilledUsageTotal (@HeaderParam ("context")BSDMSessionContext context,@BeanParam InvoiceObjectKeyData totalBUIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoicePostpaidBilledUsageTotalSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (totalBUIn != null) InvoiceObjectKeyHelper.toMap (totalBUIn, record, "Invoice");
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
Object _tmp = record.get ("TotalPostpaidBilledUsage");
    BigInteger _out = null;
        _out = (BigInteger) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _InvoicePrepaidUnbilledUsageTotalSpec = null;
  /**
   * Retrieve the Sum of Prepaid Unbilled Usage for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param account_internal_id.
   * @return InvoicePrepaidUnbilledUsageTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InvoicePrepaidUnbilledUsageTotalOutputData prepaidUnbilledUsageTotal (Integer account_internal_id) throws BSDMResourceException
  {
    return prepaidUnbilledUsageTotal (null, account_internal_id);
  }
  /**
   * Retrieve the Sum of Prepaid Unbilled Usage for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param account_internal_id.
   * @return InvoicePrepaidUnbilledUsageTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("prepaidUnbilledUsageTotal")
@Produces({"application/json","application/xml"})
  public InvoicePrepaidUnbilledUsageTotalOutputData prepaidUnbilledUsageTotal (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("account_internal_id")Integer account_internal_id) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoicePrepaidUnbilledUsageTotalSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (account_internal_id != null) record.put ("AccountInternalId", account_internal_id);
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
return InvoicePrepaidUnbilledUsageTotalOutputHelper.fromMap (record);
}

  private BSDMInteractionSpec _InvoicePostpaidUnbilledUsageTotalSpec = null;
  /**
   * Retrieve the Sum of Postpaid Unbilled Usage for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param account_internalId.
   * @return InvoicePostpaidUnbilledUsageTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InvoicePostpaidUnbilledUsageTotalOutputData postpaidUnbilledUsageTotal (Integer account_internalId) throws BSDMResourceException
  {
    return postpaidUnbilledUsageTotal (null, account_internalId);
  }
  /**
   * Retrieve the Sum of Postpaid Unbilled Usage for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param account_internalId.
   * @return InvoicePostpaidUnbilledUsageTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("postpaidUnbilledUsageTotal")
@Produces({"application/json","application/xml"})
  public InvoicePostpaidUnbilledUsageTotalOutputData postpaidUnbilledUsageTotal (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("account_internalId")Integer account_internalId) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoicePostpaidUnbilledUsageTotalSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (account_internalId != null) record.put ("AccountInternalId", account_internalId);
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
return InvoicePostpaidUnbilledUsageTotalOutputHelper.fromMap (record);
}

  private BSDMInteractionSpec _InvoicePostpaidProductChargeTotalSpec = null;
  /**
   * Retrieve the Postpaid Product and Charge Totals from InvoiceDetail for an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @return InvoicePostpaidProductChargeTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InvoicePostpaidProductChargeTotalOutputData postpaidProductChargeTotal (Integer bill_ref_no, Integer bill_ref_resets) throws BSDMResourceException
  {
    return postpaidProductChargeTotal (null, bill_ref_no, bill_ref_resets);
  }
  /**
   * Retrieve the Postpaid Product and Charge Totals from InvoiceDetail for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @return InvoicePostpaidProductChargeTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("postpaidProductChargeTotal")
@Produces({"application/json","application/xml"})
  public InvoicePostpaidProductChargeTotalOutputData postpaidProductChargeTotal (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("bill_ref_no")Integer bill_ref_no,@QueryParam("bill_ref_resets")Integer bill_ref_resets) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoicePostpaidProductChargeTotalSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (bill_ref_no != null) record.put ("BillRefNo", bill_ref_no);

      if (bill_ref_resets != null) record.put ("BillRefResets", bill_ref_resets);
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
return InvoicePostpaidProductChargeTotalOutputHelper.fromMap (record);
}

  private BSDMInteractionSpec _InvoicePrepaidProductChargeTotalSpec = null;
  /**
   * Retrieve the Postpaid Product and Charge Totals from InvoiceDetail for an Invoice..
   * Convenience method using default BSDMSessionContext.
   * @param Bill_ref_no.
   * @param Bill_ref_resets.
   * @return InvoicePrepaidProductChargeTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InvoicePrepaidProductChargeTotalOutputData prepaidProductChargeTotal (Integer Bill_ref_no, Integer Bill_ref_resets) throws BSDMResourceException
  {
    return prepaidProductChargeTotal (null, Bill_ref_no, Bill_ref_resets);
  }
  /**
   * Retrieve the Postpaid Product and Charge Totals from InvoiceDetail for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param Bill_ref_no.
   * @param Bill_ref_resets.
   * @return InvoicePrepaidProductChargeTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("prepaidProductChargeTotal")
@Produces({"application/json","application/xml"})
  public InvoicePrepaidProductChargeTotalOutputData prepaidProductChargeTotal (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("Bill_ref_no")Integer Bill_ref_no,@QueryParam("Bill_ref_resets")Integer Bill_ref_resets) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoicePrepaidProductChargeTotalSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (Bill_ref_no != null) record.put ("BillRefNo", Bill_ref_no);

      if (Bill_ref_resets != null) record.put ("BillRefResets", Bill_ref_resets);
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
return InvoicePrepaidProductChargeTotalOutputHelper.fromMap (record);
}

  /**

   * Get a unique Invoice (including the Suspense Account, Invoice-0)..

   * Convenience method using default BSDMSessionContext.

   * @param InvoicegetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InvoiceObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InvoiceObjectData get (InvoiceObjectKeyData InvoicegetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, InvoicegetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique Invoice (including the Suspense Account, Invoice-0)..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoicegetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InvoiceObjectData get (BSDMSessionContext context, InvoiceObjectKeyData InvoicegetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(InvoicegetIn, defaultAction);
       
     cManager.checkConstraints(InvoicegetIn, constraintAction);
       return get (context, InvoicegetIn);
  }

  /**

   * Find Invoice's that match the supplied filter (including the Suspense Account, Invoice-0)..

   * Convenience method using default BSDMSessionContext.

   * @param InvoicefindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InvoiceObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InvoiceObjectDataList find (InvoiceObjectFilter InvoicefindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, InvoicefindIn, defaultAction, constraintAction);
  }
  /** 
   * Find Invoice's that match the supplied filter (including the Suspense Account, Invoice-0)..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoicefindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InvoiceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InvoiceObjectDataList find (BSDMSessionContext context, InvoiceObjectFilter InvoicefindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(InvoicefindIn, defaultAction);
       
     cManager.checkConstraints(InvoicefindIn, constraintAction);
       return find (context, InvoicefindIn);
  }

  /**

   * Find Count of Invoice's that match the supplied filter (including the Suspense Account, Invoice-0)..

   * Convenience method using default BSDMSessionContext.

   * @param InvoicefindCountIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer findCount (InvoiceObjectFilter InvoicefindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findCount (null, InvoicefindCountIn, defaultAction, constraintAction);
  }
  /** 
   * Find Count of Invoice's that match the supplied filter (including the Suspense Account, Invoice-0)..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoicefindCountIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer findCount (BSDMSessionContext context, InvoiceObjectFilter InvoicefindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(InvoicefindCountIn, defaultAction);
       
     cManager.checkConstraints(InvoicefindCountIn, constraintAction);
       return findCount (context, InvoicefindCountIn);
  }

  /**

   * Get a unique Re-Issued invoice..

   * Convenience method using default BSDMSessionContext.

   * @param InvoiceRgetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InvoiceObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InvoiceObjectData reissueGet (InvoiceObjectKeyData InvoiceRgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return reissueGet (null, InvoiceRgetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique Re-Issued invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceRgetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InvoiceObjectData reissueGet (BSDMSessionContext context, InvoiceObjectKeyData InvoiceRgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(InvoiceRgetIn, defaultAction);
       
     cManager.checkConstraints(InvoiceRgetIn, constraintAction);
       return reissueGet (context, InvoiceRgetIn);
  }

  /**

   * Find Re-Issue'd Invoice's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param InvoiceRfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InvoiceObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InvoiceObjectDataList reissueFind (InvoiceObjectFilter InvoiceRfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return reissueFind (null, InvoiceRfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find Re-Issue'd Invoice's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceRfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InvoiceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InvoiceObjectDataList reissueFind (BSDMSessionContext context, InvoiceObjectFilter InvoiceRfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(InvoiceRfindIn, defaultAction);
       
     cManager.checkConstraints(InvoiceRfindIn, constraintAction);
       return reissueFind (context, InvoiceRfindIn);
  }

  /**

   * Retrieve summary information for an Invoice..

   * Convenience method using default BSDMSessionContext.

   * @param InvoiceSumgetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InvoiceSummaryObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InvoiceSummaryObjectData summaryGet (InvoiceObjectKeyData InvoiceSumgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return summaryGet (null, InvoiceSumgetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve summary information for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceSumgetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InvoiceSummaryObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InvoiceSummaryObjectData summaryGet (BSDMSessionContext context, InvoiceObjectKeyData InvoiceSumgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(InvoiceSumgetIn, defaultAction);
       
     cManager.checkConstraints(InvoiceSumgetIn, constraintAction);
       return summaryGet (context, InvoiceSumgetIn);
  }

  /**

   * Re-Issue an Invoice..

   * Convenience method using default BSDMSessionContext.

   * @param InvoiceReissueIn Input Object Key.

   * @param bill_disp_meth.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InvoiceObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InvoiceObjectData reIssue (InvoiceObjectKeyData InvoiceReissueIn, Integer bill_disp_meth, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return reIssue (null, InvoiceReissueIn, bill_disp_meth, defaultAction, constraintAction);
  }
  /** 
   * Re-Issue an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceReissueIn Input Object Key.
   * @param bill_disp_meth.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InvoiceObjectData reIssue (BSDMSessionContext context, InvoiceObjectKeyData InvoiceReissueIn, Integer bill_disp_meth, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(InvoiceReissueIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(InvoiceReissueIn, constraintAction);
       
    //Constraints not supported on Input-Column
return reIssue (context, InvoiceReissueIn, bill_disp_meth);
  }

  /**

   * Retrieve the various Invoice amounts for a particular Invoice..

   * Convenience method using default BSDMSessionContext.

   * @param InvoiceAmountGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InvoiceAmountObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InvoiceAmountObjectData amountGet (InvoiceObjectKeyData InvoiceAmountGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return amountGet (null, InvoiceAmountGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve the various Invoice amounts for a particular Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceAmountGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InvoiceAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InvoiceAmountObjectData amountGet (BSDMSessionContext context, InvoiceObjectKeyData InvoiceAmountGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(InvoiceAmountGetIn, defaultAction);
       
     cManager.checkConstraints(InvoiceAmountGetIn, constraintAction);
       return amountGet (context, InvoiceAmountGetIn);
  }

  /**

   * Retrieve the Summary Balance information for an Invoice..

   * Convenience method using default BSDMSessionContext.

   * @param InvoiceBalSumIn Input  Object.  Read-Only fields: PaymentDueDate, OrigBillRefno, OrigBillRefResets, ProcessNum, AccountInternalId, CurrencyCode, OrigPayDueDate, ClosedDate, NewCharges, NetNewCharges, TotalDue, TotalAdj, TotalPaid, BalanceDue, DisputeAmt, LateExemptCharges, CollectionIndicator, ChgDate, ChgWho, GlAmount, BalanceConverted, NewChargeCredits, BillConverted, BillSequenceNum, PrevBillRefno, PrevBillRefResets, PrevBalanceRefno, PrevBalanceRefResets, Zip, FromDate, ToDate, PrepDate, NextToDate, PrevPpdd, PrevCutoffDate, TaxDate, BillPeriod, PayMethod, BillDispMeth, TaxJournalStatus, ImageReq, AccountStatus, ImageDone, SpecialCode, PrepTask, PrepStatus, FormatStatus, DispatchCount, DispatchDate, FileName, StartOffset, EndOffset, PageCount, BillHoldCode, PrepErrorCode, FormatErrorCode, BackoutStatus, CopyType, CollectionHistory, JnlEarnedThruDt, JnlStatus, TestFlag, ArchFlag, InterimBillFlag, IncludeNrc, IncludeRc, IncludeAdj, IncludeUsage, IncludePayment, LanguageCode, WarmBillFlag, BillOrderNumber.  Defaulted Fields: StatementDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InvoiceBalanceSummaryOutputData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InvoiceBalanceSummaryOutputData balanceSummary (InvoiceObjectData InvoiceBalSumIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return balanceSummary (null, InvoiceBalSumIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve the Summary Balance information for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceBalSumIn Input  Object.  Read-Only fields: PaymentDueDate, OrigBillRefno, OrigBillRefResets, ProcessNum, AccountInternalId, CurrencyCode, OrigPayDueDate, ClosedDate, NewCharges, NetNewCharges, TotalDue, TotalAdj, TotalPaid, BalanceDue, DisputeAmt, LateExemptCharges, CollectionIndicator, ChgDate, ChgWho, GlAmount, BalanceConverted, NewChargeCredits, BillConverted, BillSequenceNum, PrevBillRefno, PrevBillRefResets, PrevBalanceRefno, PrevBalanceRefResets, Zip, FromDate, ToDate, PrepDate, NextToDate, PrevPpdd, PrevCutoffDate, TaxDate, BillPeriod, PayMethod, BillDispMeth, TaxJournalStatus, ImageReq, AccountStatus, ImageDone, SpecialCode, PrepTask, PrepStatus, FormatStatus, DispatchCount, DispatchDate, FileName, StartOffset, EndOffset, PageCount, BillHoldCode, PrepErrorCode, FormatErrorCode, BackoutStatus, CopyType, CollectionHistory, JnlEarnedThruDt, JnlStatus, TestFlag, ArchFlag, InterimBillFlag, IncludeNrc, IncludeRc, IncludeAdj, IncludeUsage, IncludePayment, LanguageCode, WarmBillFlag, BillOrderNumber.  Defaulted Fields: StatementDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InvoiceBalanceSummaryOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InvoiceBalanceSummaryOutputData balanceSummary (BSDMSessionContext context, InvoiceObjectData InvoiceBalSumIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(InvoiceBalSumIn, defaultAction);
       
     cManager.checkConstraints(InvoiceBalSumIn, constraintAction);
       return balanceSummary (context, InvoiceBalSumIn);
  }

  /**

   * Reschedule the Payment Due Date for an Invoice..

   * Convenience method using default BSDMSessionContext.

   * @param InvoiceUpdateIn Input Object Key.

   * @param payment_due_date (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InvoiceObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InvoiceObjectData paymentDateReschedule (InvoiceObjectKeyData InvoiceUpdateIn, Date payment_due_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return paymentDateReschedule (null, InvoiceUpdateIn, payment_due_date, defaultAction, constraintAction);
  }
  /** 
   * Reschedule the Payment Due Date for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param InvoiceUpdateIn Input Object Key.
   * @param payment_due_date (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InvoiceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InvoiceObjectData paymentDateReschedule (BSDMSessionContext context, InvoiceObjectKeyData InvoiceUpdateIn, Date payment_due_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(InvoiceUpdateIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(InvoiceUpdateIn, constraintAction);
       
    //Constraints not supported on Input-Column
return paymentDateReschedule (context, InvoiceUpdateIn, payment_due_date);
  }

  /**

   * Retrieve the Sum of Prepaid Billed Usage for an Invoice..

   * Convenience method using default BSDMSessionContext.

   * @param totalBUPIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BigInteger as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BigInteger prepaidBilledUsageTotal (InvoiceObjectKeyData totalBUPIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return prepaidBilledUsageTotal (null, totalBUPIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve the Sum of Prepaid Billed Usage for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param totalBUPIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BigInteger prepaidBilledUsageTotal (BSDMSessionContext context, InvoiceObjectKeyData totalBUPIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(totalBUPIn, defaultAction);
       
     cManager.checkConstraints(totalBUPIn, constraintAction);
       return prepaidBilledUsageTotal (context, totalBUPIn);
  }

  /**

   * Retrieve the Sum of Postpaid Billed Usage for an Invoice..

   * Convenience method using default BSDMSessionContext.

   * @param totalBUIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BigInteger as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BigInteger postpaidBilledUsageTotal (InvoiceObjectKeyData totalBUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return postpaidBilledUsageTotal (null, totalBUIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve the Sum of Postpaid Billed Usage for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param totalBUIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BigInteger postpaidBilledUsageTotal (BSDMSessionContext context, InvoiceObjectKeyData totalBUIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(totalBUIn, defaultAction);
       
     cManager.checkConstraints(totalBUIn, constraintAction);
       return postpaidBilledUsageTotal (context, totalBUIn);
  }

  /**

   * Retrieve the Sum of Prepaid Unbilled Usage for an Account..

   * Convenience method using default BSDMSessionContext.

   * @param account_internal_id.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InvoicePrepaidUnbilledUsageTotalOutputData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InvoicePrepaidUnbilledUsageTotalOutputData prepaidUnbilledUsageTotal (Integer account_internal_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return prepaidUnbilledUsageTotal (null, account_internal_id, defaultAction, constraintAction);
  }
  /** 
   * Retrieve the Sum of Prepaid Unbilled Usage for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param account_internal_id.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InvoicePrepaidUnbilledUsageTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InvoicePrepaidUnbilledUsageTotalOutputData prepaidUnbilledUsageTotal (BSDMSessionContext context, Integer account_internal_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column
return prepaidUnbilledUsageTotal (context, account_internal_id);
  }

  /**

   * Retrieve the Sum of Postpaid Unbilled Usage for an Account..

   * Convenience method using default BSDMSessionContext.

   * @param account_internalId.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InvoicePostpaidUnbilledUsageTotalOutputData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InvoicePostpaidUnbilledUsageTotalOutputData postpaidUnbilledUsageTotal (Integer account_internalId, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return postpaidUnbilledUsageTotal (null, account_internalId, defaultAction, constraintAction);
  }
  /** 
   * Retrieve the Sum of Postpaid Unbilled Usage for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param account_internalId.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InvoicePostpaidUnbilledUsageTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InvoicePostpaidUnbilledUsageTotalOutputData postpaidUnbilledUsageTotal (BSDMSessionContext context, Integer account_internalId, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column
return postpaidUnbilledUsageTotal (context, account_internalId);
  }

  /**

   * Retrieve the Postpaid Product and Charge Totals from InvoiceDetail for an Invoice..

   * Convenience method using default BSDMSessionContext.

   * @param bill_ref_no.

   * @param bill_ref_resets.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InvoicePostpaidProductChargeTotalOutputData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InvoicePostpaidProductChargeTotalOutputData postpaidProductChargeTotal (Integer bill_ref_no, Integer bill_ref_resets, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return postpaidProductChargeTotal (null, bill_ref_no, bill_ref_resets, defaultAction, constraintAction);
  }
  /** 
   * Retrieve the Postpaid Product and Charge Totals from InvoiceDetail for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InvoicePostpaidProductChargeTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InvoicePostpaidProductChargeTotalOutputData postpaidProductChargeTotal (BSDMSessionContext context, Integer bill_ref_no, Integer bill_ref_resets, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return postpaidProductChargeTotal (context, bill_ref_no, bill_ref_resets);
  }

  /**

   * Retrieve the Postpaid Product and Charge Totals from InvoiceDetail for an Invoice..

   * Convenience method using default BSDMSessionContext.

   * @param Bill_ref_no.

   * @param Bill_ref_resets.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InvoicePrepaidProductChargeTotalOutputData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InvoicePrepaidProductChargeTotalOutputData prepaidProductChargeTotal (Integer Bill_ref_no, Integer Bill_ref_resets, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return prepaidProductChargeTotal (null, Bill_ref_no, Bill_ref_resets, defaultAction, constraintAction);
  }
  /** 
   * Retrieve the Postpaid Product and Charge Totals from InvoiceDetail for an Invoice..
   * @param context The session context to use when connecting to the APITS server.
   * @param Bill_ref_no.
   * @param Bill_ref_resets.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InvoicePrepaidProductChargeTotalOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InvoicePrepaidProductChargeTotalOutputData prepaidProductChargeTotal (BSDMSessionContext context, Integer Bill_ref_no, Integer Bill_ref_resets, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return prepaidProductChargeTotal (context, Bill_ref_no, Bill_ref_resets);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public InvoiceBean ()
  {
    try
    {
      _InvoiceGetSpec = new BSDMInteractionSpec("InvoiceGet", ApiMappings.getCallName ("InvoiceGet"), Boolean.TRUE);

      _InvoiceFindSpec = new BSDMInteractionSpec("InvoiceFind", ApiMappings.getCallName ("InvoiceFind"), Boolean.TRUE);

      _InvoiceFindCountSpec = new BSDMInteractionSpec("InvoiceFindCount", ApiMappings.getCallName ("InvoiceFindCount"), Boolean.TRUE);

      _InvoiceReissueGetSpec = new BSDMInteractionSpec("InvoiceReissueGet", ApiMappings.getCallName ("InvoiceReissueGet"), Boolean.TRUE);

      _InvoiceReissueFindSpec = new BSDMInteractionSpec("InvoiceReissueFind", ApiMappings.getCallName ("InvoiceReissueFind"), Boolean.TRUE);

      _InvoiceSummaryGetSpec = new BSDMInteractionSpec("InvoiceSummaryGet", ApiMappings.getCallName ("InvoiceSummaryGet"), Boolean.TRUE);

      _InvoiceReIssueSpec = new BSDMInteractionSpec("InvoiceReIssue", ApiMappings.getCallName ("InvoiceReIssue"), Boolean.TRUE);

      _InvoiceAmountGetSpec = new BSDMInteractionSpec("InvoiceAmountGet", ApiMappings.getCallName ("InvoiceAmountGet"), Boolean.TRUE);

      _InvoiceBalanceSummarySpec = new BSDMInteractionSpec("InvoiceBalanceSummary", ApiMappings.getCallName ("InvoiceBalanceSummary"), Boolean.TRUE);

      _PaymentDateRescheduleSpec = new BSDMInteractionSpec("PaymentDateReschedule", ApiMappings.getCallName ("PaymentDateReschedule"), Boolean.TRUE);

      _InvoicePrepaidBilledUsageTotalSpec = new BSDMInteractionSpec("InvoicePrepaidBilledUsageTotal", ApiMappings.getCallName ("InvoicePrepaidBilledUsageTotal"), Boolean.TRUE);

      _InvoicePostpaidBilledUsageTotalSpec = new BSDMInteractionSpec("InvoicePostpaidBilledUsageTotal", ApiMappings.getCallName ("InvoicePostpaidBilledUsageTotal"), Boolean.TRUE);

      _InvoicePrepaidUnbilledUsageTotalSpec = new BSDMInteractionSpec("InvoicePrepaidUnbilledUsageTotal", ApiMappings.getCallName ("InvoicePrepaidUnbilledUsageTotal"), Boolean.TRUE);

      _InvoicePostpaidUnbilledUsageTotalSpec = new BSDMInteractionSpec("InvoicePostpaidUnbilledUsageTotal", ApiMappings.getCallName ("InvoicePostpaidUnbilledUsageTotal"), Boolean.TRUE);

      _InvoicePostpaidProductChargeTotalSpec = new BSDMInteractionSpec("InvoicePostpaidProductChargeTotal", ApiMappings.getCallName ("InvoicePostpaidProductChargeTotal"), Boolean.TRUE);

      _InvoicePrepaidProductChargeTotalSpec = new BSDMInteractionSpec("InvoicePrepaidProductChargeTotal", ApiMappings.getCallName ("InvoicePrepaidProductChargeTotal"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public InvoiceBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public InvoiceBean(BSDMSettings settings, BSDMConnectionManager cm)
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
