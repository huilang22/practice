/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AxrtPaymentObjectFilter.java
 * Definition File: Customer/AxrtPayment.xml
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
public class AxrtPaymentObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public AxrtPaymentObjectKeyFilter Key = null;
  /** raw field for: BMF.trans_submitter) */
  public    StringFilter[] TransSubmitter  = null;
  protected boolean TransSubmitterFetch = false;
  protected boolean TransSubmitterSortAscending = true;
  protected boolean TransSubmitterCaseInsensitive = false;
  protected Integer TransSubmitterSort = null;
  /** raw field for: BMF.action_code) */
  public    StringFilter[] ActionCode  = null;
  protected boolean ActionCodeFetch = false;
  protected boolean ActionCodeSortAscending = true;
  protected boolean ActionCodeCaseInsensitive = false;
  protected Integer ActionCodeSort = null;
  /** raw field for: PAYMENT_TRANS.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: PAYMENT_TRANS.bill_ref_no) */
  public    IntegerFilter[] BillRefNo  = null;
  protected boolean BillRefNoFetch = false;
  protected boolean BillRefNoSortAscending = true;
  protected Integer BillRefNoSort = null;
  /** raw field for: PAYMENT_TRANS.bill_ref_resets) */
  public    IntegerFilter[] BillRefResets  = null;
  protected boolean BillRefResetsFetch = false;
  protected boolean BillRefResetsSortAscending = true;
  protected Integer BillRefResetsSort = null;
  /** raw field for: PAYMENT_TRANS.payment_due_date) */
  public    DateFilter[] PaymentDueDate  = null;
  protected boolean PaymentDueDateFetch = false;
  protected boolean PaymentDueDateSortAscending = true;
  protected Integer PaymentDueDateSort = null;
  /** raw field for: PAYMENT_TRANS.statement_date) */
  public    DateFilter[] StatementDate  = null;
  protected boolean StatementDateFetch = false;
  protected boolean StatementDateSortAscending = true;
  protected Integer StatementDateSort = null;
  /** raw field for: PAYMENT_TRANS.amount) */
  public    BigIntegerFilter[] Amount  = null;
  protected boolean AmountFetch = false;
  protected boolean AmountSortAscending = true;
  protected Integer AmountSort = null;
  /** raw field for: PAYMENT_TRANS.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: PAYMENT_TRANS.trans_type) */
  public    IntegerFilter[] TransType  = null;
  protected boolean TransTypeFetch = false;
  protected boolean TransTypeSortAscending = true;
  protected Integer TransTypeSort = null;
  /** raw field for: PAYMENT_TRANS.bmf_trans_type) */
  public    IntegerFilter[] BmfTransType  = null;
  protected boolean BmfTransTypeFetch = false;
  protected boolean BmfTransTypeSortAscending = true;
  protected Integer BmfTransTypeSort = null;
  /** raw field for: PAYMENT_TRANS.trans_status) */
  public    IntegerFilter[] TransStatus  = null;
  protected boolean TransStatusFetch = false;
  protected boolean TransStatusSortAscending = true;
  protected Integer TransStatusSort = null;
  /** raw field for: PAYMENT_TRANS.counter) */
  public    IntegerFilter[] Counter  = null;
  protected boolean CounterFetch = false;
  protected boolean CounterSortAscending = true;
  protected Integer CounterSort = null;
  /** raw field for: PAYMENT_TRANS.file_id) */
  public    IntegerFilter[] FileId  = null;
  protected boolean FileIdFetch = false;
  protected boolean FileIdSortAscending = true;
  protected Integer FileIdSort = null;
  /** raw field for: PAYMENT_TRANS.clearing_house_id) */
  public    StringFilter[] ClearingHouseId  = null;
  protected boolean ClearingHouseIdFetch = false;
  protected boolean ClearingHouseIdSortAscending = true;
  protected boolean ClearingHouseIdCaseInsensitive = false;
  protected Integer ClearingHouseIdSort = null;
  /** raw field for: PAYMENT_TRANS.response_code) */
  public    StringFilter[] ResponseCode  = null;
  protected boolean ResponseCodeFetch = false;
  protected boolean ResponseCodeSortAscending = true;
  protected boolean ResponseCodeCaseInsensitive = false;
  protected Integer ResponseCodeSort = null;
  /** raw field for: PAYMENT_TRANS.chg_date) */
  public    DateFilter[] ChgDate  = null;
  protected boolean ChgDateFetch = false;
  protected boolean ChgDateSortAscending = true;
  protected Integer ChgDateSort = null;
  /** raw field for: PAYMENT_TRANS.pmt_tracking_id) */
  public    IntegerFilter[] PmtTrackingId  = null;
  protected boolean PmtTrackingIdFetch = false;
  protected boolean PmtTrackingIdSortAscending = true;
  protected Integer PmtTrackingIdSort = null;
  /** raw field for: PAYMENT_TRANS.pmt_tracking_id_serv) */
  public    IntegerFilter[] PmtTrackingIdServ  = null;
  protected boolean PmtTrackingIdServFetch = false;
  protected boolean PmtTrackingIdServSortAscending = true;
  protected Integer PmtTrackingIdServSort = null;
  /** raw field for: PAYMENT_TRANS.provider_id) */
  public    IntegerFilter[] ProviderId  = null;
  protected boolean ProviderIdFetch = false;
  protected boolean ProviderIdSortAscending = true;
  protected Integer ProviderIdSort = null;
  /** raw field for: PAYMENT_TRANS.profile_id) */
  public    BigIntegerFilter[] ProfileId  = null;
  protected boolean ProfileIdFetch = false;
  protected boolean ProfileIdSortAscending = true;
  protected Integer ProfileIdSort = null;
  /** raw field for: PAYMENT_TRANS.ccauth_code) */
  public    StringFilter[] CcauthCode  = null;
  protected boolean CcauthCodeFetch = false;
  protected boolean CcauthCodeSortAscending = true;
  protected boolean CcauthCodeCaseInsensitive = false;
  protected Integer CcauthCodeSort = null;
  /** raw field for: PAYMENT_TRANS.ccauth_date) */
  public    StringFilter[] CcauthDate  = null;
  protected boolean CcauthDateFetch = false;
  protected boolean CcauthDateSortAscending = true;
  protected boolean CcauthDateCaseInsensitive = false;
  protected Integer CcauthDateSort = null;
  /** raw field for: PAYMENT_TRANS.pmt_req_sent_counter) */
  public    IntegerFilter[] PmtReqSentCounter  = null;
  protected boolean PmtReqSentCounterFetch = false;
  protected boolean PmtReqSentCounterSortAscending = true;
  protected Integer PmtReqSentCounterSort = null;
  /** raw field for: PAYMENT_TRANS.open_item_id) */
  public    IntegerFilter[] OpenItemId  = null;
  protected boolean OpenItemIdFetch = false;
  protected boolean OpenItemIdSortAscending = true;
  protected Integer OpenItemIdSort = null;
  /** raw field for: PAYMENT_TRANS.orig_tracking_id) */
  public    IntegerFilter[] OrigTrackingId  = null;
  protected boolean OrigTrackingIdFetch = false;
  protected boolean OrigTrackingIdSortAscending = true;
  protected Integer OrigTrackingIdSort = null;
  /** raw field for: PAYMENT_TRANS.orig_tracking_id_serv) */
  public    IntegerFilter[] OrigTrackingIdServ  = null;
  protected boolean OrigTrackingIdServFetch = false;
  protected boolean OrigTrackingIdServSortAscending = true;
  protected Integer OrigTrackingIdServSort = null;
  /** raw field for: PAYMENT_TRANS.no_bill) */
  public    BooleanFilter[] NoBill  = null;
  protected boolean NoBillFetch = false;
  protected boolean NoBillSortAscending = true;
  protected Integer NoBillSort = null;
  /** raw field for: PAYMENT_TRANS.request_type) */
  public    IntegerFilter[] RequestType  = null;
  protected boolean RequestTypeFetch = false;
  protected boolean RequestTypeSortAscending = true;
  protected Integer RequestTypeSort = null;
  /** raw field for: PAYMENT_TRANS.requested_service) */
  public    StringFilter[] RequestedService  = null;
  protected boolean RequestedServiceFetch = false;
  protected boolean RequestedServiceSortAscending = true;
  protected boolean RequestedServiceCaseInsensitive = false;
  protected Integer RequestedServiceSort = null;
  /** raw field for: PAYMENT_TRANS.request_id) */
  public    StringFilter[] RequestId  = null;
  protected boolean RequestIdFetch = false;
  protected boolean RequestIdSortAscending = true;
  protected boolean RequestIdCaseInsensitive = false;
  protected Integer RequestIdSort = null;
  /** raw field for: PAYMENT_TRANS.epg_transaction_id) */
  public    StringFilter[] EpgTransactionId  = null;
  protected boolean EpgTransactionIdFetch = false;
  protected boolean EpgTransactionIdSortAscending = true;
  protected boolean EpgTransactionIdCaseInsensitive = false;
  protected Integer EpgTransactionIdSort = null;
  /** raw field for: PAYMENT_TRANS.epg_flag) */
  public    StringFilter[] EpgFlag  = null;
  protected boolean EpgFlagFetch = false;
  protected boolean EpgFlagSortAscending = true;
  protected boolean EpgFlagCaseInsensitive = false;
  protected Integer EpgFlagSort = null;
  /** raw field for: PAYMENT_TRANS.epg_message) */
  public    StringFilter[] EpgMessage  = null;
  protected boolean EpgMessageFetch = false;
  protected boolean EpgMessageSortAscending = true;
  protected boolean EpgMessageCaseInsensitive = false;
  protected Integer EpgMessageSort = null;
  /** raw field for: PAYMENT_TRANS.eft_debit_proc_trans_id) */
  public    StringFilter[] EftDebitProcTransId  = null;
  protected boolean EftDebitProcTransIdFetch = false;
  protected boolean EftDebitProcTransIdSortAscending = true;
  protected boolean EftDebitProcTransIdCaseInsensitive = false;
  protected Integer EftDebitProcTransIdSort = null;
  /** raw field for: PAYMENT_TRANS.pay_method) */
  public    IntegerFilter[] PayMethod  = null;
  protected boolean PayMethodFetch = false;
  protected boolean PayMethodSortAscending = true;
  protected Integer PayMethodSort = null;
  /** raw field for: PAYMENT_TRANS.is_realtime) */
  public    BooleanFilter[] IsRealtime  = null;
  protected boolean IsRealtimeFetch = false;
  protected boolean IsRealtimeSortAscending = true;
  protected Integer IsRealtimeSort = null;
  /** raw field for: PAYMENT_TRANS.trans_date) */
  public    DateFilter[] TransDate  = null;
  protected boolean TransDateFetch = false;
  protected boolean TransDateSortAscending = true;
  protected Integer TransDateSort = null;
  /** raw field for: PAYMENT_TRANS.annotation) */
  public    StringFilter[] Annotation  = null;
  protected boolean AnnotationFetch = false;
  protected boolean AnnotationSortAscending = true;
  protected boolean AnnotationCaseInsensitive = false;
  protected Integer AnnotationSort = null;
  /** raw field for: PAYMENT_TRANS.designated_tax_amount) */
  public    BigIntegerFilter[] DesignatedTaxAmount  = null;
  protected boolean DesignatedTaxAmountFetch = false;
  protected boolean DesignatedTaxAmountSortAscending = true;
  protected Integer DesignatedTaxAmountSort = null;
  /** raw field for: PAYMENT_TRANS.tax_point) */
  public    DateFilter[] TaxPoint  = null;
  protected boolean TaxPointFetch = false;
  protected boolean TaxPointSortAscending = true;
  protected Integer TaxPointSort = null;
  /** raw field for: PAYMENT_TRANS.tax_rate) */
  public    IntegerFilter[] TaxRate  = null;
  protected boolean TaxRateFetch = false;
  protected boolean TaxRateSortAscending = true;
  protected Integer TaxRateSort = null;
  /** raw field for: PAYMENT_TRANS.implied_decimal) */
  public    IntegerFilter[] ImpliedDecimal  = null;
  protected boolean ImpliedDecimalFetch = false;
  protected boolean ImpliedDecimalSortAscending = true;
  protected Integer ImpliedDecimalSort = null;
  /** raw field for: PAYMENT_TRANS.tax_pkg_inst_id) */
  public    IntegerFilter[] TaxPkgInstId  = null;
  protected boolean TaxPkgInstIdFetch = false;
  protected boolean TaxPkgInstIdSortAscending = true;
  protected Integer TaxPkgInstIdSort = null;
  /** raw field for: PAYMENT_TRANS.tax_type_code) */
  public    IntegerFilter[] TaxTypeCode  = null;
  protected boolean TaxTypeCodeFetch = false;
  protected boolean TaxTypeCodeSortAscending = true;
  protected Integer TaxTypeCodeSort = null;
  /** raw field for: PAYMENT_TRANS.oneoff_cardnum) */
  public    StringFilter[] OneoffCardnum  = null;
  protected boolean OneoffCardnumFetch = false;
  protected boolean OneoffCardnumSortAscending = true;
  protected boolean OneoffCardnumCaseInsensitive = false;
  protected Integer OneoffCardnumSort = null;
  /** raw field for: PAYMENT_TRANS.dcard_val_status) */
  public    IntegerFilter[] DcardValStatus  = null;
  protected boolean DcardValStatusFetch = false;
  protected boolean DcardValStatusSortAscending = true;
  protected Integer DcardValStatusSort = null;
  /** raw field for: PAYMENT_TRANS.payment_merchant_id) */
  public    IntegerFilter[] PaymentMerchantId  = null;
  protected boolean PaymentMerchantIdFetch = false;
  protected boolean PaymentMerchantIdSortAscending = true;
  protected Integer PaymentMerchantIdSort = null;
  /** raw field for: PAYMENT_TRANS.transaction_uuid) */
  public    StringFilter[] TransactionUuid  = null;
  protected boolean TransactionUuidFetch = false;
  protected boolean TransactionUuidSortAscending = true;
  protected boolean TransactionUuidCaseInsensitive = false;
  protected Integer TransactionUuidSort = null;
  private String _objName = "AxrtPaymentObjectFilter";
  /** default constructor */
  public AxrtPaymentObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public AxrtPaymentObjectFilter (AxrtPaymentObjectFilter other)
  {
    if (other == null) return;
    this.Key = new AxrtPaymentObjectKeyFilter (other.Key);
    this.TransSubmitter = other.TransSubmitter;
    this.TransSubmitterFetch = other.TransSubmitterFetch;
    this.TransSubmitterSort = other.TransSubmitterSort;
    this.TransSubmitterCaseInsensitive = other.TransSubmitterCaseInsensitive;
    this.TransSubmitterSortAscending = other.TransSubmitterSortAscending;
    this.ActionCode = other.ActionCode;
    this.ActionCodeFetch = other.ActionCodeFetch;
    this.ActionCodeSort = other.ActionCodeSort;
    this.ActionCodeCaseInsensitive = other.ActionCodeCaseInsensitive;
    this.ActionCodeSortAscending = other.ActionCodeSortAscending;
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.BillRefNo = other.BillRefNo;
    this.BillRefNoFetch = other.BillRefNoFetch;
    this.BillRefNoSort = other.BillRefNoSort;
    this.BillRefNoSortAscending = other.BillRefNoSortAscending;
    this.BillRefResets = other.BillRefResets;
    this.BillRefResetsFetch = other.BillRefResetsFetch;
    this.BillRefResetsSort = other.BillRefResetsSort;
    this.BillRefResetsSortAscending = other.BillRefResetsSortAscending;
    this.PaymentDueDate = other.PaymentDueDate;
    this.PaymentDueDateFetch = other.PaymentDueDateFetch;
    this.PaymentDueDateSort = other.PaymentDueDateSort;
    this.PaymentDueDateSortAscending = other.PaymentDueDateSortAscending;
    this.StatementDate = other.StatementDate;
    this.StatementDateFetch = other.StatementDateFetch;
    this.StatementDateSort = other.StatementDateSort;
    this.StatementDateSortAscending = other.StatementDateSortAscending;
    this.Amount = other.Amount;
    this.AmountFetch = other.AmountFetch;
    this.AmountSort = other.AmountSort;
    this.AmountSortAscending = other.AmountSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.TransType = other.TransType;
    this.TransTypeFetch = other.TransTypeFetch;
    this.TransTypeSort = other.TransTypeSort;
    this.TransTypeSortAscending = other.TransTypeSortAscending;
    this.BmfTransType = other.BmfTransType;
    this.BmfTransTypeFetch = other.BmfTransTypeFetch;
    this.BmfTransTypeSort = other.BmfTransTypeSort;
    this.BmfTransTypeSortAscending = other.BmfTransTypeSortAscending;
    this.TransStatus = other.TransStatus;
    this.TransStatusFetch = other.TransStatusFetch;
    this.TransStatusSort = other.TransStatusSort;
    this.TransStatusSortAscending = other.TransStatusSortAscending;
    this.Counter = other.Counter;
    this.CounterFetch = other.CounterFetch;
    this.CounterSort = other.CounterSort;
    this.CounterSortAscending = other.CounterSortAscending;
    this.FileId = other.FileId;
    this.FileIdFetch = other.FileIdFetch;
    this.FileIdSort = other.FileIdSort;
    this.FileIdSortAscending = other.FileIdSortAscending;
    this.ClearingHouseId = other.ClearingHouseId;
    this.ClearingHouseIdFetch = other.ClearingHouseIdFetch;
    this.ClearingHouseIdSort = other.ClearingHouseIdSort;
    this.ClearingHouseIdCaseInsensitive = other.ClearingHouseIdCaseInsensitive;
    this.ClearingHouseIdSortAscending = other.ClearingHouseIdSortAscending;
    this.ResponseCode = other.ResponseCode;
    this.ResponseCodeFetch = other.ResponseCodeFetch;
    this.ResponseCodeSort = other.ResponseCodeSort;
    this.ResponseCodeCaseInsensitive = other.ResponseCodeCaseInsensitive;
    this.ResponseCodeSortAscending = other.ResponseCodeSortAscending;
    this.ChgDate = other.ChgDate;
    this.ChgDateFetch = other.ChgDateFetch;
    this.ChgDateSort = other.ChgDateSort;
    this.ChgDateSortAscending = other.ChgDateSortAscending;
    this.PmtTrackingId = other.PmtTrackingId;
    this.PmtTrackingIdFetch = other.PmtTrackingIdFetch;
    this.PmtTrackingIdSort = other.PmtTrackingIdSort;
    this.PmtTrackingIdSortAscending = other.PmtTrackingIdSortAscending;
    this.PmtTrackingIdServ = other.PmtTrackingIdServ;
    this.PmtTrackingIdServFetch = other.PmtTrackingIdServFetch;
    this.PmtTrackingIdServSort = other.PmtTrackingIdServSort;
    this.PmtTrackingIdServSortAscending = other.PmtTrackingIdServSortAscending;
    this.ProviderId = other.ProviderId;
    this.ProviderIdFetch = other.ProviderIdFetch;
    this.ProviderIdSort = other.ProviderIdSort;
    this.ProviderIdSortAscending = other.ProviderIdSortAscending;
    this.ProfileId = other.ProfileId;
    this.ProfileIdFetch = other.ProfileIdFetch;
    this.ProfileIdSort = other.ProfileIdSort;
    this.ProfileIdSortAscending = other.ProfileIdSortAscending;
    this.CcauthCode = other.CcauthCode;
    this.CcauthCodeFetch = other.CcauthCodeFetch;
    this.CcauthCodeSort = other.CcauthCodeSort;
    this.CcauthCodeCaseInsensitive = other.CcauthCodeCaseInsensitive;
    this.CcauthCodeSortAscending = other.CcauthCodeSortAscending;
    this.CcauthDate = other.CcauthDate;
    this.CcauthDateFetch = other.CcauthDateFetch;
    this.CcauthDateSort = other.CcauthDateSort;
    this.CcauthDateCaseInsensitive = other.CcauthDateCaseInsensitive;
    this.CcauthDateSortAscending = other.CcauthDateSortAscending;
    this.PmtReqSentCounter = other.PmtReqSentCounter;
    this.PmtReqSentCounterFetch = other.PmtReqSentCounterFetch;
    this.PmtReqSentCounterSort = other.PmtReqSentCounterSort;
    this.PmtReqSentCounterSortAscending = other.PmtReqSentCounterSortAscending;
    this.OpenItemId = other.OpenItemId;
    this.OpenItemIdFetch = other.OpenItemIdFetch;
    this.OpenItemIdSort = other.OpenItemIdSort;
    this.OpenItemIdSortAscending = other.OpenItemIdSortAscending;
    this.OrigTrackingId = other.OrigTrackingId;
    this.OrigTrackingIdFetch = other.OrigTrackingIdFetch;
    this.OrigTrackingIdSort = other.OrigTrackingIdSort;
    this.OrigTrackingIdSortAscending = other.OrigTrackingIdSortAscending;
    this.OrigTrackingIdServ = other.OrigTrackingIdServ;
    this.OrigTrackingIdServFetch = other.OrigTrackingIdServFetch;
    this.OrigTrackingIdServSort = other.OrigTrackingIdServSort;
    this.OrigTrackingIdServSortAscending = other.OrigTrackingIdServSortAscending;
    this.NoBill = other.NoBill;
    this.NoBillFetch = other.NoBillFetch;
    this.NoBillSort = other.NoBillSort;
    this.NoBillSortAscending = other.NoBillSortAscending;
    this.RequestType = other.RequestType;
    this.RequestTypeFetch = other.RequestTypeFetch;
    this.RequestTypeSort = other.RequestTypeSort;
    this.RequestTypeSortAscending = other.RequestTypeSortAscending;
    this.RequestedService = other.RequestedService;
    this.RequestedServiceFetch = other.RequestedServiceFetch;
    this.RequestedServiceSort = other.RequestedServiceSort;
    this.RequestedServiceCaseInsensitive = other.RequestedServiceCaseInsensitive;
    this.RequestedServiceSortAscending = other.RequestedServiceSortAscending;
    this.RequestId = other.RequestId;
    this.RequestIdFetch = other.RequestIdFetch;
    this.RequestIdSort = other.RequestIdSort;
    this.RequestIdCaseInsensitive = other.RequestIdCaseInsensitive;
    this.RequestIdSortAscending = other.RequestIdSortAscending;
    this.EpgTransactionId = other.EpgTransactionId;
    this.EpgTransactionIdFetch = other.EpgTransactionIdFetch;
    this.EpgTransactionIdSort = other.EpgTransactionIdSort;
    this.EpgTransactionIdCaseInsensitive = other.EpgTransactionIdCaseInsensitive;
    this.EpgTransactionIdSortAscending = other.EpgTransactionIdSortAscending;
    this.EpgFlag = other.EpgFlag;
    this.EpgFlagFetch = other.EpgFlagFetch;
    this.EpgFlagSort = other.EpgFlagSort;
    this.EpgFlagCaseInsensitive = other.EpgFlagCaseInsensitive;
    this.EpgFlagSortAscending = other.EpgFlagSortAscending;
    this.EpgMessage = other.EpgMessage;
    this.EpgMessageFetch = other.EpgMessageFetch;
    this.EpgMessageSort = other.EpgMessageSort;
    this.EpgMessageCaseInsensitive = other.EpgMessageCaseInsensitive;
    this.EpgMessageSortAscending = other.EpgMessageSortAscending;
    this.EftDebitProcTransId = other.EftDebitProcTransId;
    this.EftDebitProcTransIdFetch = other.EftDebitProcTransIdFetch;
    this.EftDebitProcTransIdSort = other.EftDebitProcTransIdSort;
    this.EftDebitProcTransIdCaseInsensitive = other.EftDebitProcTransIdCaseInsensitive;
    this.EftDebitProcTransIdSortAscending = other.EftDebitProcTransIdSortAscending;
    this.PayMethod = other.PayMethod;
    this.PayMethodFetch = other.PayMethodFetch;
    this.PayMethodSort = other.PayMethodSort;
    this.PayMethodSortAscending = other.PayMethodSortAscending;
    this.IsRealtime = other.IsRealtime;
    this.IsRealtimeFetch = other.IsRealtimeFetch;
    this.IsRealtimeSort = other.IsRealtimeSort;
    this.IsRealtimeSortAscending = other.IsRealtimeSortAscending;
    this.TransDate = other.TransDate;
    this.TransDateFetch = other.TransDateFetch;
    this.TransDateSort = other.TransDateSort;
    this.TransDateSortAscending = other.TransDateSortAscending;
    this.Annotation = other.Annotation;
    this.AnnotationFetch = other.AnnotationFetch;
    this.AnnotationSort = other.AnnotationSort;
    this.AnnotationCaseInsensitive = other.AnnotationCaseInsensitive;
    this.AnnotationSortAscending = other.AnnotationSortAscending;
    this.DesignatedTaxAmount = other.DesignatedTaxAmount;
    this.DesignatedTaxAmountFetch = other.DesignatedTaxAmountFetch;
    this.DesignatedTaxAmountSort = other.DesignatedTaxAmountSort;
    this.DesignatedTaxAmountSortAscending = other.DesignatedTaxAmountSortAscending;
    this.TaxPoint = other.TaxPoint;
    this.TaxPointFetch = other.TaxPointFetch;
    this.TaxPointSort = other.TaxPointSort;
    this.TaxPointSortAscending = other.TaxPointSortAscending;
    this.TaxRate = other.TaxRate;
    this.TaxRateFetch = other.TaxRateFetch;
    this.TaxRateSort = other.TaxRateSort;
    this.TaxRateSortAscending = other.TaxRateSortAscending;
    this.ImpliedDecimal = other.ImpliedDecimal;
    this.ImpliedDecimalFetch = other.ImpliedDecimalFetch;
    this.ImpliedDecimalSort = other.ImpliedDecimalSort;
    this.ImpliedDecimalSortAscending = other.ImpliedDecimalSortAscending;
    this.TaxPkgInstId = other.TaxPkgInstId;
    this.TaxPkgInstIdFetch = other.TaxPkgInstIdFetch;
    this.TaxPkgInstIdSort = other.TaxPkgInstIdSort;
    this.TaxPkgInstIdSortAscending = other.TaxPkgInstIdSortAscending;
    this.TaxTypeCode = other.TaxTypeCode;
    this.TaxTypeCodeFetch = other.TaxTypeCodeFetch;
    this.TaxTypeCodeSort = other.TaxTypeCodeSort;
    this.TaxTypeCodeSortAscending = other.TaxTypeCodeSortAscending;
    this.OneoffCardnum = other.OneoffCardnum;
    this.OneoffCardnumFetch = other.OneoffCardnumFetch;
    this.OneoffCardnumSort = other.OneoffCardnumSort;
    this.OneoffCardnumCaseInsensitive = other.OneoffCardnumCaseInsensitive;
    this.OneoffCardnumSortAscending = other.OneoffCardnumSortAscending;
    this.DcardValStatus = other.DcardValStatus;
    this.DcardValStatusFetch = other.DcardValStatusFetch;
    this.DcardValStatusSort = other.DcardValStatusSort;
    this.DcardValStatusSortAscending = other.DcardValStatusSortAscending;
    this.PaymentMerchantId = other.PaymentMerchantId;
    this.PaymentMerchantIdFetch = other.PaymentMerchantIdFetch;
    this.PaymentMerchantIdSort = other.PaymentMerchantIdSort;
    this.PaymentMerchantIdSortAscending = other.PaymentMerchantIdSortAscending;
    this.TransactionUuid = other.TransactionUuid;
    this.TransactionUuidFetch = other.TransactionUuidFetch;
    this.TransactionUuidSort = other.TransactionUuidSort;
    this.TransactionUuidCaseInsensitive = other.TransactionUuidCaseInsensitive;
    this.TransactionUuidSortAscending = other.TransactionUuidSortAscending;  }
  /** get the filter for this object's key
   * @return AxrtPaymentObjectKeyFilter
   */
  public AxrtPaymentObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (AxrtPaymentObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TrackingId (PAYMENT_TRANS.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AxrtPaymentObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (PAYMENT_TRANS.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (PAYMENT_TRANS.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AxrtPaymentObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (PAYMENT_TRANS.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (PAYMENT_TRANS.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AxrtPaymentObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (PAYMENT_TRANS.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (PAYMENT_TRANS.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AxrtPaymentObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (PAYMENT_TRANS.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (PAYMENT_TRANS.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AxrtPaymentObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (PAYMENT_TRANS.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (PAYMENT_TRANS.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AxrtPaymentObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (PAYMENT_TRANS.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (PAYMENT_TRANS.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AxrtPaymentObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (PAYMENT_TRANS.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (PAYMENT_TRANS.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AxrtPaymentObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (PAYMENT_TRANS.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: TransSubmitter (BMF.trans_submitter)
   * @param fetch whether to fetch this field or not
   */
  public void setTransSubmitterFetch (boolean fetch) {
    this.TransSubmitterFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransSubmitter (BMF.trans_submitter)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransSubmitterFetch () {
    return this.TransSubmitterFetch;
  }
  /** Set the SortOrder for field: TransSubmitter (BMF.trans_submitter)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransSubmitterSortOrder (Integer value) {
    this.TransSubmitterSort = value;
  }
  /** Retrieve SortOrder for field: TransSubmitter (BMF.trans_submitter)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransSubmitterSortOrder () {
    return this.TransSubmitterSort;
  }
  /** Set the sort direction for field: TransSubmitter (BMF.trans_submitter)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransSubmitterSortDirection (boolean ascending) {
    this.TransSubmitterSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransSubmitter (BMF.trans_submitter)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransSubmitterSortDirection () {
    return this.TransSubmitterSortAscending;
  }
  /** Set the case insensitive for field: TransSubmitter (BMF.trans_submitter)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setTransSubmitterCaseInsensitive (boolean ascending) {
    this.TransSubmitterCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: TransSubmitter (BMF.trans_submitter)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getTransSubmitterCaseInsensitive () {
    return this.TransSubmitterCaseInsensitive;
  }
  /** Set the field level filters for field: TransSubmitter (BMF.trans_submitter)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransSubmitterFilter (StringFilter[] value) throws ServiceException {
    this.TransSubmitter = value;
  }
  /** Retrieve filter for field: TransSubmitter (BMF.trans_submitter)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getTransSubmitterFilter () {
    return this.TransSubmitter;
  }

  /**
   * Retrieves the TransSubmitterFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransSubmitterFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransSubmitterFilter field
   */
  public String[] getTransSubmitterFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSubmitterFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransSubmitterFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSubmitterFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransSubmitterFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransSubmitterFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransSubmitterFilter filter value from a formatted string
   *
   * @param _value the TransSubmitterFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransSubmitterFilter filter field
   */
  public void setTransSubmitterFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransSubmitterFilterFromFormattedString");
    try {
      this.setTransSubmitterFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransSubmitterFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransSubmitterFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransSubmitterFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ActionCode (BMF.action_code)
   * @param fetch whether to fetch this field or not
   */
  public void setActionCodeFetch (boolean fetch) {
    this.ActionCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActionCode (BMF.action_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getActionCodeFetch () {
    return this.ActionCodeFetch;
  }
  /** Set the SortOrder for field: ActionCode (BMF.action_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActionCodeSortOrder (Integer value) {
    this.ActionCodeSort = value;
  }
  /** Retrieve SortOrder for field: ActionCode (BMF.action_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActionCodeSortOrder () {
    return this.ActionCodeSort;
  }
  /** Set the sort direction for field: ActionCode (BMF.action_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActionCodeSortDirection (boolean ascending) {
    this.ActionCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActionCode (BMF.action_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActionCodeSortDirection () {
    return this.ActionCodeSortAscending;
  }
  /** Set the case insensitive for field: ActionCode (BMF.action_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setActionCodeCaseInsensitive (boolean ascending) {
    this.ActionCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ActionCode (BMF.action_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getActionCodeCaseInsensitive () {
    return this.ActionCodeCaseInsensitive;
  }
  /** Set the field level filters for field: ActionCode (BMF.action_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActionCodeFilter (StringFilter[] value) throws ServiceException {
    this.ActionCode = value;
  }
  /** Retrieve filter for field: ActionCode (BMF.action_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getActionCodeFilter () {
    return this.ActionCode;
  }

  /**
   * Retrieves the ActionCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActionCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActionCodeFilter field
   */
  public String[] getActionCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActionCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActionCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActionCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActionCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActionCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ActionCodeFilter filter value from a formatted string
   *
   * @param _value the ActionCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActionCodeFilter filter field
   */
  public void setActionCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActionCodeFilterFromFormattedString");
    try {
      this.setActionCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActionCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActionCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActionCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccountInternalId (PAYMENT_TRANS.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (PAYMENT_TRANS.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (PAYMENT_TRANS.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (PAYMENT_TRANS.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (PAYMENT_TRANS.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (PAYMENT_TRANS.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (PAYMENT_TRANS.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (PAYMENT_TRANS.account_no)
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

  /** Set the field level Fetch value for field: BillRefNo (PAYMENT_TRANS.bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefNoFetch (boolean fetch) {
    this.BillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefNo (PAYMENT_TRANS.bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefNoFetch () {
    return this.BillRefNoFetch;
  }
  /** Set the SortOrder for field: BillRefNo (PAYMENT_TRANS.bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefNoSortOrder (Integer value) {
    this.BillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: BillRefNo (PAYMENT_TRANS.bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefNoSortOrder () {
    return this.BillRefNoSort;
  }
  /** Set the sort direction for field: BillRefNo (PAYMENT_TRANS.bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefNoSortDirection (boolean ascending) {
    this.BillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefNo (PAYMENT_TRANS.bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefNoSortDirection () {
    return this.BillRefNoSortAscending;
  }
  /** Set the field level filters for field: BillRefNo (PAYMENT_TRANS.bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefNoFilter (IntegerFilter[] value) throws ServiceException {
    this.BillRefNo = value;
  }
  /** Retrieve filter for field: BillRefNo (PAYMENT_TRANS.bill_ref_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefNoFilter () {
    return this.BillRefNo;
  }

  /**
   * Retrieves the BillRefNoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillRefNoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefNoFilter field
   */
  public String[] getBillRefNoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefNoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillRefNoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefNoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefNoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillRefNoFilter filter value from a formatted string
   *
   * @param _value the BillRefNoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillRefNoFilter filter field
   */
  public void setBillRefNoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillRefNoFilterFromFormattedString");
    try {
      this.setBillRefNoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefNoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefNoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillRefResets (PAYMENT_TRANS.bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefResetsFetch (boolean fetch) {
    this.BillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefResets (PAYMENT_TRANS.bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefResetsFetch () {
    return this.BillRefResetsFetch;
  }
  /** Set the SortOrder for field: BillRefResets (PAYMENT_TRANS.bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefResetsSortOrder (Integer value) {
    this.BillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: BillRefResets (PAYMENT_TRANS.bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefResetsSortOrder () {
    return this.BillRefResetsSort;
  }
  /** Set the sort direction for field: BillRefResets (PAYMENT_TRANS.bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefResetsSortDirection (boolean ascending) {
    this.BillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefResets (PAYMENT_TRANS.bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefResetsSortDirection () {
    return this.BillRefResetsSortAscending;
  }
  /** Set the field level filters for field: BillRefResets (PAYMENT_TRANS.bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.BillRefResets = value;
  }
  /** Retrieve filter for field: BillRefResets (PAYMENT_TRANS.bill_ref_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefResetsFilter () {
    return this.BillRefResets;
  }

  /**
   * Retrieves the BillRefResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillRefResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefResetsFilter field
   */
  public String[] getBillRefResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillRefResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillRefResetsFilter filter value from a formatted string
   *
   * @param _value the BillRefResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillRefResetsFilter filter field
   */
  public void setBillRefResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillRefResetsFilterFromFormattedString");
    try {
      this.setBillRefResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PaymentDueDate (PAYMENT_TRANS.payment_due_date)
   * @param fetch whether to fetch this field or not
   */
  public void setPaymentDueDateFetch (boolean fetch) {
    this.PaymentDueDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: PaymentDueDate (PAYMENT_TRANS.payment_due_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getPaymentDueDateFetch () {
    return this.PaymentDueDateFetch;
  }
  /** Set the SortOrder for field: PaymentDueDate (PAYMENT_TRANS.payment_due_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPaymentDueDateSortOrder (Integer value) {
    this.PaymentDueDateSort = value;
  }
  /** Retrieve SortOrder for field: PaymentDueDate (PAYMENT_TRANS.payment_due_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPaymentDueDateSortOrder () {
    return this.PaymentDueDateSort;
  }
  /** Set the sort direction for field: PaymentDueDate (PAYMENT_TRANS.payment_due_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPaymentDueDateSortDirection (boolean ascending) {
    this.PaymentDueDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PaymentDueDate (PAYMENT_TRANS.payment_due_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPaymentDueDateSortDirection () {
    return this.PaymentDueDateSortAscending;
  }
  /** Set the field level filters for field: PaymentDueDate (PAYMENT_TRANS.payment_due_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPaymentDueDateFilter (DateFilter[] value) throws ServiceException {
    this.PaymentDueDate = value;
  }
  /** Retrieve filter for field: PaymentDueDate (PAYMENT_TRANS.payment_due_date)
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


  /** Set the field level Fetch value for field: StatementDate (PAYMENT_TRANS.statement_date)
   * @param fetch whether to fetch this field or not
   */
  public void setStatementDateFetch (boolean fetch) {
    this.StatementDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: StatementDate (PAYMENT_TRANS.statement_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatementDateFetch () {
    return this.StatementDateFetch;
  }
  /** Set the SortOrder for field: StatementDate (PAYMENT_TRANS.statement_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatementDateSortOrder (Integer value) {
    this.StatementDateSort = value;
  }
  /** Retrieve SortOrder for field: StatementDate (PAYMENT_TRANS.statement_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatementDateSortOrder () {
    return this.StatementDateSort;
  }
  /** Set the sort direction for field: StatementDate (PAYMENT_TRANS.statement_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatementDateSortDirection (boolean ascending) {
    this.StatementDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StatementDate (PAYMENT_TRANS.statement_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatementDateSortDirection () {
    return this.StatementDateSortAscending;
  }
  /** Set the field level filters for field: StatementDate (PAYMENT_TRANS.statement_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatementDateFilter (DateFilter[] value) throws ServiceException {
    this.StatementDate = value;
  }
  /** Retrieve filter for field: StatementDate (PAYMENT_TRANS.statement_date)
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


  /** Set the field level Fetch value for field: Amount (PAYMENT_TRANS.amount)
   * @param fetch whether to fetch this field or not
   */
  public void setAmountFetch (boolean fetch) {
    this.AmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: Amount (PAYMENT_TRANS.amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getAmountFetch () {
    return this.AmountFetch;
  }
  /** Set the SortOrder for field: Amount (PAYMENT_TRANS.amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAmountSortOrder (Integer value) {
    this.AmountSort = value;
  }
  /** Retrieve SortOrder for field: Amount (PAYMENT_TRANS.amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAmountSortOrder () {
    return this.AmountSort;
  }
  /** Set the sort direction for field: Amount (PAYMENT_TRANS.amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAmountSortDirection (boolean ascending) {
    this.AmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Amount (PAYMENT_TRANS.amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAmountSortDirection () {
    return this.AmountSortAscending;
  }
  /** Set the field level filters for field: Amount (PAYMENT_TRANS.amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.Amount = value;
  }
  /** Retrieve filter for field: Amount (PAYMENT_TRANS.amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAmountFilter () {
    return this.Amount;
  }

  /**
   * Retrieves the AmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountFilter field
   */
  public String[] getAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AmountFilter filter value from a formatted string
   *
   * @param _value the AmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AmountFilter filter field
   */
  public void setAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountFilterFromFormattedString");
    try {
      this.setAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFilterFromFormattedString");
  }

  /**
   * Sets the AmountFilter filter value from a formatted string
   *
   * @param _value the AmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AmountFilter filter field
   */
  public void setAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountFilterFromFormattedCurrencyString");
    try {
      this.setAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the AmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountFilter field
   */

  public String[] getAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: CurrencyCode (PAYMENT_TRANS.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (PAYMENT_TRANS.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (PAYMENT_TRANS.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (PAYMENT_TRANS.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (PAYMENT_TRANS.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (PAYMENT_TRANS.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (PAYMENT_TRANS.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (PAYMENT_TRANS.currency_code)
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

  /**
   * Retrieves the display value for the enumerated CurrencyCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CurrencyCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CurrencyCodeFilter filter field
   */
  public String[] getCurrencyCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getCurrencyCodeFilter(), "Currency", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated CurrencyCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the CurrencyCodeFilter filter field
   */
  public void setCurrencyCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setCurrencyCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "CurrencyCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: TransType (PAYMENT_TRANS.trans_type)
   * @param fetch whether to fetch this field or not
   */
  public void setTransTypeFetch (boolean fetch) {
    this.TransTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransType (PAYMENT_TRANS.trans_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransTypeFetch () {
    return this.TransTypeFetch;
  }
  /** Set the SortOrder for field: TransType (PAYMENT_TRANS.trans_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransTypeSortOrder (Integer value) {
    this.TransTypeSort = value;
  }
  /** Retrieve SortOrder for field: TransType (PAYMENT_TRANS.trans_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransTypeSortOrder () {
    return this.TransTypeSort;
  }
  /** Set the sort direction for field: TransType (PAYMENT_TRANS.trans_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransTypeSortDirection (boolean ascending) {
    this.TransTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransType (PAYMENT_TRANS.trans_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransTypeSortDirection () {
    return this.TransTypeSortAscending;
  }
  /** Set the field level filters for field: TransType (PAYMENT_TRANS.trans_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.TransType = value;
  }
  /** Retrieve filter for field: TransType (PAYMENT_TRANS.trans_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTransTypeFilter () {
    return this.TransType;
  }

  /**
   * Retrieves the TransTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransTypeFilter field
   */
  public String[] getTransTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransTypeFilter filter value from a formatted string
   *
   * @param _value the TransTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransTypeFilter filter field
   */
  public void setTransTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransTypeFilterFromFormattedString");
    try {
      this.setTransTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BmfTransType (PAYMENT_TRANS.bmf_trans_type)
   * @param fetch whether to fetch this field or not
   */
  public void setBmfTransTypeFetch (boolean fetch) {
    this.BmfTransTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BmfTransType (PAYMENT_TRANS.bmf_trans_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getBmfTransTypeFetch () {
    return this.BmfTransTypeFetch;
  }
  /** Set the SortOrder for field: BmfTransType (PAYMENT_TRANS.bmf_trans_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBmfTransTypeSortOrder (Integer value) {
    this.BmfTransTypeSort = value;
  }
  /** Retrieve SortOrder for field: BmfTransType (PAYMENT_TRANS.bmf_trans_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBmfTransTypeSortOrder () {
    return this.BmfTransTypeSort;
  }
  /** Set the sort direction for field: BmfTransType (PAYMENT_TRANS.bmf_trans_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBmfTransTypeSortDirection (boolean ascending) {
    this.BmfTransTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BmfTransType (PAYMENT_TRANS.bmf_trans_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBmfTransTypeSortDirection () {
    return this.BmfTransTypeSortAscending;
  }
  /** Set the field level filters for field: BmfTransType (PAYMENT_TRANS.bmf_trans_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBmfTransTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.BmfTransType = value;
  }
  /** Retrieve filter for field: BmfTransType (PAYMENT_TRANS.bmf_trans_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBmfTransTypeFilter () {
    return this.BmfTransType;
  }

  /**
   * Retrieves the BmfTransTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BmfTransTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTransTypeFilter field
   */
  public String[] getBmfTransTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTransTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBmfTransTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTransTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTransTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BmfTransTypeFilter filter value from a formatted string
   *
   * @param _value the BmfTransTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BmfTransTypeFilter filter field
   */
  public void setBmfTransTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfTransTypeFilterFromFormattedString");
    try {
      this.setBmfTransTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTransTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTransTypeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated BmfTransTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BmfTransTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BmfTransTypeFilter filter field
   */
  public String[] getBmfTransTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTransTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getBmfTransTypeFilter(), "PaymentType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTransTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTransTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated BmfTransTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BmfTransTypeFilter filter field
   */
  public void setBmfTransTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfTransTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setBmfTransTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "BmfTransType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTransTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTransTypeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: TransStatus (PAYMENT_TRANS.trans_status)
   * @param fetch whether to fetch this field or not
   */
  public void setTransStatusFetch (boolean fetch) {
    this.TransStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransStatus (PAYMENT_TRANS.trans_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransStatusFetch () {
    return this.TransStatusFetch;
  }
  /** Set the SortOrder for field: TransStatus (PAYMENT_TRANS.trans_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransStatusSortOrder (Integer value) {
    this.TransStatusSort = value;
  }
  /** Retrieve SortOrder for field: TransStatus (PAYMENT_TRANS.trans_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransStatusSortOrder () {
    return this.TransStatusSort;
  }
  /** Set the sort direction for field: TransStatus (PAYMENT_TRANS.trans_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransStatusSortDirection (boolean ascending) {
    this.TransStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransStatus (PAYMENT_TRANS.trans_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransStatusSortDirection () {
    return this.TransStatusSortAscending;
  }
  /** Set the field level filters for field: TransStatus (PAYMENT_TRANS.trans_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.TransStatus = value;
  }
  /** Retrieve filter for field: TransStatus (PAYMENT_TRANS.trans_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTransStatusFilter () {
    return this.TransStatus;
  }

  /**
   * Retrieves the TransStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransStatusFilter field
   */
  public String[] getTransStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransStatusFilter filter value from a formatted string
   *
   * @param _value the TransStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransStatusFilter filter field
   */
  public void setTransStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransStatusFilterFromFormattedString");
    try {
      this.setTransStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Counter (PAYMENT_TRANS.counter)
   * @param fetch whether to fetch this field or not
   */
  public void setCounterFetch (boolean fetch) {
    this.CounterFetch = fetch;
  }
  /** Retrieve Fetch value for field: Counter (PAYMENT_TRANS.counter)
   * @return boolean the Fetch value for this field
   */
  public boolean getCounterFetch () {
    return this.CounterFetch;
  }
  /** Set the SortOrder for field: Counter (PAYMENT_TRANS.counter)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCounterSortOrder (Integer value) {
    this.CounterSort = value;
  }
  /** Retrieve SortOrder for field: Counter (PAYMENT_TRANS.counter)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCounterSortOrder () {
    return this.CounterSort;
  }
  /** Set the sort direction for field: Counter (PAYMENT_TRANS.counter)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCounterSortDirection (boolean ascending) {
    this.CounterSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Counter (PAYMENT_TRANS.counter)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCounterSortDirection () {
    return this.CounterSortAscending;
  }
  /** Set the field level filters for field: Counter (PAYMENT_TRANS.counter)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCounterFilter (IntegerFilter[] value) throws ServiceException {
    this.Counter = value;
  }
  /** Retrieve filter for field: Counter (PAYMENT_TRANS.counter)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCounterFilter () {
    return this.Counter;
  }

  /**
   * Retrieves the CounterFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CounterFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CounterFilter field
   */
  public String[] getCounterFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCounterFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCounterFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCounterFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CounterFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCounterFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CounterFilter filter value from a formatted string
   *
   * @param _value the CounterFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CounterFilter filter field
   */
  public void setCounterFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCounterFilterFromFormattedString");
    try {
      this.setCounterFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CounterFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCounterFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCounterFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FileId (PAYMENT_TRANS.file_id)
   * @param fetch whether to fetch this field or not
   */
  public void setFileIdFetch (boolean fetch) {
    this.FileIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: FileId (PAYMENT_TRANS.file_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getFileIdFetch () {
    return this.FileIdFetch;
  }
  /** Set the SortOrder for field: FileId (PAYMENT_TRANS.file_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFileIdSortOrder (Integer value) {
    this.FileIdSort = value;
  }
  /** Retrieve SortOrder for field: FileId (PAYMENT_TRANS.file_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFileIdSortOrder () {
    return this.FileIdSort;
  }
  /** Set the sort direction for field: FileId (PAYMENT_TRANS.file_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFileIdSortDirection (boolean ascending) {
    this.FileIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FileId (PAYMENT_TRANS.file_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFileIdSortDirection () {
    return this.FileIdSortAscending;
  }
  /** Set the field level filters for field: FileId (PAYMENT_TRANS.file_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFileIdFilter (IntegerFilter[] value) throws ServiceException {
    this.FileId = value;
  }
  /** Retrieve filter for field: FileId (PAYMENT_TRANS.file_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getFileIdFilter () {
    return this.FileId;
  }

  /**
   * Retrieves the FileIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FileIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FileIdFilter field
   */
  public String[] getFileIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFileIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFileIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFileIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FileIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFileIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FileIdFilter filter value from a formatted string
   *
   * @param _value the FileIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FileIdFilter filter field
   */
  public void setFileIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFileIdFilterFromFormattedString");
    try {
      this.setFileIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FileIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFileIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFileIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ClearingHouseId (PAYMENT_TRANS.clearing_house_id)
   * @param fetch whether to fetch this field or not
   */
  public void setClearingHouseIdFetch (boolean fetch) {
    this.ClearingHouseIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ClearingHouseId (PAYMENT_TRANS.clearing_house_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getClearingHouseIdFetch () {
    return this.ClearingHouseIdFetch;
  }
  /** Set the SortOrder for field: ClearingHouseId (PAYMENT_TRANS.clearing_house_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setClearingHouseIdSortOrder (Integer value) {
    this.ClearingHouseIdSort = value;
  }
  /** Retrieve SortOrder for field: ClearingHouseId (PAYMENT_TRANS.clearing_house_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getClearingHouseIdSortOrder () {
    return this.ClearingHouseIdSort;
  }
  /** Set the sort direction for field: ClearingHouseId (PAYMENT_TRANS.clearing_house_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setClearingHouseIdSortDirection (boolean ascending) {
    this.ClearingHouseIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ClearingHouseId (PAYMENT_TRANS.clearing_house_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getClearingHouseIdSortDirection () {
    return this.ClearingHouseIdSortAscending;
  }
  /** Set the case insensitive for field: ClearingHouseId (PAYMENT_TRANS.clearing_house_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setClearingHouseIdCaseInsensitive (boolean ascending) {
    this.ClearingHouseIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ClearingHouseId (PAYMENT_TRANS.clearing_house_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getClearingHouseIdCaseInsensitive () {
    return this.ClearingHouseIdCaseInsensitive;
  }
  /** Set the field level filters for field: ClearingHouseId (PAYMENT_TRANS.clearing_house_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setClearingHouseIdFilter (StringFilter[] value) throws ServiceException {
    this.ClearingHouseId = value;
  }
  /** Retrieve filter for field: ClearingHouseId (PAYMENT_TRANS.clearing_house_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getClearingHouseIdFilter () {
    return this.ClearingHouseId;
  }

  /**
   * Retrieves the ClearingHouseIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ClearingHouseIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ClearingHouseIdFilter field
   */
  public String[] getClearingHouseIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getClearingHouseIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ClearingHouseIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getClearingHouseIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ClearingHouseIdFilter filter value from a formatted string
   *
   * @param _value the ClearingHouseIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ClearingHouseIdFilter filter field
   */
  public void setClearingHouseIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setClearingHouseIdFilterFromFormattedString");
    try {
      this.setClearingHouseIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ClearingHouseIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setClearingHouseIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setClearingHouseIdFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated ClearingHouseIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ClearingHouseIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ClearingHouseIdFilter filter field
   */
  public String[] getClearingHouseIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getClearingHouseIdFilter(), "ClearingHouse", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ClearingHouseIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getClearingHouseIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated ClearingHouseIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the ClearingHouseIdFilter filter field
   */
  public void setClearingHouseIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setClearingHouseIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setClearingHouseIdFilter((StringFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "ClearingHouseId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ClearingHouseIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setClearingHouseIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setClearingHouseIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: ResponseCode (PAYMENT_TRANS.response_code)
   * @param fetch whether to fetch this field or not
   */
  public void setResponseCodeFetch (boolean fetch) {
    this.ResponseCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResponseCode (PAYMENT_TRANS.response_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getResponseCodeFetch () {
    return this.ResponseCodeFetch;
  }
  /** Set the SortOrder for field: ResponseCode (PAYMENT_TRANS.response_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResponseCodeSortOrder (Integer value) {
    this.ResponseCodeSort = value;
  }
  /** Retrieve SortOrder for field: ResponseCode (PAYMENT_TRANS.response_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResponseCodeSortOrder () {
    return this.ResponseCodeSort;
  }
  /** Set the sort direction for field: ResponseCode (PAYMENT_TRANS.response_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResponseCodeSortDirection (boolean ascending) {
    this.ResponseCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResponseCode (PAYMENT_TRANS.response_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResponseCodeSortDirection () {
    return this.ResponseCodeSortAscending;
  }
  /** Set the case insensitive for field: ResponseCode (PAYMENT_TRANS.response_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setResponseCodeCaseInsensitive (boolean ascending) {
    this.ResponseCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ResponseCode (PAYMENT_TRANS.response_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getResponseCodeCaseInsensitive () {
    return this.ResponseCodeCaseInsensitive;
  }
  /** Set the field level filters for field: ResponseCode (PAYMENT_TRANS.response_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResponseCodeFilter (StringFilter[] value) throws ServiceException {
    this.ResponseCode = value;
  }
  /** Retrieve filter for field: ResponseCode (PAYMENT_TRANS.response_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getResponseCodeFilter () {
    return this.ResponseCode;
  }

  /**
   * Retrieves the ResponseCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResponseCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResponseCodeFilter field
   */
  public String[] getResponseCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResponseCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResponseCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResponseCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResponseCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResponseCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ResponseCodeFilter filter value from a formatted string
   *
   * @param _value the ResponseCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResponseCodeFilter filter field
   */
  public void setResponseCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResponseCodeFilterFromFormattedString");
    try {
      this.setResponseCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResponseCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResponseCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResponseCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ChgDate (PAYMENT_TRANS.chg_date)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDateFetch (boolean fetch) {
    this.ChgDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDate (PAYMENT_TRANS.chg_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDateFetch () {
    return this.ChgDateFetch;
  }
  /** Set the SortOrder for field: ChgDate (PAYMENT_TRANS.chg_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDateSortOrder (Integer value) {
    this.ChgDateSort = value;
  }
  /** Retrieve SortOrder for field: ChgDate (PAYMENT_TRANS.chg_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDateSortOrder () {
    return this.ChgDateSort;
  }
  /** Set the sort direction for field: ChgDate (PAYMENT_TRANS.chg_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDateSortDirection (boolean ascending) {
    this.ChgDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDate (PAYMENT_TRANS.chg_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDateSortDirection () {
    return this.ChgDateSortAscending;
  }
  /** Set the field level filters for field: ChgDate (PAYMENT_TRANS.chg_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDateFilter (DateFilter[] value) throws ServiceException {
    this.ChgDate = value;
  }
  /** Retrieve filter for field: ChgDate (PAYMENT_TRANS.chg_date)
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


  /** Set the field level Fetch value for field: PmtTrackingId (PAYMENT_TRANS.pmt_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setPmtTrackingIdFetch (boolean fetch) {
    this.PmtTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PmtTrackingId (PAYMENT_TRANS.pmt_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getPmtTrackingIdFetch () {
    return this.PmtTrackingIdFetch;
  }
  /** Set the SortOrder for field: PmtTrackingId (PAYMENT_TRANS.pmt_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPmtTrackingIdSortOrder (Integer value) {
    this.PmtTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: PmtTrackingId (PAYMENT_TRANS.pmt_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPmtTrackingIdSortOrder () {
    return this.PmtTrackingIdSort;
  }
  /** Set the sort direction for field: PmtTrackingId (PAYMENT_TRANS.pmt_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPmtTrackingIdSortDirection (boolean ascending) {
    this.PmtTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PmtTrackingId (PAYMENT_TRANS.pmt_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPmtTrackingIdSortDirection () {
    return this.PmtTrackingIdSortAscending;
  }
  /** Set the field level filters for field: PmtTrackingId (PAYMENT_TRANS.pmt_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPmtTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.PmtTrackingId = value;
  }
  /** Retrieve filter for field: PmtTrackingId (PAYMENT_TRANS.pmt_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPmtTrackingIdFilter () {
    return this.PmtTrackingId;
  }

  /**
   * Retrieves the PmtTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PmtTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PmtTrackingIdFilter field
   */
  public String[] getPmtTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPmtTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPmtTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPmtTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PmtTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPmtTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PmtTrackingIdFilter filter value from a formatted string
   *
   * @param _value the PmtTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PmtTrackingIdFilter filter field
   */
  public void setPmtTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPmtTrackingIdFilterFromFormattedString");
    try {
      this.setPmtTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PmtTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPmtTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPmtTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PmtTrackingIdServ (PAYMENT_TRANS.pmt_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setPmtTrackingIdServFetch (boolean fetch) {
    this.PmtTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: PmtTrackingIdServ (PAYMENT_TRANS.pmt_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getPmtTrackingIdServFetch () {
    return this.PmtTrackingIdServFetch;
  }
  /** Set the SortOrder for field: PmtTrackingIdServ (PAYMENT_TRANS.pmt_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPmtTrackingIdServSortOrder (Integer value) {
    this.PmtTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: PmtTrackingIdServ (PAYMENT_TRANS.pmt_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPmtTrackingIdServSortOrder () {
    return this.PmtTrackingIdServSort;
  }
  /** Set the sort direction for field: PmtTrackingIdServ (PAYMENT_TRANS.pmt_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPmtTrackingIdServSortDirection (boolean ascending) {
    this.PmtTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PmtTrackingIdServ (PAYMENT_TRANS.pmt_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPmtTrackingIdServSortDirection () {
    return this.PmtTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: PmtTrackingIdServ (PAYMENT_TRANS.pmt_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPmtTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.PmtTrackingIdServ = value;
  }
  /** Retrieve filter for field: PmtTrackingIdServ (PAYMENT_TRANS.pmt_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPmtTrackingIdServFilter () {
    return this.PmtTrackingIdServ;
  }

  /**
   * Retrieves the PmtTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PmtTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PmtTrackingIdServFilter field
   */
  public String[] getPmtTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPmtTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPmtTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPmtTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PmtTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPmtTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PmtTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the PmtTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PmtTrackingIdServFilter filter field
   */
  public void setPmtTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPmtTrackingIdServFilterFromFormattedString");
    try {
      this.setPmtTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PmtTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPmtTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPmtTrackingIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProviderId (PAYMENT_TRANS.provider_id)
   * @param fetch whether to fetch this field or not
   */
  public void setProviderIdFetch (boolean fetch) {
    this.ProviderIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProviderId (PAYMENT_TRANS.provider_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getProviderIdFetch () {
    return this.ProviderIdFetch;
  }
  /** Set the SortOrder for field: ProviderId (PAYMENT_TRANS.provider_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProviderIdSortOrder (Integer value) {
    this.ProviderIdSort = value;
  }
  /** Retrieve SortOrder for field: ProviderId (PAYMENT_TRANS.provider_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProviderIdSortOrder () {
    return this.ProviderIdSort;
  }
  /** Set the sort direction for field: ProviderId (PAYMENT_TRANS.provider_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProviderIdSortDirection (boolean ascending) {
    this.ProviderIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProviderId (PAYMENT_TRANS.provider_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProviderIdSortDirection () {
    return this.ProviderIdSortAscending;
  }
  /** Set the field level filters for field: ProviderId (PAYMENT_TRANS.provider_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProviderIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ProviderId = value;
  }
  /** Retrieve filter for field: ProviderId (PAYMENT_TRANS.provider_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getProviderIdFilter () {
    return this.ProviderId;
  }

  /**
   * Retrieves the ProviderIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProviderIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProviderIdFilter field
   */
  public String[] getProviderIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProviderIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProviderIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProviderIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProviderIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProviderIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProviderIdFilter filter value from a formatted string
   *
   * @param _value the ProviderIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProviderIdFilter filter field
   */
  public void setProviderIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProviderIdFilterFromFormattedString");
    try {
      this.setProviderIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProviderIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProviderIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProviderIdFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated ProviderIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ProviderIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ProviderIdFilter filter field
   */
  public String[] getProviderIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProviderIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getProviderIdFilter(), "ProviderType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProviderIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProviderIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProviderIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated ProviderIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the ProviderIdFilter filter field
   */
  public void setProviderIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProviderIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setProviderIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "ProviderId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProviderIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProviderIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProviderIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: ProfileId (PAYMENT_TRANS.profile_id)
   * @param fetch whether to fetch this field or not
   */
  public void setProfileIdFetch (boolean fetch) {
    this.ProfileIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProfileId (PAYMENT_TRANS.profile_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getProfileIdFetch () {
    return this.ProfileIdFetch;
  }
  /** Set the SortOrder for field: ProfileId (PAYMENT_TRANS.profile_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProfileIdSortOrder (Integer value) {
    this.ProfileIdSort = value;
  }
  /** Retrieve SortOrder for field: ProfileId (PAYMENT_TRANS.profile_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProfileIdSortOrder () {
    return this.ProfileIdSort;
  }
  /** Set the sort direction for field: ProfileId (PAYMENT_TRANS.profile_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProfileIdSortDirection (boolean ascending) {
    this.ProfileIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProfileId (PAYMENT_TRANS.profile_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProfileIdSortDirection () {
    return this.ProfileIdSortAscending;
  }
  /** Set the field level filters for field: ProfileId (PAYMENT_TRANS.profile_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProfileIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ProfileId = value;
  }
  /** Retrieve filter for field: ProfileId (PAYMENT_TRANS.profile_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getProfileIdFilter () {
    return this.ProfileId;
  }

  /**
   * Retrieves the ProfileIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProfileIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProfileIdFilter field
   */
  public String[] getProfileIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProfileIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProfileIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProfileIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProfileIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProfileIdFilter filter value from a formatted string
   *
   * @param _value the ProfileIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProfileIdFilter filter field
   */
  public void setProfileIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProfileIdFilterFromFormattedString");
    try {
      this.setProfileIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProfileIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProfileIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProfileIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CcauthCode (PAYMENT_TRANS.ccauth_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCcauthCodeFetch (boolean fetch) {
    this.CcauthCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CcauthCode (PAYMENT_TRANS.ccauth_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCcauthCodeFetch () {
    return this.CcauthCodeFetch;
  }
  /** Set the SortOrder for field: CcauthCode (PAYMENT_TRANS.ccauth_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCcauthCodeSortOrder (Integer value) {
    this.CcauthCodeSort = value;
  }
  /** Retrieve SortOrder for field: CcauthCode (PAYMENT_TRANS.ccauth_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCcauthCodeSortOrder () {
    return this.CcauthCodeSort;
  }
  /** Set the sort direction for field: CcauthCode (PAYMENT_TRANS.ccauth_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCcauthCodeSortDirection (boolean ascending) {
    this.CcauthCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CcauthCode (PAYMENT_TRANS.ccauth_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCcauthCodeSortDirection () {
    return this.CcauthCodeSortAscending;
  }
  /** Set the case insensitive for field: CcauthCode (PAYMENT_TRANS.ccauth_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCcauthCodeCaseInsensitive (boolean ascending) {
    this.CcauthCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CcauthCode (PAYMENT_TRANS.ccauth_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCcauthCodeCaseInsensitive () {
    return this.CcauthCodeCaseInsensitive;
  }
  /** Set the field level filters for field: CcauthCode (PAYMENT_TRANS.ccauth_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCcauthCodeFilter (StringFilter[] value) throws ServiceException {
    this.CcauthCode = value;
  }
  /** Retrieve filter for field: CcauthCode (PAYMENT_TRANS.ccauth_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCcauthCodeFilter () {
    return this.CcauthCode;
  }

  /**
   * Retrieves the CcauthCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CcauthCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CcauthCodeFilter field
   */
  public String[] getCcauthCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcauthCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCcauthCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcauthCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcauthCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcauthCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CcauthCodeFilter filter value from a formatted string
   *
   * @param _value the CcauthCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CcauthCodeFilter filter field
   */
  public void setCcauthCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCcauthCodeFilterFromFormattedString");
    try {
      this.setCcauthCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcauthCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCcauthCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCcauthCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CcauthDate (PAYMENT_TRANS.ccauth_date)
   * @param fetch whether to fetch this field or not
   */
  public void setCcauthDateFetch (boolean fetch) {
    this.CcauthDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: CcauthDate (PAYMENT_TRANS.ccauth_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getCcauthDateFetch () {
    return this.CcauthDateFetch;
  }
  /** Set the SortOrder for field: CcauthDate (PAYMENT_TRANS.ccauth_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCcauthDateSortOrder (Integer value) {
    this.CcauthDateSort = value;
  }
  /** Retrieve SortOrder for field: CcauthDate (PAYMENT_TRANS.ccauth_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCcauthDateSortOrder () {
    return this.CcauthDateSort;
  }
  /** Set the sort direction for field: CcauthDate (PAYMENT_TRANS.ccauth_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCcauthDateSortDirection (boolean ascending) {
    this.CcauthDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CcauthDate (PAYMENT_TRANS.ccauth_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCcauthDateSortDirection () {
    return this.CcauthDateSortAscending;
  }
  /** Set the case insensitive for field: CcauthDate (PAYMENT_TRANS.ccauth_date)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCcauthDateCaseInsensitive (boolean ascending) {
    this.CcauthDateCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CcauthDate (PAYMENT_TRANS.ccauth_date)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCcauthDateCaseInsensitive () {
    return this.CcauthDateCaseInsensitive;
  }
  /** Set the field level filters for field: CcauthDate (PAYMENT_TRANS.ccauth_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCcauthDateFilter (StringFilter[] value) throws ServiceException {
    this.CcauthDate = value;
  }
  /** Retrieve filter for field: CcauthDate (PAYMENT_TRANS.ccauth_date)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCcauthDateFilter () {
    return this.CcauthDate;
  }

  /**
   * Retrieves the CcauthDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CcauthDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CcauthDateFilter field
   */
  public String[] getCcauthDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcauthDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCcauthDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcauthDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcauthDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcauthDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CcauthDateFilter filter value from a formatted string
   *
   * @param _value the CcauthDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CcauthDateFilter filter field
   */
  public void setCcauthDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCcauthDateFilterFromFormattedString");
    try {
      this.setCcauthDateFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcauthDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCcauthDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCcauthDateFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PmtReqSentCounter (PAYMENT_TRANS.pmt_req_sent_counter)
   * @param fetch whether to fetch this field or not
   */
  public void setPmtReqSentCounterFetch (boolean fetch) {
    this.PmtReqSentCounterFetch = fetch;
  }
  /** Retrieve Fetch value for field: PmtReqSentCounter (PAYMENT_TRANS.pmt_req_sent_counter)
   * @return boolean the Fetch value for this field
   */
  public boolean getPmtReqSentCounterFetch () {
    return this.PmtReqSentCounterFetch;
  }
  /** Set the SortOrder for field: PmtReqSentCounter (PAYMENT_TRANS.pmt_req_sent_counter)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPmtReqSentCounterSortOrder (Integer value) {
    this.PmtReqSentCounterSort = value;
  }
  /** Retrieve SortOrder for field: PmtReqSentCounter (PAYMENT_TRANS.pmt_req_sent_counter)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPmtReqSentCounterSortOrder () {
    return this.PmtReqSentCounterSort;
  }
  /** Set the sort direction for field: PmtReqSentCounter (PAYMENT_TRANS.pmt_req_sent_counter)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPmtReqSentCounterSortDirection (boolean ascending) {
    this.PmtReqSentCounterSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PmtReqSentCounter (PAYMENT_TRANS.pmt_req_sent_counter)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPmtReqSentCounterSortDirection () {
    return this.PmtReqSentCounterSortAscending;
  }
  /** Set the field level filters for field: PmtReqSentCounter (PAYMENT_TRANS.pmt_req_sent_counter)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPmtReqSentCounterFilter (IntegerFilter[] value) throws ServiceException {
    this.PmtReqSentCounter = value;
  }
  /** Retrieve filter for field: PmtReqSentCounter (PAYMENT_TRANS.pmt_req_sent_counter)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPmtReqSentCounterFilter () {
    return this.PmtReqSentCounter;
  }

  /**
   * Retrieves the PmtReqSentCounterFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PmtReqSentCounterFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PmtReqSentCounterFilter field
   */
  public String[] getPmtReqSentCounterFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPmtReqSentCounterFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPmtReqSentCounterFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPmtReqSentCounterFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PmtReqSentCounterFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPmtReqSentCounterFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PmtReqSentCounterFilter filter value from a formatted string
   *
   * @param _value the PmtReqSentCounterFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PmtReqSentCounterFilter filter field
   */
  public void setPmtReqSentCounterFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPmtReqSentCounterFilterFromFormattedString");
    try {
      this.setPmtReqSentCounterFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PmtReqSentCounterFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPmtReqSentCounterFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPmtReqSentCounterFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OpenItemId (PAYMENT_TRANS.open_item_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOpenItemIdFetch (boolean fetch) {
    this.OpenItemIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OpenItemId (PAYMENT_TRANS.open_item_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOpenItemIdFetch () {
    return this.OpenItemIdFetch;
  }
  /** Set the SortOrder for field: OpenItemId (PAYMENT_TRANS.open_item_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOpenItemIdSortOrder (Integer value) {
    this.OpenItemIdSort = value;
  }
  /** Retrieve SortOrder for field: OpenItemId (PAYMENT_TRANS.open_item_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOpenItemIdSortOrder () {
    return this.OpenItemIdSort;
  }
  /** Set the sort direction for field: OpenItemId (PAYMENT_TRANS.open_item_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOpenItemIdSortDirection (boolean ascending) {
    this.OpenItemIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OpenItemId (PAYMENT_TRANS.open_item_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOpenItemIdSortDirection () {
    return this.OpenItemIdSortAscending;
  }
  /** Set the field level filters for field: OpenItemId (PAYMENT_TRANS.open_item_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOpenItemIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OpenItemId = value;
  }
  /** Retrieve filter for field: OpenItemId (PAYMENT_TRANS.open_item_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOpenItemIdFilter () {
    return this.OpenItemId;
  }

  /**
   * Retrieves the OpenItemIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OpenItemIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OpenItemIdFilter field
   */
  public String[] getOpenItemIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOpenItemIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OpenItemIdFilter filter value from a formatted string
   *
   * @param _value the OpenItemIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OpenItemIdFilter filter field
   */
  public void setOpenItemIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOpenItemIdFilterFromFormattedString");
    try {
      this.setOpenItemIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOpenItemIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOpenItemIdFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated OpenItemIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the OpenItemIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OpenItemIdFilter filter field
   */
  public String[] getOpenItemIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getOpenItemIdFilter(), "OpenItem", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated OpenItemIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the OpenItemIdFilter filter field
   */
  public void setOpenItemIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOpenItemIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setOpenItemIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "OpenItemId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOpenItemIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOpenItemIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: OrigTrackingId (PAYMENT_TRANS.orig_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigTrackingIdFetch (boolean fetch) {
    this.OrigTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigTrackingId (PAYMENT_TRANS.orig_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigTrackingIdFetch () {
    return this.OrigTrackingIdFetch;
  }
  /** Set the SortOrder for field: OrigTrackingId (PAYMENT_TRANS.orig_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigTrackingIdSortOrder (Integer value) {
    this.OrigTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: OrigTrackingId (PAYMENT_TRANS.orig_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigTrackingIdSortOrder () {
    return this.OrigTrackingIdSort;
  }
  /** Set the sort direction for field: OrigTrackingId (PAYMENT_TRANS.orig_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigTrackingIdSortDirection (boolean ascending) {
    this.OrigTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigTrackingId (PAYMENT_TRANS.orig_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigTrackingIdSortDirection () {
    return this.OrigTrackingIdSortAscending;
  }
  /** Set the field level filters for field: OrigTrackingId (PAYMENT_TRANS.orig_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigTrackingId = value;
  }
  /** Retrieve filter for field: OrigTrackingId (PAYMENT_TRANS.orig_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigTrackingIdFilter () {
    return this.OrigTrackingId;
  }

  /**
   * Retrieves the OrigTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigTrackingIdFilter field
   */
  public String[] getOrigTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigTrackingIdFilter filter value from a formatted string
   *
   * @param _value the OrigTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigTrackingIdFilter filter field
   */
  public void setOrigTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigTrackingIdFilterFromFormattedString");
    try {
      this.setOrigTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OrigTrackingIdServ (PAYMENT_TRANS.orig_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigTrackingIdServFetch (boolean fetch) {
    this.OrigTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigTrackingIdServ (PAYMENT_TRANS.orig_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigTrackingIdServFetch () {
    return this.OrigTrackingIdServFetch;
  }
  /** Set the SortOrder for field: OrigTrackingIdServ (PAYMENT_TRANS.orig_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigTrackingIdServSortOrder (Integer value) {
    this.OrigTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: OrigTrackingIdServ (PAYMENT_TRANS.orig_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigTrackingIdServSortOrder () {
    return this.OrigTrackingIdServSort;
  }
  /** Set the sort direction for field: OrigTrackingIdServ (PAYMENT_TRANS.orig_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigTrackingIdServSortDirection (boolean ascending) {
    this.OrigTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigTrackingIdServ (PAYMENT_TRANS.orig_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigTrackingIdServSortDirection () {
    return this.OrigTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: OrigTrackingIdServ (PAYMENT_TRANS.orig_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigTrackingIdServ = value;
  }
  /** Retrieve filter for field: OrigTrackingIdServ (PAYMENT_TRANS.orig_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigTrackingIdServFilter () {
    return this.OrigTrackingIdServ;
  }

  /**
   * Retrieves the OrigTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigTrackingIdServFilter field
   */
  public String[] getOrigTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the OrigTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigTrackingIdServFilter filter field
   */
  public void setOrigTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigTrackingIdServFilterFromFormattedString");
    try {
      this.setOrigTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigTrackingIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NoBill (PAYMENT_TRANS.no_bill)
   * @param fetch whether to fetch this field or not
   */
  public void setNoBillFetch (boolean fetch) {
    this.NoBillFetch = fetch;
  }
  /** Retrieve Fetch value for field: NoBill (PAYMENT_TRANS.no_bill)
   * @return boolean the Fetch value for this field
   */
  public boolean getNoBillFetch () {
    return this.NoBillFetch;
  }
  /** Set the SortOrder for field: NoBill (PAYMENT_TRANS.no_bill)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNoBillSortOrder (Integer value) {
    this.NoBillSort = value;
  }
  /** Retrieve SortOrder for field: NoBill (PAYMENT_TRANS.no_bill)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNoBillSortOrder () {
    return this.NoBillSort;
  }
  /** Set the sort direction for field: NoBill (PAYMENT_TRANS.no_bill)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNoBillSortDirection (boolean ascending) {
    this.NoBillSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NoBill (PAYMENT_TRANS.no_bill)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNoBillSortDirection () {
    return this.NoBillSortAscending;
  }
  /** Set the field level filters for field: NoBill (PAYMENT_TRANS.no_bill)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNoBillFilter (BooleanFilter[] value) throws ServiceException {
    this.NoBill = value;
  }
  /** Retrieve filter for field: NoBill (PAYMENT_TRANS.no_bill)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getNoBillFilter () {
    return this.NoBill;
  }

  /**
   * Retrieves the NoBillFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NoBillFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoBillFilter field
   */
  public String[] getNoBillFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoBillFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNoBillFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoBillFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoBillFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoBillFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NoBillFilter filter value from a formatted string
   *
   * @param _value the NoBillFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NoBillFilter filter field
   */
  public void setNoBillFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNoBillFilterFromFormattedString");
    try {
      this.setNoBillFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoBillFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoBillFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoBillFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RequestType (PAYMENT_TRANS.request_type)
   * @param fetch whether to fetch this field or not
   */
  public void setRequestTypeFetch (boolean fetch) {
    this.RequestTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: RequestType (PAYMENT_TRANS.request_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getRequestTypeFetch () {
    return this.RequestTypeFetch;
  }
  /** Set the SortOrder for field: RequestType (PAYMENT_TRANS.request_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRequestTypeSortOrder (Integer value) {
    this.RequestTypeSort = value;
  }
  /** Retrieve SortOrder for field: RequestType (PAYMENT_TRANS.request_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRequestTypeSortOrder () {
    return this.RequestTypeSort;
  }
  /** Set the sort direction for field: RequestType (PAYMENT_TRANS.request_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRequestTypeSortDirection (boolean ascending) {
    this.RequestTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RequestType (PAYMENT_TRANS.request_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRequestTypeSortDirection () {
    return this.RequestTypeSortAscending;
  }
  /** Set the field level filters for field: RequestType (PAYMENT_TRANS.request_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRequestTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.RequestType = value;
  }
  /** Retrieve filter for field: RequestType (PAYMENT_TRANS.request_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRequestTypeFilter () {
    return this.RequestType;
  }

  /**
   * Retrieves the RequestTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RequestTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RequestTypeFilter field
   */
  public String[] getRequestTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRequestTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRequestTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRequestTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RequestTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRequestTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RequestTypeFilter filter value from a formatted string
   *
   * @param _value the RequestTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RequestTypeFilter filter field
   */
  public void setRequestTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRequestTypeFilterFromFormattedString");
    try {
      this.setRequestTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RequestTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRequestTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRequestTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RequestedService (PAYMENT_TRANS.requested_service)
   * @param fetch whether to fetch this field or not
   */
  public void setRequestedServiceFetch (boolean fetch) {
    this.RequestedServiceFetch = fetch;
  }
  /** Retrieve Fetch value for field: RequestedService (PAYMENT_TRANS.requested_service)
   * @return boolean the Fetch value for this field
   */
  public boolean getRequestedServiceFetch () {
    return this.RequestedServiceFetch;
  }
  /** Set the SortOrder for field: RequestedService (PAYMENT_TRANS.requested_service)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRequestedServiceSortOrder (Integer value) {
    this.RequestedServiceSort = value;
  }
  /** Retrieve SortOrder for field: RequestedService (PAYMENT_TRANS.requested_service)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRequestedServiceSortOrder () {
    return this.RequestedServiceSort;
  }
  /** Set the sort direction for field: RequestedService (PAYMENT_TRANS.requested_service)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRequestedServiceSortDirection (boolean ascending) {
    this.RequestedServiceSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RequestedService (PAYMENT_TRANS.requested_service)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRequestedServiceSortDirection () {
    return this.RequestedServiceSortAscending;
  }
  /** Set the case insensitive for field: RequestedService (PAYMENT_TRANS.requested_service)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setRequestedServiceCaseInsensitive (boolean ascending) {
    this.RequestedServiceCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: RequestedService (PAYMENT_TRANS.requested_service)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getRequestedServiceCaseInsensitive () {
    return this.RequestedServiceCaseInsensitive;
  }
  /** Set the field level filters for field: RequestedService (PAYMENT_TRANS.requested_service)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRequestedServiceFilter (StringFilter[] value) throws ServiceException {
    this.RequestedService = value;
  }
  /** Retrieve filter for field: RequestedService (PAYMENT_TRANS.requested_service)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getRequestedServiceFilter () {
    return this.RequestedService;
  }

  /**
   * Retrieves the RequestedServiceFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RequestedServiceFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RequestedServiceFilter field
   */
  public String[] getRequestedServiceFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRequestedServiceFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRequestedServiceFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRequestedServiceFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RequestedServiceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRequestedServiceFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RequestedServiceFilter filter value from a formatted string
   *
   * @param _value the RequestedServiceFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RequestedServiceFilter filter field
   */
  public void setRequestedServiceFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRequestedServiceFilterFromFormattedString");
    try {
      this.setRequestedServiceFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RequestedServiceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRequestedServiceFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRequestedServiceFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RequestId (PAYMENT_TRANS.request_id)
   * @param fetch whether to fetch this field or not
   */
  public void setRequestIdFetch (boolean fetch) {
    this.RequestIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: RequestId (PAYMENT_TRANS.request_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getRequestIdFetch () {
    return this.RequestIdFetch;
  }
  /** Set the SortOrder for field: RequestId (PAYMENT_TRANS.request_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRequestIdSortOrder (Integer value) {
    this.RequestIdSort = value;
  }
  /** Retrieve SortOrder for field: RequestId (PAYMENT_TRANS.request_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRequestIdSortOrder () {
    return this.RequestIdSort;
  }
  /** Set the sort direction for field: RequestId (PAYMENT_TRANS.request_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRequestIdSortDirection (boolean ascending) {
    this.RequestIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RequestId (PAYMENT_TRANS.request_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRequestIdSortDirection () {
    return this.RequestIdSortAscending;
  }
  /** Set the case insensitive for field: RequestId (PAYMENT_TRANS.request_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setRequestIdCaseInsensitive (boolean ascending) {
    this.RequestIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: RequestId (PAYMENT_TRANS.request_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getRequestIdCaseInsensitive () {
    return this.RequestIdCaseInsensitive;
  }
  /** Set the field level filters for field: RequestId (PAYMENT_TRANS.request_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRequestIdFilter (StringFilter[] value) throws ServiceException {
    this.RequestId = value;
  }
  /** Retrieve filter for field: RequestId (PAYMENT_TRANS.request_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getRequestIdFilter () {
    return this.RequestId;
  }

  /**
   * Retrieves the RequestIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RequestIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RequestIdFilter field
   */
  public String[] getRequestIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRequestIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRequestIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRequestIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RequestIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRequestIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RequestIdFilter filter value from a formatted string
   *
   * @param _value the RequestIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RequestIdFilter filter field
   */
  public void setRequestIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRequestIdFilterFromFormattedString");
    try {
      this.setRequestIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RequestIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRequestIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRequestIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EpgTransactionId (PAYMENT_TRANS.epg_transaction_id)
   * @param fetch whether to fetch this field or not
   */
  public void setEpgTransactionIdFetch (boolean fetch) {
    this.EpgTransactionIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: EpgTransactionId (PAYMENT_TRANS.epg_transaction_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getEpgTransactionIdFetch () {
    return this.EpgTransactionIdFetch;
  }
  /** Set the SortOrder for field: EpgTransactionId (PAYMENT_TRANS.epg_transaction_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEpgTransactionIdSortOrder (Integer value) {
    this.EpgTransactionIdSort = value;
  }
  /** Retrieve SortOrder for field: EpgTransactionId (PAYMENT_TRANS.epg_transaction_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEpgTransactionIdSortOrder () {
    return this.EpgTransactionIdSort;
  }
  /** Set the sort direction for field: EpgTransactionId (PAYMENT_TRANS.epg_transaction_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEpgTransactionIdSortDirection (boolean ascending) {
    this.EpgTransactionIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EpgTransactionId (PAYMENT_TRANS.epg_transaction_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEpgTransactionIdSortDirection () {
    return this.EpgTransactionIdSortAscending;
  }
  /** Set the case insensitive for field: EpgTransactionId (PAYMENT_TRANS.epg_transaction_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setEpgTransactionIdCaseInsensitive (boolean ascending) {
    this.EpgTransactionIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: EpgTransactionId (PAYMENT_TRANS.epg_transaction_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getEpgTransactionIdCaseInsensitive () {
    return this.EpgTransactionIdCaseInsensitive;
  }
  /** Set the field level filters for field: EpgTransactionId (PAYMENT_TRANS.epg_transaction_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEpgTransactionIdFilter (StringFilter[] value) throws ServiceException {
    this.EpgTransactionId = value;
  }
  /** Retrieve filter for field: EpgTransactionId (PAYMENT_TRANS.epg_transaction_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getEpgTransactionIdFilter () {
    return this.EpgTransactionId;
  }

  /**
   * Retrieves the EpgTransactionIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EpgTransactionIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EpgTransactionIdFilter field
   */
  public String[] getEpgTransactionIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEpgTransactionIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEpgTransactionIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEpgTransactionIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EpgTransactionIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEpgTransactionIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EpgTransactionIdFilter filter value from a formatted string
   *
   * @param _value the EpgTransactionIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EpgTransactionIdFilter filter field
   */
  public void setEpgTransactionIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEpgTransactionIdFilterFromFormattedString");
    try {
      this.setEpgTransactionIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EpgTransactionIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEpgTransactionIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEpgTransactionIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EpgFlag (PAYMENT_TRANS.epg_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setEpgFlagFetch (boolean fetch) {
    this.EpgFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: EpgFlag (PAYMENT_TRANS.epg_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getEpgFlagFetch () {
    return this.EpgFlagFetch;
  }
  /** Set the SortOrder for field: EpgFlag (PAYMENT_TRANS.epg_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEpgFlagSortOrder (Integer value) {
    this.EpgFlagSort = value;
  }
  /** Retrieve SortOrder for field: EpgFlag (PAYMENT_TRANS.epg_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEpgFlagSortOrder () {
    return this.EpgFlagSort;
  }
  /** Set the sort direction for field: EpgFlag (PAYMENT_TRANS.epg_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEpgFlagSortDirection (boolean ascending) {
    this.EpgFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EpgFlag (PAYMENT_TRANS.epg_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEpgFlagSortDirection () {
    return this.EpgFlagSortAscending;
  }
  /** Set the case insensitive for field: EpgFlag (PAYMENT_TRANS.epg_flag)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setEpgFlagCaseInsensitive (boolean ascending) {
    this.EpgFlagCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: EpgFlag (PAYMENT_TRANS.epg_flag)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getEpgFlagCaseInsensitive () {
    return this.EpgFlagCaseInsensitive;
  }
  /** Set the field level filters for field: EpgFlag (PAYMENT_TRANS.epg_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEpgFlagFilter (StringFilter[] value) throws ServiceException {
    this.EpgFlag = value;
  }
  /** Retrieve filter for field: EpgFlag (PAYMENT_TRANS.epg_flag)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getEpgFlagFilter () {
    return this.EpgFlag;
  }

  /**
   * Retrieves the EpgFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EpgFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EpgFlagFilter field
   */
  public String[] getEpgFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEpgFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEpgFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEpgFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EpgFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEpgFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EpgFlagFilter filter value from a formatted string
   *
   * @param _value the EpgFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EpgFlagFilter filter field
   */
  public void setEpgFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEpgFlagFilterFromFormattedString");
    try {
      this.setEpgFlagFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EpgFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEpgFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEpgFlagFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EpgMessage (PAYMENT_TRANS.epg_message)
   * @param fetch whether to fetch this field or not
   */
  public void setEpgMessageFetch (boolean fetch) {
    this.EpgMessageFetch = fetch;
  }
  /** Retrieve Fetch value for field: EpgMessage (PAYMENT_TRANS.epg_message)
   * @return boolean the Fetch value for this field
   */
  public boolean getEpgMessageFetch () {
    return this.EpgMessageFetch;
  }
  /** Set the SortOrder for field: EpgMessage (PAYMENT_TRANS.epg_message)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEpgMessageSortOrder (Integer value) {
    this.EpgMessageSort = value;
  }
  /** Retrieve SortOrder for field: EpgMessage (PAYMENT_TRANS.epg_message)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEpgMessageSortOrder () {
    return this.EpgMessageSort;
  }
  /** Set the sort direction for field: EpgMessage (PAYMENT_TRANS.epg_message)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEpgMessageSortDirection (boolean ascending) {
    this.EpgMessageSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EpgMessage (PAYMENT_TRANS.epg_message)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEpgMessageSortDirection () {
    return this.EpgMessageSortAscending;
  }
  /** Set the case insensitive for field: EpgMessage (PAYMENT_TRANS.epg_message)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setEpgMessageCaseInsensitive (boolean ascending) {
    this.EpgMessageCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: EpgMessage (PAYMENT_TRANS.epg_message)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getEpgMessageCaseInsensitive () {
    return this.EpgMessageCaseInsensitive;
  }
  /** Set the field level filters for field: EpgMessage (PAYMENT_TRANS.epg_message)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEpgMessageFilter (StringFilter[] value) throws ServiceException {
    this.EpgMessage = value;
  }
  /** Retrieve filter for field: EpgMessage (PAYMENT_TRANS.epg_message)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getEpgMessageFilter () {
    return this.EpgMessage;
  }

  /**
   * Retrieves the EpgMessageFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EpgMessageFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EpgMessageFilter field
   */
  public String[] getEpgMessageFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEpgMessageFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEpgMessageFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEpgMessageFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EpgMessageFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEpgMessageFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EpgMessageFilter filter value from a formatted string
   *
   * @param _value the EpgMessageFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EpgMessageFilter filter field
   */
  public void setEpgMessageFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEpgMessageFilterFromFormattedString");
    try {
      this.setEpgMessageFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EpgMessageFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEpgMessageFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEpgMessageFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EftDebitProcTransId (PAYMENT_TRANS.eft_debit_proc_trans_id)
   * @param fetch whether to fetch this field or not
   */
  public void setEftDebitProcTransIdFetch (boolean fetch) {
    this.EftDebitProcTransIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: EftDebitProcTransId (PAYMENT_TRANS.eft_debit_proc_trans_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getEftDebitProcTransIdFetch () {
    return this.EftDebitProcTransIdFetch;
  }
  /** Set the SortOrder for field: EftDebitProcTransId (PAYMENT_TRANS.eft_debit_proc_trans_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEftDebitProcTransIdSortOrder (Integer value) {
    this.EftDebitProcTransIdSort = value;
  }
  /** Retrieve SortOrder for field: EftDebitProcTransId (PAYMENT_TRANS.eft_debit_proc_trans_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEftDebitProcTransIdSortOrder () {
    return this.EftDebitProcTransIdSort;
  }
  /** Set the sort direction for field: EftDebitProcTransId (PAYMENT_TRANS.eft_debit_proc_trans_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEftDebitProcTransIdSortDirection (boolean ascending) {
    this.EftDebitProcTransIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EftDebitProcTransId (PAYMENT_TRANS.eft_debit_proc_trans_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEftDebitProcTransIdSortDirection () {
    return this.EftDebitProcTransIdSortAscending;
  }
  /** Set the case insensitive for field: EftDebitProcTransId (PAYMENT_TRANS.eft_debit_proc_trans_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setEftDebitProcTransIdCaseInsensitive (boolean ascending) {
    this.EftDebitProcTransIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: EftDebitProcTransId (PAYMENT_TRANS.eft_debit_proc_trans_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getEftDebitProcTransIdCaseInsensitive () {
    return this.EftDebitProcTransIdCaseInsensitive;
  }
  /** Set the field level filters for field: EftDebitProcTransId (PAYMENT_TRANS.eft_debit_proc_trans_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEftDebitProcTransIdFilter (StringFilter[] value) throws ServiceException {
    this.EftDebitProcTransId = value;
  }
  /** Retrieve filter for field: EftDebitProcTransId (PAYMENT_TRANS.eft_debit_proc_trans_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getEftDebitProcTransIdFilter () {
    return this.EftDebitProcTransId;
  }

  /**
   * Retrieves the EftDebitProcTransIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EftDebitProcTransIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EftDebitProcTransIdFilter field
   */
  public String[] getEftDebitProcTransIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEftDebitProcTransIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEftDebitProcTransIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEftDebitProcTransIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EftDebitProcTransIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEftDebitProcTransIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EftDebitProcTransIdFilter filter value from a formatted string
   *
   * @param _value the EftDebitProcTransIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EftDebitProcTransIdFilter filter field
   */
  public void setEftDebitProcTransIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEftDebitProcTransIdFilterFromFormattedString");
    try {
      this.setEftDebitProcTransIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EftDebitProcTransIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEftDebitProcTransIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEftDebitProcTransIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PayMethod (PAYMENT_TRANS.pay_method)
   * @param fetch whether to fetch this field or not
   */
  public void setPayMethodFetch (boolean fetch) {
    this.PayMethodFetch = fetch;
  }
  /** Retrieve Fetch value for field: PayMethod (PAYMENT_TRANS.pay_method)
   * @return boolean the Fetch value for this field
   */
  public boolean getPayMethodFetch () {
    return this.PayMethodFetch;
  }
  /** Set the SortOrder for field: PayMethod (PAYMENT_TRANS.pay_method)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPayMethodSortOrder (Integer value) {
    this.PayMethodSort = value;
  }
  /** Retrieve SortOrder for field: PayMethod (PAYMENT_TRANS.pay_method)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPayMethodSortOrder () {
    return this.PayMethodSort;
  }
  /** Set the sort direction for field: PayMethod (PAYMENT_TRANS.pay_method)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPayMethodSortDirection (boolean ascending) {
    this.PayMethodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PayMethod (PAYMENT_TRANS.pay_method)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPayMethodSortDirection () {
    return this.PayMethodSortAscending;
  }
  /** Set the field level filters for field: PayMethod (PAYMENT_TRANS.pay_method)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPayMethodFilter (IntegerFilter[] value) throws ServiceException {
    this.PayMethod = value;
  }
  /** Retrieve filter for field: PayMethod (PAYMENT_TRANS.pay_method)
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


  /** Set the field level Fetch value for field: IsRealtime (PAYMENT_TRANS.is_realtime)
   * @param fetch whether to fetch this field or not
   */
  public void setIsRealtimeFetch (boolean fetch) {
    this.IsRealtimeFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsRealtime (PAYMENT_TRANS.is_realtime)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsRealtimeFetch () {
    return this.IsRealtimeFetch;
  }
  /** Set the SortOrder for field: IsRealtime (PAYMENT_TRANS.is_realtime)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsRealtimeSortOrder (Integer value) {
    this.IsRealtimeSort = value;
  }
  /** Retrieve SortOrder for field: IsRealtime (PAYMENT_TRANS.is_realtime)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsRealtimeSortOrder () {
    return this.IsRealtimeSort;
  }
  /** Set the sort direction for field: IsRealtime (PAYMENT_TRANS.is_realtime)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsRealtimeSortDirection (boolean ascending) {
    this.IsRealtimeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsRealtime (PAYMENT_TRANS.is_realtime)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsRealtimeSortDirection () {
    return this.IsRealtimeSortAscending;
  }
  /** Set the field level filters for field: IsRealtime (PAYMENT_TRANS.is_realtime)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsRealtimeFilter (BooleanFilter[] value) throws ServiceException {
    this.IsRealtime = value;
  }
  /** Retrieve filter for field: IsRealtime (PAYMENT_TRANS.is_realtime)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsRealtimeFilter () {
    return this.IsRealtime;
  }

  /**
   * Retrieves the IsRealtimeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsRealtimeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsRealtimeFilter field
   */
  public String[] getIsRealtimeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsRealtimeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsRealtimeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsRealtimeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsRealtimeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsRealtimeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsRealtimeFilter filter value from a formatted string
   *
   * @param _value the IsRealtimeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsRealtimeFilter filter field
   */
  public void setIsRealtimeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsRealtimeFilterFromFormattedString");
    try {
      this.setIsRealtimeFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsRealtimeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsRealtimeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsRealtimeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransDate (PAYMENT_TRANS.trans_date)
   * @param fetch whether to fetch this field or not
   */
  public void setTransDateFetch (boolean fetch) {
    this.TransDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransDate (PAYMENT_TRANS.trans_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransDateFetch () {
    return this.TransDateFetch;
  }
  /** Set the SortOrder for field: TransDate (PAYMENT_TRANS.trans_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransDateSortOrder (Integer value) {
    this.TransDateSort = value;
  }
  /** Retrieve SortOrder for field: TransDate (PAYMENT_TRANS.trans_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransDateSortOrder () {
    return this.TransDateSort;
  }
  /** Set the sort direction for field: TransDate (PAYMENT_TRANS.trans_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransDateSortDirection (boolean ascending) {
    this.TransDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransDate (PAYMENT_TRANS.trans_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransDateSortDirection () {
    return this.TransDateSortAscending;
  }
  /** Set the field level filters for field: TransDate (PAYMENT_TRANS.trans_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransDateFilter (DateFilter[] value) throws ServiceException {
    this.TransDate = value;
  }
  /** Retrieve filter for field: TransDate (PAYMENT_TRANS.trans_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getTransDateFilter () {
    return this.TransDate;
  }

  /**
   * Retrieves the TransDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDateFilter field
   */
  public String[] getTransDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransDateFilter filter value from a formatted string
   *
   * @param _value the TransDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransDateFilter filter field
   */
  public void setTransDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDateFilterFromFormattedString");
    try {
      this.setTransDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDateFilterFromFormattedString");
  }

  /**
   * Retrieves the TransDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDateFilter field
   */
  public String[] getTransDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TransDateFilter filter value from a formatted string
   *
   * @param _value the TransDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransDateFilter filter field
   */
  public void setTransDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDateFilterFromFormattedDateTimeString");
    try {
      this.setTransDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: Annotation (PAYMENT_TRANS.annotation)
   * @param fetch whether to fetch this field or not
   */
  public void setAnnotationFetch (boolean fetch) {
    this.AnnotationFetch = fetch;
  }
  /** Retrieve Fetch value for field: Annotation (PAYMENT_TRANS.annotation)
   * @return boolean the Fetch value for this field
   */
  public boolean getAnnotationFetch () {
    return this.AnnotationFetch;
  }
  /** Set the SortOrder for field: Annotation (PAYMENT_TRANS.annotation)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAnnotationSortOrder (Integer value) {
    this.AnnotationSort = value;
  }
  /** Retrieve SortOrder for field: Annotation (PAYMENT_TRANS.annotation)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAnnotationSortOrder () {
    return this.AnnotationSort;
  }
  /** Set the sort direction for field: Annotation (PAYMENT_TRANS.annotation)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAnnotationSortDirection (boolean ascending) {
    this.AnnotationSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Annotation (PAYMENT_TRANS.annotation)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAnnotationSortDirection () {
    return this.AnnotationSortAscending;
  }
  /** Set the case insensitive for field: Annotation (PAYMENT_TRANS.annotation)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAnnotationCaseInsensitive (boolean ascending) {
    this.AnnotationCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Annotation (PAYMENT_TRANS.annotation)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAnnotationCaseInsensitive () {
    return this.AnnotationCaseInsensitive;
  }
  /** Set the field level filters for field: Annotation (PAYMENT_TRANS.annotation)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAnnotationFilter (StringFilter[] value) throws ServiceException {
    this.Annotation = value;
  }
  /** Retrieve filter for field: Annotation (PAYMENT_TRANS.annotation)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAnnotationFilter () {
    return this.Annotation;
  }

  /**
   * Retrieves the AnnotationFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AnnotationFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AnnotationFilter field
   */
  public String[] getAnnotationFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAnnotationFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAnnotationFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAnnotationFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AnnotationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAnnotationFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AnnotationFilter filter value from a formatted string
   *
   * @param _value the AnnotationFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AnnotationFilter filter field
   */
  public void setAnnotationFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAnnotationFilterFromFormattedString");
    try {
      this.setAnnotationFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AnnotationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAnnotationFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAnnotationFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DesignatedTaxAmount (PAYMENT_TRANS.designated_tax_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setDesignatedTaxAmountFetch (boolean fetch) {
    this.DesignatedTaxAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: DesignatedTaxAmount (PAYMENT_TRANS.designated_tax_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getDesignatedTaxAmountFetch () {
    return this.DesignatedTaxAmountFetch;
  }
  /** Set the SortOrder for field: DesignatedTaxAmount (PAYMENT_TRANS.designated_tax_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDesignatedTaxAmountSortOrder (Integer value) {
    this.DesignatedTaxAmountSort = value;
  }
  /** Retrieve SortOrder for field: DesignatedTaxAmount (PAYMENT_TRANS.designated_tax_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDesignatedTaxAmountSortOrder () {
    return this.DesignatedTaxAmountSort;
  }
  /** Set the sort direction for field: DesignatedTaxAmount (PAYMENT_TRANS.designated_tax_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDesignatedTaxAmountSortDirection (boolean ascending) {
    this.DesignatedTaxAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DesignatedTaxAmount (PAYMENT_TRANS.designated_tax_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDesignatedTaxAmountSortDirection () {
    return this.DesignatedTaxAmountSortAscending;
  }
  /** Set the field level filters for field: DesignatedTaxAmount (PAYMENT_TRANS.designated_tax_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDesignatedTaxAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.DesignatedTaxAmount = value;
  }
  /** Retrieve filter for field: DesignatedTaxAmount (PAYMENT_TRANS.designated_tax_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getDesignatedTaxAmountFilter () {
    return this.DesignatedTaxAmount;
  }

  /**
   * Retrieves the DesignatedTaxAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DesignatedTaxAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DesignatedTaxAmountFilter field
   */
  public String[] getDesignatedTaxAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDesignatedTaxAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDesignatedTaxAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDesignatedTaxAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DesignatedTaxAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDesignatedTaxAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DesignatedTaxAmountFilter filter value from a formatted string
   *
   * @param _value the DesignatedTaxAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DesignatedTaxAmountFilter filter field
   */
  public void setDesignatedTaxAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDesignatedTaxAmountFilterFromFormattedString");
    try {
      this.setDesignatedTaxAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DesignatedTaxAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDesignatedTaxAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDesignatedTaxAmountFilterFromFormattedString");
  }

  /**
   * Sets the DesignatedTaxAmountFilter filter value from a formatted string
   *
   * @param _value the DesignatedTaxAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DesignatedTaxAmountFilter filter field
   */
  public void setDesignatedTaxAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDesignatedTaxAmountFilterFromFormattedCurrencyString");
    try {
      this.setDesignatedTaxAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DesignatedTaxAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDesignatedTaxAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDesignatedTaxAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the DesignatedTaxAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DesignatedTaxAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the DesignatedTaxAmountFilter field
   */

  public String[] getDesignatedTaxAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDesignatedTaxAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDesignatedTaxAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDesignatedTaxAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DesignatedTaxAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDesignatedTaxAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: TaxPoint (PAYMENT_TRANS.tax_point)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxPointFetch (boolean fetch) {
    this.TaxPointFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxPoint (PAYMENT_TRANS.tax_point)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxPointFetch () {
    return this.TaxPointFetch;
  }
  /** Set the SortOrder for field: TaxPoint (PAYMENT_TRANS.tax_point)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxPointSortOrder (Integer value) {
    this.TaxPointSort = value;
  }
  /** Retrieve SortOrder for field: TaxPoint (PAYMENT_TRANS.tax_point)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxPointSortOrder () {
    return this.TaxPointSort;
  }
  /** Set the sort direction for field: TaxPoint (PAYMENT_TRANS.tax_point)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxPointSortDirection (boolean ascending) {
    this.TaxPointSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxPoint (PAYMENT_TRANS.tax_point)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxPointSortDirection () {
    return this.TaxPointSortAscending;
  }
  /** Set the field level filters for field: TaxPoint (PAYMENT_TRANS.tax_point)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxPointFilter (DateFilter[] value) throws ServiceException {
    this.TaxPoint = value;
  }
  /** Retrieve filter for field: TaxPoint (PAYMENT_TRANS.tax_point)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getTaxPointFilter () {
    return this.TaxPoint;
  }

  /**
   * Retrieves the TaxPointFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxPointFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxPointFilter field
   */
  public String[] getTaxPointFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPointFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxPointFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPointFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxPointFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxPointFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxPointFilter filter value from a formatted string
   *
   * @param _value the TaxPointFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxPointFilter filter field
   */
  public void setTaxPointFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxPointFilterFromFormattedString");
    try {
      this.setTaxPointFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxPointFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxPointFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxPointFilterFromFormattedString");
  }

  /**
   * Retrieves the TaxPointFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxPointFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxPointFilter field
   */
  public String[] getTaxPointFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPointFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxPointFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPointFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxPointFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxPointFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TaxPointFilter filter value from a formatted string
   *
   * @param _value the TaxPointFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxPointFilter filter field
   */
  public void setTaxPointFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxPointFilterFromFormattedDateTimeString");
    try {
      this.setTaxPointFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxPointFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxPointFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxPointFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: TaxRate (PAYMENT_TRANS.tax_rate)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxRateFetch (boolean fetch) {
    this.TaxRateFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxRate (PAYMENT_TRANS.tax_rate)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxRateFetch () {
    return this.TaxRateFetch;
  }
  /** Set the SortOrder for field: TaxRate (PAYMENT_TRANS.tax_rate)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxRateSortOrder (Integer value) {
    this.TaxRateSort = value;
  }
  /** Retrieve SortOrder for field: TaxRate (PAYMENT_TRANS.tax_rate)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxRateSortOrder () {
    return this.TaxRateSort;
  }
  /** Set the sort direction for field: TaxRate (PAYMENT_TRANS.tax_rate)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxRateSortDirection (boolean ascending) {
    this.TaxRateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxRate (PAYMENT_TRANS.tax_rate)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxRateSortDirection () {
    return this.TaxRateSortAscending;
  }
  /** Set the field level filters for field: TaxRate (PAYMENT_TRANS.tax_rate)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxRateFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxRate = value;
  }
  /** Retrieve filter for field: TaxRate (PAYMENT_TRANS.tax_rate)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxRateFilter () {
    return this.TaxRate;
  }

  /**
   * Retrieves the TaxRateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxRateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxRateFilter field
   */
  public String[] getTaxRateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxRateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxRateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxRateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxRateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxRateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxRateFilter filter value from a formatted string
   *
   * @param _value the TaxRateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxRateFilter filter field
   */
  public void setTaxRateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxRateFilterFromFormattedString");
    try {
      this.setTaxRateFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxRateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxRateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxRateFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ImpliedDecimal (PAYMENT_TRANS.implied_decimal)
   * @param fetch whether to fetch this field or not
   */
  public void setImpliedDecimalFetch (boolean fetch) {
    this.ImpliedDecimalFetch = fetch;
  }
  /** Retrieve Fetch value for field: ImpliedDecimal (PAYMENT_TRANS.implied_decimal)
   * @return boolean the Fetch value for this field
   */
  public boolean getImpliedDecimalFetch () {
    return this.ImpliedDecimalFetch;
  }
  /** Set the SortOrder for field: ImpliedDecimal (PAYMENT_TRANS.implied_decimal)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setImpliedDecimalSortOrder (Integer value) {
    this.ImpliedDecimalSort = value;
  }
  /** Retrieve SortOrder for field: ImpliedDecimal (PAYMENT_TRANS.implied_decimal)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getImpliedDecimalSortOrder () {
    return this.ImpliedDecimalSort;
  }
  /** Set the sort direction for field: ImpliedDecimal (PAYMENT_TRANS.implied_decimal)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setImpliedDecimalSortDirection (boolean ascending) {
    this.ImpliedDecimalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ImpliedDecimal (PAYMENT_TRANS.implied_decimal)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getImpliedDecimalSortDirection () {
    return this.ImpliedDecimalSortAscending;
  }
  /** Set the field level filters for field: ImpliedDecimal (PAYMENT_TRANS.implied_decimal)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setImpliedDecimalFilter (IntegerFilter[] value) throws ServiceException {
    this.ImpliedDecimal = value;
  }
  /** Retrieve filter for field: ImpliedDecimal (PAYMENT_TRANS.implied_decimal)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getImpliedDecimalFilter () {
    return this.ImpliedDecimal;
  }

  /**
   * Retrieves the ImpliedDecimalFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ImpliedDecimalFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ImpliedDecimalFilter field
   */
  public String[] getImpliedDecimalFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getImpliedDecimalFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getImpliedDecimalFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getImpliedDecimalFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ImpliedDecimalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getImpliedDecimalFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ImpliedDecimalFilter filter value from a formatted string
   *
   * @param _value the ImpliedDecimalFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ImpliedDecimalFilter filter field
   */
  public void setImpliedDecimalFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setImpliedDecimalFilterFromFormattedString");
    try {
      this.setImpliedDecimalFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ImpliedDecimalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setImpliedDecimalFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setImpliedDecimalFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TaxPkgInstId (PAYMENT_TRANS.tax_pkg_inst_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxPkgInstIdFetch (boolean fetch) {
    this.TaxPkgInstIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxPkgInstId (PAYMENT_TRANS.tax_pkg_inst_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxPkgInstIdFetch () {
    return this.TaxPkgInstIdFetch;
  }
  /** Set the SortOrder for field: TaxPkgInstId (PAYMENT_TRANS.tax_pkg_inst_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxPkgInstIdSortOrder (Integer value) {
    this.TaxPkgInstIdSort = value;
  }
  /** Retrieve SortOrder for field: TaxPkgInstId (PAYMENT_TRANS.tax_pkg_inst_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxPkgInstIdSortOrder () {
    return this.TaxPkgInstIdSort;
  }
  /** Set the sort direction for field: TaxPkgInstId (PAYMENT_TRANS.tax_pkg_inst_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxPkgInstIdSortDirection (boolean ascending) {
    this.TaxPkgInstIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxPkgInstId (PAYMENT_TRANS.tax_pkg_inst_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxPkgInstIdSortDirection () {
    return this.TaxPkgInstIdSortAscending;
  }
  /** Set the field level filters for field: TaxPkgInstId (PAYMENT_TRANS.tax_pkg_inst_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxPkgInstIdFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxPkgInstId = value;
  }
  /** Retrieve filter for field: TaxPkgInstId (PAYMENT_TRANS.tax_pkg_inst_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxPkgInstIdFilter () {
    return this.TaxPkgInstId;
  }

  /**
   * Retrieves the TaxPkgInstIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxPkgInstIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxPkgInstIdFilter field
   */
  public String[] getTaxPkgInstIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgInstIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxPkgInstIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPkgInstIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxPkgInstIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxPkgInstIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxPkgInstIdFilter filter value from a formatted string
   *
   * @param _value the TaxPkgInstIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxPkgInstIdFilter filter field
   */
  public void setTaxPkgInstIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxPkgInstIdFilterFromFormattedString");
    try {
      this.setTaxPkgInstIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxPkgInstIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxPkgInstIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxPkgInstIdFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated TaxPkgInstIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the TaxPkgInstIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the TaxPkgInstIdFilter filter field
   */
  public String[] getTaxPkgInstIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgInstIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getTaxPkgInstIdFilter(), "TaxPackageInst", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPkgInstIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxPkgInstIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxPkgInstIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated TaxPkgInstIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxPkgInstIdFilter filter field
   */
  public void setTaxPkgInstIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxPkgInstIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setTaxPkgInstIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "TaxPkgInstId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxPkgInstIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxPkgInstIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxPkgInstIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: TaxTypeCode (PAYMENT_TRANS.tax_type_code)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxTypeCodeFetch (boolean fetch) {
    this.TaxTypeCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxTypeCode (PAYMENT_TRANS.tax_type_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxTypeCodeFetch () {
    return this.TaxTypeCodeFetch;
  }
  /** Set the SortOrder for field: TaxTypeCode (PAYMENT_TRANS.tax_type_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxTypeCodeSortOrder (Integer value) {
    this.TaxTypeCodeSort = value;
  }
  /** Retrieve SortOrder for field: TaxTypeCode (PAYMENT_TRANS.tax_type_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxTypeCodeSortOrder () {
    return this.TaxTypeCodeSort;
  }
  /** Set the sort direction for field: TaxTypeCode (PAYMENT_TRANS.tax_type_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxTypeCodeSortDirection (boolean ascending) {
    this.TaxTypeCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxTypeCode (PAYMENT_TRANS.tax_type_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxTypeCodeSortDirection () {
    return this.TaxTypeCodeSortAscending;
  }
  /** Set the field level filters for field: TaxTypeCode (PAYMENT_TRANS.tax_type_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxTypeCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxTypeCode = value;
  }
  /** Retrieve filter for field: TaxTypeCode (PAYMENT_TRANS.tax_type_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxTypeCodeFilter () {
    return this.TaxTypeCode;
  }

  /**
   * Retrieves the TaxTypeCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxTypeCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxTypeCodeFilter field
   */
  public String[] getTaxTypeCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTypeCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxTypeCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxTypeCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxTypeCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxTypeCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxTypeCodeFilter filter value from a formatted string
   *
   * @param _value the TaxTypeCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxTypeCodeFilter filter field
   */
  public void setTaxTypeCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxTypeCodeFilterFromFormattedString");
    try {
      this.setTaxTypeCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxTypeCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxTypeCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxTypeCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OneoffCardnum (PAYMENT_TRANS.oneoff_cardnum)
   * @param fetch whether to fetch this field or not
   */
  public void setOneoffCardnumFetch (boolean fetch) {
    this.OneoffCardnumFetch = fetch;
  }
  /** Retrieve Fetch value for field: OneoffCardnum (PAYMENT_TRANS.oneoff_cardnum)
   * @return boolean the Fetch value for this field
   */
  public boolean getOneoffCardnumFetch () {
    return this.OneoffCardnumFetch;
  }
  /** Set the SortOrder for field: OneoffCardnum (PAYMENT_TRANS.oneoff_cardnum)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOneoffCardnumSortOrder (Integer value) {
    this.OneoffCardnumSort = value;
  }
  /** Retrieve SortOrder for field: OneoffCardnum (PAYMENT_TRANS.oneoff_cardnum)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOneoffCardnumSortOrder () {
    return this.OneoffCardnumSort;
  }
  /** Set the sort direction for field: OneoffCardnum (PAYMENT_TRANS.oneoff_cardnum)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOneoffCardnumSortDirection (boolean ascending) {
    this.OneoffCardnumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OneoffCardnum (PAYMENT_TRANS.oneoff_cardnum)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOneoffCardnumSortDirection () {
    return this.OneoffCardnumSortAscending;
  }
  /** Set the case insensitive for field: OneoffCardnum (PAYMENT_TRANS.oneoff_cardnum)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setOneoffCardnumCaseInsensitive (boolean ascending) {
    this.OneoffCardnumCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: OneoffCardnum (PAYMENT_TRANS.oneoff_cardnum)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getOneoffCardnumCaseInsensitive () {
    return this.OneoffCardnumCaseInsensitive;
  }
  /** Set the field level filters for field: OneoffCardnum (PAYMENT_TRANS.oneoff_cardnum)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOneoffCardnumFilter (StringFilter[] value) throws ServiceException {
    this.OneoffCardnum = value;
  }
  /** Retrieve filter for field: OneoffCardnum (PAYMENT_TRANS.oneoff_cardnum)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getOneoffCardnumFilter () {
    return this.OneoffCardnum;
  }

  /**
   * Retrieves the OneoffCardnumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OneoffCardnumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OneoffCardnumFilter field
   */
  public String[] getOneoffCardnumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOneoffCardnumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOneoffCardnumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOneoffCardnumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OneoffCardnumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOneoffCardnumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OneoffCardnumFilter filter value from a formatted string
   *
   * @param _value the OneoffCardnumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OneoffCardnumFilter filter field
   */
  public void setOneoffCardnumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOneoffCardnumFilterFromFormattedString");
    try {
      this.setOneoffCardnumFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OneoffCardnumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOneoffCardnumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOneoffCardnumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DcardValStatus (PAYMENT_TRANS.dcard_val_status)
   * @param fetch whether to fetch this field or not
   */
  public void setDcardValStatusFetch (boolean fetch) {
    this.DcardValStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: DcardValStatus (PAYMENT_TRANS.dcard_val_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getDcardValStatusFetch () {
    return this.DcardValStatusFetch;
  }
  /** Set the SortOrder for field: DcardValStatus (PAYMENT_TRANS.dcard_val_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDcardValStatusSortOrder (Integer value) {
    this.DcardValStatusSort = value;
  }
  /** Retrieve SortOrder for field: DcardValStatus (PAYMENT_TRANS.dcard_val_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDcardValStatusSortOrder () {
    return this.DcardValStatusSort;
  }
  /** Set the sort direction for field: DcardValStatus (PAYMENT_TRANS.dcard_val_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDcardValStatusSortDirection (boolean ascending) {
    this.DcardValStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DcardValStatus (PAYMENT_TRANS.dcard_val_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDcardValStatusSortDirection () {
    return this.DcardValStatusSortAscending;
  }
  /** Set the field level filters for field: DcardValStatus (PAYMENT_TRANS.dcard_val_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDcardValStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.DcardValStatus = value;
  }
  /** Retrieve filter for field: DcardValStatus (PAYMENT_TRANS.dcard_val_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDcardValStatusFilter () {
    return this.DcardValStatus;
  }

  /**
   * Retrieves the DcardValStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DcardValStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DcardValStatusFilter field
   */
  public String[] getDcardValStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDcardValStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDcardValStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDcardValStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DcardValStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDcardValStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DcardValStatusFilter filter value from a formatted string
   *
   * @param _value the DcardValStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DcardValStatusFilter filter field
   */
  public void setDcardValStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDcardValStatusFilterFromFormattedString");
    try {
      this.setDcardValStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DcardValStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDcardValStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDcardValStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PaymentMerchantId (PAYMENT_TRANS.payment_merchant_id)
   * @param fetch whether to fetch this field or not
   */
  public void setPaymentMerchantIdFetch (boolean fetch) {
    this.PaymentMerchantIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PaymentMerchantId (PAYMENT_TRANS.payment_merchant_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getPaymentMerchantIdFetch () {
    return this.PaymentMerchantIdFetch;
  }
  /** Set the SortOrder for field: PaymentMerchantId (PAYMENT_TRANS.payment_merchant_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPaymentMerchantIdSortOrder (Integer value) {
    this.PaymentMerchantIdSort = value;
  }
  /** Retrieve SortOrder for field: PaymentMerchantId (PAYMENT_TRANS.payment_merchant_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPaymentMerchantIdSortOrder () {
    return this.PaymentMerchantIdSort;
  }
  /** Set the sort direction for field: PaymentMerchantId (PAYMENT_TRANS.payment_merchant_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPaymentMerchantIdSortDirection (boolean ascending) {
    this.PaymentMerchantIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PaymentMerchantId (PAYMENT_TRANS.payment_merchant_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPaymentMerchantIdSortDirection () {
    return this.PaymentMerchantIdSortAscending;
  }
  /** Set the field level filters for field: PaymentMerchantId (PAYMENT_TRANS.payment_merchant_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPaymentMerchantIdFilter (IntegerFilter[] value) throws ServiceException {
    this.PaymentMerchantId = value;
  }
  /** Retrieve filter for field: PaymentMerchantId (PAYMENT_TRANS.payment_merchant_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPaymentMerchantIdFilter () {
    return this.PaymentMerchantId;
  }

  /**
   * Retrieves the PaymentMerchantIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PaymentMerchantIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentMerchantIdFilter field
   */
  public String[] getPaymentMerchantIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentMerchantIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPaymentMerchantIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentMerchantIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentMerchantIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentMerchantIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PaymentMerchantIdFilter filter value from a formatted string
   *
   * @param _value the PaymentMerchantIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PaymentMerchantIdFilter filter field
   */
  public void setPaymentMerchantIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPaymentMerchantIdFilterFromFormattedString");
    try {
      this.setPaymentMerchantIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentMerchantIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentMerchantIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPaymentMerchantIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransactionUuid (PAYMENT_TRANS.transaction_uuid)
   * @param fetch whether to fetch this field or not
   */
  public void setTransactionUuidFetch (boolean fetch) {
    this.TransactionUuidFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransactionUuid (PAYMENT_TRANS.transaction_uuid)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransactionUuidFetch () {
    return this.TransactionUuidFetch;
  }
  /** Set the SortOrder for field: TransactionUuid (PAYMENT_TRANS.transaction_uuid)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransactionUuidSortOrder (Integer value) {
    this.TransactionUuidSort = value;
  }
  /** Retrieve SortOrder for field: TransactionUuid (PAYMENT_TRANS.transaction_uuid)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransactionUuidSortOrder () {
    return this.TransactionUuidSort;
  }
  /** Set the sort direction for field: TransactionUuid (PAYMENT_TRANS.transaction_uuid)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransactionUuidSortDirection (boolean ascending) {
    this.TransactionUuidSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransactionUuid (PAYMENT_TRANS.transaction_uuid)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransactionUuidSortDirection () {
    return this.TransactionUuidSortAscending;
  }
  /** Set the case insensitive for field: TransactionUuid (PAYMENT_TRANS.transaction_uuid)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setTransactionUuidCaseInsensitive (boolean ascending) {
    this.TransactionUuidCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: TransactionUuid (PAYMENT_TRANS.transaction_uuid)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getTransactionUuidCaseInsensitive () {
    return this.TransactionUuidCaseInsensitive;
  }
  /** Set the field level filters for field: TransactionUuid (PAYMENT_TRANS.transaction_uuid)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransactionUuidFilter (StringFilter[] value) throws ServiceException {
    this.TransactionUuid = value;
  }
  /** Retrieve filter for field: TransactionUuid (PAYMENT_TRANS.transaction_uuid)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getTransactionUuidFilter () {
    return this.TransactionUuid;
  }

  /**
   * Retrieves the TransactionUuidFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransactionUuidFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransactionUuidFilter field
   */
  public String[] getTransactionUuidFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransactionUuidFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransactionUuidFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransactionUuidFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransactionUuidFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransactionUuidFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransactionUuidFilter filter value from a formatted string
   *
   * @param _value the TransactionUuidFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransactionUuidFilter filter field
   */
  public void setTransactionUuidFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransactionUuidFilterFromFormattedString");
    try {
      this.setTransactionUuidFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransactionUuidFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransactionUuidFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransactionUuidFilterFromFormattedString");
  }

  public String toString() {
    return AxrtPaymentObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AxrtPaymentObjectHelper.toMap(this, null);
  }
}
