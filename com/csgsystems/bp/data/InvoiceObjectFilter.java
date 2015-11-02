/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoiceObjectFilter.java
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
import java.math.BigInteger;
import java.util.Map;
import java.util.Locale;

import com.csgsystems.aruba.connection.ServiceException;

import com.csgsystems.aruba.filter.*;
import com.csgsystems.aruba.Filter;

import com.csgsystems.api.base.BaseHelper;

import com.csgsystems.api.utilities.FilterConversionHelper;
import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;
import com.csgsystems.api.enumeration.EnumeratedDataMgr;

import com.csgsystems.bp.data.*;

import com.csgsystems.api.base.BaseFilter;


import com.csgsystems.bali.BaliObjectFilter;

/** Filter object */
public class InvoiceObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public InvoiceObjectKeyFilter Key = null;
  /** raw field for: CMF_BALANCE.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: CMF_BALANCE.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: CMF_BALANCE.ppdd_date) */
  public    DateFilter[] PayDueDate  = null;
  protected boolean PayDueDateFetch = false;
  protected boolean PayDueDateSortAscending = true;
  protected Integer PayDueDateSort = null;
  /** raw field for: CMF_BALANCE.orig_ppdd_date) */
  public    DateFilter[] OrigPayDueDate  = null;
  protected boolean OrigPayDueDateFetch = false;
  protected boolean OrigPayDueDateSortAscending = true;
  protected Integer OrigPayDueDateSort = null;
  /** raw field for: CMF_BALANCE.closed_date) */
  public    DateFilter[] ClosedDate  = null;
  protected boolean ClosedDateFetch = false;
  protected boolean ClosedDateSortAscending = true;
  protected Integer ClosedDateSort = null;
  /** raw field for: CMF_BALANCE.new_charges) */
  public    BigIntegerFilter[] NewCharges  = null;
  protected boolean NewChargesFetch = false;
  protected boolean NewChargesSortAscending = true;
  protected Integer NewChargesSort = null;
  /** raw field for: CMF_BALANCE.net_new_charges) */
  public    BigIntegerFilter[] NetNewCharges  = null;
  protected boolean NetNewChargesFetch = false;
  protected boolean NetNewChargesSortAscending = true;
  protected Integer NetNewChargesSort = null;
  /** raw field for: CMF_BALANCE.total_due) */
  public    BigIntegerFilter[] TotalDue  = null;
  protected boolean TotalDueFetch = false;
  protected boolean TotalDueSortAscending = true;
  protected Integer TotalDueSort = null;
  /** raw field for: CMF_BALANCE.total_adj) */
  public    BigIntegerFilter[] TotalAdj  = null;
  protected boolean TotalAdjFetch = false;
  protected boolean TotalAdjSortAscending = true;
  protected Integer TotalAdjSort = null;
  /** raw field for: CMF_BALANCE.total_paid) */
  public    BigIntegerFilter[] TotalPaid  = null;
  protected boolean TotalPaidFetch = false;
  protected boolean TotalPaidSortAscending = true;
  protected Integer TotalPaidSort = null;
  /** raw field for: CMF_BALANCE.balance_due) */
  public    BigIntegerFilter[] BalanceDue  = null;
  protected boolean BalanceDueFetch = false;
  protected boolean BalanceDueSortAscending = true;
  protected Integer BalanceDueSort = null;
  /** raw field for: CMF_BALANCE.dispute_amt) */
  public    BigIntegerFilter[] DisputeAmt  = null;
  protected boolean DisputeAmtFetch = false;
  protected boolean DisputeAmtSortAscending = true;
  protected Integer DisputeAmtSort = null;
  /** raw field for: CMF_BALANCE.late_exempt_charges) */
  public    BigIntegerFilter[] LateExemptCharges  = null;
  protected boolean LateExemptChargesFetch = false;
  protected boolean LateExemptChargesSortAscending = true;
  protected Integer LateExemptChargesSort = null;
  /** raw field for: CMF_BALANCE.collection_indicator) */
  public    IntegerFilter[] CollectionIndicator  = null;
  protected boolean CollectionIndicatorFetch = false;
  protected boolean CollectionIndicatorSortAscending = true;
  protected Integer CollectionIndicatorSort = null;
  /** raw field for: CMF_BALANCE.chg_date) */
  public    DateFilter[] ChgDate  = null;
  protected boolean ChgDateFetch = false;
  protected boolean ChgDateSortAscending = true;
  protected Integer ChgDateSort = null;
  /** raw field for: CMF_BALANCE.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: CMF_BALANCE.gl_amount) */
  public    BigIntegerFilter[] GlAmount  = null;
  protected boolean GlAmountFetch = false;
  protected boolean GlAmountSortAscending = true;
  protected Integer GlAmountSort = null;
  /** raw field for: CMF_BALANCE.converted) */
  public    IntegerFilter[] BalanceConverted  = null;
  protected boolean BalanceConvertedFetch = false;
  protected boolean BalanceConvertedSortAscending = true;
  protected Integer BalanceConvertedSort = null;
  /** raw field for: CMF_BALANCE.new_charge_credits) */
  public    BigIntegerFilter[] NewChargeCredits  = null;
  protected boolean NewChargeCreditsFetch = false;
  protected boolean NewChargeCreditsSortAscending = true;
  protected Integer NewChargeCreditsSort = null;
  /** raw field for: BILL_INVOICE.bill_sequence_num) */
  public    IntegerFilter[] BillSequenceNum  = null;
  protected boolean BillSequenceNumFetch = false;
  protected boolean BillSequenceNumSortAscending = true;
  protected Integer BillSequenceNumSort = null;
  /** raw field for: BILL_INVOICE.process_num) */
  public    StringFilter[] ProcessNum  = null;
  protected boolean ProcessNumFetch = false;
  protected boolean ProcessNumSortAscending = true;
  protected boolean ProcessNumCaseInsensitive = false;
  protected Integer ProcessNumSort = null;
  /** raw field for: BILL_INVOICE.prev_bill_refno) */
  public    IntegerFilter[] PrevBillRefno  = null;
  protected boolean PrevBillRefnoFetch = false;
  protected boolean PrevBillRefnoSortAscending = true;
  protected Integer PrevBillRefnoSort = null;
  /** raw field for: BILL_INVOICE.prev_bill_ref_resets) */
  public    IntegerFilter[] PrevBillRefResets  = null;
  protected boolean PrevBillRefResetsFetch = false;
  protected boolean PrevBillRefResetsSortAscending = true;
  protected Integer PrevBillRefResetsSort = null;
  /** raw field for: BILL_INVOICE.prev_balance_refno) */
  public    IntegerFilter[] PrevBalanceRefno  = null;
  protected boolean PrevBalanceRefnoFetch = false;
  protected boolean PrevBalanceRefnoSortAscending = true;
  protected Integer PrevBalanceRefnoSort = null;
  /** raw field for: BILL_INVOICE.prev_balance_ref_resets) */
  public    IntegerFilter[] PrevBalanceRefResets  = null;
  protected boolean PrevBalanceRefResetsFetch = false;
  protected boolean PrevBalanceRefResetsSortAscending = true;
  protected Integer PrevBalanceRefResetsSort = null;
  /** raw field for: BILL_INVOICE.zip) */
  public    StringFilter[] Zip  = null;
  protected boolean ZipFetch = false;
  protected boolean ZipSortAscending = true;
  protected boolean ZipCaseInsensitive = false;
  protected Integer ZipSort = null;
  /** raw field for: BILL_INVOICE.from_date) */
  public    DateFilter[] FromDate  = null;
  protected boolean FromDateFetch = false;
  protected boolean FromDateSortAscending = true;
  protected Integer FromDateSort = null;
  /** raw field for: BILL_INVOICE.to_date) */
  public    DateFilter[] ToDate  = null;
  protected boolean ToDateFetch = false;
  protected boolean ToDateSortAscending = true;
  protected Integer ToDateSort = null;
  /** raw field for: BILL_INVOICE.next_to_date) */
  public    DateFilter[] NextToDate  = null;
  protected boolean NextToDateFetch = false;
  protected boolean NextToDateSortAscending = true;
  protected Integer NextToDateSort = null;
  /** raw field for: BILL_INVOICE.prep_date) */
  public    DateFilter[] PrepDate  = null;
  protected boolean PrepDateFetch = false;
  protected boolean PrepDateSortAscending = true;
  protected Integer PrepDateSort = null;
  /** raw field for: BILL_INVOICE.tax_date) */
  public    DateFilter[] TaxDate  = null;
  protected boolean TaxDateFetch = false;
  protected boolean TaxDateSortAscending = true;
  protected Integer TaxDateSort = null;
  /** raw field for: BILL_INVOICE.statement_date) */
  public    DateFilter[] StatementDate  = null;
  protected boolean StatementDateFetch = false;
  protected boolean StatementDateSortAscending = true;
  protected Integer StatementDateSort = null;
  /** raw field for: BILL_INVOICE.payment_due_date) */
  public    DateFilter[] PaymentDueDate  = null;
  protected boolean PaymentDueDateFetch = false;
  protected boolean PaymentDueDateSortAscending = true;
  protected Integer PaymentDueDateSort = null;
  /** raw field for: BILL_INVOICE.prev_ppdd) */
  public    DateFilter[] PrevPpdd  = null;
  protected boolean PrevPpddFetch = false;
  protected boolean PrevPpddSortAscending = true;
  protected Integer PrevPpddSort = null;
  /** raw field for: BILL_INVOICE.prev_cutoff_date) */
  public    DateFilter[] PrevCutoffDate  = null;
  protected boolean PrevCutoffDateFetch = false;
  protected boolean PrevCutoffDateSortAscending = true;
  protected Integer PrevCutoffDateSort = null;
  /** raw field for: BILL_INVOICE.bill_period) */
  public    StringFilter[] BillPeriod  = null;
  protected boolean BillPeriodFetch = false;
  protected boolean BillPeriodSortAscending = true;
  protected boolean BillPeriodCaseInsensitive = false;
  protected Integer BillPeriodSort = null;
  /** raw field for: BILL_INVOICE.pay_method) */
  public    IntegerFilter[] PayMethod  = null;
  protected boolean PayMethodFetch = false;
  protected boolean PayMethodSortAscending = true;
  protected Integer PayMethodSort = null;
  /** raw field for: BILL_INVOICE.bill_disp_meth) */
  public    IntegerFilter[] BillDispMeth  = null;
  protected boolean BillDispMethFetch = false;
  protected boolean BillDispMethSortAscending = true;
  protected Integer BillDispMethSort = null;
  /** raw field for: BILL_INVOICE.tax_journal_status) */
  public    IntegerFilter[] TaxJournalStatus  = null;
  protected boolean TaxJournalStatusFetch = false;
  protected boolean TaxJournalStatusSortAscending = true;
  protected Integer TaxJournalStatusSort = null;
  /** raw field for: BILL_INVOICE.account_status) */
  public    IntegerFilter[] AccountStatus  = null;
  protected boolean AccountStatusFetch = false;
  protected boolean AccountStatusSortAscending = true;
  protected Integer AccountStatusSort = null;
  /** raw field for: BILL_INVOICE.image_req) */
  public    BooleanFilter[] ImageReq  = null;
  protected boolean ImageReqFetch = false;
  protected boolean ImageReqSortAscending = true;
  protected Integer ImageReqSort = null;
  /** raw field for: BILL_INVOICE.image_done) */
  public    BooleanFilter[] ImageDone  = null;
  protected boolean ImageDoneFetch = false;
  protected boolean ImageDoneSortAscending = true;
  protected Integer ImageDoneSort = null;
  /** raw field for: BILL_INVOICE.special_code) */
  public    IntegerFilter[] SpecialCode  = null;
  protected boolean SpecialCodeFetch = false;
  protected boolean SpecialCodeSortAscending = true;
  protected Integer SpecialCodeSort = null;
  /** raw field for: BILL_INVOICE.prep_task) */
  public    StringFilter[] PrepTask  = null;
  protected boolean PrepTaskFetch = false;
  protected boolean PrepTaskSortAscending = true;
  protected boolean PrepTaskCaseInsensitive = false;
  protected Integer PrepTaskSort = null;
  /** raw field for: BILL_INVOICE.prep_status) */
  public    IntegerFilter[] PrepStatus  = null;
  protected boolean PrepStatusFetch = false;
  protected boolean PrepStatusSortAscending = true;
  protected Integer PrepStatusSort = null;
  /** raw field for: BILL_INVOICE.format_status) */
  public    IntegerFilter[] FormatStatus  = null;
  protected boolean FormatStatusFetch = false;
  protected boolean FormatStatusSortAscending = true;
  protected Integer FormatStatusSort = null;
  /** raw field for: BILL_INVOICE.dispatch_count) */
  public    IntegerFilter[] DispatchCount  = null;
  protected boolean DispatchCountFetch = false;
  protected boolean DispatchCountSortAscending = true;
  protected Integer DispatchCountSort = null;
  /** raw field for: BILL_INVOICE.dispatch_date) */
  public    DateFilter[] DispatchDate  = null;
  protected boolean DispatchDateFetch = false;
  protected boolean DispatchDateSortAscending = true;
  protected Integer DispatchDateSort = null;
  /** raw field for: BILL_INVOICE.file_name) */
  public    StringFilter[] FileName  = null;
  protected boolean FileNameFetch = false;
  protected boolean FileNameSortAscending = true;
  protected boolean FileNameCaseInsensitive = false;
  protected Integer FileNameSort = null;
  /** raw field for: BILL_INVOICE.start_offset) */
  public    IntegerFilter[] StartOffset  = null;
  protected boolean StartOffsetFetch = false;
  protected boolean StartOffsetSortAscending = true;
  protected Integer StartOffsetSort = null;
  /** raw field for: BILL_INVOICE.end_offset) */
  public    IntegerFilter[] EndOffset  = null;
  protected boolean EndOffsetFetch = false;
  protected boolean EndOffsetSortAscending = true;
  protected Integer EndOffsetSort = null;
  /** raw field for: BILL_INVOICE.page_count) */
  public    IntegerFilter[] PageCount  = null;
  protected boolean PageCountFetch = false;
  protected boolean PageCountSortAscending = true;
  protected Integer PageCountSort = null;
  /** raw field for: BILL_INVOICE.bill_hold_code) */
  public    IntegerFilter[] BillHoldCode  = null;
  protected boolean BillHoldCodeFetch = false;
  protected boolean BillHoldCodeSortAscending = true;
  protected Integer BillHoldCodeSort = null;
  /** raw field for: BILL_INVOICE.prep_error_code) */
  public    IntegerFilter[] PrepErrorCode  = null;
  protected boolean PrepErrorCodeFetch = false;
  protected boolean PrepErrorCodeSortAscending = true;
  protected Integer PrepErrorCodeSort = null;
  /** raw field for: BILL_INVOICE.format_error_code) */
  public    IntegerFilter[] FormatErrorCode  = null;
  protected boolean FormatErrorCodeFetch = false;
  protected boolean FormatErrorCodeSortAscending = true;
  protected Integer FormatErrorCodeSort = null;
  /** raw field for: BILL_INVOICE.backout_status) */
  public    IntegerFilter[] BackoutStatus  = null;
  protected boolean BackoutStatusFetch = false;
  protected boolean BackoutStatusSortAscending = true;
  protected Integer BackoutStatusSort = null;
  /** raw field for: BILL_INVOICE.copy_type) */
  public    IntegerFilter[] CopyType  = null;
  protected boolean CopyTypeFetch = false;
  protected boolean CopyTypeSortAscending = true;
  protected Integer CopyTypeSort = null;
  /** raw field for: BILL_INVOICE.orig_bill_refno) */
  public    IntegerFilter[] OrigBillRefno  = null;
  protected boolean OrigBillRefnoFetch = false;
  protected boolean OrigBillRefnoSortAscending = true;
  protected Integer OrigBillRefnoSort = null;
  /** raw field for: BILL_INVOICE.orig_bill_ref_resets) */
  public    IntegerFilter[] OrigBillRefResets  = null;
  protected boolean OrigBillRefResetsFetch = false;
  protected boolean OrigBillRefResetsSortAscending = true;
  protected Integer OrigBillRefResetsSort = null;
  /** raw field for: BILL_INVOICE.collection_history) */
  public    StringFilter[] CollectionHistory  = null;
  protected boolean CollectionHistoryFetch = false;
  protected boolean CollectionHistorySortAscending = true;
  protected boolean CollectionHistoryCaseInsensitive = false;
  protected Integer CollectionHistorySort = null;
  /** raw field for: BILL_INVOICE.jnl_earned_thru_dt) */
  public    DateFilter[] JnlEarnedThruDt  = null;
  protected boolean JnlEarnedThruDtFetch = false;
  protected boolean JnlEarnedThruDtSortAscending = true;
  protected Integer JnlEarnedThruDtSort = null;
  /** raw field for: BILL_INVOICE.jnl_status) */
  public    IntegerFilter[] JnlStatus  = null;
  protected boolean JnlStatusFetch = false;
  protected boolean JnlStatusSortAscending = true;
  protected Integer JnlStatusSort = null;
  /** raw field for: BILL_INVOICE.test_flag) */
  public    BooleanFilter[] TestFlag  = null;
  protected boolean TestFlagFetch = false;
  protected boolean TestFlagSortAscending = true;
  protected Integer TestFlagSort = null;
  /** raw field for: BILL_INVOICE.arch_flag) */
  public    BooleanFilter[] ArchFlag  = null;
  protected boolean ArchFlagFetch = false;
  protected boolean ArchFlagSortAscending = true;
  protected Integer ArchFlagSort = null;
  /** raw field for: BILL_INVOICE.interim_bill_flag) */
  public    BooleanFilter[] InterimBillFlag  = null;
  protected boolean InterimBillFlagFetch = false;
  protected boolean InterimBillFlagSortAscending = true;
  protected Integer InterimBillFlagSort = null;
  /** raw field for: BILL_INVOICE.include_nrc) */
  public    BooleanFilter[] IncludeNrc  = null;
  protected boolean IncludeNrcFetch = false;
  protected boolean IncludeNrcSortAscending = true;
  protected Integer IncludeNrcSort = null;
  /** raw field for: BILL_INVOICE.include_rc) */
  public    BooleanFilter[] IncludeRc  = null;
  protected boolean IncludeRcFetch = false;
  protected boolean IncludeRcSortAscending = true;
  protected Integer IncludeRcSort = null;
  /** raw field for: BILL_INVOICE.include_adj) */
  public    BooleanFilter[] IncludeAdj  = null;
  protected boolean IncludeAdjFetch = false;
  protected boolean IncludeAdjSortAscending = true;
  protected Integer IncludeAdjSort = null;
  /** raw field for: BILL_INVOICE.include_usage) */
  public    BooleanFilter[] IncludeUsage  = null;
  protected boolean IncludeUsageFetch = false;
  protected boolean IncludeUsageSortAscending = true;
  protected Integer IncludeUsageSort = null;
  /** raw field for: BILL_INVOICE.include_bmf) */
  public    BooleanFilter[] IncludePayment  = null;
  protected boolean IncludePaymentFetch = false;
  protected boolean IncludePaymentSortAscending = true;
  protected Integer IncludePaymentSort = null;
  /** raw field for: BILL_INVOICE.language_code) */
  public    IntegerFilter[] LanguageCode  = null;
  protected boolean LanguageCodeFetch = false;
  protected boolean LanguageCodeSortAscending = true;
  protected Integer LanguageCodeSort = null;
  /** raw field for: BILL_INVOICE.converted) */
  public    IntegerFilter[] BillConverted  = null;
  protected boolean BillConvertedFetch = false;
  protected boolean BillConvertedSortAscending = true;
  protected Integer BillConvertedSort = null;
  /** raw field for: BILL_INVOICE.warm_bill_flag) */
  public    BooleanFilter[] WarmBillFlag  = null;
  protected boolean WarmBillFlagFetch = false;
  protected boolean WarmBillFlagSortAscending = true;
  protected Integer WarmBillFlagSort = null;
  /** raw field for: BILL_INVOICE.bill_order_number) */
  public    StringFilter[] BillOrderNumber  = null;
  protected boolean BillOrderNumberFetch = false;
  protected boolean BillOrderNumberSortAscending = true;
  protected boolean BillOrderNumberCaseInsensitive = false;
  protected Integer BillOrderNumberSort = null;
  /** raw field for: BILL_INVOICE.bill_fmt_opt) */
  public    IntegerFilter[] BillFmtOpt  = null;
  protected boolean BillFmtOptFetch = false;
  protected boolean BillFmtOptSortAscending = true;
  protected Integer BillFmtOptSort = null;
  /** raw field for: BILL_INVOICE.document_server_id) */
  public    IntegerFilter[] DocumentServerId  = null;
  protected boolean DocumentServerIdFetch = false;
  protected boolean DocumentServerIdSortAscending = true;
  protected Integer DocumentServerIdSort = null;
  private String _objName = "InvoiceObjectFilter";
  /** default constructor */
  public InvoiceObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public InvoiceObjectFilter (InvoiceObjectFilter other)
  {
    if (other == null) return;
    this.Key = new InvoiceObjectKeyFilter (other.Key);
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.PayDueDate = other.PayDueDate;
    this.PayDueDateFetch = other.PayDueDateFetch;
    this.PayDueDateSort = other.PayDueDateSort;
    this.PayDueDateSortAscending = other.PayDueDateSortAscending;
    this.OrigPayDueDate = other.OrigPayDueDate;
    this.OrigPayDueDateFetch = other.OrigPayDueDateFetch;
    this.OrigPayDueDateSort = other.OrigPayDueDateSort;
    this.OrigPayDueDateSortAscending = other.OrigPayDueDateSortAscending;
    this.ClosedDate = other.ClosedDate;
    this.ClosedDateFetch = other.ClosedDateFetch;
    this.ClosedDateSort = other.ClosedDateSort;
    this.ClosedDateSortAscending = other.ClosedDateSortAscending;
    this.NewCharges = other.NewCharges;
    this.NewChargesFetch = other.NewChargesFetch;
    this.NewChargesSort = other.NewChargesSort;
    this.NewChargesSortAscending = other.NewChargesSortAscending;
    this.NetNewCharges = other.NetNewCharges;
    this.NetNewChargesFetch = other.NetNewChargesFetch;
    this.NetNewChargesSort = other.NetNewChargesSort;
    this.NetNewChargesSortAscending = other.NetNewChargesSortAscending;
    this.TotalDue = other.TotalDue;
    this.TotalDueFetch = other.TotalDueFetch;
    this.TotalDueSort = other.TotalDueSort;
    this.TotalDueSortAscending = other.TotalDueSortAscending;
    this.TotalAdj = other.TotalAdj;
    this.TotalAdjFetch = other.TotalAdjFetch;
    this.TotalAdjSort = other.TotalAdjSort;
    this.TotalAdjSortAscending = other.TotalAdjSortAscending;
    this.TotalPaid = other.TotalPaid;
    this.TotalPaidFetch = other.TotalPaidFetch;
    this.TotalPaidSort = other.TotalPaidSort;
    this.TotalPaidSortAscending = other.TotalPaidSortAscending;
    this.BalanceDue = other.BalanceDue;
    this.BalanceDueFetch = other.BalanceDueFetch;
    this.BalanceDueSort = other.BalanceDueSort;
    this.BalanceDueSortAscending = other.BalanceDueSortAscending;
    this.DisputeAmt = other.DisputeAmt;
    this.DisputeAmtFetch = other.DisputeAmtFetch;
    this.DisputeAmtSort = other.DisputeAmtSort;
    this.DisputeAmtSortAscending = other.DisputeAmtSortAscending;
    this.LateExemptCharges = other.LateExemptCharges;
    this.LateExemptChargesFetch = other.LateExemptChargesFetch;
    this.LateExemptChargesSort = other.LateExemptChargesSort;
    this.LateExemptChargesSortAscending = other.LateExemptChargesSortAscending;
    this.CollectionIndicator = other.CollectionIndicator;
    this.CollectionIndicatorFetch = other.CollectionIndicatorFetch;
    this.CollectionIndicatorSort = other.CollectionIndicatorSort;
    this.CollectionIndicatorSortAscending = other.CollectionIndicatorSortAscending;
    this.ChgDate = other.ChgDate;
    this.ChgDateFetch = other.ChgDateFetch;
    this.ChgDateSort = other.ChgDateSort;
    this.ChgDateSortAscending = other.ChgDateSortAscending;
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;
    this.GlAmount = other.GlAmount;
    this.GlAmountFetch = other.GlAmountFetch;
    this.GlAmountSort = other.GlAmountSort;
    this.GlAmountSortAscending = other.GlAmountSortAscending;
    this.BalanceConverted = other.BalanceConverted;
    this.BalanceConvertedFetch = other.BalanceConvertedFetch;
    this.BalanceConvertedSort = other.BalanceConvertedSort;
    this.BalanceConvertedSortAscending = other.BalanceConvertedSortAscending;
    this.NewChargeCredits = other.NewChargeCredits;
    this.NewChargeCreditsFetch = other.NewChargeCreditsFetch;
    this.NewChargeCreditsSort = other.NewChargeCreditsSort;
    this.NewChargeCreditsSortAscending = other.NewChargeCreditsSortAscending;
    this.BillSequenceNum = other.BillSequenceNum;
    this.BillSequenceNumFetch = other.BillSequenceNumFetch;
    this.BillSequenceNumSort = other.BillSequenceNumSort;
    this.BillSequenceNumSortAscending = other.BillSequenceNumSortAscending;
    this.ProcessNum = other.ProcessNum;
    this.ProcessNumFetch = other.ProcessNumFetch;
    this.ProcessNumSort = other.ProcessNumSort;
    this.ProcessNumCaseInsensitive = other.ProcessNumCaseInsensitive;
    this.ProcessNumSortAscending = other.ProcessNumSortAscending;
    this.PrevBillRefno = other.PrevBillRefno;
    this.PrevBillRefnoFetch = other.PrevBillRefnoFetch;
    this.PrevBillRefnoSort = other.PrevBillRefnoSort;
    this.PrevBillRefnoSortAscending = other.PrevBillRefnoSortAscending;
    this.PrevBillRefResets = other.PrevBillRefResets;
    this.PrevBillRefResetsFetch = other.PrevBillRefResetsFetch;
    this.PrevBillRefResetsSort = other.PrevBillRefResetsSort;
    this.PrevBillRefResetsSortAscending = other.PrevBillRefResetsSortAscending;
    this.PrevBalanceRefno = other.PrevBalanceRefno;
    this.PrevBalanceRefnoFetch = other.PrevBalanceRefnoFetch;
    this.PrevBalanceRefnoSort = other.PrevBalanceRefnoSort;
    this.PrevBalanceRefnoSortAscending = other.PrevBalanceRefnoSortAscending;
    this.PrevBalanceRefResets = other.PrevBalanceRefResets;
    this.PrevBalanceRefResetsFetch = other.PrevBalanceRefResetsFetch;
    this.PrevBalanceRefResetsSort = other.PrevBalanceRefResetsSort;
    this.PrevBalanceRefResetsSortAscending = other.PrevBalanceRefResetsSortAscending;
    this.Zip = other.Zip;
    this.ZipFetch = other.ZipFetch;
    this.ZipSort = other.ZipSort;
    this.ZipCaseInsensitive = other.ZipCaseInsensitive;
    this.ZipSortAscending = other.ZipSortAscending;
    this.FromDate = other.FromDate;
    this.FromDateFetch = other.FromDateFetch;
    this.FromDateSort = other.FromDateSort;
    this.FromDateSortAscending = other.FromDateSortAscending;
    this.ToDate = other.ToDate;
    this.ToDateFetch = other.ToDateFetch;
    this.ToDateSort = other.ToDateSort;
    this.ToDateSortAscending = other.ToDateSortAscending;
    this.NextToDate = other.NextToDate;
    this.NextToDateFetch = other.NextToDateFetch;
    this.NextToDateSort = other.NextToDateSort;
    this.NextToDateSortAscending = other.NextToDateSortAscending;
    this.PrepDate = other.PrepDate;
    this.PrepDateFetch = other.PrepDateFetch;
    this.PrepDateSort = other.PrepDateSort;
    this.PrepDateSortAscending = other.PrepDateSortAscending;
    this.TaxDate = other.TaxDate;
    this.TaxDateFetch = other.TaxDateFetch;
    this.TaxDateSort = other.TaxDateSort;
    this.TaxDateSortAscending = other.TaxDateSortAscending;
    this.StatementDate = other.StatementDate;
    this.StatementDateFetch = other.StatementDateFetch;
    this.StatementDateSort = other.StatementDateSort;
    this.StatementDateSortAscending = other.StatementDateSortAscending;
    this.PaymentDueDate = other.PaymentDueDate;
    this.PaymentDueDateFetch = other.PaymentDueDateFetch;
    this.PaymentDueDateSort = other.PaymentDueDateSort;
    this.PaymentDueDateSortAscending = other.PaymentDueDateSortAscending;
    this.PrevPpdd = other.PrevPpdd;
    this.PrevPpddFetch = other.PrevPpddFetch;
    this.PrevPpddSort = other.PrevPpddSort;
    this.PrevPpddSortAscending = other.PrevPpddSortAscending;
    this.PrevCutoffDate = other.PrevCutoffDate;
    this.PrevCutoffDateFetch = other.PrevCutoffDateFetch;
    this.PrevCutoffDateSort = other.PrevCutoffDateSort;
    this.PrevCutoffDateSortAscending = other.PrevCutoffDateSortAscending;
    this.BillPeriod = other.BillPeriod;
    this.BillPeriodFetch = other.BillPeriodFetch;
    this.BillPeriodSort = other.BillPeriodSort;
    this.BillPeriodCaseInsensitive = other.BillPeriodCaseInsensitive;
    this.BillPeriodSortAscending = other.BillPeriodSortAscending;
    this.PayMethod = other.PayMethod;
    this.PayMethodFetch = other.PayMethodFetch;
    this.PayMethodSort = other.PayMethodSort;
    this.PayMethodSortAscending = other.PayMethodSortAscending;
    this.BillDispMeth = other.BillDispMeth;
    this.BillDispMethFetch = other.BillDispMethFetch;
    this.BillDispMethSort = other.BillDispMethSort;
    this.BillDispMethSortAscending = other.BillDispMethSortAscending;
    this.TaxJournalStatus = other.TaxJournalStatus;
    this.TaxJournalStatusFetch = other.TaxJournalStatusFetch;
    this.TaxJournalStatusSort = other.TaxJournalStatusSort;
    this.TaxJournalStatusSortAscending = other.TaxJournalStatusSortAscending;
    this.AccountStatus = other.AccountStatus;
    this.AccountStatusFetch = other.AccountStatusFetch;
    this.AccountStatusSort = other.AccountStatusSort;
    this.AccountStatusSortAscending = other.AccountStatusSortAscending;
    this.ImageReq = other.ImageReq;
    this.ImageReqFetch = other.ImageReqFetch;
    this.ImageReqSort = other.ImageReqSort;
    this.ImageReqSortAscending = other.ImageReqSortAscending;
    this.ImageDone = other.ImageDone;
    this.ImageDoneFetch = other.ImageDoneFetch;
    this.ImageDoneSort = other.ImageDoneSort;
    this.ImageDoneSortAscending = other.ImageDoneSortAscending;
    this.SpecialCode = other.SpecialCode;
    this.SpecialCodeFetch = other.SpecialCodeFetch;
    this.SpecialCodeSort = other.SpecialCodeSort;
    this.SpecialCodeSortAscending = other.SpecialCodeSortAscending;
    this.PrepTask = other.PrepTask;
    this.PrepTaskFetch = other.PrepTaskFetch;
    this.PrepTaskSort = other.PrepTaskSort;
    this.PrepTaskCaseInsensitive = other.PrepTaskCaseInsensitive;
    this.PrepTaskSortAscending = other.PrepTaskSortAscending;
    this.PrepStatus = other.PrepStatus;
    this.PrepStatusFetch = other.PrepStatusFetch;
    this.PrepStatusSort = other.PrepStatusSort;
    this.PrepStatusSortAscending = other.PrepStatusSortAscending;
    this.FormatStatus = other.FormatStatus;
    this.FormatStatusFetch = other.FormatStatusFetch;
    this.FormatStatusSort = other.FormatStatusSort;
    this.FormatStatusSortAscending = other.FormatStatusSortAscending;
    this.DispatchCount = other.DispatchCount;
    this.DispatchCountFetch = other.DispatchCountFetch;
    this.DispatchCountSort = other.DispatchCountSort;
    this.DispatchCountSortAscending = other.DispatchCountSortAscending;
    this.DispatchDate = other.DispatchDate;
    this.DispatchDateFetch = other.DispatchDateFetch;
    this.DispatchDateSort = other.DispatchDateSort;
    this.DispatchDateSortAscending = other.DispatchDateSortAscending;
    this.FileName = other.FileName;
    this.FileNameFetch = other.FileNameFetch;
    this.FileNameSort = other.FileNameSort;
    this.FileNameCaseInsensitive = other.FileNameCaseInsensitive;
    this.FileNameSortAscending = other.FileNameSortAscending;
    this.StartOffset = other.StartOffset;
    this.StartOffsetFetch = other.StartOffsetFetch;
    this.StartOffsetSort = other.StartOffsetSort;
    this.StartOffsetSortAscending = other.StartOffsetSortAscending;
    this.EndOffset = other.EndOffset;
    this.EndOffsetFetch = other.EndOffsetFetch;
    this.EndOffsetSort = other.EndOffsetSort;
    this.EndOffsetSortAscending = other.EndOffsetSortAscending;
    this.PageCount = other.PageCount;
    this.PageCountFetch = other.PageCountFetch;
    this.PageCountSort = other.PageCountSort;
    this.PageCountSortAscending = other.PageCountSortAscending;
    this.BillHoldCode = other.BillHoldCode;
    this.BillHoldCodeFetch = other.BillHoldCodeFetch;
    this.BillHoldCodeSort = other.BillHoldCodeSort;
    this.BillHoldCodeSortAscending = other.BillHoldCodeSortAscending;
    this.PrepErrorCode = other.PrepErrorCode;
    this.PrepErrorCodeFetch = other.PrepErrorCodeFetch;
    this.PrepErrorCodeSort = other.PrepErrorCodeSort;
    this.PrepErrorCodeSortAscending = other.PrepErrorCodeSortAscending;
    this.FormatErrorCode = other.FormatErrorCode;
    this.FormatErrorCodeFetch = other.FormatErrorCodeFetch;
    this.FormatErrorCodeSort = other.FormatErrorCodeSort;
    this.FormatErrorCodeSortAscending = other.FormatErrorCodeSortAscending;
    this.BackoutStatus = other.BackoutStatus;
    this.BackoutStatusFetch = other.BackoutStatusFetch;
    this.BackoutStatusSort = other.BackoutStatusSort;
    this.BackoutStatusSortAscending = other.BackoutStatusSortAscending;
    this.CopyType = other.CopyType;
    this.CopyTypeFetch = other.CopyTypeFetch;
    this.CopyTypeSort = other.CopyTypeSort;
    this.CopyTypeSortAscending = other.CopyTypeSortAscending;
    this.OrigBillRefno = other.OrigBillRefno;
    this.OrigBillRefnoFetch = other.OrigBillRefnoFetch;
    this.OrigBillRefnoSort = other.OrigBillRefnoSort;
    this.OrigBillRefnoSortAscending = other.OrigBillRefnoSortAscending;
    this.OrigBillRefResets = other.OrigBillRefResets;
    this.OrigBillRefResetsFetch = other.OrigBillRefResetsFetch;
    this.OrigBillRefResetsSort = other.OrigBillRefResetsSort;
    this.OrigBillRefResetsSortAscending = other.OrigBillRefResetsSortAscending;
    this.CollectionHistory = other.CollectionHistory;
    this.CollectionHistoryFetch = other.CollectionHistoryFetch;
    this.CollectionHistorySort = other.CollectionHistorySort;
    this.CollectionHistoryCaseInsensitive = other.CollectionHistoryCaseInsensitive;
    this.CollectionHistorySortAscending = other.CollectionHistorySortAscending;
    this.JnlEarnedThruDt = other.JnlEarnedThruDt;
    this.JnlEarnedThruDtFetch = other.JnlEarnedThruDtFetch;
    this.JnlEarnedThruDtSort = other.JnlEarnedThruDtSort;
    this.JnlEarnedThruDtSortAscending = other.JnlEarnedThruDtSortAscending;
    this.JnlStatus = other.JnlStatus;
    this.JnlStatusFetch = other.JnlStatusFetch;
    this.JnlStatusSort = other.JnlStatusSort;
    this.JnlStatusSortAscending = other.JnlStatusSortAscending;
    this.TestFlag = other.TestFlag;
    this.TestFlagFetch = other.TestFlagFetch;
    this.TestFlagSort = other.TestFlagSort;
    this.TestFlagSortAscending = other.TestFlagSortAscending;
    this.ArchFlag = other.ArchFlag;
    this.ArchFlagFetch = other.ArchFlagFetch;
    this.ArchFlagSort = other.ArchFlagSort;
    this.ArchFlagSortAscending = other.ArchFlagSortAscending;
    this.InterimBillFlag = other.InterimBillFlag;
    this.InterimBillFlagFetch = other.InterimBillFlagFetch;
    this.InterimBillFlagSort = other.InterimBillFlagSort;
    this.InterimBillFlagSortAscending = other.InterimBillFlagSortAscending;
    this.IncludeNrc = other.IncludeNrc;
    this.IncludeNrcFetch = other.IncludeNrcFetch;
    this.IncludeNrcSort = other.IncludeNrcSort;
    this.IncludeNrcSortAscending = other.IncludeNrcSortAscending;
    this.IncludeRc = other.IncludeRc;
    this.IncludeRcFetch = other.IncludeRcFetch;
    this.IncludeRcSort = other.IncludeRcSort;
    this.IncludeRcSortAscending = other.IncludeRcSortAscending;
    this.IncludeAdj = other.IncludeAdj;
    this.IncludeAdjFetch = other.IncludeAdjFetch;
    this.IncludeAdjSort = other.IncludeAdjSort;
    this.IncludeAdjSortAscending = other.IncludeAdjSortAscending;
    this.IncludeUsage = other.IncludeUsage;
    this.IncludeUsageFetch = other.IncludeUsageFetch;
    this.IncludeUsageSort = other.IncludeUsageSort;
    this.IncludeUsageSortAscending = other.IncludeUsageSortAscending;
    this.IncludePayment = other.IncludePayment;
    this.IncludePaymentFetch = other.IncludePaymentFetch;
    this.IncludePaymentSort = other.IncludePaymentSort;
    this.IncludePaymentSortAscending = other.IncludePaymentSortAscending;
    this.LanguageCode = other.LanguageCode;
    this.LanguageCodeFetch = other.LanguageCodeFetch;
    this.LanguageCodeSort = other.LanguageCodeSort;
    this.LanguageCodeSortAscending = other.LanguageCodeSortAscending;
    this.BillConverted = other.BillConverted;
    this.BillConvertedFetch = other.BillConvertedFetch;
    this.BillConvertedSort = other.BillConvertedSort;
    this.BillConvertedSortAscending = other.BillConvertedSortAscending;
    this.WarmBillFlag = other.WarmBillFlag;
    this.WarmBillFlagFetch = other.WarmBillFlagFetch;
    this.WarmBillFlagSort = other.WarmBillFlagSort;
    this.WarmBillFlagSortAscending = other.WarmBillFlagSortAscending;
    this.BillOrderNumber = other.BillOrderNumber;
    this.BillOrderNumberFetch = other.BillOrderNumberFetch;
    this.BillOrderNumberSort = other.BillOrderNumberSort;
    this.BillOrderNumberCaseInsensitive = other.BillOrderNumberCaseInsensitive;
    this.BillOrderNumberSortAscending = other.BillOrderNumberSortAscending;
    this.BillFmtOpt = other.BillFmtOpt;
    this.BillFmtOptFetch = other.BillFmtOptFetch;
    this.BillFmtOptSort = other.BillFmtOptSort;
    this.BillFmtOptSortAscending = other.BillFmtOptSortAscending;
    this.DocumentServerId = other.DocumentServerId;
    this.DocumentServerIdFetch = other.DocumentServerIdFetch;
    this.DocumentServerIdSort = other.DocumentServerIdSort;
    this.DocumentServerIdSortAscending = other.DocumentServerIdSortAscending;  }
  /** get the filter for this object's key
   * @return InvoiceObjectKeyFilter
   */
  public InvoiceObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (InvoiceObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountExternalIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new InvoiceObjectKeyFilter ();
    this.Key.AccountExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountExternalIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountExternalIdFetch;
  }
  /** Set the SortOrder for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountExternalIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new InvoiceObjectKeyFilter ();
    this.Key.AccountExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountExternalIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountExternalIdSort;
  }
  /** Set the sort direction for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountExternalIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new InvoiceObjectKeyFilter ();
    this.Key.AccountExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountExternalIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountExternalIdSortAscending;
  }
  /** Set the case insensitive for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAccountExternalIdCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new InvoiceObjectKeyFilter ();
    this.Key.AccountExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is case insensitive
   */
  public boolean getAccountExternalIdCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.AccountExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountExternalIdFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new InvoiceObjectKeyFilter ();
    this.Key.AccountExternalId = value;
  }
  /** Retrieve filter for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAccountExternalIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountExternalId;
  }
  /** Set the field level Fetch value for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountExternalIdTypeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new InvoiceObjectKeyFilter ();
    this.Key.AccountExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountExternalIdTypeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountExternalIdTypeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new InvoiceObjectKeyFilter ();
    this.Key.AccountExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountExternalIdTypeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountExternalIdTypeSort;
  }
  /** Set the sort direction for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountExternalIdTypeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new InvoiceObjectKeyFilter ();
    this.Key.AccountExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountExternalIdTypeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new InvoiceObjectKeyFilter ();
    this.Key.AccountExternalIdType = value;
  }
  /** Retrieve filter for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountExternalIdTypeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountExternalIdType;
  }
  /** Set the field level Fetch value for field: BillRefNo (CMF_BALANCE.bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefNoFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new InvoiceObjectKeyFilter ();
    this.Key.BillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefNo (CMF_BALANCE.bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefNoFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BillRefNoFetch;
  }
  /** Set the SortOrder for field: BillRefNo (CMF_BALANCE.bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefNoSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new InvoiceObjectKeyFilter ();
    this.Key.BillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: BillRefNo (CMF_BALANCE.bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefNoSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BillRefNoSort;
  }
  /** Set the sort direction for field: BillRefNo (CMF_BALANCE.bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefNoSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new InvoiceObjectKeyFilter ();
    this.Key.BillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefNo (CMF_BALANCE.bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefNoSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BillRefNoSortAscending;
  }
  /** Set the field level filters for field: BillRefNo (CMF_BALANCE.bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefNoFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new InvoiceObjectKeyFilter ();
    this.Key.BillRefNo = value;
  }
  /** Retrieve filter for field: BillRefNo (CMF_BALANCE.bill_ref_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefNoFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BillRefNo;
  }
  /** Set the field level Fetch value for field: BillRefResets (CMF_BALANCE.bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefResetsFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new InvoiceObjectKeyFilter ();
    this.Key.BillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefResets (CMF_BALANCE.bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefResetsFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BillRefResetsFetch;
  }
  /** Set the SortOrder for field: BillRefResets (CMF_BALANCE.bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefResetsSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new InvoiceObjectKeyFilter ();
    this.Key.BillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: BillRefResets (CMF_BALANCE.bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefResetsSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BillRefResetsSort;
  }
  /** Set the sort direction for field: BillRefResets (CMF_BALANCE.bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefResetsSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new InvoiceObjectKeyFilter ();
    this.Key.BillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefResets (CMF_BALANCE.bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefResetsSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BillRefResetsSortAscending;
  }
  /** Set the field level filters for field: BillRefResets (CMF_BALANCE.bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefResetsFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new InvoiceObjectKeyFilter ();
    this.Key.BillRefResets = value;
  }
  /** Retrieve filter for field: BillRefResets (CMF_BALANCE.bill_ref_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefResetsFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BillRefResets;
  }
  /** Set the field level Fetch value for field: AccountInternalId (CMF_BALANCE.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (CMF_BALANCE.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (CMF_BALANCE.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (CMF_BALANCE.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (CMF_BALANCE.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (CMF_BALANCE.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (CMF_BALANCE.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (CMF_BALANCE.account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountInternalIdFilter () {
    return this.AccountInternalId;
  }

  /**
   * Retrieves the AccountInternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountInternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountInternalIdFilter field
   */
  public String[] getAccountInternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountInternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountInternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountInternalIdFilter filter value from a formatted string
   *
   * @param _value the AccountInternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountInternalIdFilter filter field
   */
  public void setAccountInternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
    try {
      this.setAccountInternalIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CurrencyCode (CMF_BALANCE.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (CMF_BALANCE.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (CMF_BALANCE.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (CMF_BALANCE.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (CMF_BALANCE.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (CMF_BALANCE.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (CMF_BALANCE.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (CMF_BALANCE.currency_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCurrencyCodeFilter () {
    return this.CurrencyCode;
  }

  /**
   * Retrieves the CurrencyCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CurrencyCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyCodeFilter field
   */
  public String[] getCurrencyCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCurrencyCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CurrencyCodeFilter filter value from a formatted string
   *
   * @param _value the CurrencyCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CurrencyCodeFilter filter field
   */
  public void setCurrencyCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
    try {
      this.setCurrencyCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PayDueDate (CMF_BALANCE.ppdd_date)
   * @param fetch whether to fetch this field or not
   */
  public void setPayDueDateFetch (boolean fetch) {
    this.PayDueDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: PayDueDate (CMF_BALANCE.ppdd_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getPayDueDateFetch () {
    return this.PayDueDateFetch;
  }
  /** Set the SortOrder for field: PayDueDate (CMF_BALANCE.ppdd_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPayDueDateSortOrder (Integer value) {
    this.PayDueDateSort = value;
  }
  /** Retrieve SortOrder for field: PayDueDate (CMF_BALANCE.ppdd_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPayDueDateSortOrder () {
    return this.PayDueDateSort;
  }
  /** Set the sort direction for field: PayDueDate (CMF_BALANCE.ppdd_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPayDueDateSortDirection (boolean ascending) {
    this.PayDueDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PayDueDate (CMF_BALANCE.ppdd_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPayDueDateSortDirection () {
    return this.PayDueDateSortAscending;
  }
  /** Set the field level filters for field: PayDueDate (CMF_BALANCE.ppdd_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPayDueDateFilter (DateFilter[] value) throws ServiceException {
    this.PayDueDate = value;
  }
  /** Retrieve filter for field: PayDueDate (CMF_BALANCE.ppdd_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPayDueDateFilter () {
    return this.PayDueDate;
  }

  /**
   * Retrieves the PayDueDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PayDueDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayDueDateFilter field
   */
  public String[] getPayDueDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayDueDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPayDueDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayDueDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayDueDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayDueDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PayDueDateFilter filter value from a formatted string
   *
   * @param _value the PayDueDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PayDueDateFilter filter field
   */
  public void setPayDueDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayDueDateFilterFromFormattedString");
    try {
      this.setPayDueDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayDueDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayDueDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayDueDateFilterFromFormattedString");
  }

  /**
   * Retrieves the PayDueDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PayDueDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayDueDateFilter field
   */
  public String[] getPayDueDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayDueDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPayDueDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayDueDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayDueDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayDueDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PayDueDateFilter filter value from a formatted string
   *
   * @param _value the PayDueDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PayDueDateFilter filter field
   */
  public void setPayDueDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayDueDateFilterFromFormattedDateTimeString");
    try {
      this.setPayDueDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayDueDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayDueDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayDueDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: OrigPayDueDate (CMF_BALANCE.orig_ppdd_date)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigPayDueDateFetch (boolean fetch) {
    this.OrigPayDueDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigPayDueDate (CMF_BALANCE.orig_ppdd_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigPayDueDateFetch () {
    return this.OrigPayDueDateFetch;
  }
  /** Set the SortOrder for field: OrigPayDueDate (CMF_BALANCE.orig_ppdd_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigPayDueDateSortOrder (Integer value) {
    this.OrigPayDueDateSort = value;
  }
  /** Retrieve SortOrder for field: OrigPayDueDate (CMF_BALANCE.orig_ppdd_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigPayDueDateSortOrder () {
    return this.OrigPayDueDateSort;
  }
  /** Set the sort direction for field: OrigPayDueDate (CMF_BALANCE.orig_ppdd_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigPayDueDateSortDirection (boolean ascending) {
    this.OrigPayDueDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigPayDueDate (CMF_BALANCE.orig_ppdd_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigPayDueDateSortDirection () {
    return this.OrigPayDueDateSortAscending;
  }
  /** Set the field level filters for field: OrigPayDueDate (CMF_BALANCE.orig_ppdd_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigPayDueDateFilter (DateFilter[] value) throws ServiceException {
    this.OrigPayDueDate = value;
  }
  /** Retrieve filter for field: OrigPayDueDate (CMF_BALANCE.orig_ppdd_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getOrigPayDueDateFilter () {
    return this.OrigPayDueDate;
  }

  /**
   * Retrieves the OrigPayDueDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigPayDueDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigPayDueDateFilter field
   */
  public String[] getOrigPayDueDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigPayDueDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigPayDueDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigPayDueDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigPayDueDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigPayDueDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigPayDueDateFilter filter value from a formatted string
   *
   * @param _value the OrigPayDueDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigPayDueDateFilter filter field
   */
  public void setOrigPayDueDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigPayDueDateFilterFromFormattedString");
    try {
      this.setOrigPayDueDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigPayDueDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigPayDueDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigPayDueDateFilterFromFormattedString");
  }

  /**
   * Retrieves the OrigPayDueDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigPayDueDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigPayDueDateFilter field
   */
  public String[] getOrigPayDueDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigPayDueDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigPayDueDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigPayDueDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigPayDueDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigPayDueDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the OrigPayDueDateFilter filter value from a formatted string
   *
   * @param _value the OrigPayDueDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigPayDueDateFilter filter field
   */
  public void setOrigPayDueDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigPayDueDateFilterFromFormattedDateTimeString");
    try {
      this.setOrigPayDueDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigPayDueDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigPayDueDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigPayDueDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ClosedDate (CMF_BALANCE.closed_date)
   * @param fetch whether to fetch this field or not
   */
  public void setClosedDateFetch (boolean fetch) {
    this.ClosedDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ClosedDate (CMF_BALANCE.closed_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getClosedDateFetch () {
    return this.ClosedDateFetch;
  }
  /** Set the SortOrder for field: ClosedDate (CMF_BALANCE.closed_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setClosedDateSortOrder (Integer value) {
    this.ClosedDateSort = value;
  }
  /** Retrieve SortOrder for field: ClosedDate (CMF_BALANCE.closed_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getClosedDateSortOrder () {
    return this.ClosedDateSort;
  }
  /** Set the sort direction for field: ClosedDate (CMF_BALANCE.closed_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setClosedDateSortDirection (boolean ascending) {
    this.ClosedDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ClosedDate (CMF_BALANCE.closed_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getClosedDateSortDirection () {
    return this.ClosedDateSortAscending;
  }
  /** Set the field level filters for field: ClosedDate (CMF_BALANCE.closed_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setClosedDateFilter (DateFilter[] value) throws ServiceException {
    this.ClosedDate = value;
  }
  /** Retrieve filter for field: ClosedDate (CMF_BALANCE.closed_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getClosedDateFilter () {
    return this.ClosedDate;
  }

  /**
   * Retrieves the ClosedDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ClosedDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ClosedDateFilter field
   */
  public String[] getClosedDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getClosedDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getClosedDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getClosedDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ClosedDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getClosedDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ClosedDateFilter filter value from a formatted string
   *
   * @param _value the ClosedDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ClosedDateFilter filter field
   */
  public void setClosedDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setClosedDateFilterFromFormattedString");
    try {
      this.setClosedDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ClosedDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setClosedDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setClosedDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ClosedDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ClosedDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ClosedDateFilter field
   */
  public String[] getClosedDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getClosedDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getClosedDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getClosedDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ClosedDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getClosedDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ClosedDateFilter filter value from a formatted string
   *
   * @param _value the ClosedDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ClosedDateFilter filter field
   */
  public void setClosedDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setClosedDateFilterFromFormattedDateTimeString");
    try {
      this.setClosedDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ClosedDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setClosedDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setClosedDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: NewCharges (CMF_BALANCE.new_charges)
   * @param fetch whether to fetch this field or not
   */
  public void setNewChargesFetch (boolean fetch) {
    this.NewChargesFetch = fetch;
  }
  /** Retrieve Fetch value for field: NewCharges (CMF_BALANCE.new_charges)
   * @return boolean the Fetch value for this field
   */
  public boolean getNewChargesFetch () {
    return this.NewChargesFetch;
  }
  /** Set the SortOrder for field: NewCharges (CMF_BALANCE.new_charges)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNewChargesSortOrder (Integer value) {
    this.NewChargesSort = value;
  }
  /** Retrieve SortOrder for field: NewCharges (CMF_BALANCE.new_charges)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNewChargesSortOrder () {
    return this.NewChargesSort;
  }
  /** Set the sort direction for field: NewCharges (CMF_BALANCE.new_charges)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNewChargesSortDirection (boolean ascending) {
    this.NewChargesSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NewCharges (CMF_BALANCE.new_charges)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNewChargesSortDirection () {
    return this.NewChargesSortAscending;
  }
  /** Set the field level filters for field: NewCharges (CMF_BALANCE.new_charges)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNewChargesFilter (BigIntegerFilter[] value) throws ServiceException {
    this.NewCharges = value;
  }
  /** Retrieve filter for field: NewCharges (CMF_BALANCE.new_charges)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getNewChargesFilter () {
    return this.NewCharges;
  }

  /**
   * Retrieves the NewChargesFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NewChargesFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NewChargesFilter field
   */
  public String[] getNewChargesFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNewChargesFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNewChargesFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNewChargesFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NewChargesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNewChargesFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NewChargesFilter filter value from a formatted string
   *
   * @param _value the NewChargesFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NewChargesFilter filter field
   */
  public void setNewChargesFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNewChargesFilterFromFormattedString");
    try {
      this.setNewChargesFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NewChargesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNewChargesFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNewChargesFilterFromFormattedString");
  }

  /**
   * Sets the NewChargesFilter filter value from a formatted string
   *
   * @param _value the NewChargesFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NewChargesFilter filter field
   */
  public void setNewChargesFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNewChargesFilterFromFormattedCurrencyString");
    try {
      this.setNewChargesFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NewChargesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNewChargesFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNewChargesFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the NewChargesFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NewChargesFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the NewChargesFilter field
   */

  public String[] getNewChargesFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNewChargesFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNewChargesFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNewChargesFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NewChargesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNewChargesFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: NetNewCharges (CMF_BALANCE.net_new_charges)
   * @param fetch whether to fetch this field or not
   */
  public void setNetNewChargesFetch (boolean fetch) {
    this.NetNewChargesFetch = fetch;
  }
  /** Retrieve Fetch value for field: NetNewCharges (CMF_BALANCE.net_new_charges)
   * @return boolean the Fetch value for this field
   */
  public boolean getNetNewChargesFetch () {
    return this.NetNewChargesFetch;
  }
  /** Set the SortOrder for field: NetNewCharges (CMF_BALANCE.net_new_charges)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNetNewChargesSortOrder (Integer value) {
    this.NetNewChargesSort = value;
  }
  /** Retrieve SortOrder for field: NetNewCharges (CMF_BALANCE.net_new_charges)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNetNewChargesSortOrder () {
    return this.NetNewChargesSort;
  }
  /** Set the sort direction for field: NetNewCharges (CMF_BALANCE.net_new_charges)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNetNewChargesSortDirection (boolean ascending) {
    this.NetNewChargesSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NetNewCharges (CMF_BALANCE.net_new_charges)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNetNewChargesSortDirection () {
    return this.NetNewChargesSortAscending;
  }
  /** Set the field level filters for field: NetNewCharges (CMF_BALANCE.net_new_charges)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNetNewChargesFilter (BigIntegerFilter[] value) throws ServiceException {
    this.NetNewCharges = value;
  }
  /** Retrieve filter for field: NetNewCharges (CMF_BALANCE.net_new_charges)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getNetNewChargesFilter () {
    return this.NetNewCharges;
  }

  /**
   * Retrieves the NetNewChargesFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NetNewChargesFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NetNewChargesFilter field
   */
  public String[] getNetNewChargesFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetNewChargesFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNetNewChargesFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNetNewChargesFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NetNewChargesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNetNewChargesFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NetNewChargesFilter filter value from a formatted string
   *
   * @param _value the NetNewChargesFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NetNewChargesFilter filter field
   */
  public void setNetNewChargesFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNetNewChargesFilterFromFormattedString");
    try {
      this.setNetNewChargesFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NetNewChargesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNetNewChargesFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNetNewChargesFilterFromFormattedString");
  }

  /**
   * Sets the NetNewChargesFilter filter value from a formatted string
   *
   * @param _value the NetNewChargesFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NetNewChargesFilter filter field
   */
  public void setNetNewChargesFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNetNewChargesFilterFromFormattedCurrencyString");
    try {
      this.setNetNewChargesFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NetNewChargesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNetNewChargesFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNetNewChargesFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the NetNewChargesFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NetNewChargesFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the NetNewChargesFilter field
   */

  public String[] getNetNewChargesFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetNewChargesFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNetNewChargesFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNetNewChargesFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NetNewChargesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNetNewChargesFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: TotalDue (CMF_BALANCE.total_due)
   * @param fetch whether to fetch this field or not
   */
  public void setTotalDueFetch (boolean fetch) {
    this.TotalDueFetch = fetch;
  }
  /** Retrieve Fetch value for field: TotalDue (CMF_BALANCE.total_due)
   * @return boolean the Fetch value for this field
   */
  public boolean getTotalDueFetch () {
    return this.TotalDueFetch;
  }
  /** Set the SortOrder for field: TotalDue (CMF_BALANCE.total_due)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTotalDueSortOrder (Integer value) {
    this.TotalDueSort = value;
  }
  /** Retrieve SortOrder for field: TotalDue (CMF_BALANCE.total_due)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTotalDueSortOrder () {
    return this.TotalDueSort;
  }
  /** Set the sort direction for field: TotalDue (CMF_BALANCE.total_due)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTotalDueSortDirection (boolean ascending) {
    this.TotalDueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TotalDue (CMF_BALANCE.total_due)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTotalDueSortDirection () {
    return this.TotalDueSortAscending;
  }
  /** Set the field level filters for field: TotalDue (CMF_BALANCE.total_due)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTotalDueFilter (BigIntegerFilter[] value) throws ServiceException {
    this.TotalDue = value;
  }
  /** Retrieve filter for field: TotalDue (CMF_BALANCE.total_due)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTotalDueFilter () {
    return this.TotalDue;
  }

  /**
   * Retrieves the TotalDueFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalDueFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalDueFilter field
   */
  public String[] getTotalDueFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalDueFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalDueFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalDueFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalDueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalDueFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TotalDueFilter filter value from a formatted string
   *
   * @param _value the TotalDueFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalDueFilter filter field
   */
  public void setTotalDueFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalDueFilterFromFormattedString");
    try {
      this.setTotalDueFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalDueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalDueFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalDueFilterFromFormattedString");
  }

  /**
   * Sets the TotalDueFilter filter value from a formatted string
   *
   * @param _value the TotalDueFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalDueFilter filter field
   */
  public void setTotalDueFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalDueFilterFromFormattedCurrencyString");
    try {
      this.setTotalDueFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalDueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalDueFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalDueFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the TotalDueFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalDueFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalDueFilter field
   */

  public String[] getTotalDueFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalDueFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalDueFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalDueFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalDueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalDueFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: TotalAdj (CMF_BALANCE.total_adj)
   * @param fetch whether to fetch this field or not
   */
  public void setTotalAdjFetch (boolean fetch) {
    this.TotalAdjFetch = fetch;
  }
  /** Retrieve Fetch value for field: TotalAdj (CMF_BALANCE.total_adj)
   * @return boolean the Fetch value for this field
   */
  public boolean getTotalAdjFetch () {
    return this.TotalAdjFetch;
  }
  /** Set the SortOrder for field: TotalAdj (CMF_BALANCE.total_adj)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTotalAdjSortOrder (Integer value) {
    this.TotalAdjSort = value;
  }
  /** Retrieve SortOrder for field: TotalAdj (CMF_BALANCE.total_adj)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTotalAdjSortOrder () {
    return this.TotalAdjSort;
  }
  /** Set the sort direction for field: TotalAdj (CMF_BALANCE.total_adj)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTotalAdjSortDirection (boolean ascending) {
    this.TotalAdjSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TotalAdj (CMF_BALANCE.total_adj)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTotalAdjSortDirection () {
    return this.TotalAdjSortAscending;
  }
  /** Set the field level filters for field: TotalAdj (CMF_BALANCE.total_adj)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTotalAdjFilter (BigIntegerFilter[] value) throws ServiceException {
    this.TotalAdj = value;
  }
  /** Retrieve filter for field: TotalAdj (CMF_BALANCE.total_adj)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTotalAdjFilter () {
    return this.TotalAdj;
  }

  /**
   * Retrieves the TotalAdjFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalAdjFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalAdjFilter field
   */
  public String[] getTotalAdjFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAdjFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalAdjFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalAdjFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAdjFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalAdjFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TotalAdjFilter filter value from a formatted string
   *
   * @param _value the TotalAdjFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalAdjFilter filter field
   */
  public void setTotalAdjFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalAdjFilterFromFormattedString");
    try {
      this.setTotalAdjFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAdjFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalAdjFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalAdjFilterFromFormattedString");
  }

  /**
   * Sets the TotalAdjFilter filter value from a formatted string
   *
   * @param _value the TotalAdjFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalAdjFilter filter field
   */
  public void setTotalAdjFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalAdjFilterFromFormattedCurrencyString");
    try {
      this.setTotalAdjFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAdjFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalAdjFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalAdjFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the TotalAdjFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalAdjFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalAdjFilter field
   */

  public String[] getTotalAdjFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAdjFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalAdjFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalAdjFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAdjFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalAdjFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: TotalPaid (CMF_BALANCE.total_paid)
   * @param fetch whether to fetch this field or not
   */
  public void setTotalPaidFetch (boolean fetch) {
    this.TotalPaidFetch = fetch;
  }
  /** Retrieve Fetch value for field: TotalPaid (CMF_BALANCE.total_paid)
   * @return boolean the Fetch value for this field
   */
  public boolean getTotalPaidFetch () {
    return this.TotalPaidFetch;
  }
  /** Set the SortOrder for field: TotalPaid (CMF_BALANCE.total_paid)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTotalPaidSortOrder (Integer value) {
    this.TotalPaidSort = value;
  }
  /** Retrieve SortOrder for field: TotalPaid (CMF_BALANCE.total_paid)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTotalPaidSortOrder () {
    return this.TotalPaidSort;
  }
  /** Set the sort direction for field: TotalPaid (CMF_BALANCE.total_paid)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTotalPaidSortDirection (boolean ascending) {
    this.TotalPaidSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TotalPaid (CMF_BALANCE.total_paid)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTotalPaidSortDirection () {
    return this.TotalPaidSortAscending;
  }
  /** Set the field level filters for field: TotalPaid (CMF_BALANCE.total_paid)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTotalPaidFilter (BigIntegerFilter[] value) throws ServiceException {
    this.TotalPaid = value;
  }
  /** Retrieve filter for field: TotalPaid (CMF_BALANCE.total_paid)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTotalPaidFilter () {
    return this.TotalPaid;
  }

  /**
   * Retrieves the TotalPaidFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalPaidFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalPaidFilter field
   */
  public String[] getTotalPaidFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalPaidFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalPaidFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalPaidFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalPaidFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalPaidFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TotalPaidFilter filter value from a formatted string
   *
   * @param _value the TotalPaidFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalPaidFilter filter field
   */
  public void setTotalPaidFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalPaidFilterFromFormattedString");
    try {
      this.setTotalPaidFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalPaidFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalPaidFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalPaidFilterFromFormattedString");
  }

  /**
   * Sets the TotalPaidFilter filter value from a formatted string
   *
   * @param _value the TotalPaidFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalPaidFilter filter field
   */
  public void setTotalPaidFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalPaidFilterFromFormattedCurrencyString");
    try {
      this.setTotalPaidFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalPaidFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalPaidFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalPaidFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the TotalPaidFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalPaidFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalPaidFilter field
   */

  public String[] getTotalPaidFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalPaidFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalPaidFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalPaidFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalPaidFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalPaidFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: BalanceDue (CMF_BALANCE.balance_due)
   * @param fetch whether to fetch this field or not
   */
  public void setBalanceDueFetch (boolean fetch) {
    this.BalanceDueFetch = fetch;
  }
  /** Retrieve Fetch value for field: BalanceDue (CMF_BALANCE.balance_due)
   * @return boolean the Fetch value for this field
   */
  public boolean getBalanceDueFetch () {
    return this.BalanceDueFetch;
  }
  /** Set the SortOrder for field: BalanceDue (CMF_BALANCE.balance_due)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBalanceDueSortOrder (Integer value) {
    this.BalanceDueSort = value;
  }
  /** Retrieve SortOrder for field: BalanceDue (CMF_BALANCE.balance_due)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBalanceDueSortOrder () {
    return this.BalanceDueSort;
  }
  /** Set the sort direction for field: BalanceDue (CMF_BALANCE.balance_due)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBalanceDueSortDirection (boolean ascending) {
    this.BalanceDueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BalanceDue (CMF_BALANCE.balance_due)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBalanceDueSortDirection () {
    return this.BalanceDueSortAscending;
  }
  /** Set the field level filters for field: BalanceDue (CMF_BALANCE.balance_due)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBalanceDueFilter (BigIntegerFilter[] value) throws ServiceException {
    this.BalanceDue = value;
  }
  /** Retrieve filter for field: BalanceDue (CMF_BALANCE.balance_due)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getBalanceDueFilter () {
    return this.BalanceDue;
  }

  /**
   * Retrieves the BalanceDueFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BalanceDueFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceDueFilter field
   */
  public String[] getBalanceDueFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceDueFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBalanceDueFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceDueFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceDueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceDueFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BalanceDueFilter filter value from a formatted string
   *
   * @param _value the BalanceDueFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceDueFilter filter field
   */
  public void setBalanceDueFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBalanceDueFilterFromFormattedString");
    try {
      this.setBalanceDueFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceDueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceDueFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceDueFilterFromFormattedString");
  }

  /**
   * Sets the BalanceDueFilter filter value from a formatted string
   *
   * @param _value the BalanceDueFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceDueFilter filter field
   */
  public void setBalanceDueFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBalanceDueFilterFromFormattedCurrencyString");
    try {
      this.setBalanceDueFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceDueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceDueFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceDueFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the BalanceDueFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BalanceDueFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceDueFilter field
   */

  public String[] getBalanceDueFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceDueFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBalanceDueFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceDueFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceDueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceDueFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: DisputeAmt (CMF_BALANCE.dispute_amt)
   * @param fetch whether to fetch this field or not
   */
  public void setDisputeAmtFetch (boolean fetch) {
    this.DisputeAmtFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisputeAmt (CMF_BALANCE.dispute_amt)
   * @return boolean the Fetch value for this field
   */
  public boolean getDisputeAmtFetch () {
    return this.DisputeAmtFetch;
  }
  /** Set the SortOrder for field: DisputeAmt (CMF_BALANCE.dispute_amt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisputeAmtSortOrder (Integer value) {
    this.DisputeAmtSort = value;
  }
  /** Retrieve SortOrder for field: DisputeAmt (CMF_BALANCE.dispute_amt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisputeAmtSortOrder () {
    return this.DisputeAmtSort;
  }
  /** Set the sort direction for field: DisputeAmt (CMF_BALANCE.dispute_amt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisputeAmtSortDirection (boolean ascending) {
    this.DisputeAmtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisputeAmt (CMF_BALANCE.dispute_amt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisputeAmtSortDirection () {
    return this.DisputeAmtSortAscending;
  }
  /** Set the field level filters for field: DisputeAmt (CMF_BALANCE.dispute_amt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisputeAmtFilter (BigIntegerFilter[] value) throws ServiceException {
    this.DisputeAmt = value;
  }
  /** Retrieve filter for field: DisputeAmt (CMF_BALANCE.dispute_amt)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getDisputeAmtFilter () {
    return this.DisputeAmt;
  }

  /**
   * Retrieves the DisputeAmtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DisputeAmtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisputeAmtFilter field
   */
  public String[] getDisputeAmtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisputeAmtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDisputeAmtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisputeAmtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisputeAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisputeAmtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DisputeAmtFilter filter value from a formatted string
   *
   * @param _value the DisputeAmtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DisputeAmtFilter filter field
   */
  public void setDisputeAmtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDisputeAmtFilterFromFormattedString");
    try {
      this.setDisputeAmtFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisputeAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisputeAmtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisputeAmtFilterFromFormattedString");
  }

  /**
   * Sets the DisputeAmtFilter filter value from a formatted string
   *
   * @param _value the DisputeAmtFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DisputeAmtFilter filter field
   */
  public void setDisputeAmtFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDisputeAmtFilterFromFormattedCurrencyString");
    try {
      this.setDisputeAmtFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisputeAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisputeAmtFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisputeAmtFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the DisputeAmtFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DisputeAmtFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisputeAmtFilter field
   */

  public String[] getDisputeAmtFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisputeAmtFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDisputeAmtFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisputeAmtFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisputeAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisputeAmtFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: LateExemptCharges (CMF_BALANCE.late_exempt_charges)
   * @param fetch whether to fetch this field or not
   */
  public void setLateExemptChargesFetch (boolean fetch) {
    this.LateExemptChargesFetch = fetch;
  }
  /** Retrieve Fetch value for field: LateExemptCharges (CMF_BALANCE.late_exempt_charges)
   * @return boolean the Fetch value for this field
   */
  public boolean getLateExemptChargesFetch () {
    return this.LateExemptChargesFetch;
  }
  /** Set the SortOrder for field: LateExemptCharges (CMF_BALANCE.late_exempt_charges)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLateExemptChargesSortOrder (Integer value) {
    this.LateExemptChargesSort = value;
  }
  /** Retrieve SortOrder for field: LateExemptCharges (CMF_BALANCE.late_exempt_charges)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLateExemptChargesSortOrder () {
    return this.LateExemptChargesSort;
  }
  /** Set the sort direction for field: LateExemptCharges (CMF_BALANCE.late_exempt_charges)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLateExemptChargesSortDirection (boolean ascending) {
    this.LateExemptChargesSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LateExemptCharges (CMF_BALANCE.late_exempt_charges)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLateExemptChargesSortDirection () {
    return this.LateExemptChargesSortAscending;
  }
  /** Set the field level filters for field: LateExemptCharges (CMF_BALANCE.late_exempt_charges)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLateExemptChargesFilter (BigIntegerFilter[] value) throws ServiceException {
    this.LateExemptCharges = value;
  }
  /** Retrieve filter for field: LateExemptCharges (CMF_BALANCE.late_exempt_charges)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getLateExemptChargesFilter () {
    return this.LateExemptCharges;
  }

  /**
   * Retrieves the LateExemptChargesFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LateExemptChargesFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LateExemptChargesFilter field
   */
  public String[] getLateExemptChargesFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLateExemptChargesFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLateExemptChargesFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLateExemptChargesFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LateExemptChargesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLateExemptChargesFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LateExemptChargesFilter filter value from a formatted string
   *
   * @param _value the LateExemptChargesFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LateExemptChargesFilter filter field
   */
  public void setLateExemptChargesFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLateExemptChargesFilterFromFormattedString");
    try {
      this.setLateExemptChargesFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LateExemptChargesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLateExemptChargesFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLateExemptChargesFilterFromFormattedString");
  }

  /**
   * Sets the LateExemptChargesFilter filter value from a formatted string
   *
   * @param _value the LateExemptChargesFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LateExemptChargesFilter filter field
   */
  public void setLateExemptChargesFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLateExemptChargesFilterFromFormattedCurrencyString");
    try {
      this.setLateExemptChargesFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LateExemptChargesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLateExemptChargesFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLateExemptChargesFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the LateExemptChargesFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LateExemptChargesFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the LateExemptChargesFilter field
   */

  public String[] getLateExemptChargesFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLateExemptChargesFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLateExemptChargesFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLateExemptChargesFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LateExemptChargesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLateExemptChargesFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: CollectionIndicator (CMF_BALANCE.collection_indicator)
   * @param fetch whether to fetch this field or not
   */
  public void setCollectionIndicatorFetch (boolean fetch) {
    this.CollectionIndicatorFetch = fetch;
  }
  /** Retrieve Fetch value for field: CollectionIndicator (CMF_BALANCE.collection_indicator)
   * @return boolean the Fetch value for this field
   */
  public boolean getCollectionIndicatorFetch () {
    return this.CollectionIndicatorFetch;
  }
  /** Set the SortOrder for field: CollectionIndicator (CMF_BALANCE.collection_indicator)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCollectionIndicatorSortOrder (Integer value) {
    this.CollectionIndicatorSort = value;
  }
  /** Retrieve SortOrder for field: CollectionIndicator (CMF_BALANCE.collection_indicator)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCollectionIndicatorSortOrder () {
    return this.CollectionIndicatorSort;
  }
  /** Set the sort direction for field: CollectionIndicator (CMF_BALANCE.collection_indicator)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCollectionIndicatorSortDirection (boolean ascending) {
    this.CollectionIndicatorSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CollectionIndicator (CMF_BALANCE.collection_indicator)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCollectionIndicatorSortDirection () {
    return this.CollectionIndicatorSortAscending;
  }
  /** Set the field level filters for field: CollectionIndicator (CMF_BALANCE.collection_indicator)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCollectionIndicatorFilter (IntegerFilter[] value) throws ServiceException {
    this.CollectionIndicator = value;
  }
  /** Retrieve filter for field: CollectionIndicator (CMF_BALANCE.collection_indicator)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCollectionIndicatorFilter () {
    return this.CollectionIndicator;
  }

  /**
   * Retrieves the CollectionIndicatorFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CollectionIndicatorFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CollectionIndicatorFilter field
   */
  public String[] getCollectionIndicatorFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCollectionIndicatorFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCollectionIndicatorFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCollectionIndicatorFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CollectionIndicatorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCollectionIndicatorFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CollectionIndicatorFilter filter value from a formatted string
   *
   * @param _value the CollectionIndicatorFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CollectionIndicatorFilter filter field
   */
  public void setCollectionIndicatorFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCollectionIndicatorFilterFromFormattedString");
    try {
      this.setCollectionIndicatorFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CollectionIndicatorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCollectionIndicatorFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCollectionIndicatorFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ChgDate (CMF_BALANCE.chg_date)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDateFetch (boolean fetch) {
    this.ChgDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDate (CMF_BALANCE.chg_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDateFetch () {
    return this.ChgDateFetch;
  }
  /** Set the SortOrder for field: ChgDate (CMF_BALANCE.chg_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDateSortOrder (Integer value) {
    this.ChgDateSort = value;
  }
  /** Retrieve SortOrder for field: ChgDate (CMF_BALANCE.chg_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDateSortOrder () {
    return this.ChgDateSort;
  }
  /** Set the sort direction for field: ChgDate (CMF_BALANCE.chg_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDateSortDirection (boolean ascending) {
    this.ChgDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDate (CMF_BALANCE.chg_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDateSortDirection () {
    return this.ChgDateSortAscending;
  }
  /** Set the field level filters for field: ChgDate (CMF_BALANCE.chg_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDateFilter (DateFilter[] value) throws ServiceException {
    this.ChgDate = value;
  }
  /** Retrieve filter for field: ChgDate (CMF_BALANCE.chg_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getChgDateFilter () {
    return this.ChgDate;
  }

  /**
   * Retrieves the ChgDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDateFilter field
   */
  public String[] getChgDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDateFilter filter value from a formatted string
   *
   * @param _value the ChgDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDateFilter filter field
   */
  public void setChgDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFilterFromFormattedString");
    try {
      this.setChgDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ChgDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDateFilter field
   */
  public String[] getChgDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDateFilter filter value from a formatted string
   *
   * @param _value the ChgDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDateFilter filter field
   */
  public void setChgDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
    try {
      this.setChgDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ChgWho (CMF_BALANCE.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (CMF_BALANCE.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (CMF_BALANCE.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (CMF_BALANCE.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (CMF_BALANCE.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (CMF_BALANCE.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (CMF_BALANCE.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (CMF_BALANCE.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (CMF_BALANCE.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (CMF_BALANCE.chg_who)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getChgWhoFilter () {
    return this.ChgWho;
  }

  /**
   * Retrieves the ChgWhoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgWhoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgWhoFilter field
   */
  public String[] getChgWhoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgWhoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgWhoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgWhoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgWhoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgWhoFilter filter value from a formatted string
   *
   * @param _value the ChgWhoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgWhoFilter filter field
   */
  public void setChgWhoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgWhoFilterFromFormattedString");
    try {
      this.setChgWhoFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgWhoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgWhoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgWhoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: GlAmount (CMF_BALANCE.gl_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setGlAmountFetch (boolean fetch) {
    this.GlAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: GlAmount (CMF_BALANCE.gl_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getGlAmountFetch () {
    return this.GlAmountFetch;
  }
  /** Set the SortOrder for field: GlAmount (CMF_BALANCE.gl_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGlAmountSortOrder (Integer value) {
    this.GlAmountSort = value;
  }
  /** Retrieve SortOrder for field: GlAmount (CMF_BALANCE.gl_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGlAmountSortOrder () {
    return this.GlAmountSort;
  }
  /** Set the sort direction for field: GlAmount (CMF_BALANCE.gl_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGlAmountSortDirection (boolean ascending) {
    this.GlAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GlAmount (CMF_BALANCE.gl_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGlAmountSortDirection () {
    return this.GlAmountSortAscending;
  }
  /** Set the field level filters for field: GlAmount (CMF_BALANCE.gl_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGlAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.GlAmount = value;
  }
  /** Retrieve filter for field: GlAmount (CMF_BALANCE.gl_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getGlAmountFilter () {
    return this.GlAmount;
  }

  /**
   * Retrieves the GlAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GlAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GlAmountFilter field
   */
  public String[] getGlAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGlAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGlAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GlAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGlAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GlAmountFilter filter value from a formatted string
   *
   * @param _value the GlAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GlAmountFilter filter field
   */
  public void setGlAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGlAmountFilterFromFormattedString");
    try {
      this.setGlAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GlAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGlAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGlAmountFilterFromFormattedString");
  }

  /**
   * Sets the GlAmountFilter filter value from a formatted string
   *
   * @param _value the GlAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GlAmountFilter filter field
   */
  public void setGlAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGlAmountFilterFromFormattedCurrencyString");
    try {
      this.setGlAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GlAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGlAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGlAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the GlAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GlAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the GlAmountFilter field
   */

  public String[] getGlAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGlAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGlAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GlAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGlAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: BalanceConverted (CMF_BALANCE.converted)
   * @param fetch whether to fetch this field or not
   */
  public void setBalanceConvertedFetch (boolean fetch) {
    this.BalanceConvertedFetch = fetch;
  }
  /** Retrieve Fetch value for field: BalanceConverted (CMF_BALANCE.converted)
   * @return boolean the Fetch value for this field
   */
  public boolean getBalanceConvertedFetch () {
    return this.BalanceConvertedFetch;
  }
  /** Set the SortOrder for field: BalanceConverted (CMF_BALANCE.converted)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBalanceConvertedSortOrder (Integer value) {
    this.BalanceConvertedSort = value;
  }
  /** Retrieve SortOrder for field: BalanceConverted (CMF_BALANCE.converted)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBalanceConvertedSortOrder () {
    return this.BalanceConvertedSort;
  }
  /** Set the sort direction for field: BalanceConverted (CMF_BALANCE.converted)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBalanceConvertedSortDirection (boolean ascending) {
    this.BalanceConvertedSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BalanceConverted (CMF_BALANCE.converted)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBalanceConvertedSortDirection () {
    return this.BalanceConvertedSortAscending;
  }
  /** Set the field level filters for field: BalanceConverted (CMF_BALANCE.converted)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBalanceConvertedFilter (IntegerFilter[] value) throws ServiceException {
    this.BalanceConverted = value;
  }
  /** Retrieve filter for field: BalanceConverted (CMF_BALANCE.converted)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBalanceConvertedFilter () {
    return this.BalanceConverted;
  }

  /**
   * Retrieves the BalanceConvertedFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BalanceConvertedFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceConvertedFilter field
   */
  public String[] getBalanceConvertedFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceConvertedFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBalanceConvertedFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceConvertedFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceConvertedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceConvertedFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BalanceConvertedFilter filter value from a formatted string
   *
   * @param _value the BalanceConvertedFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceConvertedFilter filter field
   */
  public void setBalanceConvertedFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBalanceConvertedFilterFromFormattedString");
    try {
      this.setBalanceConvertedFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceConvertedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceConvertedFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceConvertedFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NewChargeCredits (CMF_BALANCE.new_charge_credits)
   * @param fetch whether to fetch this field or not
   */
  public void setNewChargeCreditsFetch (boolean fetch) {
    this.NewChargeCreditsFetch = fetch;
  }
  /** Retrieve Fetch value for field: NewChargeCredits (CMF_BALANCE.new_charge_credits)
   * @return boolean the Fetch value for this field
   */
  public boolean getNewChargeCreditsFetch () {
    return this.NewChargeCreditsFetch;
  }
  /** Set the SortOrder for field: NewChargeCredits (CMF_BALANCE.new_charge_credits)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNewChargeCreditsSortOrder (Integer value) {
    this.NewChargeCreditsSort = value;
  }
  /** Retrieve SortOrder for field: NewChargeCredits (CMF_BALANCE.new_charge_credits)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNewChargeCreditsSortOrder () {
    return this.NewChargeCreditsSort;
  }
  /** Set the sort direction for field: NewChargeCredits (CMF_BALANCE.new_charge_credits)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNewChargeCreditsSortDirection (boolean ascending) {
    this.NewChargeCreditsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NewChargeCredits (CMF_BALANCE.new_charge_credits)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNewChargeCreditsSortDirection () {
    return this.NewChargeCreditsSortAscending;
  }
  /** Set the field level filters for field: NewChargeCredits (CMF_BALANCE.new_charge_credits)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNewChargeCreditsFilter (BigIntegerFilter[] value) throws ServiceException {
    this.NewChargeCredits = value;
  }
  /** Retrieve filter for field: NewChargeCredits (CMF_BALANCE.new_charge_credits)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getNewChargeCreditsFilter () {
    return this.NewChargeCredits;
  }

  /**
   * Retrieves the NewChargeCreditsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NewChargeCreditsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NewChargeCreditsFilter field
   */
  public String[] getNewChargeCreditsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNewChargeCreditsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNewChargeCreditsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNewChargeCreditsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NewChargeCreditsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNewChargeCreditsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NewChargeCreditsFilter filter value from a formatted string
   *
   * @param _value the NewChargeCreditsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NewChargeCreditsFilter filter field
   */
  public void setNewChargeCreditsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNewChargeCreditsFilterFromFormattedString");
    try {
      this.setNewChargeCreditsFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NewChargeCreditsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNewChargeCreditsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNewChargeCreditsFilterFromFormattedString");
  }

  /**
   * Sets the NewChargeCreditsFilter filter value from a formatted string
   *
   * @param _value the NewChargeCreditsFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NewChargeCreditsFilter filter field
   */
  public void setNewChargeCreditsFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNewChargeCreditsFilterFromFormattedCurrencyString");
    try {
      this.setNewChargeCreditsFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NewChargeCreditsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNewChargeCreditsFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNewChargeCreditsFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the NewChargeCreditsFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NewChargeCreditsFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the NewChargeCreditsFilter field
   */

  public String[] getNewChargeCreditsFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNewChargeCreditsFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNewChargeCreditsFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNewChargeCreditsFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NewChargeCreditsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNewChargeCreditsFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: BillSequenceNum (BILL_INVOICE.bill_sequence_num)
   * @param fetch whether to fetch this field or not
   */
  public void setBillSequenceNumFetch (boolean fetch) {
    this.BillSequenceNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillSequenceNum (BILL_INVOICE.bill_sequence_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillSequenceNumFetch () {
    return this.BillSequenceNumFetch;
  }
  /** Set the SortOrder for field: BillSequenceNum (BILL_INVOICE.bill_sequence_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillSequenceNumSortOrder (Integer value) {
    this.BillSequenceNumSort = value;
  }
  /** Retrieve SortOrder for field: BillSequenceNum (BILL_INVOICE.bill_sequence_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillSequenceNumSortOrder () {
    return this.BillSequenceNumSort;
  }
  /** Set the sort direction for field: BillSequenceNum (BILL_INVOICE.bill_sequence_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillSequenceNumSortDirection (boolean ascending) {
    this.BillSequenceNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillSequenceNum (BILL_INVOICE.bill_sequence_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillSequenceNumSortDirection () {
    return this.BillSequenceNumSortAscending;
  }
  /** Set the field level filters for field: BillSequenceNum (BILL_INVOICE.bill_sequence_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillSequenceNumFilter (IntegerFilter[] value) throws ServiceException {
    this.BillSequenceNum = value;
  }
  /** Retrieve filter for field: BillSequenceNum (BILL_INVOICE.bill_sequence_num)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillSequenceNumFilter () {
    return this.BillSequenceNum;
  }

  /**
   * Retrieves the BillSequenceNumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillSequenceNumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillSequenceNumFilter field
   */
  public String[] getBillSequenceNumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillSequenceNumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillSequenceNumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillSequenceNumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillSequenceNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillSequenceNumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillSequenceNumFilter filter value from a formatted string
   *
   * @param _value the BillSequenceNumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillSequenceNumFilter filter field
   */
  public void setBillSequenceNumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillSequenceNumFilterFromFormattedString");
    try {
      this.setBillSequenceNumFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillSequenceNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillSequenceNumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillSequenceNumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProcessNum (BILL_INVOICE.process_num)
   * @param fetch whether to fetch this field or not
   */
  public void setProcessNumFetch (boolean fetch) {
    this.ProcessNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProcessNum (BILL_INVOICE.process_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getProcessNumFetch () {
    return this.ProcessNumFetch;
  }
  /** Set the SortOrder for field: ProcessNum (BILL_INVOICE.process_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProcessNumSortOrder (Integer value) {
    this.ProcessNumSort = value;
  }
  /** Retrieve SortOrder for field: ProcessNum (BILL_INVOICE.process_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProcessNumSortOrder () {
    return this.ProcessNumSort;
  }
  /** Set the sort direction for field: ProcessNum (BILL_INVOICE.process_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProcessNumSortDirection (boolean ascending) {
    this.ProcessNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProcessNum (BILL_INVOICE.process_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProcessNumSortDirection () {
    return this.ProcessNumSortAscending;
  }
  /** Set the case insensitive for field: ProcessNum (BILL_INVOICE.process_num)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setProcessNumCaseInsensitive (boolean ascending) {
    this.ProcessNumCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ProcessNum (BILL_INVOICE.process_num)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getProcessNumCaseInsensitive () {
    return this.ProcessNumCaseInsensitive;
  }
  /** Set the field level filters for field: ProcessNum (BILL_INVOICE.process_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProcessNumFilter (StringFilter[] value) throws ServiceException {
    this.ProcessNum = value;
  }
  /** Retrieve filter for field: ProcessNum (BILL_INVOICE.process_num)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getProcessNumFilter () {
    return this.ProcessNum;
  }

  /**
   * Retrieves the ProcessNumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProcessNumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProcessNumFilter field
   */
  public String[] getProcessNumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProcessNumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProcessNumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProcessNumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProcessNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProcessNumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProcessNumFilter filter value from a formatted string
   *
   * @param _value the ProcessNumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProcessNumFilter filter field
   */
  public void setProcessNumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProcessNumFilterFromFormattedString");
    try {
      this.setProcessNumFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProcessNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProcessNumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProcessNumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PrevBillRefno (BILL_INVOICE.prev_bill_refno)
   * @param fetch whether to fetch this field or not
   */
  public void setPrevBillRefnoFetch (boolean fetch) {
    this.PrevBillRefnoFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrevBillRefno (BILL_INVOICE.prev_bill_refno)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrevBillRefnoFetch () {
    return this.PrevBillRefnoFetch;
  }
  /** Set the SortOrder for field: PrevBillRefno (BILL_INVOICE.prev_bill_refno)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrevBillRefnoSortOrder (Integer value) {
    this.PrevBillRefnoSort = value;
  }
  /** Retrieve SortOrder for field: PrevBillRefno (BILL_INVOICE.prev_bill_refno)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrevBillRefnoSortOrder () {
    return this.PrevBillRefnoSort;
  }
  /** Set the sort direction for field: PrevBillRefno (BILL_INVOICE.prev_bill_refno)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrevBillRefnoSortDirection (boolean ascending) {
    this.PrevBillRefnoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrevBillRefno (BILL_INVOICE.prev_bill_refno)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrevBillRefnoSortDirection () {
    return this.PrevBillRefnoSortAscending;
  }
  /** Set the field level filters for field: PrevBillRefno (BILL_INVOICE.prev_bill_refno)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrevBillRefnoFilter (IntegerFilter[] value) throws ServiceException {
    this.PrevBillRefno = value;
  }
  /** Retrieve filter for field: PrevBillRefno (BILL_INVOICE.prev_bill_refno)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPrevBillRefnoFilter () {
    return this.PrevBillRefno;
  }

  /**
   * Retrieves the PrevBillRefnoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevBillRefnoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevBillRefnoFilter field
   */
  public String[] getPrevBillRefnoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBillRefnoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrevBillRefnoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevBillRefnoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevBillRefnoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevBillRefnoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrevBillRefnoFilter filter value from a formatted string
   *
   * @param _value the PrevBillRefnoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrevBillRefnoFilter filter field
   */
  public void setPrevBillRefnoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevBillRefnoFilterFromFormattedString");
    try {
      this.setPrevBillRefnoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevBillRefnoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevBillRefnoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevBillRefnoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PrevBillRefResets (BILL_INVOICE.prev_bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setPrevBillRefResetsFetch (boolean fetch) {
    this.PrevBillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrevBillRefResets (BILL_INVOICE.prev_bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrevBillRefResetsFetch () {
    return this.PrevBillRefResetsFetch;
  }
  /** Set the SortOrder for field: PrevBillRefResets (BILL_INVOICE.prev_bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrevBillRefResetsSortOrder (Integer value) {
    this.PrevBillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: PrevBillRefResets (BILL_INVOICE.prev_bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrevBillRefResetsSortOrder () {
    return this.PrevBillRefResetsSort;
  }
  /** Set the sort direction for field: PrevBillRefResets (BILL_INVOICE.prev_bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrevBillRefResetsSortDirection (boolean ascending) {
    this.PrevBillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrevBillRefResets (BILL_INVOICE.prev_bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrevBillRefResetsSortDirection () {
    return this.PrevBillRefResetsSortAscending;
  }
  /** Set the field level filters for field: PrevBillRefResets (BILL_INVOICE.prev_bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrevBillRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.PrevBillRefResets = value;
  }
  /** Retrieve filter for field: PrevBillRefResets (BILL_INVOICE.prev_bill_ref_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPrevBillRefResetsFilter () {
    return this.PrevBillRefResets;
  }

  /**
   * Retrieves the PrevBillRefResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevBillRefResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevBillRefResetsFilter field
   */
  public String[] getPrevBillRefResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBillRefResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrevBillRefResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevBillRefResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevBillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevBillRefResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrevBillRefResetsFilter filter value from a formatted string
   *
   * @param _value the PrevBillRefResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrevBillRefResetsFilter filter field
   */
  public void setPrevBillRefResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevBillRefResetsFilterFromFormattedString");
    try {
      this.setPrevBillRefResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevBillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevBillRefResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevBillRefResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PrevBalanceRefno (BILL_INVOICE.prev_balance_refno)
   * @param fetch whether to fetch this field or not
   */
  public void setPrevBalanceRefnoFetch (boolean fetch) {
    this.PrevBalanceRefnoFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrevBalanceRefno (BILL_INVOICE.prev_balance_refno)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrevBalanceRefnoFetch () {
    return this.PrevBalanceRefnoFetch;
  }
  /** Set the SortOrder for field: PrevBalanceRefno (BILL_INVOICE.prev_balance_refno)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrevBalanceRefnoSortOrder (Integer value) {
    this.PrevBalanceRefnoSort = value;
  }
  /** Retrieve SortOrder for field: PrevBalanceRefno (BILL_INVOICE.prev_balance_refno)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrevBalanceRefnoSortOrder () {
    return this.PrevBalanceRefnoSort;
  }
  /** Set the sort direction for field: PrevBalanceRefno (BILL_INVOICE.prev_balance_refno)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrevBalanceRefnoSortDirection (boolean ascending) {
    this.PrevBalanceRefnoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrevBalanceRefno (BILL_INVOICE.prev_balance_refno)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrevBalanceRefnoSortDirection () {
    return this.PrevBalanceRefnoSortAscending;
  }
  /** Set the field level filters for field: PrevBalanceRefno (BILL_INVOICE.prev_balance_refno)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrevBalanceRefnoFilter (IntegerFilter[] value) throws ServiceException {
    this.PrevBalanceRefno = value;
  }
  /** Retrieve filter for field: PrevBalanceRefno (BILL_INVOICE.prev_balance_refno)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPrevBalanceRefnoFilter () {
    return this.PrevBalanceRefno;
  }

  /**
   * Retrieves the PrevBalanceRefnoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevBalanceRefnoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevBalanceRefnoFilter field
   */
  public String[] getPrevBalanceRefnoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBalanceRefnoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrevBalanceRefnoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevBalanceRefnoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevBalanceRefnoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevBalanceRefnoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrevBalanceRefnoFilter filter value from a formatted string
   *
   * @param _value the PrevBalanceRefnoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrevBalanceRefnoFilter filter field
   */
  public void setPrevBalanceRefnoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevBalanceRefnoFilterFromFormattedString");
    try {
      this.setPrevBalanceRefnoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevBalanceRefnoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevBalanceRefnoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevBalanceRefnoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PrevBalanceRefResets (BILL_INVOICE.prev_balance_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setPrevBalanceRefResetsFetch (boolean fetch) {
    this.PrevBalanceRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrevBalanceRefResets (BILL_INVOICE.prev_balance_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrevBalanceRefResetsFetch () {
    return this.PrevBalanceRefResetsFetch;
  }
  /** Set the SortOrder for field: PrevBalanceRefResets (BILL_INVOICE.prev_balance_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrevBalanceRefResetsSortOrder (Integer value) {
    this.PrevBalanceRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: PrevBalanceRefResets (BILL_INVOICE.prev_balance_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrevBalanceRefResetsSortOrder () {
    return this.PrevBalanceRefResetsSort;
  }
  /** Set the sort direction for field: PrevBalanceRefResets (BILL_INVOICE.prev_balance_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrevBalanceRefResetsSortDirection (boolean ascending) {
    this.PrevBalanceRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrevBalanceRefResets (BILL_INVOICE.prev_balance_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrevBalanceRefResetsSortDirection () {
    return this.PrevBalanceRefResetsSortAscending;
  }
  /** Set the field level filters for field: PrevBalanceRefResets (BILL_INVOICE.prev_balance_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrevBalanceRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.PrevBalanceRefResets = value;
  }
  /** Retrieve filter for field: PrevBalanceRefResets (BILL_INVOICE.prev_balance_ref_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPrevBalanceRefResetsFilter () {
    return this.PrevBalanceRefResets;
  }

  /**
   * Retrieves the PrevBalanceRefResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevBalanceRefResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevBalanceRefResetsFilter field
   */
  public String[] getPrevBalanceRefResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBalanceRefResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrevBalanceRefResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevBalanceRefResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevBalanceRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevBalanceRefResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrevBalanceRefResetsFilter filter value from a formatted string
   *
   * @param _value the PrevBalanceRefResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrevBalanceRefResetsFilter filter field
   */
  public void setPrevBalanceRefResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevBalanceRefResetsFilterFromFormattedString");
    try {
      this.setPrevBalanceRefResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevBalanceRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevBalanceRefResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevBalanceRefResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Zip (BILL_INVOICE.zip)
   * @param fetch whether to fetch this field or not
   */
  public void setZipFetch (boolean fetch) {
    this.ZipFetch = fetch;
  }
  /** Retrieve Fetch value for field: Zip (BILL_INVOICE.zip)
   * @return boolean the Fetch value for this field
   */
  public boolean getZipFetch () {
    return this.ZipFetch;
  }
  /** Set the SortOrder for field: Zip (BILL_INVOICE.zip)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setZipSortOrder (Integer value) {
    this.ZipSort = value;
  }
  /** Retrieve SortOrder for field: Zip (BILL_INVOICE.zip)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getZipSortOrder () {
    return this.ZipSort;
  }
  /** Set the sort direction for field: Zip (BILL_INVOICE.zip)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setZipSortDirection (boolean ascending) {
    this.ZipSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Zip (BILL_INVOICE.zip)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getZipSortDirection () {
    return this.ZipSortAscending;
  }
  /** Set the case insensitive for field: Zip (BILL_INVOICE.zip)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setZipCaseInsensitive (boolean ascending) {
    this.ZipCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Zip (BILL_INVOICE.zip)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getZipCaseInsensitive () {
    return this.ZipCaseInsensitive;
  }
  /** Set the field level filters for field: Zip (BILL_INVOICE.zip)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setZipFilter (StringFilter[] value) throws ServiceException {
    this.Zip = value;
  }
  /** Retrieve filter for field: Zip (BILL_INVOICE.zip)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getZipFilter () {
    return this.Zip;
  }

  /**
   * Retrieves the ZipFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ZipFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ZipFilter field
   */
  public String[] getZipFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getZipFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getZipFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getZipFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ZipFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getZipFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ZipFilter filter value from a formatted string
   *
   * @param _value the ZipFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ZipFilter filter field
   */
  public void setZipFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setZipFilterFromFormattedString");
    try {
      this.setZipFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ZipFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setZipFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setZipFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FromDate (BILL_INVOICE.from_date)
   * @param fetch whether to fetch this field or not
   */
  public void setFromDateFetch (boolean fetch) {
    this.FromDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: FromDate (BILL_INVOICE.from_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getFromDateFetch () {
    return this.FromDateFetch;
  }
  /** Set the SortOrder for field: FromDate (BILL_INVOICE.from_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFromDateSortOrder (Integer value) {
    this.FromDateSort = value;
  }
  /** Retrieve SortOrder for field: FromDate (BILL_INVOICE.from_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFromDateSortOrder () {
    return this.FromDateSort;
  }
  /** Set the sort direction for field: FromDate (BILL_INVOICE.from_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFromDateSortDirection (boolean ascending) {
    this.FromDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FromDate (BILL_INVOICE.from_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFromDateSortDirection () {
    return this.FromDateSortAscending;
  }
  /** Set the field level filters for field: FromDate (BILL_INVOICE.from_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFromDateFilter (DateFilter[] value) throws ServiceException {
    this.FromDate = value;
  }
  /** Retrieve filter for field: FromDate (BILL_INVOICE.from_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getFromDateFilter () {
    return this.FromDate;
  }

  /**
   * Retrieves the FromDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FromDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FromDateFilter field
   */
  public String[] getFromDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFromDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFromDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFromDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FromDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFromDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FromDateFilter filter value from a formatted string
   *
   * @param _value the FromDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FromDateFilter filter field
   */
  public void setFromDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFromDateFilterFromFormattedString");
    try {
      this.setFromDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FromDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFromDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFromDateFilterFromFormattedString");
  }

  /**
   * Retrieves the FromDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FromDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the FromDateFilter field
   */
  public String[] getFromDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFromDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFromDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFromDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FromDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFromDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the FromDateFilter filter value from a formatted string
   *
   * @param _value the FromDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FromDateFilter filter field
   */
  public void setFromDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFromDateFilterFromFormattedDateTimeString");
    try {
      this.setFromDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FromDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFromDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFromDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ToDate (BILL_INVOICE.to_date)
   * @param fetch whether to fetch this field or not
   */
  public void setToDateFetch (boolean fetch) {
    this.ToDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ToDate (BILL_INVOICE.to_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getToDateFetch () {
    return this.ToDateFetch;
  }
  /** Set the SortOrder for field: ToDate (BILL_INVOICE.to_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setToDateSortOrder (Integer value) {
    this.ToDateSort = value;
  }
  /** Retrieve SortOrder for field: ToDate (BILL_INVOICE.to_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getToDateSortOrder () {
    return this.ToDateSort;
  }
  /** Set the sort direction for field: ToDate (BILL_INVOICE.to_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setToDateSortDirection (boolean ascending) {
    this.ToDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ToDate (BILL_INVOICE.to_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getToDateSortDirection () {
    return this.ToDateSortAscending;
  }
  /** Set the field level filters for field: ToDate (BILL_INVOICE.to_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setToDateFilter (DateFilter[] value) throws ServiceException {
    this.ToDate = value;
  }
  /** Retrieve filter for field: ToDate (BILL_INVOICE.to_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getToDateFilter () {
    return this.ToDate;
  }

  /**
   * Retrieves the ToDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ToDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ToDateFilter field
   */
  public String[] getToDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getToDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getToDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getToDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ToDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getToDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ToDateFilter filter value from a formatted string
   *
   * @param _value the ToDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ToDateFilter filter field
   */
  public void setToDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setToDateFilterFromFormattedString");
    try {
      this.setToDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ToDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setToDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setToDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ToDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ToDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ToDateFilter field
   */
  public String[] getToDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getToDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getToDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getToDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ToDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getToDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ToDateFilter filter value from a formatted string
   *
   * @param _value the ToDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ToDateFilter filter field
   */
  public void setToDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setToDateFilterFromFormattedDateTimeString");
    try {
      this.setToDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ToDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setToDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setToDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: NextToDate (BILL_INVOICE.next_to_date)
   * @param fetch whether to fetch this field or not
   */
  public void setNextToDateFetch (boolean fetch) {
    this.NextToDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: NextToDate (BILL_INVOICE.next_to_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getNextToDateFetch () {
    return this.NextToDateFetch;
  }
  /** Set the SortOrder for field: NextToDate (BILL_INVOICE.next_to_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNextToDateSortOrder (Integer value) {
    this.NextToDateSort = value;
  }
  /** Retrieve SortOrder for field: NextToDate (BILL_INVOICE.next_to_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNextToDateSortOrder () {
    return this.NextToDateSort;
  }
  /** Set the sort direction for field: NextToDate (BILL_INVOICE.next_to_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNextToDateSortDirection (boolean ascending) {
    this.NextToDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NextToDate (BILL_INVOICE.next_to_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNextToDateSortDirection () {
    return this.NextToDateSortAscending;
  }
  /** Set the field level filters for field: NextToDate (BILL_INVOICE.next_to_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNextToDateFilter (DateFilter[] value) throws ServiceException {
    this.NextToDate = value;
  }
  /** Retrieve filter for field: NextToDate (BILL_INVOICE.next_to_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getNextToDateFilter () {
    return this.NextToDate;
  }

  /**
   * Retrieves the NextToDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NextToDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NextToDateFilter field
   */
  public String[] getNextToDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextToDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNextToDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNextToDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextToDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNextToDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NextToDateFilter filter value from a formatted string
   *
   * @param _value the NextToDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NextToDateFilter filter field
   */
  public void setNextToDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNextToDateFilterFromFormattedString");
    try {
      this.setNextToDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextToDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNextToDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNextToDateFilterFromFormattedString");
  }

  /**
   * Retrieves the NextToDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NextToDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the NextToDateFilter field
   */
  public String[] getNextToDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextToDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNextToDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNextToDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextToDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNextToDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the NextToDateFilter filter value from a formatted string
   *
   * @param _value the NextToDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NextToDateFilter filter field
   */
  public void setNextToDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNextToDateFilterFromFormattedDateTimeString");
    try {
      this.setNextToDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextToDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNextToDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNextToDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: PrepDate (BILL_INVOICE.prep_date)
   * @param fetch whether to fetch this field or not
   */
  public void setPrepDateFetch (boolean fetch) {
    this.PrepDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrepDate (BILL_INVOICE.prep_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrepDateFetch () {
    return this.PrepDateFetch;
  }
  /** Set the SortOrder for field: PrepDate (BILL_INVOICE.prep_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrepDateSortOrder (Integer value) {
    this.PrepDateSort = value;
  }
  /** Retrieve SortOrder for field: PrepDate (BILL_INVOICE.prep_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrepDateSortOrder () {
    return this.PrepDateSort;
  }
  /** Set the sort direction for field: PrepDate (BILL_INVOICE.prep_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrepDateSortDirection (boolean ascending) {
    this.PrepDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrepDate (BILL_INVOICE.prep_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrepDateSortDirection () {
    return this.PrepDateSortAscending;
  }
  /** Set the field level filters for field: PrepDate (BILL_INVOICE.prep_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrepDateFilter (DateFilter[] value) throws ServiceException {
    this.PrepDate = value;
  }
  /** Retrieve filter for field: PrepDate (BILL_INVOICE.prep_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPrepDateFilter () {
    return this.PrepDate;
  }

  /**
   * Retrieves the PrepDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrepDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepDateFilter field
   */
  public String[] getPrepDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrepDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrepDateFilter filter value from a formatted string
   *
   * @param _value the PrepDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrepDateFilter filter field
   */
  public void setPrepDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepDateFilterFromFormattedString");
    try {
      this.setPrepDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepDateFilterFromFormattedString");
  }

  /**
   * Retrieves the PrepDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrepDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepDateFilter field
   */
  public String[] getPrepDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrepDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PrepDateFilter filter value from a formatted string
   *
   * @param _value the PrepDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrepDateFilter filter field
   */
  public void setPrepDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepDateFilterFromFormattedDateTimeString");
    try {
      this.setPrepDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: TaxDate (BILL_INVOICE.tax_date)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxDateFetch (boolean fetch) {
    this.TaxDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxDate (BILL_INVOICE.tax_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxDateFetch () {
    return this.TaxDateFetch;
  }
  /** Set the SortOrder for field: TaxDate (BILL_INVOICE.tax_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxDateSortOrder (Integer value) {
    this.TaxDateSort = value;
  }
  /** Retrieve SortOrder for field: TaxDate (BILL_INVOICE.tax_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxDateSortOrder () {
    return this.TaxDateSort;
  }
  /** Set the sort direction for field: TaxDate (BILL_INVOICE.tax_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxDateSortDirection (boolean ascending) {
    this.TaxDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxDate (BILL_INVOICE.tax_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxDateSortDirection () {
    return this.TaxDateSortAscending;
  }
  /** Set the field level filters for field: TaxDate (BILL_INVOICE.tax_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxDateFilter (DateFilter[] value) throws ServiceException {
    this.TaxDate = value;
  }
  /** Retrieve filter for field: TaxDate (BILL_INVOICE.tax_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getTaxDateFilter () {
    return this.TaxDate;
  }

  /**
   * Retrieves the TaxDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxDateFilter field
   */
  public String[] getTaxDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxDateFilter filter value from a formatted string
   *
   * @param _value the TaxDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxDateFilter filter field
   */
  public void setTaxDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxDateFilterFromFormattedString");
    try {
      this.setTaxDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxDateFilterFromFormattedString");
  }

  /**
   * Retrieves the TaxDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxDateFilter field
   */
  public String[] getTaxDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TaxDateFilter filter value from a formatted string
   *
   * @param _value the TaxDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxDateFilter filter field
   */
  public void setTaxDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxDateFilterFromFormattedDateTimeString");
    try {
      this.setTaxDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: StatementDate (BILL_INVOICE.statement_date)
   * @param fetch whether to fetch this field or not
   */
  public void setStatementDateFetch (boolean fetch) {
    this.StatementDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: StatementDate (BILL_INVOICE.statement_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatementDateFetch () {
    return this.StatementDateFetch;
  }
  /** Set the SortOrder for field: StatementDate (BILL_INVOICE.statement_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatementDateSortOrder (Integer value) {
    this.StatementDateSort = value;
  }
  /** Retrieve SortOrder for field: StatementDate (BILL_INVOICE.statement_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatementDateSortOrder () {
    return this.StatementDateSort;
  }
  /** Set the sort direction for field: StatementDate (BILL_INVOICE.statement_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatementDateSortDirection (boolean ascending) {
    this.StatementDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StatementDate (BILL_INVOICE.statement_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatementDateSortDirection () {
    return this.StatementDateSortAscending;
  }
  /** Set the field level filters for field: StatementDate (BILL_INVOICE.statement_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatementDateFilter (DateFilter[] value) throws ServiceException {
    this.StatementDate = value;
  }
  /** Retrieve filter for field: StatementDate (BILL_INVOICE.statement_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getStatementDateFilter () {
    return this.StatementDate;
  }

  /**
   * Retrieves the StatementDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatementDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementDateFilter field
   */
  public String[] getStatementDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatementDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatementDateFilter filter value from a formatted string
   *
   * @param _value the StatementDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatementDateFilter filter field
   */
  public void setStatementDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatementDateFilterFromFormattedString");
    try {
      this.setStatementDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatementDateFilterFromFormattedString");
  }

  /**
   * Retrieves the StatementDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatementDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementDateFilter field
   */
  public String[] getStatementDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatementDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the StatementDateFilter filter value from a formatted string
   *
   * @param _value the StatementDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatementDateFilter filter field
   */
  public void setStatementDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatementDateFilterFromFormattedDateTimeString");
    try {
      this.setStatementDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatementDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: PaymentDueDate (BILL_INVOICE.payment_due_date)
   * @param fetch whether to fetch this field or not
   */
  public void setPaymentDueDateFetch (boolean fetch) {
    this.PaymentDueDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: PaymentDueDate (BILL_INVOICE.payment_due_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getPaymentDueDateFetch () {
    return this.PaymentDueDateFetch;
  }
  /** Set the SortOrder for field: PaymentDueDate (BILL_INVOICE.payment_due_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPaymentDueDateSortOrder (Integer value) {
    this.PaymentDueDateSort = value;
  }
  /** Retrieve SortOrder for field: PaymentDueDate (BILL_INVOICE.payment_due_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPaymentDueDateSortOrder () {
    return this.PaymentDueDateSort;
  }
  /** Set the sort direction for field: PaymentDueDate (BILL_INVOICE.payment_due_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPaymentDueDateSortDirection (boolean ascending) {
    this.PaymentDueDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PaymentDueDate (BILL_INVOICE.payment_due_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPaymentDueDateSortDirection () {
    return this.PaymentDueDateSortAscending;
  }
  /** Set the field level filters for field: PaymentDueDate (BILL_INVOICE.payment_due_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPaymentDueDateFilter (DateFilter[] value) throws ServiceException {
    this.PaymentDueDate = value;
  }
  /** Retrieve filter for field: PaymentDueDate (BILL_INVOICE.payment_due_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPaymentDueDateFilter () {
    return this.PaymentDueDate;
  }

  /**
   * Retrieves the PaymentDueDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PaymentDueDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentDueDateFilter field
   */
  public String[] getPaymentDueDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentDueDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPaymentDueDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentDueDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentDueDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentDueDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PaymentDueDateFilter filter value from a formatted string
   *
   * @param _value the PaymentDueDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PaymentDueDateFilter filter field
   */
  public void setPaymentDueDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPaymentDueDateFilterFromFormattedString");
    try {
      this.setPaymentDueDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentDueDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentDueDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPaymentDueDateFilterFromFormattedString");
  }

  /**
   * Retrieves the PaymentDueDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PaymentDueDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentDueDateFilter field
   */
  public String[] getPaymentDueDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentDueDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPaymentDueDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentDueDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentDueDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentDueDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PaymentDueDateFilter filter value from a formatted string
   *
   * @param _value the PaymentDueDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PaymentDueDateFilter filter field
   */
  public void setPaymentDueDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPaymentDueDateFilterFromFormattedDateTimeString");
    try {
      this.setPaymentDueDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentDueDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentDueDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPaymentDueDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: PrevPpdd (BILL_INVOICE.prev_ppdd)
   * @param fetch whether to fetch this field or not
   */
  public void setPrevPpddFetch (boolean fetch) {
    this.PrevPpddFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrevPpdd (BILL_INVOICE.prev_ppdd)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrevPpddFetch () {
    return this.PrevPpddFetch;
  }
  /** Set the SortOrder for field: PrevPpdd (BILL_INVOICE.prev_ppdd)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrevPpddSortOrder (Integer value) {
    this.PrevPpddSort = value;
  }
  /** Retrieve SortOrder for field: PrevPpdd (BILL_INVOICE.prev_ppdd)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrevPpddSortOrder () {
    return this.PrevPpddSort;
  }
  /** Set the sort direction for field: PrevPpdd (BILL_INVOICE.prev_ppdd)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrevPpddSortDirection (boolean ascending) {
    this.PrevPpddSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrevPpdd (BILL_INVOICE.prev_ppdd)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrevPpddSortDirection () {
    return this.PrevPpddSortAscending;
  }
  /** Set the field level filters for field: PrevPpdd (BILL_INVOICE.prev_ppdd)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrevPpddFilter (DateFilter[] value) throws ServiceException {
    this.PrevPpdd = value;
  }
  /** Retrieve filter for field: PrevPpdd (BILL_INVOICE.prev_ppdd)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPrevPpddFilter () {
    return this.PrevPpdd;
  }

  /**
   * Retrieves the PrevPpddFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevPpddFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevPpddFilter field
   */
  public String[] getPrevPpddFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevPpddFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrevPpddFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevPpddFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevPpddFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevPpddFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrevPpddFilter filter value from a formatted string
   *
   * @param _value the PrevPpddFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrevPpddFilter filter field
   */
  public void setPrevPpddFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevPpddFilterFromFormattedString");
    try {
      this.setPrevPpddFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevPpddFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevPpddFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevPpddFilterFromFormattedString");
  }

  /**
   * Retrieves the PrevPpddFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevPpddFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevPpddFilter field
   */
  public String[] getPrevPpddFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevPpddFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrevPpddFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevPpddFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevPpddFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevPpddFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PrevPpddFilter filter value from a formatted string
   *
   * @param _value the PrevPpddFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrevPpddFilter filter field
   */
  public void setPrevPpddFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevPpddFilterFromFormattedDateTimeString");
    try {
      this.setPrevPpddFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevPpddFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevPpddFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevPpddFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: PrevCutoffDate (BILL_INVOICE.prev_cutoff_date)
   * @param fetch whether to fetch this field or not
   */
  public void setPrevCutoffDateFetch (boolean fetch) {
    this.PrevCutoffDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrevCutoffDate (BILL_INVOICE.prev_cutoff_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrevCutoffDateFetch () {
    return this.PrevCutoffDateFetch;
  }
  /** Set the SortOrder for field: PrevCutoffDate (BILL_INVOICE.prev_cutoff_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrevCutoffDateSortOrder (Integer value) {
    this.PrevCutoffDateSort = value;
  }
  /** Retrieve SortOrder for field: PrevCutoffDate (BILL_INVOICE.prev_cutoff_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrevCutoffDateSortOrder () {
    return this.PrevCutoffDateSort;
  }
  /** Set the sort direction for field: PrevCutoffDate (BILL_INVOICE.prev_cutoff_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrevCutoffDateSortDirection (boolean ascending) {
    this.PrevCutoffDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrevCutoffDate (BILL_INVOICE.prev_cutoff_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrevCutoffDateSortDirection () {
    return this.PrevCutoffDateSortAscending;
  }
  /** Set the field level filters for field: PrevCutoffDate (BILL_INVOICE.prev_cutoff_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrevCutoffDateFilter (DateFilter[] value) throws ServiceException {
    this.PrevCutoffDate = value;
  }
  /** Retrieve filter for field: PrevCutoffDate (BILL_INVOICE.prev_cutoff_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPrevCutoffDateFilter () {
    return this.PrevCutoffDate;
  }

  /**
   * Retrieves the PrevCutoffDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevCutoffDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevCutoffDateFilter field
   */
  public String[] getPrevCutoffDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevCutoffDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrevCutoffDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevCutoffDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevCutoffDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevCutoffDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrevCutoffDateFilter filter value from a formatted string
   *
   * @param _value the PrevCutoffDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrevCutoffDateFilter filter field
   */
  public void setPrevCutoffDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevCutoffDateFilterFromFormattedString");
    try {
      this.setPrevCutoffDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevCutoffDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevCutoffDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevCutoffDateFilterFromFormattedString");
  }

  /**
   * Retrieves the PrevCutoffDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevCutoffDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevCutoffDateFilter field
   */
  public String[] getPrevCutoffDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevCutoffDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrevCutoffDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevCutoffDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevCutoffDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevCutoffDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PrevCutoffDateFilter filter value from a formatted string
   *
   * @param _value the PrevCutoffDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrevCutoffDateFilter filter field
   */
  public void setPrevCutoffDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevCutoffDateFilterFromFormattedDateTimeString");
    try {
      this.setPrevCutoffDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevCutoffDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevCutoffDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevCutoffDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: BillPeriod (BILL_INVOICE.bill_period)
   * @param fetch whether to fetch this field or not
   */
  public void setBillPeriodFetch (boolean fetch) {
    this.BillPeriodFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillPeriod (BILL_INVOICE.bill_period)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillPeriodFetch () {
    return this.BillPeriodFetch;
  }
  /** Set the SortOrder for field: BillPeriod (BILL_INVOICE.bill_period)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillPeriodSortOrder (Integer value) {
    this.BillPeriodSort = value;
  }
  /** Retrieve SortOrder for field: BillPeriod (BILL_INVOICE.bill_period)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillPeriodSortOrder () {
    return this.BillPeriodSort;
  }
  /** Set the sort direction for field: BillPeriod (BILL_INVOICE.bill_period)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillPeriodSortDirection (boolean ascending) {
    this.BillPeriodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillPeriod (BILL_INVOICE.bill_period)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillPeriodSortDirection () {
    return this.BillPeriodSortAscending;
  }
  /** Set the case insensitive for field: BillPeriod (BILL_INVOICE.bill_period)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillPeriodCaseInsensitive (boolean ascending) {
    this.BillPeriodCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillPeriod (BILL_INVOICE.bill_period)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillPeriodCaseInsensitive () {
    return this.BillPeriodCaseInsensitive;
  }
  /** Set the field level filters for field: BillPeriod (BILL_INVOICE.bill_period)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillPeriodFilter (StringFilter[] value) throws ServiceException {
    this.BillPeriod = value;
  }
  /** Retrieve filter for field: BillPeriod (BILL_INVOICE.bill_period)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillPeriodFilter () {
    return this.BillPeriod;
  }

  /**
   * Retrieves the BillPeriodFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillPeriodFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillPeriodFilter field
   */
  public String[] getBillPeriodFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillPeriodFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillPeriodFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillPeriodFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillPeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillPeriodFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillPeriodFilter filter value from a formatted string
   *
   * @param _value the BillPeriodFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillPeriodFilter filter field
   */
  public void setBillPeriodFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillPeriodFilterFromFormattedString");
    try {
      this.setBillPeriodFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillPeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillPeriodFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillPeriodFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated BillPeriodFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillPeriodFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillPeriodFilter filter field
   */
  public String[] getBillPeriodFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillPeriodFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getBillPeriodFilter(), "BillPeriod", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillPeriodFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillPeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillPeriodFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated BillPeriodFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BillPeriodFilter filter field
   */
  public void setBillPeriodFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillPeriodFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setBillPeriodFilter((StringFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "BillPeriod", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillPeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillPeriodFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillPeriodFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: PayMethod (BILL_INVOICE.pay_method)
   * @param fetch whether to fetch this field or not
   */
  public void setPayMethodFetch (boolean fetch) {
    this.PayMethodFetch = fetch;
  }
  /** Retrieve Fetch value for field: PayMethod (BILL_INVOICE.pay_method)
   * @return boolean the Fetch value for this field
   */
  public boolean getPayMethodFetch () {
    return this.PayMethodFetch;
  }
  /** Set the SortOrder for field: PayMethod (BILL_INVOICE.pay_method)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPayMethodSortOrder (Integer value) {
    this.PayMethodSort = value;
  }
  /** Retrieve SortOrder for field: PayMethod (BILL_INVOICE.pay_method)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPayMethodSortOrder () {
    return this.PayMethodSort;
  }
  /** Set the sort direction for field: PayMethod (BILL_INVOICE.pay_method)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPayMethodSortDirection (boolean ascending) {
    this.PayMethodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PayMethod (BILL_INVOICE.pay_method)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPayMethodSortDirection () {
    return this.PayMethodSortAscending;
  }
  /** Set the field level filters for field: PayMethod (BILL_INVOICE.pay_method)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPayMethodFilter (IntegerFilter[] value) throws ServiceException {
    this.PayMethod = value;
  }
  /** Retrieve filter for field: PayMethod (BILL_INVOICE.pay_method)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPayMethodFilter () {
    return this.PayMethod;
  }

  /**
   * Retrieves the PayMethodFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PayMethodFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayMethodFilter field
   */
  public String[] getPayMethodFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayMethodFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPayMethodFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayMethodFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayMethodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayMethodFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PayMethodFilter filter value from a formatted string
   *
   * @param _value the PayMethodFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PayMethodFilter filter field
   */
  public void setPayMethodFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayMethodFilterFromFormattedString");
    try {
      this.setPayMethodFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayMethodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayMethodFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayMethodFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated PayMethodFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the PayMethodFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PayMethodFilter filter field
   */
  public String[] getPayMethodFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayMethodFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getPayMethodFilter(), "PayMethod", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayMethodFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayMethodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayMethodFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated PayMethodFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the PayMethodFilter filter field
   */
  public void setPayMethodFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayMethodFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setPayMethodFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "PayMethod", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayMethodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayMethodFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayMethodFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: BillDispMeth (BILL_INVOICE.bill_disp_meth)
   * @param fetch whether to fetch this field or not
   */
  public void setBillDispMethFetch (boolean fetch) {
    this.BillDispMethFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillDispMeth (BILL_INVOICE.bill_disp_meth)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillDispMethFetch () {
    return this.BillDispMethFetch;
  }
  /** Set the SortOrder for field: BillDispMeth (BILL_INVOICE.bill_disp_meth)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillDispMethSortOrder (Integer value) {
    this.BillDispMethSort = value;
  }
  /** Retrieve SortOrder for field: BillDispMeth (BILL_INVOICE.bill_disp_meth)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillDispMethSortOrder () {
    return this.BillDispMethSort;
  }
  /** Set the sort direction for field: BillDispMeth (BILL_INVOICE.bill_disp_meth)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillDispMethSortDirection (boolean ascending) {
    this.BillDispMethSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillDispMeth (BILL_INVOICE.bill_disp_meth)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillDispMethSortDirection () {
    return this.BillDispMethSortAscending;
  }
  /** Set the field level filters for field: BillDispMeth (BILL_INVOICE.bill_disp_meth)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillDispMethFilter (IntegerFilter[] value) throws ServiceException {
    this.BillDispMeth = value;
  }
  /** Retrieve filter for field: BillDispMeth (BILL_INVOICE.bill_disp_meth)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillDispMethFilter () {
    return this.BillDispMeth;
  }

  /**
   * Retrieves the BillDispMethFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillDispMethFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillDispMethFilter field
   */
  public String[] getBillDispMethFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDispMethFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillDispMethFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDispMethFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillDispMethFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillDispMethFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillDispMethFilter filter value from a formatted string
   *
   * @param _value the BillDispMethFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillDispMethFilter filter field
   */
  public void setBillDispMethFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillDispMethFilterFromFormattedString");
    try {
      this.setBillDispMethFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillDispMethFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillDispMethFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillDispMethFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated BillDispMethFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillDispMethFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillDispMethFilter filter field
   */
  public String[] getBillDispMethFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDispMethFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getBillDispMethFilter(), "BillDispatchMethod", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDispMethFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillDispMethFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillDispMethFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated BillDispMethFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BillDispMethFilter filter field
   */
  public void setBillDispMethFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillDispMethFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setBillDispMethFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "BillDispMeth", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillDispMethFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillDispMethFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillDispMethFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: TaxJournalStatus (BILL_INVOICE.tax_journal_status)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxJournalStatusFetch (boolean fetch) {
    this.TaxJournalStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxJournalStatus (BILL_INVOICE.tax_journal_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxJournalStatusFetch () {
    return this.TaxJournalStatusFetch;
  }
  /** Set the SortOrder for field: TaxJournalStatus (BILL_INVOICE.tax_journal_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxJournalStatusSortOrder (Integer value) {
    this.TaxJournalStatusSort = value;
  }
  /** Retrieve SortOrder for field: TaxJournalStatus (BILL_INVOICE.tax_journal_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxJournalStatusSortOrder () {
    return this.TaxJournalStatusSort;
  }
  /** Set the sort direction for field: TaxJournalStatus (BILL_INVOICE.tax_journal_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxJournalStatusSortDirection (boolean ascending) {
    this.TaxJournalStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxJournalStatus (BILL_INVOICE.tax_journal_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxJournalStatusSortDirection () {
    return this.TaxJournalStatusSortAscending;
  }
  /** Set the field level filters for field: TaxJournalStatus (BILL_INVOICE.tax_journal_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxJournalStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxJournalStatus = value;
  }
  /** Retrieve filter for field: TaxJournalStatus (BILL_INVOICE.tax_journal_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxJournalStatusFilter () {
    return this.TaxJournalStatus;
  }

  /**
   * Retrieves the TaxJournalStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxJournalStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxJournalStatusFilter field
   */
  public String[] getTaxJournalStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxJournalStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxJournalStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxJournalStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxJournalStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxJournalStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxJournalStatusFilter filter value from a formatted string
   *
   * @param _value the TaxJournalStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxJournalStatusFilter filter field
   */
  public void setTaxJournalStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxJournalStatusFilterFromFormattedString");
    try {
      this.setTaxJournalStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxJournalStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxJournalStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxJournalStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccountStatus (BILL_INVOICE.account_status)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountStatusFetch (boolean fetch) {
    this.AccountStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountStatus (BILL_INVOICE.account_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountStatusFetch () {
    return this.AccountStatusFetch;
  }
  /** Set the SortOrder for field: AccountStatus (BILL_INVOICE.account_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountStatusSortOrder (Integer value) {
    this.AccountStatusSort = value;
  }
  /** Retrieve SortOrder for field: AccountStatus (BILL_INVOICE.account_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountStatusSortOrder () {
    return this.AccountStatusSort;
  }
  /** Set the sort direction for field: AccountStatus (BILL_INVOICE.account_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountStatusSortDirection (boolean ascending) {
    this.AccountStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountStatus (BILL_INVOICE.account_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountStatusSortDirection () {
    return this.AccountStatusSortAscending;
  }
  /** Set the field level filters for field: AccountStatus (BILL_INVOICE.account_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountStatus = value;
  }
  /** Retrieve filter for field: AccountStatus (BILL_INVOICE.account_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountStatusFilter () {
    return this.AccountStatus;
  }

  /**
   * Retrieves the AccountStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountStatusFilter field
   */
  public String[] getAccountStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountStatusFilter filter value from a formatted string
   *
   * @param _value the AccountStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountStatusFilter filter field
   */
  public void setAccountStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountStatusFilterFromFormattedString");
    try {
      this.setAccountStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountStatusFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated AccountStatusFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccountStatusFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountStatusFilter filter field
   */
  public String[] getAccountStatusFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountStatusFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getAccountStatusFilter(), "AccountStatus", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountStatusFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountStatusFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated AccountStatusFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountStatusFilter filter field
   */
  public void setAccountStatusFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountStatusFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setAccountStatusFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "AccountStatus", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountStatusFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountStatusFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: ImageReq (BILL_INVOICE.image_req)
   * @param fetch whether to fetch this field or not
   */
  public void setImageReqFetch (boolean fetch) {
    this.ImageReqFetch = fetch;
  }
  /** Retrieve Fetch value for field: ImageReq (BILL_INVOICE.image_req)
   * @return boolean the Fetch value for this field
   */
  public boolean getImageReqFetch () {
    return this.ImageReqFetch;
  }
  /** Set the SortOrder for field: ImageReq (BILL_INVOICE.image_req)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setImageReqSortOrder (Integer value) {
    this.ImageReqSort = value;
  }
  /** Retrieve SortOrder for field: ImageReq (BILL_INVOICE.image_req)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getImageReqSortOrder () {
    return this.ImageReqSort;
  }
  /** Set the sort direction for field: ImageReq (BILL_INVOICE.image_req)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setImageReqSortDirection (boolean ascending) {
    this.ImageReqSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ImageReq (BILL_INVOICE.image_req)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getImageReqSortDirection () {
    return this.ImageReqSortAscending;
  }
  /** Set the field level filters for field: ImageReq (BILL_INVOICE.image_req)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setImageReqFilter (BooleanFilter[] value) throws ServiceException {
    this.ImageReq = value;
  }
  /** Retrieve filter for field: ImageReq (BILL_INVOICE.image_req)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getImageReqFilter () {
    return this.ImageReq;
  }

  /**
   * Retrieves the ImageReqFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ImageReqFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ImageReqFilter field
   */
  public String[] getImageReqFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getImageReqFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getImageReqFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getImageReqFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ImageReqFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getImageReqFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ImageReqFilter filter value from a formatted string
   *
   * @param _value the ImageReqFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ImageReqFilter filter field
   */
  public void setImageReqFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setImageReqFilterFromFormattedString");
    try {
      this.setImageReqFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ImageReqFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setImageReqFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setImageReqFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ImageDone (BILL_INVOICE.image_done)
   * @param fetch whether to fetch this field or not
   */
  public void setImageDoneFetch (boolean fetch) {
    this.ImageDoneFetch = fetch;
  }
  /** Retrieve Fetch value for field: ImageDone (BILL_INVOICE.image_done)
   * @return boolean the Fetch value for this field
   */
  public boolean getImageDoneFetch () {
    return this.ImageDoneFetch;
  }
  /** Set the SortOrder for field: ImageDone (BILL_INVOICE.image_done)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setImageDoneSortOrder (Integer value) {
    this.ImageDoneSort = value;
  }
  /** Retrieve SortOrder for field: ImageDone (BILL_INVOICE.image_done)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getImageDoneSortOrder () {
    return this.ImageDoneSort;
  }
  /** Set the sort direction for field: ImageDone (BILL_INVOICE.image_done)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setImageDoneSortDirection (boolean ascending) {
    this.ImageDoneSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ImageDone (BILL_INVOICE.image_done)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getImageDoneSortDirection () {
    return this.ImageDoneSortAscending;
  }
  /** Set the field level filters for field: ImageDone (BILL_INVOICE.image_done)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setImageDoneFilter (BooleanFilter[] value) throws ServiceException {
    this.ImageDone = value;
  }
  /** Retrieve filter for field: ImageDone (BILL_INVOICE.image_done)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getImageDoneFilter () {
    return this.ImageDone;
  }

  /**
   * Retrieves the ImageDoneFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ImageDoneFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ImageDoneFilter field
   */
  public String[] getImageDoneFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getImageDoneFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getImageDoneFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getImageDoneFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ImageDoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getImageDoneFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ImageDoneFilter filter value from a formatted string
   *
   * @param _value the ImageDoneFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ImageDoneFilter filter field
   */
  public void setImageDoneFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setImageDoneFilterFromFormattedString");
    try {
      this.setImageDoneFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ImageDoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setImageDoneFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setImageDoneFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SpecialCode (BILL_INVOICE.special_code)
   * @param fetch whether to fetch this field or not
   */
  public void setSpecialCodeFetch (boolean fetch) {
    this.SpecialCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: SpecialCode (BILL_INVOICE.special_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getSpecialCodeFetch () {
    return this.SpecialCodeFetch;
  }
  /** Set the SortOrder for field: SpecialCode (BILL_INVOICE.special_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSpecialCodeSortOrder (Integer value) {
    this.SpecialCodeSort = value;
  }
  /** Retrieve SortOrder for field: SpecialCode (BILL_INVOICE.special_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSpecialCodeSortOrder () {
    return this.SpecialCodeSort;
  }
  /** Set the sort direction for field: SpecialCode (BILL_INVOICE.special_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSpecialCodeSortDirection (boolean ascending) {
    this.SpecialCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SpecialCode (BILL_INVOICE.special_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSpecialCodeSortDirection () {
    return this.SpecialCodeSortAscending;
  }
  /** Set the field level filters for field: SpecialCode (BILL_INVOICE.special_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSpecialCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.SpecialCode = value;
  }
  /** Retrieve filter for field: SpecialCode (BILL_INVOICE.special_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSpecialCodeFilter () {
    return this.SpecialCode;
  }

  /**
   * Retrieves the SpecialCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SpecialCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SpecialCodeFilter field
   */
  public String[] getSpecialCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSpecialCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSpecialCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSpecialCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SpecialCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSpecialCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SpecialCodeFilter filter value from a formatted string
   *
   * @param _value the SpecialCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SpecialCodeFilter filter field
   */
  public void setSpecialCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSpecialCodeFilterFromFormattedString");
    try {
      this.setSpecialCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SpecialCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSpecialCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSpecialCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PrepTask (BILL_INVOICE.prep_task)
   * @param fetch whether to fetch this field or not
   */
  public void setPrepTaskFetch (boolean fetch) {
    this.PrepTaskFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrepTask (BILL_INVOICE.prep_task)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrepTaskFetch () {
    return this.PrepTaskFetch;
  }
  /** Set the SortOrder for field: PrepTask (BILL_INVOICE.prep_task)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrepTaskSortOrder (Integer value) {
    this.PrepTaskSort = value;
  }
  /** Retrieve SortOrder for field: PrepTask (BILL_INVOICE.prep_task)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrepTaskSortOrder () {
    return this.PrepTaskSort;
  }
  /** Set the sort direction for field: PrepTask (BILL_INVOICE.prep_task)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrepTaskSortDirection (boolean ascending) {
    this.PrepTaskSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrepTask (BILL_INVOICE.prep_task)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrepTaskSortDirection () {
    return this.PrepTaskSortAscending;
  }
  /** Set the case insensitive for field: PrepTask (BILL_INVOICE.prep_task)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPrepTaskCaseInsensitive (boolean ascending) {
    this.PrepTaskCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PrepTask (BILL_INVOICE.prep_task)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPrepTaskCaseInsensitive () {
    return this.PrepTaskCaseInsensitive;
  }
  /** Set the field level filters for field: PrepTask (BILL_INVOICE.prep_task)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrepTaskFilter (StringFilter[] value) throws ServiceException {
    this.PrepTask = value;
  }
  /** Retrieve filter for field: PrepTask (BILL_INVOICE.prep_task)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPrepTaskFilter () {
    return this.PrepTask;
  }

  /**
   * Retrieves the PrepTaskFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrepTaskFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepTaskFilter field
   */
  public String[] getPrepTaskFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepTaskFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrepTaskFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepTaskFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepTaskFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepTaskFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrepTaskFilter filter value from a formatted string
   *
   * @param _value the PrepTaskFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrepTaskFilter filter field
   */
  public void setPrepTaskFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepTaskFilterFromFormattedString");
    try {
      this.setPrepTaskFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepTaskFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepTaskFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepTaskFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PrepStatus (BILL_INVOICE.prep_status)
   * @param fetch whether to fetch this field or not
   */
  public void setPrepStatusFetch (boolean fetch) {
    this.PrepStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrepStatus (BILL_INVOICE.prep_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrepStatusFetch () {
    return this.PrepStatusFetch;
  }
  /** Set the SortOrder for field: PrepStatus (BILL_INVOICE.prep_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrepStatusSortOrder (Integer value) {
    this.PrepStatusSort = value;
  }
  /** Retrieve SortOrder for field: PrepStatus (BILL_INVOICE.prep_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrepStatusSortOrder () {
    return this.PrepStatusSort;
  }
  /** Set the sort direction for field: PrepStatus (BILL_INVOICE.prep_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrepStatusSortDirection (boolean ascending) {
    this.PrepStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrepStatus (BILL_INVOICE.prep_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrepStatusSortDirection () {
    return this.PrepStatusSortAscending;
  }
  /** Set the field level filters for field: PrepStatus (BILL_INVOICE.prep_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrepStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.PrepStatus = value;
  }
  /** Retrieve filter for field: PrepStatus (BILL_INVOICE.prep_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPrepStatusFilter () {
    return this.PrepStatus;
  }

  /**
   * Retrieves the PrepStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrepStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepStatusFilter field
   */
  public String[] getPrepStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrepStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrepStatusFilter filter value from a formatted string
   *
   * @param _value the PrepStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrepStatusFilter filter field
   */
  public void setPrepStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepStatusFilterFromFormattedString");
    try {
      this.setPrepStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepStatusFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated PrepStatusFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the PrepStatusFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PrepStatusFilter filter field
   */
  public String[] getPrepStatusFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepStatusFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getPrepStatusFilter(), "BillPrepStatus", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepStatusFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepStatusFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated PrepStatusFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the PrepStatusFilter filter field
   */
  public void setPrepStatusFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepStatusFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setPrepStatusFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "PrepStatus", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepStatusFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepStatusFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: FormatStatus (BILL_INVOICE.format_status)
   * @param fetch whether to fetch this field or not
   */
  public void setFormatStatusFetch (boolean fetch) {
    this.FormatStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: FormatStatus (BILL_INVOICE.format_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getFormatStatusFetch () {
    return this.FormatStatusFetch;
  }
  /** Set the SortOrder for field: FormatStatus (BILL_INVOICE.format_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFormatStatusSortOrder (Integer value) {
    this.FormatStatusSort = value;
  }
  /** Retrieve SortOrder for field: FormatStatus (BILL_INVOICE.format_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFormatStatusSortOrder () {
    return this.FormatStatusSort;
  }
  /** Set the sort direction for field: FormatStatus (BILL_INVOICE.format_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFormatStatusSortDirection (boolean ascending) {
    this.FormatStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FormatStatus (BILL_INVOICE.format_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFormatStatusSortDirection () {
    return this.FormatStatusSortAscending;
  }
  /** Set the field level filters for field: FormatStatus (BILL_INVOICE.format_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFormatStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.FormatStatus = value;
  }
  /** Retrieve filter for field: FormatStatus (BILL_INVOICE.format_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getFormatStatusFilter () {
    return this.FormatStatus;
  }

  /**
   * Retrieves the FormatStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FormatStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FormatStatusFilter field
   */
  public String[] getFormatStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFormatStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFormatStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFormatStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FormatStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFormatStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FormatStatusFilter filter value from a formatted string
   *
   * @param _value the FormatStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FormatStatusFilter filter field
   */
  public void setFormatStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFormatStatusFilterFromFormattedString");
    try {
      this.setFormatStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FormatStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFormatStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFormatStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DispatchCount (BILL_INVOICE.dispatch_count)
   * @param fetch whether to fetch this field or not
   */
  public void setDispatchCountFetch (boolean fetch) {
    this.DispatchCountFetch = fetch;
  }
  /** Retrieve Fetch value for field: DispatchCount (BILL_INVOICE.dispatch_count)
   * @return boolean the Fetch value for this field
   */
  public boolean getDispatchCountFetch () {
    return this.DispatchCountFetch;
  }
  /** Set the SortOrder for field: DispatchCount (BILL_INVOICE.dispatch_count)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDispatchCountSortOrder (Integer value) {
    this.DispatchCountSort = value;
  }
  /** Retrieve SortOrder for field: DispatchCount (BILL_INVOICE.dispatch_count)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDispatchCountSortOrder () {
    return this.DispatchCountSort;
  }
  /** Set the sort direction for field: DispatchCount (BILL_INVOICE.dispatch_count)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDispatchCountSortDirection (boolean ascending) {
    this.DispatchCountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DispatchCount (BILL_INVOICE.dispatch_count)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDispatchCountSortDirection () {
    return this.DispatchCountSortAscending;
  }
  /** Set the field level filters for field: DispatchCount (BILL_INVOICE.dispatch_count)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDispatchCountFilter (IntegerFilter[] value) throws ServiceException {
    this.DispatchCount = value;
  }
  /** Retrieve filter for field: DispatchCount (BILL_INVOICE.dispatch_count)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDispatchCountFilter () {
    return this.DispatchCount;
  }

  /**
   * Retrieves the DispatchCountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DispatchCountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DispatchCountFilter field
   */
  public String[] getDispatchCountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDispatchCountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDispatchCountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDispatchCountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DispatchCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDispatchCountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DispatchCountFilter filter value from a formatted string
   *
   * @param _value the DispatchCountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DispatchCountFilter filter field
   */
  public void setDispatchCountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDispatchCountFilterFromFormattedString");
    try {
      this.setDispatchCountFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DispatchCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDispatchCountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDispatchCountFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DispatchDate (BILL_INVOICE.dispatch_date)
   * @param fetch whether to fetch this field or not
   */
  public void setDispatchDateFetch (boolean fetch) {
    this.DispatchDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: DispatchDate (BILL_INVOICE.dispatch_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getDispatchDateFetch () {
    return this.DispatchDateFetch;
  }
  /** Set the SortOrder for field: DispatchDate (BILL_INVOICE.dispatch_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDispatchDateSortOrder (Integer value) {
    this.DispatchDateSort = value;
  }
  /** Retrieve SortOrder for field: DispatchDate (BILL_INVOICE.dispatch_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDispatchDateSortOrder () {
    return this.DispatchDateSort;
  }
  /** Set the sort direction for field: DispatchDate (BILL_INVOICE.dispatch_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDispatchDateSortDirection (boolean ascending) {
    this.DispatchDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DispatchDate (BILL_INVOICE.dispatch_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDispatchDateSortDirection () {
    return this.DispatchDateSortAscending;
  }
  /** Set the field level filters for field: DispatchDate (BILL_INVOICE.dispatch_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDispatchDateFilter (DateFilter[] value) throws ServiceException {
    this.DispatchDate = value;
  }
  /** Retrieve filter for field: DispatchDate (BILL_INVOICE.dispatch_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getDispatchDateFilter () {
    return this.DispatchDate;
  }

  /**
   * Retrieves the DispatchDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DispatchDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DispatchDateFilter field
   */
  public String[] getDispatchDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDispatchDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDispatchDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDispatchDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DispatchDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDispatchDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DispatchDateFilter filter value from a formatted string
   *
   * @param _value the DispatchDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DispatchDateFilter filter field
   */
  public void setDispatchDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDispatchDateFilterFromFormattedString");
    try {
      this.setDispatchDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DispatchDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDispatchDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDispatchDateFilterFromFormattedString");
  }

  /**
   * Retrieves the DispatchDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DispatchDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DispatchDateFilter field
   */
  public String[] getDispatchDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDispatchDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDispatchDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDispatchDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DispatchDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDispatchDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DispatchDateFilter filter value from a formatted string
   *
   * @param _value the DispatchDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DispatchDateFilter filter field
   */
  public void setDispatchDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDispatchDateFilterFromFormattedDateTimeString");
    try {
      this.setDispatchDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DispatchDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDispatchDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDispatchDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: FileName (BILL_INVOICE.file_name)
   * @param fetch whether to fetch this field or not
   */
  public void setFileNameFetch (boolean fetch) {
    this.FileNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: FileName (BILL_INVOICE.file_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getFileNameFetch () {
    return this.FileNameFetch;
  }
  /** Set the SortOrder for field: FileName (BILL_INVOICE.file_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFileNameSortOrder (Integer value) {
    this.FileNameSort = value;
  }
  /** Retrieve SortOrder for field: FileName (BILL_INVOICE.file_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFileNameSortOrder () {
    return this.FileNameSort;
  }
  /** Set the sort direction for field: FileName (BILL_INVOICE.file_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFileNameSortDirection (boolean ascending) {
    this.FileNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FileName (BILL_INVOICE.file_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFileNameSortDirection () {
    return this.FileNameSortAscending;
  }
  /** Set the case insensitive for field: FileName (BILL_INVOICE.file_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setFileNameCaseInsensitive (boolean ascending) {
    this.FileNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: FileName (BILL_INVOICE.file_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getFileNameCaseInsensitive () {
    return this.FileNameCaseInsensitive;
  }
  /** Set the field level filters for field: FileName (BILL_INVOICE.file_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFileNameFilter (StringFilter[] value) throws ServiceException {
    this.FileName = value;
  }
  /** Retrieve filter for field: FileName (BILL_INVOICE.file_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getFileNameFilter () {
    return this.FileName;
  }

  /**
   * Retrieves the FileNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FileNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FileNameFilter field
   */
  public String[] getFileNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFileNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFileNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFileNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FileNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFileNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FileNameFilter filter value from a formatted string
   *
   * @param _value the FileNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FileNameFilter filter field
   */
  public void setFileNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFileNameFilterFromFormattedString");
    try {
      this.setFileNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FileNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFileNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFileNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: StartOffset (BILL_INVOICE.start_offset)
   * @param fetch whether to fetch this field or not
   */
  public void setStartOffsetFetch (boolean fetch) {
    this.StartOffsetFetch = fetch;
  }
  /** Retrieve Fetch value for field: StartOffset (BILL_INVOICE.start_offset)
   * @return boolean the Fetch value for this field
   */
  public boolean getStartOffsetFetch () {
    return this.StartOffsetFetch;
  }
  /** Set the SortOrder for field: StartOffset (BILL_INVOICE.start_offset)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStartOffsetSortOrder (Integer value) {
    this.StartOffsetSort = value;
  }
  /** Retrieve SortOrder for field: StartOffset (BILL_INVOICE.start_offset)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStartOffsetSortOrder () {
    return this.StartOffsetSort;
  }
  /** Set the sort direction for field: StartOffset (BILL_INVOICE.start_offset)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStartOffsetSortDirection (boolean ascending) {
    this.StartOffsetSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StartOffset (BILL_INVOICE.start_offset)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStartOffsetSortDirection () {
    return this.StartOffsetSortAscending;
  }
  /** Set the field level filters for field: StartOffset (BILL_INVOICE.start_offset)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStartOffsetFilter (IntegerFilter[] value) throws ServiceException {
    this.StartOffset = value;
  }
  /** Retrieve filter for field: StartOffset (BILL_INVOICE.start_offset)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getStartOffsetFilter () {
    return this.StartOffset;
  }

  /**
   * Retrieves the StartOffsetFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StartOffsetFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartOffsetFilter field
   */
  public String[] getStartOffsetFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartOffsetFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStartOffsetFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartOffsetFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartOffsetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartOffsetFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StartOffsetFilter filter value from a formatted string
   *
   * @param _value the StartOffsetFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StartOffsetFilter filter field
   */
  public void setStartOffsetFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStartOffsetFilterFromFormattedString");
    try {
      this.setStartOffsetFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartOffsetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartOffsetFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStartOffsetFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EndOffset (BILL_INVOICE.end_offset)
   * @param fetch whether to fetch this field or not
   */
  public void setEndOffsetFetch (boolean fetch) {
    this.EndOffsetFetch = fetch;
  }
  /** Retrieve Fetch value for field: EndOffset (BILL_INVOICE.end_offset)
   * @return boolean the Fetch value for this field
   */
  public boolean getEndOffsetFetch () {
    return this.EndOffsetFetch;
  }
  /** Set the SortOrder for field: EndOffset (BILL_INVOICE.end_offset)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEndOffsetSortOrder (Integer value) {
    this.EndOffsetSort = value;
  }
  /** Retrieve SortOrder for field: EndOffset (BILL_INVOICE.end_offset)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEndOffsetSortOrder () {
    return this.EndOffsetSort;
  }
  /** Set the sort direction for field: EndOffset (BILL_INVOICE.end_offset)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEndOffsetSortDirection (boolean ascending) {
    this.EndOffsetSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EndOffset (BILL_INVOICE.end_offset)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEndOffsetSortDirection () {
    return this.EndOffsetSortAscending;
  }
  /** Set the field level filters for field: EndOffset (BILL_INVOICE.end_offset)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEndOffsetFilter (IntegerFilter[] value) throws ServiceException {
    this.EndOffset = value;
  }
  /** Retrieve filter for field: EndOffset (BILL_INVOICE.end_offset)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEndOffsetFilter () {
    return this.EndOffset;
  }

  /**
   * Retrieves the EndOffsetFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EndOffsetFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EndOffsetFilter field
   */
  public String[] getEndOffsetFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEndOffsetFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEndOffsetFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEndOffsetFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndOffsetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEndOffsetFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EndOffsetFilter filter value from a formatted string
   *
   * @param _value the EndOffsetFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EndOffsetFilter filter field
   */
  public void setEndOffsetFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEndOffsetFilterFromFormattedString");
    try {
      this.setEndOffsetFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndOffsetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEndOffsetFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEndOffsetFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PageCount (BILL_INVOICE.page_count)
   * @param fetch whether to fetch this field or not
   */
  public void setPageCountFetch (boolean fetch) {
    this.PageCountFetch = fetch;
  }
  /** Retrieve Fetch value for field: PageCount (BILL_INVOICE.page_count)
   * @return boolean the Fetch value for this field
   */
  public boolean getPageCountFetch () {
    return this.PageCountFetch;
  }
  /** Set the SortOrder for field: PageCount (BILL_INVOICE.page_count)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPageCountSortOrder (Integer value) {
    this.PageCountSort = value;
  }
  /** Retrieve SortOrder for field: PageCount (BILL_INVOICE.page_count)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPageCountSortOrder () {
    return this.PageCountSort;
  }
  /** Set the sort direction for field: PageCount (BILL_INVOICE.page_count)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPageCountSortDirection (boolean ascending) {
    this.PageCountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PageCount (BILL_INVOICE.page_count)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPageCountSortDirection () {
    return this.PageCountSortAscending;
  }
  /** Set the field level filters for field: PageCount (BILL_INVOICE.page_count)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPageCountFilter (IntegerFilter[] value) throws ServiceException {
    this.PageCount = value;
  }
  /** Retrieve filter for field: PageCount (BILL_INVOICE.page_count)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPageCountFilter () {
    return this.PageCount;
  }

  /**
   * Retrieves the PageCountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PageCountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PageCountFilter field
   */
  public String[] getPageCountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPageCountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPageCountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPageCountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PageCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPageCountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PageCountFilter filter value from a formatted string
   *
   * @param _value the PageCountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PageCountFilter filter field
   */
  public void setPageCountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPageCountFilterFromFormattedString");
    try {
      this.setPageCountFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PageCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPageCountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPageCountFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillHoldCode (BILL_INVOICE.bill_hold_code)
   * @param fetch whether to fetch this field or not
   */
  public void setBillHoldCodeFetch (boolean fetch) {
    this.BillHoldCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillHoldCode (BILL_INVOICE.bill_hold_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillHoldCodeFetch () {
    return this.BillHoldCodeFetch;
  }
  /** Set the SortOrder for field: BillHoldCode (BILL_INVOICE.bill_hold_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillHoldCodeSortOrder (Integer value) {
    this.BillHoldCodeSort = value;
  }
  /** Retrieve SortOrder for field: BillHoldCode (BILL_INVOICE.bill_hold_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillHoldCodeSortOrder () {
    return this.BillHoldCodeSort;
  }
  /** Set the sort direction for field: BillHoldCode (BILL_INVOICE.bill_hold_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillHoldCodeSortDirection (boolean ascending) {
    this.BillHoldCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillHoldCode (BILL_INVOICE.bill_hold_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillHoldCodeSortDirection () {
    return this.BillHoldCodeSortAscending;
  }
  /** Set the field level filters for field: BillHoldCode (BILL_INVOICE.bill_hold_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillHoldCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.BillHoldCode = value;
  }
  /** Retrieve filter for field: BillHoldCode (BILL_INVOICE.bill_hold_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillHoldCodeFilter () {
    return this.BillHoldCode;
  }

  /**
   * Retrieves the BillHoldCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillHoldCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillHoldCodeFilter field
   */
  public String[] getBillHoldCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillHoldCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillHoldCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillHoldCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillHoldCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillHoldCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillHoldCodeFilter filter value from a formatted string
   *
   * @param _value the BillHoldCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillHoldCodeFilter filter field
   */
  public void setBillHoldCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillHoldCodeFilterFromFormattedString");
    try {
      this.setBillHoldCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillHoldCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillHoldCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillHoldCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PrepErrorCode (BILL_INVOICE.prep_error_code)
   * @param fetch whether to fetch this field or not
   */
  public void setPrepErrorCodeFetch (boolean fetch) {
    this.PrepErrorCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrepErrorCode (BILL_INVOICE.prep_error_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrepErrorCodeFetch () {
    return this.PrepErrorCodeFetch;
  }
  /** Set the SortOrder for field: PrepErrorCode (BILL_INVOICE.prep_error_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrepErrorCodeSortOrder (Integer value) {
    this.PrepErrorCodeSort = value;
  }
  /** Retrieve SortOrder for field: PrepErrorCode (BILL_INVOICE.prep_error_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrepErrorCodeSortOrder () {
    return this.PrepErrorCodeSort;
  }
  /** Set the sort direction for field: PrepErrorCode (BILL_INVOICE.prep_error_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrepErrorCodeSortDirection (boolean ascending) {
    this.PrepErrorCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrepErrorCode (BILL_INVOICE.prep_error_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrepErrorCodeSortDirection () {
    return this.PrepErrorCodeSortAscending;
  }
  /** Set the field level filters for field: PrepErrorCode (BILL_INVOICE.prep_error_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrepErrorCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.PrepErrorCode = value;
  }
  /** Retrieve filter for field: PrepErrorCode (BILL_INVOICE.prep_error_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPrepErrorCodeFilter () {
    return this.PrepErrorCode;
  }

  /**
   * Retrieves the PrepErrorCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrepErrorCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepErrorCodeFilter field
   */
  public String[] getPrepErrorCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepErrorCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrepErrorCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepErrorCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepErrorCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepErrorCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrepErrorCodeFilter filter value from a formatted string
   *
   * @param _value the PrepErrorCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrepErrorCodeFilter filter field
   */
  public void setPrepErrorCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepErrorCodeFilterFromFormattedString");
    try {
      this.setPrepErrorCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepErrorCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepErrorCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepErrorCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FormatErrorCode (BILL_INVOICE.format_error_code)
   * @param fetch whether to fetch this field or not
   */
  public void setFormatErrorCodeFetch (boolean fetch) {
    this.FormatErrorCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: FormatErrorCode (BILL_INVOICE.format_error_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getFormatErrorCodeFetch () {
    return this.FormatErrorCodeFetch;
  }
  /** Set the SortOrder for field: FormatErrorCode (BILL_INVOICE.format_error_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFormatErrorCodeSortOrder (Integer value) {
    this.FormatErrorCodeSort = value;
  }
  /** Retrieve SortOrder for field: FormatErrorCode (BILL_INVOICE.format_error_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFormatErrorCodeSortOrder () {
    return this.FormatErrorCodeSort;
  }
  /** Set the sort direction for field: FormatErrorCode (BILL_INVOICE.format_error_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFormatErrorCodeSortDirection (boolean ascending) {
    this.FormatErrorCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FormatErrorCode (BILL_INVOICE.format_error_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFormatErrorCodeSortDirection () {
    return this.FormatErrorCodeSortAscending;
  }
  /** Set the field level filters for field: FormatErrorCode (BILL_INVOICE.format_error_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFormatErrorCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.FormatErrorCode = value;
  }
  /** Retrieve filter for field: FormatErrorCode (BILL_INVOICE.format_error_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getFormatErrorCodeFilter () {
    return this.FormatErrorCode;
  }

  /**
   * Retrieves the FormatErrorCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FormatErrorCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FormatErrorCodeFilter field
   */
  public String[] getFormatErrorCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFormatErrorCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFormatErrorCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFormatErrorCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FormatErrorCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFormatErrorCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FormatErrorCodeFilter filter value from a formatted string
   *
   * @param _value the FormatErrorCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FormatErrorCodeFilter filter field
   */
  public void setFormatErrorCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFormatErrorCodeFilterFromFormattedString");
    try {
      this.setFormatErrorCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FormatErrorCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFormatErrorCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFormatErrorCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BackoutStatus (BILL_INVOICE.backout_status)
   * @param fetch whether to fetch this field or not
   */
  public void setBackoutStatusFetch (boolean fetch) {
    this.BackoutStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: BackoutStatus (BILL_INVOICE.backout_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getBackoutStatusFetch () {
    return this.BackoutStatusFetch;
  }
  /** Set the SortOrder for field: BackoutStatus (BILL_INVOICE.backout_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBackoutStatusSortOrder (Integer value) {
    this.BackoutStatusSort = value;
  }
  /** Retrieve SortOrder for field: BackoutStatus (BILL_INVOICE.backout_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBackoutStatusSortOrder () {
    return this.BackoutStatusSort;
  }
  /** Set the sort direction for field: BackoutStatus (BILL_INVOICE.backout_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBackoutStatusSortDirection (boolean ascending) {
    this.BackoutStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BackoutStatus (BILL_INVOICE.backout_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBackoutStatusSortDirection () {
    return this.BackoutStatusSortAscending;
  }
  /** Set the field level filters for field: BackoutStatus (BILL_INVOICE.backout_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBackoutStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.BackoutStatus = value;
  }
  /** Retrieve filter for field: BackoutStatus (BILL_INVOICE.backout_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBackoutStatusFilter () {
    return this.BackoutStatus;
  }

  /**
   * Retrieves the BackoutStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BackoutStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BackoutStatusFilter field
   */
  public String[] getBackoutStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBackoutStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBackoutStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBackoutStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BackoutStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBackoutStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BackoutStatusFilter filter value from a formatted string
   *
   * @param _value the BackoutStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BackoutStatusFilter filter field
   */
  public void setBackoutStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBackoutStatusFilterFromFormattedString");
    try {
      this.setBackoutStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BackoutStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBackoutStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBackoutStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CopyType (BILL_INVOICE.copy_type)
   * @param fetch whether to fetch this field or not
   */
  public void setCopyTypeFetch (boolean fetch) {
    this.CopyTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CopyType (BILL_INVOICE.copy_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getCopyTypeFetch () {
    return this.CopyTypeFetch;
  }
  /** Set the SortOrder for field: CopyType (BILL_INVOICE.copy_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCopyTypeSortOrder (Integer value) {
    this.CopyTypeSort = value;
  }
  /** Retrieve SortOrder for field: CopyType (BILL_INVOICE.copy_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCopyTypeSortOrder () {
    return this.CopyTypeSort;
  }
  /** Set the sort direction for field: CopyType (BILL_INVOICE.copy_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCopyTypeSortDirection (boolean ascending) {
    this.CopyTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CopyType (BILL_INVOICE.copy_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCopyTypeSortDirection () {
    return this.CopyTypeSortAscending;
  }
  /** Set the field level filters for field: CopyType (BILL_INVOICE.copy_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCopyTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.CopyType = value;
  }
  /** Retrieve filter for field: CopyType (BILL_INVOICE.copy_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCopyTypeFilter () {
    return this.CopyType;
  }

  /**
   * Retrieves the CopyTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CopyTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CopyTypeFilter field
   */
  public String[] getCopyTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCopyTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCopyTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCopyTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CopyTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCopyTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CopyTypeFilter filter value from a formatted string
   *
   * @param _value the CopyTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CopyTypeFilter filter field
   */
  public void setCopyTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCopyTypeFilterFromFormattedString");
    try {
      this.setCopyTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CopyTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCopyTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCopyTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OrigBillRefno (BILL_INVOICE.orig_bill_refno)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigBillRefnoFetch (boolean fetch) {
    this.OrigBillRefnoFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigBillRefno (BILL_INVOICE.orig_bill_refno)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigBillRefnoFetch () {
    return this.OrigBillRefnoFetch;
  }
  /** Set the SortOrder for field: OrigBillRefno (BILL_INVOICE.orig_bill_refno)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigBillRefnoSortOrder (Integer value) {
    this.OrigBillRefnoSort = value;
  }
  /** Retrieve SortOrder for field: OrigBillRefno (BILL_INVOICE.orig_bill_refno)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigBillRefnoSortOrder () {
    return this.OrigBillRefnoSort;
  }
  /** Set the sort direction for field: OrigBillRefno (BILL_INVOICE.orig_bill_refno)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigBillRefnoSortDirection (boolean ascending) {
    this.OrigBillRefnoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigBillRefno (BILL_INVOICE.orig_bill_refno)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigBillRefnoSortDirection () {
    return this.OrigBillRefnoSortAscending;
  }
  /** Set the field level filters for field: OrigBillRefno (BILL_INVOICE.orig_bill_refno)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigBillRefnoFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigBillRefno = value;
  }
  /** Retrieve filter for field: OrigBillRefno (BILL_INVOICE.orig_bill_refno)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigBillRefnoFilter () {
    return this.OrigBillRefno;
  }

  /**
   * Retrieves the OrigBillRefnoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigBillRefnoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBillRefnoFilter field
   */
  public String[] getOrigBillRefnoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefnoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigBillRefnoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBillRefnoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigBillRefnoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBillRefnoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigBillRefnoFilter filter value from a formatted string
   *
   * @param _value the OrigBillRefnoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigBillRefnoFilter filter field
   */
  public void setOrigBillRefnoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigBillRefnoFilterFromFormattedString");
    try {
      this.setOrigBillRefnoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigBillRefnoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBillRefnoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBillRefnoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OrigBillRefResets (BILL_INVOICE.orig_bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigBillRefResetsFetch (boolean fetch) {
    this.OrigBillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigBillRefResets (BILL_INVOICE.orig_bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigBillRefResetsFetch () {
    return this.OrigBillRefResetsFetch;
  }
  /** Set the SortOrder for field: OrigBillRefResets (BILL_INVOICE.orig_bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigBillRefResetsSortOrder (Integer value) {
    this.OrigBillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: OrigBillRefResets (BILL_INVOICE.orig_bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigBillRefResetsSortOrder () {
    return this.OrigBillRefResetsSort;
  }
  /** Set the sort direction for field: OrigBillRefResets (BILL_INVOICE.orig_bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigBillRefResetsSortDirection (boolean ascending) {
    this.OrigBillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigBillRefResets (BILL_INVOICE.orig_bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigBillRefResetsSortDirection () {
    return this.OrigBillRefResetsSortAscending;
  }
  /** Set the field level filters for field: OrigBillRefResets (BILL_INVOICE.orig_bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigBillRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigBillRefResets = value;
  }
  /** Retrieve filter for field: OrigBillRefResets (BILL_INVOICE.orig_bill_ref_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigBillRefResetsFilter () {
    return this.OrigBillRefResets;
  }

  /**
   * Retrieves the OrigBillRefResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigBillRefResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBillRefResetsFilter field
   */
  public String[] getOrigBillRefResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigBillRefResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBillRefResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigBillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBillRefResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigBillRefResetsFilter filter value from a formatted string
   *
   * @param _value the OrigBillRefResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigBillRefResetsFilter filter field
   */
  public void setOrigBillRefResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigBillRefResetsFilterFromFormattedString");
    try {
      this.setOrigBillRefResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigBillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBillRefResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBillRefResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CollectionHistory (BILL_INVOICE.collection_history)
   * @param fetch whether to fetch this field or not
   */
  public void setCollectionHistoryFetch (boolean fetch) {
    this.CollectionHistoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: CollectionHistory (BILL_INVOICE.collection_history)
   * @return boolean the Fetch value for this field
   */
  public boolean getCollectionHistoryFetch () {
    return this.CollectionHistoryFetch;
  }
  /** Set the SortOrder for field: CollectionHistory (BILL_INVOICE.collection_history)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCollectionHistorySortOrder (Integer value) {
    this.CollectionHistorySort = value;
  }
  /** Retrieve SortOrder for field: CollectionHistory (BILL_INVOICE.collection_history)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCollectionHistorySortOrder () {
    return this.CollectionHistorySort;
  }
  /** Set the sort direction for field: CollectionHistory (BILL_INVOICE.collection_history)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCollectionHistorySortDirection (boolean ascending) {
    this.CollectionHistorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CollectionHistory (BILL_INVOICE.collection_history)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCollectionHistorySortDirection () {
    return this.CollectionHistorySortAscending;
  }
  /** Set the case insensitive for field: CollectionHistory (BILL_INVOICE.collection_history)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCollectionHistoryCaseInsensitive (boolean ascending) {
    this.CollectionHistoryCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CollectionHistory (BILL_INVOICE.collection_history)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCollectionHistoryCaseInsensitive () {
    return this.CollectionHistoryCaseInsensitive;
  }
  /** Set the field level filters for field: CollectionHistory (BILL_INVOICE.collection_history)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCollectionHistoryFilter (StringFilter[] value) throws ServiceException {
    this.CollectionHistory = value;
  }
  /** Retrieve filter for field: CollectionHistory (BILL_INVOICE.collection_history)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCollectionHistoryFilter () {
    return this.CollectionHistory;
  }

  /**
   * Retrieves the CollectionHistoryFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CollectionHistoryFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CollectionHistoryFilter field
   */
  public String[] getCollectionHistoryFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCollectionHistoryFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCollectionHistoryFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCollectionHistoryFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CollectionHistoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCollectionHistoryFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CollectionHistoryFilter filter value from a formatted string
   *
   * @param _value the CollectionHistoryFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CollectionHistoryFilter filter field
   */
  public void setCollectionHistoryFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCollectionHistoryFilterFromFormattedString");
    try {
      this.setCollectionHistoryFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CollectionHistoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCollectionHistoryFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCollectionHistoryFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: JnlEarnedThruDt (BILL_INVOICE.jnl_earned_thru_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setJnlEarnedThruDtFetch (boolean fetch) {
    this.JnlEarnedThruDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: JnlEarnedThruDt (BILL_INVOICE.jnl_earned_thru_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getJnlEarnedThruDtFetch () {
    return this.JnlEarnedThruDtFetch;
  }
  /** Set the SortOrder for field: JnlEarnedThruDt (BILL_INVOICE.jnl_earned_thru_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setJnlEarnedThruDtSortOrder (Integer value) {
    this.JnlEarnedThruDtSort = value;
  }
  /** Retrieve SortOrder for field: JnlEarnedThruDt (BILL_INVOICE.jnl_earned_thru_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getJnlEarnedThruDtSortOrder () {
    return this.JnlEarnedThruDtSort;
  }
  /** Set the sort direction for field: JnlEarnedThruDt (BILL_INVOICE.jnl_earned_thru_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setJnlEarnedThruDtSortDirection (boolean ascending) {
    this.JnlEarnedThruDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: JnlEarnedThruDt (BILL_INVOICE.jnl_earned_thru_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getJnlEarnedThruDtSortDirection () {
    return this.JnlEarnedThruDtSortAscending;
  }
  /** Set the field level filters for field: JnlEarnedThruDt (BILL_INVOICE.jnl_earned_thru_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setJnlEarnedThruDtFilter (DateFilter[] value) throws ServiceException {
    this.JnlEarnedThruDt = value;
  }
  /** Retrieve filter for field: JnlEarnedThruDt (BILL_INVOICE.jnl_earned_thru_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getJnlEarnedThruDtFilter () {
    return this.JnlEarnedThruDt;
  }

  /**
   * Retrieves the JnlEarnedThruDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The JnlEarnedThruDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the JnlEarnedThruDtFilter field
   */
  public String[] getJnlEarnedThruDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJnlEarnedThruDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getJnlEarnedThruDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getJnlEarnedThruDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("JnlEarnedThruDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getJnlEarnedThruDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the JnlEarnedThruDtFilter filter value from a formatted string
   *
   * @param _value the JnlEarnedThruDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the JnlEarnedThruDtFilter filter field
   */
  public void setJnlEarnedThruDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setJnlEarnedThruDtFilterFromFormattedString");
    try {
      this.setJnlEarnedThruDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("JnlEarnedThruDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setJnlEarnedThruDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setJnlEarnedThruDtFilterFromFormattedString");
  }

  /**
   * Retrieves the JnlEarnedThruDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The JnlEarnedThruDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the JnlEarnedThruDtFilter field
   */
  public String[] getJnlEarnedThruDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJnlEarnedThruDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getJnlEarnedThruDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getJnlEarnedThruDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("JnlEarnedThruDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getJnlEarnedThruDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the JnlEarnedThruDtFilter filter value from a formatted string
   *
   * @param _value the JnlEarnedThruDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the JnlEarnedThruDtFilter filter field
   */
  public void setJnlEarnedThruDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setJnlEarnedThruDtFilterFromFormattedDateTimeString");
    try {
      this.setJnlEarnedThruDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("JnlEarnedThruDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setJnlEarnedThruDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setJnlEarnedThruDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: JnlStatus (BILL_INVOICE.jnl_status)
   * @param fetch whether to fetch this field or not
   */
  public void setJnlStatusFetch (boolean fetch) {
    this.JnlStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: JnlStatus (BILL_INVOICE.jnl_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getJnlStatusFetch () {
    return this.JnlStatusFetch;
  }
  /** Set the SortOrder for field: JnlStatus (BILL_INVOICE.jnl_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setJnlStatusSortOrder (Integer value) {
    this.JnlStatusSort = value;
  }
  /** Retrieve SortOrder for field: JnlStatus (BILL_INVOICE.jnl_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getJnlStatusSortOrder () {
    return this.JnlStatusSort;
  }
  /** Set the sort direction for field: JnlStatus (BILL_INVOICE.jnl_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setJnlStatusSortDirection (boolean ascending) {
    this.JnlStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: JnlStatus (BILL_INVOICE.jnl_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getJnlStatusSortDirection () {
    return this.JnlStatusSortAscending;
  }
  /** Set the field level filters for field: JnlStatus (BILL_INVOICE.jnl_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setJnlStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.JnlStatus = value;
  }
  /** Retrieve filter for field: JnlStatus (BILL_INVOICE.jnl_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getJnlStatusFilter () {
    return this.JnlStatus;
  }

  /**
   * Retrieves the JnlStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The JnlStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the JnlStatusFilter field
   */
  public String[] getJnlStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJnlStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getJnlStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getJnlStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("JnlStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getJnlStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the JnlStatusFilter filter value from a formatted string
   *
   * @param _value the JnlStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the JnlStatusFilter filter field
   */
  public void setJnlStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setJnlStatusFilterFromFormattedString");
    try {
      this.setJnlStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("JnlStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setJnlStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setJnlStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TestFlag (BILL_INVOICE.test_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setTestFlagFetch (boolean fetch) {
    this.TestFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: TestFlag (BILL_INVOICE.test_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getTestFlagFetch () {
    return this.TestFlagFetch;
  }
  /** Set the SortOrder for field: TestFlag (BILL_INVOICE.test_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTestFlagSortOrder (Integer value) {
    this.TestFlagSort = value;
  }
  /** Retrieve SortOrder for field: TestFlag (BILL_INVOICE.test_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTestFlagSortOrder () {
    return this.TestFlagSort;
  }
  /** Set the sort direction for field: TestFlag (BILL_INVOICE.test_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTestFlagSortDirection (boolean ascending) {
    this.TestFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TestFlag (BILL_INVOICE.test_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTestFlagSortDirection () {
    return this.TestFlagSortAscending;
  }
  /** Set the field level filters for field: TestFlag (BILL_INVOICE.test_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTestFlagFilter (BooleanFilter[] value) throws ServiceException {
    this.TestFlag = value;
  }
  /** Retrieve filter for field: TestFlag (BILL_INVOICE.test_flag)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getTestFlagFilter () {
    return this.TestFlag;
  }

  /**
   * Retrieves the TestFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TestFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TestFlagFilter field
   */
  public String[] getTestFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTestFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTestFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTestFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TestFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTestFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TestFlagFilter filter value from a formatted string
   *
   * @param _value the TestFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TestFlagFilter filter field
   */
  public void setTestFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTestFlagFilterFromFormattedString");
    try {
      this.setTestFlagFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TestFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTestFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTestFlagFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ArchFlag (BILL_INVOICE.arch_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setArchFlagFetch (boolean fetch) {
    this.ArchFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: ArchFlag (BILL_INVOICE.arch_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getArchFlagFetch () {
    return this.ArchFlagFetch;
  }
  /** Set the SortOrder for field: ArchFlag (BILL_INVOICE.arch_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setArchFlagSortOrder (Integer value) {
    this.ArchFlagSort = value;
  }
  /** Retrieve SortOrder for field: ArchFlag (BILL_INVOICE.arch_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getArchFlagSortOrder () {
    return this.ArchFlagSort;
  }
  /** Set the sort direction for field: ArchFlag (BILL_INVOICE.arch_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setArchFlagSortDirection (boolean ascending) {
    this.ArchFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ArchFlag (BILL_INVOICE.arch_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getArchFlagSortDirection () {
    return this.ArchFlagSortAscending;
  }
  /** Set the field level filters for field: ArchFlag (BILL_INVOICE.arch_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setArchFlagFilter (BooleanFilter[] value) throws ServiceException {
    this.ArchFlag = value;
  }
  /** Retrieve filter for field: ArchFlag (BILL_INVOICE.arch_flag)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getArchFlagFilter () {
    return this.ArchFlag;
  }

  /**
   * Retrieves the ArchFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ArchFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ArchFlagFilter field
   */
  public String[] getArchFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getArchFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getArchFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getArchFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ArchFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getArchFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ArchFlagFilter filter value from a formatted string
   *
   * @param _value the ArchFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ArchFlagFilter filter field
   */
  public void setArchFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setArchFlagFilterFromFormattedString");
    try {
      this.setArchFlagFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ArchFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setArchFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setArchFlagFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: InterimBillFlag (BILL_INVOICE.interim_bill_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setInterimBillFlagFetch (boolean fetch) {
    this.InterimBillFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: InterimBillFlag (BILL_INVOICE.interim_bill_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getInterimBillFlagFetch () {
    return this.InterimBillFlagFetch;
  }
  /** Set the SortOrder for field: InterimBillFlag (BILL_INVOICE.interim_bill_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInterimBillFlagSortOrder (Integer value) {
    this.InterimBillFlagSort = value;
  }
  /** Retrieve SortOrder for field: InterimBillFlag (BILL_INVOICE.interim_bill_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInterimBillFlagSortOrder () {
    return this.InterimBillFlagSort;
  }
  /** Set the sort direction for field: InterimBillFlag (BILL_INVOICE.interim_bill_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInterimBillFlagSortDirection (boolean ascending) {
    this.InterimBillFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InterimBillFlag (BILL_INVOICE.interim_bill_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInterimBillFlagSortDirection () {
    return this.InterimBillFlagSortAscending;
  }
  /** Set the field level filters for field: InterimBillFlag (BILL_INVOICE.interim_bill_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInterimBillFlagFilter (BooleanFilter[] value) throws ServiceException {
    this.InterimBillFlag = value;
  }
  /** Retrieve filter for field: InterimBillFlag (BILL_INVOICE.interim_bill_flag)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getInterimBillFlagFilter () {
    return this.InterimBillFlag;
  }

  /**
   * Retrieves the InterimBillFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InterimBillFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InterimBillFlagFilter field
   */
  public String[] getInterimBillFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInterimBillFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInterimBillFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInterimBillFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InterimBillFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInterimBillFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InterimBillFlagFilter filter value from a formatted string
   *
   * @param _value the InterimBillFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InterimBillFlagFilter filter field
   */
  public void setInterimBillFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInterimBillFlagFilterFromFormattedString");
    try {
      this.setInterimBillFlagFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InterimBillFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInterimBillFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInterimBillFlagFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IncludeNrc (BILL_INVOICE.include_nrc)
   * @param fetch whether to fetch this field or not
   */
  public void setIncludeNrcFetch (boolean fetch) {
    this.IncludeNrcFetch = fetch;
  }
  /** Retrieve Fetch value for field: IncludeNrc (BILL_INVOICE.include_nrc)
   * @return boolean the Fetch value for this field
   */
  public boolean getIncludeNrcFetch () {
    return this.IncludeNrcFetch;
  }
  /** Set the SortOrder for field: IncludeNrc (BILL_INVOICE.include_nrc)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIncludeNrcSortOrder (Integer value) {
    this.IncludeNrcSort = value;
  }
  /** Retrieve SortOrder for field: IncludeNrc (BILL_INVOICE.include_nrc)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIncludeNrcSortOrder () {
    return this.IncludeNrcSort;
  }
  /** Set the sort direction for field: IncludeNrc (BILL_INVOICE.include_nrc)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIncludeNrcSortDirection (boolean ascending) {
    this.IncludeNrcSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IncludeNrc (BILL_INVOICE.include_nrc)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIncludeNrcSortDirection () {
    return this.IncludeNrcSortAscending;
  }
  /** Set the field level filters for field: IncludeNrc (BILL_INVOICE.include_nrc)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIncludeNrcFilter (BooleanFilter[] value) throws ServiceException {
    this.IncludeNrc = value;
  }
  /** Retrieve filter for field: IncludeNrc (BILL_INVOICE.include_nrc)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIncludeNrcFilter () {
    return this.IncludeNrc;
  }

  /**
   * Retrieves the IncludeNrcFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IncludeNrcFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncludeNrcFilter field
   */
  public String[] getIncludeNrcFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeNrcFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIncludeNrcFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncludeNrcFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncludeNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncludeNrcFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IncludeNrcFilter filter value from a formatted string
   *
   * @param _value the IncludeNrcFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IncludeNrcFilter filter field
   */
  public void setIncludeNrcFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIncludeNrcFilterFromFormattedString");
    try {
      this.setIncludeNrcFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncludeNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncludeNrcFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncludeNrcFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IncludeRc (BILL_INVOICE.include_rc)
   * @param fetch whether to fetch this field or not
   */
  public void setIncludeRcFetch (boolean fetch) {
    this.IncludeRcFetch = fetch;
  }
  /** Retrieve Fetch value for field: IncludeRc (BILL_INVOICE.include_rc)
   * @return boolean the Fetch value for this field
   */
  public boolean getIncludeRcFetch () {
    return this.IncludeRcFetch;
  }
  /** Set the SortOrder for field: IncludeRc (BILL_INVOICE.include_rc)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIncludeRcSortOrder (Integer value) {
    this.IncludeRcSort = value;
  }
  /** Retrieve SortOrder for field: IncludeRc (BILL_INVOICE.include_rc)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIncludeRcSortOrder () {
    return this.IncludeRcSort;
  }
  /** Set the sort direction for field: IncludeRc (BILL_INVOICE.include_rc)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIncludeRcSortDirection (boolean ascending) {
    this.IncludeRcSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IncludeRc (BILL_INVOICE.include_rc)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIncludeRcSortDirection () {
    return this.IncludeRcSortAscending;
  }
  /** Set the field level filters for field: IncludeRc (BILL_INVOICE.include_rc)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIncludeRcFilter (BooleanFilter[] value) throws ServiceException {
    this.IncludeRc = value;
  }
  /** Retrieve filter for field: IncludeRc (BILL_INVOICE.include_rc)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIncludeRcFilter () {
    return this.IncludeRc;
  }

  /**
   * Retrieves the IncludeRcFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IncludeRcFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncludeRcFilter field
   */
  public String[] getIncludeRcFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeRcFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIncludeRcFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncludeRcFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncludeRcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncludeRcFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IncludeRcFilter filter value from a formatted string
   *
   * @param _value the IncludeRcFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IncludeRcFilter filter field
   */
  public void setIncludeRcFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIncludeRcFilterFromFormattedString");
    try {
      this.setIncludeRcFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncludeRcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncludeRcFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncludeRcFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IncludeAdj (BILL_INVOICE.include_adj)
   * @param fetch whether to fetch this field or not
   */
  public void setIncludeAdjFetch (boolean fetch) {
    this.IncludeAdjFetch = fetch;
  }
  /** Retrieve Fetch value for field: IncludeAdj (BILL_INVOICE.include_adj)
   * @return boolean the Fetch value for this field
   */
  public boolean getIncludeAdjFetch () {
    return this.IncludeAdjFetch;
  }
  /** Set the SortOrder for field: IncludeAdj (BILL_INVOICE.include_adj)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIncludeAdjSortOrder (Integer value) {
    this.IncludeAdjSort = value;
  }
  /** Retrieve SortOrder for field: IncludeAdj (BILL_INVOICE.include_adj)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIncludeAdjSortOrder () {
    return this.IncludeAdjSort;
  }
  /** Set the sort direction for field: IncludeAdj (BILL_INVOICE.include_adj)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIncludeAdjSortDirection (boolean ascending) {
    this.IncludeAdjSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IncludeAdj (BILL_INVOICE.include_adj)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIncludeAdjSortDirection () {
    return this.IncludeAdjSortAscending;
  }
  /** Set the field level filters for field: IncludeAdj (BILL_INVOICE.include_adj)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIncludeAdjFilter (BooleanFilter[] value) throws ServiceException {
    this.IncludeAdj = value;
  }
  /** Retrieve filter for field: IncludeAdj (BILL_INVOICE.include_adj)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIncludeAdjFilter () {
    return this.IncludeAdj;
  }

  /**
   * Retrieves the IncludeAdjFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IncludeAdjFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncludeAdjFilter field
   */
  public String[] getIncludeAdjFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeAdjFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIncludeAdjFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncludeAdjFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncludeAdjFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncludeAdjFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IncludeAdjFilter filter value from a formatted string
   *
   * @param _value the IncludeAdjFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IncludeAdjFilter filter field
   */
  public void setIncludeAdjFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIncludeAdjFilterFromFormattedString");
    try {
      this.setIncludeAdjFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncludeAdjFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncludeAdjFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncludeAdjFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IncludeUsage (BILL_INVOICE.include_usage)
   * @param fetch whether to fetch this field or not
   */
  public void setIncludeUsageFetch (boolean fetch) {
    this.IncludeUsageFetch = fetch;
  }
  /** Retrieve Fetch value for field: IncludeUsage (BILL_INVOICE.include_usage)
   * @return boolean the Fetch value for this field
   */
  public boolean getIncludeUsageFetch () {
    return this.IncludeUsageFetch;
  }
  /** Set the SortOrder for field: IncludeUsage (BILL_INVOICE.include_usage)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIncludeUsageSortOrder (Integer value) {
    this.IncludeUsageSort = value;
  }
  /** Retrieve SortOrder for field: IncludeUsage (BILL_INVOICE.include_usage)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIncludeUsageSortOrder () {
    return this.IncludeUsageSort;
  }
  /** Set the sort direction for field: IncludeUsage (BILL_INVOICE.include_usage)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIncludeUsageSortDirection (boolean ascending) {
    this.IncludeUsageSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IncludeUsage (BILL_INVOICE.include_usage)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIncludeUsageSortDirection () {
    return this.IncludeUsageSortAscending;
  }
  /** Set the field level filters for field: IncludeUsage (BILL_INVOICE.include_usage)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIncludeUsageFilter (BooleanFilter[] value) throws ServiceException {
    this.IncludeUsage = value;
  }
  /** Retrieve filter for field: IncludeUsage (BILL_INVOICE.include_usage)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIncludeUsageFilter () {
    return this.IncludeUsage;
  }

  /**
   * Retrieves the IncludeUsageFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IncludeUsageFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncludeUsageFilter field
   */
  public String[] getIncludeUsageFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeUsageFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIncludeUsageFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncludeUsageFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncludeUsageFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncludeUsageFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IncludeUsageFilter filter value from a formatted string
   *
   * @param _value the IncludeUsageFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IncludeUsageFilter filter field
   */
  public void setIncludeUsageFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIncludeUsageFilterFromFormattedString");
    try {
      this.setIncludeUsageFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncludeUsageFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncludeUsageFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncludeUsageFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IncludePayment (BILL_INVOICE.include_bmf)
   * @param fetch whether to fetch this field or not
   */
  public void setIncludePaymentFetch (boolean fetch) {
    this.IncludePaymentFetch = fetch;
  }
  /** Retrieve Fetch value for field: IncludePayment (BILL_INVOICE.include_bmf)
   * @return boolean the Fetch value for this field
   */
  public boolean getIncludePaymentFetch () {
    return this.IncludePaymentFetch;
  }
  /** Set the SortOrder for field: IncludePayment (BILL_INVOICE.include_bmf)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIncludePaymentSortOrder (Integer value) {
    this.IncludePaymentSort = value;
  }
  /** Retrieve SortOrder for field: IncludePayment (BILL_INVOICE.include_bmf)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIncludePaymentSortOrder () {
    return this.IncludePaymentSort;
  }
  /** Set the sort direction for field: IncludePayment (BILL_INVOICE.include_bmf)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIncludePaymentSortDirection (boolean ascending) {
    this.IncludePaymentSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IncludePayment (BILL_INVOICE.include_bmf)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIncludePaymentSortDirection () {
    return this.IncludePaymentSortAscending;
  }
  /** Set the field level filters for field: IncludePayment (BILL_INVOICE.include_bmf)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIncludePaymentFilter (BooleanFilter[] value) throws ServiceException {
    this.IncludePayment = value;
  }
  /** Retrieve filter for field: IncludePayment (BILL_INVOICE.include_bmf)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIncludePaymentFilter () {
    return this.IncludePayment;
  }

  /**
   * Retrieves the IncludePaymentFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IncludePaymentFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncludePaymentFilter field
   */
  public String[] getIncludePaymentFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludePaymentFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIncludePaymentFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncludePaymentFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncludePaymentFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncludePaymentFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IncludePaymentFilter filter value from a formatted string
   *
   * @param _value the IncludePaymentFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IncludePaymentFilter filter field
   */
  public void setIncludePaymentFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIncludePaymentFilterFromFormattedString");
    try {
      this.setIncludePaymentFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IncludePaymentFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncludePaymentFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncludePaymentFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LanguageCode (BILL_INVOICE.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch) {
    this.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (BILL_INVOICE.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch () {
    return this.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (BILL_INVOICE.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value) {
    this.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (BILL_INVOICE.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder () {
    return this.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (BILL_INVOICE.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending) {
    this.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (BILL_INVOICE.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection () {
    return this.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (BILL_INVOICE.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (BILL_INVOICE.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter () {
    return this.LanguageCode;
  }

  /**
   * Retrieves the LanguageCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LanguageCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LanguageCodeFilter field
   */
  public String[] getLanguageCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLanguageCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LanguageCodeFilter filter value from a formatted string
   *
   * @param _value the LanguageCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LanguageCodeFilter filter field
   */
  public void setLanguageCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFilterFromFormattedString");
    try {
      this.setLanguageCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated LanguageCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the LanguageCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the LanguageCodeFilter filter field
   */
  public String[] getLanguageCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getLanguageCodeFilter(), "LanguageCode", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated LanguageCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the LanguageCodeFilter filter field
   */
  public void setLanguageCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setLanguageCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "LanguageCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: BillConverted (BILL_INVOICE.converted)
   * @param fetch whether to fetch this field or not
   */
  public void setBillConvertedFetch (boolean fetch) {
    this.BillConvertedFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillConverted (BILL_INVOICE.converted)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillConvertedFetch () {
    return this.BillConvertedFetch;
  }
  /** Set the SortOrder for field: BillConverted (BILL_INVOICE.converted)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillConvertedSortOrder (Integer value) {
    this.BillConvertedSort = value;
  }
  /** Retrieve SortOrder for field: BillConverted (BILL_INVOICE.converted)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillConvertedSortOrder () {
    return this.BillConvertedSort;
  }
  /** Set the sort direction for field: BillConverted (BILL_INVOICE.converted)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillConvertedSortDirection (boolean ascending) {
    this.BillConvertedSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillConverted (BILL_INVOICE.converted)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillConvertedSortDirection () {
    return this.BillConvertedSortAscending;
  }
  /** Set the field level filters for field: BillConverted (BILL_INVOICE.converted)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillConvertedFilter (IntegerFilter[] value) throws ServiceException {
    this.BillConverted = value;
  }
  /** Retrieve filter for field: BillConverted (BILL_INVOICE.converted)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillConvertedFilter () {
    return this.BillConverted;
  }

  /**
   * Retrieves the BillConvertedFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillConvertedFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillConvertedFilter field
   */
  public String[] getBillConvertedFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillConvertedFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillConvertedFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillConvertedFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillConvertedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillConvertedFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillConvertedFilter filter value from a formatted string
   *
   * @param _value the BillConvertedFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillConvertedFilter filter field
   */
  public void setBillConvertedFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillConvertedFilterFromFormattedString");
    try {
      this.setBillConvertedFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillConvertedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillConvertedFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillConvertedFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: WarmBillFlag (BILL_INVOICE.warm_bill_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setWarmBillFlagFetch (boolean fetch) {
    this.WarmBillFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: WarmBillFlag (BILL_INVOICE.warm_bill_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getWarmBillFlagFetch () {
    return this.WarmBillFlagFetch;
  }
  /** Set the SortOrder for field: WarmBillFlag (BILL_INVOICE.warm_bill_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setWarmBillFlagSortOrder (Integer value) {
    this.WarmBillFlagSort = value;
  }
  /** Retrieve SortOrder for field: WarmBillFlag (BILL_INVOICE.warm_bill_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getWarmBillFlagSortOrder () {
    return this.WarmBillFlagSort;
  }
  /** Set the sort direction for field: WarmBillFlag (BILL_INVOICE.warm_bill_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setWarmBillFlagSortDirection (boolean ascending) {
    this.WarmBillFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: WarmBillFlag (BILL_INVOICE.warm_bill_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getWarmBillFlagSortDirection () {
    return this.WarmBillFlagSortAscending;
  }
  /** Set the field level filters for field: WarmBillFlag (BILL_INVOICE.warm_bill_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setWarmBillFlagFilter (BooleanFilter[] value) throws ServiceException {
    this.WarmBillFlag = value;
  }
  /** Retrieve filter for field: WarmBillFlag (BILL_INVOICE.warm_bill_flag)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getWarmBillFlagFilter () {
    return this.WarmBillFlag;
  }

  /**
   * Retrieves the WarmBillFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The WarmBillFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the WarmBillFlagFilter field
   */
  public String[] getWarmBillFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getWarmBillFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getWarmBillFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getWarmBillFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("WarmBillFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getWarmBillFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the WarmBillFlagFilter filter value from a formatted string
   *
   * @param _value the WarmBillFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the WarmBillFlagFilter filter field
   */
  public void setWarmBillFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setWarmBillFlagFilterFromFormattedString");
    try {
      this.setWarmBillFlagFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("WarmBillFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setWarmBillFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setWarmBillFlagFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillOrderNumber (BILL_INVOICE.bill_order_number)
   * @param fetch whether to fetch this field or not
   */
  public void setBillOrderNumberFetch (boolean fetch) {
    this.BillOrderNumberFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillOrderNumber (BILL_INVOICE.bill_order_number)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillOrderNumberFetch () {
    return this.BillOrderNumberFetch;
  }
  /** Set the SortOrder for field: BillOrderNumber (BILL_INVOICE.bill_order_number)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillOrderNumberSortOrder (Integer value) {
    this.BillOrderNumberSort = value;
  }
  /** Retrieve SortOrder for field: BillOrderNumber (BILL_INVOICE.bill_order_number)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillOrderNumberSortOrder () {
    return this.BillOrderNumberSort;
  }
  /** Set the sort direction for field: BillOrderNumber (BILL_INVOICE.bill_order_number)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillOrderNumberSortDirection (boolean ascending) {
    this.BillOrderNumberSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillOrderNumber (BILL_INVOICE.bill_order_number)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillOrderNumberSortDirection () {
    return this.BillOrderNumberSortAscending;
  }
  /** Set the case insensitive for field: BillOrderNumber (BILL_INVOICE.bill_order_number)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillOrderNumberCaseInsensitive (boolean ascending) {
    this.BillOrderNumberCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillOrderNumber (BILL_INVOICE.bill_order_number)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillOrderNumberCaseInsensitive () {
    return this.BillOrderNumberCaseInsensitive;
  }
  /** Set the field level filters for field: BillOrderNumber (BILL_INVOICE.bill_order_number)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillOrderNumberFilter (StringFilter[] value) throws ServiceException {
    this.BillOrderNumber = value;
  }
  /** Retrieve filter for field: BillOrderNumber (BILL_INVOICE.bill_order_number)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillOrderNumberFilter () {
    return this.BillOrderNumber;
  }

  /**
   * Retrieves the BillOrderNumberFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillOrderNumberFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillOrderNumberFilter field
   */
  public String[] getBillOrderNumberFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillOrderNumberFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillOrderNumberFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillOrderNumberFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillOrderNumberFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillOrderNumberFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillOrderNumberFilter filter value from a formatted string
   *
   * @param _value the BillOrderNumberFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillOrderNumberFilter filter field
   */
  public void setBillOrderNumberFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillOrderNumberFilterFromFormattedString");
    try {
      this.setBillOrderNumberFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillOrderNumberFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillOrderNumberFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillOrderNumberFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillFmtOpt (BILL_INVOICE.bill_fmt_opt)
   * @param fetch whether to fetch this field or not
   */
  public void setBillFmtOptFetch (boolean fetch) {
    this.BillFmtOptFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillFmtOpt (BILL_INVOICE.bill_fmt_opt)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillFmtOptFetch () {
    return this.BillFmtOptFetch;
  }
  /** Set the SortOrder for field: BillFmtOpt (BILL_INVOICE.bill_fmt_opt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillFmtOptSortOrder (Integer value) {
    this.BillFmtOptSort = value;
  }
  /** Retrieve SortOrder for field: BillFmtOpt (BILL_INVOICE.bill_fmt_opt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillFmtOptSortOrder () {
    return this.BillFmtOptSort;
  }
  /** Set the sort direction for field: BillFmtOpt (BILL_INVOICE.bill_fmt_opt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillFmtOptSortDirection (boolean ascending) {
    this.BillFmtOptSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillFmtOpt (BILL_INVOICE.bill_fmt_opt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillFmtOptSortDirection () {
    return this.BillFmtOptSortAscending;
  }
  /** Set the field level filters for field: BillFmtOpt (BILL_INVOICE.bill_fmt_opt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillFmtOptFilter (IntegerFilter[] value) throws ServiceException {
    this.BillFmtOpt = value;
  }
  /** Retrieve filter for field: BillFmtOpt (BILL_INVOICE.bill_fmt_opt)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillFmtOptFilter () {
    return this.BillFmtOpt;
  }

  /**
   * Retrieves the BillFmtOptFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillFmtOptFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillFmtOptFilter field
   */
  public String[] getBillFmtOptFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFmtOptFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillFmtOptFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFmtOptFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFmtOptFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFmtOptFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillFmtOptFilter filter value from a formatted string
   *
   * @param _value the BillFmtOptFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillFmtOptFilter filter field
   */
  public void setBillFmtOptFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillFmtOptFilterFromFormattedString");
    try {
      this.setBillFmtOptFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFmtOptFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillFmtOptFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillFmtOptFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DocumentServerId (BILL_INVOICE.document_server_id)
   * @param fetch whether to fetch this field or not
   */
  public void setDocumentServerIdFetch (boolean fetch) {
    this.DocumentServerIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DocumentServerId (BILL_INVOICE.document_server_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getDocumentServerIdFetch () {
    return this.DocumentServerIdFetch;
  }
  /** Set the SortOrder for field: DocumentServerId (BILL_INVOICE.document_server_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDocumentServerIdSortOrder (Integer value) {
    this.DocumentServerIdSort = value;
  }
  /** Retrieve SortOrder for field: DocumentServerId (BILL_INVOICE.document_server_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDocumentServerIdSortOrder () {
    return this.DocumentServerIdSort;
  }
  /** Set the sort direction for field: DocumentServerId (BILL_INVOICE.document_server_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDocumentServerIdSortDirection (boolean ascending) {
    this.DocumentServerIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DocumentServerId (BILL_INVOICE.document_server_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDocumentServerIdSortDirection () {
    return this.DocumentServerIdSortAscending;
  }
  /** Set the field level filters for field: DocumentServerId (BILL_INVOICE.document_server_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDocumentServerIdFilter (IntegerFilter[] value) throws ServiceException {
    this.DocumentServerId = value;
  }
  /** Retrieve filter for field: DocumentServerId (BILL_INVOICE.document_server_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDocumentServerIdFilter () {
    return this.DocumentServerId;
  }

  /**
   * Retrieves the DocumentServerIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DocumentServerIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DocumentServerIdFilter field
   */
  public String[] getDocumentServerIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentServerIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDocumentServerIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentServerIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DocumentServerIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDocumentServerIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DocumentServerIdFilter filter value from a formatted string
   *
   * @param _value the DocumentServerIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DocumentServerIdFilter filter field
   */
  public void setDocumentServerIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDocumentServerIdFilterFromFormattedString");
    try {
      this.setDocumentServerIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DocumentServerIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDocumentServerIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDocumentServerIdFilterFromFormattedString");
  }

  public String toString() {
    return InvoiceObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return InvoiceObjectHelper.toMap(this, null);
  }
}
