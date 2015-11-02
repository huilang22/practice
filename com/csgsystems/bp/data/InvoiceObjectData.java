/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoiceObjectData.java
 * Definition File: Customer/Invoice.xml
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Current generator limitations
 *----------------------------------------------------------------------------
 *---------------------------------------------------------------------------*/
/**---------------------------------------------------------------------------
 * Object Summary Information
 *----------------------------------------------------------------------------
 * Product    : BP
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Copyright 2006 Comverse, Inc.  All Rights Reserved.
 *----------------------------------------------------------------------------
 */

package com.csgsystems.bp.data;

import java.io.Serializable;
import java.util.Date;
import java.util.Locale;
import java.math.BigInteger;
import java.util.Map;
import java.util.Locale;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlTransient;

import javax.ws.rs.QueryParam;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;

import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.constraint.ConstraintManager;
import com.csgsystems.api.constraint.ConstraintException;

import com.csgsystems.api.defaults.DefaultManager;

import com.csgsystems.api.bulk.*;


import com.csgsystems.api.format.FieldFormatMgr;

import com.csgsystems.aruba.filter.*;

import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;
import com.csgsystems.api.enumeration.EnumeratedDataMgr;

import com.csgsystems.bp.data.*;

import com.csgsystems.api.base.BaseObjectData;
  
/** InvoiceObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class InvoiceObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public InvoiceObjectKeyData Key = null;
  /** CMF_BALANCE.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** CMF_BALANCE.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** CMF_BALANCE.ppdd_date field */
  public    Date PayDueDate  = null;
  protected boolean _PayDueDateSet = false;
  /** CMF_BALANCE.orig_ppdd_date field */
  public    Date OrigPayDueDate  = null;
  protected boolean _OrigPayDueDateSet = false;
  /** CMF_BALANCE.closed_date field */
  public    Date ClosedDate  = null;
  protected boolean _ClosedDateSet = false;
  /** CMF_BALANCE.new_charges field */
  public    BigInteger NewCharges  = null;
  protected boolean _NewChargesSet = false;
  /** CMF_BALANCE.net_new_charges field */
  public    BigInteger NetNewCharges  = null;
  protected boolean _NetNewChargesSet = false;
  /** CMF_BALANCE.total_due field */
  public    BigInteger TotalDue  = null;
  protected boolean _TotalDueSet = false;
  /** CMF_BALANCE.total_adj field */
  public    BigInteger TotalAdj  = null;
  protected boolean _TotalAdjSet = false;
  /** CMF_BALANCE.total_paid field */
  public    BigInteger TotalPaid  = null;
  protected boolean _TotalPaidSet = false;
  /** CMF_BALANCE.balance_due field */
  public    BigInteger BalanceDue  = null;
  protected boolean _BalanceDueSet = false;
  /** CMF_BALANCE.dispute_amt field */
  public    BigInteger DisputeAmt  = null;
  protected boolean _DisputeAmtSet = false;
  /** CMF_BALANCE.late_exempt_charges field */
  public    BigInteger LateExemptCharges  = null;
  protected boolean _LateExemptChargesSet = false;
  /** CMF_BALANCE.collection_indicator field */
  public    Integer CollectionIndicator  = null;
  protected boolean _CollectionIndicatorSet = false;
  /** CMF_BALANCE.chg_date field */
  public    Date ChgDate  = null;
  protected boolean _ChgDateSet = false;
  /** CMF_BALANCE.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** CMF_BALANCE.gl_amount field */
  public    BigInteger GlAmount  = null;
  protected boolean _GlAmountSet = false;
  /** CMF_BALANCE.converted field */
  public    Integer BalanceConverted  = null;
  protected boolean _BalanceConvertedSet = false;
  /** CMF_BALANCE.new_charge_credits field */
  public    BigInteger NewChargeCredits  = null;
  protected boolean _NewChargeCreditsSet = false;
  /** BILL_INVOICE.bill_sequence_num field */
  public    Integer BillSequenceNum  = null;
  protected boolean _BillSequenceNumSet = false;
  /** BILL_INVOICE.process_num field */
  public    String ProcessNum  = null;
  protected boolean _ProcessNumSet = false;
  /** BILL_INVOICE.prev_bill_refno field */
  public    Integer PrevBillRefno  = null;
  protected boolean _PrevBillRefnoSet = false;
  /** BILL_INVOICE.prev_bill_ref_resets field */
  public    Integer PrevBillRefResets  = null;
  protected boolean _PrevBillRefResetsSet = false;
  /** BILL_INVOICE.prev_balance_refno field */
  public    Integer PrevBalanceRefno  = null;
  protected boolean _PrevBalanceRefnoSet = false;
  /** BILL_INVOICE.prev_balance_ref_resets field */
  public    Integer PrevBalanceRefResets  = null;
  protected boolean _PrevBalanceRefResetsSet = false;
  /** BILL_INVOICE.zip field */
  public    String Zip  = null;
  protected boolean _ZipSet = false;
  /** BILL_INVOICE.from_date field */
  public    Date FromDate  = null;
  protected boolean _FromDateSet = false;
  /** BILL_INVOICE.to_date field */
  public    Date ToDate  = null;
  protected boolean _ToDateSet = false;
  /** BILL_INVOICE.next_to_date field */
  public    Date NextToDate  = null;
  protected boolean _NextToDateSet = false;
  /** BILL_INVOICE.prep_date field */
  public    Date PrepDate  = null;
  protected boolean _PrepDateSet = false;
  /** BILL_INVOICE.tax_date field */
  public    Date TaxDate  = null;
  protected boolean _TaxDateSet = false;
  /** BILL_INVOICE.statement_date field */
  public    Date StatementDate  = null;
  protected boolean _StatementDateSet = false;
  /** BILL_INVOICE.payment_due_date field */
  public    Date PaymentDueDate  = null;
  protected boolean _PaymentDueDateSet = false;
  /** BILL_INVOICE.prev_ppdd field */
  public    Date PrevPpdd  = null;
  protected boolean _PrevPpddSet = false;
  /** BILL_INVOICE.prev_cutoff_date field */
  public    Date PrevCutoffDate  = null;
  protected boolean _PrevCutoffDateSet = false;
  /** BILL_INVOICE.bill_period field */
  public    String BillPeriod  = null;
  protected boolean _BillPeriodSet = false;
  /** BILL_INVOICE.pay_method field */
  public    Integer PayMethod  = null;
  protected boolean _PayMethodSet = false;
  /** BILL_INVOICE.bill_disp_meth field */
  public    Integer BillDispMeth  = null;
  protected boolean _BillDispMethSet = false;
  /** BILL_INVOICE.tax_journal_status field */
  public    Integer TaxJournalStatus  = null;
  protected boolean _TaxJournalStatusSet = false;
  /** BILL_INVOICE.account_status field */
  public    Integer AccountStatus  = null;
  protected boolean _AccountStatusSet = false;
  /** BILL_INVOICE.image_req field */
  public    Boolean ImageReq  = null;
  protected boolean _ImageReqSet = false;
  /** BILL_INVOICE.image_done field */
  public    Boolean ImageDone  = null;
  protected boolean _ImageDoneSet = false;
  /** BILL_INVOICE.special_code field */
  public    Integer SpecialCode  = null;
  protected boolean _SpecialCodeSet = false;
  /** BILL_INVOICE.prep_task field */
  public    String PrepTask  = null;
  protected boolean _PrepTaskSet = false;
  /** BILL_INVOICE.prep_status field */
  public    Integer PrepStatus  = null;
  protected boolean _PrepStatusSet = false;
  /** BILL_INVOICE.format_status field */
  public    Integer FormatStatus  = null;
  protected boolean _FormatStatusSet = false;
  /** BILL_INVOICE.dispatch_count field */
  public    Integer DispatchCount  = null;
  protected boolean _DispatchCountSet = false;
  /** BILL_INVOICE.dispatch_date field */
  public    Date DispatchDate  = null;
  protected boolean _DispatchDateSet = false;
  /** BILL_INVOICE.file_name field */
  public    String FileName  = null;
  protected boolean _FileNameSet = false;
  /** BILL_INVOICE.start_offset field */
  public    Integer StartOffset  = null;
  protected boolean _StartOffsetSet = false;
  /** BILL_INVOICE.end_offset field */
  public    Integer EndOffset  = null;
  protected boolean _EndOffsetSet = false;
  /** BILL_INVOICE.page_count field */
  public    Integer PageCount  = null;
  protected boolean _PageCountSet = false;
  /** BILL_INVOICE.bill_hold_code field */
  public    Integer BillHoldCode  = null;
  protected boolean _BillHoldCodeSet = false;
  /** BILL_INVOICE.prep_error_code field */
  public    Integer PrepErrorCode  = null;
  protected boolean _PrepErrorCodeSet = false;
  /** BILL_INVOICE.format_error_code field */
  public    Integer FormatErrorCode  = null;
  protected boolean _FormatErrorCodeSet = false;
  /** BILL_INVOICE.backout_status field */
  public    Integer BackoutStatus  = null;
  protected boolean _BackoutStatusSet = false;
  /** BILL_INVOICE.copy_type field */
  public    Integer CopyType  = null;
  protected boolean _CopyTypeSet = false;
  /** BILL_INVOICE.orig_bill_refno field */
  public    Integer OrigBillRefno  = null;
  protected boolean _OrigBillRefnoSet = false;
  /** BILL_INVOICE.orig_bill_ref_resets field */
  public    Integer OrigBillRefResets  = null;
  protected boolean _OrigBillRefResetsSet = false;
  /** BILL_INVOICE.collection_history field */
  public    String CollectionHistory  = null;
  protected boolean _CollectionHistorySet = false;
  /** BILL_INVOICE.jnl_earned_thru_dt field */
  public    Date JnlEarnedThruDt  = null;
  protected boolean _JnlEarnedThruDtSet = false;
  /** BILL_INVOICE.jnl_status field */
  public    Integer JnlStatus  = null;
  protected boolean _JnlStatusSet = false;
  /** BILL_INVOICE.test_flag field */
  public    Boolean TestFlag  = null;
  protected boolean _TestFlagSet = false;
  /** BILL_INVOICE.arch_flag field */
  public    Boolean ArchFlag  = null;
  protected boolean _ArchFlagSet = false;
  /** BILL_INVOICE.interim_bill_flag field */
  public    Boolean InterimBillFlag  = null;
  protected boolean _InterimBillFlagSet = false;
  /** BILL_INVOICE.include_nrc field */
  public    Boolean IncludeNrc  = null;
  protected boolean _IncludeNrcSet = false;
  /** BILL_INVOICE.include_rc field */
  public    Boolean IncludeRc  = null;
  protected boolean _IncludeRcSet = false;
  /** BILL_INVOICE.include_adj field */
  public    Boolean IncludeAdj  = null;
  protected boolean _IncludeAdjSet = false;
  /** BILL_INVOICE.include_usage field */
  public    Boolean IncludeUsage  = null;
  protected boolean _IncludeUsageSet = false;
  /** BILL_INVOICE.include_bmf field */
  public    Boolean IncludePayment  = null;
  protected boolean _IncludePaymentSet = false;
  /** BILL_INVOICE.language_code field */
  public    Integer LanguageCode  = null;
  protected boolean _LanguageCodeSet = false;
  /** BILL_INVOICE.converted field */
  public    Integer BillConverted  = null;
  protected boolean _BillConvertedSet = false;
  /** BILL_INVOICE.warm_bill_flag field */
  public    Boolean WarmBillFlag  = null;
  protected boolean _WarmBillFlagSet = false;
  /** BILL_INVOICE.bill_order_number field */
  public    String BillOrderNumber  = null;
  protected boolean _BillOrderNumberSet = false;
  /** BILL_INVOICE.bill_fmt_opt field */
  public    Integer BillFmtOpt  = null;
  protected boolean _BillFmtOptSet = false;
  /** BILL_INVOICE.document_server_id field */
  public    Integer DocumentServerId  = null;
  protected boolean _DocumentServerIdSet = false;
  private String _objName = "InvoiceObjectData";
  /** Default constructor */
  public InvoiceObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public InvoiceObjectData (InvoiceObjectData other)
  {

    if (other == null) return;
    this.Key = new InvoiceObjectKeyData (other.Key);
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.PayDueDate = other.PayDueDate;
    this._PayDueDateSet = other._PayDueDateSet;
    this.OrigPayDueDate = other.OrigPayDueDate;
    this._OrigPayDueDateSet = other._OrigPayDueDateSet;
    this.ClosedDate = other.ClosedDate;
    this._ClosedDateSet = other._ClosedDateSet;
    this.NewCharges = other.NewCharges;
    this._NewChargesSet = other._NewChargesSet;
    this.NetNewCharges = other.NetNewCharges;
    this._NetNewChargesSet = other._NetNewChargesSet;
    this.TotalDue = other.TotalDue;
    this._TotalDueSet = other._TotalDueSet;
    this.TotalAdj = other.TotalAdj;
    this._TotalAdjSet = other._TotalAdjSet;
    this.TotalPaid = other.TotalPaid;
    this._TotalPaidSet = other._TotalPaidSet;
    this.BalanceDue = other.BalanceDue;
    this._BalanceDueSet = other._BalanceDueSet;
    this.DisputeAmt = other.DisputeAmt;
    this._DisputeAmtSet = other._DisputeAmtSet;
    this.LateExemptCharges = other.LateExemptCharges;
    this._LateExemptChargesSet = other._LateExemptChargesSet;
    this.CollectionIndicator = other.CollectionIndicator;
    this._CollectionIndicatorSet = other._CollectionIndicatorSet;
    this.ChgDate = other.ChgDate;
    this._ChgDateSet = other._ChgDateSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.GlAmount = other.GlAmount;
    this._GlAmountSet = other._GlAmountSet;
    this.BalanceConverted = other.BalanceConverted;
    this._BalanceConvertedSet = other._BalanceConvertedSet;
    this.NewChargeCredits = other.NewChargeCredits;
    this._NewChargeCreditsSet = other._NewChargeCreditsSet;
    this.BillSequenceNum = other.BillSequenceNum;
    this._BillSequenceNumSet = other._BillSequenceNumSet;
    this.ProcessNum = other.ProcessNum;
    this._ProcessNumSet = other._ProcessNumSet;
    this.PrevBillRefno = other.PrevBillRefno;
    this._PrevBillRefnoSet = other._PrevBillRefnoSet;
    this.PrevBillRefResets = other.PrevBillRefResets;
    this._PrevBillRefResetsSet = other._PrevBillRefResetsSet;
    this.PrevBalanceRefno = other.PrevBalanceRefno;
    this._PrevBalanceRefnoSet = other._PrevBalanceRefnoSet;
    this.PrevBalanceRefResets = other.PrevBalanceRefResets;
    this._PrevBalanceRefResetsSet = other._PrevBalanceRefResetsSet;
    this.Zip = other.Zip;
    this._ZipSet = other._ZipSet;
    this.FromDate = other.FromDate;
    this._FromDateSet = other._FromDateSet;
    this.ToDate = other.ToDate;
    this._ToDateSet = other._ToDateSet;
    this.NextToDate = other.NextToDate;
    this._NextToDateSet = other._NextToDateSet;
    this.PrepDate = other.PrepDate;
    this._PrepDateSet = other._PrepDateSet;
    this.TaxDate = other.TaxDate;
    this._TaxDateSet = other._TaxDateSet;
    this.StatementDate = other.StatementDate;
    this._StatementDateSet = other._StatementDateSet;
    this.PaymentDueDate = other.PaymentDueDate;
    this._PaymentDueDateSet = other._PaymentDueDateSet;
    this.PrevPpdd = other.PrevPpdd;
    this._PrevPpddSet = other._PrevPpddSet;
    this.PrevCutoffDate = other.PrevCutoffDate;
    this._PrevCutoffDateSet = other._PrevCutoffDateSet;
    this.BillPeriod = other.BillPeriod;
    this._BillPeriodSet = other._BillPeriodSet;
    this.PayMethod = other.PayMethod;
    this._PayMethodSet = other._PayMethodSet;
    this.BillDispMeth = other.BillDispMeth;
    this._BillDispMethSet = other._BillDispMethSet;
    this.TaxJournalStatus = other.TaxJournalStatus;
    this._TaxJournalStatusSet = other._TaxJournalStatusSet;
    this.AccountStatus = other.AccountStatus;
    this._AccountStatusSet = other._AccountStatusSet;
    this.ImageReq = other.ImageReq;
    this._ImageReqSet = other._ImageReqSet;
    this.ImageDone = other.ImageDone;
    this._ImageDoneSet = other._ImageDoneSet;
    this.SpecialCode = other.SpecialCode;
    this._SpecialCodeSet = other._SpecialCodeSet;
    this.PrepTask = other.PrepTask;
    this._PrepTaskSet = other._PrepTaskSet;
    this.PrepStatus = other.PrepStatus;
    this._PrepStatusSet = other._PrepStatusSet;
    this.FormatStatus = other.FormatStatus;
    this._FormatStatusSet = other._FormatStatusSet;
    this.DispatchCount = other.DispatchCount;
    this._DispatchCountSet = other._DispatchCountSet;
    this.DispatchDate = other.DispatchDate;
    this._DispatchDateSet = other._DispatchDateSet;
    this.FileName = other.FileName;
    this._FileNameSet = other._FileNameSet;
    this.StartOffset = other.StartOffset;
    this._StartOffsetSet = other._StartOffsetSet;
    this.EndOffset = other.EndOffset;
    this._EndOffsetSet = other._EndOffsetSet;
    this.PageCount = other.PageCount;
    this._PageCountSet = other._PageCountSet;
    this.BillHoldCode = other.BillHoldCode;
    this._BillHoldCodeSet = other._BillHoldCodeSet;
    this.PrepErrorCode = other.PrepErrorCode;
    this._PrepErrorCodeSet = other._PrepErrorCodeSet;
    this.FormatErrorCode = other.FormatErrorCode;
    this._FormatErrorCodeSet = other._FormatErrorCodeSet;
    this.BackoutStatus = other.BackoutStatus;
    this._BackoutStatusSet = other._BackoutStatusSet;
    this.CopyType = other.CopyType;
    this._CopyTypeSet = other._CopyTypeSet;
    this.OrigBillRefno = other.OrigBillRefno;
    this._OrigBillRefnoSet = other._OrigBillRefnoSet;
    this.OrigBillRefResets = other.OrigBillRefResets;
    this._OrigBillRefResetsSet = other._OrigBillRefResetsSet;
    this.CollectionHistory = other.CollectionHistory;
    this._CollectionHistorySet = other._CollectionHistorySet;
    this.JnlEarnedThruDt = other.JnlEarnedThruDt;
    this._JnlEarnedThruDtSet = other._JnlEarnedThruDtSet;
    this.JnlStatus = other.JnlStatus;
    this._JnlStatusSet = other._JnlStatusSet;
    this.TestFlag = other.TestFlag;
    this._TestFlagSet = other._TestFlagSet;
    this.ArchFlag = other.ArchFlag;
    this._ArchFlagSet = other._ArchFlagSet;
    this.InterimBillFlag = other.InterimBillFlag;
    this._InterimBillFlagSet = other._InterimBillFlagSet;
    this.IncludeNrc = other.IncludeNrc;
    this._IncludeNrcSet = other._IncludeNrcSet;
    this.IncludeRc = other.IncludeRc;
    this._IncludeRcSet = other._IncludeRcSet;
    this.IncludeAdj = other.IncludeAdj;
    this._IncludeAdjSet = other._IncludeAdjSet;
    this.IncludeUsage = other.IncludeUsage;
    this._IncludeUsageSet = other._IncludeUsageSet;
    this.IncludePayment = other.IncludePayment;
    this._IncludePaymentSet = other._IncludePaymentSet;
    this.LanguageCode = other.LanguageCode;
    this._LanguageCodeSet = other._LanguageCodeSet;
    this.BillConverted = other.BillConverted;
    this._BillConvertedSet = other._BillConvertedSet;
    this.WarmBillFlag = other.WarmBillFlag;
    this._WarmBillFlagSet = other._WarmBillFlagSet;
    this.BillOrderNumber = other.BillOrderNumber;
    this._BillOrderNumberSet = other._BillOrderNumberSet;
    this.BillFmtOpt = other.BillFmtOpt;
    this._BillFmtOptSet = other._BillFmtOptSet;
    this.DocumentServerId = other.DocumentServerId;
    this._DocumentServerIdSet = other._DocumentServerIdSet;
  }

  /** get the Key for this object
   * @return InvoiceObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public InvoiceObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (InvoiceObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAccountExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountExternalId", "setAccountExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AccountExternalId", "setAccountExternalId");
    }
    if (this.Key == null) this.Key = new InvoiceObjectKeyData ();
    this.Key.AccountExternalId = value;
    this.Key._AccountExternalIdSet = true;
  }
  /** get the value of the field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return String the value
   */
  public String getAccountExternalId () {
    if (this.Key == null) return null;
    return this.Key.AccountExternalId;
  }
  /** Change the field to not being actively set: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   */
  public void unsetAccountExternalId () {
    if (this.Key == null) return;
    this.Key._AccountExternalIdSet = false;
  }
  /** See if the field is actively set: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountExternalId () {
    if (this.Key == null) return false;
    return this.Key._AccountExternalIdSet;
  }

  /** Retrieves the AccountExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalId field
   */
   public String getAccountExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getAccountExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountExternalId field from a formatted string
   *
   * @param _value the AccountExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountExternalId field
   */
   public void setAccountExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdFromFormattedString");
   }

  /** set the fields value: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAccountExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountExternalIdType", "setAccountExternalIdType");
    }
    if (this.Key == null) this.Key = new InvoiceObjectKeyData ();
    this.Key.AccountExternalIdType = value;
    this.Key._AccountExternalIdTypeSet = true;
  }
  /** get the value of the field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getAccountExternalIdType () {
    if (this.Key == null) return null;
    return this.Key.AccountExternalIdType;
  }
  /** Change the field to not being actively set: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   */
  public void unsetAccountExternalIdType () {
    if (this.Key == null) return;
    this.Key._AccountExternalIdTypeSet = false;
  }
  /** See if the field is actively set: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountExternalIdType () {
    if (this.Key == null) return false;
    return this.Key._AccountExternalIdTypeSet;
  }

  /** Retrieves the AccountExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalIdType field
   */
   public String getAccountExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountExternalIdType field from a formatted string
   *
   * @param _value the AccountExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountExternalIdType field
   */
   public void setAccountExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated AccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountExternalIdType field
   */
  public String getAccountExternalIdTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountExternalIdTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getAccountExternalIdType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated AccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the AccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountExternalIdType field
   */
  public Enumeration getAccountExternalIdTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeEnumeration");
    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ExternalIdType", _locale, null, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated AccountExternalIdType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setAccountExternalIdTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountExternalIdTypeEnumeration(_locale);
      this.setAccountExternalIdType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFromDisplayValue");
  }

  /** set the fields value: BillRefNo (CMF_BALANCE.bill_ref_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBillRefNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefNo", "setBillRefNo");
    }
    if (this.Key == null) this.Key = new InvoiceObjectKeyData ();
    this.Key.BillRefNo = value;
    this.Key._BillRefNoSet = true;
  }
  /** get the value of the field: BillRefNo (CMF_BALANCE.bill_ref_no)
   * @return Integer the value
   */
  public Integer getBillRefNo () {
    if (this.Key == null) return null;
    return this.Key.BillRefNo;
  }
  /** Change the field to not being actively set: BillRefNo (CMF_BALANCE.bill_ref_no)
   */
  public void unsetBillRefNo () {
    if (this.Key == null) return;
    this.Key._BillRefNoSet = false;
  }
  /** See if the field is actively set: BillRefNo (CMF_BALANCE.bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefNo () {
    if (this.Key == null) return false;
    return this.Key._BillRefNoSet;
  }

  /** Retrieves the BillRefNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillRefNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefNo field
   */
   public String getBillRefNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefNoAsFormattedString");
       return fmtMgr.formatNumber(this.getBillRefNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillRefNo field from a formatted string
   *
   * @param _value the BillRefNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillRefNo field
   */
   public void setBillRefNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillRefNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefNoFromFormattedString");
   }

  /** set the fields value: BillRefResets (CMF_BALANCE.bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBillRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefResets", "setBillRefResets");
    }
    if (this.Key == null) this.Key = new InvoiceObjectKeyData ();
    this.Key.BillRefResets = value;
    this.Key._BillRefResetsSet = true;
  }
  /** get the value of the field: BillRefResets (CMF_BALANCE.bill_ref_resets)
   * @return Integer the value
   */
  public Integer getBillRefResets () {
    if (this.Key == null) return null;
    return this.Key.BillRefResets;
  }
  /** Change the field to not being actively set: BillRefResets (CMF_BALANCE.bill_ref_resets)
   */
  public void unsetBillRefResets () {
    if (this.Key == null) return;
    this.Key._BillRefResetsSet = false;
  }
  /** See if the field is actively set: BillRefResets (CMF_BALANCE.bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefResets () {
    if (this.Key == null) return false;
    return this.Key._BillRefResetsSet;
  }

  /** Retrieves the BillRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefResets field
   */
   public String getBillRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getBillRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillRefResets field from a formatted string
   *
   * @param _value the BillRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillRefResets field
   */
   public void setBillRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefResetsFromFormattedString");
   }

  /** set the fields value: AccountInternalId (CMF_BALANCE.account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountInternalId") 
  public void setAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountInternalId", "setAccountInternalId");
    }
    this.AccountInternalId = value;
    this._AccountInternalIdSet = true;
  }

  /** Retrieves the AccountInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountInternalId field
   */
   public String getAccountInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountInternalId field from a formatted string
   *
   * @param _value the AccountInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountInternalId field
   */
   public void setAccountInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountInternalIdFromFormattedString");
   }

  /** get the value of the field: AccountInternalId (CMF_BALANCE.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (CMF_BALANCE.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (CMF_BALANCE.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: CurrencyCode (CMF_BALANCE.currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CurrencyCode") 
  public void setCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CurrencyCode", "setCurrencyCode");
    }
    this.CurrencyCode = value;
    this._CurrencyCodeSet = true;
  }

  /** Retrieves the CurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyCode field
   */
   public String getCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CurrencyCode field from a formatted string
   *
   * @param _value the CurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CurrencyCode field
   */
   public void setCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFromFormattedString");
   }

  /** get the value of the field: CurrencyCode (CMF_BALANCE.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (CMF_BALANCE.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (CMF_BALANCE.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: PayDueDate (CMF_BALANCE.ppdd_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PayDueDate") 
  public void setPayDueDate (Date value) throws ServiceException
  {
    this.PayDueDate = value;
    this._PayDueDateSet = true;
  }

  /** Retrieves the PayDueDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PayDueDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayDueDate field
   */
   public String getPayDueDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayDueDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayDueDateAsFormattedString");
       return fmtMgr.formatDate(this.getPayDueDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayDueDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayDueDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the PayDueDate field from a formatted string
   *
   * @param _value the PayDueDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PayDueDate field
   */
   public void setPayDueDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayDueDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPayDueDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayDueDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayDueDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayDueDateFromFormattedString");
   }

  /**
   * Retrieves the PayDueDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PayDueDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayDueDate field
   */
  public String getPayDueDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayDueDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayDueDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPayDueDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayDueDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayDueDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PayDueDate field value from a formatted date/time string
   *
   * @param _value the PayDueDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PayDueDate field
   */
  public void setPayDueDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayDueDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPayDueDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayDueDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayDueDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: PayDueDate (CMF_BALANCE.ppdd_date)
   * @return Date the value
   */
  public Date getPayDueDate () {
    return this.PayDueDate;
  }
  /** Change the field to not being actively set: PayDueDate (CMF_BALANCE.ppdd_date)
   */
  public void unsetPayDueDate () {
    this._PayDueDateSet = false;
  }
  /** See if the field is actively set: PayDueDate (CMF_BALANCE.ppdd_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetPayDueDate () {
    return this._PayDueDateSet;
  }
  /** set the fields value: OrigPayDueDate (CMF_BALANCE.orig_ppdd_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigPayDueDate") 
  public void setOrigPayDueDate (Date value) throws ServiceException
  {
    this.OrigPayDueDate = value;
    this._OrigPayDueDateSet = true;
  }

  /** Retrieves the OrigPayDueDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigPayDueDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigPayDueDate field
   */
   public String getOrigPayDueDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigPayDueDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigPayDueDateAsFormattedString");
       return fmtMgr.formatDate(this.getOrigPayDueDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigPayDueDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigPayDueDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigPayDueDate field from a formatted string
   *
   * @param _value the OrigPayDueDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigPayDueDate field
   */
   public void setOrigPayDueDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigPayDueDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigPayDueDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigPayDueDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigPayDueDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigPayDueDateFromFormattedString");
   }

  /**
   * Retrieves the OrigPayDueDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigPayDueDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigPayDueDate field
   */
  public String getOrigPayDueDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigPayDueDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigPayDueDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getOrigPayDueDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigPayDueDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigPayDueDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the OrigPayDueDate field value from a formatted date/time string
   *
   * @param _value the OrigPayDueDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigPayDueDate field
   */
  public void setOrigPayDueDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigPayDueDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setOrigPayDueDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigPayDueDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigPayDueDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: OrigPayDueDate (CMF_BALANCE.orig_ppdd_date)
   * @return Date the value
   */
  public Date getOrigPayDueDate () {
    return this.OrigPayDueDate;
  }
  /** Change the field to not being actively set: OrigPayDueDate (CMF_BALANCE.orig_ppdd_date)
   */
  public void unsetOrigPayDueDate () {
    this._OrigPayDueDateSet = false;
  }
  /** See if the field is actively set: OrigPayDueDate (CMF_BALANCE.orig_ppdd_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigPayDueDate () {
    return this._OrigPayDueDateSet;
  }
  /** set the fields value: ClosedDate (CMF_BALANCE.closed_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ClosedDate") 
  public void setClosedDate (Date value) throws ServiceException
  {
    this.ClosedDate = value;
    this._ClosedDateSet = true;
  }

  /** Retrieves the ClosedDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ClosedDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ClosedDate field
   */
   public String getClosedDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getClosedDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getClosedDateAsFormattedString");
       return fmtMgr.formatDate(this.getClosedDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ClosedDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getClosedDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ClosedDate field from a formatted string
   *
   * @param _value the ClosedDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ClosedDate field
   */
   public void setClosedDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getClosedDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setClosedDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ClosedDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setClosedDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setClosedDateFromFormattedString");
   }

  /**
   * Retrieves the ClosedDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ClosedDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ClosedDate field
   */
  public String getClosedDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getClosedDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getClosedDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getClosedDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ClosedDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getClosedDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ClosedDate field value from a formatted date/time string
   *
   * @param _value the ClosedDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ClosedDate field
   */
  public void setClosedDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setClosedDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setClosedDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ClosedDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setClosedDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ClosedDate (CMF_BALANCE.closed_date)
   * @return Date the value
   */
  public Date getClosedDate () {
    return this.ClosedDate;
  }
  /** Change the field to not being actively set: ClosedDate (CMF_BALANCE.closed_date)
   */
  public void unsetClosedDate () {
    this._ClosedDateSet = false;
  }
  /** See if the field is actively set: ClosedDate (CMF_BALANCE.closed_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetClosedDate () {
    return this._ClosedDateSet;
  }
  /** set the fields value: NewCharges (CMF_BALANCE.new_charges)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NewCharges") 
  public void setNewCharges (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NewCharges", "setNewCharges");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "NewCharges", "setNewCharges");
    }
    this.NewCharges = value;
    this._NewChargesSet = true;
  }

  /** Retrieves the NewCharges field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NewCharges field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NewCharges field
   */
   public String getNewChargesAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNewChargesAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNewChargesAsFormattedString");
       return fmtMgr.formatBigInteger(this.getNewCharges(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NewCharges");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNewChargesAsFormattedString");
       throw x;
     }
   }
  /** Sets the NewCharges field from a formatted string
   *
   * @param _value the NewCharges field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NewCharges field
   */
   public void setNewChargesFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNewChargesFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNewCharges(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NewCharges");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNewChargesFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNewChargesFromFormattedString");
   }

  /**
   * Retrieves the NewCharges field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NewCharges field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the NewCharges field
   */
  public String getNewChargesAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNewChargesAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNewChargesAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getNewCharges(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NewCharges");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNewChargesAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the NewCharges field value from a formatted currency string
   *
   * @param _value the NewCharges field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NewCharges field
   */
  public void setNewChargesFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNewChargesFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setNewCharges(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NewCharges");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNewChargesFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNewChargesFromFormattedCurrencyString");
  }

  /** get the value of the field: NewCharges (CMF_BALANCE.new_charges)
   * @return BigInteger the value
   */
  public BigInteger getNewCharges () {
    return this.NewCharges;
  }
  /** Change the field to not being actively set: NewCharges (CMF_BALANCE.new_charges)
   */
  public void unsetNewCharges () {
    this._NewChargesSet = false;
  }
  /** See if the field is actively set: NewCharges (CMF_BALANCE.new_charges)
   * @return boolean whether the field is actively set
   */
  public boolean issetNewCharges () {
    return this._NewChargesSet;
  }
  /** set the fields value: NetNewCharges (CMF_BALANCE.net_new_charges)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NetNewCharges") 
  public void setNetNewCharges (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NetNewCharges", "setNetNewCharges");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "NetNewCharges", "setNetNewCharges");
    }
    this.NetNewCharges = value;
    this._NetNewChargesSet = true;
  }

  /** Retrieves the NetNewCharges field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NetNewCharges field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NetNewCharges field
   */
   public String getNetNewChargesAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetNewChargesAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNetNewChargesAsFormattedString");
       return fmtMgr.formatBigInteger(this.getNetNewCharges(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NetNewCharges");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNetNewChargesAsFormattedString");
       throw x;
     }
   }
  /** Sets the NetNewCharges field from a formatted string
   *
   * @param _value the NetNewCharges field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NetNewCharges field
   */
   public void setNetNewChargesFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetNewChargesFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNetNewCharges(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NetNewCharges");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNetNewChargesFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNetNewChargesFromFormattedString");
   }

  /**
   * Retrieves the NetNewCharges field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NetNewCharges field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the NetNewCharges field
   */
  public String getNetNewChargesAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetNewChargesAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNetNewChargesAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getNetNewCharges(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NetNewCharges");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNetNewChargesAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the NetNewCharges field value from a formatted currency string
   *
   * @param _value the NetNewCharges field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NetNewCharges field
   */
  public void setNetNewChargesFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNetNewChargesFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setNetNewCharges(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NetNewCharges");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNetNewChargesFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNetNewChargesFromFormattedCurrencyString");
  }

  /** get the value of the field: NetNewCharges (CMF_BALANCE.net_new_charges)
   * @return BigInteger the value
   */
  public BigInteger getNetNewCharges () {
    return this.NetNewCharges;
  }
  /** Change the field to not being actively set: NetNewCharges (CMF_BALANCE.net_new_charges)
   */
  public void unsetNetNewCharges () {
    this._NetNewChargesSet = false;
  }
  /** See if the field is actively set: NetNewCharges (CMF_BALANCE.net_new_charges)
   * @return boolean whether the field is actively set
   */
  public boolean issetNetNewCharges () {
    return this._NetNewChargesSet;
  }
  /** set the fields value: TotalDue (CMF_BALANCE.total_due)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TotalDue") 
  public void setTotalDue (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TotalDue", "setTotalDue");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TotalDue", "setTotalDue");
    }
    this.TotalDue = value;
    this._TotalDueSet = true;
  }

  /** Retrieves the TotalDue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TotalDue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalDue field
   */
   public String getTotalDueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalDueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalDueAsFormattedString");
       return fmtMgr.formatBigInteger(this.getTotalDue(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalDue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalDueAsFormattedString");
       throw x;
     }
   }
  /** Sets the TotalDue field from a formatted string
   *
   * @param _value the TotalDue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalDue field
   */
   public void setTotalDueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalDueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTotalDue(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalDue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalDueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalDueFromFormattedString");
   }

  /**
   * Retrieves the TotalDue field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalDue field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalDue field
   */
  public String getTotalDueAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalDueAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalDueAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getTotalDue(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalDue");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalDueAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the TotalDue field value from a formatted currency string
   *
   * @param _value the TotalDue field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalDue field
   */
  public void setTotalDueFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalDueFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTotalDue(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalDue");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalDueFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalDueFromFormattedCurrencyString");
  }

  /** get the value of the field: TotalDue (CMF_BALANCE.total_due)
   * @return BigInteger the value
   */
  public BigInteger getTotalDue () {
    return this.TotalDue;
  }
  /** Change the field to not being actively set: TotalDue (CMF_BALANCE.total_due)
   */
  public void unsetTotalDue () {
    this._TotalDueSet = false;
  }
  /** See if the field is actively set: TotalDue (CMF_BALANCE.total_due)
   * @return boolean whether the field is actively set
   */
  public boolean issetTotalDue () {
    return this._TotalDueSet;
  }
  /** set the fields value: TotalAdj (CMF_BALANCE.total_adj)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TotalAdj") 
  public void setTotalAdj (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TotalAdj", "setTotalAdj");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TotalAdj", "setTotalAdj");
    }
    this.TotalAdj = value;
    this._TotalAdjSet = true;
  }

  /** Retrieves the TotalAdj field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TotalAdj field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalAdj field
   */
   public String getTotalAdjAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAdjAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalAdjAsFormattedString");
       return fmtMgr.formatBigInteger(this.getTotalAdj(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalAdj");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalAdjAsFormattedString");
       throw x;
     }
   }
  /** Sets the TotalAdj field from a formatted string
   *
   * @param _value the TotalAdj field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalAdj field
   */
   public void setTotalAdjFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAdjFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTotalAdj(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalAdj");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalAdjFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalAdjFromFormattedString");
   }

  /**
   * Retrieves the TotalAdj field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalAdj field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalAdj field
   */
  public String getTotalAdjAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAdjAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalAdjAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getTotalAdj(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAdj");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalAdjAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the TotalAdj field value from a formatted currency string
   *
   * @param _value the TotalAdj field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalAdj field
   */
  public void setTotalAdjFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalAdjFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTotalAdj(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAdj");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalAdjFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalAdjFromFormattedCurrencyString");
  }

  /** get the value of the field: TotalAdj (CMF_BALANCE.total_adj)
   * @return BigInteger the value
   */
  public BigInteger getTotalAdj () {
    return this.TotalAdj;
  }
  /** Change the field to not being actively set: TotalAdj (CMF_BALANCE.total_adj)
   */
  public void unsetTotalAdj () {
    this._TotalAdjSet = false;
  }
  /** See if the field is actively set: TotalAdj (CMF_BALANCE.total_adj)
   * @return boolean whether the field is actively set
   */
  public boolean issetTotalAdj () {
    return this._TotalAdjSet;
  }
  /** set the fields value: TotalPaid (CMF_BALANCE.total_paid)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TotalPaid") 
  public void setTotalPaid (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TotalPaid", "setTotalPaid");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TotalPaid", "setTotalPaid");
    }
    this.TotalPaid = value;
    this._TotalPaidSet = true;
  }

  /** Retrieves the TotalPaid field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TotalPaid field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalPaid field
   */
   public String getTotalPaidAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalPaidAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalPaidAsFormattedString");
       return fmtMgr.formatBigInteger(this.getTotalPaid(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalPaid");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalPaidAsFormattedString");
       throw x;
     }
   }
  /** Sets the TotalPaid field from a formatted string
   *
   * @param _value the TotalPaid field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalPaid field
   */
   public void setTotalPaidFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalPaidFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTotalPaid(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalPaid");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalPaidFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalPaidFromFormattedString");
   }

  /**
   * Retrieves the TotalPaid field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalPaid field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalPaid field
   */
  public String getTotalPaidAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalPaidAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalPaidAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getTotalPaid(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalPaid");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalPaidAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the TotalPaid field value from a formatted currency string
   *
   * @param _value the TotalPaid field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalPaid field
   */
  public void setTotalPaidFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalPaidFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTotalPaid(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalPaid");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalPaidFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalPaidFromFormattedCurrencyString");
  }

  /** get the value of the field: TotalPaid (CMF_BALANCE.total_paid)
   * @return BigInteger the value
   */
  public BigInteger getTotalPaid () {
    return this.TotalPaid;
  }
  /** Change the field to not being actively set: TotalPaid (CMF_BALANCE.total_paid)
   */
  public void unsetTotalPaid () {
    this._TotalPaidSet = false;
  }
  /** See if the field is actively set: TotalPaid (CMF_BALANCE.total_paid)
   * @return boolean whether the field is actively set
   */
  public boolean issetTotalPaid () {
    return this._TotalPaidSet;
  }
  /** set the fields value: BalanceDue (CMF_BALANCE.balance_due)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BalanceDue") 
  public void setBalanceDue (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BalanceDue", "setBalanceDue");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BalanceDue", "setBalanceDue");
    }
    this.BalanceDue = value;
    this._BalanceDueSet = true;
  }

  /** Retrieves the BalanceDue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BalanceDue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceDue field
   */
   public String getBalanceDueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceDueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceDueAsFormattedString");
       return fmtMgr.formatBigInteger(this.getBalanceDue(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceDue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceDueAsFormattedString");
       throw x;
     }
   }
  /** Sets the BalanceDue field from a formatted string
   *
   * @param _value the BalanceDue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BalanceDue field
   */
   public void setBalanceDueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceDueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBalanceDue(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceDue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceDueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceDueFromFormattedString");
   }

  /**
   * Retrieves the BalanceDue field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BalanceDue field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceDue field
   */
  public String getBalanceDueAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceDueAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceDueAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getBalanceDue(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceDue");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceDueAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the BalanceDue field value from a formatted currency string
   *
   * @param _value the BalanceDue field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BalanceDue field
   */
  public void setBalanceDueFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBalanceDueFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setBalanceDue(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceDue");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceDueFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceDueFromFormattedCurrencyString");
  }

  /** get the value of the field: BalanceDue (CMF_BALANCE.balance_due)
   * @return BigInteger the value
   */
  public BigInteger getBalanceDue () {
    return this.BalanceDue;
  }
  /** Change the field to not being actively set: BalanceDue (CMF_BALANCE.balance_due)
   */
  public void unsetBalanceDue () {
    this._BalanceDueSet = false;
  }
  /** See if the field is actively set: BalanceDue (CMF_BALANCE.balance_due)
   * @return boolean whether the field is actively set
   */
  public boolean issetBalanceDue () {
    return this._BalanceDueSet;
  }
  /** set the fields value: DisputeAmt (CMF_BALANCE.dispute_amt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DisputeAmt") 
  public void setDisputeAmt (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DisputeAmt", "setDisputeAmt");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DisputeAmt", "setDisputeAmt");
    }
    this.DisputeAmt = value;
    this._DisputeAmtSet = true;
  }

  /** Retrieves the DisputeAmt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DisputeAmt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisputeAmt field
   */
   public String getDisputeAmtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisputeAmtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisputeAmtAsFormattedString");
       return fmtMgr.formatBigInteger(this.getDisputeAmt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisputeAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisputeAmtAsFormattedString");
       throw x;
     }
   }
  /** Sets the DisputeAmt field from a formatted string
   *
   * @param _value the DisputeAmt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DisputeAmt field
   */
   public void setDisputeAmtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisputeAmtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDisputeAmt(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisputeAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisputeAmtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisputeAmtFromFormattedString");
   }

  /**
   * Retrieves the DisputeAmt field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DisputeAmt field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisputeAmt field
   */
  public String getDisputeAmtAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisputeAmtAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisputeAmtAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getDisputeAmt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisputeAmt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisputeAmtAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the DisputeAmt field value from a formatted currency string
   *
   * @param _value the DisputeAmt field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DisputeAmt field
   */
  public void setDisputeAmtFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDisputeAmtFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDisputeAmt(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisputeAmt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisputeAmtFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisputeAmtFromFormattedCurrencyString");
  }

  /** get the value of the field: DisputeAmt (CMF_BALANCE.dispute_amt)
   * @return BigInteger the value
   */
  public BigInteger getDisputeAmt () {
    return this.DisputeAmt;
  }
  /** Change the field to not being actively set: DisputeAmt (CMF_BALANCE.dispute_amt)
   */
  public void unsetDisputeAmt () {
    this._DisputeAmtSet = false;
  }
  /** See if the field is actively set: DisputeAmt (CMF_BALANCE.dispute_amt)
   * @return boolean whether the field is actively set
   */
  public boolean issetDisputeAmt () {
    return this._DisputeAmtSet;
  }
  /** set the fields value: LateExemptCharges (CMF_BALANCE.late_exempt_charges)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LateExemptCharges") 
  public void setLateExemptCharges (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LateExemptCharges", "setLateExemptCharges");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "LateExemptCharges", "setLateExemptCharges");
    }
    this.LateExemptCharges = value;
    this._LateExemptChargesSet = true;
  }

  /** Retrieves the LateExemptCharges field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LateExemptCharges field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LateExemptCharges field
   */
   public String getLateExemptChargesAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLateExemptChargesAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLateExemptChargesAsFormattedString");
       return fmtMgr.formatBigInteger(this.getLateExemptCharges(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LateExemptCharges");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLateExemptChargesAsFormattedString");
       throw x;
     }
   }
  /** Sets the LateExemptCharges field from a formatted string
   *
   * @param _value the LateExemptCharges field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LateExemptCharges field
   */
   public void setLateExemptChargesFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLateExemptChargesFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLateExemptCharges(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LateExemptCharges");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLateExemptChargesFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLateExemptChargesFromFormattedString");
   }

  /**
   * Retrieves the LateExemptCharges field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LateExemptCharges field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the LateExemptCharges field
   */
  public String getLateExemptChargesAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLateExemptChargesAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLateExemptChargesAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getLateExemptCharges(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LateExemptCharges");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLateExemptChargesAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the LateExemptCharges field value from a formatted currency string
   *
   * @param _value the LateExemptCharges field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LateExemptCharges field
   */
  public void setLateExemptChargesFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLateExemptChargesFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setLateExemptCharges(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LateExemptCharges");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLateExemptChargesFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLateExemptChargesFromFormattedCurrencyString");
  }

  /** get the value of the field: LateExemptCharges (CMF_BALANCE.late_exempt_charges)
   * @return BigInteger the value
   */
  public BigInteger getLateExemptCharges () {
    return this.LateExemptCharges;
  }
  /** Change the field to not being actively set: LateExemptCharges (CMF_BALANCE.late_exempt_charges)
   */
  public void unsetLateExemptCharges () {
    this._LateExemptChargesSet = false;
  }
  /** See if the field is actively set: LateExemptCharges (CMF_BALANCE.late_exempt_charges)
   * @return boolean whether the field is actively set
   */
  public boolean issetLateExemptCharges () {
    return this._LateExemptChargesSet;
  }
  /** set the fields value: CollectionIndicator (CMF_BALANCE.collection_indicator)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CollectionIndicator") 
  public void setCollectionIndicator (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CollectionIndicator", "setCollectionIndicator");
    }
    this.CollectionIndicator = value;
    this._CollectionIndicatorSet = true;
  }

  /** Retrieves the CollectionIndicator field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CollectionIndicator field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CollectionIndicator field
   */
   public String getCollectionIndicatorAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCollectionIndicatorAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCollectionIndicatorAsFormattedString");
       return fmtMgr.formatNumber(this.getCollectionIndicator(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CollectionIndicator");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCollectionIndicatorAsFormattedString");
       throw x;
     }
   }
  /** Sets the CollectionIndicator field from a formatted string
   *
   * @param _value the CollectionIndicator field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CollectionIndicator field
   */
   public void setCollectionIndicatorFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCollectionIndicatorFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCollectionIndicator(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CollectionIndicator");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCollectionIndicatorFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCollectionIndicatorFromFormattedString");
   }

  /** get the value of the field: CollectionIndicator (CMF_BALANCE.collection_indicator)
   * @return Integer the value
   */
  public Integer getCollectionIndicator () {
    return this.CollectionIndicator;
  }
  /** Change the field to not being actively set: CollectionIndicator (CMF_BALANCE.collection_indicator)
   */
  public void unsetCollectionIndicator () {
    this._CollectionIndicatorSet = false;
  }
  /** See if the field is actively set: CollectionIndicator (CMF_BALANCE.collection_indicator)
   * @return boolean whether the field is actively set
   */
  public boolean issetCollectionIndicator () {
    return this._CollectionIndicatorSet;
  }
  /** set the fields value: ChgDate (CMF_BALANCE.chg_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgDate") 
  public void setChgDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgDate", "setChgDate");
    }
    this.ChgDate = value;
    this._ChgDateSet = true;
  }

  /** Retrieves the ChgDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDate field
   */
   public String getChgDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateAsFormattedString");
       return fmtMgr.formatDate(this.getChgDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgDate field from a formatted string
   *
   * @param _value the ChgDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDate field
   */
   public void setChgDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFromFormattedString");
   }

  /**
   * Retrieves the ChgDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDate field
   */
  public String getChgDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getChgDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDate field value from a formatted date/time string
   *
   * @param _value the ChgDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDate field
   */
  public void setChgDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setChgDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ChgDate (CMF_BALANCE.chg_date)
   * @return Date the value
   */
  public Date getChgDate () {
    return this.ChgDate;
  }
  /** Change the field to not being actively set: ChgDate (CMF_BALANCE.chg_date)
   */
  public void unsetChgDate () {
    this._ChgDateSet = false;
  }
  /** See if the field is actively set: ChgDate (CMF_BALANCE.chg_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDate () {
    return this._ChgDateSet;
  }
  /** set the fields value: ChgWho (CMF_BALANCE.chg_who)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgWho") 
  public void setChgWho (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgWho", "setChgWho");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ChgWho", "setChgWho");
    }
    this.ChgWho = value;
    this._ChgWhoSet = true;
  }

  /** Retrieves the ChgWho field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgWho field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgWho field
   */
   public String getChgWhoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgWhoAsFormattedString");
       return fmtMgr.formatString(this.getChgWho());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgWho");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgWhoAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgWho field from a formatted string
   *
   * @param _value the ChgWho field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgWho field
   */
   public void setChgWhoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgWho(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgWho");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgWhoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgWhoFromFormattedString");
   }

  /** get the value of the field: ChgWho (CMF_BALANCE.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (CMF_BALANCE.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (CMF_BALANCE.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: GlAmount (CMF_BALANCE.gl_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("GlAmount") 
  public void setGlAmount (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "GlAmount", "setGlAmount");
    }
    this.GlAmount = value;
    this._GlAmountSet = true;
  }

  /** Retrieves the GlAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GlAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GlAmount field
   */
   public String getGlAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGlAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getGlAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GlAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGlAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the GlAmount field from a formatted string
   *
   * @param _value the GlAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GlAmount field
   */
   public void setGlAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGlAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GlAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGlAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGlAmountFromFormattedString");
   }

  /**
   * Retrieves the GlAmount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GlAmount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the GlAmount field
   */
  public String getGlAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGlAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getGlAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GlAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGlAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the GlAmount field value from a formatted currency string
   *
   * @param _value the GlAmount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GlAmount field
   */
  public void setGlAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGlAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setGlAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GlAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGlAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGlAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: GlAmount (CMF_BALANCE.gl_amount)
   * @return BigInteger the value
   */
  public BigInteger getGlAmount () {
    return this.GlAmount;
  }
  /** Change the field to not being actively set: GlAmount (CMF_BALANCE.gl_amount)
   */
  public void unsetGlAmount () {
    this._GlAmountSet = false;
  }
  /** See if the field is actively set: GlAmount (CMF_BALANCE.gl_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetGlAmount () {
    return this._GlAmountSet;
  }
  /** set the fields value: BalanceConverted (CMF_BALANCE.converted)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BalanceConverted") 
  public void setBalanceConverted (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BalanceConverted", "setBalanceConverted");
    }
    this.BalanceConverted = value;
    this._BalanceConvertedSet = true;
  }

  /** Retrieves the BalanceConverted field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BalanceConverted field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceConverted field
   */
   public String getBalanceConvertedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceConvertedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceConvertedAsFormattedString");
       return fmtMgr.formatNumber(this.getBalanceConverted(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceConverted");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceConvertedAsFormattedString");
       throw x;
     }
   }
  /** Sets the BalanceConverted field from a formatted string
   *
   * @param _value the BalanceConverted field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BalanceConverted field
   */
   public void setBalanceConvertedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceConvertedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBalanceConverted(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceConverted");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceConvertedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceConvertedFromFormattedString");
   }

  /** get the value of the field: BalanceConverted (CMF_BALANCE.converted)
   * @return Integer the value
   */
  public Integer getBalanceConverted () {
    return this.BalanceConverted;
  }
  /** Change the field to not being actively set: BalanceConverted (CMF_BALANCE.converted)
   */
  public void unsetBalanceConverted () {
    this._BalanceConvertedSet = false;
  }
  /** See if the field is actively set: BalanceConverted (CMF_BALANCE.converted)
   * @return boolean whether the field is actively set
   */
  public boolean issetBalanceConverted () {
    return this._BalanceConvertedSet;
  }
  /** set the fields value: NewChargeCredits (CMF_BALANCE.new_charge_credits)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NewChargeCredits") 
  public void setNewChargeCredits (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NewChargeCredits", "setNewChargeCredits");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "NewChargeCredits", "setNewChargeCredits");
    }
    this.NewChargeCredits = value;
    this._NewChargeCreditsSet = true;
  }

  /** Retrieves the NewChargeCredits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NewChargeCredits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NewChargeCredits field
   */
   public String getNewChargeCreditsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNewChargeCreditsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNewChargeCreditsAsFormattedString");
       return fmtMgr.formatBigInteger(this.getNewChargeCredits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NewChargeCredits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNewChargeCreditsAsFormattedString");
       throw x;
     }
   }
  /** Sets the NewChargeCredits field from a formatted string
   *
   * @param _value the NewChargeCredits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NewChargeCredits field
   */
   public void setNewChargeCreditsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNewChargeCreditsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNewChargeCredits(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NewChargeCredits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNewChargeCreditsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNewChargeCreditsFromFormattedString");
   }

  /**
   * Retrieves the NewChargeCredits field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NewChargeCredits field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the NewChargeCredits field
   */
  public String getNewChargeCreditsAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNewChargeCreditsAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNewChargeCreditsAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getNewChargeCredits(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NewChargeCredits");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNewChargeCreditsAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the NewChargeCredits field value from a formatted currency string
   *
   * @param _value the NewChargeCredits field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NewChargeCredits field
   */
  public void setNewChargeCreditsFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNewChargeCreditsFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setNewChargeCredits(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NewChargeCredits");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNewChargeCreditsFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNewChargeCreditsFromFormattedCurrencyString");
  }

  /** get the value of the field: NewChargeCredits (CMF_BALANCE.new_charge_credits)
   * @return BigInteger the value
   */
  public BigInteger getNewChargeCredits () {
    return this.NewChargeCredits;
  }
  /** Change the field to not being actively set: NewChargeCredits (CMF_BALANCE.new_charge_credits)
   */
  public void unsetNewChargeCredits () {
    this._NewChargeCreditsSet = false;
  }
  /** See if the field is actively set: NewChargeCredits (CMF_BALANCE.new_charge_credits)
   * @return boolean whether the field is actively set
   */
  public boolean issetNewChargeCredits () {
    return this._NewChargeCreditsSet;
  }
  /** set the fields value: BillSequenceNum (BILL_INVOICE.bill_sequence_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillSequenceNum") 
  public void setBillSequenceNum (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillSequenceNum", "setBillSequenceNum");
    }
    this.BillSequenceNum = value;
    this._BillSequenceNumSet = true;
  }

  /** Retrieves the BillSequenceNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillSequenceNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillSequenceNum field
   */
   public String getBillSequenceNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillSequenceNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillSequenceNumAsFormattedString");
       return fmtMgr.formatNumber(this.getBillSequenceNum(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillSequenceNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillSequenceNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillSequenceNum field from a formatted string
   *
   * @param _value the BillSequenceNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillSequenceNum field
   */
   public void setBillSequenceNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillSequenceNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillSequenceNum(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillSequenceNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillSequenceNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillSequenceNumFromFormattedString");
   }

  /** get the value of the field: BillSequenceNum (BILL_INVOICE.bill_sequence_num)
   * @return Integer the value
   */
  public Integer getBillSequenceNum () {
    return this.BillSequenceNum;
  }
  /** Change the field to not being actively set: BillSequenceNum (BILL_INVOICE.bill_sequence_num)
   */
  public void unsetBillSequenceNum () {
    this._BillSequenceNumSet = false;
  }
  /** See if the field is actively set: BillSequenceNum (BILL_INVOICE.bill_sequence_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillSequenceNum () {
    return this._BillSequenceNumSet;
  }
  /** set the fields value: ProcessNum (BILL_INVOICE.process_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProcessNum") 
  public void setProcessNum (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProcessNum", "setProcessNum");
    }
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ProcessNum", "setProcessNum");
    }
    this.ProcessNum = value;
    this._ProcessNumSet = true;
  }

  /** Retrieves the ProcessNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProcessNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProcessNum field
   */
   public String getProcessNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProcessNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProcessNumAsFormattedString");
       return fmtMgr.formatString(this.getProcessNum());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProcessNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProcessNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProcessNum field from a formatted string
   *
   * @param _value the ProcessNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProcessNum field
   */
   public void setProcessNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProcessNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProcessNum(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProcessNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProcessNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProcessNumFromFormattedString");
   }

  /** get the value of the field: ProcessNum (BILL_INVOICE.process_num)
   * @return String the value
   */
  public String getProcessNum () {
    return this.ProcessNum;
  }
  /** Change the field to not being actively set: ProcessNum (BILL_INVOICE.process_num)
   */
  public void unsetProcessNum () {
    this._ProcessNumSet = false;
  }
  /** See if the field is actively set: ProcessNum (BILL_INVOICE.process_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetProcessNum () {
    return this._ProcessNumSet;
  }
  /** set the fields value: PrevBillRefno (BILL_INVOICE.prev_bill_refno)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrevBillRefno") 
  public void setPrevBillRefno (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrevBillRefno", "setPrevBillRefno");
    }
    this.PrevBillRefno = value;
    this._PrevBillRefnoSet = true;
  }

  /** Retrieves the PrevBillRefno field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrevBillRefno field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevBillRefno field
   */
   public String getPrevBillRefnoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBillRefnoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevBillRefnoAsFormattedString");
       return fmtMgr.formatNumber(this.getPrevBillRefno(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevBillRefno");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevBillRefnoAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrevBillRefno field from a formatted string
   *
   * @param _value the PrevBillRefno field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevBillRefno field
   */
   public void setPrevBillRefnoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBillRefnoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrevBillRefno(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevBillRefno");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevBillRefnoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevBillRefnoFromFormattedString");
   }

  /** get the value of the field: PrevBillRefno (BILL_INVOICE.prev_bill_refno)
   * @return Integer the value
   */
  public Integer getPrevBillRefno () {
    return this.PrevBillRefno;
  }
  /** Change the field to not being actively set: PrevBillRefno (BILL_INVOICE.prev_bill_refno)
   */
  public void unsetPrevBillRefno () {
    this._PrevBillRefnoSet = false;
  }
  /** See if the field is actively set: PrevBillRefno (BILL_INVOICE.prev_bill_refno)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrevBillRefno () {
    return this._PrevBillRefnoSet;
  }
  /** set the fields value: PrevBillRefResets (BILL_INVOICE.prev_bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrevBillRefResets") 
  public void setPrevBillRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrevBillRefResets", "setPrevBillRefResets");
    }
    this.PrevBillRefResets = value;
    this._PrevBillRefResetsSet = true;
  }

  /** Retrieves the PrevBillRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrevBillRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevBillRefResets field
   */
   public String getPrevBillRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBillRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevBillRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getPrevBillRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevBillRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrevBillRefResets field from a formatted string
   *
   * @param _value the PrevBillRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevBillRefResets field
   */
   public void setPrevBillRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBillRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrevBillRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevBillRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevBillRefResetsFromFormattedString");
   }

  /** get the value of the field: PrevBillRefResets (BILL_INVOICE.prev_bill_ref_resets)
   * @return Integer the value
   */
  public Integer getPrevBillRefResets () {
    return this.PrevBillRefResets;
  }
  /** Change the field to not being actively set: PrevBillRefResets (BILL_INVOICE.prev_bill_ref_resets)
   */
  public void unsetPrevBillRefResets () {
    this._PrevBillRefResetsSet = false;
  }
  /** See if the field is actively set: PrevBillRefResets (BILL_INVOICE.prev_bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrevBillRefResets () {
    return this._PrevBillRefResetsSet;
  }
  /** set the fields value: PrevBalanceRefno (BILL_INVOICE.prev_balance_refno)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrevBalanceRefno") 
  public void setPrevBalanceRefno (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrevBalanceRefno", "setPrevBalanceRefno");
    }
    this.PrevBalanceRefno = value;
    this._PrevBalanceRefnoSet = true;
  }

  /** Retrieves the PrevBalanceRefno field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrevBalanceRefno field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevBalanceRefno field
   */
   public String getPrevBalanceRefnoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBalanceRefnoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevBalanceRefnoAsFormattedString");
       return fmtMgr.formatNumber(this.getPrevBalanceRefno(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevBalanceRefno");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevBalanceRefnoAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrevBalanceRefno field from a formatted string
   *
   * @param _value the PrevBalanceRefno field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevBalanceRefno field
   */
   public void setPrevBalanceRefnoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBalanceRefnoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrevBalanceRefno(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevBalanceRefno");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevBalanceRefnoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevBalanceRefnoFromFormattedString");
   }

  /** get the value of the field: PrevBalanceRefno (BILL_INVOICE.prev_balance_refno)
   * @return Integer the value
   */
  public Integer getPrevBalanceRefno () {
    return this.PrevBalanceRefno;
  }
  /** Change the field to not being actively set: PrevBalanceRefno (BILL_INVOICE.prev_balance_refno)
   */
  public void unsetPrevBalanceRefno () {
    this._PrevBalanceRefnoSet = false;
  }
  /** See if the field is actively set: PrevBalanceRefno (BILL_INVOICE.prev_balance_refno)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrevBalanceRefno () {
    return this._PrevBalanceRefnoSet;
  }
  /** set the fields value: PrevBalanceRefResets (BILL_INVOICE.prev_balance_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrevBalanceRefResets") 
  public void setPrevBalanceRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrevBalanceRefResets", "setPrevBalanceRefResets");
    }
    this.PrevBalanceRefResets = value;
    this._PrevBalanceRefResetsSet = true;
  }

  /** Retrieves the PrevBalanceRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrevBalanceRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevBalanceRefResets field
   */
   public String getPrevBalanceRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBalanceRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevBalanceRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getPrevBalanceRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevBalanceRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevBalanceRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrevBalanceRefResets field from a formatted string
   *
   * @param _value the PrevBalanceRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevBalanceRefResets field
   */
   public void setPrevBalanceRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBalanceRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrevBalanceRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevBalanceRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevBalanceRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevBalanceRefResetsFromFormattedString");
   }

  /** get the value of the field: PrevBalanceRefResets (BILL_INVOICE.prev_balance_ref_resets)
   * @return Integer the value
   */
  public Integer getPrevBalanceRefResets () {
    return this.PrevBalanceRefResets;
  }
  /** Change the field to not being actively set: PrevBalanceRefResets (BILL_INVOICE.prev_balance_ref_resets)
   */
  public void unsetPrevBalanceRefResets () {
    this._PrevBalanceRefResetsSet = false;
  }
  /** See if the field is actively set: PrevBalanceRefResets (BILL_INVOICE.prev_balance_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrevBalanceRefResets () {
    return this._PrevBalanceRefResetsSet;
  }
  /** set the fields value: Zip (BILL_INVOICE.zip)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Zip") 
  public void setZip (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 16))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Zip", "setZip");
    }
    this.Zip = value;
    this._ZipSet = true;
  }

  /** Retrieves the Zip field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Zip field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Zip field
   */
   public String getZipAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getZipAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getZipAsFormattedString");
       return fmtMgr.formatString(this.getZip());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Zip");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getZipAsFormattedString");
       throw x;
     }
   }
  /** Sets the Zip field from a formatted string
   *
   * @param _value the Zip field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Zip field
   */
   public void setZipFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getZipFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setZip(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Zip");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setZipFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setZipFromFormattedString");
   }

  /** get the value of the field: Zip (BILL_INVOICE.zip)
   * @return String the value
   */
  public String getZip () {
    return this.Zip;
  }
  /** Change the field to not being actively set: Zip (BILL_INVOICE.zip)
   */
  public void unsetZip () {
    this._ZipSet = false;
  }
  /** See if the field is actively set: Zip (BILL_INVOICE.zip)
   * @return boolean whether the field is actively set
   */
  public boolean issetZip () {
    return this._ZipSet;
  }
  /** set the fields value: FromDate (BILL_INVOICE.from_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FromDate") 
  public void setFromDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FromDate", "setFromDate");
    }
    this.FromDate = value;
    this._FromDateSet = true;
  }

  /** Retrieves the FromDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FromDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FromDate field
   */
   public String getFromDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFromDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFromDateAsFormattedString");
       return fmtMgr.formatDate(this.getFromDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FromDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFromDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the FromDate field from a formatted string
   *
   * @param _value the FromDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FromDate field
   */
   public void setFromDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFromDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFromDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FromDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFromDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFromDateFromFormattedString");
   }

  /**
   * Retrieves the FromDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FromDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the FromDate field
   */
  public String getFromDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFromDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFromDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getFromDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FromDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFromDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the FromDate field value from a formatted date/time string
   *
   * @param _value the FromDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FromDate field
   */
  public void setFromDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFromDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setFromDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FromDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFromDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: FromDate (BILL_INVOICE.from_date)
   * @return Date the value
   */
  public Date getFromDate () {
    return this.FromDate;
  }
  /** Change the field to not being actively set: FromDate (BILL_INVOICE.from_date)
   */
  public void unsetFromDate () {
    this._FromDateSet = false;
  }
  /** See if the field is actively set: FromDate (BILL_INVOICE.from_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetFromDate () {
    return this._FromDateSet;
  }
  /** set the fields value: ToDate (BILL_INVOICE.to_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ToDate") 
  public void setToDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ToDate", "setToDate");
    }
    this.ToDate = value;
    this._ToDateSet = true;
  }

  /** Retrieves the ToDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ToDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ToDate field
   */
   public String getToDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getToDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getToDateAsFormattedString");
       return fmtMgr.formatDate(this.getToDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ToDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getToDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ToDate field from a formatted string
   *
   * @param _value the ToDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ToDate field
   */
   public void setToDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getToDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setToDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ToDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setToDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setToDateFromFormattedString");
   }

  /**
   * Retrieves the ToDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ToDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ToDate field
   */
  public String getToDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getToDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getToDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getToDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ToDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getToDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ToDate field value from a formatted date/time string
   *
   * @param _value the ToDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ToDate field
   */
  public void setToDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setToDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setToDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ToDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setToDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ToDate (BILL_INVOICE.to_date)
   * @return Date the value
   */
  public Date getToDate () {
    return this.ToDate;
  }
  /** Change the field to not being actively set: ToDate (BILL_INVOICE.to_date)
   */
  public void unsetToDate () {
    this._ToDateSet = false;
  }
  /** See if the field is actively set: ToDate (BILL_INVOICE.to_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetToDate () {
    return this._ToDateSet;
  }
  /** set the fields value: NextToDate (BILL_INVOICE.next_to_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NextToDate") 
  public void setNextToDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NextToDate", "setNextToDate");
    }
    this.NextToDate = value;
    this._NextToDateSet = true;
  }

  /** Retrieves the NextToDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NextToDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NextToDate field
   */
   public String getNextToDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextToDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNextToDateAsFormattedString");
       return fmtMgr.formatDate(this.getNextToDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NextToDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNextToDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the NextToDate field from a formatted string
   *
   * @param _value the NextToDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NextToDate field
   */
   public void setNextToDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextToDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNextToDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NextToDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNextToDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNextToDateFromFormattedString");
   }

  /**
   * Retrieves the NextToDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NextToDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the NextToDate field
   */
  public String getNextToDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextToDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNextToDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getNextToDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextToDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNextToDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the NextToDate field value from a formatted date/time string
   *
   * @param _value the NextToDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NextToDate field
   */
  public void setNextToDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNextToDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setNextToDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextToDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNextToDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: NextToDate (BILL_INVOICE.next_to_date)
   * @return Date the value
   */
  public Date getNextToDate () {
    return this.NextToDate;
  }
  /** Change the field to not being actively set: NextToDate (BILL_INVOICE.next_to_date)
   */
  public void unsetNextToDate () {
    this._NextToDateSet = false;
  }
  /** See if the field is actively set: NextToDate (BILL_INVOICE.next_to_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetNextToDate () {
    return this._NextToDateSet;
  }
  /** set the fields value: PrepDate (BILL_INVOICE.prep_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrepDate") 
  public void setPrepDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrepDate", "setPrepDate");
    }
    this.PrepDate = value;
    this._PrepDateSet = true;
  }

  /** Retrieves the PrepDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrepDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepDate field
   */
   public String getPrepDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepDateAsFormattedString");
       return fmtMgr.formatDate(this.getPrepDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrepDate field from a formatted string
   *
   * @param _value the PrepDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepDate field
   */
   public void setPrepDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrepDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepDateFromFormattedString");
   }

  /**
   * Retrieves the PrepDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrepDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepDate field
   */
  public String getPrepDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPrepDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PrepDate field value from a formatted date/time string
   *
   * @param _value the PrepDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepDate field
   */
  public void setPrepDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPrepDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: PrepDate (BILL_INVOICE.prep_date)
   * @return Date the value
   */
  public Date getPrepDate () {
    return this.PrepDate;
  }
  /** Change the field to not being actively set: PrepDate (BILL_INVOICE.prep_date)
   */
  public void unsetPrepDate () {
    this._PrepDateSet = false;
  }
  /** See if the field is actively set: PrepDate (BILL_INVOICE.prep_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrepDate () {
    return this._PrepDateSet;
  }
  /** set the fields value: TaxDate (BILL_INVOICE.tax_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxDate") 
  public void setTaxDate (Date value) throws ServiceException
  {
    this.TaxDate = value;
    this._TaxDateSet = true;
  }

  /** Retrieves the TaxDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxDate field
   */
   public String getTaxDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxDateAsFormattedString");
       return fmtMgr.formatDate(this.getTaxDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxDate field from a formatted string
   *
   * @param _value the TaxDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxDate field
   */
   public void setTaxDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxDateFromFormattedString");
   }

  /**
   * Retrieves the TaxDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxDate field
   */
  public String getTaxDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getTaxDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TaxDate field value from a formatted date/time string
   *
   * @param _value the TaxDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxDate field
   */
  public void setTaxDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTaxDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: TaxDate (BILL_INVOICE.tax_date)
   * @return Date the value
   */
  public Date getTaxDate () {
    return this.TaxDate;
  }
  /** Change the field to not being actively set: TaxDate (BILL_INVOICE.tax_date)
   */
  public void unsetTaxDate () {
    this._TaxDateSet = false;
  }
  /** See if the field is actively set: TaxDate (BILL_INVOICE.tax_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxDate () {
    return this._TaxDateSet;
  }
  /** set the fields value: StatementDate (BILL_INVOICE.statement_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StatementDate") 
  public void setStatementDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StatementDate", "setStatementDate");
    }
    this.StatementDate = value;
    this._StatementDateSet = true;
  }

  /** Retrieves the StatementDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StatementDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementDate field
   */
   public String getStatementDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementDateAsFormattedString");
       return fmtMgr.formatDate(this.getStatementDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatementDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the StatementDate field from a formatted string
   *
   * @param _value the StatementDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatementDate field
   */
   public void setStatementDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatementDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatementDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatementDateFromFormattedString");
   }

  /**
   * Retrieves the StatementDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatementDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementDate field
   */
  public String getStatementDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getStatementDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the StatementDate field value from a formatted date/time string
   *
   * @param _value the StatementDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatementDate field
   */
  public void setStatementDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatementDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setStatementDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: StatementDate (BILL_INVOICE.statement_date)
   * @return Date the value
   */
  public Date getStatementDate () {
    return this.StatementDate;
  }
  /** Change the field to not being actively set: StatementDate (BILL_INVOICE.statement_date)
   */
  public void unsetStatementDate () {
    this._StatementDateSet = false;
  }
  /** See if the field is actively set: StatementDate (BILL_INVOICE.statement_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatementDate () {
    return this._StatementDateSet;
  }
  /** set the fields value: PaymentDueDate (BILL_INVOICE.payment_due_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PaymentDueDate") 
  public void setPaymentDueDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PaymentDueDate", "setPaymentDueDate");
    }
    this.PaymentDueDate = value;
    this._PaymentDueDateSet = true;
  }

  /** Retrieves the PaymentDueDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PaymentDueDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentDueDate field
   */
   public String getPaymentDueDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentDueDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentDueDateAsFormattedString");
       return fmtMgr.formatDate(this.getPaymentDueDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PaymentDueDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentDueDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the PaymentDueDate field from a formatted string
   *
   * @param _value the PaymentDueDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PaymentDueDate field
   */
   public void setPaymentDueDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentDueDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPaymentDueDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PaymentDueDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentDueDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPaymentDueDateFromFormattedString");
   }

  /**
   * Retrieves the PaymentDueDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PaymentDueDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentDueDate field
   */
  public String getPaymentDueDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentDueDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentDueDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPaymentDueDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentDueDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentDueDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PaymentDueDate field value from a formatted date/time string
   *
   * @param _value the PaymentDueDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PaymentDueDate field
   */
  public void setPaymentDueDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPaymentDueDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPaymentDueDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentDueDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentDueDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: PaymentDueDate (BILL_INVOICE.payment_due_date)
   * @return Date the value
   */
  public Date getPaymentDueDate () {
    return this.PaymentDueDate;
  }
  /** Change the field to not being actively set: PaymentDueDate (BILL_INVOICE.payment_due_date)
   */
  public void unsetPaymentDueDate () {
    this._PaymentDueDateSet = false;
  }
  /** See if the field is actively set: PaymentDueDate (BILL_INVOICE.payment_due_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetPaymentDueDate () {
    return this._PaymentDueDateSet;
  }
  /** set the fields value: PrevPpdd (BILL_INVOICE.prev_ppdd)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrevPpdd") 
  public void setPrevPpdd (Date value) throws ServiceException
  {
    this.PrevPpdd = value;
    this._PrevPpddSet = true;
  }

  /** Retrieves the PrevPpdd field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrevPpdd field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevPpdd field
   */
   public String getPrevPpddAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevPpddAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevPpddAsFormattedString");
       return fmtMgr.formatDate(this.getPrevPpdd(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevPpdd");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevPpddAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrevPpdd field from a formatted string
   *
   * @param _value the PrevPpdd field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevPpdd field
   */
   public void setPrevPpddFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevPpddFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrevPpdd(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevPpdd");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevPpddFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevPpddFromFormattedString");
   }

  /**
   * Retrieves the PrevPpdd field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevPpdd field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevPpdd field
   */
  public String getPrevPpddAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevPpddAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevPpddAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPrevPpdd(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevPpdd");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevPpddAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PrevPpdd field value from a formatted date/time string
   *
   * @param _value the PrevPpdd field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevPpdd field
   */
  public void setPrevPpddFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevPpddFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPrevPpdd(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevPpdd");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevPpddFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: PrevPpdd (BILL_INVOICE.prev_ppdd)
   * @return Date the value
   */
  public Date getPrevPpdd () {
    return this.PrevPpdd;
  }
  /** Change the field to not being actively set: PrevPpdd (BILL_INVOICE.prev_ppdd)
   */
  public void unsetPrevPpdd () {
    this._PrevPpddSet = false;
  }
  /** See if the field is actively set: PrevPpdd (BILL_INVOICE.prev_ppdd)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrevPpdd () {
    return this._PrevPpddSet;
  }
  /** set the fields value: PrevCutoffDate (BILL_INVOICE.prev_cutoff_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrevCutoffDate") 
  public void setPrevCutoffDate (Date value) throws ServiceException
  {
    this.PrevCutoffDate = value;
    this._PrevCutoffDateSet = true;
  }

  /** Retrieves the PrevCutoffDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrevCutoffDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevCutoffDate field
   */
   public String getPrevCutoffDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevCutoffDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevCutoffDateAsFormattedString");
       return fmtMgr.formatDate(this.getPrevCutoffDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevCutoffDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevCutoffDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrevCutoffDate field from a formatted string
   *
   * @param _value the PrevCutoffDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevCutoffDate field
   */
   public void setPrevCutoffDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevCutoffDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrevCutoffDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevCutoffDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevCutoffDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevCutoffDateFromFormattedString");
   }

  /**
   * Retrieves the PrevCutoffDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevCutoffDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevCutoffDate field
   */
  public String getPrevCutoffDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevCutoffDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevCutoffDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPrevCutoffDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevCutoffDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevCutoffDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PrevCutoffDate field value from a formatted date/time string
   *
   * @param _value the PrevCutoffDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevCutoffDate field
   */
  public void setPrevCutoffDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevCutoffDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPrevCutoffDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevCutoffDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevCutoffDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: PrevCutoffDate (BILL_INVOICE.prev_cutoff_date)
   * @return Date the value
   */
  public Date getPrevCutoffDate () {
    return this.PrevCutoffDate;
  }
  /** Change the field to not being actively set: PrevCutoffDate (BILL_INVOICE.prev_cutoff_date)
   */
  public void unsetPrevCutoffDate () {
    this._PrevCutoffDateSet = false;
  }
  /** See if the field is actively set: PrevCutoffDate (BILL_INVOICE.prev_cutoff_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrevCutoffDate () {
    return this._PrevCutoffDateSet;
  }
  /** set the fields value: BillPeriod (BILL_INVOICE.bill_period)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillPeriod") 
  public void setBillPeriod (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillPeriod", "setBillPeriod");
    }
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillPeriod", "setBillPeriod");
    }
    this.BillPeriod = value;
    this._BillPeriodSet = true;
  }

  /** Retrieves the BillPeriod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillPeriod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillPeriod field
   */
   public String getBillPeriodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillPeriodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillPeriodAsFormattedString");
       return fmtMgr.formatString(this.getBillPeriod());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillPeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillPeriodAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillPeriod field from a formatted string
   *
   * @param _value the BillPeriod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillPeriod field
   */
   public void setBillPeriodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillPeriodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillPeriod(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillPeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillPeriodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillPeriodFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated BillPeriod field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillPeriod field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillPeriod field
   */

  public String getBillPeriodDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillPeriodDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillPeriodEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillPeriodDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBillPeriod()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillPeriod");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillPeriodDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BillPeriod field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BillPeriod field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillPeriod field
   */
  public Enumeration getBillPeriodEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillPeriodEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("BillPeriod", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillPeriodEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillPeriod");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillPeriodEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BillPeriod field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBillPeriodFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillPeriodFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillPeriodEnumeration(_locale);
      this.setBillPeriod((String)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), String.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillPeriod");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillPeriodFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillPeriodFromDisplayValue");
  }

  /** get the value of the field: BillPeriod (BILL_INVOICE.bill_period)
   * @return String the value
   */
  public String getBillPeriod () {
    return this.BillPeriod;
  }
  /** Change the field to not being actively set: BillPeriod (BILL_INVOICE.bill_period)
   */
  public void unsetBillPeriod () {
    this._BillPeriodSet = false;
  }
  /** See if the field is actively set: BillPeriod (BILL_INVOICE.bill_period)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillPeriod () {
    return this._BillPeriodSet;
  }
  /** set the fields value: PayMethod (BILL_INVOICE.pay_method)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PayMethod") 
  public void setPayMethod (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PayMethod", "setPayMethod");
    }
    this.PayMethod = value;
    this._PayMethodSet = true;
  }

  /** Retrieves the PayMethod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PayMethod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayMethod field
   */
   public String getPayMethodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayMethodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayMethodAsFormattedString");
       return fmtMgr.formatNumber(this.getPayMethod(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayMethod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayMethodAsFormattedString");
       throw x;
     }
   }
  /** Sets the PayMethod field from a formatted string
   *
   * @param _value the PayMethod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PayMethod field
   */
   public void setPayMethodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayMethodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPayMethod(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayMethod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayMethodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayMethodFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated PayMethod field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the PayMethod field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PayMethod field
   */

  public String getPayMethodDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayMethodDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPayMethodEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayMethodDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getPayMethod()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayMethod");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayMethodDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated PayMethod field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the PayMethod field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PayMethod field
   */
  public Enumeration getPayMethodEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayMethodEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("PayMethod", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayMethodEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayMethod");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayMethodEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated PayMethod field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setPayMethodFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayMethodFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPayMethodEnumeration(_locale);
      this.setPayMethod((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayMethod");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayMethodFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayMethodFromDisplayValue");
  }

  /** get the value of the field: PayMethod (BILL_INVOICE.pay_method)
   * @return Integer the value
   */
  public Integer getPayMethod () {
    return this.PayMethod;
  }
  /** Change the field to not being actively set: PayMethod (BILL_INVOICE.pay_method)
   */
  public void unsetPayMethod () {
    this._PayMethodSet = false;
  }
  /** See if the field is actively set: PayMethod (BILL_INVOICE.pay_method)
   * @return boolean whether the field is actively set
   */
  public boolean issetPayMethod () {
    return this._PayMethodSet;
  }
  /** set the fields value: BillDispMeth (BILL_INVOICE.bill_disp_meth)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillDispMeth") 
  public void setBillDispMeth (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillDispMeth", "setBillDispMeth");
    }
    this.BillDispMeth = value;
    this._BillDispMethSet = true;
  }

  /** Retrieves the BillDispMeth field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillDispMeth field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillDispMeth field
   */
   public String getBillDispMethAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDispMethAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDispMethAsFormattedString");
       return fmtMgr.formatNumber(this.getBillDispMeth(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillDispMeth");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillDispMethAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillDispMeth field from a formatted string
   *
   * @param _value the BillDispMeth field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillDispMeth field
   */
   public void setBillDispMethFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDispMethFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillDispMeth(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillDispMeth");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillDispMethFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillDispMethFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated BillDispMeth field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillDispMeth field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillDispMeth field
   */

  public String getBillDispMethDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDispMethDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillDispMethEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDispMethDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBillDispMeth()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillDispMeth");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillDispMethDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BillDispMeth field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BillDispMeth field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillDispMeth field
   */
  public Enumeration getBillDispMethEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDispMethEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("BillDispatchMethod", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDispMethEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillDispMeth");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillDispMethEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BillDispMeth field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBillDispMethFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillDispMethFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillDispMethEnumeration(_locale);
      this.setBillDispMeth((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillDispMeth");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillDispMethFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillDispMethFromDisplayValue");
  }

  /** get the value of the field: BillDispMeth (BILL_INVOICE.bill_disp_meth)
   * @return Integer the value
   */
  public Integer getBillDispMeth () {
    return this.BillDispMeth;
  }
  /** Change the field to not being actively set: BillDispMeth (BILL_INVOICE.bill_disp_meth)
   */
  public void unsetBillDispMeth () {
    this._BillDispMethSet = false;
  }
  /** See if the field is actively set: BillDispMeth (BILL_INVOICE.bill_disp_meth)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillDispMeth () {
    return this._BillDispMethSet;
  }
  /** set the fields value: TaxJournalStatus (BILL_INVOICE.tax_journal_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxJournalStatus") 
  public void setTaxJournalStatus (Integer value) throws ServiceException
  {
    this.TaxJournalStatus = value;
    this._TaxJournalStatusSet = true;
  }

  /** Retrieves the TaxJournalStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxJournalStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxJournalStatus field
   */
   public String getTaxJournalStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxJournalStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxJournalStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxJournalStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxJournalStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxJournalStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxJournalStatus field from a formatted string
   *
   * @param _value the TaxJournalStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxJournalStatus field
   */
   public void setTaxJournalStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxJournalStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxJournalStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxJournalStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxJournalStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxJournalStatusFromFormattedString");
   }

  /** get the value of the field: TaxJournalStatus (BILL_INVOICE.tax_journal_status)
   * @return Integer the value
   */
  public Integer getTaxJournalStatus () {
    return this.TaxJournalStatus;
  }
  /** Change the field to not being actively set: TaxJournalStatus (BILL_INVOICE.tax_journal_status)
   */
  public void unsetTaxJournalStatus () {
    this._TaxJournalStatusSet = false;
  }
  /** See if the field is actively set: TaxJournalStatus (BILL_INVOICE.tax_journal_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxJournalStatus () {
    return this._TaxJournalStatusSet;
  }
  /** set the fields value: AccountStatus (BILL_INVOICE.account_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountStatus") 
  public void setAccountStatus (Integer value) throws ServiceException
  {
    this.AccountStatus = value;
    this._AccountStatusSet = true;
  }

  /** Retrieves the AccountStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountStatus field
   */
   public String getAccountStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountStatus field from a formatted string
   *
   * @param _value the AccountStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountStatus field
   */
   public void setAccountStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountStatusFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated AccountStatus field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccountStatus field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountStatus field
   */

  public String getAccountStatusDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountStatusDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountStatusEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountStatusDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getAccountStatus()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountStatus");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountStatusDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated AccountStatus field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the AccountStatus field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountStatus field
   */
  public Enumeration getAccountStatusEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountStatusEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("AccountStatus", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountStatusEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountStatus");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountStatusEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated AccountStatus field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setAccountStatusFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountStatusFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountStatusEnumeration(_locale);
      this.setAccountStatus((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountStatus");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountStatusFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountStatusFromDisplayValue");
  }

  /** get the value of the field: AccountStatus (BILL_INVOICE.account_status)
   * @return Integer the value
   */
  public Integer getAccountStatus () {
    return this.AccountStatus;
  }
  /** Change the field to not being actively set: AccountStatus (BILL_INVOICE.account_status)
   */
  public void unsetAccountStatus () {
    this._AccountStatusSet = false;
  }
  /** See if the field is actively set: AccountStatus (BILL_INVOICE.account_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountStatus () {
    return this._AccountStatusSet;
  }
  /** set the fields value: ImageReq (BILL_INVOICE.image_req)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ImageReq") 
  public void setImageReq (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ImageReq", "setImageReq");
    }
    this.ImageReq = value;
    this._ImageReqSet = true;
  }

  /** Retrieves the ImageReq field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ImageReq field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ImageReq field
   */
   public String getImageReqAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getImageReqAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getImageReqAsFormattedString");
       return fmtMgr.formatBoolean(this.getImageReq());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ImageReq");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getImageReqAsFormattedString");
       throw x;
     }
   }
  /** Sets the ImageReq field from a formatted string
   *
   * @param _value the ImageReq field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ImageReq field
   */
   public void setImageReqFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getImageReqFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setImageReq(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ImageReq");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setImageReqFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setImageReqFromFormattedString");
   }

  /** get the value of the field: ImageReq (BILL_INVOICE.image_req)
   * @return Boolean the value
   */
  public Boolean getImageReq () {
    return this.ImageReq;
  }
  /** Change the field to not being actively set: ImageReq (BILL_INVOICE.image_req)
   */
  public void unsetImageReq () {
    this._ImageReqSet = false;
  }
  /** See if the field is actively set: ImageReq (BILL_INVOICE.image_req)
   * @return boolean whether the field is actively set
   */
  public boolean issetImageReq () {
    return this._ImageReqSet;
  }
  /** set the fields value: ImageDone (BILL_INVOICE.image_done)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ImageDone") 
  public void setImageDone (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ImageDone", "setImageDone");
    }
    this.ImageDone = value;
    this._ImageDoneSet = true;
  }

  /** Retrieves the ImageDone field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ImageDone field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ImageDone field
   */
   public String getImageDoneAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getImageDoneAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getImageDoneAsFormattedString");
       return fmtMgr.formatBoolean(this.getImageDone());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ImageDone");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getImageDoneAsFormattedString");
       throw x;
     }
   }
  /** Sets the ImageDone field from a formatted string
   *
   * @param _value the ImageDone field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ImageDone field
   */
   public void setImageDoneFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getImageDoneFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setImageDone(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ImageDone");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setImageDoneFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setImageDoneFromFormattedString");
   }

  /** get the value of the field: ImageDone (BILL_INVOICE.image_done)
   * @return Boolean the value
   */
  public Boolean getImageDone () {
    return this.ImageDone;
  }
  /** Change the field to not being actively set: ImageDone (BILL_INVOICE.image_done)
   */
  public void unsetImageDone () {
    this._ImageDoneSet = false;
  }
  /** See if the field is actively set: ImageDone (BILL_INVOICE.image_done)
   * @return boolean whether the field is actively set
   */
  public boolean issetImageDone () {
    return this._ImageDoneSet;
  }
  /** set the fields value: SpecialCode (BILL_INVOICE.special_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SpecialCode") 
  public void setSpecialCode (Integer value) throws ServiceException
  {
    this.SpecialCode = value;
    this._SpecialCodeSet = true;
  }

  /** Retrieves the SpecialCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SpecialCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SpecialCode field
   */
   public String getSpecialCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSpecialCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSpecialCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getSpecialCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SpecialCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSpecialCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the SpecialCode field from a formatted string
   *
   * @param _value the SpecialCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SpecialCode field
   */
   public void setSpecialCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSpecialCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSpecialCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SpecialCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSpecialCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSpecialCodeFromFormattedString");
   }

  /** get the value of the field: SpecialCode (BILL_INVOICE.special_code)
   * @return Integer the value
   */
  public Integer getSpecialCode () {
    return this.SpecialCode;
  }
  /** Change the field to not being actively set: SpecialCode (BILL_INVOICE.special_code)
   */
  public void unsetSpecialCode () {
    this._SpecialCodeSet = false;
  }
  /** See if the field is actively set: SpecialCode (BILL_INVOICE.special_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetSpecialCode () {
    return this._SpecialCodeSet;
  }
  /** set the fields value: PrepTask (BILL_INVOICE.prep_task)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrepTask") 
  public void setPrepTask (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrepTask", "setPrepTask");
    }
    if (value != null && !DataHelper.validLength (value, 16))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PrepTask", "setPrepTask");
    }
    this.PrepTask = value;
    this._PrepTaskSet = true;
  }

  /** Retrieves the PrepTask field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrepTask field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepTask field
   */
   public String getPrepTaskAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepTaskAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepTaskAsFormattedString");
       return fmtMgr.formatString(this.getPrepTask());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepTask");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepTaskAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrepTask field from a formatted string
   *
   * @param _value the PrepTask field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepTask field
   */
   public void setPrepTaskFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepTaskFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrepTask(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepTask");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepTaskFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepTaskFromFormattedString");
   }

  /** get the value of the field: PrepTask (BILL_INVOICE.prep_task)
   * @return String the value
   */
  public String getPrepTask () {
    return this.PrepTask;
  }
  /** Change the field to not being actively set: PrepTask (BILL_INVOICE.prep_task)
   */
  public void unsetPrepTask () {
    this._PrepTaskSet = false;
  }
  /** See if the field is actively set: PrepTask (BILL_INVOICE.prep_task)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrepTask () {
    return this._PrepTaskSet;
  }
  /** set the fields value: PrepStatus (BILL_INVOICE.prep_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrepStatus") 
  public void setPrepStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrepStatus", "setPrepStatus");
    }
    this.PrepStatus = value;
    this._PrepStatusSet = true;
  }

  /** Retrieves the PrepStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrepStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepStatus field
   */
   public String getPrepStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getPrepStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrepStatus field from a formatted string
   *
   * @param _value the PrepStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepStatus field
   */
   public void setPrepStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrepStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepStatusFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated PrepStatus field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the PrepStatus field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PrepStatus field
   */

  public String getPrepStatusDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepStatusDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPrepStatusEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepStatusDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getPrepStatus()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepStatus");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepStatusDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated PrepStatus field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the PrepStatus field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PrepStatus field
   */
  public Enumeration getPrepStatusEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepStatusEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("BillPrepStatus", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepStatusEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepStatus");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepStatusEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated PrepStatus field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setPrepStatusFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepStatusFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPrepStatusEnumeration(_locale);
      this.setPrepStatus((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepStatus");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepStatusFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepStatusFromDisplayValue");
  }

  /** get the value of the field: PrepStatus (BILL_INVOICE.prep_status)
   * @return Integer the value
   */
  public Integer getPrepStatus () {
    return this.PrepStatus;
  }
  /** Change the field to not being actively set: PrepStatus (BILL_INVOICE.prep_status)
   */
  public void unsetPrepStatus () {
    this._PrepStatusSet = false;
  }
  /** See if the field is actively set: PrepStatus (BILL_INVOICE.prep_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrepStatus () {
    return this._PrepStatusSet;
  }
  /** set the fields value: FormatStatus (BILL_INVOICE.format_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FormatStatus") 
  public void setFormatStatus (Integer value) throws ServiceException
  {
    this.FormatStatus = value;
    this._FormatStatusSet = true;
  }

  /** Retrieves the FormatStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FormatStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FormatStatus field
   */
   public String getFormatStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFormatStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFormatStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getFormatStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FormatStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFormatStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the FormatStatus field from a formatted string
   *
   * @param _value the FormatStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FormatStatus field
   */
   public void setFormatStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFormatStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFormatStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FormatStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFormatStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFormatStatusFromFormattedString");
   }

  /** get the value of the field: FormatStatus (BILL_INVOICE.format_status)
   * @return Integer the value
   */
  public Integer getFormatStatus () {
    return this.FormatStatus;
  }
  /** Change the field to not being actively set: FormatStatus (BILL_INVOICE.format_status)
   */
  public void unsetFormatStatus () {
    this._FormatStatusSet = false;
  }
  /** See if the field is actively set: FormatStatus (BILL_INVOICE.format_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetFormatStatus () {
    return this._FormatStatusSet;
  }
  /** set the fields value: DispatchCount (BILL_INVOICE.dispatch_count)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DispatchCount") 
  public void setDispatchCount (Integer value) throws ServiceException
  {
    this.DispatchCount = value;
    this._DispatchCountSet = true;
  }

  /** Retrieves the DispatchCount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DispatchCount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DispatchCount field
   */
   public String getDispatchCountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDispatchCountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDispatchCountAsFormattedString");
       return fmtMgr.formatNumber(this.getDispatchCount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DispatchCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDispatchCountAsFormattedString");
       throw x;
     }
   }
  /** Sets the DispatchCount field from a formatted string
   *
   * @param _value the DispatchCount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DispatchCount field
   */
   public void setDispatchCountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDispatchCountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDispatchCount(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DispatchCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDispatchCountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDispatchCountFromFormattedString");
   }

  /** get the value of the field: DispatchCount (BILL_INVOICE.dispatch_count)
   * @return Integer the value
   */
  public Integer getDispatchCount () {
    return this.DispatchCount;
  }
  /** Change the field to not being actively set: DispatchCount (BILL_INVOICE.dispatch_count)
   */
  public void unsetDispatchCount () {
    this._DispatchCountSet = false;
  }
  /** See if the field is actively set: DispatchCount (BILL_INVOICE.dispatch_count)
   * @return boolean whether the field is actively set
   */
  public boolean issetDispatchCount () {
    return this._DispatchCountSet;
  }
  /** set the fields value: DispatchDate (BILL_INVOICE.dispatch_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DispatchDate") 
  public void setDispatchDate (Date value) throws ServiceException
  {
    this.DispatchDate = value;
    this._DispatchDateSet = true;
  }

  /** Retrieves the DispatchDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DispatchDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DispatchDate field
   */
   public String getDispatchDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDispatchDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDispatchDateAsFormattedString");
       return fmtMgr.formatDate(this.getDispatchDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DispatchDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDispatchDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the DispatchDate field from a formatted string
   *
   * @param _value the DispatchDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DispatchDate field
   */
   public void setDispatchDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDispatchDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDispatchDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DispatchDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDispatchDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDispatchDateFromFormattedString");
   }

  /**
   * Retrieves the DispatchDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DispatchDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DispatchDate field
   */
  public String getDispatchDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDispatchDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDispatchDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getDispatchDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DispatchDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDispatchDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DispatchDate field value from a formatted date/time string
   *
   * @param _value the DispatchDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DispatchDate field
   */
  public void setDispatchDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDispatchDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDispatchDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DispatchDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDispatchDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: DispatchDate (BILL_INVOICE.dispatch_date)
   * @return Date the value
   */
  public Date getDispatchDate () {
    return this.DispatchDate;
  }
  /** Change the field to not being actively set: DispatchDate (BILL_INVOICE.dispatch_date)
   */
  public void unsetDispatchDate () {
    this._DispatchDateSet = false;
  }
  /** See if the field is actively set: DispatchDate (BILL_INVOICE.dispatch_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetDispatchDate () {
    return this._DispatchDateSet;
  }
  /** set the fields value: FileName (BILL_INVOICE.file_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FileName") 
  public void setFileName (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FileName", "setFileName");
    }
    this.FileName = value;
    this._FileNameSet = true;
  }

  /** Retrieves the FileName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FileName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FileName field
   */
   public String getFileNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFileNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFileNameAsFormattedString");
       return fmtMgr.formatString(this.getFileName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FileName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFileNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the FileName field from a formatted string
   *
   * @param _value the FileName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FileName field
   */
   public void setFileNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFileNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFileName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FileName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFileNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFileNameFromFormattedString");
   }

  /** get the value of the field: FileName (BILL_INVOICE.file_name)
   * @return String the value
   */
  public String getFileName () {
    return this.FileName;
  }
  /** Change the field to not being actively set: FileName (BILL_INVOICE.file_name)
   */
  public void unsetFileName () {
    this._FileNameSet = false;
  }
  /** See if the field is actively set: FileName (BILL_INVOICE.file_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetFileName () {
    return this._FileNameSet;
  }
  /** set the fields value: StartOffset (BILL_INVOICE.start_offset)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StartOffset") 
  public void setStartOffset (Integer value) throws ServiceException
  {
    this.StartOffset = value;
    this._StartOffsetSet = true;
  }

  /** Retrieves the StartOffset field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StartOffset field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartOffset field
   */
   public String getStartOffsetAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartOffsetAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartOffsetAsFormattedString");
       return fmtMgr.formatNumber(this.getStartOffset(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StartOffset");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartOffsetAsFormattedString");
       throw x;
     }
   }
  /** Sets the StartOffset field from a formatted string
   *
   * @param _value the StartOffset field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StartOffset field
   */
   public void setStartOffsetFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartOffsetFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStartOffset(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StartOffset");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartOffsetFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStartOffsetFromFormattedString");
   }

  /** get the value of the field: StartOffset (BILL_INVOICE.start_offset)
   * @return Integer the value
   */
  public Integer getStartOffset () {
    return this.StartOffset;
  }
  /** Change the field to not being actively set: StartOffset (BILL_INVOICE.start_offset)
   */
  public void unsetStartOffset () {
    this._StartOffsetSet = false;
  }
  /** See if the field is actively set: StartOffset (BILL_INVOICE.start_offset)
   * @return boolean whether the field is actively set
   */
  public boolean issetStartOffset () {
    return this._StartOffsetSet;
  }
  /** set the fields value: EndOffset (BILL_INVOICE.end_offset)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EndOffset") 
  public void setEndOffset (Integer value) throws ServiceException
  {
    this.EndOffset = value;
    this._EndOffsetSet = true;
  }

  /** Retrieves the EndOffset field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EndOffset field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EndOffset field
   */
   public String getEndOffsetAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEndOffsetAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEndOffsetAsFormattedString");
       return fmtMgr.formatNumber(this.getEndOffset(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EndOffset");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEndOffsetAsFormattedString");
       throw x;
     }
   }
  /** Sets the EndOffset field from a formatted string
   *
   * @param _value the EndOffset field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EndOffset field
   */
   public void setEndOffsetFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEndOffsetFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEndOffset(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EndOffset");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEndOffsetFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEndOffsetFromFormattedString");
   }

  /** get the value of the field: EndOffset (BILL_INVOICE.end_offset)
   * @return Integer the value
   */
  public Integer getEndOffset () {
    return this.EndOffset;
  }
  /** Change the field to not being actively set: EndOffset (BILL_INVOICE.end_offset)
   */
  public void unsetEndOffset () {
    this._EndOffsetSet = false;
  }
  /** See if the field is actively set: EndOffset (BILL_INVOICE.end_offset)
   * @return boolean whether the field is actively set
   */
  public boolean issetEndOffset () {
    return this._EndOffsetSet;
  }
  /** set the fields value: PageCount (BILL_INVOICE.page_count)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PageCount") 
  public void setPageCount (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PageCount", "setPageCount");
    }
    this.PageCount = value;
    this._PageCountSet = true;
  }

  /** Retrieves the PageCount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PageCount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PageCount field
   */
   public String getPageCountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPageCountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPageCountAsFormattedString");
       return fmtMgr.formatNumber(this.getPageCount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PageCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPageCountAsFormattedString");
       throw x;
     }
   }
  /** Sets the PageCount field from a formatted string
   *
   * @param _value the PageCount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PageCount field
   */
   public void setPageCountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPageCountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPageCount(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PageCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPageCountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPageCountFromFormattedString");
   }

  /** get the value of the field: PageCount (BILL_INVOICE.page_count)
   * @return Integer the value
   */
  public Integer getPageCount () {
    return this.PageCount;
  }
  /** Change the field to not being actively set: PageCount (BILL_INVOICE.page_count)
   */
  public void unsetPageCount () {
    this._PageCountSet = false;
  }
  /** See if the field is actively set: PageCount (BILL_INVOICE.page_count)
   * @return boolean whether the field is actively set
   */
  public boolean issetPageCount () {
    return this._PageCountSet;
  }
  /** set the fields value: BillHoldCode (BILL_INVOICE.bill_hold_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillHoldCode") 
  public void setBillHoldCode (Integer value) throws ServiceException
  {
    this.BillHoldCode = value;
    this._BillHoldCodeSet = true;
  }

  /** Retrieves the BillHoldCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillHoldCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillHoldCode field
   */
   public String getBillHoldCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillHoldCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillHoldCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getBillHoldCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillHoldCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillHoldCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillHoldCode field from a formatted string
   *
   * @param _value the BillHoldCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillHoldCode field
   */
   public void setBillHoldCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillHoldCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillHoldCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillHoldCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillHoldCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillHoldCodeFromFormattedString");
   }

  /** get the value of the field: BillHoldCode (BILL_INVOICE.bill_hold_code)
   * @return Integer the value
   */
  public Integer getBillHoldCode () {
    return this.BillHoldCode;
  }
  /** Change the field to not being actively set: BillHoldCode (BILL_INVOICE.bill_hold_code)
   */
  public void unsetBillHoldCode () {
    this._BillHoldCodeSet = false;
  }
  /** See if the field is actively set: BillHoldCode (BILL_INVOICE.bill_hold_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillHoldCode () {
    return this._BillHoldCodeSet;
  }
  /** set the fields value: PrepErrorCode (BILL_INVOICE.prep_error_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrepErrorCode") 
  public void setPrepErrorCode (Integer value) throws ServiceException
  {
    this.PrepErrorCode = value;
    this._PrepErrorCodeSet = true;
  }

  /** Retrieves the PrepErrorCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrepErrorCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepErrorCode field
   */
   public String getPrepErrorCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepErrorCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepErrorCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getPrepErrorCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepErrorCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepErrorCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrepErrorCode field from a formatted string
   *
   * @param _value the PrepErrorCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepErrorCode field
   */
   public void setPrepErrorCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepErrorCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrepErrorCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepErrorCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepErrorCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepErrorCodeFromFormattedString");
   }

  /** get the value of the field: PrepErrorCode (BILL_INVOICE.prep_error_code)
   * @return Integer the value
   */
  public Integer getPrepErrorCode () {
    return this.PrepErrorCode;
  }
  /** Change the field to not being actively set: PrepErrorCode (BILL_INVOICE.prep_error_code)
   */
  public void unsetPrepErrorCode () {
    this._PrepErrorCodeSet = false;
  }
  /** See if the field is actively set: PrepErrorCode (BILL_INVOICE.prep_error_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrepErrorCode () {
    return this._PrepErrorCodeSet;
  }
  /** set the fields value: FormatErrorCode (BILL_INVOICE.format_error_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FormatErrorCode") 
  public void setFormatErrorCode (Integer value) throws ServiceException
  {
    this.FormatErrorCode = value;
    this._FormatErrorCodeSet = true;
  }

  /** Retrieves the FormatErrorCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FormatErrorCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FormatErrorCode field
   */
   public String getFormatErrorCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFormatErrorCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFormatErrorCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getFormatErrorCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FormatErrorCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFormatErrorCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the FormatErrorCode field from a formatted string
   *
   * @param _value the FormatErrorCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FormatErrorCode field
   */
   public void setFormatErrorCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFormatErrorCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFormatErrorCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FormatErrorCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFormatErrorCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFormatErrorCodeFromFormattedString");
   }

  /** get the value of the field: FormatErrorCode (BILL_INVOICE.format_error_code)
   * @return Integer the value
   */
  public Integer getFormatErrorCode () {
    return this.FormatErrorCode;
  }
  /** Change the field to not being actively set: FormatErrorCode (BILL_INVOICE.format_error_code)
   */
  public void unsetFormatErrorCode () {
    this._FormatErrorCodeSet = false;
  }
  /** See if the field is actively set: FormatErrorCode (BILL_INVOICE.format_error_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetFormatErrorCode () {
    return this._FormatErrorCodeSet;
  }
  /** set the fields value: BackoutStatus (BILL_INVOICE.backout_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BackoutStatus") 
  public void setBackoutStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BackoutStatus", "setBackoutStatus");
    }
    this.BackoutStatus = value;
    this._BackoutStatusSet = true;
  }

  /** Retrieves the BackoutStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BackoutStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BackoutStatus field
   */
   public String getBackoutStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBackoutStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBackoutStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getBackoutStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BackoutStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBackoutStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the BackoutStatus field from a formatted string
   *
   * @param _value the BackoutStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BackoutStatus field
   */
   public void setBackoutStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBackoutStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBackoutStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BackoutStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBackoutStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBackoutStatusFromFormattedString");
   }

  /** get the value of the field: BackoutStatus (BILL_INVOICE.backout_status)
   * @return Integer the value
   */
  public Integer getBackoutStatus () {
    return this.BackoutStatus;
  }
  /** Change the field to not being actively set: BackoutStatus (BILL_INVOICE.backout_status)
   */
  public void unsetBackoutStatus () {
    this._BackoutStatusSet = false;
  }
  /** See if the field is actively set: BackoutStatus (BILL_INVOICE.backout_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetBackoutStatus () {
    return this._BackoutStatusSet;
  }
  /** set the fields value: CopyType (BILL_INVOICE.copy_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CopyType") 
  public void setCopyType (Integer value) throws ServiceException
  {
    this.CopyType = value;
    this._CopyTypeSet = true;
  }

  /** Retrieves the CopyType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CopyType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CopyType field
   */
   public String getCopyTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCopyTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCopyTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getCopyType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CopyType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCopyTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CopyType field from a formatted string
   *
   * @param _value the CopyType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CopyType field
   */
   public void setCopyTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCopyTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCopyType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CopyType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCopyTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCopyTypeFromFormattedString");
   }

  /** get the value of the field: CopyType (BILL_INVOICE.copy_type)
   * @return Integer the value
   */
  public Integer getCopyType () {
    return this.CopyType;
  }
  /** Change the field to not being actively set: CopyType (BILL_INVOICE.copy_type)
   */
  public void unsetCopyType () {
    this._CopyTypeSet = false;
  }
  /** See if the field is actively set: CopyType (BILL_INVOICE.copy_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetCopyType () {
    return this._CopyTypeSet;
  }
  /** set the fields value: OrigBillRefno (BILL_INVOICE.orig_bill_refno)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigBillRefno") 
  public void setOrigBillRefno (Integer value) throws ServiceException
  {
    this.OrigBillRefno = value;
    this._OrigBillRefnoSet = true;
  }

  /** Retrieves the OrigBillRefno field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigBillRefno field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBillRefno field
   */
   public String getOrigBillRefnoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefnoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBillRefnoAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigBillRefno(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBillRefno");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBillRefnoAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigBillRefno field from a formatted string
   *
   * @param _value the OrigBillRefno field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigBillRefno field
   */
   public void setOrigBillRefnoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefnoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigBillRefno(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBillRefno");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBillRefnoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBillRefnoFromFormattedString");
   }

  /** get the value of the field: OrigBillRefno (BILL_INVOICE.orig_bill_refno)
   * @return Integer the value
   */
  public Integer getOrigBillRefno () {
    return this.OrigBillRefno;
  }
  /** Change the field to not being actively set: OrigBillRefno (BILL_INVOICE.orig_bill_refno)
   */
  public void unsetOrigBillRefno () {
    this._OrigBillRefnoSet = false;
  }
  /** See if the field is actively set: OrigBillRefno (BILL_INVOICE.orig_bill_refno)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigBillRefno () {
    return this._OrigBillRefnoSet;
  }
  /** set the fields value: OrigBillRefResets (BILL_INVOICE.orig_bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigBillRefResets") 
  public void setOrigBillRefResets (Integer value) throws ServiceException
  {
    this.OrigBillRefResets = value;
    this._OrigBillRefResetsSet = true;
  }

  /** Retrieves the OrigBillRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigBillRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBillRefResets field
   */
   public String getOrigBillRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBillRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigBillRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBillRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigBillRefResets field from a formatted string
   *
   * @param _value the OrigBillRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigBillRefResets field
   */
   public void setOrigBillRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigBillRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBillRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBillRefResetsFromFormattedString");
   }

  /** get the value of the field: OrigBillRefResets (BILL_INVOICE.orig_bill_ref_resets)
   * @return Integer the value
   */
  public Integer getOrigBillRefResets () {
    return this.OrigBillRefResets;
  }
  /** Change the field to not being actively set: OrigBillRefResets (BILL_INVOICE.orig_bill_ref_resets)
   */
  public void unsetOrigBillRefResets () {
    this._OrigBillRefResetsSet = false;
  }
  /** See if the field is actively set: OrigBillRefResets (BILL_INVOICE.orig_bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigBillRefResets () {
    return this._OrigBillRefResetsSet;
  }
  /** set the fields value: CollectionHistory (BILL_INVOICE.collection_history)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CollectionHistory") 
  public void setCollectionHistory (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 12))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CollectionHistory", "setCollectionHistory");
    }
    this.CollectionHistory = value;
    this._CollectionHistorySet = true;
  }

  /** Retrieves the CollectionHistory field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CollectionHistory field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CollectionHistory field
   */
   public String getCollectionHistoryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCollectionHistoryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCollectionHistoryAsFormattedString");
       return fmtMgr.formatString(this.getCollectionHistory());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CollectionHistory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCollectionHistoryAsFormattedString");
       throw x;
     }
   }
  /** Sets the CollectionHistory field from a formatted string
   *
   * @param _value the CollectionHistory field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CollectionHistory field
   */
   public void setCollectionHistoryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCollectionHistoryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCollectionHistory(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CollectionHistory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCollectionHistoryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCollectionHistoryFromFormattedString");
   }

  /** get the value of the field: CollectionHistory (BILL_INVOICE.collection_history)
   * @return String the value
   */
  public String getCollectionHistory () {
    return this.CollectionHistory;
  }
  /** Change the field to not being actively set: CollectionHistory (BILL_INVOICE.collection_history)
   */
  public void unsetCollectionHistory () {
    this._CollectionHistorySet = false;
  }
  /** See if the field is actively set: CollectionHistory (BILL_INVOICE.collection_history)
   * @return boolean whether the field is actively set
   */
  public boolean issetCollectionHistory () {
    return this._CollectionHistorySet;
  }
  /** set the fields value: JnlEarnedThruDt (BILL_INVOICE.jnl_earned_thru_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("JnlEarnedThruDt") 
  public void setJnlEarnedThruDt (Date value) throws ServiceException
  {
    this.JnlEarnedThruDt = value;
    this._JnlEarnedThruDtSet = true;
  }

  /** Retrieves the JnlEarnedThruDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The JnlEarnedThruDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the JnlEarnedThruDt field
   */
   public String getJnlEarnedThruDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJnlEarnedThruDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getJnlEarnedThruDtAsFormattedString");
       return fmtMgr.formatDate(this.getJnlEarnedThruDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("JnlEarnedThruDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getJnlEarnedThruDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the JnlEarnedThruDt field from a formatted string
   *
   * @param _value the JnlEarnedThruDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the JnlEarnedThruDt field
   */
   public void setJnlEarnedThruDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJnlEarnedThruDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setJnlEarnedThruDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("JnlEarnedThruDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setJnlEarnedThruDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setJnlEarnedThruDtFromFormattedString");
   }

  /**
   * Retrieves the JnlEarnedThruDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The JnlEarnedThruDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the JnlEarnedThruDt field
   */
  public String getJnlEarnedThruDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJnlEarnedThruDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getJnlEarnedThruDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getJnlEarnedThruDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("JnlEarnedThruDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getJnlEarnedThruDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the JnlEarnedThruDt field value from a formatted date/time string
   *
   * @param _value the JnlEarnedThruDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the JnlEarnedThruDt field
   */
  public void setJnlEarnedThruDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setJnlEarnedThruDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setJnlEarnedThruDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("JnlEarnedThruDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setJnlEarnedThruDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: JnlEarnedThruDt (BILL_INVOICE.jnl_earned_thru_dt)
   * @return Date the value
   */
  public Date getJnlEarnedThruDt () {
    return this.JnlEarnedThruDt;
  }
  /** Change the field to not being actively set: JnlEarnedThruDt (BILL_INVOICE.jnl_earned_thru_dt)
   */
  public void unsetJnlEarnedThruDt () {
    this._JnlEarnedThruDtSet = false;
  }
  /** See if the field is actively set: JnlEarnedThruDt (BILL_INVOICE.jnl_earned_thru_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetJnlEarnedThruDt () {
    return this._JnlEarnedThruDtSet;
  }
  /** set the fields value: JnlStatus (BILL_INVOICE.jnl_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("JnlStatus") 
  public void setJnlStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "JnlStatus", "setJnlStatus");
    }
    this.JnlStatus = value;
    this._JnlStatusSet = true;
  }

  /** Retrieves the JnlStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The JnlStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the JnlStatus field
   */
   public String getJnlStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJnlStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getJnlStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getJnlStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("JnlStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getJnlStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the JnlStatus field from a formatted string
   *
   * @param _value the JnlStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the JnlStatus field
   */
   public void setJnlStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJnlStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setJnlStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("JnlStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setJnlStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setJnlStatusFromFormattedString");
   }

  /** get the value of the field: JnlStatus (BILL_INVOICE.jnl_status)
   * @return Integer the value
   */
  public Integer getJnlStatus () {
    return this.JnlStatus;
  }
  /** Change the field to not being actively set: JnlStatus (BILL_INVOICE.jnl_status)
   */
  public void unsetJnlStatus () {
    this._JnlStatusSet = false;
  }
  /** See if the field is actively set: JnlStatus (BILL_INVOICE.jnl_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetJnlStatus () {
    return this._JnlStatusSet;
  }
  /** set the fields value: TestFlag (BILL_INVOICE.test_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TestFlag") 
  public void setTestFlag (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TestFlag", "setTestFlag");
    }
    this.TestFlag = value;
    this._TestFlagSet = true;
  }

  /** Retrieves the TestFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TestFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TestFlag field
   */
   public String getTestFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTestFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTestFlagAsFormattedString");
       return fmtMgr.formatBoolean(this.getTestFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TestFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTestFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the TestFlag field from a formatted string
   *
   * @param _value the TestFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TestFlag field
   */
   public void setTestFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTestFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTestFlag(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TestFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTestFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTestFlagFromFormattedString");
   }

  /** get the value of the field: TestFlag (BILL_INVOICE.test_flag)
   * @return Boolean the value
   */
  public Boolean getTestFlag () {
    return this.TestFlag;
  }
  /** Change the field to not being actively set: TestFlag (BILL_INVOICE.test_flag)
   */
  public void unsetTestFlag () {
    this._TestFlagSet = false;
  }
  /** See if the field is actively set: TestFlag (BILL_INVOICE.test_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetTestFlag () {
    return this._TestFlagSet;
  }
  /** set the fields value: ArchFlag (BILL_INVOICE.arch_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ArchFlag") 
  public void setArchFlag (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ArchFlag", "setArchFlag");
    }
    this.ArchFlag = value;
    this._ArchFlagSet = true;
  }

  /** Retrieves the ArchFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ArchFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ArchFlag field
   */
   public String getArchFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getArchFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getArchFlagAsFormattedString");
       return fmtMgr.formatBoolean(this.getArchFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ArchFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getArchFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the ArchFlag field from a formatted string
   *
   * @param _value the ArchFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ArchFlag field
   */
   public void setArchFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getArchFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setArchFlag(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ArchFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setArchFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setArchFlagFromFormattedString");
   }

  /** get the value of the field: ArchFlag (BILL_INVOICE.arch_flag)
   * @return Boolean the value
   */
  public Boolean getArchFlag () {
    return this.ArchFlag;
  }
  /** Change the field to not being actively set: ArchFlag (BILL_INVOICE.arch_flag)
   */
  public void unsetArchFlag () {
    this._ArchFlagSet = false;
  }
  /** See if the field is actively set: ArchFlag (BILL_INVOICE.arch_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetArchFlag () {
    return this._ArchFlagSet;
  }
  /** set the fields value: InterimBillFlag (BILL_INVOICE.interim_bill_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InterimBillFlag") 
  public void setInterimBillFlag (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InterimBillFlag", "setInterimBillFlag");
    }
    this.InterimBillFlag = value;
    this._InterimBillFlagSet = true;
  }

  /** Retrieves the InterimBillFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InterimBillFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InterimBillFlag field
   */
   public String getInterimBillFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInterimBillFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInterimBillFlagAsFormattedString");
       return fmtMgr.formatBoolean(this.getInterimBillFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InterimBillFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInterimBillFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the InterimBillFlag field from a formatted string
   *
   * @param _value the InterimBillFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InterimBillFlag field
   */
   public void setInterimBillFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInterimBillFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInterimBillFlag(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InterimBillFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInterimBillFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInterimBillFlagFromFormattedString");
   }

  /** get the value of the field: InterimBillFlag (BILL_INVOICE.interim_bill_flag)
   * @return Boolean the value
   */
  public Boolean getInterimBillFlag () {
    return this.InterimBillFlag;
  }
  /** Change the field to not being actively set: InterimBillFlag (BILL_INVOICE.interim_bill_flag)
   */
  public void unsetInterimBillFlag () {
    this._InterimBillFlagSet = false;
  }
  /** See if the field is actively set: InterimBillFlag (BILL_INVOICE.interim_bill_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetInterimBillFlag () {
    return this._InterimBillFlagSet;
  }
  /** set the fields value: IncludeNrc (BILL_INVOICE.include_nrc)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IncludeNrc") 
  public void setIncludeNrc (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IncludeNrc", "setIncludeNrc");
    }
    this.IncludeNrc = value;
    this._IncludeNrcSet = true;
  }

  /** Retrieves the IncludeNrc field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IncludeNrc field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncludeNrc field
   */
   public String getIncludeNrcAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeNrcAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncludeNrcAsFormattedString");
       return fmtMgr.formatBoolean(this.getIncludeNrc());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncludeNrc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncludeNrcAsFormattedString");
       throw x;
     }
   }
  /** Sets the IncludeNrc field from a formatted string
   *
   * @param _value the IncludeNrc field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IncludeNrc field
   */
   public void setIncludeNrcFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeNrcFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIncludeNrc(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncludeNrc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncludeNrcFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncludeNrcFromFormattedString");
   }

  /** get the value of the field: IncludeNrc (BILL_INVOICE.include_nrc)
   * @return Boolean the value
   */
  public Boolean getIncludeNrc () {
    return this.IncludeNrc;
  }
  /** Change the field to not being actively set: IncludeNrc (BILL_INVOICE.include_nrc)
   */
  public void unsetIncludeNrc () {
    this._IncludeNrcSet = false;
  }
  /** See if the field is actively set: IncludeNrc (BILL_INVOICE.include_nrc)
   * @return boolean whether the field is actively set
   */
  public boolean issetIncludeNrc () {
    return this._IncludeNrcSet;
  }
  /** set the fields value: IncludeRc (BILL_INVOICE.include_rc)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IncludeRc") 
  public void setIncludeRc (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IncludeRc", "setIncludeRc");
    }
    this.IncludeRc = value;
    this._IncludeRcSet = true;
  }

  /** Retrieves the IncludeRc field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IncludeRc field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncludeRc field
   */
   public String getIncludeRcAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeRcAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncludeRcAsFormattedString");
       return fmtMgr.formatBoolean(this.getIncludeRc());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncludeRc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncludeRcAsFormattedString");
       throw x;
     }
   }
  /** Sets the IncludeRc field from a formatted string
   *
   * @param _value the IncludeRc field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IncludeRc field
   */
   public void setIncludeRcFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeRcFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIncludeRc(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncludeRc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncludeRcFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncludeRcFromFormattedString");
   }

  /** get the value of the field: IncludeRc (BILL_INVOICE.include_rc)
   * @return Boolean the value
   */
  public Boolean getIncludeRc () {
    return this.IncludeRc;
  }
  /** Change the field to not being actively set: IncludeRc (BILL_INVOICE.include_rc)
   */
  public void unsetIncludeRc () {
    this._IncludeRcSet = false;
  }
  /** See if the field is actively set: IncludeRc (BILL_INVOICE.include_rc)
   * @return boolean whether the field is actively set
   */
  public boolean issetIncludeRc () {
    return this._IncludeRcSet;
  }
  /** set the fields value: IncludeAdj (BILL_INVOICE.include_adj)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IncludeAdj") 
  public void setIncludeAdj (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IncludeAdj", "setIncludeAdj");
    }
    this.IncludeAdj = value;
    this._IncludeAdjSet = true;
  }

  /** Retrieves the IncludeAdj field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IncludeAdj field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncludeAdj field
   */
   public String getIncludeAdjAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeAdjAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncludeAdjAsFormattedString");
       return fmtMgr.formatBoolean(this.getIncludeAdj());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncludeAdj");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncludeAdjAsFormattedString");
       throw x;
     }
   }
  /** Sets the IncludeAdj field from a formatted string
   *
   * @param _value the IncludeAdj field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IncludeAdj field
   */
   public void setIncludeAdjFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeAdjFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIncludeAdj(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncludeAdj");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncludeAdjFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncludeAdjFromFormattedString");
   }

  /** get the value of the field: IncludeAdj (BILL_INVOICE.include_adj)
   * @return Boolean the value
   */
  public Boolean getIncludeAdj () {
    return this.IncludeAdj;
  }
  /** Change the field to not being actively set: IncludeAdj (BILL_INVOICE.include_adj)
   */
  public void unsetIncludeAdj () {
    this._IncludeAdjSet = false;
  }
  /** See if the field is actively set: IncludeAdj (BILL_INVOICE.include_adj)
   * @return boolean whether the field is actively set
   */
  public boolean issetIncludeAdj () {
    return this._IncludeAdjSet;
  }
  /** set the fields value: IncludeUsage (BILL_INVOICE.include_usage)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IncludeUsage") 
  public void setIncludeUsage (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IncludeUsage", "setIncludeUsage");
    }
    this.IncludeUsage = value;
    this._IncludeUsageSet = true;
  }

  /** Retrieves the IncludeUsage field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IncludeUsage field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncludeUsage field
   */
   public String getIncludeUsageAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeUsageAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncludeUsageAsFormattedString");
       return fmtMgr.formatBoolean(this.getIncludeUsage());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncludeUsage");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncludeUsageAsFormattedString");
       throw x;
     }
   }
  /** Sets the IncludeUsage field from a formatted string
   *
   * @param _value the IncludeUsage field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IncludeUsage field
   */
   public void setIncludeUsageFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeUsageFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIncludeUsage(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncludeUsage");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncludeUsageFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncludeUsageFromFormattedString");
   }

  /** get the value of the field: IncludeUsage (BILL_INVOICE.include_usage)
   * @return Boolean the value
   */
  public Boolean getIncludeUsage () {
    return this.IncludeUsage;
  }
  /** Change the field to not being actively set: IncludeUsage (BILL_INVOICE.include_usage)
   */
  public void unsetIncludeUsage () {
    this._IncludeUsageSet = false;
  }
  /** See if the field is actively set: IncludeUsage (BILL_INVOICE.include_usage)
   * @return boolean whether the field is actively set
   */
  public boolean issetIncludeUsage () {
    return this._IncludeUsageSet;
  }
  /** set the fields value: IncludePayment (BILL_INVOICE.include_bmf)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IncludePayment") 
  public void setIncludePayment (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IncludePayment", "setIncludePayment");
    }
    this.IncludePayment = value;
    this._IncludePaymentSet = true;
  }

  /** Retrieves the IncludePayment field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IncludePayment field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncludePayment field
   */
   public String getIncludePaymentAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludePaymentAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncludePaymentAsFormattedString");
       return fmtMgr.formatBoolean(this.getIncludePayment());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncludePayment");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncludePaymentAsFormattedString");
       throw x;
     }
   }
  /** Sets the IncludePayment field from a formatted string
   *
   * @param _value the IncludePayment field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IncludePayment field
   */
   public void setIncludePaymentFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludePaymentFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIncludePayment(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncludePayment");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncludePaymentFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncludePaymentFromFormattedString");
   }

  /** get the value of the field: IncludePayment (BILL_INVOICE.include_bmf)
   * @return Boolean the value
   */
  public Boolean getIncludePayment () {
    return this.IncludePayment;
  }
  /** Change the field to not being actively set: IncludePayment (BILL_INVOICE.include_bmf)
   */
  public void unsetIncludePayment () {
    this._IncludePaymentSet = false;
  }
  /** See if the field is actively set: IncludePayment (BILL_INVOICE.include_bmf)
   * @return boolean whether the field is actively set
   */
  public boolean issetIncludePayment () {
    return this._IncludePaymentSet;
  }
  /** set the fields value: LanguageCode (BILL_INVOICE.language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LanguageCode") 
  public void setLanguageCode (Integer value) throws ServiceException
  {
    this.LanguageCode = value;
    this._LanguageCodeSet = true;
  }

  /** Retrieves the LanguageCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LanguageCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LanguageCode field
   */
   public String getLanguageCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getLanguageCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the LanguageCode field from a formatted string
   *
   * @param _value the LanguageCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LanguageCode field
   */
   public void setLanguageCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLanguageCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated LanguageCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the LanguageCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the LanguageCode field
   */

  public String getLanguageCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getLanguageCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getLanguageCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated LanguageCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the LanguageCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the LanguageCode field
   */
  public Enumeration getLanguageCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("LanguageCode", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated LanguageCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setLanguageCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getLanguageCodeEnumeration(_locale);
      this.setLanguageCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFromDisplayValue");
  }

  /** get the value of the field: LanguageCode (BILL_INVOICE.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    return this.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (BILL_INVOICE.language_code)
   */
  public void unsetLanguageCode () {
    this._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (BILL_INVOICE.language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLanguageCode () {
    return this._LanguageCodeSet;
  }
  /** set the fields value: BillConverted (BILL_INVOICE.converted)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillConverted") 
  public void setBillConverted (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillConverted", "setBillConverted");
    }
    this.BillConverted = value;
    this._BillConvertedSet = true;
  }

  /** Retrieves the BillConverted field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillConverted field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillConverted field
   */
   public String getBillConvertedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillConvertedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillConvertedAsFormattedString");
       return fmtMgr.formatNumber(this.getBillConverted(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillConverted");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillConvertedAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillConverted field from a formatted string
   *
   * @param _value the BillConverted field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillConverted field
   */
   public void setBillConvertedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillConvertedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillConverted(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillConverted");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillConvertedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillConvertedFromFormattedString");
   }

  /** get the value of the field: BillConverted (BILL_INVOICE.converted)
   * @return Integer the value
   */
  public Integer getBillConverted () {
    return this.BillConverted;
  }
  /** Change the field to not being actively set: BillConverted (BILL_INVOICE.converted)
   */
  public void unsetBillConverted () {
    this._BillConvertedSet = false;
  }
  /** See if the field is actively set: BillConverted (BILL_INVOICE.converted)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillConverted () {
    return this._BillConvertedSet;
  }
  /** set the fields value: WarmBillFlag (BILL_INVOICE.warm_bill_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("WarmBillFlag") 
  public void setWarmBillFlag (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "WarmBillFlag", "setWarmBillFlag");
    }
    this.WarmBillFlag = value;
    this._WarmBillFlagSet = true;
  }

  /** Retrieves the WarmBillFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The WarmBillFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the WarmBillFlag field
   */
   public String getWarmBillFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getWarmBillFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getWarmBillFlagAsFormattedString");
       return fmtMgr.formatBoolean(this.getWarmBillFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("WarmBillFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getWarmBillFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the WarmBillFlag field from a formatted string
   *
   * @param _value the WarmBillFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the WarmBillFlag field
   */
   public void setWarmBillFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getWarmBillFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setWarmBillFlag(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("WarmBillFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setWarmBillFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setWarmBillFlagFromFormattedString");
   }

  /** get the value of the field: WarmBillFlag (BILL_INVOICE.warm_bill_flag)
   * @return Boolean the value
   */
  public Boolean getWarmBillFlag () {
    return this.WarmBillFlag;
  }
  /** Change the field to not being actively set: WarmBillFlag (BILL_INVOICE.warm_bill_flag)
   */
  public void unsetWarmBillFlag () {
    this._WarmBillFlagSet = false;
  }
  /** See if the field is actively set: WarmBillFlag (BILL_INVOICE.warm_bill_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetWarmBillFlag () {
    return this._WarmBillFlagSet;
  }
  /** set the fields value: BillOrderNumber (BILL_INVOICE.bill_order_number)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillOrderNumber") 
  public void setBillOrderNumber (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 25))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillOrderNumber", "setBillOrderNumber");
    }
    this.BillOrderNumber = value;
    this._BillOrderNumberSet = true;
  }

  /** Retrieves the BillOrderNumber field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillOrderNumber field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillOrderNumber field
   */
   public String getBillOrderNumberAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillOrderNumberAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillOrderNumberAsFormattedString");
       return fmtMgr.formatString(this.getBillOrderNumber());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillOrderNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillOrderNumberAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillOrderNumber field from a formatted string
   *
   * @param _value the BillOrderNumber field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillOrderNumber field
   */
   public void setBillOrderNumberFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillOrderNumberFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillOrderNumber(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillOrderNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillOrderNumberFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillOrderNumberFromFormattedString");
   }

  /** get the value of the field: BillOrderNumber (BILL_INVOICE.bill_order_number)
   * @return String the value
   */
  public String getBillOrderNumber () {
    return this.BillOrderNumber;
  }
  /** Change the field to not being actively set: BillOrderNumber (BILL_INVOICE.bill_order_number)
   */
  public void unsetBillOrderNumber () {
    this._BillOrderNumberSet = false;
  }
  /** See if the field is actively set: BillOrderNumber (BILL_INVOICE.bill_order_number)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillOrderNumber () {
    return this._BillOrderNumberSet;
  }
  /** set the fields value: BillFmtOpt (BILL_INVOICE.bill_fmt_opt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillFmtOpt") 
  public void setBillFmtOpt (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillFmtOpt", "setBillFmtOpt");
    }
    this.BillFmtOpt = value;
    this._BillFmtOptSet = true;
  }

  /** Retrieves the BillFmtOpt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillFmtOpt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillFmtOpt field
   */
   public String getBillFmtOptAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFmtOptAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFmtOptAsFormattedString");
       return fmtMgr.formatNumber(this.getBillFmtOpt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillFmtOpt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFmtOptAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillFmtOpt field from a formatted string
   *
   * @param _value the BillFmtOpt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillFmtOpt field
   */
   public void setBillFmtOptFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFmtOptFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillFmtOpt(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillFmtOpt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillFmtOptFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillFmtOptFromFormattedString");
   }

  /** get the value of the field: BillFmtOpt (BILL_INVOICE.bill_fmt_opt)
   * @return Integer the value
   */
  public Integer getBillFmtOpt () {
    return this.BillFmtOpt;
  }
  /** Change the field to not being actively set: BillFmtOpt (BILL_INVOICE.bill_fmt_opt)
   */
  public void unsetBillFmtOpt () {
    this._BillFmtOptSet = false;
  }
  /** See if the field is actively set: BillFmtOpt (BILL_INVOICE.bill_fmt_opt)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillFmtOpt () {
    return this._BillFmtOptSet;
  }
  /** set the fields value: DocumentServerId (BILL_INVOICE.document_server_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DocumentServerId") 
  public void setDocumentServerId (Integer value) throws ServiceException
  {
    this.DocumentServerId = value;
    this._DocumentServerIdSet = true;
  }

  /** Retrieves the DocumentServerId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DocumentServerId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DocumentServerId field
   */
   public String getDocumentServerIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentServerIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentServerIdAsFormattedString");
       return fmtMgr.formatNumber(this.getDocumentServerId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DocumentServerId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDocumentServerIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the DocumentServerId field from a formatted string
   *
   * @param _value the DocumentServerId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DocumentServerId field
   */
   public void setDocumentServerIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentServerIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDocumentServerId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DocumentServerId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDocumentServerIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDocumentServerIdFromFormattedString");
   }

  /** get the value of the field: DocumentServerId (BILL_INVOICE.document_server_id)
   * @return Integer the value
   */
  public Integer getDocumentServerId () {
    return this.DocumentServerId;
  }
  /** Change the field to not being actively set: DocumentServerId (BILL_INVOICE.document_server_id)
   */
  public void unsetDocumentServerId () {
    this._DocumentServerIdSet = false;
  }
  /** See if the field is actively set: DocumentServerId (BILL_INVOICE.document_server_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDocumentServerId () {
    return this._DocumentServerIdSet;
  }
  public String toString() {
    return InvoiceObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ObjectHelper.objectToMap(this);
  }
  public void loadDefaults(String action) {
    if (action != null) DefaultManager.getInstance().setObjectDefaults(this, action);
  }
  public void checkConstraints(String action) throws ConstraintException {
    if (action != null) ConstraintManager.getInstance().checkConstraints(this, action);
  }
  /*
   * This method set all of the *Set flags to the specified value
   * @param flag value to set for flags
   */
  public void resetFlags(boolean flag) {
    
      resetFlags(flag, true);
  }
  /*
   * This method sets the *Set flags to the specified value
   * @param flag value to set for flags
   * @param nonNullOnly set only those flags where the value is not null. 
   */
  public void resetFlags(boolean flag, boolean nonNullOnly) {
    
    /** the object's key data */
    if (Key != null) Key.resetFlags(flag, nonNullOnly);
  /** CMF_BALANCE.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** CMF_BALANCE.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** CMF_BALANCE.ppdd_date field */
    if(!nonNullOnly || (PayDueDate != null))  _PayDueDateSet = flag;
  /** CMF_BALANCE.orig_ppdd_date field */
    if(!nonNullOnly || (OrigPayDueDate != null))  _OrigPayDueDateSet = flag;
  /** CMF_BALANCE.closed_date field */
    if(!nonNullOnly || (ClosedDate != null))  _ClosedDateSet = flag;
  /** CMF_BALANCE.new_charges field */
    if(!nonNullOnly || (NewCharges != null))  _NewChargesSet = flag;
  /** CMF_BALANCE.net_new_charges field */
    if(!nonNullOnly || (NetNewCharges != null))  _NetNewChargesSet = flag;
  /** CMF_BALANCE.total_due field */
    if(!nonNullOnly || (TotalDue != null))  _TotalDueSet = flag;
  /** CMF_BALANCE.total_adj field */
    if(!nonNullOnly || (TotalAdj != null))  _TotalAdjSet = flag;
  /** CMF_BALANCE.total_paid field */
    if(!nonNullOnly || (TotalPaid != null))  _TotalPaidSet = flag;
  /** CMF_BALANCE.balance_due field */
    if(!nonNullOnly || (BalanceDue != null))  _BalanceDueSet = flag;
  /** CMF_BALANCE.dispute_amt field */
    if(!nonNullOnly || (DisputeAmt != null))  _DisputeAmtSet = flag;
  /** CMF_BALANCE.late_exempt_charges field */
    if(!nonNullOnly || (LateExemptCharges != null))  _LateExemptChargesSet = flag;
  /** CMF_BALANCE.collection_indicator field */
    if(!nonNullOnly || (CollectionIndicator != null))  _CollectionIndicatorSet = flag;
  /** CMF_BALANCE.chg_date field */
    if(!nonNullOnly || (ChgDate != null))  _ChgDateSet = flag;
  /** CMF_BALANCE.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** CMF_BALANCE.gl_amount field */
    if(!nonNullOnly || (GlAmount != null))  _GlAmountSet = flag;
  /** CMF_BALANCE.converted field */
    if(!nonNullOnly || (BalanceConverted != null))  _BalanceConvertedSet = flag;
  /** CMF_BALANCE.new_charge_credits field */
    if(!nonNullOnly || (NewChargeCredits != null))  _NewChargeCreditsSet = flag;
  /** BILL_INVOICE.bill_sequence_num field */
    if(!nonNullOnly || (BillSequenceNum != null))  _BillSequenceNumSet = flag;
  /** BILL_INVOICE.process_num field */
    if(!nonNullOnly || (ProcessNum != null))  _ProcessNumSet = flag;
  /** BILL_INVOICE.prev_bill_refno field */
    if(!nonNullOnly || (PrevBillRefno != null))  _PrevBillRefnoSet = flag;
  /** BILL_INVOICE.prev_bill_ref_resets field */
    if(!nonNullOnly || (PrevBillRefResets != null))  _PrevBillRefResetsSet = flag;
  /** BILL_INVOICE.prev_balance_refno field */
    if(!nonNullOnly || (PrevBalanceRefno != null))  _PrevBalanceRefnoSet = flag;
  /** BILL_INVOICE.prev_balance_ref_resets field */
    if(!nonNullOnly || (PrevBalanceRefResets != null))  _PrevBalanceRefResetsSet = flag;
  /** BILL_INVOICE.zip field */
    if(!nonNullOnly || (Zip != null))  _ZipSet = flag;
  /** BILL_INVOICE.from_date field */
    if(!nonNullOnly || (FromDate != null))  _FromDateSet = flag;
  /** BILL_INVOICE.to_date field */
    if(!nonNullOnly || (ToDate != null))  _ToDateSet = flag;
  /** BILL_INVOICE.next_to_date field */
    if(!nonNullOnly || (NextToDate != null))  _NextToDateSet = flag;
  /** BILL_INVOICE.prep_date field */
    if(!nonNullOnly || (PrepDate != null))  _PrepDateSet = flag;
  /** BILL_INVOICE.tax_date field */
    if(!nonNullOnly || (TaxDate != null))  _TaxDateSet = flag;
  /** BILL_INVOICE.statement_date field */
    if(!nonNullOnly || (StatementDate != null))  _StatementDateSet = flag;
  /** BILL_INVOICE.payment_due_date field */
    if(!nonNullOnly || (PaymentDueDate != null))  _PaymentDueDateSet = flag;
  /** BILL_INVOICE.prev_ppdd field */
    if(!nonNullOnly || (PrevPpdd != null))  _PrevPpddSet = flag;
  /** BILL_INVOICE.prev_cutoff_date field */
    if(!nonNullOnly || (PrevCutoffDate != null))  _PrevCutoffDateSet = flag;
  /** BILL_INVOICE.bill_period field */
    if(!nonNullOnly || (BillPeriod != null))  _BillPeriodSet = flag;
  /** BILL_INVOICE.pay_method field */
    if(!nonNullOnly || (PayMethod != null))  _PayMethodSet = flag;
  /** BILL_INVOICE.bill_disp_meth field */
    if(!nonNullOnly || (BillDispMeth != null))  _BillDispMethSet = flag;
  /** BILL_INVOICE.tax_journal_status field */
    if(!nonNullOnly || (TaxJournalStatus != null))  _TaxJournalStatusSet = flag;
  /** BILL_INVOICE.account_status field */
    if(!nonNullOnly || (AccountStatus != null))  _AccountStatusSet = flag;
  /** BILL_INVOICE.image_req field */
    if(!nonNullOnly || (ImageReq != null))  _ImageReqSet = flag;
  /** BILL_INVOICE.image_done field */
    if(!nonNullOnly || (ImageDone != null))  _ImageDoneSet = flag;
  /** BILL_INVOICE.special_code field */
    if(!nonNullOnly || (SpecialCode != null))  _SpecialCodeSet = flag;
  /** BILL_INVOICE.prep_task field */
    if(!nonNullOnly || (PrepTask != null))  _PrepTaskSet = flag;
  /** BILL_INVOICE.prep_status field */
    if(!nonNullOnly || (PrepStatus != null))  _PrepStatusSet = flag;
  /** BILL_INVOICE.format_status field */
    if(!nonNullOnly || (FormatStatus != null))  _FormatStatusSet = flag;
  /** BILL_INVOICE.dispatch_count field */
    if(!nonNullOnly || (DispatchCount != null))  _DispatchCountSet = flag;
  /** BILL_INVOICE.dispatch_date field */
    if(!nonNullOnly || (DispatchDate != null))  _DispatchDateSet = flag;
  /** BILL_INVOICE.file_name field */
    if(!nonNullOnly || (FileName != null))  _FileNameSet = flag;
  /** BILL_INVOICE.start_offset field */
    if(!nonNullOnly || (StartOffset != null))  _StartOffsetSet = flag;
  /** BILL_INVOICE.end_offset field */
    if(!nonNullOnly || (EndOffset != null))  _EndOffsetSet = flag;
  /** BILL_INVOICE.page_count field */
    if(!nonNullOnly || (PageCount != null))  _PageCountSet = flag;
  /** BILL_INVOICE.bill_hold_code field */
    if(!nonNullOnly || (BillHoldCode != null))  _BillHoldCodeSet = flag;
  /** BILL_INVOICE.prep_error_code field */
    if(!nonNullOnly || (PrepErrorCode != null))  _PrepErrorCodeSet = flag;
  /** BILL_INVOICE.format_error_code field */
    if(!nonNullOnly || (FormatErrorCode != null))  _FormatErrorCodeSet = flag;
  /** BILL_INVOICE.backout_status field */
    if(!nonNullOnly || (BackoutStatus != null))  _BackoutStatusSet = flag;
  /** BILL_INVOICE.copy_type field */
    if(!nonNullOnly || (CopyType != null))  _CopyTypeSet = flag;
  /** BILL_INVOICE.orig_bill_refno field */
    if(!nonNullOnly || (OrigBillRefno != null))  _OrigBillRefnoSet = flag;
  /** BILL_INVOICE.orig_bill_ref_resets field */
    if(!nonNullOnly || (OrigBillRefResets != null))  _OrigBillRefResetsSet = flag;
  /** BILL_INVOICE.collection_history field */
    if(!nonNullOnly || (CollectionHistory != null))  _CollectionHistorySet = flag;
  /** BILL_INVOICE.jnl_earned_thru_dt field */
    if(!nonNullOnly || (JnlEarnedThruDt != null))  _JnlEarnedThruDtSet = flag;
  /** BILL_INVOICE.jnl_status field */
    if(!nonNullOnly || (JnlStatus != null))  _JnlStatusSet = flag;
  /** BILL_INVOICE.test_flag field */
    if(!nonNullOnly || (TestFlag != null))  _TestFlagSet = flag;
  /** BILL_INVOICE.arch_flag field */
    if(!nonNullOnly || (ArchFlag != null))  _ArchFlagSet = flag;
  /** BILL_INVOICE.interim_bill_flag field */
    if(!nonNullOnly || (InterimBillFlag != null))  _InterimBillFlagSet = flag;
  /** BILL_INVOICE.include_nrc field */
    if(!nonNullOnly || (IncludeNrc != null))  _IncludeNrcSet = flag;
  /** BILL_INVOICE.include_rc field */
    if(!nonNullOnly || (IncludeRc != null))  _IncludeRcSet = flag;
  /** BILL_INVOICE.include_adj field */
    if(!nonNullOnly || (IncludeAdj != null))  _IncludeAdjSet = flag;
  /** BILL_INVOICE.include_usage field */
    if(!nonNullOnly || (IncludeUsage != null))  _IncludeUsageSet = flag;
  /** BILL_INVOICE.include_bmf field */
    if(!nonNullOnly || (IncludePayment != null))  _IncludePaymentSet = flag;
  /** BILL_INVOICE.language_code field */
    if(!nonNullOnly || (LanguageCode != null))  _LanguageCodeSet = flag;
  /** BILL_INVOICE.converted field */
    if(!nonNullOnly || (BillConverted != null))  _BillConvertedSet = flag;
  /** BILL_INVOICE.warm_bill_flag field */
    if(!nonNullOnly || (WarmBillFlag != null))  _WarmBillFlagSet = flag;
  /** BILL_INVOICE.bill_order_number field */
    if(!nonNullOnly || (BillOrderNumber != null))  _BillOrderNumberSet = flag;
  /** BILL_INVOICE.bill_fmt_opt field */
    if(!nonNullOnly || (BillFmtOpt != null))  _BillFmtOptSet = flag;
  /** BILL_INVOICE.document_server_id field */
    if(!nonNullOnly || (DocumentServerId != null))  _DocumentServerIdSet = flag;
  }
}
