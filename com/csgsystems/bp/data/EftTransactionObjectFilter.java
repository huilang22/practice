/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EftTransactionObjectFilter.java
 * Definition File: Customer/EftTransaction.xml
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


import com.csgsystems.api.base.BaseFilter;


import com.csgsystems.bali.BaliObjectFilter;

/** Filter object */
public class EftTransactionObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public EftTransactionObjectKeyFilter Key = null;
  /** raw field for: PAYMENT_PROFILE.bank_agency_name) */
  public    StringFilter[] BankAgencyName  = null;
  protected boolean BankAgencyNameFetch = false;
  protected boolean BankAgencyNameSortAscending = true;
  protected boolean BankAgencyNameCaseInsensitive = false;
  protected Integer BankAgencyNameSort = null;
  /** raw field for: PAYMENT_PROFILE.bank_agency_code) */
  public    StringFilter[] BankAgencyCode  = null;
  protected boolean BankAgencyCodeFetch = false;
  protected boolean BankAgencyCodeSortAscending = true;
  protected boolean BankAgencyCodeCaseInsensitive = false;
  protected Integer BankAgencyCodeSort = null;
  /** raw field for: PAYMENT_PROFILE.cust_bank_sort_code) */
  public    StringFilter[] CustBankSortCode  = null;
  protected boolean CustBankSortCodeFetch = false;
  protected boolean CustBankSortCodeSortAscending = true;
  protected boolean CustBankSortCodeCaseInsensitive = false;
  protected Integer CustBankSortCodeSort = null;
  /** raw field for: PAYMENT_PROFILE.cust_bank_acc_num) */
  public    StringFilter[] CustBankAccNum  = null;
  protected boolean CustBankAccNumFetch = false;
  protected boolean CustBankAccNumSortAscending = true;
  protected boolean CustBankAccNumCaseInsensitive = false;
  protected Integer CustBankAccNumSort = null;
  /** raw field for: PAYMENT_PROFILE.ownr_lname) */
  public    StringFilter[] OwnrLname  = null;
  protected boolean OwnrLnameFetch = false;
  protected boolean OwnrLnameSortAscending = true;
  protected boolean OwnrLnameCaseInsensitive = false;
  protected Integer OwnrLnameSort = null;
  /** raw field for: PAYMENT_PROFILE.ownr_fname) */
  public    StringFilter[] OwnrFname  = null;
  protected boolean OwnrFnameFetch = false;
  protected boolean OwnrFnameSortAscending = true;
  protected boolean OwnrFnameCaseInsensitive = false;
  protected Integer OwnrFnameSort = null;
  /** raw field for: PAYMENT_PROFILE.mandate_id) */
  public    StringFilter[] MandateId  = null;
  protected boolean MandateIdFetch = false;
  protected boolean MandateIdSortAscending = true;
  protected boolean MandateIdCaseInsensitive = false;
  protected Integer MandateIdSort = null;
  /** raw field for: PAYMENT_PROFILE.mandate_sign_date) */
  public    DateFilter[] MandateSignDate  = null;
  protected boolean MandateSignDateFetch = false;
  protected boolean MandateSignDateSortAscending = true;
  protected Integer MandateSignDateSort = null;
  /** raw field for: PAYMENT_PROFILE.mandate_status) */
  public    StringFilter[] MandateStatus  = null;
  protected boolean MandateStatusFetch = false;
  protected boolean MandateStatusSortAscending = true;
  protected boolean MandateStatusCaseInsensitive = false;
  protected Integer MandateStatusSort = null;
  /** raw field for: PAYMENT_PROFILE.cust_bank_iban) */
  public    StringFilter[] CustBankIban  = null;
  protected boolean CustBankIbanFetch = false;
  protected boolean CustBankIbanSortAscending = true;
  protected boolean CustBankIbanCaseInsensitive = false;
  protected Integer CustBankIbanSort = null;
  /** raw field for: PAYMENT_PROFILE.cust_bank_bic) */
  public    StringFilter[] CustBankBic  = null;
  protected boolean CustBankBicFetch = false;
  protected boolean CustBankBicSortAscending = true;
  protected boolean CustBankBicCaseInsensitive = false;
  protected Integer CustBankBicSort = null;
  /** raw field for: PAYMENT_PROFILE.diff_acct_own_flag) */
  public    StringFilter[] DiffAcctOwnFlag  = null;
  protected boolean DiffAcctOwnFlagFetch = false;
  protected boolean DiffAcctOwnFlagSortAscending = true;
  protected boolean DiffAcctOwnFlagCaseInsensitive = false;
  protected Integer DiffAcctOwnFlagSort = null;
  /** raw field for: PAYMENT_PROFILE.cust_bank_acc_owner) */
  public    StringFilter[] CustBankAccOwner  = null;
  protected boolean CustBankAccOwnerFetch = false;
  protected boolean CustBankAccOwnerSortAscending = true;
  protected boolean CustBankAccOwnerCaseInsensitive = false;
  protected Integer CustBankAccOwnerSort = null;
  /** raw field for: PAYMENT_PROFILE.sequence_type) */
  public    StringFilter[] SequenceType  = null;
  protected boolean SequenceTypeFetch = false;
  protected boolean SequenceTypeSortAscending = true;
  protected boolean SequenceTypeCaseInsensitive = false;
  protected Integer SequenceTypeSort = null;
  /** raw field for: PAYMENT_PROFILE.cust_bank_iban_hist) */
  public    StringFilter[] CustBankIbanHist  = null;
  protected boolean CustBankIbanHistFetch = false;
  protected boolean CustBankIbanHistSortAscending = true;
  protected boolean CustBankIbanHistCaseInsensitive = false;
  protected Integer CustBankIbanHistSort = null;
  /** raw field for: PAYMENT_PROFILE.cust_bank_bic_hist) */
  public    StringFilter[] CustBankBicHist  = null;
  protected boolean CustBankBicHistFetch = false;
  protected boolean CustBankBicHistSortAscending = true;
  protected boolean CustBankBicHistCaseInsensitive = false;
  protected Integer CustBankBicHistSort = null;
  /** raw field for: PAYMENT_PROFILE.mandate_reset) */
  public    StringFilter[] MandateReset  = null;
  protected boolean MandateResetFetch = false;
  protected boolean MandateResetSortAscending = true;
  protected boolean MandateResetCaseInsensitive = false;
  protected Integer MandateResetSort = null;
  /** raw field for: PAYMENT_TRANS.chg_date) */
  public    DateFilter[] ChgDate  = null;
  protected boolean ChgDateFetch = false;
  protected boolean ChgDateSortAscending = true;
  protected Integer ChgDateSort = null;
  /** raw field for: PAYMENT_TRANS.response_code) */
  public    StringFilter[] ResponseCode  = null;
  protected boolean ResponseCodeFetch = false;
  protected boolean ResponseCodeSortAscending = true;
  protected boolean ResponseCodeCaseInsensitive = false;
  protected Integer ResponseCodeSort = null;
  /** raw field for: PAYMENT_TRANS.clearing_house_id) */
  public    StringFilter[] ClearingHouseId  = null;
  protected boolean ClearingHouseIdFetch = false;
  protected boolean ClearingHouseIdSortAscending = true;
  protected boolean ClearingHouseIdCaseInsensitive = false;
  protected Integer ClearingHouseIdSort = null;
  /** raw field for: PAYMENT_TRANS.file_id) */
  public    IntegerFilter[] FileId  = null;
  protected boolean FileIdFetch = false;
  protected boolean FileIdSortAscending = true;
  protected Integer FileIdSort = null;
  /** raw field for: PAYMENT_TRANS.pmt_tracking_id) */
  public    IntegerFilter[] BmfTrackingId  = null;
  protected boolean BmfTrackingIdFetch = false;
  protected boolean BmfTrackingIdSortAscending = true;
  protected Integer BmfTrackingIdSort = null;
  /** raw field for: PAYMENT_TRANS.pmt_tracking_id_serv) */
  public    IntegerFilter[] BmfTrackingIdServ  = null;
  protected boolean BmfTrackingIdServFetch = false;
  protected boolean BmfTrackingIdServSortAscending = true;
  protected Integer BmfTrackingIdServSort = null;
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
  /** raw field for: PAYMENT_TRANS.pmt_req_sent_counter) */
  public    IntegerFilter[] PmtReqSentCounter  = null;
  protected boolean PmtReqSentCounterFetch = false;
  protected boolean PmtReqSentCounterSortAscending = true;
  protected Integer PmtReqSentCounterSort = null;
  /** raw field for: PAYMENT_TRANS.no_bill) */
  public    BooleanFilter[] NoBill  = null;
  protected boolean NoBillFetch = false;
  protected boolean NoBillSortAscending = true;
  protected Integer NoBillSort = null;
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
  public    IntegerFilter[] EftTransType  = null;
  protected boolean EftTransTypeFetch = false;
  protected boolean EftTransTypeSortAscending = true;
  protected Integer EftTransTypeSort = null;
  /** raw field for: PAYMENT_TRANS.bmf_trans_type) */
  public    IntegerFilter[] BmfTransType  = null;
  protected boolean BmfTransTypeFetch = false;
  protected boolean BmfTransTypeSortAscending = true;
  protected Integer BmfTransTypeSort = null;
  /** raw field for: PAYMENT_TRANS.trans_status) */
  public    IntegerFilter[] EftTransStatus  = null;
  protected boolean EftTransStatusFetch = false;
  protected boolean EftTransStatusSortAscending = true;
  protected Integer EftTransStatusSort = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id) */
  public    StringFilter[] AccountExternalId  = null;
  protected boolean AccountExternalIdFetch = false;
  protected boolean AccountExternalIdSortAscending = true;
  protected boolean AccountExternalIdCaseInsensitive = false;
  protected Integer AccountExternalIdSort = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id_type) */
  public    IntegerFilter[] AccountExternalIdType  = null;
  protected boolean AccountExternalIdTypeFetch = false;
  protected boolean AccountExternalIdTypeSortAscending = true;
  protected Integer AccountExternalIdTypeSort = null;
  private String _objName = "EftTransactionObjectFilter";
  /** default constructor */
  public EftTransactionObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public EftTransactionObjectFilter (EftTransactionObjectFilter other)
  {
    if (other == null) return;
    this.Key = new EftTransactionObjectKeyFilter (other.Key);
    this.BankAgencyName = other.BankAgencyName;
    this.BankAgencyNameFetch = other.BankAgencyNameFetch;
    this.BankAgencyNameSort = other.BankAgencyNameSort;
    this.BankAgencyNameCaseInsensitive = other.BankAgencyNameCaseInsensitive;
    this.BankAgencyNameSortAscending = other.BankAgencyNameSortAscending;
    this.BankAgencyCode = other.BankAgencyCode;
    this.BankAgencyCodeFetch = other.BankAgencyCodeFetch;
    this.BankAgencyCodeSort = other.BankAgencyCodeSort;
    this.BankAgencyCodeCaseInsensitive = other.BankAgencyCodeCaseInsensitive;
    this.BankAgencyCodeSortAscending = other.BankAgencyCodeSortAscending;
    this.CustBankSortCode = other.CustBankSortCode;
    this.CustBankSortCodeFetch = other.CustBankSortCodeFetch;
    this.CustBankSortCodeSort = other.CustBankSortCodeSort;
    this.CustBankSortCodeCaseInsensitive = other.CustBankSortCodeCaseInsensitive;
    this.CustBankSortCodeSortAscending = other.CustBankSortCodeSortAscending;
    this.CustBankAccNum = other.CustBankAccNum;
    this.CustBankAccNumFetch = other.CustBankAccNumFetch;
    this.CustBankAccNumSort = other.CustBankAccNumSort;
    this.CustBankAccNumCaseInsensitive = other.CustBankAccNumCaseInsensitive;
    this.CustBankAccNumSortAscending = other.CustBankAccNumSortAscending;
    this.OwnrLname = other.OwnrLname;
    this.OwnrLnameFetch = other.OwnrLnameFetch;
    this.OwnrLnameSort = other.OwnrLnameSort;
    this.OwnrLnameCaseInsensitive = other.OwnrLnameCaseInsensitive;
    this.OwnrLnameSortAscending = other.OwnrLnameSortAscending;
    this.OwnrFname = other.OwnrFname;
    this.OwnrFnameFetch = other.OwnrFnameFetch;
    this.OwnrFnameSort = other.OwnrFnameSort;
    this.OwnrFnameCaseInsensitive = other.OwnrFnameCaseInsensitive;
    this.OwnrFnameSortAscending = other.OwnrFnameSortAscending;
    this.MandateId = other.MandateId;
    this.MandateIdFetch = other.MandateIdFetch;
    this.MandateIdSort = other.MandateIdSort;
    this.MandateIdCaseInsensitive = other.MandateIdCaseInsensitive;
    this.MandateIdSortAscending = other.MandateIdSortAscending;
    this.MandateSignDate = other.MandateSignDate;
    this.MandateSignDateFetch = other.MandateSignDateFetch;
    this.MandateSignDateSort = other.MandateSignDateSort;
    this.MandateSignDateSortAscending = other.MandateSignDateSortAscending;
    this.MandateStatus = other.MandateStatus;
    this.MandateStatusFetch = other.MandateStatusFetch;
    this.MandateStatusSort = other.MandateStatusSort;
    this.MandateStatusCaseInsensitive = other.MandateStatusCaseInsensitive;
    this.MandateStatusSortAscending = other.MandateStatusSortAscending;
    this.CustBankIban = other.CustBankIban;
    this.CustBankIbanFetch = other.CustBankIbanFetch;
    this.CustBankIbanSort = other.CustBankIbanSort;
    this.CustBankIbanCaseInsensitive = other.CustBankIbanCaseInsensitive;
    this.CustBankIbanSortAscending = other.CustBankIbanSortAscending;
    this.CustBankBic = other.CustBankBic;
    this.CustBankBicFetch = other.CustBankBicFetch;
    this.CustBankBicSort = other.CustBankBicSort;
    this.CustBankBicCaseInsensitive = other.CustBankBicCaseInsensitive;
    this.CustBankBicSortAscending = other.CustBankBicSortAscending;
    this.DiffAcctOwnFlag = other.DiffAcctOwnFlag;
    this.DiffAcctOwnFlagFetch = other.DiffAcctOwnFlagFetch;
    this.DiffAcctOwnFlagSort = other.DiffAcctOwnFlagSort;
    this.DiffAcctOwnFlagCaseInsensitive = other.DiffAcctOwnFlagCaseInsensitive;
    this.DiffAcctOwnFlagSortAscending = other.DiffAcctOwnFlagSortAscending;
    this.CustBankAccOwner = other.CustBankAccOwner;
    this.CustBankAccOwnerFetch = other.CustBankAccOwnerFetch;
    this.CustBankAccOwnerSort = other.CustBankAccOwnerSort;
    this.CustBankAccOwnerCaseInsensitive = other.CustBankAccOwnerCaseInsensitive;
    this.CustBankAccOwnerSortAscending = other.CustBankAccOwnerSortAscending;
    this.SequenceType = other.SequenceType;
    this.SequenceTypeFetch = other.SequenceTypeFetch;
    this.SequenceTypeSort = other.SequenceTypeSort;
    this.SequenceTypeCaseInsensitive = other.SequenceTypeCaseInsensitive;
    this.SequenceTypeSortAscending = other.SequenceTypeSortAscending;
    this.CustBankIbanHist = other.CustBankIbanHist;
    this.CustBankIbanHistFetch = other.CustBankIbanHistFetch;
    this.CustBankIbanHistSort = other.CustBankIbanHistSort;
    this.CustBankIbanHistCaseInsensitive = other.CustBankIbanHistCaseInsensitive;
    this.CustBankIbanHistSortAscending = other.CustBankIbanHistSortAscending;
    this.CustBankBicHist = other.CustBankBicHist;
    this.CustBankBicHistFetch = other.CustBankBicHistFetch;
    this.CustBankBicHistSort = other.CustBankBicHistSort;
    this.CustBankBicHistCaseInsensitive = other.CustBankBicHistCaseInsensitive;
    this.CustBankBicHistSortAscending = other.CustBankBicHistSortAscending;
    this.MandateReset = other.MandateReset;
    this.MandateResetFetch = other.MandateResetFetch;
    this.MandateResetSort = other.MandateResetSort;
    this.MandateResetCaseInsensitive = other.MandateResetCaseInsensitive;
    this.MandateResetSortAscending = other.MandateResetSortAscending;
    this.ChgDate = other.ChgDate;
    this.ChgDateFetch = other.ChgDateFetch;
    this.ChgDateSort = other.ChgDateSort;
    this.ChgDateSortAscending = other.ChgDateSortAscending;
    this.ResponseCode = other.ResponseCode;
    this.ResponseCodeFetch = other.ResponseCodeFetch;
    this.ResponseCodeSort = other.ResponseCodeSort;
    this.ResponseCodeCaseInsensitive = other.ResponseCodeCaseInsensitive;
    this.ResponseCodeSortAscending = other.ResponseCodeSortAscending;
    this.ClearingHouseId = other.ClearingHouseId;
    this.ClearingHouseIdFetch = other.ClearingHouseIdFetch;
    this.ClearingHouseIdSort = other.ClearingHouseIdSort;
    this.ClearingHouseIdCaseInsensitive = other.ClearingHouseIdCaseInsensitive;
    this.ClearingHouseIdSortAscending = other.ClearingHouseIdSortAscending;
    this.FileId = other.FileId;
    this.FileIdFetch = other.FileIdFetch;
    this.FileIdSort = other.FileIdSort;
    this.FileIdSortAscending = other.FileIdSortAscending;
    this.BmfTrackingId = other.BmfTrackingId;
    this.BmfTrackingIdFetch = other.BmfTrackingIdFetch;
    this.BmfTrackingIdSort = other.BmfTrackingIdSort;
    this.BmfTrackingIdSortAscending = other.BmfTrackingIdSortAscending;
    this.BmfTrackingIdServ = other.BmfTrackingIdServ;
    this.BmfTrackingIdServFetch = other.BmfTrackingIdServFetch;
    this.BmfTrackingIdServSort = other.BmfTrackingIdServSort;
    this.BmfTrackingIdServSortAscending = other.BmfTrackingIdServSortAscending;
    this.OrigTrackingId = other.OrigTrackingId;
    this.OrigTrackingIdFetch = other.OrigTrackingIdFetch;
    this.OrigTrackingIdSort = other.OrigTrackingIdSort;
    this.OrigTrackingIdSortAscending = other.OrigTrackingIdSortAscending;
    this.OrigTrackingIdServ = other.OrigTrackingIdServ;
    this.OrigTrackingIdServFetch = other.OrigTrackingIdServFetch;
    this.OrigTrackingIdServSort = other.OrigTrackingIdServSort;
    this.OrigTrackingIdServSortAscending = other.OrigTrackingIdServSortAscending;
    this.PmtReqSentCounter = other.PmtReqSentCounter;
    this.PmtReqSentCounterFetch = other.PmtReqSentCounterFetch;
    this.PmtReqSentCounterSort = other.PmtReqSentCounterSort;
    this.PmtReqSentCounterSortAscending = other.PmtReqSentCounterSortAscending;
    this.NoBill = other.NoBill;
    this.NoBillFetch = other.NoBillFetch;
    this.NoBillSort = other.NoBillSort;
    this.NoBillSortAscending = other.NoBillSortAscending;
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
    this.EftTransType = other.EftTransType;
    this.EftTransTypeFetch = other.EftTransTypeFetch;
    this.EftTransTypeSort = other.EftTransTypeSort;
    this.EftTransTypeSortAscending = other.EftTransTypeSortAscending;
    this.BmfTransType = other.BmfTransType;
    this.BmfTransTypeFetch = other.BmfTransTypeFetch;
    this.BmfTransTypeSort = other.BmfTransTypeSort;
    this.BmfTransTypeSortAscending = other.BmfTransTypeSortAscending;
    this.EftTransStatus = other.EftTransStatus;
    this.EftTransStatusFetch = other.EftTransStatusFetch;
    this.EftTransStatusSort = other.EftTransStatusSort;
    this.EftTransStatusSortAscending = other.EftTransStatusSortAscending;
    this.AccountExternalId = other.AccountExternalId;
    this.AccountExternalIdFetch = other.AccountExternalIdFetch;
    this.AccountExternalIdSort = other.AccountExternalIdSort;
    this.AccountExternalIdCaseInsensitive = other.AccountExternalIdCaseInsensitive;
    this.AccountExternalIdSortAscending = other.AccountExternalIdSortAscending;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this.AccountExternalIdTypeFetch = other.AccountExternalIdTypeFetch;
    this.AccountExternalIdTypeSort = other.AccountExternalIdTypeSort;
    this.AccountExternalIdTypeSortAscending = other.AccountExternalIdTypeSortAscending;  }
  /** get the filter for this object's key
   * @return EftTransactionObjectKeyFilter
   */
  public EftTransactionObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (EftTransactionObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TrackingId (PAYMENT_TRANS.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new EftTransactionObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new EftTransactionObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new EftTransactionObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new EftTransactionObjectKeyFilter ();
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
  /** Set the field level Fetch value for field: Counter (PAYMENT_TRANS.counter)
   * @param fetch whether to fetch this field or not
   */
  public void setCounterFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new EftTransactionObjectKeyFilter ();
    this.Key.CounterFetch = fetch;
  }
  /** Retrieve Fetch value for field: Counter (PAYMENT_TRANS.counter)
   * @return boolean the Fetch value for this field
   */
  public boolean getCounterFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.CounterFetch;
  }
  /** Set the SortOrder for field: Counter (PAYMENT_TRANS.counter)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCounterSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new EftTransactionObjectKeyFilter ();
    this.Key.CounterSort = value;
  }
  /** Retrieve SortOrder for field: Counter (PAYMENT_TRANS.counter)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCounterSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.CounterSort;
  }
  /** Set the sort direction for field: Counter (PAYMENT_TRANS.counter)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCounterSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new EftTransactionObjectKeyFilter ();
    this.Key.CounterSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Counter (PAYMENT_TRANS.counter)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCounterSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.CounterSortAscending;
  }
  /** Set the field level filters for field: Counter (PAYMENT_TRANS.counter)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCounterFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new EftTransactionObjectKeyFilter ();
    this.Key.Counter = value;
  }
  /** Retrieve filter for field: Counter (PAYMENT_TRANS.counter)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCounterFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.Counter;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (PAYMENT_TRANS.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new EftTransactionObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new EftTransactionObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new EftTransactionObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new EftTransactionObjectKeyFilter ();
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
  /** Set the field level Fetch value for field: BankAgencyName (PAYMENT_PROFILE.bank_agency_name)
   * @param fetch whether to fetch this field or not
   */
  public void setBankAgencyNameFetch (boolean fetch) {
    this.BankAgencyNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: BankAgencyName (PAYMENT_PROFILE.bank_agency_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getBankAgencyNameFetch () {
    return this.BankAgencyNameFetch;
  }
  /** Set the SortOrder for field: BankAgencyName (PAYMENT_PROFILE.bank_agency_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBankAgencyNameSortOrder (Integer value) {
    this.BankAgencyNameSort = value;
  }
  /** Retrieve SortOrder for field: BankAgencyName (PAYMENT_PROFILE.bank_agency_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBankAgencyNameSortOrder () {
    return this.BankAgencyNameSort;
  }
  /** Set the sort direction for field: BankAgencyName (PAYMENT_PROFILE.bank_agency_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBankAgencyNameSortDirection (boolean ascending) {
    this.BankAgencyNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BankAgencyName (PAYMENT_PROFILE.bank_agency_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBankAgencyNameSortDirection () {
    return this.BankAgencyNameSortAscending;
  }
  /** Set the case insensitive for field: BankAgencyName (PAYMENT_PROFILE.bank_agency_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBankAgencyNameCaseInsensitive (boolean ascending) {
    this.BankAgencyNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BankAgencyName (PAYMENT_PROFILE.bank_agency_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBankAgencyNameCaseInsensitive () {
    return this.BankAgencyNameCaseInsensitive;
  }
  /** Set the field level filters for field: BankAgencyName (PAYMENT_PROFILE.bank_agency_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBankAgencyNameFilter (StringFilter[] value) throws ServiceException {
    this.BankAgencyName = value;
  }
  /** Retrieve filter for field: BankAgencyName (PAYMENT_PROFILE.bank_agency_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBankAgencyNameFilter () {
    return this.BankAgencyName;
  }

  /**
   * Retrieves the BankAgencyNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BankAgencyNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BankAgencyNameFilter field
   */
  public String[] getBankAgencyNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBankAgencyNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBankAgencyNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBankAgencyNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BankAgencyNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBankAgencyNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BankAgencyNameFilter filter value from a formatted string
   *
   * @param _value the BankAgencyNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BankAgencyNameFilter filter field
   */
  public void setBankAgencyNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBankAgencyNameFilterFromFormattedString");
    try {
      this.setBankAgencyNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BankAgencyNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBankAgencyNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBankAgencyNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BankAgencyCode (PAYMENT_PROFILE.bank_agency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setBankAgencyCodeFetch (boolean fetch) {
    this.BankAgencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BankAgencyCode (PAYMENT_PROFILE.bank_agency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getBankAgencyCodeFetch () {
    return this.BankAgencyCodeFetch;
  }
  /** Set the SortOrder for field: BankAgencyCode (PAYMENT_PROFILE.bank_agency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBankAgencyCodeSortOrder (Integer value) {
    this.BankAgencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: BankAgencyCode (PAYMENT_PROFILE.bank_agency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBankAgencyCodeSortOrder () {
    return this.BankAgencyCodeSort;
  }
  /** Set the sort direction for field: BankAgencyCode (PAYMENT_PROFILE.bank_agency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBankAgencyCodeSortDirection (boolean ascending) {
    this.BankAgencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BankAgencyCode (PAYMENT_PROFILE.bank_agency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBankAgencyCodeSortDirection () {
    return this.BankAgencyCodeSortAscending;
  }
  /** Set the case insensitive for field: BankAgencyCode (PAYMENT_PROFILE.bank_agency_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBankAgencyCodeCaseInsensitive (boolean ascending) {
    this.BankAgencyCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BankAgencyCode (PAYMENT_PROFILE.bank_agency_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBankAgencyCodeCaseInsensitive () {
    return this.BankAgencyCodeCaseInsensitive;
  }
  /** Set the field level filters for field: BankAgencyCode (PAYMENT_PROFILE.bank_agency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBankAgencyCodeFilter (StringFilter[] value) throws ServiceException {
    this.BankAgencyCode = value;
  }
  /** Retrieve filter for field: BankAgencyCode (PAYMENT_PROFILE.bank_agency_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBankAgencyCodeFilter () {
    return this.BankAgencyCode;
  }

  /**
   * Retrieves the BankAgencyCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BankAgencyCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BankAgencyCodeFilter field
   */
  public String[] getBankAgencyCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBankAgencyCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBankAgencyCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBankAgencyCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BankAgencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBankAgencyCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BankAgencyCodeFilter filter value from a formatted string
   *
   * @param _value the BankAgencyCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BankAgencyCodeFilter filter field
   */
  public void setBankAgencyCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBankAgencyCodeFilterFromFormattedString");
    try {
      this.setBankAgencyCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BankAgencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBankAgencyCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBankAgencyCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustBankSortCode (PAYMENT_PROFILE.cust_bank_sort_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCustBankSortCodeFetch (boolean fetch) {
    this.CustBankSortCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustBankSortCode (PAYMENT_PROFILE.cust_bank_sort_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustBankSortCodeFetch () {
    return this.CustBankSortCodeFetch;
  }
  /** Set the SortOrder for field: CustBankSortCode (PAYMENT_PROFILE.cust_bank_sort_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustBankSortCodeSortOrder (Integer value) {
    this.CustBankSortCodeSort = value;
  }
  /** Retrieve SortOrder for field: CustBankSortCode (PAYMENT_PROFILE.cust_bank_sort_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustBankSortCodeSortOrder () {
    return this.CustBankSortCodeSort;
  }
  /** Set the sort direction for field: CustBankSortCode (PAYMENT_PROFILE.cust_bank_sort_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustBankSortCodeSortDirection (boolean ascending) {
    this.CustBankSortCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustBankSortCode (PAYMENT_PROFILE.cust_bank_sort_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustBankSortCodeSortDirection () {
    return this.CustBankSortCodeSortAscending;
  }
  /** Set the case insensitive for field: CustBankSortCode (PAYMENT_PROFILE.cust_bank_sort_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustBankSortCodeCaseInsensitive (boolean ascending) {
    this.CustBankSortCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustBankSortCode (PAYMENT_PROFILE.cust_bank_sort_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustBankSortCodeCaseInsensitive () {
    return this.CustBankSortCodeCaseInsensitive;
  }
  /** Set the field level filters for field: CustBankSortCode (PAYMENT_PROFILE.cust_bank_sort_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustBankSortCodeFilter (StringFilter[] value) throws ServiceException {
    this.CustBankSortCode = value;
  }
  /** Retrieve filter for field: CustBankSortCode (PAYMENT_PROFILE.cust_bank_sort_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustBankSortCodeFilter () {
    return this.CustBankSortCode;
  }

  /**
   * Retrieves the CustBankSortCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustBankSortCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankSortCodeFilter field
   */
  public String[] getCustBankSortCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankSortCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustBankSortCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankSortCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBankSortCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankSortCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustBankSortCodeFilter filter value from a formatted string
   *
   * @param _value the CustBankSortCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustBankSortCodeFilter filter field
   */
  public void setCustBankSortCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustBankSortCodeFilterFromFormattedString");
    try {
      this.setCustBankSortCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBankSortCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankSortCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankSortCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustBankAccNum (PAYMENT_PROFILE.cust_bank_acc_num)
   * @param fetch whether to fetch this field or not
   */
  public void setCustBankAccNumFetch (boolean fetch) {
    this.CustBankAccNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustBankAccNum (PAYMENT_PROFILE.cust_bank_acc_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustBankAccNumFetch () {
    return this.CustBankAccNumFetch;
  }
  /** Set the SortOrder for field: CustBankAccNum (PAYMENT_PROFILE.cust_bank_acc_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustBankAccNumSortOrder (Integer value) {
    this.CustBankAccNumSort = value;
  }
  /** Retrieve SortOrder for field: CustBankAccNum (PAYMENT_PROFILE.cust_bank_acc_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustBankAccNumSortOrder () {
    return this.CustBankAccNumSort;
  }
  /** Set the sort direction for field: CustBankAccNum (PAYMENT_PROFILE.cust_bank_acc_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustBankAccNumSortDirection (boolean ascending) {
    this.CustBankAccNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustBankAccNum (PAYMENT_PROFILE.cust_bank_acc_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustBankAccNumSortDirection () {
    return this.CustBankAccNumSortAscending;
  }
  /** Set the case insensitive for field: CustBankAccNum (PAYMENT_PROFILE.cust_bank_acc_num)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustBankAccNumCaseInsensitive (boolean ascending) {
    this.CustBankAccNumCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustBankAccNum (PAYMENT_PROFILE.cust_bank_acc_num)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustBankAccNumCaseInsensitive () {
    return this.CustBankAccNumCaseInsensitive;
  }
  /** Set the field level filters for field: CustBankAccNum (PAYMENT_PROFILE.cust_bank_acc_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustBankAccNumFilter (StringFilter[] value) throws ServiceException {
    this.CustBankAccNum = value;
  }
  /** Retrieve filter for field: CustBankAccNum (PAYMENT_PROFILE.cust_bank_acc_num)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustBankAccNumFilter () {
    return this.CustBankAccNum;
  }

  /**
   * Retrieves the CustBankAccNumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustBankAccNumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankAccNumFilter field
   */
  public String[] getCustBankAccNumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankAccNumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustBankAccNumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankAccNumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBankAccNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankAccNumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustBankAccNumFilter filter value from a formatted string
   *
   * @param _value the CustBankAccNumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustBankAccNumFilter filter field
   */
  public void setCustBankAccNumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustBankAccNumFilterFromFormattedString");
    try {
      this.setCustBankAccNumFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBankAccNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankAccNumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankAccNumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @param fetch whether to fetch this field or not
   */
  public void setOwnrLnameFetch (boolean fetch) {
    this.OwnrLnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @return boolean the Fetch value for this field
   */
  public boolean getOwnrLnameFetch () {
    return this.OwnrLnameFetch;
  }
  /** Set the SortOrder for field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOwnrLnameSortOrder (Integer value) {
    this.OwnrLnameSort = value;
  }
  /** Retrieve SortOrder for field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOwnrLnameSortOrder () {
    return this.OwnrLnameSort;
  }
  /** Set the sort direction for field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOwnrLnameSortDirection (boolean ascending) {
    this.OwnrLnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOwnrLnameSortDirection () {
    return this.OwnrLnameSortAscending;
  }
  /** Set the case insensitive for field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setOwnrLnameCaseInsensitive (boolean ascending) {
    this.OwnrLnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getOwnrLnameCaseInsensitive () {
    return this.OwnrLnameCaseInsensitive;
  }
  /** Set the field level filters for field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOwnrLnameFilter (StringFilter[] value) throws ServiceException {
    this.OwnrLname = value;
  }
  /** Retrieve filter for field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getOwnrLnameFilter () {
    return this.OwnrLname;
  }

  /**
   * Retrieves the OwnrLnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OwnrLnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OwnrLnameFilter field
   */
  public String[] getOwnrLnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwnrLnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOwnrLnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwnrLnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwnrLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwnrLnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OwnrLnameFilter filter value from a formatted string
   *
   * @param _value the OwnrLnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OwnrLnameFilter filter field
   */
  public void setOwnrLnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOwnrLnameFilterFromFormattedString");
    try {
      this.setOwnrLnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwnrLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwnrLnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwnrLnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @param fetch whether to fetch this field or not
   */
  public void setOwnrFnameFetch (boolean fetch) {
    this.OwnrFnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @return boolean the Fetch value for this field
   */
  public boolean getOwnrFnameFetch () {
    return this.OwnrFnameFetch;
  }
  /** Set the SortOrder for field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOwnrFnameSortOrder (Integer value) {
    this.OwnrFnameSort = value;
  }
  /** Retrieve SortOrder for field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOwnrFnameSortOrder () {
    return this.OwnrFnameSort;
  }
  /** Set the sort direction for field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOwnrFnameSortDirection (boolean ascending) {
    this.OwnrFnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOwnrFnameSortDirection () {
    return this.OwnrFnameSortAscending;
  }
  /** Set the case insensitive for field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setOwnrFnameCaseInsensitive (boolean ascending) {
    this.OwnrFnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getOwnrFnameCaseInsensitive () {
    return this.OwnrFnameCaseInsensitive;
  }
  /** Set the field level filters for field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOwnrFnameFilter (StringFilter[] value) throws ServiceException {
    this.OwnrFname = value;
  }
  /** Retrieve filter for field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getOwnrFnameFilter () {
    return this.OwnrFname;
  }

  /**
   * Retrieves the OwnrFnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OwnrFnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OwnrFnameFilter field
   */
  public String[] getOwnrFnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwnrFnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOwnrFnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwnrFnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwnrFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwnrFnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OwnrFnameFilter filter value from a formatted string
   *
   * @param _value the OwnrFnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OwnrFnameFilter filter field
   */
  public void setOwnrFnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOwnrFnameFilterFromFormattedString");
    try {
      this.setOwnrFnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwnrFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwnrFnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwnrFnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MandateId (PAYMENT_PROFILE.mandate_id)
   * @param fetch whether to fetch this field or not
   */
  public void setMandateIdFetch (boolean fetch) {
    this.MandateIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: MandateId (PAYMENT_PROFILE.mandate_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getMandateIdFetch () {
    return this.MandateIdFetch;
  }
  /** Set the SortOrder for field: MandateId (PAYMENT_PROFILE.mandate_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMandateIdSortOrder (Integer value) {
    this.MandateIdSort = value;
  }
  /** Retrieve SortOrder for field: MandateId (PAYMENT_PROFILE.mandate_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMandateIdSortOrder () {
    return this.MandateIdSort;
  }
  /** Set the sort direction for field: MandateId (PAYMENT_PROFILE.mandate_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMandateIdSortDirection (boolean ascending) {
    this.MandateIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MandateId (PAYMENT_PROFILE.mandate_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMandateIdSortDirection () {
    return this.MandateIdSortAscending;
  }
  /** Set the case insensitive for field: MandateId (PAYMENT_PROFILE.mandate_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setMandateIdCaseInsensitive (boolean ascending) {
    this.MandateIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: MandateId (PAYMENT_PROFILE.mandate_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getMandateIdCaseInsensitive () {
    return this.MandateIdCaseInsensitive;
  }
  /** Set the field level filters for field: MandateId (PAYMENT_PROFILE.mandate_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMandateIdFilter (StringFilter[] value) throws ServiceException {
    this.MandateId = value;
  }
  /** Retrieve filter for field: MandateId (PAYMENT_PROFILE.mandate_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getMandateIdFilter () {
    return this.MandateId;
  }

  /**
   * Retrieves the MandateIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MandateIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MandateIdFilter field
   */
  public String[] getMandateIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMandateIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMandateIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MandateIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMandateIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MandateIdFilter filter value from a formatted string
   *
   * @param _value the MandateIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MandateIdFilter filter field
   */
  public void setMandateIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMandateIdFilterFromFormattedString");
    try {
      this.setMandateIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MandateIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMandateIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMandateIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MandateSignDate (PAYMENT_PROFILE.mandate_sign_date)
   * @param fetch whether to fetch this field or not
   */
  public void setMandateSignDateFetch (boolean fetch) {
    this.MandateSignDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: MandateSignDate (PAYMENT_PROFILE.mandate_sign_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getMandateSignDateFetch () {
    return this.MandateSignDateFetch;
  }
  /** Set the SortOrder for field: MandateSignDate (PAYMENT_PROFILE.mandate_sign_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMandateSignDateSortOrder (Integer value) {
    this.MandateSignDateSort = value;
  }
  /** Retrieve SortOrder for field: MandateSignDate (PAYMENT_PROFILE.mandate_sign_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMandateSignDateSortOrder () {
    return this.MandateSignDateSort;
  }
  /** Set the sort direction for field: MandateSignDate (PAYMENT_PROFILE.mandate_sign_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMandateSignDateSortDirection (boolean ascending) {
    this.MandateSignDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MandateSignDate (PAYMENT_PROFILE.mandate_sign_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMandateSignDateSortDirection () {
    return this.MandateSignDateSortAscending;
  }
  /** Set the field level filters for field: MandateSignDate (PAYMENT_PROFILE.mandate_sign_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMandateSignDateFilter (DateFilter[] value) throws ServiceException {
    this.MandateSignDate = value;
  }
  /** Retrieve filter for field: MandateSignDate (PAYMENT_PROFILE.mandate_sign_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getMandateSignDateFilter () {
    return this.MandateSignDate;
  }

  /**
   * Retrieves the MandateSignDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MandateSignDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MandateSignDateFilter field
   */
  public String[] getMandateSignDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateSignDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMandateSignDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMandateSignDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MandateSignDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMandateSignDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MandateSignDateFilter filter value from a formatted string
   *
   * @param _value the MandateSignDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MandateSignDateFilter filter field
   */
  public void setMandateSignDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMandateSignDateFilterFromFormattedString");
    try {
      this.setMandateSignDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MandateSignDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMandateSignDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMandateSignDateFilterFromFormattedString");
  }

  /**
   * Retrieves the MandateSignDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MandateSignDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the MandateSignDateFilter field
   */
  public String[] getMandateSignDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateSignDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMandateSignDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMandateSignDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MandateSignDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMandateSignDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the MandateSignDateFilter filter value from a formatted string
   *
   * @param _value the MandateSignDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MandateSignDateFilter filter field
   */
  public void setMandateSignDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMandateSignDateFilterFromFormattedDateTimeString");
    try {
      this.setMandateSignDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MandateSignDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMandateSignDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMandateSignDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: MandateStatus (PAYMENT_PROFILE.mandate_status)
   * @param fetch whether to fetch this field or not
   */
  public void setMandateStatusFetch (boolean fetch) {
    this.MandateStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: MandateStatus (PAYMENT_PROFILE.mandate_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getMandateStatusFetch () {
    return this.MandateStatusFetch;
  }
  /** Set the SortOrder for field: MandateStatus (PAYMENT_PROFILE.mandate_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMandateStatusSortOrder (Integer value) {
    this.MandateStatusSort = value;
  }
  /** Retrieve SortOrder for field: MandateStatus (PAYMENT_PROFILE.mandate_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMandateStatusSortOrder () {
    return this.MandateStatusSort;
  }
  /** Set the sort direction for field: MandateStatus (PAYMENT_PROFILE.mandate_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMandateStatusSortDirection (boolean ascending) {
    this.MandateStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MandateStatus (PAYMENT_PROFILE.mandate_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMandateStatusSortDirection () {
    return this.MandateStatusSortAscending;
  }
  /** Set the case insensitive for field: MandateStatus (PAYMENT_PROFILE.mandate_status)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setMandateStatusCaseInsensitive (boolean ascending) {
    this.MandateStatusCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: MandateStatus (PAYMENT_PROFILE.mandate_status)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getMandateStatusCaseInsensitive () {
    return this.MandateStatusCaseInsensitive;
  }
  /** Set the field level filters for field: MandateStatus (PAYMENT_PROFILE.mandate_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMandateStatusFilter (StringFilter[] value) throws ServiceException {
    this.MandateStatus = value;
  }
  /** Retrieve filter for field: MandateStatus (PAYMENT_PROFILE.mandate_status)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getMandateStatusFilter () {
    return this.MandateStatus;
  }

  /**
   * Retrieves the MandateStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MandateStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MandateStatusFilter field
   */
  public String[] getMandateStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMandateStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMandateStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MandateStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMandateStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MandateStatusFilter filter value from a formatted string
   *
   * @param _value the MandateStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MandateStatusFilter filter field
   */
  public void setMandateStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMandateStatusFilterFromFormattedString");
    try {
      this.setMandateStatusFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MandateStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMandateStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMandateStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustBankIban (PAYMENT_PROFILE.cust_bank_iban)
   * @param fetch whether to fetch this field or not
   */
  public void setCustBankIbanFetch (boolean fetch) {
    this.CustBankIbanFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustBankIban (PAYMENT_PROFILE.cust_bank_iban)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustBankIbanFetch () {
    return this.CustBankIbanFetch;
  }
  /** Set the SortOrder for field: CustBankIban (PAYMENT_PROFILE.cust_bank_iban)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustBankIbanSortOrder (Integer value) {
    this.CustBankIbanSort = value;
  }
  /** Retrieve SortOrder for field: CustBankIban (PAYMENT_PROFILE.cust_bank_iban)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustBankIbanSortOrder () {
    return this.CustBankIbanSort;
  }
  /** Set the sort direction for field: CustBankIban (PAYMENT_PROFILE.cust_bank_iban)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustBankIbanSortDirection (boolean ascending) {
    this.CustBankIbanSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustBankIban (PAYMENT_PROFILE.cust_bank_iban)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustBankIbanSortDirection () {
    return this.CustBankIbanSortAscending;
  }
  /** Set the case insensitive for field: CustBankIban (PAYMENT_PROFILE.cust_bank_iban)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustBankIbanCaseInsensitive (boolean ascending) {
    this.CustBankIbanCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustBankIban (PAYMENT_PROFILE.cust_bank_iban)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustBankIbanCaseInsensitive () {
    return this.CustBankIbanCaseInsensitive;
  }
  /** Set the field level filters for field: CustBankIban (PAYMENT_PROFILE.cust_bank_iban)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustBankIbanFilter (StringFilter[] value) throws ServiceException {
    this.CustBankIban = value;
  }
  /** Retrieve filter for field: CustBankIban (PAYMENT_PROFILE.cust_bank_iban)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustBankIbanFilter () {
    return this.CustBankIban;
  }

  /**
   * Retrieves the CustBankIbanFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustBankIbanFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankIbanFilter field
   */
  public String[] getCustBankIbanFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankIbanFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustBankIbanFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankIbanFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBankIbanFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankIbanFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustBankIbanFilter filter value from a formatted string
   *
   * @param _value the CustBankIbanFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustBankIbanFilter filter field
   */
  public void setCustBankIbanFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustBankIbanFilterFromFormattedString");
    try {
      this.setCustBankIbanFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBankIbanFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankIbanFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankIbanFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustBankBic (PAYMENT_PROFILE.cust_bank_bic)
   * @param fetch whether to fetch this field or not
   */
  public void setCustBankBicFetch (boolean fetch) {
    this.CustBankBicFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustBankBic (PAYMENT_PROFILE.cust_bank_bic)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustBankBicFetch () {
    return this.CustBankBicFetch;
  }
  /** Set the SortOrder for field: CustBankBic (PAYMENT_PROFILE.cust_bank_bic)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustBankBicSortOrder (Integer value) {
    this.CustBankBicSort = value;
  }
  /** Retrieve SortOrder for field: CustBankBic (PAYMENT_PROFILE.cust_bank_bic)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustBankBicSortOrder () {
    return this.CustBankBicSort;
  }
  /** Set the sort direction for field: CustBankBic (PAYMENT_PROFILE.cust_bank_bic)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustBankBicSortDirection (boolean ascending) {
    this.CustBankBicSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustBankBic (PAYMENT_PROFILE.cust_bank_bic)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustBankBicSortDirection () {
    return this.CustBankBicSortAscending;
  }
  /** Set the case insensitive for field: CustBankBic (PAYMENT_PROFILE.cust_bank_bic)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustBankBicCaseInsensitive (boolean ascending) {
    this.CustBankBicCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustBankBic (PAYMENT_PROFILE.cust_bank_bic)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustBankBicCaseInsensitive () {
    return this.CustBankBicCaseInsensitive;
  }
  /** Set the field level filters for field: CustBankBic (PAYMENT_PROFILE.cust_bank_bic)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustBankBicFilter (StringFilter[] value) throws ServiceException {
    this.CustBankBic = value;
  }
  /** Retrieve filter for field: CustBankBic (PAYMENT_PROFILE.cust_bank_bic)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustBankBicFilter () {
    return this.CustBankBic;
  }

  /**
   * Retrieves the CustBankBicFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustBankBicFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankBicFilter field
   */
  public String[] getCustBankBicFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankBicFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustBankBicFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankBicFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBankBicFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankBicFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustBankBicFilter filter value from a formatted string
   *
   * @param _value the CustBankBicFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustBankBicFilter filter field
   */
  public void setCustBankBicFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustBankBicFilterFromFormattedString");
    try {
      this.setCustBankBicFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBankBicFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankBicFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankBicFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DiffAcctOwnFlag (PAYMENT_PROFILE.diff_acct_own_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setDiffAcctOwnFlagFetch (boolean fetch) {
    this.DiffAcctOwnFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: DiffAcctOwnFlag (PAYMENT_PROFILE.diff_acct_own_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getDiffAcctOwnFlagFetch () {
    return this.DiffAcctOwnFlagFetch;
  }
  /** Set the SortOrder for field: DiffAcctOwnFlag (PAYMENT_PROFILE.diff_acct_own_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDiffAcctOwnFlagSortOrder (Integer value) {
    this.DiffAcctOwnFlagSort = value;
  }
  /** Retrieve SortOrder for field: DiffAcctOwnFlag (PAYMENT_PROFILE.diff_acct_own_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDiffAcctOwnFlagSortOrder () {
    return this.DiffAcctOwnFlagSort;
  }
  /** Set the sort direction for field: DiffAcctOwnFlag (PAYMENT_PROFILE.diff_acct_own_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDiffAcctOwnFlagSortDirection (boolean ascending) {
    this.DiffAcctOwnFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DiffAcctOwnFlag (PAYMENT_PROFILE.diff_acct_own_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDiffAcctOwnFlagSortDirection () {
    return this.DiffAcctOwnFlagSortAscending;
  }
  /** Set the case insensitive for field: DiffAcctOwnFlag (PAYMENT_PROFILE.diff_acct_own_flag)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDiffAcctOwnFlagCaseInsensitive (boolean ascending) {
    this.DiffAcctOwnFlagCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DiffAcctOwnFlag (PAYMENT_PROFILE.diff_acct_own_flag)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDiffAcctOwnFlagCaseInsensitive () {
    return this.DiffAcctOwnFlagCaseInsensitive;
  }
  /** Set the field level filters for field: DiffAcctOwnFlag (PAYMENT_PROFILE.diff_acct_own_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDiffAcctOwnFlagFilter (StringFilter[] value) throws ServiceException {
    this.DiffAcctOwnFlag = value;
  }
  /** Retrieve filter for field: DiffAcctOwnFlag (PAYMENT_PROFILE.diff_acct_own_flag)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDiffAcctOwnFlagFilter () {
    return this.DiffAcctOwnFlag;
  }

  /**
   * Retrieves the DiffAcctOwnFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DiffAcctOwnFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiffAcctOwnFlagFilter field
   */
  public String[] getDiffAcctOwnFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiffAcctOwnFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDiffAcctOwnFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiffAcctOwnFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiffAcctOwnFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiffAcctOwnFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DiffAcctOwnFlagFilter filter value from a formatted string
   *
   * @param _value the DiffAcctOwnFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DiffAcctOwnFlagFilter filter field
   */
  public void setDiffAcctOwnFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiffAcctOwnFlagFilterFromFormattedString");
    try {
      this.setDiffAcctOwnFlagFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiffAcctOwnFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiffAcctOwnFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiffAcctOwnFlagFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustBankAccOwner (PAYMENT_PROFILE.cust_bank_acc_owner)
   * @param fetch whether to fetch this field or not
   */
  public void setCustBankAccOwnerFetch (boolean fetch) {
    this.CustBankAccOwnerFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustBankAccOwner (PAYMENT_PROFILE.cust_bank_acc_owner)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustBankAccOwnerFetch () {
    return this.CustBankAccOwnerFetch;
  }
  /** Set the SortOrder for field: CustBankAccOwner (PAYMENT_PROFILE.cust_bank_acc_owner)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustBankAccOwnerSortOrder (Integer value) {
    this.CustBankAccOwnerSort = value;
  }
  /** Retrieve SortOrder for field: CustBankAccOwner (PAYMENT_PROFILE.cust_bank_acc_owner)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustBankAccOwnerSortOrder () {
    return this.CustBankAccOwnerSort;
  }
  /** Set the sort direction for field: CustBankAccOwner (PAYMENT_PROFILE.cust_bank_acc_owner)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustBankAccOwnerSortDirection (boolean ascending) {
    this.CustBankAccOwnerSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustBankAccOwner (PAYMENT_PROFILE.cust_bank_acc_owner)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustBankAccOwnerSortDirection () {
    return this.CustBankAccOwnerSortAscending;
  }
  /** Set the case insensitive for field: CustBankAccOwner (PAYMENT_PROFILE.cust_bank_acc_owner)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustBankAccOwnerCaseInsensitive (boolean ascending) {
    this.CustBankAccOwnerCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustBankAccOwner (PAYMENT_PROFILE.cust_bank_acc_owner)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustBankAccOwnerCaseInsensitive () {
    return this.CustBankAccOwnerCaseInsensitive;
  }
  /** Set the field level filters for field: CustBankAccOwner (PAYMENT_PROFILE.cust_bank_acc_owner)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustBankAccOwnerFilter (StringFilter[] value) throws ServiceException {
    this.CustBankAccOwner = value;
  }
  /** Retrieve filter for field: CustBankAccOwner (PAYMENT_PROFILE.cust_bank_acc_owner)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustBankAccOwnerFilter () {
    return this.CustBankAccOwner;
  }

  /**
   * Retrieves the CustBankAccOwnerFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustBankAccOwnerFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankAccOwnerFilter field
   */
  public String[] getCustBankAccOwnerFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankAccOwnerFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustBankAccOwnerFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankAccOwnerFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBankAccOwnerFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankAccOwnerFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustBankAccOwnerFilter filter value from a formatted string
   *
   * @param _value the CustBankAccOwnerFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustBankAccOwnerFilter filter field
   */
  public void setCustBankAccOwnerFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustBankAccOwnerFilterFromFormattedString");
    try {
      this.setCustBankAccOwnerFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBankAccOwnerFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankAccOwnerFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankAccOwnerFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SequenceType (PAYMENT_PROFILE.sequence_type)
   * @param fetch whether to fetch this field or not
   */
  public void setSequenceTypeFetch (boolean fetch) {
    this.SequenceTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: SequenceType (PAYMENT_PROFILE.sequence_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getSequenceTypeFetch () {
    return this.SequenceTypeFetch;
  }
  /** Set the SortOrder for field: SequenceType (PAYMENT_PROFILE.sequence_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSequenceTypeSortOrder (Integer value) {
    this.SequenceTypeSort = value;
  }
  /** Retrieve SortOrder for field: SequenceType (PAYMENT_PROFILE.sequence_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSequenceTypeSortOrder () {
    return this.SequenceTypeSort;
  }
  /** Set the sort direction for field: SequenceType (PAYMENT_PROFILE.sequence_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSequenceTypeSortDirection (boolean ascending) {
    this.SequenceTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SequenceType (PAYMENT_PROFILE.sequence_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSequenceTypeSortDirection () {
    return this.SequenceTypeSortAscending;
  }
  /** Set the case insensitive for field: SequenceType (PAYMENT_PROFILE.sequence_type)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setSequenceTypeCaseInsensitive (boolean ascending) {
    this.SequenceTypeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: SequenceType (PAYMENT_PROFILE.sequence_type)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getSequenceTypeCaseInsensitive () {
    return this.SequenceTypeCaseInsensitive;
  }
  /** Set the field level filters for field: SequenceType (PAYMENT_PROFILE.sequence_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSequenceTypeFilter (StringFilter[] value) throws ServiceException {
    this.SequenceType = value;
  }
  /** Retrieve filter for field: SequenceType (PAYMENT_PROFILE.sequence_type)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getSequenceTypeFilter () {
    return this.SequenceType;
  }

  /**
   * Retrieves the SequenceTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SequenceTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SequenceTypeFilter field
   */
  public String[] getSequenceTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSequenceTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSequenceTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSequenceTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SequenceTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSequenceTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SequenceTypeFilter filter value from a formatted string
   *
   * @param _value the SequenceTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SequenceTypeFilter filter field
   */
  public void setSequenceTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSequenceTypeFilterFromFormattedString");
    try {
      this.setSequenceTypeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SequenceTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSequenceTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSequenceTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustBankIbanHist (PAYMENT_PROFILE.cust_bank_iban_hist)
   * @param fetch whether to fetch this field or not
   */
  public void setCustBankIbanHistFetch (boolean fetch) {
    this.CustBankIbanHistFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustBankIbanHist (PAYMENT_PROFILE.cust_bank_iban_hist)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustBankIbanHistFetch () {
    return this.CustBankIbanHistFetch;
  }
  /** Set the SortOrder for field: CustBankIbanHist (PAYMENT_PROFILE.cust_bank_iban_hist)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustBankIbanHistSortOrder (Integer value) {
    this.CustBankIbanHistSort = value;
  }
  /** Retrieve SortOrder for field: CustBankIbanHist (PAYMENT_PROFILE.cust_bank_iban_hist)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustBankIbanHistSortOrder () {
    return this.CustBankIbanHistSort;
  }
  /** Set the sort direction for field: CustBankIbanHist (PAYMENT_PROFILE.cust_bank_iban_hist)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustBankIbanHistSortDirection (boolean ascending) {
    this.CustBankIbanHistSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustBankIbanHist (PAYMENT_PROFILE.cust_bank_iban_hist)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustBankIbanHistSortDirection () {
    return this.CustBankIbanHistSortAscending;
  }
  /** Set the case insensitive for field: CustBankIbanHist (PAYMENT_PROFILE.cust_bank_iban_hist)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustBankIbanHistCaseInsensitive (boolean ascending) {
    this.CustBankIbanHistCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustBankIbanHist (PAYMENT_PROFILE.cust_bank_iban_hist)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustBankIbanHistCaseInsensitive () {
    return this.CustBankIbanHistCaseInsensitive;
  }
  /** Set the field level filters for field: CustBankIbanHist (PAYMENT_PROFILE.cust_bank_iban_hist)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustBankIbanHistFilter (StringFilter[] value) throws ServiceException {
    this.CustBankIbanHist = value;
  }
  /** Retrieve filter for field: CustBankIbanHist (PAYMENT_PROFILE.cust_bank_iban_hist)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustBankIbanHistFilter () {
    return this.CustBankIbanHist;
  }

  /**
   * Retrieves the CustBankIbanHistFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustBankIbanHistFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankIbanHistFilter field
   */
  public String[] getCustBankIbanHistFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankIbanHistFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustBankIbanHistFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankIbanHistFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBankIbanHistFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankIbanHistFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustBankIbanHistFilter filter value from a formatted string
   *
   * @param _value the CustBankIbanHistFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustBankIbanHistFilter filter field
   */
  public void setCustBankIbanHistFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustBankIbanHistFilterFromFormattedString");
    try {
      this.setCustBankIbanHistFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBankIbanHistFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankIbanHistFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankIbanHistFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustBankBicHist (PAYMENT_PROFILE.cust_bank_bic_hist)
   * @param fetch whether to fetch this field or not
   */
  public void setCustBankBicHistFetch (boolean fetch) {
    this.CustBankBicHistFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustBankBicHist (PAYMENT_PROFILE.cust_bank_bic_hist)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustBankBicHistFetch () {
    return this.CustBankBicHistFetch;
  }
  /** Set the SortOrder for field: CustBankBicHist (PAYMENT_PROFILE.cust_bank_bic_hist)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustBankBicHistSortOrder (Integer value) {
    this.CustBankBicHistSort = value;
  }
  /** Retrieve SortOrder for field: CustBankBicHist (PAYMENT_PROFILE.cust_bank_bic_hist)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustBankBicHistSortOrder () {
    return this.CustBankBicHistSort;
  }
  /** Set the sort direction for field: CustBankBicHist (PAYMENT_PROFILE.cust_bank_bic_hist)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustBankBicHistSortDirection (boolean ascending) {
    this.CustBankBicHistSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustBankBicHist (PAYMENT_PROFILE.cust_bank_bic_hist)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustBankBicHistSortDirection () {
    return this.CustBankBicHistSortAscending;
  }
  /** Set the case insensitive for field: CustBankBicHist (PAYMENT_PROFILE.cust_bank_bic_hist)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustBankBicHistCaseInsensitive (boolean ascending) {
    this.CustBankBicHistCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustBankBicHist (PAYMENT_PROFILE.cust_bank_bic_hist)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustBankBicHistCaseInsensitive () {
    return this.CustBankBicHistCaseInsensitive;
  }
  /** Set the field level filters for field: CustBankBicHist (PAYMENT_PROFILE.cust_bank_bic_hist)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustBankBicHistFilter (StringFilter[] value) throws ServiceException {
    this.CustBankBicHist = value;
  }
  /** Retrieve filter for field: CustBankBicHist (PAYMENT_PROFILE.cust_bank_bic_hist)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustBankBicHistFilter () {
    return this.CustBankBicHist;
  }

  /**
   * Retrieves the CustBankBicHistFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustBankBicHistFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankBicHistFilter field
   */
  public String[] getCustBankBicHistFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankBicHistFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustBankBicHistFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankBicHistFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBankBicHistFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankBicHistFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustBankBicHistFilter filter value from a formatted string
   *
   * @param _value the CustBankBicHistFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustBankBicHistFilter filter field
   */
  public void setCustBankBicHistFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustBankBicHistFilterFromFormattedString");
    try {
      this.setCustBankBicHistFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBankBicHistFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankBicHistFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankBicHistFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MandateReset (PAYMENT_PROFILE.mandate_reset)
   * @param fetch whether to fetch this field or not
   */
  public void setMandateResetFetch (boolean fetch) {
    this.MandateResetFetch = fetch;
  }
  /** Retrieve Fetch value for field: MandateReset (PAYMENT_PROFILE.mandate_reset)
   * @return boolean the Fetch value for this field
   */
  public boolean getMandateResetFetch () {
    return this.MandateResetFetch;
  }
  /** Set the SortOrder for field: MandateReset (PAYMENT_PROFILE.mandate_reset)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMandateResetSortOrder (Integer value) {
    this.MandateResetSort = value;
  }
  /** Retrieve SortOrder for field: MandateReset (PAYMENT_PROFILE.mandate_reset)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMandateResetSortOrder () {
    return this.MandateResetSort;
  }
  /** Set the sort direction for field: MandateReset (PAYMENT_PROFILE.mandate_reset)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMandateResetSortDirection (boolean ascending) {
    this.MandateResetSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MandateReset (PAYMENT_PROFILE.mandate_reset)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMandateResetSortDirection () {
    return this.MandateResetSortAscending;
  }
  /** Set the case insensitive for field: MandateReset (PAYMENT_PROFILE.mandate_reset)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setMandateResetCaseInsensitive (boolean ascending) {
    this.MandateResetCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: MandateReset (PAYMENT_PROFILE.mandate_reset)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getMandateResetCaseInsensitive () {
    return this.MandateResetCaseInsensitive;
  }
  /** Set the field level filters for field: MandateReset (PAYMENT_PROFILE.mandate_reset)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMandateResetFilter (StringFilter[] value) throws ServiceException {
    this.MandateReset = value;
  }
  /** Retrieve filter for field: MandateReset (PAYMENT_PROFILE.mandate_reset)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getMandateResetFilter () {
    return this.MandateReset;
  }

  /**
   * Retrieves the MandateResetFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MandateResetFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MandateResetFilter field
   */
  public String[] getMandateResetFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateResetFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMandateResetFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMandateResetFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MandateResetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMandateResetFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MandateResetFilter filter value from a formatted string
   *
   * @param _value the MandateResetFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MandateResetFilter filter field
   */
  public void setMandateResetFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMandateResetFilterFromFormattedString");
    try {
      this.setMandateResetFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MandateResetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMandateResetFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMandateResetFilterFromFormattedString");
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

  /** Set the field level Fetch value for field: BmfTrackingId (PAYMENT_TRANS.pmt_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setBmfTrackingIdFetch (boolean fetch) {
    this.BmfTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BmfTrackingId (PAYMENT_TRANS.pmt_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getBmfTrackingIdFetch () {
    return this.BmfTrackingIdFetch;
  }
  /** Set the SortOrder for field: BmfTrackingId (PAYMENT_TRANS.pmt_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBmfTrackingIdSortOrder (Integer value) {
    this.BmfTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: BmfTrackingId (PAYMENT_TRANS.pmt_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBmfTrackingIdSortOrder () {
    return this.BmfTrackingIdSort;
  }
  /** Set the sort direction for field: BmfTrackingId (PAYMENT_TRANS.pmt_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBmfTrackingIdSortDirection (boolean ascending) {
    this.BmfTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BmfTrackingId (PAYMENT_TRANS.pmt_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBmfTrackingIdSortDirection () {
    return this.BmfTrackingIdSortAscending;
  }
  /** Set the field level filters for field: BmfTrackingId (PAYMENT_TRANS.pmt_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBmfTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.BmfTrackingId = value;
  }
  /** Retrieve filter for field: BmfTrackingId (PAYMENT_TRANS.pmt_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBmfTrackingIdFilter () {
    return this.BmfTrackingId;
  }

  /**
   * Retrieves the BmfTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BmfTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTrackingIdFilter field
   */
  public String[] getBmfTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBmfTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BmfTrackingIdFilter filter value from a formatted string
   *
   * @param _value the BmfTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BmfTrackingIdFilter filter field
   */
  public void setBmfTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfTrackingIdFilterFromFormattedString");
    try {
      this.setBmfTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BmfTrackingIdServ (PAYMENT_TRANS.pmt_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setBmfTrackingIdServFetch (boolean fetch) {
    this.BmfTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: BmfTrackingIdServ (PAYMENT_TRANS.pmt_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getBmfTrackingIdServFetch () {
    return this.BmfTrackingIdServFetch;
  }
  /** Set the SortOrder for field: BmfTrackingIdServ (PAYMENT_TRANS.pmt_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBmfTrackingIdServSortOrder (Integer value) {
    this.BmfTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: BmfTrackingIdServ (PAYMENT_TRANS.pmt_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBmfTrackingIdServSortOrder () {
    return this.BmfTrackingIdServSort;
  }
  /** Set the sort direction for field: BmfTrackingIdServ (PAYMENT_TRANS.pmt_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBmfTrackingIdServSortDirection (boolean ascending) {
    this.BmfTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BmfTrackingIdServ (PAYMENT_TRANS.pmt_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBmfTrackingIdServSortDirection () {
    return this.BmfTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: BmfTrackingIdServ (PAYMENT_TRANS.pmt_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBmfTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.BmfTrackingIdServ = value;
  }
  /** Retrieve filter for field: BmfTrackingIdServ (PAYMENT_TRANS.pmt_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBmfTrackingIdServFilter () {
    return this.BmfTrackingIdServ;
  }

  /**
   * Retrieves the BmfTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BmfTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTrackingIdServFilter field
   */
  public String[] getBmfTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBmfTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BmfTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the BmfTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BmfTrackingIdServFilter filter field
   */
  public void setBmfTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfTrackingIdServFilterFromFormattedString");
    try {
      this.setBmfTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTrackingIdServFilterFromFormattedString");
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


  /** Set the field level Fetch value for field: EftTransType (PAYMENT_TRANS.trans_type)
   * @param fetch whether to fetch this field or not
   */
  public void setEftTransTypeFetch (boolean fetch) {
    this.EftTransTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: EftTransType (PAYMENT_TRANS.trans_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getEftTransTypeFetch () {
    return this.EftTransTypeFetch;
  }
  /** Set the SortOrder for field: EftTransType (PAYMENT_TRANS.trans_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEftTransTypeSortOrder (Integer value) {
    this.EftTransTypeSort = value;
  }
  /** Retrieve SortOrder for field: EftTransType (PAYMENT_TRANS.trans_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEftTransTypeSortOrder () {
    return this.EftTransTypeSort;
  }
  /** Set the sort direction for field: EftTransType (PAYMENT_TRANS.trans_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEftTransTypeSortDirection (boolean ascending) {
    this.EftTransTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EftTransType (PAYMENT_TRANS.trans_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEftTransTypeSortDirection () {
    return this.EftTransTypeSortAscending;
  }
  /** Set the field level filters for field: EftTransType (PAYMENT_TRANS.trans_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEftTransTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.EftTransType = value;
  }
  /** Retrieve filter for field: EftTransType (PAYMENT_TRANS.trans_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEftTransTypeFilter () {
    return this.EftTransType;
  }

  /**
   * Retrieves the EftTransTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EftTransTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EftTransTypeFilter field
   */
  public String[] getEftTransTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEftTransTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEftTransTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEftTransTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EftTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEftTransTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EftTransTypeFilter filter value from a formatted string
   *
   * @param _value the EftTransTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EftTransTypeFilter filter field
   */
  public void setEftTransTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEftTransTypeFilterFromFormattedString");
    try {
      this.setEftTransTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EftTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEftTransTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEftTransTypeFilterFromFormattedString");
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


  /** Set the field level Fetch value for field: EftTransStatus (PAYMENT_TRANS.trans_status)
   * @param fetch whether to fetch this field or not
   */
  public void setEftTransStatusFetch (boolean fetch) {
    this.EftTransStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: EftTransStatus (PAYMENT_TRANS.trans_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getEftTransStatusFetch () {
    return this.EftTransStatusFetch;
  }
  /** Set the SortOrder for field: EftTransStatus (PAYMENT_TRANS.trans_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEftTransStatusSortOrder (Integer value) {
    this.EftTransStatusSort = value;
  }
  /** Retrieve SortOrder for field: EftTransStatus (PAYMENT_TRANS.trans_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEftTransStatusSortOrder () {
    return this.EftTransStatusSort;
  }
  /** Set the sort direction for field: EftTransStatus (PAYMENT_TRANS.trans_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEftTransStatusSortDirection (boolean ascending) {
    this.EftTransStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EftTransStatus (PAYMENT_TRANS.trans_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEftTransStatusSortDirection () {
    return this.EftTransStatusSortAscending;
  }
  /** Set the field level filters for field: EftTransStatus (PAYMENT_TRANS.trans_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEftTransStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.EftTransStatus = value;
  }
  /** Retrieve filter for field: EftTransStatus (PAYMENT_TRANS.trans_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEftTransStatusFilter () {
    return this.EftTransStatus;
  }

  /**
   * Retrieves the EftTransStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EftTransStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EftTransStatusFilter field
   */
  public String[] getEftTransStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEftTransStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEftTransStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEftTransStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EftTransStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEftTransStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EftTransStatusFilter filter value from a formatted string
   *
   * @param _value the EftTransStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EftTransStatusFilter filter field
   */
  public void setEftTransStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEftTransStatusFilterFromFormattedString");
    try {
      this.setEftTransStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EftTransStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEftTransStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEftTransStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountExternalIdFetch (boolean fetch) {
    this.AccountExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountExternalIdFetch () {
    return this.AccountExternalIdFetch;
  }
  /** Set the SortOrder for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountExternalIdSortOrder (Integer value) {
    this.AccountExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountExternalIdSortOrder () {
    return this.AccountExternalIdSort;
  }
  /** Set the sort direction for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountExternalIdSortDirection (boolean ascending) {
    this.AccountExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountExternalIdSortDirection () {
    return this.AccountExternalIdSortAscending;
  }
  /** Set the case insensitive for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAccountExternalIdCaseInsensitive (boolean ascending) {
    this.AccountExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAccountExternalIdCaseInsensitive () {
    return this.AccountExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.AccountExternalId = value;
  }
  /** Retrieve filter for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAccountExternalIdFilter () {
    return this.AccountExternalId;
  }

  /**
   * Retrieves the AccountExternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountExternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalIdFilter field
   */
  public String[] getAccountExternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountExternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountExternalIdFilter filter value from a formatted string
   *
   * @param _value the AccountExternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountExternalIdFilter filter field
   */
  public void setAccountExternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdFilterFromFormattedString");
    try {
      this.setAccountExternalIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountExternalIdTypeFetch (boolean fetch) {
    this.AccountExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountExternalIdTypeFetch () {
    return this.AccountExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountExternalIdTypeSortOrder (Integer value) {
    this.AccountExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountExternalIdTypeSortOrder () {
    return this.AccountExternalIdTypeSort;
  }
  /** Set the sort direction for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountExternalIdTypeSortDirection (boolean ascending) {
    this.AccountExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountExternalIdTypeSortDirection () {
    return this.AccountExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountExternalIdType = value;
  }
  /** Retrieve filter for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountExternalIdTypeFilter () {
    return this.AccountExternalIdType;
  }

  /**
   * Retrieves the AccountExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalIdTypeFilter field
   */
  public String[] getAccountExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the AccountExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountExternalIdTypeFilter filter field
   */
  public void setAccountExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFilterFromFormattedString");
    try {
      this.setAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdTypeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated AccountExternalIdTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccountExternalIdTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountExternalIdTypeFilter filter field
   */
  public String[] getAccountExternalIdTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getAccountExternalIdTypeFilter(), "ExternalIdType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated AccountExternalIdTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountExternalIdTypeFilter filter field
   */
  public void setAccountExternalIdTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "AccountExternalIdType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdTypeFilterFromDisplayValue");
  }


  public String toString() {
    return EftTransactionObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return EftTransactionObjectHelper.toMap(this, null);
  }
}
