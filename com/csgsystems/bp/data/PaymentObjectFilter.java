/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentObjectFilter.java
 * Definition File: Customer/Payment.xml
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
public class PaymentObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public PaymentObjectKeyFilter Key = null;
  /** raw field for: BMF_TRANS_DESCR.bmf_trans_category) */
  public    IntegerFilter[] TransCategory  = null;
  protected boolean TransCategoryFetch = false;
  protected boolean TransCategorySortAscending = true;
  protected Integer TransCategorySort = null;
  /** raw field for: PAYMENT_TRANS.epg_transaction_id) */
  public    StringFilter[] EpgTransactionId  = null;
  protected boolean EpgTransactionIdFetch = false;
  protected boolean EpgTransactionIdSortAscending = true;
  protected boolean EpgTransactionIdCaseInsensitive = false;
  protected Integer EpgTransactionIdSort = null;
  /** raw field for: BMF.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: BMF.bill_ref_no) */
  public    IntegerFilter[] BillRefNo  = null;
  protected boolean BillRefNoFetch = false;
  protected boolean BillRefNoSortAscending = true;
  protected Integer BillRefNoSort = null;
  /** raw field for: BMF.bill_ref_resets) */
  public    IntegerFilter[] BillRefResets  = null;
  protected boolean BillRefResetsFetch = false;
  protected boolean BillRefResetsSortAscending = true;
  protected Integer BillRefResetsSort = null;
  /** raw field for: BMF.orig_bill_ref_no) */
  public    IntegerFilter[] OrigBillRefNo  = null;
  protected boolean OrigBillRefNoFetch = false;
  protected boolean OrigBillRefNoSortAscending = true;
  protected Integer OrigBillRefNoSort = null;
  /** raw field for: BMF.orig_bill_ref_resets) */
  public    IntegerFilter[] OrigBillRefResets  = null;
  protected boolean OrigBillRefResetsFetch = false;
  protected boolean OrigBillRefResetsSortAscending = true;
  protected Integer OrigBillRefResetsSort = null;
  /** raw field for: BMF.cr_note_bill_ref_no) */
  public    IntegerFilter[] CrNoteBillRefNo  = null;
  protected boolean CrNoteBillRefNoFetch = false;
  protected boolean CrNoteBillRefNoSortAscending = true;
  protected Integer CrNoteBillRefNoSort = null;
  /** raw field for: BMF.cr_note_bill_ref_resets) */
  public    IntegerFilter[] CrNoteBillRefResets  = null;
  protected boolean CrNoteBillRefResetsFetch = false;
  protected boolean CrNoteBillRefResetsSortAscending = true;
  protected Integer CrNoteBillRefResetsSort = null;
  /** raw field for: BMF.bmf_trans_type) */
  public    IntegerFilter[] TransType  = null;
  protected boolean TransTypeFetch = false;
  protected boolean TransTypeSortAscending = true;
  protected Integer TransTypeSort = null;
  /** raw field for: BMF.trans_date) */
  public    DateFilter[] TransDate  = null;
  protected boolean TransDateFetch = false;
  protected boolean TransDateSortAscending = true;
  protected Integer TransDateSort = null;
  /** raw field for: BMF.post_date) */
  public    DateFilter[] PostDate  = null;
  protected boolean PostDateFetch = false;
  protected boolean PostDateSortAscending = true;
  protected Integer PostDateSort = null;
  /** raw field for: BMF.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: BMF.trans_amount) */
  public    BigIntegerFilter[] TransAmount  = null;
  protected boolean TransAmountFetch = false;
  protected boolean TransAmountSortAscending = true;
  protected Integer TransAmountSort = null;
  /** raw field for: BMF.gl_amount) */
  public    BigIntegerFilter[] GlAmount  = null;
  protected boolean GlAmountFetch = false;
  protected boolean GlAmountSortAscending = true;
  protected Integer GlAmountSort = null;
  /** raw field for: BMF.orig_tracking_id) */
  public    IntegerFilter[] OrigTrackingId  = null;
  protected boolean OrigTrackingIdFetch = false;
  protected boolean OrigTrackingIdSortAscending = true;
  protected Integer OrigTrackingIdSort = null;
  /** raw field for: BMF.orig_tracking_id_serv) */
  public    IntegerFilter[] OrigTrackingIdServ  = null;
  protected boolean OrigTrackingIdServFetch = false;
  protected boolean OrigTrackingIdServSortAscending = true;
  protected Integer OrigTrackingIdServSort = null;
  /** raw field for: BMF.trans_source) */
  public    IntegerFilter[] TransSource  = null;
  protected boolean TransSourceFetch = false;
  protected boolean TransSourceSortAscending = true;
  protected Integer TransSourceSort = null;
  /** raw field for: BMF.source_type) */
  public    IntegerFilter[] SourceType  = null;
  protected boolean SourceTypeFetch = false;
  protected boolean SourceTypeSortAscending = true;
  protected Integer SourceTypeSort = null;
  /** raw field for: BMF.source_id) */
  public    IntegerFilter[] SourceId  = null;
  protected boolean SourceIdFetch = false;
  protected boolean SourceIdSortAscending = true;
  protected Integer SourceIdSort = null;
  /** raw field for: BMF.source_id_serv) */
  public    IntegerFilter[] SourceIdServ  = null;
  protected boolean SourceIdServFetch = false;
  protected boolean SourceIdServSortAscending = true;
  protected Integer SourceIdServSort = null;
  /** raw field for: BMF.batch_id) */
  public    StringFilter[] BatchId  = null;
  protected boolean BatchIdFetch = false;
  protected boolean BatchIdSortAscending = true;
  protected boolean BatchIdCaseInsensitive = false;
  protected Integer BatchIdSort = null;
  /** raw field for: BMF.batch_id_serv) */
  public    IntegerFilter[] BatchIdServ  = null;
  protected boolean BatchIdServFetch = false;
  protected boolean BatchIdServSortAscending = true;
  protected Integer BatchIdServSort = null;
  /** raw field for: BMF.trans_submitter) */
  public    StringFilter[] TransSubmitter  = null;
  protected boolean TransSubmitterFetch = false;
  protected boolean TransSubmitterSortAscending = true;
  protected boolean TransSubmitterCaseInsensitive = false;
  protected Integer TransSubmitterSort = null;
  /** raw field for: BMF.chg_date) */
  public    DateFilter[] ChgDate  = null;
  protected boolean ChgDateFetch = false;
  protected boolean ChgDateSortAscending = true;
  protected Integer ChgDateSort = null;
  /** raw field for: BMF.no_bill) */
  public    BooleanFilter[] NoBill  = null;
  protected boolean NoBillFetch = false;
  protected boolean NoBillSortAscending = true;
  protected Integer NoBillSort = null;
  /** raw field for: BMF.action_code) */
  public    StringFilter[] ActionCode  = null;
  protected boolean ActionCodeFetch = false;
  protected boolean ActionCodeSortAscending = true;
  protected boolean ActionCodeCaseInsensitive = false;
  protected Integer ActionCodeSort = null;
  /** raw field for: BMF.micr_bank_id) */
  public    StringFilter[] MicrBankId  = null;
  protected boolean MicrBankIdFetch = false;
  protected boolean MicrBankIdSortAscending = true;
  protected boolean MicrBankIdCaseInsensitive = false;
  protected Integer MicrBankIdSort = null;
  /** raw field for: BMF.micr_dda_num) */
  public    StringFilter[] MicrDdaNum  = null;
  protected boolean MicrDdaNumFetch = false;
  protected boolean MicrDdaNumSortAscending = true;
  protected boolean MicrDdaNumCaseInsensitive = false;
  protected Integer MicrDdaNumSort = null;
  /** raw field for: BMF.micr_check_num) */
  public    StringFilter[] MicrCheckNum  = null;
  protected boolean MicrCheckNumFetch = false;
  protected boolean MicrCheckNumSortAscending = true;
  protected boolean MicrCheckNumCaseInsensitive = false;
  protected Integer MicrCheckNumSort = null;
  /** raw field for: BMF.arch_flag) */
  public    BooleanFilter[] ArchFlag  = null;
  protected boolean ArchFlagFetch = false;
  protected boolean ArchFlagSortAscending = true;
  protected Integer ArchFlagSort = null;
  /** raw field for: BMF.manual_ccauth_code) */
  public    StringFilter[] ManualCcauthCode  = null;
  protected boolean ManualCcauthCodeFetch = false;
  protected boolean ManualCcauthCodeSortAscending = true;
  protected boolean ManualCcauthCodeCaseInsensitive = false;
  protected Integer ManualCcauthCodeSort = null;
  /** raw field for: BMF.manual_ccauth_date) */
  public    StringFilter[] ManualCcauthDate  = null;
  protected boolean ManualCcauthDateFetch = false;
  protected boolean ManualCcauthDateSortAscending = true;
  protected boolean ManualCcauthDateCaseInsensitive = false;
  protected Integer ManualCcauthDateSort = null;
  /** raw field for: BMF.distributed_amount) */
  public    BigIntegerFilter[] DistributedAmount  = null;
  protected boolean DistributedAmountFetch = false;
  protected boolean DistributedAmountSortAscending = true;
  protected Integer DistributedAmountSort = null;
  /** raw field for: BMF.distributed_gl_amount) */
  public    BigIntegerFilter[] DistributedGlAmount  = null;
  protected boolean DistributedGlAmountFetch = false;
  protected boolean DistributedGlAmountSortAscending = true;
  protected Integer DistributedGlAmountSort = null;
  /** raw field for: BMF.file_id) */
  public    IntegerFilter[] FileId  = null;
  protected boolean FileIdFetch = false;
  protected boolean FileIdSortAscending = true;
  protected Integer FileIdSort = null;
  /** raw field for: BMF.response_code) */
  public    StringFilter[] ResponseCode  = null;
  protected boolean ResponseCodeFetch = false;
  protected boolean ResponseCodeSortAscending = true;
  protected boolean ResponseCodeCaseInsensitive = false;
  protected Integer ResponseCodeSort = null;
  /** raw field for: BMF.bill_order_number) */
  public    StringFilter[] BillOrderNumber  = null;
  protected boolean BillOrderNumberFetch = false;
  protected boolean BillOrderNumberSortAscending = true;
  protected boolean BillOrderNumberCaseInsensitive = false;
  protected Integer BillOrderNumberSort = null;
  /** raw field for: BMF.external_amount) */
  public    BigIntegerFilter[] ExternalAmount  = null;
  protected boolean ExternalAmountFetch = false;
  protected boolean ExternalAmountSortAscending = true;
  protected Integer ExternalAmountSort = null;
  /** raw field for: BMF.external_currency) */
  public    IntegerFilter[] ExternalCurrency  = null;
  protected boolean ExternalCurrencyFetch = false;
  protected boolean ExternalCurrencySortAscending = true;
  protected Integer ExternalCurrencySort = null;
  /** raw field for: BMF.open_item_id) */
  public    IntegerFilter[] OpenItemId  = null;
  protected boolean OpenItemIdFetch = false;
  protected boolean OpenItemIdSortAscending = true;
  protected Integer OpenItemIdSort = null;
  /** raw field for: BMF.discount_id) */
  public    IntegerFilter[] DiscountId  = null;
  protected boolean DiscountIdFetch = false;
  protected boolean DiscountIdSortAscending = true;
  protected Integer DiscountIdSort = null;
  /** raw field for: BMF.tax_type_code) */
  public    IntegerFilter[] TaxTypeCode  = null;
  protected boolean TaxTypeCodeFetch = false;
  protected boolean TaxTypeCodeSortAscending = true;
  protected Integer TaxTypeCodeSort = null;
  /** raw field for: BMF.annotation) */
  public    StringFilter[] Annotation  = null;
  protected boolean AnnotationFetch = false;
  protected boolean AnnotationSortAscending = true;
  protected boolean AnnotationCaseInsensitive = false;
  protected Integer AnnotationSort = null;
  /** raw field for: BMF.pay_method) */
  public    IntegerFilter[] PayMethod  = null;
  protected boolean PayMethodFetch = false;
  protected boolean PayMethodSortAscending = true;
  protected Integer PayMethodSort = null;
  /** raw field for: BMF.realtime_indicator) */
  public    IntegerFilter[] RealtimeIndicator  = null;
  protected boolean RealtimeIndicatorFetch = false;
  protected boolean RealtimeIndicatorSortAscending = true;
  protected Integer RealtimeIndicatorSort = null;
  /** raw field for: BMF.payment_profile_id) */
  public    BigIntegerFilter[] PaymentProfileId  = null;
  protected boolean PaymentProfileIdFetch = false;
  protected boolean PaymentProfileIdSortAscending = true;
  protected Integer PaymentProfileIdSort = null;
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
  /** raw field for: PAYMENT_PROFILE.alt_bank_acc_num) */
  public    StringFilter[] AltBankAccNum  = null;
  protected boolean AltBankAccNumFetch = false;
  protected boolean AltBankAccNumSortAscending = true;
  protected boolean AltBankAccNumCaseInsensitive = false;
  protected Integer AltBankAccNumSort = null;
  /** raw field for: PAYMENT_PROFILE.clearing_house_id) */
  public    StringFilter[] ClearingHouseId  = null;
  protected boolean ClearingHouseIdFetch = false;
  protected boolean ClearingHouseIdSortAscending = true;
  protected boolean ClearingHouseIdCaseInsensitive = false;
  protected Integer ClearingHouseIdSort = null;
  /** raw field for: PAYMENT_PROFILE.bank_agency_code) */
  public    StringFilter[] BankAgencyCode  = null;
  protected boolean BankAgencyCodeFetch = false;
  protected boolean BankAgencyCodeSortAscending = true;
  protected boolean BankAgencyCodeCaseInsensitive = false;
  protected Integer BankAgencyCodeSort = null;
  /** raw field for: PAYMENT_PROFILE.bank_agency_name) */
  public    StringFilter[] BankAgencyName  = null;
  protected boolean BankAgencyNameFetch = false;
  protected boolean BankAgencyNameSortAscending = true;
  protected boolean BankAgencyNameCaseInsensitive = false;
  protected Integer BankAgencyNameSort = null;
  /** raw field for: PAYMENT_PROFILE.new_cust_bank_sort_code) */
  public    StringFilter[] NewCustBankSortCode  = null;
  protected boolean NewCustBankSortCodeFetch = false;
  protected boolean NewCustBankSortCodeSortAscending = true;
  protected boolean NewCustBankSortCodeCaseInsensitive = false;
  protected Integer NewCustBankSortCodeSort = null;
  /** raw field for: PAYMENT_PROFILE.bank_code) */
  public    StringFilter[] BankCode  = null;
  protected boolean BankCodeFetch = false;
  protected boolean BankCodeSortAscending = true;
  protected boolean BankCodeCaseInsensitive = false;
  protected Integer BankCodeSort = null;
  /** raw field for: PAYMENT_PROFILE.bank_account_type) */
  public    IntegerFilter[] BankAccountType  = null;
  protected boolean BankAccountTypeFetch = false;
  protected boolean BankAccountTypeSortAscending = true;
  protected Integer BankAccountTypeSort = null;
  /** raw field for: PAYMENT_PROFILE.branch_name) */
  public    StringFilter[] BranchName  = null;
  protected boolean BranchNameFetch = false;
  protected boolean BranchNameSortAscending = true;
  protected boolean BranchNameCaseInsensitive = false;
  protected Integer BranchNameSort = null;
  /** raw field for: PAYMENT_PROFILE.branch_code) */
  public    StringFilter[] BranchCode  = null;
  protected boolean BranchCodeFetch = false;
  protected boolean BranchCodeSortAscending = true;
  protected boolean BranchCodeCaseInsensitive = false;
  protected Integer BranchCodeSort = null;
  /** raw field for: PAYMENT_PROFILE.card_account) */
  public    StringFilter[] CardAccount  = null;
  protected boolean CardAccountFetch = false;
  protected boolean CardAccountSortAscending = true;
  protected boolean CardAccountCaseInsensitive = false;
  protected Integer CardAccountSort = null;
  /** raw field for: PAYMENT_PROFILE.card_carrier) */
  public    StringFilter[] CardCarrier  = null;
  protected boolean CardCarrierFetch = false;
  protected boolean CardCarrierSortAscending = true;
  protected boolean CardCarrierCaseInsensitive = false;
  protected Integer CardCarrierSort = null;
  /** raw field for: PAYMENT_PROFILE.card_expire) */
  public    StringFilter[] CardExpire  = null;
  protected boolean CardExpireFetch = false;
  protected boolean CardExpireSortAscending = true;
  protected boolean CardExpireCaseInsensitive = false;
  protected Integer CardExpireSort = null;
  /** raw field for: PAYMENT_PROFILE.avs_address_id) */
  public    IntegerFilter[] AvsAddressId  = null;
  protected boolean AvsAddressIdFetch = false;
  protected boolean AvsAddressIdSortAscending = true;
  protected Integer AvsAddressIdSort = null;
  /** raw field for: PAYMENT_PROFILE.avs_response_code) */
  public    StringFilter[] AvsResponseCode  = null;
  protected boolean AvsResponseCodeFetch = false;
  protected boolean AvsResponseCodeSortAscending = true;
  protected boolean AvsResponseCodeCaseInsensitive = false;
  protected Integer AvsResponseCodeSort = null;
  /** raw field for: PAYMENT_PROFILE.trans_flag) */
  public    StringFilter[] TransFlag  = null;
  protected boolean TransFlagFetch = false;
  protected boolean TransFlagSortAscending = true;
  protected boolean TransFlagCaseInsensitive = false;
  protected Integer TransFlagSort = null;
  /** raw field for: PAYMENT_PROFILE.cust_bank_acct_type) */
  public    StringFilter[] CustBankAcctType  = null;
  protected boolean CustBankAcctTypeFetch = false;
  protected boolean CustBankAcctTypeSortAscending = true;
  protected boolean CustBankAcctTypeCaseInsensitive = false;
  protected Integer CustBankAcctTypeSort = null;
  /** raw field for: PAYMENT_PROFILE.cust_email) */
  public    StringFilter[] CustEmail  = null;
  protected boolean CustEmailFetch = false;
  protected boolean CustEmailSortAscending = true;
  protected boolean CustEmailCaseInsensitive = false;
  protected Integer CustEmailSort = null;
  /** raw field for: PAYMENT_PROFILE.cust_bill_address) */
  public    StringFilter[] CustBillAddress  = null;
  protected boolean CustBillAddressFetch = false;
  protected boolean CustBillAddressSortAscending = true;
  protected boolean CustBillAddressCaseInsensitive = false;
  protected Integer CustBillAddressSort = null;
  /** raw field for: PAYMENT_PROFILE.cust_bill_city) */
  public    StringFilter[] CustBillCity  = null;
  protected boolean CustBillCityFetch = false;
  protected boolean CustBillCitySortAscending = true;
  protected boolean CustBillCityCaseInsensitive = false;
  protected Integer CustBillCitySort = null;
  /** raw field for: PAYMENT_PROFILE.cust_bill_state) */
  public    StringFilter[] CustBillState  = null;
  protected boolean CustBillStateFetch = false;
  protected boolean CustBillStateSortAscending = true;
  protected boolean CustBillStateCaseInsensitive = false;
  protected Integer CustBillStateSort = null;
  /** raw field for: PAYMENT_PROFILE.cust_bill_zip) */
  public    StringFilter[] CustBillZip  = null;
  protected boolean CustBillZipFetch = false;
  protected boolean CustBillZipSortAscending = true;
  protected boolean CustBillZipCaseInsensitive = false;
  protected Integer CustBillZipSort = null;
  /** raw field for: PAYMENT_PROFILE.cust_bill_country_code) */
  public    IntegerFilter[] CustBillCountryCode  = null;
  protected boolean CustBillCountryCodeFetch = false;
  protected boolean CustBillCountryCodeSortAscending = true;
  protected Integer CustBillCountryCodeSort = null;
  /** raw field for: PAYMENT_PROFILE.driver_license_num) */
  public    StringFilter[] DriverLicenseNum  = null;
  protected boolean DriverLicenseNumFetch = false;
  protected boolean DriverLicenseNumSortAscending = true;
  protected boolean DriverLicenseNumCaseInsensitive = false;
  protected Integer DriverLicenseNumSort = null;
  /** raw field for: PAYMENT_PROFILE.driver_license_state) */
  public    StringFilter[] DriverLicenseState  = null;
  protected boolean DriverLicenseStateFetch = false;
  protected boolean DriverLicenseStateSortAscending = true;
  protected boolean DriverLicenseStateCaseInsensitive = false;
  protected Integer DriverLicenseStateSort = null;
  /** raw field for: PAYMENT_PROFILE.cust_company_name) */
  public    StringFilter[] CustCompanyName  = null;
  protected boolean CustCompanyNameFetch = false;
  protected boolean CustCompanyNameSortAscending = true;
  protected boolean CustCompanyNameCaseInsensitive = false;
  protected Integer CustCompanyNameSort = null;
  /** raw field for: PAYMENT_PROFILE.bill_company_tax_id) */
  public    BigIntegerFilter[] BillCompanyTaxId  = null;
  protected boolean BillCompanyTaxIdFetch = false;
  protected boolean BillCompanyTaxIdSortAscending = true;
  protected Integer BillCompanyTaxIdSort = null;
  /** raw field for: PAYMENT_PROFILE.cust_phone) */
  public    StringFilter[] CustPhone  = null;
  protected boolean CustPhoneFetch = false;
  protected boolean CustPhoneSortAscending = true;
  protected boolean CustPhoneCaseInsensitive = false;
  protected Integer CustPhoneSort = null;
  /** raw field for: PAYMENT_PROFILE.ownr_fname) */
  public    StringFilter[] OwnrFname  = null;
  protected boolean OwnrFnameFetch = false;
  protected boolean OwnrFnameSortAscending = true;
  protected boolean OwnrFnameCaseInsensitive = false;
  protected Integer OwnrFnameSort = null;
  /** raw field for: PAYMENT_PROFILE.ownr_lname) */
  public    StringFilter[] OwnrLname  = null;
  protected boolean OwnrLnameFetch = false;
  protected boolean OwnrLnameSortAscending = true;
  protected boolean OwnrLnameCaseInsensitive = false;
  protected Integer OwnrLnameSort = null;
  /** raw field for: PAYMENT_PROFILE.status) */
  public    IntegerFilter[] Status  = null;
  protected boolean StatusFetch = false;
  protected boolean StatusSortAscending = true;
  protected Integer StatusSort = null;
  /** raw field for: PAYMENT_PROFILE.cyclical_bill_used) */
  public    BooleanFilter[] CyclicalBillUsed  = null;
  protected boolean CyclicalBillUsedFetch = false;
  protected boolean CyclicalBillUsedSortAscending = true;
  protected Integer CyclicalBillUsedSort = null;
  /** raw field for: PAYMENT_PROFILE.is_default) */
  public    BooleanFilter[] IsDefault  = null;
  protected boolean IsDefaultFetch = false;
  protected boolean IsDefaultSortAscending = true;
  protected Integer IsDefaultSort = null;
  /** raw field for: PAYMENT_PROFILE.non_realtime_only) */
  public    BooleanFilter[] NonRealtimeOnly  = null;
  protected boolean NonRealtimeOnlyFetch = false;
  protected boolean NonRealtimeOnlySortAscending = true;
  protected Integer NonRealtimeOnlySort = null;
  /** raw field for: PAYMENT_PROFILE.is_temporary) */
  public    BooleanFilter[] IsTemporary  = null;
  protected boolean IsTemporaryFetch = false;
  protected boolean IsTemporarySortAscending = true;
  protected Integer IsTemporarySort = null;
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
  /** raw field for: PAYMENT_PROFILE.epg_subscription_id) */
  public    StringFilter[] EpgSubscriptionId  = null;
  protected boolean EpgSubscriptionIdFetch = false;
  protected boolean EpgSubscriptionIdSortAscending = true;
  protected boolean EpgSubscriptionIdCaseInsensitive = false;
  protected Integer EpgSubscriptionIdSort = null;
  /** raw field for: PAYMENT_PROFILE.reference_number) */
  public    StringFilter[] ReferenceNumber  = null;
  protected boolean ReferenceNumberFetch = false;
  protected boolean ReferenceNumberSortAscending = true;
  protected boolean ReferenceNumberCaseInsensitive = false;
  protected Integer ReferenceNumberSort = null;
  /** raw field for: PAYMENT_PROFILE.transaction_uuid) */
  public    StringFilter[] TransactionUuid  = null;
  protected boolean TransactionUuidFetch = false;
  protected boolean TransactionUuidSortAscending = true;
  protected boolean TransactionUuidCaseInsensitive = false;
  protected Integer TransactionUuidSort = null;
  /** raw field for: PAYMENT_PROFILE.profile_creation_time) */
  public    DateFilter[] ProfileCreationTime  = null;
  protected boolean ProfileCreationTimeFetch = false;
  protected boolean ProfileCreationTimeSortAscending = true;
  protected Integer ProfileCreationTimeSort = null;
  /** raw field for: PAYMENT_PROFILE.payment_merchant_id) */
  public    IntegerFilter[] PaymentMerchantId  = null;
  protected boolean PaymentMerchantIdFetch = false;
  protected boolean PaymentMerchantIdSortAscending = true;
  protected Integer PaymentMerchantIdSort = null;
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
  /** raw field for: CUSTOMER_ID_ACCT_MAP.is_current) */
  public    BooleanFilter[] IsCurrent  = null;
  protected boolean IsCurrentFetch = false;
  protected boolean IsCurrentSortAscending = true;
  protected Integer IsCurrentSort = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.active_date) */
  public    DateFilter[] ActiveDate  = null;
  protected boolean ActiveDateFetch = false;
  protected boolean ActiveDateSortAscending = true;
  protected Integer ActiveDateSort = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.inactive_date) */
  public    DateFilter[] InactiveDate  = null;
  protected boolean InactiveDateFetch = false;
  protected boolean InactiveDateSortAscending = true;
  protected Integer InactiveDateSort = null;
  private String _objName = "PaymentObjectFilter";
  /** default constructor */
  public PaymentObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public PaymentObjectFilter (PaymentObjectFilter other)
  {
    if (other == null) return;
    this.Key = new PaymentObjectKeyFilter (other.Key);
    this.TransCategory = other.TransCategory;
    this.TransCategoryFetch = other.TransCategoryFetch;
    this.TransCategorySort = other.TransCategorySort;
    this.TransCategorySortAscending = other.TransCategorySortAscending;
    this.EpgTransactionId = other.EpgTransactionId;
    this.EpgTransactionIdFetch = other.EpgTransactionIdFetch;
    this.EpgTransactionIdSort = other.EpgTransactionIdSort;
    this.EpgTransactionIdCaseInsensitive = other.EpgTransactionIdCaseInsensitive;
    this.EpgTransactionIdSortAscending = other.EpgTransactionIdSortAscending;
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
    this.OrigBillRefNo = other.OrigBillRefNo;
    this.OrigBillRefNoFetch = other.OrigBillRefNoFetch;
    this.OrigBillRefNoSort = other.OrigBillRefNoSort;
    this.OrigBillRefNoSortAscending = other.OrigBillRefNoSortAscending;
    this.OrigBillRefResets = other.OrigBillRefResets;
    this.OrigBillRefResetsFetch = other.OrigBillRefResetsFetch;
    this.OrigBillRefResetsSort = other.OrigBillRefResetsSort;
    this.OrigBillRefResetsSortAscending = other.OrigBillRefResetsSortAscending;
    this.CrNoteBillRefNo = other.CrNoteBillRefNo;
    this.CrNoteBillRefNoFetch = other.CrNoteBillRefNoFetch;
    this.CrNoteBillRefNoSort = other.CrNoteBillRefNoSort;
    this.CrNoteBillRefNoSortAscending = other.CrNoteBillRefNoSortAscending;
    this.CrNoteBillRefResets = other.CrNoteBillRefResets;
    this.CrNoteBillRefResetsFetch = other.CrNoteBillRefResetsFetch;
    this.CrNoteBillRefResetsSort = other.CrNoteBillRefResetsSort;
    this.CrNoteBillRefResetsSortAscending = other.CrNoteBillRefResetsSortAscending;
    this.TransType = other.TransType;
    this.TransTypeFetch = other.TransTypeFetch;
    this.TransTypeSort = other.TransTypeSort;
    this.TransTypeSortAscending = other.TransTypeSortAscending;
    this.TransDate = other.TransDate;
    this.TransDateFetch = other.TransDateFetch;
    this.TransDateSort = other.TransDateSort;
    this.TransDateSortAscending = other.TransDateSortAscending;
    this.PostDate = other.PostDate;
    this.PostDateFetch = other.PostDateFetch;
    this.PostDateSort = other.PostDateSort;
    this.PostDateSortAscending = other.PostDateSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.TransAmount = other.TransAmount;
    this.TransAmountFetch = other.TransAmountFetch;
    this.TransAmountSort = other.TransAmountSort;
    this.TransAmountSortAscending = other.TransAmountSortAscending;
    this.GlAmount = other.GlAmount;
    this.GlAmountFetch = other.GlAmountFetch;
    this.GlAmountSort = other.GlAmountSort;
    this.GlAmountSortAscending = other.GlAmountSortAscending;
    this.OrigTrackingId = other.OrigTrackingId;
    this.OrigTrackingIdFetch = other.OrigTrackingIdFetch;
    this.OrigTrackingIdSort = other.OrigTrackingIdSort;
    this.OrigTrackingIdSortAscending = other.OrigTrackingIdSortAscending;
    this.OrigTrackingIdServ = other.OrigTrackingIdServ;
    this.OrigTrackingIdServFetch = other.OrigTrackingIdServFetch;
    this.OrigTrackingIdServSort = other.OrigTrackingIdServSort;
    this.OrigTrackingIdServSortAscending = other.OrigTrackingIdServSortAscending;
    this.TransSource = other.TransSource;
    this.TransSourceFetch = other.TransSourceFetch;
    this.TransSourceSort = other.TransSourceSort;
    this.TransSourceSortAscending = other.TransSourceSortAscending;
    this.SourceType = other.SourceType;
    this.SourceTypeFetch = other.SourceTypeFetch;
    this.SourceTypeSort = other.SourceTypeSort;
    this.SourceTypeSortAscending = other.SourceTypeSortAscending;
    this.SourceId = other.SourceId;
    this.SourceIdFetch = other.SourceIdFetch;
    this.SourceIdSort = other.SourceIdSort;
    this.SourceIdSortAscending = other.SourceIdSortAscending;
    this.SourceIdServ = other.SourceIdServ;
    this.SourceIdServFetch = other.SourceIdServFetch;
    this.SourceIdServSort = other.SourceIdServSort;
    this.SourceIdServSortAscending = other.SourceIdServSortAscending;
    this.BatchId = other.BatchId;
    this.BatchIdFetch = other.BatchIdFetch;
    this.BatchIdSort = other.BatchIdSort;
    this.BatchIdCaseInsensitive = other.BatchIdCaseInsensitive;
    this.BatchIdSortAscending = other.BatchIdSortAscending;
    this.BatchIdServ = other.BatchIdServ;
    this.BatchIdServFetch = other.BatchIdServFetch;
    this.BatchIdServSort = other.BatchIdServSort;
    this.BatchIdServSortAscending = other.BatchIdServSortAscending;
    this.TransSubmitter = other.TransSubmitter;
    this.TransSubmitterFetch = other.TransSubmitterFetch;
    this.TransSubmitterSort = other.TransSubmitterSort;
    this.TransSubmitterCaseInsensitive = other.TransSubmitterCaseInsensitive;
    this.TransSubmitterSortAscending = other.TransSubmitterSortAscending;
    this.ChgDate = other.ChgDate;
    this.ChgDateFetch = other.ChgDateFetch;
    this.ChgDateSort = other.ChgDateSort;
    this.ChgDateSortAscending = other.ChgDateSortAscending;
    this.NoBill = other.NoBill;
    this.NoBillFetch = other.NoBillFetch;
    this.NoBillSort = other.NoBillSort;
    this.NoBillSortAscending = other.NoBillSortAscending;
    this.ActionCode = other.ActionCode;
    this.ActionCodeFetch = other.ActionCodeFetch;
    this.ActionCodeSort = other.ActionCodeSort;
    this.ActionCodeCaseInsensitive = other.ActionCodeCaseInsensitive;
    this.ActionCodeSortAscending = other.ActionCodeSortAscending;
    this.MicrBankId = other.MicrBankId;
    this.MicrBankIdFetch = other.MicrBankIdFetch;
    this.MicrBankIdSort = other.MicrBankIdSort;
    this.MicrBankIdCaseInsensitive = other.MicrBankIdCaseInsensitive;
    this.MicrBankIdSortAscending = other.MicrBankIdSortAscending;
    this.MicrDdaNum = other.MicrDdaNum;
    this.MicrDdaNumFetch = other.MicrDdaNumFetch;
    this.MicrDdaNumSort = other.MicrDdaNumSort;
    this.MicrDdaNumCaseInsensitive = other.MicrDdaNumCaseInsensitive;
    this.MicrDdaNumSortAscending = other.MicrDdaNumSortAscending;
    this.MicrCheckNum = other.MicrCheckNum;
    this.MicrCheckNumFetch = other.MicrCheckNumFetch;
    this.MicrCheckNumSort = other.MicrCheckNumSort;
    this.MicrCheckNumCaseInsensitive = other.MicrCheckNumCaseInsensitive;
    this.MicrCheckNumSortAscending = other.MicrCheckNumSortAscending;
    this.ArchFlag = other.ArchFlag;
    this.ArchFlagFetch = other.ArchFlagFetch;
    this.ArchFlagSort = other.ArchFlagSort;
    this.ArchFlagSortAscending = other.ArchFlagSortAscending;
    this.ManualCcauthCode = other.ManualCcauthCode;
    this.ManualCcauthCodeFetch = other.ManualCcauthCodeFetch;
    this.ManualCcauthCodeSort = other.ManualCcauthCodeSort;
    this.ManualCcauthCodeCaseInsensitive = other.ManualCcauthCodeCaseInsensitive;
    this.ManualCcauthCodeSortAscending = other.ManualCcauthCodeSortAscending;
    this.ManualCcauthDate = other.ManualCcauthDate;
    this.ManualCcauthDateFetch = other.ManualCcauthDateFetch;
    this.ManualCcauthDateSort = other.ManualCcauthDateSort;
    this.ManualCcauthDateCaseInsensitive = other.ManualCcauthDateCaseInsensitive;
    this.ManualCcauthDateSortAscending = other.ManualCcauthDateSortAscending;
    this.DistributedAmount = other.DistributedAmount;
    this.DistributedAmountFetch = other.DistributedAmountFetch;
    this.DistributedAmountSort = other.DistributedAmountSort;
    this.DistributedAmountSortAscending = other.DistributedAmountSortAscending;
    this.DistributedGlAmount = other.DistributedGlAmount;
    this.DistributedGlAmountFetch = other.DistributedGlAmountFetch;
    this.DistributedGlAmountSort = other.DistributedGlAmountSort;
    this.DistributedGlAmountSortAscending = other.DistributedGlAmountSortAscending;
    this.FileId = other.FileId;
    this.FileIdFetch = other.FileIdFetch;
    this.FileIdSort = other.FileIdSort;
    this.FileIdSortAscending = other.FileIdSortAscending;
    this.ResponseCode = other.ResponseCode;
    this.ResponseCodeFetch = other.ResponseCodeFetch;
    this.ResponseCodeSort = other.ResponseCodeSort;
    this.ResponseCodeCaseInsensitive = other.ResponseCodeCaseInsensitive;
    this.ResponseCodeSortAscending = other.ResponseCodeSortAscending;
    this.BillOrderNumber = other.BillOrderNumber;
    this.BillOrderNumberFetch = other.BillOrderNumberFetch;
    this.BillOrderNumberSort = other.BillOrderNumberSort;
    this.BillOrderNumberCaseInsensitive = other.BillOrderNumberCaseInsensitive;
    this.BillOrderNumberSortAscending = other.BillOrderNumberSortAscending;
    this.ExternalAmount = other.ExternalAmount;
    this.ExternalAmountFetch = other.ExternalAmountFetch;
    this.ExternalAmountSort = other.ExternalAmountSort;
    this.ExternalAmountSortAscending = other.ExternalAmountSortAscending;
    this.ExternalCurrency = other.ExternalCurrency;
    this.ExternalCurrencyFetch = other.ExternalCurrencyFetch;
    this.ExternalCurrencySort = other.ExternalCurrencySort;
    this.ExternalCurrencySortAscending = other.ExternalCurrencySortAscending;
    this.OpenItemId = other.OpenItemId;
    this.OpenItemIdFetch = other.OpenItemIdFetch;
    this.OpenItemIdSort = other.OpenItemIdSort;
    this.OpenItemIdSortAscending = other.OpenItemIdSortAscending;
    this.DiscountId = other.DiscountId;
    this.DiscountIdFetch = other.DiscountIdFetch;
    this.DiscountIdSort = other.DiscountIdSort;
    this.DiscountIdSortAscending = other.DiscountIdSortAscending;
    this.TaxTypeCode = other.TaxTypeCode;
    this.TaxTypeCodeFetch = other.TaxTypeCodeFetch;
    this.TaxTypeCodeSort = other.TaxTypeCodeSort;
    this.TaxTypeCodeSortAscending = other.TaxTypeCodeSortAscending;
    this.Annotation = other.Annotation;
    this.AnnotationFetch = other.AnnotationFetch;
    this.AnnotationSort = other.AnnotationSort;
    this.AnnotationCaseInsensitive = other.AnnotationCaseInsensitive;
    this.AnnotationSortAscending = other.AnnotationSortAscending;
    this.PayMethod = other.PayMethod;
    this.PayMethodFetch = other.PayMethodFetch;
    this.PayMethodSort = other.PayMethodSort;
    this.PayMethodSortAscending = other.PayMethodSortAscending;
    this.RealtimeIndicator = other.RealtimeIndicator;
    this.RealtimeIndicatorFetch = other.RealtimeIndicatorFetch;
    this.RealtimeIndicatorSort = other.RealtimeIndicatorSort;
    this.RealtimeIndicatorSortAscending = other.RealtimeIndicatorSortAscending;
    this.PaymentProfileId = other.PaymentProfileId;
    this.PaymentProfileIdFetch = other.PaymentProfileIdFetch;
    this.PaymentProfileIdSort = other.PaymentProfileIdSort;
    this.PaymentProfileIdSortAscending = other.PaymentProfileIdSortAscending;
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
    this.AltBankAccNum = other.AltBankAccNum;
    this.AltBankAccNumFetch = other.AltBankAccNumFetch;
    this.AltBankAccNumSort = other.AltBankAccNumSort;
    this.AltBankAccNumCaseInsensitive = other.AltBankAccNumCaseInsensitive;
    this.AltBankAccNumSortAscending = other.AltBankAccNumSortAscending;
    this.ClearingHouseId = other.ClearingHouseId;
    this.ClearingHouseIdFetch = other.ClearingHouseIdFetch;
    this.ClearingHouseIdSort = other.ClearingHouseIdSort;
    this.ClearingHouseIdCaseInsensitive = other.ClearingHouseIdCaseInsensitive;
    this.ClearingHouseIdSortAscending = other.ClearingHouseIdSortAscending;
    this.BankAgencyCode = other.BankAgencyCode;
    this.BankAgencyCodeFetch = other.BankAgencyCodeFetch;
    this.BankAgencyCodeSort = other.BankAgencyCodeSort;
    this.BankAgencyCodeCaseInsensitive = other.BankAgencyCodeCaseInsensitive;
    this.BankAgencyCodeSortAscending = other.BankAgencyCodeSortAscending;
    this.BankAgencyName = other.BankAgencyName;
    this.BankAgencyNameFetch = other.BankAgencyNameFetch;
    this.BankAgencyNameSort = other.BankAgencyNameSort;
    this.BankAgencyNameCaseInsensitive = other.BankAgencyNameCaseInsensitive;
    this.BankAgencyNameSortAscending = other.BankAgencyNameSortAscending;
    this.NewCustBankSortCode = other.NewCustBankSortCode;
    this.NewCustBankSortCodeFetch = other.NewCustBankSortCodeFetch;
    this.NewCustBankSortCodeSort = other.NewCustBankSortCodeSort;
    this.NewCustBankSortCodeCaseInsensitive = other.NewCustBankSortCodeCaseInsensitive;
    this.NewCustBankSortCodeSortAscending = other.NewCustBankSortCodeSortAscending;
    this.BankCode = other.BankCode;
    this.BankCodeFetch = other.BankCodeFetch;
    this.BankCodeSort = other.BankCodeSort;
    this.BankCodeCaseInsensitive = other.BankCodeCaseInsensitive;
    this.BankCodeSortAscending = other.BankCodeSortAscending;
    this.BankAccountType = other.BankAccountType;
    this.BankAccountTypeFetch = other.BankAccountTypeFetch;
    this.BankAccountTypeSort = other.BankAccountTypeSort;
    this.BankAccountTypeSortAscending = other.BankAccountTypeSortAscending;
    this.BranchName = other.BranchName;
    this.BranchNameFetch = other.BranchNameFetch;
    this.BranchNameSort = other.BranchNameSort;
    this.BranchNameCaseInsensitive = other.BranchNameCaseInsensitive;
    this.BranchNameSortAscending = other.BranchNameSortAscending;
    this.BranchCode = other.BranchCode;
    this.BranchCodeFetch = other.BranchCodeFetch;
    this.BranchCodeSort = other.BranchCodeSort;
    this.BranchCodeCaseInsensitive = other.BranchCodeCaseInsensitive;
    this.BranchCodeSortAscending = other.BranchCodeSortAscending;
    this.CardAccount = other.CardAccount;
    this.CardAccountFetch = other.CardAccountFetch;
    this.CardAccountSort = other.CardAccountSort;
    this.CardAccountCaseInsensitive = other.CardAccountCaseInsensitive;
    this.CardAccountSortAscending = other.CardAccountSortAscending;
    this.CardCarrier = other.CardCarrier;
    this.CardCarrierFetch = other.CardCarrierFetch;
    this.CardCarrierSort = other.CardCarrierSort;
    this.CardCarrierCaseInsensitive = other.CardCarrierCaseInsensitive;
    this.CardCarrierSortAscending = other.CardCarrierSortAscending;
    this.CardExpire = other.CardExpire;
    this.CardExpireFetch = other.CardExpireFetch;
    this.CardExpireSort = other.CardExpireSort;
    this.CardExpireCaseInsensitive = other.CardExpireCaseInsensitive;
    this.CardExpireSortAscending = other.CardExpireSortAscending;
    this.AvsAddressId = other.AvsAddressId;
    this.AvsAddressIdFetch = other.AvsAddressIdFetch;
    this.AvsAddressIdSort = other.AvsAddressIdSort;
    this.AvsAddressIdSortAscending = other.AvsAddressIdSortAscending;
    this.AvsResponseCode = other.AvsResponseCode;
    this.AvsResponseCodeFetch = other.AvsResponseCodeFetch;
    this.AvsResponseCodeSort = other.AvsResponseCodeSort;
    this.AvsResponseCodeCaseInsensitive = other.AvsResponseCodeCaseInsensitive;
    this.AvsResponseCodeSortAscending = other.AvsResponseCodeSortAscending;
    this.TransFlag = other.TransFlag;
    this.TransFlagFetch = other.TransFlagFetch;
    this.TransFlagSort = other.TransFlagSort;
    this.TransFlagCaseInsensitive = other.TransFlagCaseInsensitive;
    this.TransFlagSortAscending = other.TransFlagSortAscending;
    this.CustBankAcctType = other.CustBankAcctType;
    this.CustBankAcctTypeFetch = other.CustBankAcctTypeFetch;
    this.CustBankAcctTypeSort = other.CustBankAcctTypeSort;
    this.CustBankAcctTypeCaseInsensitive = other.CustBankAcctTypeCaseInsensitive;
    this.CustBankAcctTypeSortAscending = other.CustBankAcctTypeSortAscending;
    this.CustEmail = other.CustEmail;
    this.CustEmailFetch = other.CustEmailFetch;
    this.CustEmailSort = other.CustEmailSort;
    this.CustEmailCaseInsensitive = other.CustEmailCaseInsensitive;
    this.CustEmailSortAscending = other.CustEmailSortAscending;
    this.CustBillAddress = other.CustBillAddress;
    this.CustBillAddressFetch = other.CustBillAddressFetch;
    this.CustBillAddressSort = other.CustBillAddressSort;
    this.CustBillAddressCaseInsensitive = other.CustBillAddressCaseInsensitive;
    this.CustBillAddressSortAscending = other.CustBillAddressSortAscending;
    this.CustBillCity = other.CustBillCity;
    this.CustBillCityFetch = other.CustBillCityFetch;
    this.CustBillCitySort = other.CustBillCitySort;
    this.CustBillCityCaseInsensitive = other.CustBillCityCaseInsensitive;
    this.CustBillCitySortAscending = other.CustBillCitySortAscending;
    this.CustBillState = other.CustBillState;
    this.CustBillStateFetch = other.CustBillStateFetch;
    this.CustBillStateSort = other.CustBillStateSort;
    this.CustBillStateCaseInsensitive = other.CustBillStateCaseInsensitive;
    this.CustBillStateSortAscending = other.CustBillStateSortAscending;
    this.CustBillZip = other.CustBillZip;
    this.CustBillZipFetch = other.CustBillZipFetch;
    this.CustBillZipSort = other.CustBillZipSort;
    this.CustBillZipCaseInsensitive = other.CustBillZipCaseInsensitive;
    this.CustBillZipSortAscending = other.CustBillZipSortAscending;
    this.CustBillCountryCode = other.CustBillCountryCode;
    this.CustBillCountryCodeFetch = other.CustBillCountryCodeFetch;
    this.CustBillCountryCodeSort = other.CustBillCountryCodeSort;
    this.CustBillCountryCodeSortAscending = other.CustBillCountryCodeSortAscending;
    this.DriverLicenseNum = other.DriverLicenseNum;
    this.DriverLicenseNumFetch = other.DriverLicenseNumFetch;
    this.DriverLicenseNumSort = other.DriverLicenseNumSort;
    this.DriverLicenseNumCaseInsensitive = other.DriverLicenseNumCaseInsensitive;
    this.DriverLicenseNumSortAscending = other.DriverLicenseNumSortAscending;
    this.DriverLicenseState = other.DriverLicenseState;
    this.DriverLicenseStateFetch = other.DriverLicenseStateFetch;
    this.DriverLicenseStateSort = other.DriverLicenseStateSort;
    this.DriverLicenseStateCaseInsensitive = other.DriverLicenseStateCaseInsensitive;
    this.DriverLicenseStateSortAscending = other.DriverLicenseStateSortAscending;
    this.CustCompanyName = other.CustCompanyName;
    this.CustCompanyNameFetch = other.CustCompanyNameFetch;
    this.CustCompanyNameSort = other.CustCompanyNameSort;
    this.CustCompanyNameCaseInsensitive = other.CustCompanyNameCaseInsensitive;
    this.CustCompanyNameSortAscending = other.CustCompanyNameSortAscending;
    this.BillCompanyTaxId = other.BillCompanyTaxId;
    this.BillCompanyTaxIdFetch = other.BillCompanyTaxIdFetch;
    this.BillCompanyTaxIdSort = other.BillCompanyTaxIdSort;
    this.BillCompanyTaxIdSortAscending = other.BillCompanyTaxIdSortAscending;
    this.CustPhone = other.CustPhone;
    this.CustPhoneFetch = other.CustPhoneFetch;
    this.CustPhoneSort = other.CustPhoneSort;
    this.CustPhoneCaseInsensitive = other.CustPhoneCaseInsensitive;
    this.CustPhoneSortAscending = other.CustPhoneSortAscending;
    this.OwnrFname = other.OwnrFname;
    this.OwnrFnameFetch = other.OwnrFnameFetch;
    this.OwnrFnameSort = other.OwnrFnameSort;
    this.OwnrFnameCaseInsensitive = other.OwnrFnameCaseInsensitive;
    this.OwnrFnameSortAscending = other.OwnrFnameSortAscending;
    this.OwnrLname = other.OwnrLname;
    this.OwnrLnameFetch = other.OwnrLnameFetch;
    this.OwnrLnameSort = other.OwnrLnameSort;
    this.OwnrLnameCaseInsensitive = other.OwnrLnameCaseInsensitive;
    this.OwnrLnameSortAscending = other.OwnrLnameSortAscending;
    this.Status = other.Status;
    this.StatusFetch = other.StatusFetch;
    this.StatusSort = other.StatusSort;
    this.StatusSortAscending = other.StatusSortAscending;
    this.CyclicalBillUsed = other.CyclicalBillUsed;
    this.CyclicalBillUsedFetch = other.CyclicalBillUsedFetch;
    this.CyclicalBillUsedSort = other.CyclicalBillUsedSort;
    this.CyclicalBillUsedSortAscending = other.CyclicalBillUsedSortAscending;
    this.IsDefault = other.IsDefault;
    this.IsDefaultFetch = other.IsDefaultFetch;
    this.IsDefaultSort = other.IsDefaultSort;
    this.IsDefaultSortAscending = other.IsDefaultSortAscending;
    this.NonRealtimeOnly = other.NonRealtimeOnly;
    this.NonRealtimeOnlyFetch = other.NonRealtimeOnlyFetch;
    this.NonRealtimeOnlySort = other.NonRealtimeOnlySort;
    this.NonRealtimeOnlySortAscending = other.NonRealtimeOnlySortAscending;
    this.IsTemporary = other.IsTemporary;
    this.IsTemporaryFetch = other.IsTemporaryFetch;
    this.IsTemporarySort = other.IsTemporarySort;
    this.IsTemporarySortAscending = other.IsTemporarySortAscending;
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
    this.EpgSubscriptionId = other.EpgSubscriptionId;
    this.EpgSubscriptionIdFetch = other.EpgSubscriptionIdFetch;
    this.EpgSubscriptionIdSort = other.EpgSubscriptionIdSort;
    this.EpgSubscriptionIdCaseInsensitive = other.EpgSubscriptionIdCaseInsensitive;
    this.EpgSubscriptionIdSortAscending = other.EpgSubscriptionIdSortAscending;
    this.ReferenceNumber = other.ReferenceNumber;
    this.ReferenceNumberFetch = other.ReferenceNumberFetch;
    this.ReferenceNumberSort = other.ReferenceNumberSort;
    this.ReferenceNumberCaseInsensitive = other.ReferenceNumberCaseInsensitive;
    this.ReferenceNumberSortAscending = other.ReferenceNumberSortAscending;
    this.TransactionUuid = other.TransactionUuid;
    this.TransactionUuidFetch = other.TransactionUuidFetch;
    this.TransactionUuidSort = other.TransactionUuidSort;
    this.TransactionUuidCaseInsensitive = other.TransactionUuidCaseInsensitive;
    this.TransactionUuidSortAscending = other.TransactionUuidSortAscending;
    this.ProfileCreationTime = other.ProfileCreationTime;
    this.ProfileCreationTimeFetch = other.ProfileCreationTimeFetch;
    this.ProfileCreationTimeSort = other.ProfileCreationTimeSort;
    this.ProfileCreationTimeSortAscending = other.ProfileCreationTimeSortAscending;
    this.PaymentMerchantId = other.PaymentMerchantId;
    this.PaymentMerchantIdFetch = other.PaymentMerchantIdFetch;
    this.PaymentMerchantIdSort = other.PaymentMerchantIdSort;
    this.PaymentMerchantIdSortAscending = other.PaymentMerchantIdSortAscending;
    this.AccountExternalId = other.AccountExternalId;
    this.AccountExternalIdFetch = other.AccountExternalIdFetch;
    this.AccountExternalIdSort = other.AccountExternalIdSort;
    this.AccountExternalIdCaseInsensitive = other.AccountExternalIdCaseInsensitive;
    this.AccountExternalIdSortAscending = other.AccountExternalIdSortAscending;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this.AccountExternalIdTypeFetch = other.AccountExternalIdTypeFetch;
    this.AccountExternalIdTypeSort = other.AccountExternalIdTypeSort;
    this.AccountExternalIdTypeSortAscending = other.AccountExternalIdTypeSortAscending;
    this.IsCurrent = other.IsCurrent;
    this.IsCurrentFetch = other.IsCurrentFetch;
    this.IsCurrentSort = other.IsCurrentSort;
    this.IsCurrentSortAscending = other.IsCurrentSortAscending;
    this.ActiveDate = other.ActiveDate;
    this.ActiveDateFetch = other.ActiveDateFetch;
    this.ActiveDateSort = other.ActiveDateSort;
    this.ActiveDateSortAscending = other.ActiveDateSortAscending;
    this.InactiveDate = other.InactiveDate;
    this.InactiveDateFetch = other.InactiveDateFetch;
    this.InactiveDateSort = other.InactiveDateSort;
    this.InactiveDateSortAscending = other.InactiveDateSortAscending;  }
  /** get the filter for this object's key
   * @return PaymentObjectKeyFilter
   */
  public PaymentObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (PaymentObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TrackingId (BMF.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PaymentObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (BMF.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (BMF.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PaymentObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (BMF.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (BMF.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PaymentObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (BMF.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (BMF.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PaymentObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (BMF.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (BMF.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PaymentObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (BMF.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (BMF.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PaymentObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (BMF.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (BMF.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PaymentObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (BMF.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (BMF.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PaymentObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (BMF.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: TransCategory (BMF_TRANS_DESCR.bmf_trans_category)
   * @param fetch whether to fetch this field or not
   */
  public void setTransCategoryFetch (boolean fetch) {
    this.TransCategoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransCategory (BMF_TRANS_DESCR.bmf_trans_category)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransCategoryFetch () {
    return this.TransCategoryFetch;
  }
  /** Set the SortOrder for field: TransCategory (BMF_TRANS_DESCR.bmf_trans_category)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransCategorySortOrder (Integer value) {
    this.TransCategorySort = value;
  }
  /** Retrieve SortOrder for field: TransCategory (BMF_TRANS_DESCR.bmf_trans_category)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransCategorySortOrder () {
    return this.TransCategorySort;
  }
  /** Set the sort direction for field: TransCategory (BMF_TRANS_DESCR.bmf_trans_category)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransCategorySortDirection (boolean ascending) {
    this.TransCategorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransCategory (BMF_TRANS_DESCR.bmf_trans_category)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransCategorySortDirection () {
    return this.TransCategorySortAscending;
  }
  /** Set the field level filters for field: TransCategory (BMF_TRANS_DESCR.bmf_trans_category)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransCategoryFilter (IntegerFilter[] value) throws ServiceException {
    this.TransCategory = value;
  }
  /** Retrieve filter for field: TransCategory (BMF_TRANS_DESCR.bmf_trans_category)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTransCategoryFilter () {
    return this.TransCategory;
  }

  /**
   * Retrieves the TransCategoryFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransCategoryFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransCategoryFilter field
   */
  public String[] getTransCategoryFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransCategoryFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransCategoryFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransCategoryFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransCategoryFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransCategoryFilter filter value from a formatted string
   *
   * @param _value the TransCategoryFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransCategoryFilter filter field
   */
  public void setTransCategoryFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransCategoryFilterFromFormattedString");
    try {
      this.setTransCategoryFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransCategoryFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransCategoryFilterFromFormattedString");
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

  /** Set the field level Fetch value for field: AccountInternalId (BMF.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (BMF.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (BMF.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (BMF.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (BMF.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (BMF.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (BMF.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (BMF.account_no)
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

  /** Set the field level Fetch value for field: BillRefNo (BMF.bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefNoFetch (boolean fetch) {
    this.BillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefNo (BMF.bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefNoFetch () {
    return this.BillRefNoFetch;
  }
  /** Set the SortOrder for field: BillRefNo (BMF.bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefNoSortOrder (Integer value) {
    this.BillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: BillRefNo (BMF.bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefNoSortOrder () {
    return this.BillRefNoSort;
  }
  /** Set the sort direction for field: BillRefNo (BMF.bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefNoSortDirection (boolean ascending) {
    this.BillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefNo (BMF.bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefNoSortDirection () {
    return this.BillRefNoSortAscending;
  }
  /** Set the field level filters for field: BillRefNo (BMF.bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefNoFilter (IntegerFilter[] value) throws ServiceException {
    this.BillRefNo = value;
  }
  /** Retrieve filter for field: BillRefNo (BMF.bill_ref_no)
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

  /** Set the field level Fetch value for field: BillRefResets (BMF.bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefResetsFetch (boolean fetch) {
    this.BillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefResets (BMF.bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefResetsFetch () {
    return this.BillRefResetsFetch;
  }
  /** Set the SortOrder for field: BillRefResets (BMF.bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefResetsSortOrder (Integer value) {
    this.BillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: BillRefResets (BMF.bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefResetsSortOrder () {
    return this.BillRefResetsSort;
  }
  /** Set the sort direction for field: BillRefResets (BMF.bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefResetsSortDirection (boolean ascending) {
    this.BillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefResets (BMF.bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefResetsSortDirection () {
    return this.BillRefResetsSortAscending;
  }
  /** Set the field level filters for field: BillRefResets (BMF.bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.BillRefResets = value;
  }
  /** Retrieve filter for field: BillRefResets (BMF.bill_ref_resets)
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

  /** Set the field level Fetch value for field: OrigBillRefNo (BMF.orig_bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigBillRefNoFetch (boolean fetch) {
    this.OrigBillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigBillRefNo (BMF.orig_bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigBillRefNoFetch () {
    return this.OrigBillRefNoFetch;
  }
  /** Set the SortOrder for field: OrigBillRefNo (BMF.orig_bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigBillRefNoSortOrder (Integer value) {
    this.OrigBillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: OrigBillRefNo (BMF.orig_bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigBillRefNoSortOrder () {
    return this.OrigBillRefNoSort;
  }
  /** Set the sort direction for field: OrigBillRefNo (BMF.orig_bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigBillRefNoSortDirection (boolean ascending) {
    this.OrigBillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigBillRefNo (BMF.orig_bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigBillRefNoSortDirection () {
    return this.OrigBillRefNoSortAscending;
  }
  /** Set the field level filters for field: OrigBillRefNo (BMF.orig_bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigBillRefNoFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigBillRefNo = value;
  }
  /** Retrieve filter for field: OrigBillRefNo (BMF.orig_bill_ref_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigBillRefNoFilter () {
    return this.OrigBillRefNo;
  }

  /**
   * Retrieves the OrigBillRefNoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigBillRefNoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBillRefNoFilter field
   */
  public String[] getOrigBillRefNoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefNoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigBillRefNoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBillRefNoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigBillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBillRefNoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigBillRefNoFilter filter value from a formatted string
   *
   * @param _value the OrigBillRefNoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigBillRefNoFilter filter field
   */
  public void setOrigBillRefNoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigBillRefNoFilterFromFormattedString");
    try {
      this.setOrigBillRefNoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigBillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBillRefNoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBillRefNoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OrigBillRefResets (BMF.orig_bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigBillRefResetsFetch (boolean fetch) {
    this.OrigBillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigBillRefResets (BMF.orig_bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigBillRefResetsFetch () {
    return this.OrigBillRefResetsFetch;
  }
  /** Set the SortOrder for field: OrigBillRefResets (BMF.orig_bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigBillRefResetsSortOrder (Integer value) {
    this.OrigBillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: OrigBillRefResets (BMF.orig_bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigBillRefResetsSortOrder () {
    return this.OrigBillRefResetsSort;
  }
  /** Set the sort direction for field: OrigBillRefResets (BMF.orig_bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigBillRefResetsSortDirection (boolean ascending) {
    this.OrigBillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigBillRefResets (BMF.orig_bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigBillRefResetsSortDirection () {
    return this.OrigBillRefResetsSortAscending;
  }
  /** Set the field level filters for field: OrigBillRefResets (BMF.orig_bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigBillRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigBillRefResets = value;
  }
  /** Retrieve filter for field: OrigBillRefResets (BMF.orig_bill_ref_resets)
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

  /** Set the field level Fetch value for field: CrNoteBillRefNo (BMF.cr_note_bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setCrNoteBillRefNoFetch (boolean fetch) {
    this.CrNoteBillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: CrNoteBillRefNo (BMF.cr_note_bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getCrNoteBillRefNoFetch () {
    return this.CrNoteBillRefNoFetch;
  }
  /** Set the SortOrder for field: CrNoteBillRefNo (BMF.cr_note_bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCrNoteBillRefNoSortOrder (Integer value) {
    this.CrNoteBillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: CrNoteBillRefNo (BMF.cr_note_bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCrNoteBillRefNoSortOrder () {
    return this.CrNoteBillRefNoSort;
  }
  /** Set the sort direction for field: CrNoteBillRefNo (BMF.cr_note_bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCrNoteBillRefNoSortDirection (boolean ascending) {
    this.CrNoteBillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CrNoteBillRefNo (BMF.cr_note_bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCrNoteBillRefNoSortDirection () {
    return this.CrNoteBillRefNoSortAscending;
  }
  /** Set the field level filters for field: CrNoteBillRefNo (BMF.cr_note_bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCrNoteBillRefNoFilter (IntegerFilter[] value) throws ServiceException {
    this.CrNoteBillRefNo = value;
  }
  /** Retrieve filter for field: CrNoteBillRefNo (BMF.cr_note_bill_ref_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCrNoteBillRefNoFilter () {
    return this.CrNoteBillRefNo;
  }

  /**
   * Retrieves the CrNoteBillRefNoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CrNoteBillRefNoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CrNoteBillRefNoFilter field
   */
  public String[] getCrNoteBillRefNoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCrNoteBillRefNoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCrNoteBillRefNoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCrNoteBillRefNoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CrNoteBillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCrNoteBillRefNoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CrNoteBillRefNoFilter filter value from a formatted string
   *
   * @param _value the CrNoteBillRefNoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CrNoteBillRefNoFilter filter field
   */
  public void setCrNoteBillRefNoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCrNoteBillRefNoFilterFromFormattedString");
    try {
      this.setCrNoteBillRefNoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CrNoteBillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCrNoteBillRefNoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCrNoteBillRefNoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CrNoteBillRefResets (BMF.cr_note_bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setCrNoteBillRefResetsFetch (boolean fetch) {
    this.CrNoteBillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: CrNoteBillRefResets (BMF.cr_note_bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getCrNoteBillRefResetsFetch () {
    return this.CrNoteBillRefResetsFetch;
  }
  /** Set the SortOrder for field: CrNoteBillRefResets (BMF.cr_note_bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCrNoteBillRefResetsSortOrder (Integer value) {
    this.CrNoteBillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: CrNoteBillRefResets (BMF.cr_note_bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCrNoteBillRefResetsSortOrder () {
    return this.CrNoteBillRefResetsSort;
  }
  /** Set the sort direction for field: CrNoteBillRefResets (BMF.cr_note_bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCrNoteBillRefResetsSortDirection (boolean ascending) {
    this.CrNoteBillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CrNoteBillRefResets (BMF.cr_note_bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCrNoteBillRefResetsSortDirection () {
    return this.CrNoteBillRefResetsSortAscending;
  }
  /** Set the field level filters for field: CrNoteBillRefResets (BMF.cr_note_bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCrNoteBillRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.CrNoteBillRefResets = value;
  }
  /** Retrieve filter for field: CrNoteBillRefResets (BMF.cr_note_bill_ref_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCrNoteBillRefResetsFilter () {
    return this.CrNoteBillRefResets;
  }

  /**
   * Retrieves the CrNoteBillRefResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CrNoteBillRefResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CrNoteBillRefResetsFilter field
   */
  public String[] getCrNoteBillRefResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCrNoteBillRefResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCrNoteBillRefResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCrNoteBillRefResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CrNoteBillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCrNoteBillRefResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CrNoteBillRefResetsFilter filter value from a formatted string
   *
   * @param _value the CrNoteBillRefResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CrNoteBillRefResetsFilter filter field
   */
  public void setCrNoteBillRefResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCrNoteBillRefResetsFilterFromFormattedString");
    try {
      this.setCrNoteBillRefResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CrNoteBillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCrNoteBillRefResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCrNoteBillRefResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransType (BMF.bmf_trans_type)
   * @param fetch whether to fetch this field or not
   */
  public void setTransTypeFetch (boolean fetch) {
    this.TransTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransType (BMF.bmf_trans_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransTypeFetch () {
    return this.TransTypeFetch;
  }
  /** Set the SortOrder for field: TransType (BMF.bmf_trans_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransTypeSortOrder (Integer value) {
    this.TransTypeSort = value;
  }
  /** Retrieve SortOrder for field: TransType (BMF.bmf_trans_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransTypeSortOrder () {
    return this.TransTypeSort;
  }
  /** Set the sort direction for field: TransType (BMF.bmf_trans_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransTypeSortDirection (boolean ascending) {
    this.TransTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransType (BMF.bmf_trans_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransTypeSortDirection () {
    return this.TransTypeSortAscending;
  }
  /** Set the field level filters for field: TransType (BMF.bmf_trans_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.TransType = value;
  }
  /** Retrieve filter for field: TransType (BMF.bmf_trans_type)
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

  /**
   * Retrieves the display value for the enumerated TransTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the TransTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the TransTypeFilter filter field
   */
  public String[] getTransTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getTransTypeFilter(), "PaymentType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated TransTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the TransTypeFilter filter field
   */
  public void setTransTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setTransTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "TransType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransTypeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: TransDate (BMF.trans_date)
   * @param fetch whether to fetch this field or not
   */
  public void setTransDateFetch (boolean fetch) {
    this.TransDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransDate (BMF.trans_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransDateFetch () {
    return this.TransDateFetch;
  }
  /** Set the SortOrder for field: TransDate (BMF.trans_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransDateSortOrder (Integer value) {
    this.TransDateSort = value;
  }
  /** Retrieve SortOrder for field: TransDate (BMF.trans_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransDateSortOrder () {
    return this.TransDateSort;
  }
  /** Set the sort direction for field: TransDate (BMF.trans_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransDateSortDirection (boolean ascending) {
    this.TransDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransDate (BMF.trans_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransDateSortDirection () {
    return this.TransDateSortAscending;
  }
  /** Set the field level filters for field: TransDate (BMF.trans_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransDateFilter (DateFilter[] value) throws ServiceException {
    this.TransDate = value;
  }
  /** Retrieve filter for field: TransDate (BMF.trans_date)
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


  /** Set the field level Fetch value for field: PostDate (BMF.post_date)
   * @param fetch whether to fetch this field or not
   */
  public void setPostDateFetch (boolean fetch) {
    this.PostDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: PostDate (BMF.post_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getPostDateFetch () {
    return this.PostDateFetch;
  }
  /** Set the SortOrder for field: PostDate (BMF.post_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPostDateSortOrder (Integer value) {
    this.PostDateSort = value;
  }
  /** Retrieve SortOrder for field: PostDate (BMF.post_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPostDateSortOrder () {
    return this.PostDateSort;
  }
  /** Set the sort direction for field: PostDate (BMF.post_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPostDateSortDirection (boolean ascending) {
    this.PostDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PostDate (BMF.post_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPostDateSortDirection () {
    return this.PostDateSortAscending;
  }
  /** Set the field level filters for field: PostDate (BMF.post_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPostDateFilter (DateFilter[] value) throws ServiceException {
    this.PostDate = value;
  }
  /** Retrieve filter for field: PostDate (BMF.post_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPostDateFilter () {
    return this.PostDate;
  }

  /**
   * Retrieves the PostDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PostDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PostDateFilter field
   */
  public String[] getPostDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPostDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPostDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PostDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPostDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PostDateFilter filter value from a formatted string
   *
   * @param _value the PostDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PostDateFilter filter field
   */
  public void setPostDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPostDateFilterFromFormattedString");
    try {
      this.setPostDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PostDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPostDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPostDateFilterFromFormattedString");
  }

  /**
   * Retrieves the PostDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PostDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PostDateFilter field
   */
  public String[] getPostDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPostDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPostDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PostDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPostDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PostDateFilter filter value from a formatted string
   *
   * @param _value the PostDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PostDateFilter filter field
   */
  public void setPostDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPostDateFilterFromFormattedDateTimeString");
    try {
      this.setPostDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PostDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPostDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPostDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: CurrencyCode (BMF.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (BMF.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (BMF.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (BMF.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (BMF.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (BMF.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (BMF.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (BMF.currency_code)
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


  /** Set the field level Fetch value for field: TransAmount (BMF.trans_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setTransAmountFetch (boolean fetch) {
    this.TransAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransAmount (BMF.trans_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransAmountFetch () {
    return this.TransAmountFetch;
  }
  /** Set the SortOrder for field: TransAmount (BMF.trans_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransAmountSortOrder (Integer value) {
    this.TransAmountSort = value;
  }
  /** Retrieve SortOrder for field: TransAmount (BMF.trans_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransAmountSortOrder () {
    return this.TransAmountSort;
  }
  /** Set the sort direction for field: TransAmount (BMF.trans_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransAmountSortDirection (boolean ascending) {
    this.TransAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransAmount (BMF.trans_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransAmountSortDirection () {
    return this.TransAmountSortAscending;
  }
  /** Set the field level filters for field: TransAmount (BMF.trans_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.TransAmount = value;
  }
  /** Retrieve filter for field: TransAmount (BMF.trans_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTransAmountFilter () {
    return this.TransAmount;
  }

  /**
   * Retrieves the TransAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransAmountFilter field
   */
  public String[] getTransAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransAmountFilter filter value from a formatted string
   *
   * @param _value the TransAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransAmountFilter filter field
   */
  public void setTransAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransAmountFilterFromFormattedString");
    try {
      this.setTransAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransAmountFilterFromFormattedString");
  }

  /**
   * Sets the TransAmountFilter filter value from a formatted string
   *
   * @param _value the TransAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransAmountFilter filter field
   */
  public void setTransAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransAmountFilterFromFormattedCurrencyString");
    try {
      this.setTransAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the TransAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransAmountFilter field
   */

  public String[] getTransAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: GlAmount (BMF.gl_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setGlAmountFetch (boolean fetch) {
    this.GlAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: GlAmount (BMF.gl_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getGlAmountFetch () {
    return this.GlAmountFetch;
  }
  /** Set the SortOrder for field: GlAmount (BMF.gl_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGlAmountSortOrder (Integer value) {
    this.GlAmountSort = value;
  }
  /** Retrieve SortOrder for field: GlAmount (BMF.gl_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGlAmountSortOrder () {
    return this.GlAmountSort;
  }
  /** Set the sort direction for field: GlAmount (BMF.gl_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGlAmountSortDirection (boolean ascending) {
    this.GlAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GlAmount (BMF.gl_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGlAmountSortDirection () {
    return this.GlAmountSortAscending;
  }
  /** Set the field level filters for field: GlAmount (BMF.gl_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGlAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.GlAmount = value;
  }
  /** Retrieve filter for field: GlAmount (BMF.gl_amount)
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


  /** Set the field level Fetch value for field: OrigTrackingId (BMF.orig_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigTrackingIdFetch (boolean fetch) {
    this.OrigTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigTrackingId (BMF.orig_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigTrackingIdFetch () {
    return this.OrigTrackingIdFetch;
  }
  /** Set the SortOrder for field: OrigTrackingId (BMF.orig_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigTrackingIdSortOrder (Integer value) {
    this.OrigTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: OrigTrackingId (BMF.orig_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigTrackingIdSortOrder () {
    return this.OrigTrackingIdSort;
  }
  /** Set the sort direction for field: OrigTrackingId (BMF.orig_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigTrackingIdSortDirection (boolean ascending) {
    this.OrigTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigTrackingId (BMF.orig_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigTrackingIdSortDirection () {
    return this.OrigTrackingIdSortAscending;
  }
  /** Set the field level filters for field: OrigTrackingId (BMF.orig_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigTrackingId = value;
  }
  /** Retrieve filter for field: OrigTrackingId (BMF.orig_tracking_id)
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

  /** Set the field level Fetch value for field: OrigTrackingIdServ (BMF.orig_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigTrackingIdServFetch (boolean fetch) {
    this.OrigTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigTrackingIdServ (BMF.orig_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigTrackingIdServFetch () {
    return this.OrigTrackingIdServFetch;
  }
  /** Set the SortOrder for field: OrigTrackingIdServ (BMF.orig_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigTrackingIdServSortOrder (Integer value) {
    this.OrigTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: OrigTrackingIdServ (BMF.orig_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigTrackingIdServSortOrder () {
    return this.OrigTrackingIdServSort;
  }
  /** Set the sort direction for field: OrigTrackingIdServ (BMF.orig_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigTrackingIdServSortDirection (boolean ascending) {
    this.OrigTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigTrackingIdServ (BMF.orig_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigTrackingIdServSortDirection () {
    return this.OrigTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: OrigTrackingIdServ (BMF.orig_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigTrackingIdServ = value;
  }
  /** Retrieve filter for field: OrigTrackingIdServ (BMF.orig_tracking_id_serv)
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

  /** Set the field level Fetch value for field: TransSource (BMF.trans_source)
   * @param fetch whether to fetch this field or not
   */
  public void setTransSourceFetch (boolean fetch) {
    this.TransSourceFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransSource (BMF.trans_source)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransSourceFetch () {
    return this.TransSourceFetch;
  }
  /** Set the SortOrder for field: TransSource (BMF.trans_source)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransSourceSortOrder (Integer value) {
    this.TransSourceSort = value;
  }
  /** Retrieve SortOrder for field: TransSource (BMF.trans_source)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransSourceSortOrder () {
    return this.TransSourceSort;
  }
  /** Set the sort direction for field: TransSource (BMF.trans_source)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransSourceSortDirection (boolean ascending) {
    this.TransSourceSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransSource (BMF.trans_source)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransSourceSortDirection () {
    return this.TransSourceSortAscending;
  }
  /** Set the field level filters for field: TransSource (BMF.trans_source)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransSourceFilter (IntegerFilter[] value) throws ServiceException {
    this.TransSource = value;
  }
  /** Retrieve filter for field: TransSource (BMF.trans_source)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTransSourceFilter () {
    return this.TransSource;
  }

  /**
   * Retrieves the TransSourceFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransSourceFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransSourceFilter field
   */
  public String[] getTransSourceFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSourceFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransSourceFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSourceFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransSourceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransSourceFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransSourceFilter filter value from a formatted string
   *
   * @param _value the TransSourceFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransSourceFilter filter field
   */
  public void setTransSourceFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransSourceFilterFromFormattedString");
    try {
      this.setTransSourceFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransSourceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransSourceFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransSourceFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated TransSourceFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the TransSourceFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the TransSourceFilter filter field
   */
  public String[] getTransSourceFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSourceFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getTransSourceFilter(), "TransSourceType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSourceFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransSourceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransSourceFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated TransSourceFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the TransSourceFilter filter field
   */
  public void setTransSourceFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransSourceFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setTransSourceFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "TransSource", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransSourceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransSourceFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransSourceFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: SourceType (BMF.source_type)
   * @param fetch whether to fetch this field or not
   */
  public void setSourceTypeFetch (boolean fetch) {
    this.SourceTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: SourceType (BMF.source_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getSourceTypeFetch () {
    return this.SourceTypeFetch;
  }
  /** Set the SortOrder for field: SourceType (BMF.source_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSourceTypeSortOrder (Integer value) {
    this.SourceTypeSort = value;
  }
  /** Retrieve SortOrder for field: SourceType (BMF.source_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSourceTypeSortOrder () {
    return this.SourceTypeSort;
  }
  /** Set the sort direction for field: SourceType (BMF.source_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSourceTypeSortDirection (boolean ascending) {
    this.SourceTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SourceType (BMF.source_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSourceTypeSortDirection () {
    return this.SourceTypeSortAscending;
  }
  /** Set the field level filters for field: SourceType (BMF.source_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSourceTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.SourceType = value;
  }
  /** Retrieve filter for field: SourceType (BMF.source_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSourceTypeFilter () {
    return this.SourceType;
  }

  /**
   * Retrieves the SourceTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SourceTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceTypeFilter field
   */
  public String[] getSourceTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSourceTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SourceTypeFilter filter value from a formatted string
   *
   * @param _value the SourceTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SourceTypeFilter filter field
   */
  public void setSourceTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSourceTypeFilterFromFormattedString");
    try {
      this.setSourceTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceTypeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated SourceTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the SourceTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the SourceTypeFilter filter field
   */
  public String[] getSourceTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getSourceTypeFilter(), "PaymentType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated SourceTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the SourceTypeFilter filter field
   */
  public void setSourceTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSourceTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setSourceTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "SourceType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceTypeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: SourceId (BMF.source_id)
   * @param fetch whether to fetch this field or not
   */
  public void setSourceIdFetch (boolean fetch) {
    this.SourceIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: SourceId (BMF.source_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getSourceIdFetch () {
    return this.SourceIdFetch;
  }
  /** Set the SortOrder for field: SourceId (BMF.source_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSourceIdSortOrder (Integer value) {
    this.SourceIdSort = value;
  }
  /** Retrieve SortOrder for field: SourceId (BMF.source_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSourceIdSortOrder () {
    return this.SourceIdSort;
  }
  /** Set the sort direction for field: SourceId (BMF.source_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSourceIdSortDirection (boolean ascending) {
    this.SourceIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SourceId (BMF.source_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSourceIdSortDirection () {
    return this.SourceIdSortAscending;
  }
  /** Set the field level filters for field: SourceId (BMF.source_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSourceIdFilter (IntegerFilter[] value) throws ServiceException {
    this.SourceId = value;
  }
  /** Retrieve filter for field: SourceId (BMF.source_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSourceIdFilter () {
    return this.SourceId;
  }

  /**
   * Retrieves the SourceIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SourceIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceIdFilter field
   */
  public String[] getSourceIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSourceIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SourceIdFilter filter value from a formatted string
   *
   * @param _value the SourceIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SourceIdFilter filter field
   */
  public void setSourceIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSourceIdFilterFromFormattedString");
    try {
      this.setSourceIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SourceIdServ (BMF.source_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setSourceIdServFetch (boolean fetch) {
    this.SourceIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: SourceIdServ (BMF.source_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getSourceIdServFetch () {
    return this.SourceIdServFetch;
  }
  /** Set the SortOrder for field: SourceIdServ (BMF.source_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSourceIdServSortOrder (Integer value) {
    this.SourceIdServSort = value;
  }
  /** Retrieve SortOrder for field: SourceIdServ (BMF.source_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSourceIdServSortOrder () {
    return this.SourceIdServSort;
  }
  /** Set the sort direction for field: SourceIdServ (BMF.source_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSourceIdServSortDirection (boolean ascending) {
    this.SourceIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SourceIdServ (BMF.source_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSourceIdServSortDirection () {
    return this.SourceIdServSortAscending;
  }
  /** Set the field level filters for field: SourceIdServ (BMF.source_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSourceIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.SourceIdServ = value;
  }
  /** Retrieve filter for field: SourceIdServ (BMF.source_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSourceIdServFilter () {
    return this.SourceIdServ;
  }

  /**
   * Retrieves the SourceIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SourceIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceIdServFilter field
   */
  public String[] getSourceIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSourceIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SourceIdServFilter filter value from a formatted string
   *
   * @param _value the SourceIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SourceIdServFilter filter field
   */
  public void setSourceIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSourceIdServFilterFromFormattedString");
    try {
      this.setSourceIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BatchId (BMF.batch_id)
   * @param fetch whether to fetch this field or not
   */
  public void setBatchIdFetch (boolean fetch) {
    this.BatchIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BatchId (BMF.batch_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getBatchIdFetch () {
    return this.BatchIdFetch;
  }
  /** Set the SortOrder for field: BatchId (BMF.batch_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBatchIdSortOrder (Integer value) {
    this.BatchIdSort = value;
  }
  /** Retrieve SortOrder for field: BatchId (BMF.batch_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBatchIdSortOrder () {
    return this.BatchIdSort;
  }
  /** Set the sort direction for field: BatchId (BMF.batch_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBatchIdSortDirection (boolean ascending) {
    this.BatchIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BatchId (BMF.batch_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBatchIdSortDirection () {
    return this.BatchIdSortAscending;
  }
  /** Set the case insensitive for field: BatchId (BMF.batch_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBatchIdCaseInsensitive (boolean ascending) {
    this.BatchIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BatchId (BMF.batch_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBatchIdCaseInsensitive () {
    return this.BatchIdCaseInsensitive;
  }
  /** Set the field level filters for field: BatchId (BMF.batch_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBatchIdFilter (StringFilter[] value) throws ServiceException {
    this.BatchId = value;
  }
  /** Retrieve filter for field: BatchId (BMF.batch_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBatchIdFilter () {
    return this.BatchId;
  }

  /**
   * Retrieves the BatchIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BatchIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BatchIdFilter field
   */
  public String[] getBatchIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBatchIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBatchIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBatchIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BatchIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBatchIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BatchIdFilter filter value from a formatted string
   *
   * @param _value the BatchIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BatchIdFilter filter field
   */
  public void setBatchIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBatchIdFilterFromFormattedString");
    try {
      this.setBatchIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BatchIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBatchIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBatchIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BatchIdServ (BMF.batch_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setBatchIdServFetch (boolean fetch) {
    this.BatchIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: BatchIdServ (BMF.batch_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getBatchIdServFetch () {
    return this.BatchIdServFetch;
  }
  /** Set the SortOrder for field: BatchIdServ (BMF.batch_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBatchIdServSortOrder (Integer value) {
    this.BatchIdServSort = value;
  }
  /** Retrieve SortOrder for field: BatchIdServ (BMF.batch_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBatchIdServSortOrder () {
    return this.BatchIdServSort;
  }
  /** Set the sort direction for field: BatchIdServ (BMF.batch_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBatchIdServSortDirection (boolean ascending) {
    this.BatchIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BatchIdServ (BMF.batch_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBatchIdServSortDirection () {
    return this.BatchIdServSortAscending;
  }
  /** Set the field level filters for field: BatchIdServ (BMF.batch_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBatchIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.BatchIdServ = value;
  }
  /** Retrieve filter for field: BatchIdServ (BMF.batch_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBatchIdServFilter () {
    return this.BatchIdServ;
  }

  /**
   * Retrieves the BatchIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BatchIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BatchIdServFilter field
   */
  public String[] getBatchIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBatchIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBatchIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBatchIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BatchIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBatchIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BatchIdServFilter filter value from a formatted string
   *
   * @param _value the BatchIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BatchIdServFilter filter field
   */
  public void setBatchIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBatchIdServFilterFromFormattedString");
    try {
      this.setBatchIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BatchIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBatchIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBatchIdServFilterFromFormattedString");
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

  /** Set the field level Fetch value for field: ChgDate (BMF.chg_date)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDateFetch (boolean fetch) {
    this.ChgDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDate (BMF.chg_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDateFetch () {
    return this.ChgDateFetch;
  }
  /** Set the SortOrder for field: ChgDate (BMF.chg_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDateSortOrder (Integer value) {
    this.ChgDateSort = value;
  }
  /** Retrieve SortOrder for field: ChgDate (BMF.chg_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDateSortOrder () {
    return this.ChgDateSort;
  }
  /** Set the sort direction for field: ChgDate (BMF.chg_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDateSortDirection (boolean ascending) {
    this.ChgDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDate (BMF.chg_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDateSortDirection () {
    return this.ChgDateSortAscending;
  }
  /** Set the field level filters for field: ChgDate (BMF.chg_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDateFilter (DateFilter[] value) throws ServiceException {
    this.ChgDate = value;
  }
  /** Retrieve filter for field: ChgDate (BMF.chg_date)
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


  /** Set the field level Fetch value for field: NoBill (BMF.no_bill)
   * @param fetch whether to fetch this field or not
   */
  public void setNoBillFetch (boolean fetch) {
    this.NoBillFetch = fetch;
  }
  /** Retrieve Fetch value for field: NoBill (BMF.no_bill)
   * @return boolean the Fetch value for this field
   */
  public boolean getNoBillFetch () {
    return this.NoBillFetch;
  }
  /** Set the SortOrder for field: NoBill (BMF.no_bill)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNoBillSortOrder (Integer value) {
    this.NoBillSort = value;
  }
  /** Retrieve SortOrder for field: NoBill (BMF.no_bill)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNoBillSortOrder () {
    return this.NoBillSort;
  }
  /** Set the sort direction for field: NoBill (BMF.no_bill)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNoBillSortDirection (boolean ascending) {
    this.NoBillSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NoBill (BMF.no_bill)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNoBillSortDirection () {
    return this.NoBillSortAscending;
  }
  /** Set the field level filters for field: NoBill (BMF.no_bill)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNoBillFilter (BooleanFilter[] value) throws ServiceException {
    this.NoBill = value;
  }
  /** Retrieve filter for field: NoBill (BMF.no_bill)
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

  /** Set the field level Fetch value for field: MicrBankId (BMF.micr_bank_id)
   * @param fetch whether to fetch this field or not
   */
  public void setMicrBankIdFetch (boolean fetch) {
    this.MicrBankIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: MicrBankId (BMF.micr_bank_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getMicrBankIdFetch () {
    return this.MicrBankIdFetch;
  }
  /** Set the SortOrder for field: MicrBankId (BMF.micr_bank_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMicrBankIdSortOrder (Integer value) {
    this.MicrBankIdSort = value;
  }
  /** Retrieve SortOrder for field: MicrBankId (BMF.micr_bank_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMicrBankIdSortOrder () {
    return this.MicrBankIdSort;
  }
  /** Set the sort direction for field: MicrBankId (BMF.micr_bank_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMicrBankIdSortDirection (boolean ascending) {
    this.MicrBankIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MicrBankId (BMF.micr_bank_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMicrBankIdSortDirection () {
    return this.MicrBankIdSortAscending;
  }
  /** Set the case insensitive for field: MicrBankId (BMF.micr_bank_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setMicrBankIdCaseInsensitive (boolean ascending) {
    this.MicrBankIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: MicrBankId (BMF.micr_bank_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getMicrBankIdCaseInsensitive () {
    return this.MicrBankIdCaseInsensitive;
  }
  /** Set the field level filters for field: MicrBankId (BMF.micr_bank_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMicrBankIdFilter (StringFilter[] value) throws ServiceException {
    this.MicrBankId = value;
  }
  /** Retrieve filter for field: MicrBankId (BMF.micr_bank_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getMicrBankIdFilter () {
    return this.MicrBankId;
  }

  /**
   * Retrieves the MicrBankIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MicrBankIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MicrBankIdFilter field
   */
  public String[] getMicrBankIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMicrBankIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMicrBankIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMicrBankIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MicrBankIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMicrBankIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MicrBankIdFilter filter value from a formatted string
   *
   * @param _value the MicrBankIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MicrBankIdFilter filter field
   */
  public void setMicrBankIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMicrBankIdFilterFromFormattedString");
    try {
      this.setMicrBankIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MicrBankIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMicrBankIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMicrBankIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MicrDdaNum (BMF.micr_dda_num)
   * @param fetch whether to fetch this field or not
   */
  public void setMicrDdaNumFetch (boolean fetch) {
    this.MicrDdaNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: MicrDdaNum (BMF.micr_dda_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getMicrDdaNumFetch () {
    return this.MicrDdaNumFetch;
  }
  /** Set the SortOrder for field: MicrDdaNum (BMF.micr_dda_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMicrDdaNumSortOrder (Integer value) {
    this.MicrDdaNumSort = value;
  }
  /** Retrieve SortOrder for field: MicrDdaNum (BMF.micr_dda_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMicrDdaNumSortOrder () {
    return this.MicrDdaNumSort;
  }
  /** Set the sort direction for field: MicrDdaNum (BMF.micr_dda_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMicrDdaNumSortDirection (boolean ascending) {
    this.MicrDdaNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MicrDdaNum (BMF.micr_dda_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMicrDdaNumSortDirection () {
    return this.MicrDdaNumSortAscending;
  }
  /** Set the case insensitive for field: MicrDdaNum (BMF.micr_dda_num)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setMicrDdaNumCaseInsensitive (boolean ascending) {
    this.MicrDdaNumCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: MicrDdaNum (BMF.micr_dda_num)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getMicrDdaNumCaseInsensitive () {
    return this.MicrDdaNumCaseInsensitive;
  }
  /** Set the field level filters for field: MicrDdaNum (BMF.micr_dda_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMicrDdaNumFilter (StringFilter[] value) throws ServiceException {
    this.MicrDdaNum = value;
  }
  /** Retrieve filter for field: MicrDdaNum (BMF.micr_dda_num)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getMicrDdaNumFilter () {
    return this.MicrDdaNum;
  }

  /**
   * Retrieves the MicrDdaNumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MicrDdaNumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MicrDdaNumFilter field
   */
  public String[] getMicrDdaNumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMicrDdaNumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMicrDdaNumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMicrDdaNumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MicrDdaNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMicrDdaNumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MicrDdaNumFilter filter value from a formatted string
   *
   * @param _value the MicrDdaNumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MicrDdaNumFilter filter field
   */
  public void setMicrDdaNumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMicrDdaNumFilterFromFormattedString");
    try {
      this.setMicrDdaNumFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MicrDdaNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMicrDdaNumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMicrDdaNumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MicrCheckNum (BMF.micr_check_num)
   * @param fetch whether to fetch this field or not
   */
  public void setMicrCheckNumFetch (boolean fetch) {
    this.MicrCheckNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: MicrCheckNum (BMF.micr_check_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getMicrCheckNumFetch () {
    return this.MicrCheckNumFetch;
  }
  /** Set the SortOrder for field: MicrCheckNum (BMF.micr_check_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMicrCheckNumSortOrder (Integer value) {
    this.MicrCheckNumSort = value;
  }
  /** Retrieve SortOrder for field: MicrCheckNum (BMF.micr_check_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMicrCheckNumSortOrder () {
    return this.MicrCheckNumSort;
  }
  /** Set the sort direction for field: MicrCheckNum (BMF.micr_check_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMicrCheckNumSortDirection (boolean ascending) {
    this.MicrCheckNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MicrCheckNum (BMF.micr_check_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMicrCheckNumSortDirection () {
    return this.MicrCheckNumSortAscending;
  }
  /** Set the case insensitive for field: MicrCheckNum (BMF.micr_check_num)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setMicrCheckNumCaseInsensitive (boolean ascending) {
    this.MicrCheckNumCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: MicrCheckNum (BMF.micr_check_num)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getMicrCheckNumCaseInsensitive () {
    return this.MicrCheckNumCaseInsensitive;
  }
  /** Set the field level filters for field: MicrCheckNum (BMF.micr_check_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMicrCheckNumFilter (StringFilter[] value) throws ServiceException {
    this.MicrCheckNum = value;
  }
  /** Retrieve filter for field: MicrCheckNum (BMF.micr_check_num)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getMicrCheckNumFilter () {
    return this.MicrCheckNum;
  }

  /**
   * Retrieves the MicrCheckNumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MicrCheckNumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MicrCheckNumFilter field
   */
  public String[] getMicrCheckNumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMicrCheckNumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMicrCheckNumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMicrCheckNumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MicrCheckNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMicrCheckNumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MicrCheckNumFilter filter value from a formatted string
   *
   * @param _value the MicrCheckNumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MicrCheckNumFilter filter field
   */
  public void setMicrCheckNumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMicrCheckNumFilterFromFormattedString");
    try {
      this.setMicrCheckNumFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MicrCheckNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMicrCheckNumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMicrCheckNumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ArchFlag (BMF.arch_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setArchFlagFetch (boolean fetch) {
    this.ArchFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: ArchFlag (BMF.arch_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getArchFlagFetch () {
    return this.ArchFlagFetch;
  }
  /** Set the SortOrder for field: ArchFlag (BMF.arch_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setArchFlagSortOrder (Integer value) {
    this.ArchFlagSort = value;
  }
  /** Retrieve SortOrder for field: ArchFlag (BMF.arch_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getArchFlagSortOrder () {
    return this.ArchFlagSort;
  }
  /** Set the sort direction for field: ArchFlag (BMF.arch_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setArchFlagSortDirection (boolean ascending) {
    this.ArchFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ArchFlag (BMF.arch_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getArchFlagSortDirection () {
    return this.ArchFlagSortAscending;
  }
  /** Set the field level filters for field: ArchFlag (BMF.arch_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setArchFlagFilter (BooleanFilter[] value) throws ServiceException {
    this.ArchFlag = value;
  }
  /** Retrieve filter for field: ArchFlag (BMF.arch_flag)
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

  /** Set the field level Fetch value for field: ManualCcauthCode (BMF.manual_ccauth_code)
   * @param fetch whether to fetch this field or not
   */
  public void setManualCcauthCodeFetch (boolean fetch) {
    this.ManualCcauthCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ManualCcauthCode (BMF.manual_ccauth_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getManualCcauthCodeFetch () {
    return this.ManualCcauthCodeFetch;
  }
  /** Set the SortOrder for field: ManualCcauthCode (BMF.manual_ccauth_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setManualCcauthCodeSortOrder (Integer value) {
    this.ManualCcauthCodeSort = value;
  }
  /** Retrieve SortOrder for field: ManualCcauthCode (BMF.manual_ccauth_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getManualCcauthCodeSortOrder () {
    return this.ManualCcauthCodeSort;
  }
  /** Set the sort direction for field: ManualCcauthCode (BMF.manual_ccauth_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setManualCcauthCodeSortDirection (boolean ascending) {
    this.ManualCcauthCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ManualCcauthCode (BMF.manual_ccauth_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getManualCcauthCodeSortDirection () {
    return this.ManualCcauthCodeSortAscending;
  }
  /** Set the case insensitive for field: ManualCcauthCode (BMF.manual_ccauth_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setManualCcauthCodeCaseInsensitive (boolean ascending) {
    this.ManualCcauthCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ManualCcauthCode (BMF.manual_ccauth_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getManualCcauthCodeCaseInsensitive () {
    return this.ManualCcauthCodeCaseInsensitive;
  }
  /** Set the field level filters for field: ManualCcauthCode (BMF.manual_ccauth_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setManualCcauthCodeFilter (StringFilter[] value) throws ServiceException {
    this.ManualCcauthCode = value;
  }
  /** Retrieve filter for field: ManualCcauthCode (BMF.manual_ccauth_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getManualCcauthCodeFilter () {
    return this.ManualCcauthCode;
  }

  /**
   * Retrieves the ManualCcauthCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ManualCcauthCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ManualCcauthCodeFilter field
   */
  public String[] getManualCcauthCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getManualCcauthCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getManualCcauthCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getManualCcauthCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ManualCcauthCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getManualCcauthCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ManualCcauthCodeFilter filter value from a formatted string
   *
   * @param _value the ManualCcauthCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ManualCcauthCodeFilter filter field
   */
  public void setManualCcauthCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setManualCcauthCodeFilterFromFormattedString");
    try {
      this.setManualCcauthCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ManualCcauthCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setManualCcauthCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setManualCcauthCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ManualCcauthDate (BMF.manual_ccauth_date)
   * @param fetch whether to fetch this field or not
   */
  public void setManualCcauthDateFetch (boolean fetch) {
    this.ManualCcauthDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ManualCcauthDate (BMF.manual_ccauth_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getManualCcauthDateFetch () {
    return this.ManualCcauthDateFetch;
  }
  /** Set the SortOrder for field: ManualCcauthDate (BMF.manual_ccauth_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setManualCcauthDateSortOrder (Integer value) {
    this.ManualCcauthDateSort = value;
  }
  /** Retrieve SortOrder for field: ManualCcauthDate (BMF.manual_ccauth_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getManualCcauthDateSortOrder () {
    return this.ManualCcauthDateSort;
  }
  /** Set the sort direction for field: ManualCcauthDate (BMF.manual_ccauth_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setManualCcauthDateSortDirection (boolean ascending) {
    this.ManualCcauthDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ManualCcauthDate (BMF.manual_ccauth_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getManualCcauthDateSortDirection () {
    return this.ManualCcauthDateSortAscending;
  }
  /** Set the case insensitive for field: ManualCcauthDate (BMF.manual_ccauth_date)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setManualCcauthDateCaseInsensitive (boolean ascending) {
    this.ManualCcauthDateCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ManualCcauthDate (BMF.manual_ccauth_date)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getManualCcauthDateCaseInsensitive () {
    return this.ManualCcauthDateCaseInsensitive;
  }
  /** Set the field level filters for field: ManualCcauthDate (BMF.manual_ccauth_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setManualCcauthDateFilter (StringFilter[] value) throws ServiceException {
    this.ManualCcauthDate = value;
  }
  /** Retrieve filter for field: ManualCcauthDate (BMF.manual_ccauth_date)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getManualCcauthDateFilter () {
    return this.ManualCcauthDate;
  }

  /**
   * Retrieves the ManualCcauthDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ManualCcauthDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ManualCcauthDateFilter field
   */
  public String[] getManualCcauthDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getManualCcauthDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getManualCcauthDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getManualCcauthDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ManualCcauthDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getManualCcauthDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ManualCcauthDateFilter filter value from a formatted string
   *
   * @param _value the ManualCcauthDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ManualCcauthDateFilter filter field
   */
  public void setManualCcauthDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setManualCcauthDateFilterFromFormattedString");
    try {
      this.setManualCcauthDateFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ManualCcauthDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setManualCcauthDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setManualCcauthDateFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DistributedAmount (BMF.distributed_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setDistributedAmountFetch (boolean fetch) {
    this.DistributedAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: DistributedAmount (BMF.distributed_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getDistributedAmountFetch () {
    return this.DistributedAmountFetch;
  }
  /** Set the SortOrder for field: DistributedAmount (BMF.distributed_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDistributedAmountSortOrder (Integer value) {
    this.DistributedAmountSort = value;
  }
  /** Retrieve SortOrder for field: DistributedAmount (BMF.distributed_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDistributedAmountSortOrder () {
    return this.DistributedAmountSort;
  }
  /** Set the sort direction for field: DistributedAmount (BMF.distributed_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDistributedAmountSortDirection (boolean ascending) {
    this.DistributedAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DistributedAmount (BMF.distributed_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDistributedAmountSortDirection () {
    return this.DistributedAmountSortAscending;
  }
  /** Set the field level filters for field: DistributedAmount (BMF.distributed_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDistributedAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.DistributedAmount = value;
  }
  /** Retrieve filter for field: DistributedAmount (BMF.distributed_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getDistributedAmountFilter () {
    return this.DistributedAmount;
  }

  /**
   * Retrieves the DistributedAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DistributedAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DistributedAmountFilter field
   */
  public String[] getDistributedAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistributedAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDistributedAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDistributedAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistributedAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDistributedAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DistributedAmountFilter filter value from a formatted string
   *
   * @param _value the DistributedAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DistributedAmountFilter filter field
   */
  public void setDistributedAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDistributedAmountFilterFromFormattedString");
    try {
      this.setDistributedAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistributedAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDistributedAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDistributedAmountFilterFromFormattedString");
  }

  /**
   * Sets the DistributedAmountFilter filter value from a formatted string
   *
   * @param _value the DistributedAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DistributedAmountFilter filter field
   */
  public void setDistributedAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDistributedAmountFilterFromFormattedCurrencyString");
    try {
      this.setDistributedAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistributedAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDistributedAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDistributedAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the DistributedAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DistributedAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the DistributedAmountFilter field
   */

  public String[] getDistributedAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistributedAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDistributedAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDistributedAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistributedAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDistributedAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: DistributedGlAmount (BMF.distributed_gl_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setDistributedGlAmountFetch (boolean fetch) {
    this.DistributedGlAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: DistributedGlAmount (BMF.distributed_gl_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getDistributedGlAmountFetch () {
    return this.DistributedGlAmountFetch;
  }
  /** Set the SortOrder for field: DistributedGlAmount (BMF.distributed_gl_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDistributedGlAmountSortOrder (Integer value) {
    this.DistributedGlAmountSort = value;
  }
  /** Retrieve SortOrder for field: DistributedGlAmount (BMF.distributed_gl_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDistributedGlAmountSortOrder () {
    return this.DistributedGlAmountSort;
  }
  /** Set the sort direction for field: DistributedGlAmount (BMF.distributed_gl_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDistributedGlAmountSortDirection (boolean ascending) {
    this.DistributedGlAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DistributedGlAmount (BMF.distributed_gl_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDistributedGlAmountSortDirection () {
    return this.DistributedGlAmountSortAscending;
  }
  /** Set the field level filters for field: DistributedGlAmount (BMF.distributed_gl_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDistributedGlAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.DistributedGlAmount = value;
  }
  /** Retrieve filter for field: DistributedGlAmount (BMF.distributed_gl_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getDistributedGlAmountFilter () {
    return this.DistributedGlAmount;
  }

  /**
   * Retrieves the DistributedGlAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DistributedGlAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DistributedGlAmountFilter field
   */
  public String[] getDistributedGlAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistributedGlAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDistributedGlAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDistributedGlAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistributedGlAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDistributedGlAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DistributedGlAmountFilter filter value from a formatted string
   *
   * @param _value the DistributedGlAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DistributedGlAmountFilter filter field
   */
  public void setDistributedGlAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDistributedGlAmountFilterFromFormattedString");
    try {
      this.setDistributedGlAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistributedGlAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDistributedGlAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDistributedGlAmountFilterFromFormattedString");
  }

  /**
   * Sets the DistributedGlAmountFilter filter value from a formatted string
   *
   * @param _value the DistributedGlAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DistributedGlAmountFilter filter field
   */
  public void setDistributedGlAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDistributedGlAmountFilterFromFormattedCurrencyString");
    try {
      this.setDistributedGlAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistributedGlAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDistributedGlAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDistributedGlAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the DistributedGlAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DistributedGlAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the DistributedGlAmountFilter field
   */

  public String[] getDistributedGlAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistributedGlAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDistributedGlAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDistributedGlAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistributedGlAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDistributedGlAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: FileId (BMF.file_id)
   * @param fetch whether to fetch this field or not
   */
  public void setFileIdFetch (boolean fetch) {
    this.FileIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: FileId (BMF.file_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getFileIdFetch () {
    return this.FileIdFetch;
  }
  /** Set the SortOrder for field: FileId (BMF.file_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFileIdSortOrder (Integer value) {
    this.FileIdSort = value;
  }
  /** Retrieve SortOrder for field: FileId (BMF.file_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFileIdSortOrder () {
    return this.FileIdSort;
  }
  /** Set the sort direction for field: FileId (BMF.file_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFileIdSortDirection (boolean ascending) {
    this.FileIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FileId (BMF.file_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFileIdSortDirection () {
    return this.FileIdSortAscending;
  }
  /** Set the field level filters for field: FileId (BMF.file_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFileIdFilter (IntegerFilter[] value) throws ServiceException {
    this.FileId = value;
  }
  /** Retrieve filter for field: FileId (BMF.file_id)
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

  /** Set the field level Fetch value for field: ResponseCode (BMF.response_code)
   * @param fetch whether to fetch this field or not
   */
  public void setResponseCodeFetch (boolean fetch) {
    this.ResponseCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResponseCode (BMF.response_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getResponseCodeFetch () {
    return this.ResponseCodeFetch;
  }
  /** Set the SortOrder for field: ResponseCode (BMF.response_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResponseCodeSortOrder (Integer value) {
    this.ResponseCodeSort = value;
  }
  /** Retrieve SortOrder for field: ResponseCode (BMF.response_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResponseCodeSortOrder () {
    return this.ResponseCodeSort;
  }
  /** Set the sort direction for field: ResponseCode (BMF.response_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResponseCodeSortDirection (boolean ascending) {
    this.ResponseCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResponseCode (BMF.response_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResponseCodeSortDirection () {
    return this.ResponseCodeSortAscending;
  }
  /** Set the case insensitive for field: ResponseCode (BMF.response_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setResponseCodeCaseInsensitive (boolean ascending) {
    this.ResponseCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ResponseCode (BMF.response_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getResponseCodeCaseInsensitive () {
    return this.ResponseCodeCaseInsensitive;
  }
  /** Set the field level filters for field: ResponseCode (BMF.response_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResponseCodeFilter (StringFilter[] value) throws ServiceException {
    this.ResponseCode = value;
  }
  /** Retrieve filter for field: ResponseCode (BMF.response_code)
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

  /** Set the field level Fetch value for field: BillOrderNumber (BMF.bill_order_number)
   * @param fetch whether to fetch this field or not
   */
  public void setBillOrderNumberFetch (boolean fetch) {
    this.BillOrderNumberFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillOrderNumber (BMF.bill_order_number)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillOrderNumberFetch () {
    return this.BillOrderNumberFetch;
  }
  /** Set the SortOrder for field: BillOrderNumber (BMF.bill_order_number)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillOrderNumberSortOrder (Integer value) {
    this.BillOrderNumberSort = value;
  }
  /** Retrieve SortOrder for field: BillOrderNumber (BMF.bill_order_number)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillOrderNumberSortOrder () {
    return this.BillOrderNumberSort;
  }
  /** Set the sort direction for field: BillOrderNumber (BMF.bill_order_number)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillOrderNumberSortDirection (boolean ascending) {
    this.BillOrderNumberSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillOrderNumber (BMF.bill_order_number)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillOrderNumberSortDirection () {
    return this.BillOrderNumberSortAscending;
  }
  /** Set the case insensitive for field: BillOrderNumber (BMF.bill_order_number)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillOrderNumberCaseInsensitive (boolean ascending) {
    this.BillOrderNumberCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillOrderNumber (BMF.bill_order_number)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillOrderNumberCaseInsensitive () {
    return this.BillOrderNumberCaseInsensitive;
  }
  /** Set the field level filters for field: BillOrderNumber (BMF.bill_order_number)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillOrderNumberFilter (StringFilter[] value) throws ServiceException {
    this.BillOrderNumber = value;
  }
  /** Retrieve filter for field: BillOrderNumber (BMF.bill_order_number)
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

  /** Set the field level Fetch value for field: ExternalAmount (BMF.external_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setExternalAmountFetch (boolean fetch) {
    this.ExternalAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExternalAmount (BMF.external_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getExternalAmountFetch () {
    return this.ExternalAmountFetch;
  }
  /** Set the SortOrder for field: ExternalAmount (BMF.external_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExternalAmountSortOrder (Integer value) {
    this.ExternalAmountSort = value;
  }
  /** Retrieve SortOrder for field: ExternalAmount (BMF.external_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExternalAmountSortOrder () {
    return this.ExternalAmountSort;
  }
  /** Set the sort direction for field: ExternalAmount (BMF.external_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExternalAmountSortDirection (boolean ascending) {
    this.ExternalAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExternalAmount (BMF.external_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExternalAmountSortDirection () {
    return this.ExternalAmountSortAscending;
  }
  /** Set the field level filters for field: ExternalAmount (BMF.external_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExternalAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ExternalAmount = value;
  }
  /** Retrieve filter for field: ExternalAmount (BMF.external_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getExternalAmountFilter () {
    return this.ExternalAmount;
  }

  /**
   * Retrieves the ExternalAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalAmountFilter field
   */
  public String[] getExternalAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExternalAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExternalAmountFilter filter value from a formatted string
   *
   * @param _value the ExternalAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExternalAmountFilter filter field
   */
  public void setExternalAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalAmountFilterFromFormattedString");
    try {
      this.setExternalAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalAmountFilterFromFormattedString");
  }

  /**
   * Sets the ExternalAmountFilter filter value from a formatted string
   *
   * @param _value the ExternalAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExternalAmountFilter filter field
   */
  public void setExternalAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalAmountFilterFromFormattedCurrencyString");
    try {
      this.setExternalAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the ExternalAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalAmountFilter field
   */

  public String[] getExternalAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExternalAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: ExternalCurrency (BMF.external_currency)
   * @param fetch whether to fetch this field or not
   */
  public void setExternalCurrencyFetch (boolean fetch) {
    this.ExternalCurrencyFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExternalCurrency (BMF.external_currency)
   * @return boolean the Fetch value for this field
   */
  public boolean getExternalCurrencyFetch () {
    return this.ExternalCurrencyFetch;
  }
  /** Set the SortOrder for field: ExternalCurrency (BMF.external_currency)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExternalCurrencySortOrder (Integer value) {
    this.ExternalCurrencySort = value;
  }
  /** Retrieve SortOrder for field: ExternalCurrency (BMF.external_currency)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExternalCurrencySortOrder () {
    return this.ExternalCurrencySort;
  }
  /** Set the sort direction for field: ExternalCurrency (BMF.external_currency)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExternalCurrencySortDirection (boolean ascending) {
    this.ExternalCurrencySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExternalCurrency (BMF.external_currency)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExternalCurrencySortDirection () {
    return this.ExternalCurrencySortAscending;
  }
  /** Set the field level filters for field: ExternalCurrency (BMF.external_currency)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExternalCurrencyFilter (IntegerFilter[] value) throws ServiceException {
    this.ExternalCurrency = value;
  }
  /** Retrieve filter for field: ExternalCurrency (BMF.external_currency)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getExternalCurrencyFilter () {
    return this.ExternalCurrency;
  }

  /**
   * Retrieves the ExternalCurrencyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalCurrencyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalCurrencyFilter field
   */
  public String[] getExternalCurrencyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalCurrencyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExternalCurrencyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalCurrencyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalCurrencyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalCurrencyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExternalCurrencyFilter filter value from a formatted string
   *
   * @param _value the ExternalCurrencyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExternalCurrencyFilter filter field
   */
  public void setExternalCurrencyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalCurrencyFilterFromFormattedString");
    try {
      this.setExternalCurrencyFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalCurrencyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalCurrencyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalCurrencyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OpenItemId (BMF.open_item_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOpenItemIdFetch (boolean fetch) {
    this.OpenItemIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OpenItemId (BMF.open_item_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOpenItemIdFetch () {
    return this.OpenItemIdFetch;
  }
  /** Set the SortOrder for field: OpenItemId (BMF.open_item_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOpenItemIdSortOrder (Integer value) {
    this.OpenItemIdSort = value;
  }
  /** Retrieve SortOrder for field: OpenItemId (BMF.open_item_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOpenItemIdSortOrder () {
    return this.OpenItemIdSort;
  }
  /** Set the sort direction for field: OpenItemId (BMF.open_item_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOpenItemIdSortDirection (boolean ascending) {
    this.OpenItemIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OpenItemId (BMF.open_item_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOpenItemIdSortDirection () {
    return this.OpenItemIdSortAscending;
  }
  /** Set the field level filters for field: OpenItemId (BMF.open_item_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOpenItemIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OpenItemId = value;
  }
  /** Retrieve filter for field: OpenItemId (BMF.open_item_id)
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


  /** Set the field level Fetch value for field: DiscountId (BMF.discount_id)
   * @param fetch whether to fetch this field or not
   */
  public void setDiscountIdFetch (boolean fetch) {
    this.DiscountIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DiscountId (BMF.discount_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getDiscountIdFetch () {
    return this.DiscountIdFetch;
  }
  /** Set the SortOrder for field: DiscountId (BMF.discount_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDiscountIdSortOrder (Integer value) {
    this.DiscountIdSort = value;
  }
  /** Retrieve SortOrder for field: DiscountId (BMF.discount_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDiscountIdSortOrder () {
    return this.DiscountIdSort;
  }
  /** Set the sort direction for field: DiscountId (BMF.discount_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDiscountIdSortDirection (boolean ascending) {
    this.DiscountIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DiscountId (BMF.discount_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDiscountIdSortDirection () {
    return this.DiscountIdSortAscending;
  }
  /** Set the field level filters for field: DiscountId (BMF.discount_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDiscountIdFilter (IntegerFilter[] value) throws ServiceException {
    this.DiscountId = value;
  }
  /** Retrieve filter for field: DiscountId (BMF.discount_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDiscountIdFilter () {
    return this.DiscountId;
  }

  /**
   * Retrieves the DiscountIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DiscountIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountIdFilter field
   */
  public String[] getDiscountIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDiscountIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DiscountIdFilter filter value from a formatted string
   *
   * @param _value the DiscountIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DiscountIdFilter filter field
   */
  public void setDiscountIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountIdFilterFromFormattedString");
    try {
      this.setDiscountIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TaxTypeCode (BMF.tax_type_code)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxTypeCodeFetch (boolean fetch) {
    this.TaxTypeCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxTypeCode (BMF.tax_type_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxTypeCodeFetch () {
    return this.TaxTypeCodeFetch;
  }
  /** Set the SortOrder for field: TaxTypeCode (BMF.tax_type_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxTypeCodeSortOrder (Integer value) {
    this.TaxTypeCodeSort = value;
  }
  /** Retrieve SortOrder for field: TaxTypeCode (BMF.tax_type_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxTypeCodeSortOrder () {
    return this.TaxTypeCodeSort;
  }
  /** Set the sort direction for field: TaxTypeCode (BMF.tax_type_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxTypeCodeSortDirection (boolean ascending) {
    this.TaxTypeCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxTypeCode (BMF.tax_type_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxTypeCodeSortDirection () {
    return this.TaxTypeCodeSortAscending;
  }
  /** Set the field level filters for field: TaxTypeCode (BMF.tax_type_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxTypeCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxTypeCode = value;
  }
  /** Retrieve filter for field: TaxTypeCode (BMF.tax_type_code)
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

  /** Set the field level Fetch value for field: Annotation (BMF.annotation)
   * @param fetch whether to fetch this field or not
   */
  public void setAnnotationFetch (boolean fetch) {
    this.AnnotationFetch = fetch;
  }
  /** Retrieve Fetch value for field: Annotation (BMF.annotation)
   * @return boolean the Fetch value for this field
   */
  public boolean getAnnotationFetch () {
    return this.AnnotationFetch;
  }
  /** Set the SortOrder for field: Annotation (BMF.annotation)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAnnotationSortOrder (Integer value) {
    this.AnnotationSort = value;
  }
  /** Retrieve SortOrder for field: Annotation (BMF.annotation)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAnnotationSortOrder () {
    return this.AnnotationSort;
  }
  /** Set the sort direction for field: Annotation (BMF.annotation)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAnnotationSortDirection (boolean ascending) {
    this.AnnotationSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Annotation (BMF.annotation)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAnnotationSortDirection () {
    return this.AnnotationSortAscending;
  }
  /** Set the case insensitive for field: Annotation (BMF.annotation)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAnnotationCaseInsensitive (boolean ascending) {
    this.AnnotationCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Annotation (BMF.annotation)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAnnotationCaseInsensitive () {
    return this.AnnotationCaseInsensitive;
  }
  /** Set the field level filters for field: Annotation (BMF.annotation)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAnnotationFilter (StringFilter[] value) throws ServiceException {
    this.Annotation = value;
  }
  /** Retrieve filter for field: Annotation (BMF.annotation)
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

  /** Set the field level Fetch value for field: PayMethod (BMF.pay_method)
   * @param fetch whether to fetch this field or not
   */
  public void setPayMethodFetch (boolean fetch) {
    this.PayMethodFetch = fetch;
  }
  /** Retrieve Fetch value for field: PayMethod (BMF.pay_method)
   * @return boolean the Fetch value for this field
   */
  public boolean getPayMethodFetch () {
    return this.PayMethodFetch;
  }
  /** Set the SortOrder for field: PayMethod (BMF.pay_method)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPayMethodSortOrder (Integer value) {
    this.PayMethodSort = value;
  }
  /** Retrieve SortOrder for field: PayMethod (BMF.pay_method)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPayMethodSortOrder () {
    return this.PayMethodSort;
  }
  /** Set the sort direction for field: PayMethod (BMF.pay_method)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPayMethodSortDirection (boolean ascending) {
    this.PayMethodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PayMethod (BMF.pay_method)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPayMethodSortDirection () {
    return this.PayMethodSortAscending;
  }
  /** Set the field level filters for field: PayMethod (BMF.pay_method)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPayMethodFilter (IntegerFilter[] value) throws ServiceException {
    this.PayMethod = value;
  }
  /** Retrieve filter for field: PayMethod (BMF.pay_method)
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


  /** Set the field level Fetch value for field: RealtimeIndicator (BMF.realtime_indicator)
   * @param fetch whether to fetch this field or not
   */
  public void setRealtimeIndicatorFetch (boolean fetch) {
    this.RealtimeIndicatorFetch = fetch;
  }
  /** Retrieve Fetch value for field: RealtimeIndicator (BMF.realtime_indicator)
   * @return boolean the Fetch value for this field
   */
  public boolean getRealtimeIndicatorFetch () {
    return this.RealtimeIndicatorFetch;
  }
  /** Set the SortOrder for field: RealtimeIndicator (BMF.realtime_indicator)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRealtimeIndicatorSortOrder (Integer value) {
    this.RealtimeIndicatorSort = value;
  }
  /** Retrieve SortOrder for field: RealtimeIndicator (BMF.realtime_indicator)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRealtimeIndicatorSortOrder () {
    return this.RealtimeIndicatorSort;
  }
  /** Set the sort direction for field: RealtimeIndicator (BMF.realtime_indicator)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRealtimeIndicatorSortDirection (boolean ascending) {
    this.RealtimeIndicatorSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RealtimeIndicator (BMF.realtime_indicator)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRealtimeIndicatorSortDirection () {
    return this.RealtimeIndicatorSortAscending;
  }
  /** Set the field level filters for field: RealtimeIndicator (BMF.realtime_indicator)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRealtimeIndicatorFilter (IntegerFilter[] value) throws ServiceException {
    this.RealtimeIndicator = value;
  }
  /** Retrieve filter for field: RealtimeIndicator (BMF.realtime_indicator)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRealtimeIndicatorFilter () {
    return this.RealtimeIndicator;
  }

  /**
   * Retrieves the RealtimeIndicatorFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RealtimeIndicatorFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RealtimeIndicatorFilter field
   */
  public String[] getRealtimeIndicatorFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRealtimeIndicatorFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRealtimeIndicatorFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRealtimeIndicatorFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RealtimeIndicatorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRealtimeIndicatorFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RealtimeIndicatorFilter filter value from a formatted string
   *
   * @param _value the RealtimeIndicatorFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RealtimeIndicatorFilter filter field
   */
  public void setRealtimeIndicatorFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRealtimeIndicatorFilterFromFormattedString");
    try {
      this.setRealtimeIndicatorFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RealtimeIndicatorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRealtimeIndicatorFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRealtimeIndicatorFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PaymentProfileId (BMF.payment_profile_id)
   * @param fetch whether to fetch this field or not
   */
  public void setPaymentProfileIdFetch (boolean fetch) {
    this.PaymentProfileIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PaymentProfileId (BMF.payment_profile_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getPaymentProfileIdFetch () {
    return this.PaymentProfileIdFetch;
  }
  /** Set the SortOrder for field: PaymentProfileId (BMF.payment_profile_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPaymentProfileIdSortOrder (Integer value) {
    this.PaymentProfileIdSort = value;
  }
  /** Retrieve SortOrder for field: PaymentProfileId (BMF.payment_profile_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPaymentProfileIdSortOrder () {
    return this.PaymentProfileIdSort;
  }
  /** Set the sort direction for field: PaymentProfileId (BMF.payment_profile_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPaymentProfileIdSortDirection (boolean ascending) {
    this.PaymentProfileIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PaymentProfileId (BMF.payment_profile_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPaymentProfileIdSortDirection () {
    return this.PaymentProfileIdSortAscending;
  }
  /** Set the field level filters for field: PaymentProfileId (BMF.payment_profile_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPaymentProfileIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.PaymentProfileId = value;
  }
  /** Retrieve filter for field: PaymentProfileId (BMF.payment_profile_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getPaymentProfileIdFilter () {
    return this.PaymentProfileId;
  }

  /**
   * Retrieves the PaymentProfileIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PaymentProfileIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentProfileIdFilter field
   */
  public String[] getPaymentProfileIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentProfileIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPaymentProfileIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentProfileIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentProfileIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentProfileIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PaymentProfileIdFilter filter value from a formatted string
   *
   * @param _value the PaymentProfileIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PaymentProfileIdFilter filter field
   */
  public void setPaymentProfileIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPaymentProfileIdFilterFromFormattedString");
    try {
      this.setPaymentProfileIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentProfileIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentProfileIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPaymentProfileIdFilterFromFormattedString");
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

  /** Set the field level Fetch value for field: AltBankAccNum (PAYMENT_PROFILE.alt_bank_acc_num)
   * @param fetch whether to fetch this field or not
   */
  public void setAltBankAccNumFetch (boolean fetch) {
    this.AltBankAccNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: AltBankAccNum (PAYMENT_PROFILE.alt_bank_acc_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getAltBankAccNumFetch () {
    return this.AltBankAccNumFetch;
  }
  /** Set the SortOrder for field: AltBankAccNum (PAYMENT_PROFILE.alt_bank_acc_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAltBankAccNumSortOrder (Integer value) {
    this.AltBankAccNumSort = value;
  }
  /** Retrieve SortOrder for field: AltBankAccNum (PAYMENT_PROFILE.alt_bank_acc_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAltBankAccNumSortOrder () {
    return this.AltBankAccNumSort;
  }
  /** Set the sort direction for field: AltBankAccNum (PAYMENT_PROFILE.alt_bank_acc_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAltBankAccNumSortDirection (boolean ascending) {
    this.AltBankAccNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AltBankAccNum (PAYMENT_PROFILE.alt_bank_acc_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAltBankAccNumSortDirection () {
    return this.AltBankAccNumSortAscending;
  }
  /** Set the case insensitive for field: AltBankAccNum (PAYMENT_PROFILE.alt_bank_acc_num)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAltBankAccNumCaseInsensitive (boolean ascending) {
    this.AltBankAccNumCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AltBankAccNum (PAYMENT_PROFILE.alt_bank_acc_num)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAltBankAccNumCaseInsensitive () {
    return this.AltBankAccNumCaseInsensitive;
  }
  /** Set the field level filters for field: AltBankAccNum (PAYMENT_PROFILE.alt_bank_acc_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAltBankAccNumFilter (StringFilter[] value) throws ServiceException {
    this.AltBankAccNum = value;
  }
  /** Retrieve filter for field: AltBankAccNum (PAYMENT_PROFILE.alt_bank_acc_num)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAltBankAccNumFilter () {
    return this.AltBankAccNum;
  }

  /**
   * Retrieves the AltBankAccNumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AltBankAccNumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AltBankAccNumFilter field
   */
  public String[] getAltBankAccNumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltBankAccNumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAltBankAccNumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAltBankAccNumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AltBankAccNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAltBankAccNumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AltBankAccNumFilter filter value from a formatted string
   *
   * @param _value the AltBankAccNumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AltBankAccNumFilter filter field
   */
  public void setAltBankAccNumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAltBankAccNumFilterFromFormattedString");
    try {
      this.setAltBankAccNumFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AltBankAccNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAltBankAccNumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAltBankAccNumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * @param fetch whether to fetch this field or not
   */
  public void setClearingHouseIdFetch (boolean fetch) {
    this.ClearingHouseIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getClearingHouseIdFetch () {
    return this.ClearingHouseIdFetch;
  }
  /** Set the SortOrder for field: ClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setClearingHouseIdSortOrder (Integer value) {
    this.ClearingHouseIdSort = value;
  }
  /** Retrieve SortOrder for field: ClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getClearingHouseIdSortOrder () {
    return this.ClearingHouseIdSort;
  }
  /** Set the sort direction for field: ClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setClearingHouseIdSortDirection (boolean ascending) {
    this.ClearingHouseIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getClearingHouseIdSortDirection () {
    return this.ClearingHouseIdSortAscending;
  }
  /** Set the case insensitive for field: ClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setClearingHouseIdCaseInsensitive (boolean ascending) {
    this.ClearingHouseIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getClearingHouseIdCaseInsensitive () {
    return this.ClearingHouseIdCaseInsensitive;
  }
  /** Set the field level filters for field: ClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setClearingHouseIdFilter (StringFilter[] value) throws ServiceException {
    this.ClearingHouseId = value;
  }
  /** Retrieve filter for field: ClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
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

  /** Set the field level Fetch value for field: NewCustBankSortCode (PAYMENT_PROFILE.new_cust_bank_sort_code)
   * @param fetch whether to fetch this field or not
   */
  public void setNewCustBankSortCodeFetch (boolean fetch) {
    this.NewCustBankSortCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: NewCustBankSortCode (PAYMENT_PROFILE.new_cust_bank_sort_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getNewCustBankSortCodeFetch () {
    return this.NewCustBankSortCodeFetch;
  }
  /** Set the SortOrder for field: NewCustBankSortCode (PAYMENT_PROFILE.new_cust_bank_sort_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNewCustBankSortCodeSortOrder (Integer value) {
    this.NewCustBankSortCodeSort = value;
  }
  /** Retrieve SortOrder for field: NewCustBankSortCode (PAYMENT_PROFILE.new_cust_bank_sort_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNewCustBankSortCodeSortOrder () {
    return this.NewCustBankSortCodeSort;
  }
  /** Set the sort direction for field: NewCustBankSortCode (PAYMENT_PROFILE.new_cust_bank_sort_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNewCustBankSortCodeSortDirection (boolean ascending) {
    this.NewCustBankSortCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NewCustBankSortCode (PAYMENT_PROFILE.new_cust_bank_sort_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNewCustBankSortCodeSortDirection () {
    return this.NewCustBankSortCodeSortAscending;
  }
  /** Set the case insensitive for field: NewCustBankSortCode (PAYMENT_PROFILE.new_cust_bank_sort_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setNewCustBankSortCodeCaseInsensitive (boolean ascending) {
    this.NewCustBankSortCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: NewCustBankSortCode (PAYMENT_PROFILE.new_cust_bank_sort_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getNewCustBankSortCodeCaseInsensitive () {
    return this.NewCustBankSortCodeCaseInsensitive;
  }
  /** Set the field level filters for field: NewCustBankSortCode (PAYMENT_PROFILE.new_cust_bank_sort_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNewCustBankSortCodeFilter (StringFilter[] value) throws ServiceException {
    this.NewCustBankSortCode = value;
  }
  /** Retrieve filter for field: NewCustBankSortCode (PAYMENT_PROFILE.new_cust_bank_sort_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getNewCustBankSortCodeFilter () {
    return this.NewCustBankSortCode;
  }

  /**
   * Retrieves the NewCustBankSortCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NewCustBankSortCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NewCustBankSortCodeFilter field
   */
  public String[] getNewCustBankSortCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNewCustBankSortCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNewCustBankSortCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNewCustBankSortCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NewCustBankSortCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNewCustBankSortCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NewCustBankSortCodeFilter filter value from a formatted string
   *
   * @param _value the NewCustBankSortCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NewCustBankSortCodeFilter filter field
   */
  public void setNewCustBankSortCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNewCustBankSortCodeFilterFromFormattedString");
    try {
      this.setNewCustBankSortCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NewCustBankSortCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNewCustBankSortCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNewCustBankSortCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BankCode (PAYMENT_PROFILE.bank_code)
   * @param fetch whether to fetch this field or not
   */
  public void setBankCodeFetch (boolean fetch) {
    this.BankCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BankCode (PAYMENT_PROFILE.bank_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getBankCodeFetch () {
    return this.BankCodeFetch;
  }
  /** Set the SortOrder for field: BankCode (PAYMENT_PROFILE.bank_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBankCodeSortOrder (Integer value) {
    this.BankCodeSort = value;
  }
  /** Retrieve SortOrder for field: BankCode (PAYMENT_PROFILE.bank_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBankCodeSortOrder () {
    return this.BankCodeSort;
  }
  /** Set the sort direction for field: BankCode (PAYMENT_PROFILE.bank_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBankCodeSortDirection (boolean ascending) {
    this.BankCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BankCode (PAYMENT_PROFILE.bank_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBankCodeSortDirection () {
    return this.BankCodeSortAscending;
  }
  /** Set the case insensitive for field: BankCode (PAYMENT_PROFILE.bank_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBankCodeCaseInsensitive (boolean ascending) {
    this.BankCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BankCode (PAYMENT_PROFILE.bank_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBankCodeCaseInsensitive () {
    return this.BankCodeCaseInsensitive;
  }
  /** Set the field level filters for field: BankCode (PAYMENT_PROFILE.bank_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBankCodeFilter (StringFilter[] value) throws ServiceException {
    this.BankCode = value;
  }
  /** Retrieve filter for field: BankCode (PAYMENT_PROFILE.bank_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBankCodeFilter () {
    return this.BankCode;
  }

  /**
   * Retrieves the BankCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BankCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BankCodeFilter field
   */
  public String[] getBankCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBankCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBankCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBankCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BankCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBankCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BankCodeFilter filter value from a formatted string
   *
   * @param _value the BankCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BankCodeFilter filter field
   */
  public void setBankCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBankCodeFilterFromFormattedString");
    try {
      this.setBankCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BankCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBankCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBankCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BankAccountType (PAYMENT_PROFILE.bank_account_type)
   * @param fetch whether to fetch this field or not
   */
  public void setBankAccountTypeFetch (boolean fetch) {
    this.BankAccountTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BankAccountType (PAYMENT_PROFILE.bank_account_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getBankAccountTypeFetch () {
    return this.BankAccountTypeFetch;
  }
  /** Set the SortOrder for field: BankAccountType (PAYMENT_PROFILE.bank_account_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBankAccountTypeSortOrder (Integer value) {
    this.BankAccountTypeSort = value;
  }
  /** Retrieve SortOrder for field: BankAccountType (PAYMENT_PROFILE.bank_account_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBankAccountTypeSortOrder () {
    return this.BankAccountTypeSort;
  }
  /** Set the sort direction for field: BankAccountType (PAYMENT_PROFILE.bank_account_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBankAccountTypeSortDirection (boolean ascending) {
    this.BankAccountTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BankAccountType (PAYMENT_PROFILE.bank_account_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBankAccountTypeSortDirection () {
    return this.BankAccountTypeSortAscending;
  }
  /** Set the field level filters for field: BankAccountType (PAYMENT_PROFILE.bank_account_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBankAccountTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.BankAccountType = value;
  }
  /** Retrieve filter for field: BankAccountType (PAYMENT_PROFILE.bank_account_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBankAccountTypeFilter () {
    return this.BankAccountType;
  }

  /**
   * Retrieves the BankAccountTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BankAccountTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BankAccountTypeFilter field
   */
  public String[] getBankAccountTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBankAccountTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBankAccountTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBankAccountTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BankAccountTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBankAccountTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BankAccountTypeFilter filter value from a formatted string
   *
   * @param _value the BankAccountTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BankAccountTypeFilter filter field
   */
  public void setBankAccountTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBankAccountTypeFilterFromFormattedString");
    try {
      this.setBankAccountTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BankAccountTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBankAccountTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBankAccountTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BranchName (PAYMENT_PROFILE.branch_name)
   * @param fetch whether to fetch this field or not
   */
  public void setBranchNameFetch (boolean fetch) {
    this.BranchNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: BranchName (PAYMENT_PROFILE.branch_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getBranchNameFetch () {
    return this.BranchNameFetch;
  }
  /** Set the SortOrder for field: BranchName (PAYMENT_PROFILE.branch_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBranchNameSortOrder (Integer value) {
    this.BranchNameSort = value;
  }
  /** Retrieve SortOrder for field: BranchName (PAYMENT_PROFILE.branch_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBranchNameSortOrder () {
    return this.BranchNameSort;
  }
  /** Set the sort direction for field: BranchName (PAYMENT_PROFILE.branch_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBranchNameSortDirection (boolean ascending) {
    this.BranchNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BranchName (PAYMENT_PROFILE.branch_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBranchNameSortDirection () {
    return this.BranchNameSortAscending;
  }
  /** Set the case insensitive for field: BranchName (PAYMENT_PROFILE.branch_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBranchNameCaseInsensitive (boolean ascending) {
    this.BranchNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BranchName (PAYMENT_PROFILE.branch_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBranchNameCaseInsensitive () {
    return this.BranchNameCaseInsensitive;
  }
  /** Set the field level filters for field: BranchName (PAYMENT_PROFILE.branch_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBranchNameFilter (StringFilter[] value) throws ServiceException {
    this.BranchName = value;
  }
  /** Retrieve filter for field: BranchName (PAYMENT_PROFILE.branch_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBranchNameFilter () {
    return this.BranchName;
  }

  /**
   * Retrieves the BranchNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BranchNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BranchNameFilter field
   */
  public String[] getBranchNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBranchNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBranchNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBranchNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BranchNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBranchNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BranchNameFilter filter value from a formatted string
   *
   * @param _value the BranchNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BranchNameFilter filter field
   */
  public void setBranchNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBranchNameFilterFromFormattedString");
    try {
      this.setBranchNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BranchNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBranchNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBranchNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BranchCode (PAYMENT_PROFILE.branch_code)
   * @param fetch whether to fetch this field or not
   */
  public void setBranchCodeFetch (boolean fetch) {
    this.BranchCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BranchCode (PAYMENT_PROFILE.branch_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getBranchCodeFetch () {
    return this.BranchCodeFetch;
  }
  /** Set the SortOrder for field: BranchCode (PAYMENT_PROFILE.branch_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBranchCodeSortOrder (Integer value) {
    this.BranchCodeSort = value;
  }
  /** Retrieve SortOrder for field: BranchCode (PAYMENT_PROFILE.branch_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBranchCodeSortOrder () {
    return this.BranchCodeSort;
  }
  /** Set the sort direction for field: BranchCode (PAYMENT_PROFILE.branch_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBranchCodeSortDirection (boolean ascending) {
    this.BranchCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BranchCode (PAYMENT_PROFILE.branch_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBranchCodeSortDirection () {
    return this.BranchCodeSortAscending;
  }
  /** Set the case insensitive for field: BranchCode (PAYMENT_PROFILE.branch_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBranchCodeCaseInsensitive (boolean ascending) {
    this.BranchCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BranchCode (PAYMENT_PROFILE.branch_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBranchCodeCaseInsensitive () {
    return this.BranchCodeCaseInsensitive;
  }
  /** Set the field level filters for field: BranchCode (PAYMENT_PROFILE.branch_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBranchCodeFilter (StringFilter[] value) throws ServiceException {
    this.BranchCode = value;
  }
  /** Retrieve filter for field: BranchCode (PAYMENT_PROFILE.branch_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBranchCodeFilter () {
    return this.BranchCode;
  }

  /**
   * Retrieves the BranchCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BranchCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BranchCodeFilter field
   */
  public String[] getBranchCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBranchCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBranchCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBranchCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BranchCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBranchCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BranchCodeFilter filter value from a formatted string
   *
   * @param _value the BranchCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BranchCodeFilter filter field
   */
  public void setBranchCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBranchCodeFilterFromFormattedString");
    try {
      this.setBranchCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BranchCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBranchCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBranchCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CardAccount (PAYMENT_PROFILE.card_account)
   * @param fetch whether to fetch this field or not
   */
  public void setCardAccountFetch (boolean fetch) {
    this.CardAccountFetch = fetch;
  }
  /** Retrieve Fetch value for field: CardAccount (PAYMENT_PROFILE.card_account)
   * @return boolean the Fetch value for this field
   */
  public boolean getCardAccountFetch () {
    return this.CardAccountFetch;
  }
  /** Set the SortOrder for field: CardAccount (PAYMENT_PROFILE.card_account)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCardAccountSortOrder (Integer value) {
    this.CardAccountSort = value;
  }
  /** Retrieve SortOrder for field: CardAccount (PAYMENT_PROFILE.card_account)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCardAccountSortOrder () {
    return this.CardAccountSort;
  }
  /** Set the sort direction for field: CardAccount (PAYMENT_PROFILE.card_account)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCardAccountSortDirection (boolean ascending) {
    this.CardAccountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CardAccount (PAYMENT_PROFILE.card_account)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCardAccountSortDirection () {
    return this.CardAccountSortAscending;
  }
  /** Set the case insensitive for field: CardAccount (PAYMENT_PROFILE.card_account)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCardAccountCaseInsensitive (boolean ascending) {
    this.CardAccountCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CardAccount (PAYMENT_PROFILE.card_account)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCardAccountCaseInsensitive () {
    return this.CardAccountCaseInsensitive;
  }
  /** Set the field level filters for field: CardAccount (PAYMENT_PROFILE.card_account)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCardAccountFilter (StringFilter[] value) throws ServiceException {
    this.CardAccount = value;
  }
  /** Retrieve filter for field: CardAccount (PAYMENT_PROFILE.card_account)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCardAccountFilter () {
    return this.CardAccount;
  }

  /**
   * Retrieves the CardAccountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CardAccountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CardAccountFilter field
   */
  public String[] getCardAccountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCardAccountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCardAccountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCardAccountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CardAccountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCardAccountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CardAccountFilter filter value from a formatted string
   *
   * @param _value the CardAccountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CardAccountFilter filter field
   */
  public void setCardAccountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCardAccountFilterFromFormattedString");
    try {
      this.setCardAccountFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CardAccountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCardAccountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCardAccountFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CardCarrier (PAYMENT_PROFILE.card_carrier)
   * @param fetch whether to fetch this field or not
   */
  public void setCardCarrierFetch (boolean fetch) {
    this.CardCarrierFetch = fetch;
  }
  /** Retrieve Fetch value for field: CardCarrier (PAYMENT_PROFILE.card_carrier)
   * @return boolean the Fetch value for this field
   */
  public boolean getCardCarrierFetch () {
    return this.CardCarrierFetch;
  }
  /** Set the SortOrder for field: CardCarrier (PAYMENT_PROFILE.card_carrier)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCardCarrierSortOrder (Integer value) {
    this.CardCarrierSort = value;
  }
  /** Retrieve SortOrder for field: CardCarrier (PAYMENT_PROFILE.card_carrier)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCardCarrierSortOrder () {
    return this.CardCarrierSort;
  }
  /** Set the sort direction for field: CardCarrier (PAYMENT_PROFILE.card_carrier)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCardCarrierSortDirection (boolean ascending) {
    this.CardCarrierSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CardCarrier (PAYMENT_PROFILE.card_carrier)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCardCarrierSortDirection () {
    return this.CardCarrierSortAscending;
  }
  /** Set the case insensitive for field: CardCarrier (PAYMENT_PROFILE.card_carrier)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCardCarrierCaseInsensitive (boolean ascending) {
    this.CardCarrierCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CardCarrier (PAYMENT_PROFILE.card_carrier)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCardCarrierCaseInsensitive () {
    return this.CardCarrierCaseInsensitive;
  }
  /** Set the field level filters for field: CardCarrier (PAYMENT_PROFILE.card_carrier)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCardCarrierFilter (StringFilter[] value) throws ServiceException {
    this.CardCarrier = value;
  }
  /** Retrieve filter for field: CardCarrier (PAYMENT_PROFILE.card_carrier)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCardCarrierFilter () {
    return this.CardCarrier;
  }

  /**
   * Retrieves the CardCarrierFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CardCarrierFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CardCarrierFilter field
   */
  public String[] getCardCarrierFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCardCarrierFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCardCarrierFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCardCarrierFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CardCarrierFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCardCarrierFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CardCarrierFilter filter value from a formatted string
   *
   * @param _value the CardCarrierFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CardCarrierFilter filter field
   */
  public void setCardCarrierFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCardCarrierFilterFromFormattedString");
    try {
      this.setCardCarrierFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CardCarrierFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCardCarrierFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCardCarrierFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated CardCarrierFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CardCarrierFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CardCarrierFilter filter field
   */
  public String[] getCardCarrierFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCardCarrierFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getCardCarrierFilter(), "CardTypeCode", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCardCarrierFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CardCarrierFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCardCarrierFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated CardCarrierFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the CardCarrierFilter filter field
   */
  public void setCardCarrierFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCardCarrierFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setCardCarrierFilter((StringFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "CardCarrier", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CardCarrierFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCardCarrierFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCardCarrierFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: CardExpire (PAYMENT_PROFILE.card_expire)
   * @param fetch whether to fetch this field or not
   */
  public void setCardExpireFetch (boolean fetch) {
    this.CardExpireFetch = fetch;
  }
  /** Retrieve Fetch value for field: CardExpire (PAYMENT_PROFILE.card_expire)
   * @return boolean the Fetch value for this field
   */
  public boolean getCardExpireFetch () {
    return this.CardExpireFetch;
  }
  /** Set the SortOrder for field: CardExpire (PAYMENT_PROFILE.card_expire)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCardExpireSortOrder (Integer value) {
    this.CardExpireSort = value;
  }
  /** Retrieve SortOrder for field: CardExpire (PAYMENT_PROFILE.card_expire)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCardExpireSortOrder () {
    return this.CardExpireSort;
  }
  /** Set the sort direction for field: CardExpire (PAYMENT_PROFILE.card_expire)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCardExpireSortDirection (boolean ascending) {
    this.CardExpireSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CardExpire (PAYMENT_PROFILE.card_expire)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCardExpireSortDirection () {
    return this.CardExpireSortAscending;
  }
  /** Set the case insensitive for field: CardExpire (PAYMENT_PROFILE.card_expire)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCardExpireCaseInsensitive (boolean ascending) {
    this.CardExpireCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CardExpire (PAYMENT_PROFILE.card_expire)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCardExpireCaseInsensitive () {
    return this.CardExpireCaseInsensitive;
  }
  /** Set the field level filters for field: CardExpire (PAYMENT_PROFILE.card_expire)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCardExpireFilter (StringFilter[] value) throws ServiceException {
    this.CardExpire = value;
  }
  /** Retrieve filter for field: CardExpire (PAYMENT_PROFILE.card_expire)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCardExpireFilter () {
    return this.CardExpire;
  }

  /**
   * Retrieves the CardExpireFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CardExpireFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CardExpireFilter field
   */
  public String[] getCardExpireFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCardExpireFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCardExpireFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCardExpireFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CardExpireFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCardExpireFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CardExpireFilter filter value from a formatted string
   *
   * @param _value the CardExpireFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CardExpireFilter filter field
   */
  public void setCardExpireFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCardExpireFilterFromFormattedString");
    try {
      this.setCardExpireFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CardExpireFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCardExpireFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCardExpireFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAvsAddressIdFetch (boolean fetch) {
    this.AvsAddressIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAvsAddressIdFetch () {
    return this.AvsAddressIdFetch;
  }
  /** Set the SortOrder for field: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAvsAddressIdSortOrder (Integer value) {
    this.AvsAddressIdSort = value;
  }
  /** Retrieve SortOrder for field: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAvsAddressIdSortOrder () {
    return this.AvsAddressIdSort;
  }
  /** Set the sort direction for field: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAvsAddressIdSortDirection (boolean ascending) {
    this.AvsAddressIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAvsAddressIdSortDirection () {
    return this.AvsAddressIdSortAscending;
  }
  /** Set the field level filters for field: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAvsAddressIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AvsAddressId = value;
  }
  /** Retrieve filter for field: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAvsAddressIdFilter () {
    return this.AvsAddressId;
  }

  /**
   * Retrieves the AvsAddressIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AvsAddressIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AvsAddressIdFilter field
   */
  public String[] getAvsAddressIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAvsAddressIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAvsAddressIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAvsAddressIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AvsAddressIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAvsAddressIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AvsAddressIdFilter filter value from a formatted string
   *
   * @param _value the AvsAddressIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AvsAddressIdFilter filter field
   */
  public void setAvsAddressIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAvsAddressIdFilterFromFormattedString");
    try {
      this.setAvsAddressIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AvsAddressIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAvsAddressIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAvsAddressIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @param fetch whether to fetch this field or not
   */
  public void setAvsResponseCodeFetch (boolean fetch) {
    this.AvsResponseCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getAvsResponseCodeFetch () {
    return this.AvsResponseCodeFetch;
  }
  /** Set the SortOrder for field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAvsResponseCodeSortOrder (Integer value) {
    this.AvsResponseCodeSort = value;
  }
  /** Retrieve SortOrder for field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAvsResponseCodeSortOrder () {
    return this.AvsResponseCodeSort;
  }
  /** Set the sort direction for field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAvsResponseCodeSortDirection (boolean ascending) {
    this.AvsResponseCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAvsResponseCodeSortDirection () {
    return this.AvsResponseCodeSortAscending;
  }
  /** Set the case insensitive for field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAvsResponseCodeCaseInsensitive (boolean ascending) {
    this.AvsResponseCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAvsResponseCodeCaseInsensitive () {
    return this.AvsResponseCodeCaseInsensitive;
  }
  /** Set the field level filters for field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAvsResponseCodeFilter (StringFilter[] value) throws ServiceException {
    this.AvsResponseCode = value;
  }
  /** Retrieve filter for field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAvsResponseCodeFilter () {
    return this.AvsResponseCode;
  }

  /**
   * Retrieves the AvsResponseCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AvsResponseCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AvsResponseCodeFilter field
   */
  public String[] getAvsResponseCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAvsResponseCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAvsResponseCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAvsResponseCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AvsResponseCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAvsResponseCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AvsResponseCodeFilter filter value from a formatted string
   *
   * @param _value the AvsResponseCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AvsResponseCodeFilter filter field
   */
  public void setAvsResponseCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAvsResponseCodeFilterFromFormattedString");
    try {
      this.setAvsResponseCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AvsResponseCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAvsResponseCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAvsResponseCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setTransFlagFetch (boolean fetch) {
    this.TransFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransFlagFetch () {
    return this.TransFlagFetch;
  }
  /** Set the SortOrder for field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransFlagSortOrder (Integer value) {
    this.TransFlagSort = value;
  }
  /** Retrieve SortOrder for field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransFlagSortOrder () {
    return this.TransFlagSort;
  }
  /** Set the sort direction for field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransFlagSortDirection (boolean ascending) {
    this.TransFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransFlagSortDirection () {
    return this.TransFlagSortAscending;
  }
  /** Set the case insensitive for field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setTransFlagCaseInsensitive (boolean ascending) {
    this.TransFlagCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getTransFlagCaseInsensitive () {
    return this.TransFlagCaseInsensitive;
  }
  /** Set the field level filters for field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransFlagFilter (StringFilter[] value) throws ServiceException {
    this.TransFlag = value;
  }
  /** Retrieve filter for field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getTransFlagFilter () {
    return this.TransFlag;
  }

  /**
   * Retrieves the TransFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransFlagFilter field
   */
  public String[] getTransFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransFlagFilter filter value from a formatted string
   *
   * @param _value the TransFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransFlagFilter filter field
   */
  public void setTransFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransFlagFilterFromFormattedString");
    try {
      this.setTransFlagFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransFlagFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustBankAcctType (PAYMENT_PROFILE.cust_bank_acct_type)
   * @param fetch whether to fetch this field or not
   */
  public void setCustBankAcctTypeFetch (boolean fetch) {
    this.CustBankAcctTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustBankAcctType (PAYMENT_PROFILE.cust_bank_acct_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustBankAcctTypeFetch () {
    return this.CustBankAcctTypeFetch;
  }
  /** Set the SortOrder for field: CustBankAcctType (PAYMENT_PROFILE.cust_bank_acct_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustBankAcctTypeSortOrder (Integer value) {
    this.CustBankAcctTypeSort = value;
  }
  /** Retrieve SortOrder for field: CustBankAcctType (PAYMENT_PROFILE.cust_bank_acct_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustBankAcctTypeSortOrder () {
    return this.CustBankAcctTypeSort;
  }
  /** Set the sort direction for field: CustBankAcctType (PAYMENT_PROFILE.cust_bank_acct_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustBankAcctTypeSortDirection (boolean ascending) {
    this.CustBankAcctTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustBankAcctType (PAYMENT_PROFILE.cust_bank_acct_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustBankAcctTypeSortDirection () {
    return this.CustBankAcctTypeSortAscending;
  }
  /** Set the case insensitive for field: CustBankAcctType (PAYMENT_PROFILE.cust_bank_acct_type)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustBankAcctTypeCaseInsensitive (boolean ascending) {
    this.CustBankAcctTypeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustBankAcctType (PAYMENT_PROFILE.cust_bank_acct_type)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustBankAcctTypeCaseInsensitive () {
    return this.CustBankAcctTypeCaseInsensitive;
  }
  /** Set the field level filters for field: CustBankAcctType (PAYMENT_PROFILE.cust_bank_acct_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustBankAcctTypeFilter (StringFilter[] value) throws ServiceException {
    this.CustBankAcctType = value;
  }
  /** Retrieve filter for field: CustBankAcctType (PAYMENT_PROFILE.cust_bank_acct_type)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustBankAcctTypeFilter () {
    return this.CustBankAcctType;
  }

  /**
   * Retrieves the CustBankAcctTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustBankAcctTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankAcctTypeFilter field
   */
  public String[] getCustBankAcctTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankAcctTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustBankAcctTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankAcctTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBankAcctTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankAcctTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustBankAcctTypeFilter filter value from a formatted string
   *
   * @param _value the CustBankAcctTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustBankAcctTypeFilter filter field
   */
  public void setCustBankAcctTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustBankAcctTypeFilterFromFormattedString");
    try {
      this.setCustBankAcctTypeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBankAcctTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankAcctTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankAcctTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustEmail (PAYMENT_PROFILE.cust_email)
   * @param fetch whether to fetch this field or not
   */
  public void setCustEmailFetch (boolean fetch) {
    this.CustEmailFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustEmail (PAYMENT_PROFILE.cust_email)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustEmailFetch () {
    return this.CustEmailFetch;
  }
  /** Set the SortOrder for field: CustEmail (PAYMENT_PROFILE.cust_email)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustEmailSortOrder (Integer value) {
    this.CustEmailSort = value;
  }
  /** Retrieve SortOrder for field: CustEmail (PAYMENT_PROFILE.cust_email)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustEmailSortOrder () {
    return this.CustEmailSort;
  }
  /** Set the sort direction for field: CustEmail (PAYMENT_PROFILE.cust_email)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustEmailSortDirection (boolean ascending) {
    this.CustEmailSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustEmail (PAYMENT_PROFILE.cust_email)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustEmailSortDirection () {
    return this.CustEmailSortAscending;
  }
  /** Set the case insensitive for field: CustEmail (PAYMENT_PROFILE.cust_email)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustEmailCaseInsensitive (boolean ascending) {
    this.CustEmailCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustEmail (PAYMENT_PROFILE.cust_email)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustEmailCaseInsensitive () {
    return this.CustEmailCaseInsensitive;
  }
  /** Set the field level filters for field: CustEmail (PAYMENT_PROFILE.cust_email)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustEmailFilter (StringFilter[] value) throws ServiceException {
    this.CustEmail = value;
  }
  /** Retrieve filter for field: CustEmail (PAYMENT_PROFILE.cust_email)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustEmailFilter () {
    return this.CustEmail;
  }

  /**
   * Retrieves the CustEmailFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustEmailFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustEmailFilter field
   */
  public String[] getCustEmailFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustEmailFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustEmailFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustEmailFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustEmailFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustEmailFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustEmailFilter filter value from a formatted string
   *
   * @param _value the CustEmailFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustEmailFilter filter field
   */
  public void setCustEmailFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustEmailFilterFromFormattedString");
    try {
      this.setCustEmailFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustEmailFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustEmailFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustEmailFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustBillAddress (PAYMENT_PROFILE.cust_bill_address)
   * @param fetch whether to fetch this field or not
   */
  public void setCustBillAddressFetch (boolean fetch) {
    this.CustBillAddressFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustBillAddress (PAYMENT_PROFILE.cust_bill_address)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustBillAddressFetch () {
    return this.CustBillAddressFetch;
  }
  /** Set the SortOrder for field: CustBillAddress (PAYMENT_PROFILE.cust_bill_address)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustBillAddressSortOrder (Integer value) {
    this.CustBillAddressSort = value;
  }
  /** Retrieve SortOrder for field: CustBillAddress (PAYMENT_PROFILE.cust_bill_address)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustBillAddressSortOrder () {
    return this.CustBillAddressSort;
  }
  /** Set the sort direction for field: CustBillAddress (PAYMENT_PROFILE.cust_bill_address)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustBillAddressSortDirection (boolean ascending) {
    this.CustBillAddressSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustBillAddress (PAYMENT_PROFILE.cust_bill_address)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustBillAddressSortDirection () {
    return this.CustBillAddressSortAscending;
  }
  /** Set the case insensitive for field: CustBillAddress (PAYMENT_PROFILE.cust_bill_address)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustBillAddressCaseInsensitive (boolean ascending) {
    this.CustBillAddressCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustBillAddress (PAYMENT_PROFILE.cust_bill_address)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustBillAddressCaseInsensitive () {
    return this.CustBillAddressCaseInsensitive;
  }
  /** Set the field level filters for field: CustBillAddress (PAYMENT_PROFILE.cust_bill_address)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustBillAddressFilter (StringFilter[] value) throws ServiceException {
    this.CustBillAddress = value;
  }
  /** Retrieve filter for field: CustBillAddress (PAYMENT_PROFILE.cust_bill_address)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustBillAddressFilter () {
    return this.CustBillAddress;
  }

  /**
   * Retrieves the CustBillAddressFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustBillAddressFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBillAddressFilter field
   */
  public String[] getCustBillAddressFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBillAddressFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustBillAddressFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBillAddressFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBillAddressFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBillAddressFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustBillAddressFilter filter value from a formatted string
   *
   * @param _value the CustBillAddressFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustBillAddressFilter filter field
   */
  public void setCustBillAddressFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustBillAddressFilterFromFormattedString");
    try {
      this.setCustBillAddressFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBillAddressFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBillAddressFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBillAddressFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustBillCity (PAYMENT_PROFILE.cust_bill_city)
   * @param fetch whether to fetch this field or not
   */
  public void setCustBillCityFetch (boolean fetch) {
    this.CustBillCityFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustBillCity (PAYMENT_PROFILE.cust_bill_city)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustBillCityFetch () {
    return this.CustBillCityFetch;
  }
  /** Set the SortOrder for field: CustBillCity (PAYMENT_PROFILE.cust_bill_city)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustBillCitySortOrder (Integer value) {
    this.CustBillCitySort = value;
  }
  /** Retrieve SortOrder for field: CustBillCity (PAYMENT_PROFILE.cust_bill_city)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustBillCitySortOrder () {
    return this.CustBillCitySort;
  }
  /** Set the sort direction for field: CustBillCity (PAYMENT_PROFILE.cust_bill_city)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustBillCitySortDirection (boolean ascending) {
    this.CustBillCitySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustBillCity (PAYMENT_PROFILE.cust_bill_city)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustBillCitySortDirection () {
    return this.CustBillCitySortAscending;
  }
  /** Set the case insensitive for field: CustBillCity (PAYMENT_PROFILE.cust_bill_city)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustBillCityCaseInsensitive (boolean ascending) {
    this.CustBillCityCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustBillCity (PAYMENT_PROFILE.cust_bill_city)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustBillCityCaseInsensitive () {
    return this.CustBillCityCaseInsensitive;
  }
  /** Set the field level filters for field: CustBillCity (PAYMENT_PROFILE.cust_bill_city)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustBillCityFilter (StringFilter[] value) throws ServiceException {
    this.CustBillCity = value;
  }
  /** Retrieve filter for field: CustBillCity (PAYMENT_PROFILE.cust_bill_city)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustBillCityFilter () {
    return this.CustBillCity;
  }

  /**
   * Retrieves the CustBillCityFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustBillCityFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBillCityFilter field
   */
  public String[] getCustBillCityFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBillCityFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustBillCityFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBillCityFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBillCityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBillCityFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustBillCityFilter filter value from a formatted string
   *
   * @param _value the CustBillCityFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustBillCityFilter filter field
   */
  public void setCustBillCityFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustBillCityFilterFromFormattedString");
    try {
      this.setCustBillCityFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBillCityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBillCityFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBillCityFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustBillState (PAYMENT_PROFILE.cust_bill_state)
   * @param fetch whether to fetch this field or not
   */
  public void setCustBillStateFetch (boolean fetch) {
    this.CustBillStateFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustBillState (PAYMENT_PROFILE.cust_bill_state)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustBillStateFetch () {
    return this.CustBillStateFetch;
  }
  /** Set the SortOrder for field: CustBillState (PAYMENT_PROFILE.cust_bill_state)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustBillStateSortOrder (Integer value) {
    this.CustBillStateSort = value;
  }
  /** Retrieve SortOrder for field: CustBillState (PAYMENT_PROFILE.cust_bill_state)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustBillStateSortOrder () {
    return this.CustBillStateSort;
  }
  /** Set the sort direction for field: CustBillState (PAYMENT_PROFILE.cust_bill_state)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustBillStateSortDirection (boolean ascending) {
    this.CustBillStateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustBillState (PAYMENT_PROFILE.cust_bill_state)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustBillStateSortDirection () {
    return this.CustBillStateSortAscending;
  }
  /** Set the case insensitive for field: CustBillState (PAYMENT_PROFILE.cust_bill_state)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustBillStateCaseInsensitive (boolean ascending) {
    this.CustBillStateCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustBillState (PAYMENT_PROFILE.cust_bill_state)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustBillStateCaseInsensitive () {
    return this.CustBillStateCaseInsensitive;
  }
  /** Set the field level filters for field: CustBillState (PAYMENT_PROFILE.cust_bill_state)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustBillStateFilter (StringFilter[] value) throws ServiceException {
    this.CustBillState = value;
  }
  /** Retrieve filter for field: CustBillState (PAYMENT_PROFILE.cust_bill_state)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustBillStateFilter () {
    return this.CustBillState;
  }

  /**
   * Retrieves the CustBillStateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustBillStateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBillStateFilter field
   */
  public String[] getCustBillStateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBillStateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustBillStateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBillStateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBillStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBillStateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustBillStateFilter filter value from a formatted string
   *
   * @param _value the CustBillStateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustBillStateFilter filter field
   */
  public void setCustBillStateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustBillStateFilterFromFormattedString");
    try {
      this.setCustBillStateFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBillStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBillStateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBillStateFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustBillZip (PAYMENT_PROFILE.cust_bill_zip)
   * @param fetch whether to fetch this field or not
   */
  public void setCustBillZipFetch (boolean fetch) {
    this.CustBillZipFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustBillZip (PAYMENT_PROFILE.cust_bill_zip)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustBillZipFetch () {
    return this.CustBillZipFetch;
  }
  /** Set the SortOrder for field: CustBillZip (PAYMENT_PROFILE.cust_bill_zip)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustBillZipSortOrder (Integer value) {
    this.CustBillZipSort = value;
  }
  /** Retrieve SortOrder for field: CustBillZip (PAYMENT_PROFILE.cust_bill_zip)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustBillZipSortOrder () {
    return this.CustBillZipSort;
  }
  /** Set the sort direction for field: CustBillZip (PAYMENT_PROFILE.cust_bill_zip)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustBillZipSortDirection (boolean ascending) {
    this.CustBillZipSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustBillZip (PAYMENT_PROFILE.cust_bill_zip)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustBillZipSortDirection () {
    return this.CustBillZipSortAscending;
  }
  /** Set the case insensitive for field: CustBillZip (PAYMENT_PROFILE.cust_bill_zip)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustBillZipCaseInsensitive (boolean ascending) {
    this.CustBillZipCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustBillZip (PAYMENT_PROFILE.cust_bill_zip)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustBillZipCaseInsensitive () {
    return this.CustBillZipCaseInsensitive;
  }
  /** Set the field level filters for field: CustBillZip (PAYMENT_PROFILE.cust_bill_zip)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustBillZipFilter (StringFilter[] value) throws ServiceException {
    this.CustBillZip = value;
  }
  /** Retrieve filter for field: CustBillZip (PAYMENT_PROFILE.cust_bill_zip)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustBillZipFilter () {
    return this.CustBillZip;
  }

  /**
   * Retrieves the CustBillZipFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustBillZipFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBillZipFilter field
   */
  public String[] getCustBillZipFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBillZipFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustBillZipFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBillZipFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBillZipFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBillZipFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustBillZipFilter filter value from a formatted string
   *
   * @param _value the CustBillZipFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustBillZipFilter filter field
   */
  public void setCustBillZipFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustBillZipFilterFromFormattedString");
    try {
      this.setCustBillZipFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBillZipFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBillZipFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBillZipFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustBillCountryCode (PAYMENT_PROFILE.cust_bill_country_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCustBillCountryCodeFetch (boolean fetch) {
    this.CustBillCountryCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustBillCountryCode (PAYMENT_PROFILE.cust_bill_country_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustBillCountryCodeFetch () {
    return this.CustBillCountryCodeFetch;
  }
  /** Set the SortOrder for field: CustBillCountryCode (PAYMENT_PROFILE.cust_bill_country_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustBillCountryCodeSortOrder (Integer value) {
    this.CustBillCountryCodeSort = value;
  }
  /** Retrieve SortOrder for field: CustBillCountryCode (PAYMENT_PROFILE.cust_bill_country_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustBillCountryCodeSortOrder () {
    return this.CustBillCountryCodeSort;
  }
  /** Set the sort direction for field: CustBillCountryCode (PAYMENT_PROFILE.cust_bill_country_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustBillCountryCodeSortDirection (boolean ascending) {
    this.CustBillCountryCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustBillCountryCode (PAYMENT_PROFILE.cust_bill_country_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustBillCountryCodeSortDirection () {
    return this.CustBillCountryCodeSortAscending;
  }
  /** Set the field level filters for field: CustBillCountryCode (PAYMENT_PROFILE.cust_bill_country_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustBillCountryCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CustBillCountryCode = value;
  }
  /** Retrieve filter for field: CustBillCountryCode (PAYMENT_PROFILE.cust_bill_country_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCustBillCountryCodeFilter () {
    return this.CustBillCountryCode;
  }

  /**
   * Retrieves the CustBillCountryCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustBillCountryCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBillCountryCodeFilter field
   */
  public String[] getCustBillCountryCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBillCountryCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustBillCountryCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBillCountryCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBillCountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBillCountryCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustBillCountryCodeFilter filter value from a formatted string
   *
   * @param _value the CustBillCountryCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustBillCountryCodeFilter filter field
   */
  public void setCustBillCountryCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustBillCountryCodeFilterFromFormattedString");
    try {
      this.setCustBillCountryCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustBillCountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBillCountryCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBillCountryCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DriverLicenseNum (PAYMENT_PROFILE.driver_license_num)
   * @param fetch whether to fetch this field or not
   */
  public void setDriverLicenseNumFetch (boolean fetch) {
    this.DriverLicenseNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: DriverLicenseNum (PAYMENT_PROFILE.driver_license_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getDriverLicenseNumFetch () {
    return this.DriverLicenseNumFetch;
  }
  /** Set the SortOrder for field: DriverLicenseNum (PAYMENT_PROFILE.driver_license_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDriverLicenseNumSortOrder (Integer value) {
    this.DriverLicenseNumSort = value;
  }
  /** Retrieve SortOrder for field: DriverLicenseNum (PAYMENT_PROFILE.driver_license_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDriverLicenseNumSortOrder () {
    return this.DriverLicenseNumSort;
  }
  /** Set the sort direction for field: DriverLicenseNum (PAYMENT_PROFILE.driver_license_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDriverLicenseNumSortDirection (boolean ascending) {
    this.DriverLicenseNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DriverLicenseNum (PAYMENT_PROFILE.driver_license_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDriverLicenseNumSortDirection () {
    return this.DriverLicenseNumSortAscending;
  }
  /** Set the case insensitive for field: DriverLicenseNum (PAYMENT_PROFILE.driver_license_num)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDriverLicenseNumCaseInsensitive (boolean ascending) {
    this.DriverLicenseNumCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DriverLicenseNum (PAYMENT_PROFILE.driver_license_num)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDriverLicenseNumCaseInsensitive () {
    return this.DriverLicenseNumCaseInsensitive;
  }
  /** Set the field level filters for field: DriverLicenseNum (PAYMENT_PROFILE.driver_license_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDriverLicenseNumFilter (StringFilter[] value) throws ServiceException {
    this.DriverLicenseNum = value;
  }
  /** Retrieve filter for field: DriverLicenseNum (PAYMENT_PROFILE.driver_license_num)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDriverLicenseNumFilter () {
    return this.DriverLicenseNum;
  }

  /**
   * Retrieves the DriverLicenseNumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DriverLicenseNumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DriverLicenseNumFilter field
   */
  public String[] getDriverLicenseNumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDriverLicenseNumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDriverLicenseNumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDriverLicenseNumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DriverLicenseNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDriverLicenseNumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DriverLicenseNumFilter filter value from a formatted string
   *
   * @param _value the DriverLicenseNumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DriverLicenseNumFilter filter field
   */
  public void setDriverLicenseNumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDriverLicenseNumFilterFromFormattedString");
    try {
      this.setDriverLicenseNumFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DriverLicenseNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDriverLicenseNumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDriverLicenseNumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DriverLicenseState (PAYMENT_PROFILE.driver_license_state)
   * @param fetch whether to fetch this field or not
   */
  public void setDriverLicenseStateFetch (boolean fetch) {
    this.DriverLicenseStateFetch = fetch;
  }
  /** Retrieve Fetch value for field: DriverLicenseState (PAYMENT_PROFILE.driver_license_state)
   * @return boolean the Fetch value for this field
   */
  public boolean getDriverLicenseStateFetch () {
    return this.DriverLicenseStateFetch;
  }
  /** Set the SortOrder for field: DriverLicenseState (PAYMENT_PROFILE.driver_license_state)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDriverLicenseStateSortOrder (Integer value) {
    this.DriverLicenseStateSort = value;
  }
  /** Retrieve SortOrder for field: DriverLicenseState (PAYMENT_PROFILE.driver_license_state)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDriverLicenseStateSortOrder () {
    return this.DriverLicenseStateSort;
  }
  /** Set the sort direction for field: DriverLicenseState (PAYMENT_PROFILE.driver_license_state)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDriverLicenseStateSortDirection (boolean ascending) {
    this.DriverLicenseStateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DriverLicenseState (PAYMENT_PROFILE.driver_license_state)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDriverLicenseStateSortDirection () {
    return this.DriverLicenseStateSortAscending;
  }
  /** Set the case insensitive for field: DriverLicenseState (PAYMENT_PROFILE.driver_license_state)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDriverLicenseStateCaseInsensitive (boolean ascending) {
    this.DriverLicenseStateCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DriverLicenseState (PAYMENT_PROFILE.driver_license_state)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDriverLicenseStateCaseInsensitive () {
    return this.DriverLicenseStateCaseInsensitive;
  }
  /** Set the field level filters for field: DriverLicenseState (PAYMENT_PROFILE.driver_license_state)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDriverLicenseStateFilter (StringFilter[] value) throws ServiceException {
    this.DriverLicenseState = value;
  }
  /** Retrieve filter for field: DriverLicenseState (PAYMENT_PROFILE.driver_license_state)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDriverLicenseStateFilter () {
    return this.DriverLicenseState;
  }

  /**
   * Retrieves the DriverLicenseStateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DriverLicenseStateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DriverLicenseStateFilter field
   */
  public String[] getDriverLicenseStateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDriverLicenseStateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDriverLicenseStateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDriverLicenseStateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DriverLicenseStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDriverLicenseStateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DriverLicenseStateFilter filter value from a formatted string
   *
   * @param _value the DriverLicenseStateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DriverLicenseStateFilter filter field
   */
  public void setDriverLicenseStateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDriverLicenseStateFilterFromFormattedString");
    try {
      this.setDriverLicenseStateFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DriverLicenseStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDriverLicenseStateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDriverLicenseStateFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustCompanyName (PAYMENT_PROFILE.cust_company_name)
   * @param fetch whether to fetch this field or not
   */
  public void setCustCompanyNameFetch (boolean fetch) {
    this.CustCompanyNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustCompanyName (PAYMENT_PROFILE.cust_company_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustCompanyNameFetch () {
    return this.CustCompanyNameFetch;
  }
  /** Set the SortOrder for field: CustCompanyName (PAYMENT_PROFILE.cust_company_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustCompanyNameSortOrder (Integer value) {
    this.CustCompanyNameSort = value;
  }
  /** Retrieve SortOrder for field: CustCompanyName (PAYMENT_PROFILE.cust_company_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustCompanyNameSortOrder () {
    return this.CustCompanyNameSort;
  }
  /** Set the sort direction for field: CustCompanyName (PAYMENT_PROFILE.cust_company_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustCompanyNameSortDirection (boolean ascending) {
    this.CustCompanyNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustCompanyName (PAYMENT_PROFILE.cust_company_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustCompanyNameSortDirection () {
    return this.CustCompanyNameSortAscending;
  }
  /** Set the case insensitive for field: CustCompanyName (PAYMENT_PROFILE.cust_company_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustCompanyNameCaseInsensitive (boolean ascending) {
    this.CustCompanyNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustCompanyName (PAYMENT_PROFILE.cust_company_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustCompanyNameCaseInsensitive () {
    return this.CustCompanyNameCaseInsensitive;
  }
  /** Set the field level filters for field: CustCompanyName (PAYMENT_PROFILE.cust_company_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustCompanyNameFilter (StringFilter[] value) throws ServiceException {
    this.CustCompanyName = value;
  }
  /** Retrieve filter for field: CustCompanyName (PAYMENT_PROFILE.cust_company_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustCompanyNameFilter () {
    return this.CustCompanyName;
  }

  /**
   * Retrieves the CustCompanyNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustCompanyNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustCompanyNameFilter field
   */
  public String[] getCustCompanyNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustCompanyNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustCompanyNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustCompanyNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustCompanyNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustCompanyNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustCompanyNameFilter filter value from a formatted string
   *
   * @param _value the CustCompanyNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustCompanyNameFilter filter field
   */
  public void setCustCompanyNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustCompanyNameFilterFromFormattedString");
    try {
      this.setCustCompanyNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustCompanyNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustCompanyNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustCompanyNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillCompanyTaxId (PAYMENT_PROFILE.bill_company_tax_id)
   * @param fetch whether to fetch this field or not
   */
  public void setBillCompanyTaxIdFetch (boolean fetch) {
    this.BillCompanyTaxIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillCompanyTaxId (PAYMENT_PROFILE.bill_company_tax_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillCompanyTaxIdFetch () {
    return this.BillCompanyTaxIdFetch;
  }
  /** Set the SortOrder for field: BillCompanyTaxId (PAYMENT_PROFILE.bill_company_tax_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillCompanyTaxIdSortOrder (Integer value) {
    this.BillCompanyTaxIdSort = value;
  }
  /** Retrieve SortOrder for field: BillCompanyTaxId (PAYMENT_PROFILE.bill_company_tax_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillCompanyTaxIdSortOrder () {
    return this.BillCompanyTaxIdSort;
  }
  /** Set the sort direction for field: BillCompanyTaxId (PAYMENT_PROFILE.bill_company_tax_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillCompanyTaxIdSortDirection (boolean ascending) {
    this.BillCompanyTaxIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillCompanyTaxId (PAYMENT_PROFILE.bill_company_tax_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillCompanyTaxIdSortDirection () {
    return this.BillCompanyTaxIdSortAscending;
  }
  /** Set the field level filters for field: BillCompanyTaxId (PAYMENT_PROFILE.bill_company_tax_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillCompanyTaxIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.BillCompanyTaxId = value;
  }
  /** Retrieve filter for field: BillCompanyTaxId (PAYMENT_PROFILE.bill_company_tax_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getBillCompanyTaxIdFilter () {
    return this.BillCompanyTaxId;
  }

  /**
   * Retrieves the BillCompanyTaxIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillCompanyTaxIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCompanyTaxIdFilter field
   */
  public String[] getBillCompanyTaxIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCompanyTaxIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillCompanyTaxIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCompanyTaxIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCompanyTaxIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCompanyTaxIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillCompanyTaxIdFilter filter value from a formatted string
   *
   * @param _value the BillCompanyTaxIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillCompanyTaxIdFilter filter field
   */
  public void setBillCompanyTaxIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillCompanyTaxIdFilterFromFormattedString");
    try {
      this.setBillCompanyTaxIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCompanyTaxIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCompanyTaxIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCompanyTaxIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustPhone (PAYMENT_PROFILE.cust_phone)
   * @param fetch whether to fetch this field or not
   */
  public void setCustPhoneFetch (boolean fetch) {
    this.CustPhoneFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustPhone (PAYMENT_PROFILE.cust_phone)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustPhoneFetch () {
    return this.CustPhoneFetch;
  }
  /** Set the SortOrder for field: CustPhone (PAYMENT_PROFILE.cust_phone)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustPhoneSortOrder (Integer value) {
    this.CustPhoneSort = value;
  }
  /** Retrieve SortOrder for field: CustPhone (PAYMENT_PROFILE.cust_phone)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustPhoneSortOrder () {
    return this.CustPhoneSort;
  }
  /** Set the sort direction for field: CustPhone (PAYMENT_PROFILE.cust_phone)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustPhoneSortDirection (boolean ascending) {
    this.CustPhoneSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustPhone (PAYMENT_PROFILE.cust_phone)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustPhoneSortDirection () {
    return this.CustPhoneSortAscending;
  }
  /** Set the case insensitive for field: CustPhone (PAYMENT_PROFILE.cust_phone)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustPhoneCaseInsensitive (boolean ascending) {
    this.CustPhoneCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustPhone (PAYMENT_PROFILE.cust_phone)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustPhoneCaseInsensitive () {
    return this.CustPhoneCaseInsensitive;
  }
  /** Set the field level filters for field: CustPhone (PAYMENT_PROFILE.cust_phone)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustPhoneFilter (StringFilter[] value) throws ServiceException {
    this.CustPhone = value;
  }
  /** Retrieve filter for field: CustPhone (PAYMENT_PROFILE.cust_phone)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustPhoneFilter () {
    return this.CustPhone;
  }

  /**
   * Retrieves the CustPhoneFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustPhoneFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustPhoneFilter field
   */
  public String[] getCustPhoneFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustPhoneFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustPhoneFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustPhoneFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustPhoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustPhoneFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustPhoneFilter filter value from a formatted string
   *
   * @param _value the CustPhoneFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustPhoneFilter filter field
   */
  public void setCustPhoneFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustPhoneFilterFromFormattedString");
    try {
      this.setCustPhoneFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustPhoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustPhoneFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustPhoneFilterFromFormattedString");
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

  /** Set the field level Fetch value for field: Status (PAYMENT_PROFILE.status)
   * @param fetch whether to fetch this field or not
   */
  public void setStatusFetch (boolean fetch) {
    this.StatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: Status (PAYMENT_PROFILE.status)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatusFetch () {
    return this.StatusFetch;
  }
  /** Set the SortOrder for field: Status (PAYMENT_PROFILE.status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatusSortOrder (Integer value) {
    this.StatusSort = value;
  }
  /** Retrieve SortOrder for field: Status (PAYMENT_PROFILE.status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatusSortOrder () {
    return this.StatusSort;
  }
  /** Set the sort direction for field: Status (PAYMENT_PROFILE.status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatusSortDirection (boolean ascending) {
    this.StatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Status (PAYMENT_PROFILE.status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatusSortDirection () {
    return this.StatusSortAscending;
  }
  /** Set the field level filters for field: Status (PAYMENT_PROFILE.status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.Status = value;
  }
  /** Retrieve filter for field: Status (PAYMENT_PROFILE.status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getStatusFilter () {
    return this.Status;
  }

  /**
   * Retrieves the StatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusFilter field
   */
  public String[] getStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatusFilter filter value from a formatted string
   *
   * @param _value the StatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatusFilter filter field
   */
  public void setStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatusFilterFromFormattedString");
    try {
      this.setStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CyclicalBillUsed (PAYMENT_PROFILE.cyclical_bill_used)
   * @param fetch whether to fetch this field or not
   */
  public void setCyclicalBillUsedFetch (boolean fetch) {
    this.CyclicalBillUsedFetch = fetch;
  }
  /** Retrieve Fetch value for field: CyclicalBillUsed (PAYMENT_PROFILE.cyclical_bill_used)
   * @return boolean the Fetch value for this field
   */
  public boolean getCyclicalBillUsedFetch () {
    return this.CyclicalBillUsedFetch;
  }
  /** Set the SortOrder for field: CyclicalBillUsed (PAYMENT_PROFILE.cyclical_bill_used)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCyclicalBillUsedSortOrder (Integer value) {
    this.CyclicalBillUsedSort = value;
  }
  /** Retrieve SortOrder for field: CyclicalBillUsed (PAYMENT_PROFILE.cyclical_bill_used)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCyclicalBillUsedSortOrder () {
    return this.CyclicalBillUsedSort;
  }
  /** Set the sort direction for field: CyclicalBillUsed (PAYMENT_PROFILE.cyclical_bill_used)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCyclicalBillUsedSortDirection (boolean ascending) {
    this.CyclicalBillUsedSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CyclicalBillUsed (PAYMENT_PROFILE.cyclical_bill_used)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCyclicalBillUsedSortDirection () {
    return this.CyclicalBillUsedSortAscending;
  }
  /** Set the field level filters for field: CyclicalBillUsed (PAYMENT_PROFILE.cyclical_bill_used)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCyclicalBillUsedFilter (BooleanFilter[] value) throws ServiceException {
    this.CyclicalBillUsed = value;
  }
  /** Retrieve filter for field: CyclicalBillUsed (PAYMENT_PROFILE.cyclical_bill_used)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getCyclicalBillUsedFilter () {
    return this.CyclicalBillUsed;
  }

  /**
   * Retrieves the CyclicalBillUsedFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CyclicalBillUsedFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CyclicalBillUsedFilter field
   */
  public String[] getCyclicalBillUsedFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCyclicalBillUsedFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCyclicalBillUsedFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCyclicalBillUsedFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CyclicalBillUsedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCyclicalBillUsedFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CyclicalBillUsedFilter filter value from a formatted string
   *
   * @param _value the CyclicalBillUsedFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CyclicalBillUsedFilter filter field
   */
  public void setCyclicalBillUsedFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCyclicalBillUsedFilterFromFormattedString");
    try {
      this.setCyclicalBillUsedFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CyclicalBillUsedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCyclicalBillUsedFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCyclicalBillUsedFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsDefault (PAYMENT_PROFILE.is_default)
   * @param fetch whether to fetch this field or not
   */
  public void setIsDefaultFetch (boolean fetch) {
    this.IsDefaultFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsDefault (PAYMENT_PROFILE.is_default)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsDefaultFetch () {
    return this.IsDefaultFetch;
  }
  /** Set the SortOrder for field: IsDefault (PAYMENT_PROFILE.is_default)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsDefaultSortOrder (Integer value) {
    this.IsDefaultSort = value;
  }
  /** Retrieve SortOrder for field: IsDefault (PAYMENT_PROFILE.is_default)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsDefaultSortOrder () {
    return this.IsDefaultSort;
  }
  /** Set the sort direction for field: IsDefault (PAYMENT_PROFILE.is_default)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsDefaultSortDirection (boolean ascending) {
    this.IsDefaultSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsDefault (PAYMENT_PROFILE.is_default)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsDefaultSortDirection () {
    return this.IsDefaultSortAscending;
  }
  /** Set the field level filters for field: IsDefault (PAYMENT_PROFILE.is_default)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsDefaultFilter (BooleanFilter[] value) throws ServiceException {
    this.IsDefault = value;
  }
  /** Retrieve filter for field: IsDefault (PAYMENT_PROFILE.is_default)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsDefaultFilter () {
    return this.IsDefault;
  }

  /**
   * Retrieves the IsDefaultFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsDefaultFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDefaultFilter field
   */
  public String[] getIsDefaultFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDefaultFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsDefaultFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDefaultFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDefaultFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDefaultFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsDefaultFilter filter value from a formatted string
   *
   * @param _value the IsDefaultFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsDefaultFilter filter field
   */
  public void setIsDefaultFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsDefaultFilterFromFormattedString");
    try {
      this.setIsDefaultFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDefaultFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDefaultFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDefaultFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NonRealtimeOnly (PAYMENT_PROFILE.non_realtime_only)
   * @param fetch whether to fetch this field or not
   */
  public void setNonRealtimeOnlyFetch (boolean fetch) {
    this.NonRealtimeOnlyFetch = fetch;
  }
  /** Retrieve Fetch value for field: NonRealtimeOnly (PAYMENT_PROFILE.non_realtime_only)
   * @return boolean the Fetch value for this field
   */
  public boolean getNonRealtimeOnlyFetch () {
    return this.NonRealtimeOnlyFetch;
  }
  /** Set the SortOrder for field: NonRealtimeOnly (PAYMENT_PROFILE.non_realtime_only)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNonRealtimeOnlySortOrder (Integer value) {
    this.NonRealtimeOnlySort = value;
  }
  /** Retrieve SortOrder for field: NonRealtimeOnly (PAYMENT_PROFILE.non_realtime_only)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNonRealtimeOnlySortOrder () {
    return this.NonRealtimeOnlySort;
  }
  /** Set the sort direction for field: NonRealtimeOnly (PAYMENT_PROFILE.non_realtime_only)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNonRealtimeOnlySortDirection (boolean ascending) {
    this.NonRealtimeOnlySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NonRealtimeOnly (PAYMENT_PROFILE.non_realtime_only)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNonRealtimeOnlySortDirection () {
    return this.NonRealtimeOnlySortAscending;
  }
  /** Set the field level filters for field: NonRealtimeOnly (PAYMENT_PROFILE.non_realtime_only)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNonRealtimeOnlyFilter (BooleanFilter[] value) throws ServiceException {
    this.NonRealtimeOnly = value;
  }
  /** Retrieve filter for field: NonRealtimeOnly (PAYMENT_PROFILE.non_realtime_only)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getNonRealtimeOnlyFilter () {
    return this.NonRealtimeOnly;
  }

  /**
   * Retrieves the NonRealtimeOnlyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NonRealtimeOnlyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NonRealtimeOnlyFilter field
   */
  public String[] getNonRealtimeOnlyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNonRealtimeOnlyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNonRealtimeOnlyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNonRealtimeOnlyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NonRealtimeOnlyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNonRealtimeOnlyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NonRealtimeOnlyFilter filter value from a formatted string
   *
   * @param _value the NonRealtimeOnlyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NonRealtimeOnlyFilter filter field
   */
  public void setNonRealtimeOnlyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNonRealtimeOnlyFilterFromFormattedString");
    try {
      this.setNonRealtimeOnlyFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NonRealtimeOnlyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNonRealtimeOnlyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNonRealtimeOnlyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsTemporary (PAYMENT_PROFILE.is_temporary)
   * @param fetch whether to fetch this field or not
   */
  public void setIsTemporaryFetch (boolean fetch) {
    this.IsTemporaryFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsTemporary (PAYMENT_PROFILE.is_temporary)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsTemporaryFetch () {
    return this.IsTemporaryFetch;
  }
  /** Set the SortOrder for field: IsTemporary (PAYMENT_PROFILE.is_temporary)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsTemporarySortOrder (Integer value) {
    this.IsTemporarySort = value;
  }
  /** Retrieve SortOrder for field: IsTemporary (PAYMENT_PROFILE.is_temporary)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsTemporarySortOrder () {
    return this.IsTemporarySort;
  }
  /** Set the sort direction for field: IsTemporary (PAYMENT_PROFILE.is_temporary)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsTemporarySortDirection (boolean ascending) {
    this.IsTemporarySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsTemporary (PAYMENT_PROFILE.is_temporary)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsTemporarySortDirection () {
    return this.IsTemporarySortAscending;
  }
  /** Set the field level filters for field: IsTemporary (PAYMENT_PROFILE.is_temporary)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsTemporaryFilter (BooleanFilter[] value) throws ServiceException {
    this.IsTemporary = value;
  }
  /** Retrieve filter for field: IsTemporary (PAYMENT_PROFILE.is_temporary)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsTemporaryFilter () {
    return this.IsTemporary;
  }

  /**
   * Retrieves the IsTemporaryFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsTemporaryFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsTemporaryFilter field
   */
  public String[] getIsTemporaryFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsTemporaryFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsTemporaryFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsTemporaryFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsTemporaryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsTemporaryFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsTemporaryFilter filter value from a formatted string
   *
   * @param _value the IsTemporaryFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsTemporaryFilter filter field
   */
  public void setIsTemporaryFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsTemporaryFilterFromFormattedString");
    try {
      this.setIsTemporaryFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsTemporaryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsTemporaryFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsTemporaryFilterFromFormattedString");
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

  /** Set the field level Fetch value for field: EpgSubscriptionId (PAYMENT_PROFILE.epg_subscription_id)
   * @param fetch whether to fetch this field or not
   */
  public void setEpgSubscriptionIdFetch (boolean fetch) {
    this.EpgSubscriptionIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: EpgSubscriptionId (PAYMENT_PROFILE.epg_subscription_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getEpgSubscriptionIdFetch () {
    return this.EpgSubscriptionIdFetch;
  }
  /** Set the SortOrder for field: EpgSubscriptionId (PAYMENT_PROFILE.epg_subscription_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEpgSubscriptionIdSortOrder (Integer value) {
    this.EpgSubscriptionIdSort = value;
  }
  /** Retrieve SortOrder for field: EpgSubscriptionId (PAYMENT_PROFILE.epg_subscription_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEpgSubscriptionIdSortOrder () {
    return this.EpgSubscriptionIdSort;
  }
  /** Set the sort direction for field: EpgSubscriptionId (PAYMENT_PROFILE.epg_subscription_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEpgSubscriptionIdSortDirection (boolean ascending) {
    this.EpgSubscriptionIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EpgSubscriptionId (PAYMENT_PROFILE.epg_subscription_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEpgSubscriptionIdSortDirection () {
    return this.EpgSubscriptionIdSortAscending;
  }
  /** Set the case insensitive for field: EpgSubscriptionId (PAYMENT_PROFILE.epg_subscription_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setEpgSubscriptionIdCaseInsensitive (boolean ascending) {
    this.EpgSubscriptionIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: EpgSubscriptionId (PAYMENT_PROFILE.epg_subscription_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getEpgSubscriptionIdCaseInsensitive () {
    return this.EpgSubscriptionIdCaseInsensitive;
  }
  /** Set the field level filters for field: EpgSubscriptionId (PAYMENT_PROFILE.epg_subscription_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEpgSubscriptionIdFilter (StringFilter[] value) throws ServiceException {
    this.EpgSubscriptionId = value;
  }
  /** Retrieve filter for field: EpgSubscriptionId (PAYMENT_PROFILE.epg_subscription_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getEpgSubscriptionIdFilter () {
    return this.EpgSubscriptionId;
  }

  /**
   * Retrieves the EpgSubscriptionIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EpgSubscriptionIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EpgSubscriptionIdFilter field
   */
  public String[] getEpgSubscriptionIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEpgSubscriptionIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEpgSubscriptionIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEpgSubscriptionIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EpgSubscriptionIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEpgSubscriptionIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EpgSubscriptionIdFilter filter value from a formatted string
   *
   * @param _value the EpgSubscriptionIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EpgSubscriptionIdFilter filter field
   */
  public void setEpgSubscriptionIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEpgSubscriptionIdFilterFromFormattedString");
    try {
      this.setEpgSubscriptionIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EpgSubscriptionIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEpgSubscriptionIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEpgSubscriptionIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ReferenceNumber (PAYMENT_PROFILE.reference_number)
   * @param fetch whether to fetch this field or not
   */
  public void setReferenceNumberFetch (boolean fetch) {
    this.ReferenceNumberFetch = fetch;
  }
  /** Retrieve Fetch value for field: ReferenceNumber (PAYMENT_PROFILE.reference_number)
   * @return boolean the Fetch value for this field
   */
  public boolean getReferenceNumberFetch () {
    return this.ReferenceNumberFetch;
  }
  /** Set the SortOrder for field: ReferenceNumber (PAYMENT_PROFILE.reference_number)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setReferenceNumberSortOrder (Integer value) {
    this.ReferenceNumberSort = value;
  }
  /** Retrieve SortOrder for field: ReferenceNumber (PAYMENT_PROFILE.reference_number)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getReferenceNumberSortOrder () {
    return this.ReferenceNumberSort;
  }
  /** Set the sort direction for field: ReferenceNumber (PAYMENT_PROFILE.reference_number)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setReferenceNumberSortDirection (boolean ascending) {
    this.ReferenceNumberSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ReferenceNumber (PAYMENT_PROFILE.reference_number)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getReferenceNumberSortDirection () {
    return this.ReferenceNumberSortAscending;
  }
  /** Set the case insensitive for field: ReferenceNumber (PAYMENT_PROFILE.reference_number)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setReferenceNumberCaseInsensitive (boolean ascending) {
    this.ReferenceNumberCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ReferenceNumber (PAYMENT_PROFILE.reference_number)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getReferenceNumberCaseInsensitive () {
    return this.ReferenceNumberCaseInsensitive;
  }
  /** Set the field level filters for field: ReferenceNumber (PAYMENT_PROFILE.reference_number)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setReferenceNumberFilter (StringFilter[] value) throws ServiceException {
    this.ReferenceNumber = value;
  }
  /** Retrieve filter for field: ReferenceNumber (PAYMENT_PROFILE.reference_number)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getReferenceNumberFilter () {
    return this.ReferenceNumber;
  }

  /**
   * Retrieves the ReferenceNumberFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ReferenceNumberFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ReferenceNumberFilter field
   */
  public String[] getReferenceNumberFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReferenceNumberFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getReferenceNumberFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getReferenceNumberFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReferenceNumberFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getReferenceNumberFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ReferenceNumberFilter filter value from a formatted string
   *
   * @param _value the ReferenceNumberFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ReferenceNumberFilter filter field
   */
  public void setReferenceNumberFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setReferenceNumberFilterFromFormattedString");
    try {
      this.setReferenceNumberFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReferenceNumberFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setReferenceNumberFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setReferenceNumberFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransactionUuid (PAYMENT_PROFILE.transaction_uuid)
   * @param fetch whether to fetch this field or not
   */
  public void setTransactionUuidFetch (boolean fetch) {
    this.TransactionUuidFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransactionUuid (PAYMENT_PROFILE.transaction_uuid)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransactionUuidFetch () {
    return this.TransactionUuidFetch;
  }
  /** Set the SortOrder for field: TransactionUuid (PAYMENT_PROFILE.transaction_uuid)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransactionUuidSortOrder (Integer value) {
    this.TransactionUuidSort = value;
  }
  /** Retrieve SortOrder for field: TransactionUuid (PAYMENT_PROFILE.transaction_uuid)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransactionUuidSortOrder () {
    return this.TransactionUuidSort;
  }
  /** Set the sort direction for field: TransactionUuid (PAYMENT_PROFILE.transaction_uuid)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransactionUuidSortDirection (boolean ascending) {
    this.TransactionUuidSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransactionUuid (PAYMENT_PROFILE.transaction_uuid)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransactionUuidSortDirection () {
    return this.TransactionUuidSortAscending;
  }
  /** Set the case insensitive for field: TransactionUuid (PAYMENT_PROFILE.transaction_uuid)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setTransactionUuidCaseInsensitive (boolean ascending) {
    this.TransactionUuidCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: TransactionUuid (PAYMENT_PROFILE.transaction_uuid)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getTransactionUuidCaseInsensitive () {
    return this.TransactionUuidCaseInsensitive;
  }
  /** Set the field level filters for field: TransactionUuid (PAYMENT_PROFILE.transaction_uuid)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransactionUuidFilter (StringFilter[] value) throws ServiceException {
    this.TransactionUuid = value;
  }
  /** Retrieve filter for field: TransactionUuid (PAYMENT_PROFILE.transaction_uuid)
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

  /** Set the field level Fetch value for field: ProfileCreationTime (PAYMENT_PROFILE.profile_creation_time)
   * @param fetch whether to fetch this field or not
   */
  public void setProfileCreationTimeFetch (boolean fetch) {
    this.ProfileCreationTimeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProfileCreationTime (PAYMENT_PROFILE.profile_creation_time)
   * @return boolean the Fetch value for this field
   */
  public boolean getProfileCreationTimeFetch () {
    return this.ProfileCreationTimeFetch;
  }
  /** Set the SortOrder for field: ProfileCreationTime (PAYMENT_PROFILE.profile_creation_time)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProfileCreationTimeSortOrder (Integer value) {
    this.ProfileCreationTimeSort = value;
  }
  /** Retrieve SortOrder for field: ProfileCreationTime (PAYMENT_PROFILE.profile_creation_time)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProfileCreationTimeSortOrder () {
    return this.ProfileCreationTimeSort;
  }
  /** Set the sort direction for field: ProfileCreationTime (PAYMENT_PROFILE.profile_creation_time)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProfileCreationTimeSortDirection (boolean ascending) {
    this.ProfileCreationTimeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProfileCreationTime (PAYMENT_PROFILE.profile_creation_time)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProfileCreationTimeSortDirection () {
    return this.ProfileCreationTimeSortAscending;
  }
  /** Set the field level filters for field: ProfileCreationTime (PAYMENT_PROFILE.profile_creation_time)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProfileCreationTimeFilter (DateFilter[] value) throws ServiceException {
    this.ProfileCreationTime = value;
  }
  /** Retrieve filter for field: ProfileCreationTime (PAYMENT_PROFILE.profile_creation_time)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getProfileCreationTimeFilter () {
    return this.ProfileCreationTime;
  }

  /**
   * Retrieves the ProfileCreationTimeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProfileCreationTimeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProfileCreationTimeFilter field
   */
  public String[] getProfileCreationTimeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileCreationTimeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProfileCreationTimeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProfileCreationTimeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProfileCreationTimeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProfileCreationTimeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProfileCreationTimeFilter filter value from a formatted string
   *
   * @param _value the ProfileCreationTimeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProfileCreationTimeFilter filter field
   */
  public void setProfileCreationTimeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProfileCreationTimeFilterFromFormattedString");
    try {
      this.setProfileCreationTimeFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProfileCreationTimeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProfileCreationTimeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProfileCreationTimeFilterFromFormattedString");
  }

  /**
   * Retrieves the ProfileCreationTimeFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProfileCreationTimeFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProfileCreationTimeFilter field
   */
  public String[] getProfileCreationTimeFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileCreationTimeFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProfileCreationTimeFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProfileCreationTimeFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProfileCreationTimeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProfileCreationTimeFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ProfileCreationTimeFilter filter value from a formatted string
   *
   * @param _value the ProfileCreationTimeFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProfileCreationTimeFilter filter field
   */
  public void setProfileCreationTimeFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProfileCreationTimeFilterFromFormattedDateTimeString");
    try {
      this.setProfileCreationTimeFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProfileCreationTimeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProfileCreationTimeFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProfileCreationTimeFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: PaymentMerchantId (PAYMENT_PROFILE.payment_merchant_id)
   * @param fetch whether to fetch this field or not
   */
  public void setPaymentMerchantIdFetch (boolean fetch) {
    this.PaymentMerchantIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PaymentMerchantId (PAYMENT_PROFILE.payment_merchant_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getPaymentMerchantIdFetch () {
    return this.PaymentMerchantIdFetch;
  }
  /** Set the SortOrder for field: PaymentMerchantId (PAYMENT_PROFILE.payment_merchant_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPaymentMerchantIdSortOrder (Integer value) {
    this.PaymentMerchantIdSort = value;
  }
  /** Retrieve SortOrder for field: PaymentMerchantId (PAYMENT_PROFILE.payment_merchant_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPaymentMerchantIdSortOrder () {
    return this.PaymentMerchantIdSort;
  }
  /** Set the sort direction for field: PaymentMerchantId (PAYMENT_PROFILE.payment_merchant_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPaymentMerchantIdSortDirection (boolean ascending) {
    this.PaymentMerchantIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PaymentMerchantId (PAYMENT_PROFILE.payment_merchant_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPaymentMerchantIdSortDirection () {
    return this.PaymentMerchantIdSortAscending;
  }
  /** Set the field level filters for field: PaymentMerchantId (PAYMENT_PROFILE.payment_merchant_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPaymentMerchantIdFilter (IntegerFilter[] value) throws ServiceException {
    this.PaymentMerchantId = value;
  }
  /** Retrieve filter for field: PaymentMerchantId (PAYMENT_PROFILE.payment_merchant_id)
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


  /** Set the field level Fetch value for field: IsCurrent (CUSTOMER_ID_ACCT_MAP.is_current)
   * @param fetch whether to fetch this field or not
   */
  public void setIsCurrentFetch (boolean fetch) {
    this.IsCurrentFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsCurrent (CUSTOMER_ID_ACCT_MAP.is_current)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsCurrentFetch () {
    return this.IsCurrentFetch;
  }
  /** Set the SortOrder for field: IsCurrent (CUSTOMER_ID_ACCT_MAP.is_current)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsCurrentSortOrder (Integer value) {
    this.IsCurrentSort = value;
  }
  /** Retrieve SortOrder for field: IsCurrent (CUSTOMER_ID_ACCT_MAP.is_current)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsCurrentSortOrder () {
    return this.IsCurrentSort;
  }
  /** Set the sort direction for field: IsCurrent (CUSTOMER_ID_ACCT_MAP.is_current)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsCurrentSortDirection (boolean ascending) {
    this.IsCurrentSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsCurrent (CUSTOMER_ID_ACCT_MAP.is_current)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsCurrentSortDirection () {
    return this.IsCurrentSortAscending;
  }
  /** Set the field level filters for field: IsCurrent (CUSTOMER_ID_ACCT_MAP.is_current)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsCurrentFilter (BooleanFilter[] value) throws ServiceException {
    this.IsCurrent = value;
  }
  /** Retrieve filter for field: IsCurrent (CUSTOMER_ID_ACCT_MAP.is_current)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsCurrentFilter () {
    return this.IsCurrent;
  }

  /**
   * Retrieves the IsCurrentFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsCurrentFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsCurrentFilter field
   */
  public String[] getIsCurrentFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsCurrentFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsCurrentFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsCurrentFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsCurrentFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsCurrentFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsCurrentFilter filter value from a formatted string
   *
   * @param _value the IsCurrentFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsCurrentFilter filter field
   */
  public void setIsCurrentFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsCurrentFilterFromFormattedString");
    try {
      this.setIsCurrentFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsCurrentFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsCurrentFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsCurrentFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDateFetch (boolean fetch) {
    this.ActiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDateFetch () {
    return this.ActiveDateFetch;
  }
  /** Set the SortOrder for field: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDateSortOrder (Integer value) {
    this.ActiveDateSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDateSortOrder () {
    return this.ActiveDateSort;
  }
  /** Set the sort direction for field: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDateSortDirection (boolean ascending) {
    this.ActiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDateSortDirection () {
    return this.ActiveDateSortAscending;
  }
  /** Set the field level filters for field: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDateFilter (DateFilter[] value) throws ServiceException {
    this.ActiveDate = value;
  }
  /** Retrieve filter for field: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getActiveDateFilter () {
    return this.ActiveDate;
  }

  /**
   * Retrieves the ActiveDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDateFilter field
   */
  public String[] getActiveDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActiveDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDateFilter filter value from a formatted string
   *
   * @param _value the ActiveDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActiveDateFilter filter field
   */
  public void setActiveDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDateFilterFromFormattedString");
    try {
      this.setActiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ActiveDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDateFilter field
   */
  public String[] getActiveDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActiveDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDateFilter filter value from a formatted string
   *
   * @param _value the ActiveDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActiveDateFilter filter field
   */
  public void setActiveDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDateFilterFromFormattedDateTimeString");
    try {
      this.setActiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDateFetch (boolean fetch) {
    this.InactiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDateFetch () {
    return this.InactiveDateFetch;
  }
  /** Set the SortOrder for field: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDateSortOrder (Integer value) {
    this.InactiveDateSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDateSortOrder () {
    return this.InactiveDateSort;
  }
  /** Set the sort direction for field: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDateSortDirection (boolean ascending) {
    this.InactiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDateSortDirection () {
    return this.InactiveDateSortAscending;
  }
  /** Set the field level filters for field: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDateFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDate = value;
  }
  /** Retrieve filter for field: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getInactiveDateFilter () {
    return this.InactiveDate;
  }

  /**
   * Retrieves the InactiveDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDateFilter field
   */
  public String[] getInactiveDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInactiveDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDateFilter filter value from a formatted string
   *
   * @param _value the InactiveDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InactiveDateFilter filter field
   */
  public void setInactiveDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDateFilterFromFormattedString");
    try {
      this.setInactiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDateFilterFromFormattedString");
  }

  /**
   * Retrieves the InactiveDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDateFilter field
   */
  public String[] getInactiveDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInactiveDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDateFilter filter value from a formatted string
   *
   * @param _value the InactiveDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InactiveDateFilter filter field
   */
  public void setInactiveDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDateFilterFromFormattedDateTimeString");
    try {
      this.setInactiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDateFilterFromFormattedDateTimeString");
  }


  public String toString() {
    return PaymentObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return PaymentObjectHelper.toMap(this, null);
  }
}
