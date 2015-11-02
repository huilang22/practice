/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BilledUsageAccountObjectFilter.java
 * Definition File: Customer/BilledUsage.xml
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


import com.csgsystems.bali.BaliObjectFilter;

/** Filter object */
public class BilledUsageAccountObjectFilter extends BilledUsageObjectFilter  implements Serializable
{
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id) */
  public    StringFilter[] ParentAccountExternalId  = null;
  protected boolean ParentAccountExternalIdFetch = false;
  protected boolean ParentAccountExternalIdSortAscending = true;
  protected boolean ParentAccountExternalIdCaseInsensitive = false;
  protected Integer ParentAccountExternalIdSort = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id_type) */
  public    IntegerFilter[] ParentAccountExternalIdType  = null;
  protected boolean ParentAccountExternalIdTypeFetch = false;
  protected boolean ParentAccountExternalIdTypeSortAscending = true;
  protected Integer ParentAccountExternalIdTypeSort = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id) */
  public    StringFilter[] HierarchyAccountExternalId  = null;
  protected boolean HierarchyAccountExternalIdFetch = false;
  protected boolean HierarchyAccountExternalIdSortAscending = true;
  protected boolean HierarchyAccountExternalIdCaseInsensitive = false;
  protected Integer HierarchyAccountExternalIdSort = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id_type) */
  public    IntegerFilter[] HierarchyAccountExternalIdType  = null;
  protected boolean HierarchyAccountExternalIdTypeFetch = false;
  protected boolean HierarchyAccountExternalIdTypeSortAscending = true;
  protected Integer HierarchyAccountExternalIdTypeSort = null;
  /** raw field for: CMF.parent_id) */
  public    IntegerFilter[] ParentId  = null;
  protected boolean ParentIdFetch = false;
  protected boolean ParentIdSortAscending = true;
  protected Integer ParentIdSort = null;
  /** raw field for: CMF.child_count) */
  public    IntegerFilter[] ChildCount  = null;
  protected boolean ChildCountFetch = false;
  protected boolean ChildCountSortAscending = true;
  protected Integer ChildCountSort = null;
  /** raw field for: CMF.hierarchy_id) */
  public    IntegerFilter[] HierarchyId  = null;
  protected boolean HierarchyIdFetch = false;
  protected boolean HierarchyIdSortAscending = true;
  protected Integer HierarchyIdSort = null;
  /** raw field for: CMF.tie_code) */
  public    IntegerFilter[] TieCode  = null;
  protected boolean TieCodeFetch = false;
  protected boolean TieCodeSortAscending = true;
  protected Integer TieCodeSort = null;
  /** raw field for: CMF.bill_sequence_num) */
  public    IntegerFilter[] BillSequenceNum  = null;
  protected boolean BillSequenceNumFetch = false;
  protected boolean BillSequenceNumSortAscending = true;
  protected Integer BillSequenceNumSort = null;
  /** raw field for: CMF.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: CMF.language_code) */
  public    IntegerFilter[] LanguageCode  = null;
  protected boolean LanguageCodeFetch = false;
  protected boolean LanguageCodeSortAscending = true;
  protected Integer LanguageCodeSort = null;
  /** raw field for: CMF.account_type) */
  public    IntegerFilter[] AccountType  = null;
  protected boolean AccountTypeFetch = false;
  protected boolean AccountTypeSortAscending = true;
  protected Integer AccountTypeSort = null;
  /** raw field for: CMF.account_category) */
  public    IntegerFilter[] AccountCategory  = null;
  protected boolean AccountCategoryFetch = false;
  protected boolean AccountCategorySortAscending = true;
  protected Integer AccountCategorySort = null;
  /** raw field for: CMF.prev_cutoff_date) */
  public    DateFilter[] PrevCutoffDate  = null;
  protected boolean PrevCutoffDateFetch = false;
  protected boolean PrevCutoffDateSortAscending = true;
  protected Integer PrevCutoffDateSort = null;
  /** raw field for: CMF.prev_bill_date) */
  public    DateFilter[] PrevBillDate  = null;
  protected boolean PrevBillDateFetch = false;
  protected boolean PrevBillDateSortAscending = true;
  protected Integer PrevBillDateSort = null;
  /** raw field for: CMF.next_bill_date) */
  public    DateFilter[] NextBillDate  = null;
  protected boolean NextBillDateFetch = false;
  protected boolean NextBillDateSortAscending = true;
  protected Integer NextBillDateSort = null;
  /** raw field for: CMF.prev_bill_refno) */
  public    IntegerFilter[] PrevBillRefno  = null;
  protected boolean PrevBillRefnoFetch = false;
  protected boolean PrevBillRefnoSortAscending = true;
  protected Integer PrevBillRefnoSort = null;
  /** raw field for: CMF.prev_bill_ref_resets) */
  public    IntegerFilter[] PrevBillRefResets  = null;
  protected boolean PrevBillRefResetsFetch = false;
  protected boolean PrevBillRefResetsSortAscending = true;
  protected Integer PrevBillRefResetsSort = null;
  /** raw field for: CMF.prev_balance_refno) */
  public    IntegerFilter[] PrevBalanceRefno  = null;
  protected boolean PrevBalanceRefnoFetch = false;
  protected boolean PrevBalanceRefnoSortAscending = true;
  protected Integer PrevBalanceRefnoSort = null;
  /** raw field for: CMF.prev_balance_ref_resets) */
  public    IntegerFilter[] PrevBalanceRefResets  = null;
  protected boolean PrevBalanceRefResetsFetch = false;
  protected boolean PrevBalanceRefResetsSortAscending = true;
  protected Integer PrevBalanceRefResetsSort = null;
  /** raw field for: CMF.bill_name_pre) */
  public    StringFilter[] BillNamePre  = null;
  protected boolean BillNamePreFetch = false;
  protected boolean BillNamePreSortAscending = true;
  protected boolean BillNamePreCaseInsensitive = false;
  protected Integer BillNamePreSort = null;
  /** raw field for: CMF.bill_fname) */
  public    StringFilter[] BillFname  = null;
  protected boolean BillFnameFetch = false;
  protected boolean BillFnameSortAscending = true;
  protected boolean BillFnameCaseInsensitive = false;
  protected Integer BillFnameSort = null;
  /** raw field for: CMF.bill_minit) */
  public    StringFilter[] BillMinit  = null;
  protected boolean BillMinitFetch = false;
  protected boolean BillMinitSortAscending = true;
  protected boolean BillMinitCaseInsensitive = false;
  protected Integer BillMinitSort = null;
  /** raw field for: CMF.bill_lname) */
  public    StringFilter[] BillLname  = null;
  protected boolean BillLnameFetch = false;
  protected boolean BillLnameSortAscending = true;
  protected boolean BillLnameCaseInsensitive = false;
  protected Integer BillLnameSort = null;
  /** raw field for: CMF.bill_name_generation) */
  public    StringFilter[] BillNameGeneration  = null;
  protected boolean BillNameGenerationFetch = false;
  protected boolean BillNameGenerationSortAscending = true;
  protected boolean BillNameGenerationCaseInsensitive = false;
  protected Integer BillNameGenerationSort = null;
  /** raw field for: CMF.bill_title) */
  public    StringFilter[] BillTitle  = null;
  protected boolean BillTitleFetch = false;
  protected boolean BillTitleSortAscending = true;
  protected boolean BillTitleCaseInsensitive = false;
  protected Integer BillTitleSort = null;
  /** raw field for: CMF.bill_company) */
  public    StringFilter[] BillCompany  = null;
  protected boolean BillCompanyFetch = false;
  protected boolean BillCompanySortAscending = true;
  protected boolean BillCompanyCaseInsensitive = false;
  protected Integer BillCompanySort = null;
  /** raw field for: CMF.cust_address1) */
  public    StringFilter[] CustAddress1  = null;
  protected boolean CustAddress1Fetch = false;
  protected boolean CustAddress1SortAscending = true;
  protected boolean CustAddress1CaseInsensitive = false;
  protected Integer CustAddress1Sort = null;
  /** raw field for: CMF.cust_address2) */
  public    StringFilter[] CustAddress2  = null;
  protected boolean CustAddress2Fetch = false;
  protected boolean CustAddress2SortAscending = true;
  protected boolean CustAddress2CaseInsensitive = false;
  protected Integer CustAddress2Sort = null;
  /** raw field for: CMF.cust_address3) */
  public    StringFilter[] CustAddress3  = null;
  protected boolean CustAddress3Fetch = false;
  protected boolean CustAddress3SortAscending = true;
  protected boolean CustAddress3CaseInsensitive = false;
  protected Integer CustAddress3Sort = null;
  /** raw field for: CMF.cust_city) */
  public    StringFilter[] CustCity  = null;
  protected boolean CustCityFetch = false;
  protected boolean CustCitySortAscending = true;
  protected boolean CustCityCaseInsensitive = false;
  protected Integer CustCitySort = null;
  /** raw field for: CMF.cust_state) */
  public    StringFilter[] CustState  = null;
  protected boolean CustStateFetch = false;
  protected boolean CustStateSortAscending = true;
  protected boolean CustStateCaseInsensitive = false;
  protected Integer CustStateSort = null;
  /** raw field for: CMF.cust_zip) */
  public    StringFilter[] CustZip  = null;
  protected boolean CustZipFetch = false;
  protected boolean CustZipSortAscending = true;
  protected boolean CustZipCaseInsensitive = false;
  protected Integer CustZipSort = null;
  /** raw field for: CMF.cust_country_code) */
  public    IntegerFilter[] CustCountryCode  = null;
  protected boolean CustCountryCodeFetch = false;
  protected boolean CustCountryCodeSortAscending = true;
  protected Integer CustCountryCodeSort = null;
  /** raw field for: CMF.cust_franchise_tax_code) */
  public    IntegerFilter[] CustFranchiseTaxCode  = null;
  protected boolean CustFranchiseTaxCodeFetch = false;
  protected boolean CustFranchiseTaxCodeSortAscending = true;
  protected Integer CustFranchiseTaxCodeSort = null;
  /** raw field for: CMF.cust_geocode) */
  public    StringFilter[] CustGeocode  = null;
  protected boolean CustGeocodeFetch = false;
  protected boolean CustGeocodeSortAscending = true;
  protected boolean CustGeocodeCaseInsensitive = false;
  protected Integer CustGeocodeSort = null;
  /** raw field for: CMF.cust_county) */
  public    StringFilter[] CustCounty  = null;
  protected boolean CustCountyFetch = false;
  protected boolean CustCountySortAscending = true;
  protected boolean CustCountyCaseInsensitive = false;
  protected Integer CustCountySort = null;
  /** raw field for: CMF.cust_phone1) */
  public    StringFilter[] CustPhone1  = null;
  protected boolean CustPhone1Fetch = false;
  protected boolean CustPhone1SortAscending = true;
  protected boolean CustPhone1CaseInsensitive = false;
  protected Integer CustPhone1Sort = null;
  /** raw field for: CMF.cust_phone2) */
  public    StringFilter[] CustPhone2  = null;
  protected boolean CustPhone2Fetch = false;
  protected boolean CustPhone2SortAscending = true;
  protected boolean CustPhone2CaseInsensitive = false;
  protected Integer CustPhone2Sort = null;
  /** raw field for: CMF.bill_address1) */
  public    StringFilter[] BillAddress1  = null;
  protected boolean BillAddress1Fetch = false;
  protected boolean BillAddress1SortAscending = true;
  protected boolean BillAddress1CaseInsensitive = false;
  protected Integer BillAddress1Sort = null;
  /** raw field for: CMF.bill_address2) */
  public    StringFilter[] BillAddress2  = null;
  protected boolean BillAddress2Fetch = false;
  protected boolean BillAddress2SortAscending = true;
  protected boolean BillAddress2CaseInsensitive = false;
  protected Integer BillAddress2Sort = null;
  /** raw field for: CMF.bill_address3) */
  public    StringFilter[] BillAddress3  = null;
  protected boolean BillAddress3Fetch = false;
  protected boolean BillAddress3SortAscending = true;
  protected boolean BillAddress3CaseInsensitive = false;
  protected Integer BillAddress3Sort = null;
  /** raw field for: CMF.bill_city) */
  public    StringFilter[] BillCity  = null;
  protected boolean BillCityFetch = false;
  protected boolean BillCitySortAscending = true;
  protected boolean BillCityCaseInsensitive = false;
  protected Integer BillCitySort = null;
  /** raw field for: CMF.bill_state) */
  public    StringFilter[] BillState  = null;
  protected boolean BillStateFetch = false;
  protected boolean BillStateSortAscending = true;
  protected boolean BillStateCaseInsensitive = false;
  protected Integer BillStateSort = null;
  /** raw field for: CMF.bill_zip) */
  public    StringFilter[] BillZip  = null;
  protected boolean BillZipFetch = false;
  protected boolean BillZipSortAscending = true;
  protected boolean BillZipCaseInsensitive = false;
  protected Integer BillZipSort = null;
  /** raw field for: CMF.bill_country_code) */
  public    IntegerFilter[] BillCountryCode  = null;
  protected boolean BillCountryCodeFetch = false;
  protected boolean BillCountryCodeSortAscending = true;
  protected Integer BillCountryCodeSort = null;
  /** raw field for: CMF.bill_franchise_tax_code) */
  public    IntegerFilter[] BillFranchiseTaxCode  = null;
  protected boolean BillFranchiseTaxCodeFetch = false;
  protected boolean BillFranchiseTaxCodeSortAscending = true;
  protected Integer BillFranchiseTaxCodeSort = null;
  /** raw field for: CMF.bill_county) */
  public    StringFilter[] BillCounty  = null;
  protected boolean BillCountyFetch = false;
  protected boolean BillCountySortAscending = true;
  protected boolean BillCountyCaseInsensitive = false;
  protected Integer BillCountySort = null;
  /** raw field for: CMF.bill_geocode) */
  public    StringFilter[] BillGeocode  = null;
  protected boolean BillGeocodeFetch = false;
  protected boolean BillGeocodeSortAscending = true;
  protected boolean BillGeocodeCaseInsensitive = false;
  protected Integer BillGeocodeSort = null;
  /** raw field for: CMF.ssn) */
  public    StringFilter[] Ssn  = null;
  protected boolean SsnFetch = false;
  protected boolean SsnSortAscending = true;
  protected boolean SsnCaseInsensitive = false;
  protected Integer SsnSort = null;
  /** raw field for: CMF.contact1_name) */
  public    StringFilter[] Contact1Name  = null;
  protected boolean Contact1NameFetch = false;
  protected boolean Contact1NameSortAscending = true;
  protected boolean Contact1NameCaseInsensitive = false;
  protected Integer Contact1NameSort = null;
  /** raw field for: CMF.contact2_name) */
  public    StringFilter[] Contact2Name  = null;
  protected boolean Contact2NameFetch = false;
  protected boolean Contact2NameSortAscending = true;
  protected boolean Contact2NameCaseInsensitive = false;
  protected Integer Contact2NameSort = null;
  /** raw field for: CMF.contact1_phone) */
  public    StringFilter[] Contact1Phone  = null;
  protected boolean Contact1PhoneFetch = false;
  protected boolean Contact1PhoneSortAscending = true;
  protected boolean Contact1PhoneCaseInsensitive = false;
  protected Integer Contact1PhoneSort = null;
  /** raw field for: CMF.contact2_phone) */
  public    StringFilter[] Contact2Phone  = null;
  protected boolean Contact2PhoneFetch = false;
  protected boolean Contact2PhoneSortAscending = true;
  protected boolean Contact2PhoneCaseInsensitive = false;
  protected Integer Contact2PhoneSort = null;
  /** raw field for: CMF.cust_faxno) */
  public    StringFilter[] CustFaxno  = null;
  protected boolean CustFaxnoFetch = false;
  protected boolean CustFaxnoSortAscending = true;
  protected boolean CustFaxnoCaseInsensitive = false;
  protected Integer CustFaxnoSort = null;
  /** raw field for: CMF.statement_to_faxno) */
  public    StringFilter[] StatementToFaxno  = null;
  protected boolean StatementToFaxnoFetch = false;
  protected boolean StatementToFaxnoSortAscending = true;
  protected boolean StatementToFaxnoCaseInsensitive = false;
  protected Integer StatementToFaxnoSort = null;
  /** raw field for: CMF.credit_thresh) */
  public    BigIntegerFilter[] CreditThresh  = null;
  protected boolean CreditThreshFetch = false;
  protected boolean CreditThreshSortAscending = true;
  protected Integer CreditThreshSort = null;
  /** raw field for: CMF.cred_status) */
  public    IntegerFilter[] CredStatus  = null;
  protected boolean CredStatusFetch = false;
  protected boolean CredStatusSortAscending = true;
  protected Integer CredStatusSort = null;
  /** raw field for: CMF.credit_rating) */
  public    IntegerFilter[] CreditRating  = null;
  protected boolean CreditRatingFetch = false;
  protected boolean CreditRatingSortAscending = true;
  protected Integer CreditRatingSort = null;
  /** raw field for: CMF.disconnect_reason) */
  public    IntegerFilter[] DisconnectReason  = null;
  protected boolean DisconnectReasonFetch = false;
  protected boolean DisconnectReasonSortAscending = true;
  protected Integer DisconnectReasonSort = null;
  /** raw field for: CMF.disc_rcv_opt) */
  public    IntegerFilter[] DiscRcvOpt  = null;
  protected boolean DiscRcvOptFetch = false;
  protected boolean DiscRcvOptSortAscending = true;
  protected Integer DiscRcvOptSort = null;
  /** raw field for: CMF.thresh_ref) */
  public    IntegerFilter[] ThreshRef  = null;
  protected boolean ThreshRefFetch = false;
  protected boolean ThreshRefSortAscending = true;
  protected Integer ThreshRefSort = null;
  /** raw field for: CMF.bill_period) */
  public    StringFilter[] BillPeriod  = null;
  protected boolean BillPeriodFetch = false;
  protected boolean BillPeriodSortAscending = true;
  protected boolean BillPeriodCaseInsensitive = false;
  protected Integer BillPeriodSort = null;
  /** raw field for: CMF.billing_frequency) */
  public    IntegerFilter[] BillingFrequency  = null;
  protected boolean BillingFrequencyFetch = false;
  protected boolean BillingFrequencySortAscending = true;
  protected Integer BillingFrequencySort = null;
  /** raw field for: CMF.bill_fmt_opt) */
  public    IntegerFilter[] BillFmtOpt  = null;
  protected boolean BillFmtOptFetch = false;
  protected boolean BillFmtOptSortAscending = true;
  protected Integer BillFmtOptSort = null;
  /** raw field for: CMF.bill_disp_meth) */
  public    IntegerFilter[] BillDispMeth  = null;
  protected boolean BillDispMethFetch = false;
  protected boolean BillDispMethSortAscending = true;
  protected Integer BillDispMethSort = null;
  /** raw field for: CMF.bill_hold_code) */
  public    IntegerFilter[] BillHoldCode  = null;
  protected boolean BillHoldCodeFetch = false;
  protected boolean BillHoldCodeSortAscending = true;
  protected Integer BillHoldCodeSort = null;
  /** raw field for: CMF.msg_grp_id) */
  public    IntegerFilter[] MsgGrpId  = null;
  protected boolean MsgGrpIdFetch = false;
  protected boolean MsgGrpIdSortAscending = true;
  protected Integer MsgGrpIdSort = null;
  /** raw field for: CMF.insert_grp_id) */
  public    IntegerFilter[] InsertGrpId  = null;
  protected boolean InsertGrpIdFetch = false;
  protected boolean InsertGrpIdSortAscending = true;
  protected Integer InsertGrpIdSort = null;
  /** raw field for: CMF.rate_class_default) */
  public    IntegerFilter[] RateClassDefault  = null;
  protected boolean RateClassDefaultFetch = false;
  protected boolean RateClassDefaultSortAscending = true;
  protected Integer RateClassDefaultSort = null;
  /** raw field for: CMF.rate_class_special) */
  public    IntegerFilter[] RateClassSpecial  = null;
  protected boolean RateClassSpecialFetch = false;
  protected boolean RateClassSpecialSortAscending = true;
  protected Integer RateClassSpecialSort = null;
  /** raw field for: CMF.exrate_class) */
  public    IntegerFilter[] ExrateClass  = null;
  protected boolean ExrateClassFetch = false;
  protected boolean ExrateClassSortAscending = true;
  protected Integer ExrateClassSort = null;
  /** raw field for: CMF.plan_id_discount) */
  public    IntegerFilter[] PlanIdDiscount  = null;
  protected boolean PlanIdDiscountFetch = false;
  protected boolean PlanIdDiscountSortAscending = true;
  protected Integer PlanIdDiscountSort = null;
  /** raw field for: CMF.plan_id_credit) */
  public    IntegerFilter[] PlanIdCredit  = null;
  protected boolean PlanIdCreditFetch = false;
  protected boolean PlanIdCreditSortAscending = true;
  protected Integer PlanIdCreditSort = null;
  /** raw field for: CMF.account_status) */
  public    IntegerFilter[] AccountStatus  = null;
  protected boolean AccountStatusFetch = false;
  protected boolean AccountStatusSortAscending = true;
  protected Integer AccountStatusSort = null;
  /** raw field for: CMF.account_status_dt) */
  public    DateFilter[] AccountStatusDt  = null;
  protected boolean AccountStatusDtFetch = false;
  protected boolean AccountStatusDtSortAscending = true;
  protected Integer AccountStatusDtSort = null;
  /** raw field for: CMF.distr_chan) */
  public    StringFilter[] DistrChan  = null;
  protected boolean DistrChanFetch = false;
  protected boolean DistrChanSortAscending = true;
  protected boolean DistrChanCaseInsensitive = false;
  protected Integer DistrChanSort = null;
  /** raw field for: CMF.sales_code) */
  public    StringFilter[] SalesCode  = null;
  protected boolean SalesCodeFetch = false;
  protected boolean SalesCodeSortAscending = true;
  protected boolean SalesCodeCaseInsensitive = false;
  protected Integer SalesCodeSort = null;
  /** raw field for: CMF.mkt_code) */
  public    IntegerFilter[] MktCode  = null;
  protected boolean MktCodeFetch = false;
  protected boolean MktCodeSortAscending = true;
  protected Integer MktCodeSort = null;
  /** raw field for: CMF.sic_code) */
  public    IntegerFilter[] SicCode  = null;
  protected boolean SicCodeFetch = false;
  protected boolean SicCodeSortAscending = true;
  protected Integer SicCodeSort = null;
  /** raw field for: CMF.in_use) */
  public    StringFilter[] InUse  = null;
  protected boolean InUseFetch = false;
  protected boolean InUseSortAscending = true;
  protected boolean InUseCaseInsensitive = false;
  protected Integer InUseSort = null;
  /** raw field for: CMF.collection_indicator) */
  public    IntegerFilter[] CollectionIndicator  = null;
  protected boolean CollectionIndicatorFetch = false;
  protected boolean CollectionIndicatorSortAscending = true;
  protected Integer CollectionIndicatorSort = null;
  /** raw field for: CMF.collection_status) */
  public    IntegerFilter[] CollectionStatus  = null;
  protected boolean CollectionStatusFetch = false;
  protected boolean CollectionStatusSortAscending = true;
  protected Integer CollectionStatusSort = null;
  /** raw field for: CMF.collection_history) */
  public    StringFilter[] CollectionHistory  = null;
  protected boolean CollectionHistoryFetch = false;
  protected boolean CollectionHistorySortAscending = true;
  protected boolean CollectionHistoryCaseInsensitive = false;
  protected Integer CollectionHistorySort = null;
  /** raw field for: CMF.vip_code) */
  public    IntegerFilter[] VipCode  = null;
  protected boolean VipCodeFetch = false;
  protected boolean VipCodeSortAscending = true;
  protected Integer VipCodeSort = null;
  /** raw field for: CMF.purchase_order) */
  public    StringFilter[] PurchaseOrder  = null;
  protected boolean PurchaseOrderFetch = false;
  protected boolean PurchaseOrderSortAscending = true;
  protected boolean PurchaseOrderCaseInsensitive = false;
  protected Integer PurchaseOrderSort = null;
  /** raw field for: CMF.codeword) */
  public    StringFilter[] Codeword  = null;
  protected boolean CodewordFetch = false;
  protected boolean CodewordSortAscending = true;
  protected boolean CodewordCaseInsensitive = false;
  protected Integer CodewordSort = null;
  /** raw field for: CMF.remark) */
  public    StringFilter[] Remark  = null;
  protected boolean RemarkFetch = false;
  protected boolean RemarkSortAscending = true;
  protected boolean RemarkCaseInsensitive = false;
  protected Integer RemarkSort = null;
  /** raw field for: CMF.cust_email) */
  public    StringFilter[] CustEmail  = null;
  protected boolean CustEmailFetch = false;
  protected boolean CustEmailSortAscending = true;
  protected boolean CustEmailCaseInsensitive = false;
  protected Integer CustEmailSort = null;
  /** raw field for: CMF.statement_to_email) */
  public    StringFilter[] StatementToEmail  = null;
  protected boolean StatementToEmailFetch = false;
  protected boolean StatementToEmailSortAscending = true;
  protected boolean StatementToEmailCaseInsensitive = false;
  protected Integer StatementToEmailSort = null;
  /** raw field for: CMF.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: CMF.chg_date) */
  public    DateFilter[] ChgDate  = null;
  protected boolean ChgDateFetch = false;
  protected boolean ChgDateSortAscending = true;
  protected Integer ChgDateSort = null;
  /** raw field for: CMF.date_created) */
  public    DateFilter[] DateCreated  = null;
  protected boolean DateCreatedFetch = false;
  protected boolean DateCreatedSortAscending = true;
  protected Integer DateCreatedSort = null;
  /** raw field for: CMF.date_active) */
  public    DateFilter[] DateActive  = null;
  protected boolean DateActiveFetch = false;
  protected boolean DateActiveSortAscending = true;
  protected Integer DateActiveSort = null;
  /** raw field for: CMF.date_inactive) */
  public    DateFilter[] DateInactive  = null;
  protected boolean DateInactiveFetch = false;
  protected boolean DateInactiveSortAscending = true;
  protected Integer DateInactiveSort = null;
  /** raw field for: CMF.owning_cost_ctr) */
  public    IntegerFilter[] OwningCostCtr  = null;
  protected boolean OwningCostCtrFetch = false;
  protected boolean OwningCostCtrSortAscending = true;
  protected Integer OwningCostCtrSort = null;
  /** raw field for: CMF.acct_seg_id) */
  public    IntegerFilter[] AcctSegId  = null;
  protected boolean AcctSegIdFetch = false;
  protected boolean AcctSegIdSortAscending = true;
  protected Integer AcctSegIdSort = null;
  /** raw field for: CMF.converted) */
  public    IntegerFilter[] Converted  = null;
  protected boolean ConvertedFetch = false;
  protected boolean ConvertedSortAscending = true;
  protected Integer ConvertedSort = null;
  /** raw field for: CMF.charge_threshold) */
  public    BigIntegerFilter[] ChargeThreshold  = null;
  protected boolean ChargeThresholdFetch = false;
  protected boolean ChargeThresholdSortAscending = true;
  protected Integer ChargeThresholdSort = null;
  /** raw field for: CMF.threshold) */
  public    BigIntegerFilter[] Threshold  = null;
  protected boolean ThresholdFetch = false;
  protected boolean ThresholdSortAscending = true;
  protected Integer ThresholdSort = null;
  /** raw field for: CMF.cyclical_threshold) */
  public    BigIntegerFilter[] CyclicalThreshold  = null;
  protected boolean CyclicalThresholdFetch = false;
  protected boolean CyclicalThresholdSortAscending = true;
  protected Integer CyclicalThresholdSort = null;
  /** raw field for: CMF.usg_amt_limit) */
  public    BigIntegerFilter[] UsgAmtLimit  = null;
  protected boolean UsgAmtLimitFetch = false;
  protected boolean UsgAmtLimitSortAscending = true;
  protected Integer UsgAmtLimitSort = null;
  /** raw field for: CMF.usg_units_limit) */
  public    BigIntegerFilter[] UsgUnitsLimit  = null;
  protected boolean UsgUnitsLimitFetch = false;
  protected boolean UsgUnitsLimitSortAscending = true;
  protected Integer UsgUnitsLimitSort = null;
  /** raw field for: CMF.regulatory_id) */
  public    IntegerFilter[] RegulatoryId  = null;
  protected boolean RegulatoryIdFetch = false;
  protected boolean RegulatoryIdSortAscending = true;
  protected Integer RegulatoryIdSort = null;
  /** raw field for: CMF.global_contract_status) */
  public    IntegerFilter[] GlobalContractStatus  = null;
  protected boolean GlobalContractStatusFetch = false;
  protected boolean GlobalContractStatusSortAscending = true;
  protected Integer GlobalContractStatusSort = null;
  /** raw field for: CMF.alt_lname) */
  public    StringFilter[] AltLname  = null;
  protected boolean AltLnameFetch = false;
  protected boolean AltLnameSortAscending = true;
  protected boolean AltLnameCaseInsensitive = false;
  protected Integer AltLnameSort = null;
  /** raw field for: CMF.alt_fname) */
  public    StringFilter[] AltFname  = null;
  protected boolean AltFnameFetch = false;
  protected boolean AltFnameSortAscending = true;
  protected boolean AltFnameCaseInsensitive = false;
  protected Integer AltFnameSort = null;
  /** raw field for: CMF.alt_company_name) */
  public    StringFilter[] AltCompanyName  = null;
  protected boolean AltCompanyNameFetch = false;
  protected boolean AltCompanyNameSortAscending = true;
  protected boolean AltCompanyNameCaseInsensitive = false;
  protected Integer AltCompanyNameSort = null;
  /** raw field for: CMF.gender) */
  public    IntegerFilter[] Gender  = null;
  protected boolean GenderFetch = false;
  protected boolean GenderSortAscending = true;
  protected Integer GenderSort = null;
  /** raw field for: CMF.dept) */
  public    StringFilter[] Dept  = null;
  protected boolean DeptFetch = false;
  protected boolean DeptSortAscending = true;
  protected boolean DeptCaseInsensitive = false;
  protected Integer DeptSort = null;
  /** raw field for: CMF.title) */
  public    StringFilter[] Title  = null;
  protected boolean TitleFetch = false;
  protected boolean TitleSortAscending = true;
  protected boolean TitleCaseInsensitive = false;
  protected Integer TitleSort = null;
  /** raw field for: CMF.payment_profile_id) */
  public    BigIntegerFilter[] PaymentProfileId  = null;
  protected boolean PaymentProfileIdFetch = false;
  protected boolean PaymentProfileIdSortAscending = true;
  protected Integer PaymentProfileIdSort = null;
  /** raw field for: CMF.account_process_flag) */
  public    IntegerFilter[] AccountProcessFlag  = null;
  protected boolean AccountProcessFlagFetch = false;
  protected boolean AccountProcessFlagSortAscending = true;
  protected Integer AccountProcessFlagSort = null;
  /** raw field for: CMF.sd_agency_id) */
  public    StringFilter[] SdAgencyId  = null;
  protected boolean SdAgencyIdFetch = false;
  protected boolean SdAgencyIdSortAscending = true;
  protected boolean SdAgencyIdCaseInsensitive = false;
  protected Integer SdAgencyIdSort = null;
  /** raw field for: CMF.customer_lifetime_id) */
  public    IntegerFilter[] CustomerLifetimeId  = null;
  protected boolean CustomerLifetimeIdFetch = false;
  protected boolean CustomerLifetimeIdSortAscending = true;
  protected Integer CustomerLifetimeIdSort = null;
  /** raw field for: CMF.customer_lifetime_id2) */
  public    IntegerFilter[] CustomerLifetimeId2  = null;
  protected boolean CustomerLifetimeId2Fetch = false;
  protected boolean CustomerLifetimeId2SortAscending = true;
  protected Integer CustomerLifetimeId2Sort = null;
  /** raw field for: CMF.auto_writeoff_status) */
  public    IntegerFilter[] AutoWriteoffStatus  = null;
  protected boolean AutoWriteoffStatusFetch = false;
  protected boolean AutoWriteoffStatusSortAscending = true;
  protected Integer AutoWriteoffStatusSort = null;
  private String _objName = "BilledUsageAccountObjectFilter";
  /** default constructor */
  public BilledUsageAccountObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public BilledUsageAccountObjectFilter (BilledUsageAccountObjectFilter other)
  {
    super (other);
    if (other == null) return;
    this.ParentAccountExternalId = other.ParentAccountExternalId;
    this.ParentAccountExternalIdFetch = other.ParentAccountExternalIdFetch;
    this.ParentAccountExternalIdSort = other.ParentAccountExternalIdSort;
    this.ParentAccountExternalIdCaseInsensitive = other.ParentAccountExternalIdCaseInsensitive;
    this.ParentAccountExternalIdSortAscending = other.ParentAccountExternalIdSortAscending;
    this.ParentAccountExternalIdType = other.ParentAccountExternalIdType;
    this.ParentAccountExternalIdTypeFetch = other.ParentAccountExternalIdTypeFetch;
    this.ParentAccountExternalIdTypeSort = other.ParentAccountExternalIdTypeSort;
    this.ParentAccountExternalIdTypeSortAscending = other.ParentAccountExternalIdTypeSortAscending;
    this.HierarchyAccountExternalId = other.HierarchyAccountExternalId;
    this.HierarchyAccountExternalIdFetch = other.HierarchyAccountExternalIdFetch;
    this.HierarchyAccountExternalIdSort = other.HierarchyAccountExternalIdSort;
    this.HierarchyAccountExternalIdCaseInsensitive = other.HierarchyAccountExternalIdCaseInsensitive;
    this.HierarchyAccountExternalIdSortAscending = other.HierarchyAccountExternalIdSortAscending;
    this.HierarchyAccountExternalIdType = other.HierarchyAccountExternalIdType;
    this.HierarchyAccountExternalIdTypeFetch = other.HierarchyAccountExternalIdTypeFetch;
    this.HierarchyAccountExternalIdTypeSort = other.HierarchyAccountExternalIdTypeSort;
    this.HierarchyAccountExternalIdTypeSortAscending = other.HierarchyAccountExternalIdTypeSortAscending;
    this.ParentId = other.ParentId;
    this.ParentIdFetch = other.ParentIdFetch;
    this.ParentIdSort = other.ParentIdSort;
    this.ParentIdSortAscending = other.ParentIdSortAscending;
    this.ChildCount = other.ChildCount;
    this.ChildCountFetch = other.ChildCountFetch;
    this.ChildCountSort = other.ChildCountSort;
    this.ChildCountSortAscending = other.ChildCountSortAscending;
    this.HierarchyId = other.HierarchyId;
    this.HierarchyIdFetch = other.HierarchyIdFetch;
    this.HierarchyIdSort = other.HierarchyIdSort;
    this.HierarchyIdSortAscending = other.HierarchyIdSortAscending;
    this.TieCode = other.TieCode;
    this.TieCodeFetch = other.TieCodeFetch;
    this.TieCodeSort = other.TieCodeSort;
    this.TieCodeSortAscending = other.TieCodeSortAscending;
    this.BillSequenceNum = other.BillSequenceNum;
    this.BillSequenceNumFetch = other.BillSequenceNumFetch;
    this.BillSequenceNumSort = other.BillSequenceNumSort;
    this.BillSequenceNumSortAscending = other.BillSequenceNumSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.LanguageCode = other.LanguageCode;
    this.LanguageCodeFetch = other.LanguageCodeFetch;
    this.LanguageCodeSort = other.LanguageCodeSort;
    this.LanguageCodeSortAscending = other.LanguageCodeSortAscending;
    this.AccountType = other.AccountType;
    this.AccountTypeFetch = other.AccountTypeFetch;
    this.AccountTypeSort = other.AccountTypeSort;
    this.AccountTypeSortAscending = other.AccountTypeSortAscending;
    this.AccountCategory = other.AccountCategory;
    this.AccountCategoryFetch = other.AccountCategoryFetch;
    this.AccountCategorySort = other.AccountCategorySort;
    this.AccountCategorySortAscending = other.AccountCategorySortAscending;
    this.PrevCutoffDate = other.PrevCutoffDate;
    this.PrevCutoffDateFetch = other.PrevCutoffDateFetch;
    this.PrevCutoffDateSort = other.PrevCutoffDateSort;
    this.PrevCutoffDateSortAscending = other.PrevCutoffDateSortAscending;
    this.PrevBillDate = other.PrevBillDate;
    this.PrevBillDateFetch = other.PrevBillDateFetch;
    this.PrevBillDateSort = other.PrevBillDateSort;
    this.PrevBillDateSortAscending = other.PrevBillDateSortAscending;
    this.NextBillDate = other.NextBillDate;
    this.NextBillDateFetch = other.NextBillDateFetch;
    this.NextBillDateSort = other.NextBillDateSort;
    this.NextBillDateSortAscending = other.NextBillDateSortAscending;
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
    this.BillNamePre = other.BillNamePre;
    this.BillNamePreFetch = other.BillNamePreFetch;
    this.BillNamePreSort = other.BillNamePreSort;
    this.BillNamePreCaseInsensitive = other.BillNamePreCaseInsensitive;
    this.BillNamePreSortAscending = other.BillNamePreSortAscending;
    this.BillFname = other.BillFname;
    this.BillFnameFetch = other.BillFnameFetch;
    this.BillFnameSort = other.BillFnameSort;
    this.BillFnameCaseInsensitive = other.BillFnameCaseInsensitive;
    this.BillFnameSortAscending = other.BillFnameSortAscending;
    this.BillMinit = other.BillMinit;
    this.BillMinitFetch = other.BillMinitFetch;
    this.BillMinitSort = other.BillMinitSort;
    this.BillMinitCaseInsensitive = other.BillMinitCaseInsensitive;
    this.BillMinitSortAscending = other.BillMinitSortAscending;
    this.BillLname = other.BillLname;
    this.BillLnameFetch = other.BillLnameFetch;
    this.BillLnameSort = other.BillLnameSort;
    this.BillLnameCaseInsensitive = other.BillLnameCaseInsensitive;
    this.BillLnameSortAscending = other.BillLnameSortAscending;
    this.BillNameGeneration = other.BillNameGeneration;
    this.BillNameGenerationFetch = other.BillNameGenerationFetch;
    this.BillNameGenerationSort = other.BillNameGenerationSort;
    this.BillNameGenerationCaseInsensitive = other.BillNameGenerationCaseInsensitive;
    this.BillNameGenerationSortAscending = other.BillNameGenerationSortAscending;
    this.BillTitle = other.BillTitle;
    this.BillTitleFetch = other.BillTitleFetch;
    this.BillTitleSort = other.BillTitleSort;
    this.BillTitleCaseInsensitive = other.BillTitleCaseInsensitive;
    this.BillTitleSortAscending = other.BillTitleSortAscending;
    this.BillCompany = other.BillCompany;
    this.BillCompanyFetch = other.BillCompanyFetch;
    this.BillCompanySort = other.BillCompanySort;
    this.BillCompanyCaseInsensitive = other.BillCompanyCaseInsensitive;
    this.BillCompanySortAscending = other.BillCompanySortAscending;
    this.CustAddress1 = other.CustAddress1;
    this.CustAddress1Fetch = other.CustAddress1Fetch;
    this.CustAddress1Sort = other.CustAddress1Sort;
    this.CustAddress1CaseInsensitive = other.CustAddress1CaseInsensitive;
    this.CustAddress1SortAscending = other.CustAddress1SortAscending;
    this.CustAddress2 = other.CustAddress2;
    this.CustAddress2Fetch = other.CustAddress2Fetch;
    this.CustAddress2Sort = other.CustAddress2Sort;
    this.CustAddress2CaseInsensitive = other.CustAddress2CaseInsensitive;
    this.CustAddress2SortAscending = other.CustAddress2SortAscending;
    this.CustAddress3 = other.CustAddress3;
    this.CustAddress3Fetch = other.CustAddress3Fetch;
    this.CustAddress3Sort = other.CustAddress3Sort;
    this.CustAddress3CaseInsensitive = other.CustAddress3CaseInsensitive;
    this.CustAddress3SortAscending = other.CustAddress3SortAscending;
    this.CustCity = other.CustCity;
    this.CustCityFetch = other.CustCityFetch;
    this.CustCitySort = other.CustCitySort;
    this.CustCityCaseInsensitive = other.CustCityCaseInsensitive;
    this.CustCitySortAscending = other.CustCitySortAscending;
    this.CustState = other.CustState;
    this.CustStateFetch = other.CustStateFetch;
    this.CustStateSort = other.CustStateSort;
    this.CustStateCaseInsensitive = other.CustStateCaseInsensitive;
    this.CustStateSortAscending = other.CustStateSortAscending;
    this.CustZip = other.CustZip;
    this.CustZipFetch = other.CustZipFetch;
    this.CustZipSort = other.CustZipSort;
    this.CustZipCaseInsensitive = other.CustZipCaseInsensitive;
    this.CustZipSortAscending = other.CustZipSortAscending;
    this.CustCountryCode = other.CustCountryCode;
    this.CustCountryCodeFetch = other.CustCountryCodeFetch;
    this.CustCountryCodeSort = other.CustCountryCodeSort;
    this.CustCountryCodeSortAscending = other.CustCountryCodeSortAscending;
    this.CustFranchiseTaxCode = other.CustFranchiseTaxCode;
    this.CustFranchiseTaxCodeFetch = other.CustFranchiseTaxCodeFetch;
    this.CustFranchiseTaxCodeSort = other.CustFranchiseTaxCodeSort;
    this.CustFranchiseTaxCodeSortAscending = other.CustFranchiseTaxCodeSortAscending;
    this.CustGeocode = other.CustGeocode;
    this.CustGeocodeFetch = other.CustGeocodeFetch;
    this.CustGeocodeSort = other.CustGeocodeSort;
    this.CustGeocodeCaseInsensitive = other.CustGeocodeCaseInsensitive;
    this.CustGeocodeSortAscending = other.CustGeocodeSortAscending;
    this.CustCounty = other.CustCounty;
    this.CustCountyFetch = other.CustCountyFetch;
    this.CustCountySort = other.CustCountySort;
    this.CustCountyCaseInsensitive = other.CustCountyCaseInsensitive;
    this.CustCountySortAscending = other.CustCountySortAscending;
    this.CustPhone1 = other.CustPhone1;
    this.CustPhone1Fetch = other.CustPhone1Fetch;
    this.CustPhone1Sort = other.CustPhone1Sort;
    this.CustPhone1CaseInsensitive = other.CustPhone1CaseInsensitive;
    this.CustPhone1SortAscending = other.CustPhone1SortAscending;
    this.CustPhone2 = other.CustPhone2;
    this.CustPhone2Fetch = other.CustPhone2Fetch;
    this.CustPhone2Sort = other.CustPhone2Sort;
    this.CustPhone2CaseInsensitive = other.CustPhone2CaseInsensitive;
    this.CustPhone2SortAscending = other.CustPhone2SortAscending;
    this.BillAddress1 = other.BillAddress1;
    this.BillAddress1Fetch = other.BillAddress1Fetch;
    this.BillAddress1Sort = other.BillAddress1Sort;
    this.BillAddress1CaseInsensitive = other.BillAddress1CaseInsensitive;
    this.BillAddress1SortAscending = other.BillAddress1SortAscending;
    this.BillAddress2 = other.BillAddress2;
    this.BillAddress2Fetch = other.BillAddress2Fetch;
    this.BillAddress2Sort = other.BillAddress2Sort;
    this.BillAddress2CaseInsensitive = other.BillAddress2CaseInsensitive;
    this.BillAddress2SortAscending = other.BillAddress2SortAscending;
    this.BillAddress3 = other.BillAddress3;
    this.BillAddress3Fetch = other.BillAddress3Fetch;
    this.BillAddress3Sort = other.BillAddress3Sort;
    this.BillAddress3CaseInsensitive = other.BillAddress3CaseInsensitive;
    this.BillAddress3SortAscending = other.BillAddress3SortAscending;
    this.BillCity = other.BillCity;
    this.BillCityFetch = other.BillCityFetch;
    this.BillCitySort = other.BillCitySort;
    this.BillCityCaseInsensitive = other.BillCityCaseInsensitive;
    this.BillCitySortAscending = other.BillCitySortAscending;
    this.BillState = other.BillState;
    this.BillStateFetch = other.BillStateFetch;
    this.BillStateSort = other.BillStateSort;
    this.BillStateCaseInsensitive = other.BillStateCaseInsensitive;
    this.BillStateSortAscending = other.BillStateSortAscending;
    this.BillZip = other.BillZip;
    this.BillZipFetch = other.BillZipFetch;
    this.BillZipSort = other.BillZipSort;
    this.BillZipCaseInsensitive = other.BillZipCaseInsensitive;
    this.BillZipSortAscending = other.BillZipSortAscending;
    this.BillCountryCode = other.BillCountryCode;
    this.BillCountryCodeFetch = other.BillCountryCodeFetch;
    this.BillCountryCodeSort = other.BillCountryCodeSort;
    this.BillCountryCodeSortAscending = other.BillCountryCodeSortAscending;
    this.BillFranchiseTaxCode = other.BillFranchiseTaxCode;
    this.BillFranchiseTaxCodeFetch = other.BillFranchiseTaxCodeFetch;
    this.BillFranchiseTaxCodeSort = other.BillFranchiseTaxCodeSort;
    this.BillFranchiseTaxCodeSortAscending = other.BillFranchiseTaxCodeSortAscending;
    this.BillCounty = other.BillCounty;
    this.BillCountyFetch = other.BillCountyFetch;
    this.BillCountySort = other.BillCountySort;
    this.BillCountyCaseInsensitive = other.BillCountyCaseInsensitive;
    this.BillCountySortAscending = other.BillCountySortAscending;
    this.BillGeocode = other.BillGeocode;
    this.BillGeocodeFetch = other.BillGeocodeFetch;
    this.BillGeocodeSort = other.BillGeocodeSort;
    this.BillGeocodeCaseInsensitive = other.BillGeocodeCaseInsensitive;
    this.BillGeocodeSortAscending = other.BillGeocodeSortAscending;
    this.Ssn = other.Ssn;
    this.SsnFetch = other.SsnFetch;
    this.SsnSort = other.SsnSort;
    this.SsnCaseInsensitive = other.SsnCaseInsensitive;
    this.SsnSortAscending = other.SsnSortAscending;
    this.Contact1Name = other.Contact1Name;
    this.Contact1NameFetch = other.Contact1NameFetch;
    this.Contact1NameSort = other.Contact1NameSort;
    this.Contact1NameCaseInsensitive = other.Contact1NameCaseInsensitive;
    this.Contact1NameSortAscending = other.Contact1NameSortAscending;
    this.Contact2Name = other.Contact2Name;
    this.Contact2NameFetch = other.Contact2NameFetch;
    this.Contact2NameSort = other.Contact2NameSort;
    this.Contact2NameCaseInsensitive = other.Contact2NameCaseInsensitive;
    this.Contact2NameSortAscending = other.Contact2NameSortAscending;
    this.Contact1Phone = other.Contact1Phone;
    this.Contact1PhoneFetch = other.Contact1PhoneFetch;
    this.Contact1PhoneSort = other.Contact1PhoneSort;
    this.Contact1PhoneCaseInsensitive = other.Contact1PhoneCaseInsensitive;
    this.Contact1PhoneSortAscending = other.Contact1PhoneSortAscending;
    this.Contact2Phone = other.Contact2Phone;
    this.Contact2PhoneFetch = other.Contact2PhoneFetch;
    this.Contact2PhoneSort = other.Contact2PhoneSort;
    this.Contact2PhoneCaseInsensitive = other.Contact2PhoneCaseInsensitive;
    this.Contact2PhoneSortAscending = other.Contact2PhoneSortAscending;
    this.CustFaxno = other.CustFaxno;
    this.CustFaxnoFetch = other.CustFaxnoFetch;
    this.CustFaxnoSort = other.CustFaxnoSort;
    this.CustFaxnoCaseInsensitive = other.CustFaxnoCaseInsensitive;
    this.CustFaxnoSortAscending = other.CustFaxnoSortAscending;
    this.StatementToFaxno = other.StatementToFaxno;
    this.StatementToFaxnoFetch = other.StatementToFaxnoFetch;
    this.StatementToFaxnoSort = other.StatementToFaxnoSort;
    this.StatementToFaxnoCaseInsensitive = other.StatementToFaxnoCaseInsensitive;
    this.StatementToFaxnoSortAscending = other.StatementToFaxnoSortAscending;
    this.CreditThresh = other.CreditThresh;
    this.CreditThreshFetch = other.CreditThreshFetch;
    this.CreditThreshSort = other.CreditThreshSort;
    this.CreditThreshSortAscending = other.CreditThreshSortAscending;
    this.CredStatus = other.CredStatus;
    this.CredStatusFetch = other.CredStatusFetch;
    this.CredStatusSort = other.CredStatusSort;
    this.CredStatusSortAscending = other.CredStatusSortAscending;
    this.CreditRating = other.CreditRating;
    this.CreditRatingFetch = other.CreditRatingFetch;
    this.CreditRatingSort = other.CreditRatingSort;
    this.CreditRatingSortAscending = other.CreditRatingSortAscending;
    this.DisconnectReason = other.DisconnectReason;
    this.DisconnectReasonFetch = other.DisconnectReasonFetch;
    this.DisconnectReasonSort = other.DisconnectReasonSort;
    this.DisconnectReasonSortAscending = other.DisconnectReasonSortAscending;
    this.DiscRcvOpt = other.DiscRcvOpt;
    this.DiscRcvOptFetch = other.DiscRcvOptFetch;
    this.DiscRcvOptSort = other.DiscRcvOptSort;
    this.DiscRcvOptSortAscending = other.DiscRcvOptSortAscending;
    this.ThreshRef = other.ThreshRef;
    this.ThreshRefFetch = other.ThreshRefFetch;
    this.ThreshRefSort = other.ThreshRefSort;
    this.ThreshRefSortAscending = other.ThreshRefSortAscending;
    this.BillPeriod = other.BillPeriod;
    this.BillPeriodFetch = other.BillPeriodFetch;
    this.BillPeriodSort = other.BillPeriodSort;
    this.BillPeriodCaseInsensitive = other.BillPeriodCaseInsensitive;
    this.BillPeriodSortAscending = other.BillPeriodSortAscending;
    this.BillingFrequency = other.BillingFrequency;
    this.BillingFrequencyFetch = other.BillingFrequencyFetch;
    this.BillingFrequencySort = other.BillingFrequencySort;
    this.BillingFrequencySortAscending = other.BillingFrequencySortAscending;
    this.BillFmtOpt = other.BillFmtOpt;
    this.BillFmtOptFetch = other.BillFmtOptFetch;
    this.BillFmtOptSort = other.BillFmtOptSort;
    this.BillFmtOptSortAscending = other.BillFmtOptSortAscending;
    this.BillDispMeth = other.BillDispMeth;
    this.BillDispMethFetch = other.BillDispMethFetch;
    this.BillDispMethSort = other.BillDispMethSort;
    this.BillDispMethSortAscending = other.BillDispMethSortAscending;
    this.BillHoldCode = other.BillHoldCode;
    this.BillHoldCodeFetch = other.BillHoldCodeFetch;
    this.BillHoldCodeSort = other.BillHoldCodeSort;
    this.BillHoldCodeSortAscending = other.BillHoldCodeSortAscending;
    this.MsgGrpId = other.MsgGrpId;
    this.MsgGrpIdFetch = other.MsgGrpIdFetch;
    this.MsgGrpIdSort = other.MsgGrpIdSort;
    this.MsgGrpIdSortAscending = other.MsgGrpIdSortAscending;
    this.InsertGrpId = other.InsertGrpId;
    this.InsertGrpIdFetch = other.InsertGrpIdFetch;
    this.InsertGrpIdSort = other.InsertGrpIdSort;
    this.InsertGrpIdSortAscending = other.InsertGrpIdSortAscending;
    this.RateClassDefault = other.RateClassDefault;
    this.RateClassDefaultFetch = other.RateClassDefaultFetch;
    this.RateClassDefaultSort = other.RateClassDefaultSort;
    this.RateClassDefaultSortAscending = other.RateClassDefaultSortAscending;
    this.RateClassSpecial = other.RateClassSpecial;
    this.RateClassSpecialFetch = other.RateClassSpecialFetch;
    this.RateClassSpecialSort = other.RateClassSpecialSort;
    this.RateClassSpecialSortAscending = other.RateClassSpecialSortAscending;
    this.ExrateClass = other.ExrateClass;
    this.ExrateClassFetch = other.ExrateClassFetch;
    this.ExrateClassSort = other.ExrateClassSort;
    this.ExrateClassSortAscending = other.ExrateClassSortAscending;
    this.PlanIdDiscount = other.PlanIdDiscount;
    this.PlanIdDiscountFetch = other.PlanIdDiscountFetch;
    this.PlanIdDiscountSort = other.PlanIdDiscountSort;
    this.PlanIdDiscountSortAscending = other.PlanIdDiscountSortAscending;
    this.PlanIdCredit = other.PlanIdCredit;
    this.PlanIdCreditFetch = other.PlanIdCreditFetch;
    this.PlanIdCreditSort = other.PlanIdCreditSort;
    this.PlanIdCreditSortAscending = other.PlanIdCreditSortAscending;
    this.AccountStatus = other.AccountStatus;
    this.AccountStatusFetch = other.AccountStatusFetch;
    this.AccountStatusSort = other.AccountStatusSort;
    this.AccountStatusSortAscending = other.AccountStatusSortAscending;
    this.AccountStatusDt = other.AccountStatusDt;
    this.AccountStatusDtFetch = other.AccountStatusDtFetch;
    this.AccountStatusDtSort = other.AccountStatusDtSort;
    this.AccountStatusDtSortAscending = other.AccountStatusDtSortAscending;
    this.DistrChan = other.DistrChan;
    this.DistrChanFetch = other.DistrChanFetch;
    this.DistrChanSort = other.DistrChanSort;
    this.DistrChanCaseInsensitive = other.DistrChanCaseInsensitive;
    this.DistrChanSortAscending = other.DistrChanSortAscending;
    this.SalesCode = other.SalesCode;
    this.SalesCodeFetch = other.SalesCodeFetch;
    this.SalesCodeSort = other.SalesCodeSort;
    this.SalesCodeCaseInsensitive = other.SalesCodeCaseInsensitive;
    this.SalesCodeSortAscending = other.SalesCodeSortAscending;
    this.MktCode = other.MktCode;
    this.MktCodeFetch = other.MktCodeFetch;
    this.MktCodeSort = other.MktCodeSort;
    this.MktCodeSortAscending = other.MktCodeSortAscending;
    this.SicCode = other.SicCode;
    this.SicCodeFetch = other.SicCodeFetch;
    this.SicCodeSort = other.SicCodeSort;
    this.SicCodeSortAscending = other.SicCodeSortAscending;
    this.InUse = other.InUse;
    this.InUseFetch = other.InUseFetch;
    this.InUseSort = other.InUseSort;
    this.InUseCaseInsensitive = other.InUseCaseInsensitive;
    this.InUseSortAscending = other.InUseSortAscending;
    this.CollectionIndicator = other.CollectionIndicator;
    this.CollectionIndicatorFetch = other.CollectionIndicatorFetch;
    this.CollectionIndicatorSort = other.CollectionIndicatorSort;
    this.CollectionIndicatorSortAscending = other.CollectionIndicatorSortAscending;
    this.CollectionStatus = other.CollectionStatus;
    this.CollectionStatusFetch = other.CollectionStatusFetch;
    this.CollectionStatusSort = other.CollectionStatusSort;
    this.CollectionStatusSortAscending = other.CollectionStatusSortAscending;
    this.CollectionHistory = other.CollectionHistory;
    this.CollectionHistoryFetch = other.CollectionHistoryFetch;
    this.CollectionHistorySort = other.CollectionHistorySort;
    this.CollectionHistoryCaseInsensitive = other.CollectionHistoryCaseInsensitive;
    this.CollectionHistorySortAscending = other.CollectionHistorySortAscending;
    this.VipCode = other.VipCode;
    this.VipCodeFetch = other.VipCodeFetch;
    this.VipCodeSort = other.VipCodeSort;
    this.VipCodeSortAscending = other.VipCodeSortAscending;
    this.PurchaseOrder = other.PurchaseOrder;
    this.PurchaseOrderFetch = other.PurchaseOrderFetch;
    this.PurchaseOrderSort = other.PurchaseOrderSort;
    this.PurchaseOrderCaseInsensitive = other.PurchaseOrderCaseInsensitive;
    this.PurchaseOrderSortAscending = other.PurchaseOrderSortAscending;
    this.Codeword = other.Codeword;
    this.CodewordFetch = other.CodewordFetch;
    this.CodewordSort = other.CodewordSort;
    this.CodewordCaseInsensitive = other.CodewordCaseInsensitive;
    this.CodewordSortAscending = other.CodewordSortAscending;
    this.Remark = other.Remark;
    this.RemarkFetch = other.RemarkFetch;
    this.RemarkSort = other.RemarkSort;
    this.RemarkCaseInsensitive = other.RemarkCaseInsensitive;
    this.RemarkSortAscending = other.RemarkSortAscending;
    this.CustEmail = other.CustEmail;
    this.CustEmailFetch = other.CustEmailFetch;
    this.CustEmailSort = other.CustEmailSort;
    this.CustEmailCaseInsensitive = other.CustEmailCaseInsensitive;
    this.CustEmailSortAscending = other.CustEmailSortAscending;
    this.StatementToEmail = other.StatementToEmail;
    this.StatementToEmailFetch = other.StatementToEmailFetch;
    this.StatementToEmailSort = other.StatementToEmailSort;
    this.StatementToEmailCaseInsensitive = other.StatementToEmailCaseInsensitive;
    this.StatementToEmailSortAscending = other.StatementToEmailSortAscending;
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;
    this.ChgDate = other.ChgDate;
    this.ChgDateFetch = other.ChgDateFetch;
    this.ChgDateSort = other.ChgDateSort;
    this.ChgDateSortAscending = other.ChgDateSortAscending;
    this.DateCreated = other.DateCreated;
    this.DateCreatedFetch = other.DateCreatedFetch;
    this.DateCreatedSort = other.DateCreatedSort;
    this.DateCreatedSortAscending = other.DateCreatedSortAscending;
    this.DateActive = other.DateActive;
    this.DateActiveFetch = other.DateActiveFetch;
    this.DateActiveSort = other.DateActiveSort;
    this.DateActiveSortAscending = other.DateActiveSortAscending;
    this.DateInactive = other.DateInactive;
    this.DateInactiveFetch = other.DateInactiveFetch;
    this.DateInactiveSort = other.DateInactiveSort;
    this.DateInactiveSortAscending = other.DateInactiveSortAscending;
    this.OwningCostCtr = other.OwningCostCtr;
    this.OwningCostCtrFetch = other.OwningCostCtrFetch;
    this.OwningCostCtrSort = other.OwningCostCtrSort;
    this.OwningCostCtrSortAscending = other.OwningCostCtrSortAscending;
    this.AcctSegId = other.AcctSegId;
    this.AcctSegIdFetch = other.AcctSegIdFetch;
    this.AcctSegIdSort = other.AcctSegIdSort;
    this.AcctSegIdSortAscending = other.AcctSegIdSortAscending;
    this.Converted = other.Converted;
    this.ConvertedFetch = other.ConvertedFetch;
    this.ConvertedSort = other.ConvertedSort;
    this.ConvertedSortAscending = other.ConvertedSortAscending;
    this.ChargeThreshold = other.ChargeThreshold;
    this.ChargeThresholdFetch = other.ChargeThresholdFetch;
    this.ChargeThresholdSort = other.ChargeThresholdSort;
    this.ChargeThresholdSortAscending = other.ChargeThresholdSortAscending;
    this.Threshold = other.Threshold;
    this.ThresholdFetch = other.ThresholdFetch;
    this.ThresholdSort = other.ThresholdSort;
    this.ThresholdSortAscending = other.ThresholdSortAscending;
    this.CyclicalThreshold = other.CyclicalThreshold;
    this.CyclicalThresholdFetch = other.CyclicalThresholdFetch;
    this.CyclicalThresholdSort = other.CyclicalThresholdSort;
    this.CyclicalThresholdSortAscending = other.CyclicalThresholdSortAscending;
    this.UsgAmtLimit = other.UsgAmtLimit;
    this.UsgAmtLimitFetch = other.UsgAmtLimitFetch;
    this.UsgAmtLimitSort = other.UsgAmtLimitSort;
    this.UsgAmtLimitSortAscending = other.UsgAmtLimitSortAscending;
    this.UsgUnitsLimit = other.UsgUnitsLimit;
    this.UsgUnitsLimitFetch = other.UsgUnitsLimitFetch;
    this.UsgUnitsLimitSort = other.UsgUnitsLimitSort;
    this.UsgUnitsLimitSortAscending = other.UsgUnitsLimitSortAscending;
    this.RegulatoryId = other.RegulatoryId;
    this.RegulatoryIdFetch = other.RegulatoryIdFetch;
    this.RegulatoryIdSort = other.RegulatoryIdSort;
    this.RegulatoryIdSortAscending = other.RegulatoryIdSortAscending;
    this.GlobalContractStatus = other.GlobalContractStatus;
    this.GlobalContractStatusFetch = other.GlobalContractStatusFetch;
    this.GlobalContractStatusSort = other.GlobalContractStatusSort;
    this.GlobalContractStatusSortAscending = other.GlobalContractStatusSortAscending;
    this.AltLname = other.AltLname;
    this.AltLnameFetch = other.AltLnameFetch;
    this.AltLnameSort = other.AltLnameSort;
    this.AltLnameCaseInsensitive = other.AltLnameCaseInsensitive;
    this.AltLnameSortAscending = other.AltLnameSortAscending;
    this.AltFname = other.AltFname;
    this.AltFnameFetch = other.AltFnameFetch;
    this.AltFnameSort = other.AltFnameSort;
    this.AltFnameCaseInsensitive = other.AltFnameCaseInsensitive;
    this.AltFnameSortAscending = other.AltFnameSortAscending;
    this.AltCompanyName = other.AltCompanyName;
    this.AltCompanyNameFetch = other.AltCompanyNameFetch;
    this.AltCompanyNameSort = other.AltCompanyNameSort;
    this.AltCompanyNameCaseInsensitive = other.AltCompanyNameCaseInsensitive;
    this.AltCompanyNameSortAscending = other.AltCompanyNameSortAscending;
    this.Gender = other.Gender;
    this.GenderFetch = other.GenderFetch;
    this.GenderSort = other.GenderSort;
    this.GenderSortAscending = other.GenderSortAscending;
    this.Dept = other.Dept;
    this.DeptFetch = other.DeptFetch;
    this.DeptSort = other.DeptSort;
    this.DeptCaseInsensitive = other.DeptCaseInsensitive;
    this.DeptSortAscending = other.DeptSortAscending;
    this.Title = other.Title;
    this.TitleFetch = other.TitleFetch;
    this.TitleSort = other.TitleSort;
    this.TitleCaseInsensitive = other.TitleCaseInsensitive;
    this.TitleSortAscending = other.TitleSortAscending;
    this.PaymentProfileId = other.PaymentProfileId;
    this.PaymentProfileIdFetch = other.PaymentProfileIdFetch;
    this.PaymentProfileIdSort = other.PaymentProfileIdSort;
    this.PaymentProfileIdSortAscending = other.PaymentProfileIdSortAscending;
    this.AccountProcessFlag = other.AccountProcessFlag;
    this.AccountProcessFlagFetch = other.AccountProcessFlagFetch;
    this.AccountProcessFlagSort = other.AccountProcessFlagSort;
    this.AccountProcessFlagSortAscending = other.AccountProcessFlagSortAscending;
    this.SdAgencyId = other.SdAgencyId;
    this.SdAgencyIdFetch = other.SdAgencyIdFetch;
    this.SdAgencyIdSort = other.SdAgencyIdSort;
    this.SdAgencyIdCaseInsensitive = other.SdAgencyIdCaseInsensitive;
    this.SdAgencyIdSortAscending = other.SdAgencyIdSortAscending;
    this.CustomerLifetimeId = other.CustomerLifetimeId;
    this.CustomerLifetimeIdFetch = other.CustomerLifetimeIdFetch;
    this.CustomerLifetimeIdSort = other.CustomerLifetimeIdSort;
    this.CustomerLifetimeIdSortAscending = other.CustomerLifetimeIdSortAscending;
    this.CustomerLifetimeId2 = other.CustomerLifetimeId2;
    this.CustomerLifetimeId2Fetch = other.CustomerLifetimeId2Fetch;
    this.CustomerLifetimeId2Sort = other.CustomerLifetimeId2Sort;
    this.CustomerLifetimeId2SortAscending = other.CustomerLifetimeId2SortAscending;
    this.AutoWriteoffStatus = other.AutoWriteoffStatus;
    this.AutoWriteoffStatusFetch = other.AutoWriteoffStatusFetch;
    this.AutoWriteoffStatusSort = other.AutoWriteoffStatusSort;
    this.AutoWriteoffStatusSortAscending = other.AutoWriteoffStatusSortAscending;  }
  /** Set the field level Fetch value for field: ParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setParentAccountExternalIdFetch (boolean fetch) {
    this.ParentAccountExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getParentAccountExternalIdFetch () {
    return this.ParentAccountExternalIdFetch;
  }
  /** Set the SortOrder for field: ParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParentAccountExternalIdSortOrder (Integer value) {
    this.ParentAccountExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParentAccountExternalIdSortOrder () {
    return this.ParentAccountExternalIdSort;
  }
  /** Set the sort direction for field: ParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParentAccountExternalIdSortDirection (boolean ascending) {
    this.ParentAccountExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParentAccountExternalIdSortDirection () {
    return this.ParentAccountExternalIdSortAscending;
  }
  /** Set the case insensitive for field: ParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setParentAccountExternalIdCaseInsensitive (boolean ascending) {
    this.ParentAccountExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getParentAccountExternalIdCaseInsensitive () {
    return this.ParentAccountExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: ParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParentAccountExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.ParentAccountExternalId = value;
  }
  /** Retrieve filter for field: ParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getParentAccountExternalIdFilter () {
    return this.ParentAccountExternalId;
  }

  /**
   * Retrieves the ParentAccountExternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParentAccountExternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentAccountExternalIdFilter field
   */
  public String[] getParentAccountExternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAccountExternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParentAccountExternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentAccountExternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentAccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentAccountExternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParentAccountExternalIdFilter filter value from a formatted string
   *
   * @param _value the ParentAccountExternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParentAccountExternalIdFilter filter field
   */
  public void setParentAccountExternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParentAccountExternalIdFilterFromFormattedString");
    try {
      this.setParentAccountExternalIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentAccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentAccountExternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentAccountExternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setParentAccountExternalIdTypeFetch (boolean fetch) {
    this.ParentAccountExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getParentAccountExternalIdTypeFetch () {
    return this.ParentAccountExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: ParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParentAccountExternalIdTypeSortOrder (Integer value) {
    this.ParentAccountExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: ParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParentAccountExternalIdTypeSortOrder () {
    return this.ParentAccountExternalIdTypeSort;
  }
  /** Set the sort direction for field: ParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParentAccountExternalIdTypeSortDirection (boolean ascending) {
    this.ParentAccountExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParentAccountExternalIdTypeSortDirection () {
    return this.ParentAccountExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: ParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParentAccountExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ParentAccountExternalIdType = value;
  }
  /** Retrieve filter for field: ParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParentAccountExternalIdTypeFilter () {
    return this.ParentAccountExternalIdType;
  }

  /**
   * Retrieves the ParentAccountExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParentAccountExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentAccountExternalIdTypeFilter field
   */
  public String[] getParentAccountExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAccountExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParentAccountExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentAccountExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentAccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentAccountExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParentAccountExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the ParentAccountExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParentAccountExternalIdTypeFilter filter field
   */
  public void setParentAccountExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParentAccountExternalIdTypeFilterFromFormattedString");
    try {
      this.setParentAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentAccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentAccountExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentAccountExternalIdTypeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated ParentAccountExternalIdTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ParentAccountExternalIdTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ParentAccountExternalIdTypeFilter filter field
   */
  public String[] getParentAccountExternalIdTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAccountExternalIdTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getParentAccountExternalIdTypeFilter(), "ExternalIdType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentAccountExternalIdTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentAccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentAccountExternalIdTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated ParentAccountExternalIdTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the ParentAccountExternalIdTypeFilter filter field
   */
  public void setParentAccountExternalIdTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParentAccountExternalIdTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setParentAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "ParentAccountExternalIdType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentAccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentAccountExternalIdTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentAccountExternalIdTypeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: HierarchyAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setHierarchyAccountExternalIdFetch (boolean fetch) {
    this.HierarchyAccountExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: HierarchyAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getHierarchyAccountExternalIdFetch () {
    return this.HierarchyAccountExternalIdFetch;
  }
  /** Set the SortOrder for field: HierarchyAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHierarchyAccountExternalIdSortOrder (Integer value) {
    this.HierarchyAccountExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: HierarchyAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHierarchyAccountExternalIdSortOrder () {
    return this.HierarchyAccountExternalIdSort;
  }
  /** Set the sort direction for field: HierarchyAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHierarchyAccountExternalIdSortDirection (boolean ascending) {
    this.HierarchyAccountExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: HierarchyAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHierarchyAccountExternalIdSortDirection () {
    return this.HierarchyAccountExternalIdSortAscending;
  }
  /** Set the case insensitive for field: HierarchyAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setHierarchyAccountExternalIdCaseInsensitive (boolean ascending) {
    this.HierarchyAccountExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: HierarchyAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getHierarchyAccountExternalIdCaseInsensitive () {
    return this.HierarchyAccountExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: HierarchyAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHierarchyAccountExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.HierarchyAccountExternalId = value;
  }
  /** Retrieve filter for field: HierarchyAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getHierarchyAccountExternalIdFilter () {
    return this.HierarchyAccountExternalId;
  }

  /**
   * Retrieves the HierarchyAccountExternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The HierarchyAccountExternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HierarchyAccountExternalIdFilter field
   */
  public String[] getHierarchyAccountExternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyAccountExternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getHierarchyAccountExternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHierarchyAccountExternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HierarchyAccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getHierarchyAccountExternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the HierarchyAccountExternalIdFilter filter value from a formatted string
   *
   * @param _value the HierarchyAccountExternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the HierarchyAccountExternalIdFilter filter field
   */
  public void setHierarchyAccountExternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setHierarchyAccountExternalIdFilterFromFormattedString");
    try {
      this.setHierarchyAccountExternalIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HierarchyAccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setHierarchyAccountExternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHierarchyAccountExternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: HierarchyAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setHierarchyAccountExternalIdTypeFetch (boolean fetch) {
    this.HierarchyAccountExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: HierarchyAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getHierarchyAccountExternalIdTypeFetch () {
    return this.HierarchyAccountExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: HierarchyAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHierarchyAccountExternalIdTypeSortOrder (Integer value) {
    this.HierarchyAccountExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: HierarchyAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHierarchyAccountExternalIdTypeSortOrder () {
    return this.HierarchyAccountExternalIdTypeSort;
  }
  /** Set the sort direction for field: HierarchyAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHierarchyAccountExternalIdTypeSortDirection (boolean ascending) {
    this.HierarchyAccountExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: HierarchyAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHierarchyAccountExternalIdTypeSortDirection () {
    return this.HierarchyAccountExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: HierarchyAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHierarchyAccountExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.HierarchyAccountExternalIdType = value;
  }
  /** Retrieve filter for field: HierarchyAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getHierarchyAccountExternalIdTypeFilter () {
    return this.HierarchyAccountExternalIdType;
  }

  /**
   * Retrieves the HierarchyAccountExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The HierarchyAccountExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HierarchyAccountExternalIdTypeFilter field
   */
  public String[] getHierarchyAccountExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyAccountExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getHierarchyAccountExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHierarchyAccountExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HierarchyAccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getHierarchyAccountExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the HierarchyAccountExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the HierarchyAccountExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the HierarchyAccountExternalIdTypeFilter filter field
   */
  public void setHierarchyAccountExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setHierarchyAccountExternalIdTypeFilterFromFormattedString");
    try {
      this.setHierarchyAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HierarchyAccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setHierarchyAccountExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHierarchyAccountExternalIdTypeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated HierarchyAccountExternalIdTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the HierarchyAccountExternalIdTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the HierarchyAccountExternalIdTypeFilter filter field
   */
  public String[] getHierarchyAccountExternalIdTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyAccountExternalIdTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getHierarchyAccountExternalIdTypeFilter(), "ExternalIdType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHierarchyAccountExternalIdTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HierarchyAccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getHierarchyAccountExternalIdTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated HierarchyAccountExternalIdTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the HierarchyAccountExternalIdTypeFilter filter field
   */
  public void setHierarchyAccountExternalIdTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setHierarchyAccountExternalIdTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setHierarchyAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "HierarchyAccountExternalIdType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HierarchyAccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setHierarchyAccountExternalIdTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHierarchyAccountExternalIdTypeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: ParentId (CMF.parent_id)
   * @param fetch whether to fetch this field or not
   */
  public void setParentIdFetch (boolean fetch) {
    this.ParentIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParentId (CMF.parent_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getParentIdFetch () {
    return this.ParentIdFetch;
  }
  /** Set the SortOrder for field: ParentId (CMF.parent_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParentIdSortOrder (Integer value) {
    this.ParentIdSort = value;
  }
  /** Retrieve SortOrder for field: ParentId (CMF.parent_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParentIdSortOrder () {
    return this.ParentIdSort;
  }
  /** Set the sort direction for field: ParentId (CMF.parent_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParentIdSortDirection (boolean ascending) {
    this.ParentIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParentId (CMF.parent_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParentIdSortDirection () {
    return this.ParentIdSortAscending;
  }
  /** Set the field level filters for field: ParentId (CMF.parent_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParentIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ParentId = value;
  }
  /** Retrieve filter for field: ParentId (CMF.parent_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParentIdFilter () {
    return this.ParentId;
  }

  /**
   * Retrieves the ParentIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParentIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentIdFilter field
   */
  public String[] getParentIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParentIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParentIdFilter filter value from a formatted string
   *
   * @param _value the ParentIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParentIdFilter filter field
   */
  public void setParentIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParentIdFilterFromFormattedString");
    try {
      this.setParentIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ChildCount (CMF.child_count)
   * @param fetch whether to fetch this field or not
   */
  public void setChildCountFetch (boolean fetch) {
    this.ChildCountFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChildCount (CMF.child_count)
   * @return boolean the Fetch value for this field
   */
  public boolean getChildCountFetch () {
    return this.ChildCountFetch;
  }
  /** Set the SortOrder for field: ChildCount (CMF.child_count)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChildCountSortOrder (Integer value) {
    this.ChildCountSort = value;
  }
  /** Retrieve SortOrder for field: ChildCount (CMF.child_count)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChildCountSortOrder () {
    return this.ChildCountSort;
  }
  /** Set the sort direction for field: ChildCount (CMF.child_count)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChildCountSortDirection (boolean ascending) {
    this.ChildCountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChildCount (CMF.child_count)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChildCountSortDirection () {
    return this.ChildCountSortAscending;
  }
  /** Set the field level filters for field: ChildCount (CMF.child_count)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChildCountFilter (IntegerFilter[] value) throws ServiceException {
    this.ChildCount = value;
  }
  /** Retrieve filter for field: ChildCount (CMF.child_count)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getChildCountFilter () {
    return this.ChildCount;
  }

  /**
   * Retrieves the ChildCountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChildCountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChildCountFilter field
   */
  public String[] getChildCountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChildCountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChildCountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChildCountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChildCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChildCountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChildCountFilter filter value from a formatted string
   *
   * @param _value the ChildCountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChildCountFilter filter field
   */
  public void setChildCountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChildCountFilterFromFormattedString");
    try {
      this.setChildCountFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChildCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChildCountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChildCountFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: HierarchyId (CMF.hierarchy_id)
   * @param fetch whether to fetch this field or not
   */
  public void setHierarchyIdFetch (boolean fetch) {
    this.HierarchyIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: HierarchyId (CMF.hierarchy_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getHierarchyIdFetch () {
    return this.HierarchyIdFetch;
  }
  /** Set the SortOrder for field: HierarchyId (CMF.hierarchy_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setHierarchyIdSortOrder (Integer value) {
    this.HierarchyIdSort = value;
  }
  /** Retrieve SortOrder for field: HierarchyId (CMF.hierarchy_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getHierarchyIdSortOrder () {
    return this.HierarchyIdSort;
  }
  /** Set the sort direction for field: HierarchyId (CMF.hierarchy_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setHierarchyIdSortDirection (boolean ascending) {
    this.HierarchyIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: HierarchyId (CMF.hierarchy_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getHierarchyIdSortDirection () {
    return this.HierarchyIdSortAscending;
  }
  /** Set the field level filters for field: HierarchyId (CMF.hierarchy_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setHierarchyIdFilter (IntegerFilter[] value) throws ServiceException {
    this.HierarchyId = value;
  }
  /** Retrieve filter for field: HierarchyId (CMF.hierarchy_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getHierarchyIdFilter () {
    return this.HierarchyId;
  }

  /**
   * Retrieves the HierarchyIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The HierarchyIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HierarchyIdFilter field
   */
  public String[] getHierarchyIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getHierarchyIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHierarchyIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HierarchyIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getHierarchyIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the HierarchyIdFilter filter value from a formatted string
   *
   * @param _value the HierarchyIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the HierarchyIdFilter filter field
   */
  public void setHierarchyIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setHierarchyIdFilterFromFormattedString");
    try {
      this.setHierarchyIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HierarchyIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setHierarchyIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHierarchyIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TieCode (CMF.tie_code)
   * @param fetch whether to fetch this field or not
   */
  public void setTieCodeFetch (boolean fetch) {
    this.TieCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TieCode (CMF.tie_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getTieCodeFetch () {
    return this.TieCodeFetch;
  }
  /** Set the SortOrder for field: TieCode (CMF.tie_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTieCodeSortOrder (Integer value) {
    this.TieCodeSort = value;
  }
  /** Retrieve SortOrder for field: TieCode (CMF.tie_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTieCodeSortOrder () {
    return this.TieCodeSort;
  }
  /** Set the sort direction for field: TieCode (CMF.tie_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTieCodeSortDirection (boolean ascending) {
    this.TieCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TieCode (CMF.tie_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTieCodeSortDirection () {
    return this.TieCodeSortAscending;
  }
  /** Set the field level filters for field: TieCode (CMF.tie_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTieCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.TieCode = value;
  }
  /** Retrieve filter for field: TieCode (CMF.tie_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTieCodeFilter () {
    return this.TieCode;
  }

  /**
   * Retrieves the TieCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TieCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TieCodeFilter field
   */
  public String[] getTieCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTieCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTieCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTieCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TieCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTieCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TieCodeFilter filter value from a formatted string
   *
   * @param _value the TieCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TieCodeFilter filter field
   */
  public void setTieCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTieCodeFilterFromFormattedString");
    try {
      this.setTieCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TieCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTieCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTieCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillSequenceNum (CMF.bill_sequence_num)
   * @param fetch whether to fetch this field or not
   */
  public void setBillSequenceNumFetch (boolean fetch) {
    this.BillSequenceNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillSequenceNum (CMF.bill_sequence_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillSequenceNumFetch () {
    return this.BillSequenceNumFetch;
  }
  /** Set the SortOrder for field: BillSequenceNum (CMF.bill_sequence_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillSequenceNumSortOrder (Integer value) {
    this.BillSequenceNumSort = value;
  }
  /** Retrieve SortOrder for field: BillSequenceNum (CMF.bill_sequence_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillSequenceNumSortOrder () {
    return this.BillSequenceNumSort;
  }
  /** Set the sort direction for field: BillSequenceNum (CMF.bill_sequence_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillSequenceNumSortDirection (boolean ascending) {
    this.BillSequenceNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillSequenceNum (CMF.bill_sequence_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillSequenceNumSortDirection () {
    return this.BillSequenceNumSortAscending;
  }
  /** Set the field level filters for field: BillSequenceNum (CMF.bill_sequence_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillSequenceNumFilter (IntegerFilter[] value) throws ServiceException {
    this.BillSequenceNum = value;
  }
  /** Retrieve filter for field: BillSequenceNum (CMF.bill_sequence_num)
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

  /** Set the field level Fetch value for field: CurrencyCode (CMF.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (CMF.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (CMF.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (CMF.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (CMF.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (CMF.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (CMF.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (CMF.currency_code)
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


  /** Set the field level Fetch value for field: LanguageCode (CMF.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch) {
    this.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (CMF.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch () {
    return this.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (CMF.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value) {
    this.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (CMF.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder () {
    return this.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (CMF.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending) {
    this.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (CMF.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection () {
    return this.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (CMF.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (CMF.language_code)
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


  /** Set the field level Fetch value for field: AccountType (CMF.account_type)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountTypeFetch (boolean fetch) {
    this.AccountTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountType (CMF.account_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountTypeFetch () {
    return this.AccountTypeFetch;
  }
  /** Set the SortOrder for field: AccountType (CMF.account_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountTypeSortOrder (Integer value) {
    this.AccountTypeSort = value;
  }
  /** Retrieve SortOrder for field: AccountType (CMF.account_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountTypeSortOrder () {
    return this.AccountTypeSort;
  }
  /** Set the sort direction for field: AccountType (CMF.account_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountTypeSortDirection (boolean ascending) {
    this.AccountTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountType (CMF.account_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountTypeSortDirection () {
    return this.AccountTypeSortAscending;
  }
  /** Set the field level filters for field: AccountType (CMF.account_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountType = value;
  }
  /** Retrieve filter for field: AccountType (CMF.account_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountTypeFilter () {
    return this.AccountType;
  }

  /**
   * Retrieves the AccountTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountTypeFilter field
   */
  public String[] getAccountTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountTypeFilter filter value from a formatted string
   *
   * @param _value the AccountTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountTypeFilter filter field
   */
  public void setAccountTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountTypeFilterFromFormattedString");
    try {
      this.setAccountTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountTypeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated AccountTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccountTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountTypeFilter filter field
   */
  public String[] getAccountTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getAccountTypeFilter(), "AccountType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated AccountTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountTypeFilter filter field
   */
  public void setAccountTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setAccountTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "AccountType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountTypeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: AccountCategory (CMF.account_category)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountCategoryFetch (boolean fetch) {
    this.AccountCategoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountCategory (CMF.account_category)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountCategoryFetch () {
    return this.AccountCategoryFetch;
  }
  /** Set the SortOrder for field: AccountCategory (CMF.account_category)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountCategorySortOrder (Integer value) {
    this.AccountCategorySort = value;
  }
  /** Retrieve SortOrder for field: AccountCategory (CMF.account_category)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountCategorySortOrder () {
    return this.AccountCategorySort;
  }
  /** Set the sort direction for field: AccountCategory (CMF.account_category)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountCategorySortDirection (boolean ascending) {
    this.AccountCategorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountCategory (CMF.account_category)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountCategorySortDirection () {
    return this.AccountCategorySortAscending;
  }
  /** Set the field level filters for field: AccountCategory (CMF.account_category)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountCategoryFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountCategory = value;
  }
  /** Retrieve filter for field: AccountCategory (CMF.account_category)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountCategoryFilter () {
    return this.AccountCategory;
  }

  /**
   * Retrieves the AccountCategoryFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountCategoryFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountCategoryFilter field
   */
  public String[] getAccountCategoryFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCategoryFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountCategoryFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCategoryFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountCategoryFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountCategoryFilter filter value from a formatted string
   *
   * @param _value the AccountCategoryFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountCategoryFilter filter field
   */
  public void setAccountCategoryFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountCategoryFilterFromFormattedString");
    try {
      this.setAccountCategoryFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountCategoryFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountCategoryFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PrevCutoffDate (CMF.prev_cutoff_date)
   * @param fetch whether to fetch this field or not
   */
  public void setPrevCutoffDateFetch (boolean fetch) {
    this.PrevCutoffDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrevCutoffDate (CMF.prev_cutoff_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrevCutoffDateFetch () {
    return this.PrevCutoffDateFetch;
  }
  /** Set the SortOrder for field: PrevCutoffDate (CMF.prev_cutoff_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrevCutoffDateSortOrder (Integer value) {
    this.PrevCutoffDateSort = value;
  }
  /** Retrieve SortOrder for field: PrevCutoffDate (CMF.prev_cutoff_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrevCutoffDateSortOrder () {
    return this.PrevCutoffDateSort;
  }
  /** Set the sort direction for field: PrevCutoffDate (CMF.prev_cutoff_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrevCutoffDateSortDirection (boolean ascending) {
    this.PrevCutoffDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrevCutoffDate (CMF.prev_cutoff_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrevCutoffDateSortDirection () {
    return this.PrevCutoffDateSortAscending;
  }
  /** Set the field level filters for field: PrevCutoffDate (CMF.prev_cutoff_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrevCutoffDateFilter (DateFilter[] value) throws ServiceException {
    this.PrevCutoffDate = value;
  }
  /** Retrieve filter for field: PrevCutoffDate (CMF.prev_cutoff_date)
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


  /** Set the field level Fetch value for field: PrevBillDate (CMF.prev_bill_date)
   * @param fetch whether to fetch this field or not
   */
  public void setPrevBillDateFetch (boolean fetch) {
    this.PrevBillDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrevBillDate (CMF.prev_bill_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrevBillDateFetch () {
    return this.PrevBillDateFetch;
  }
  /** Set the SortOrder for field: PrevBillDate (CMF.prev_bill_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrevBillDateSortOrder (Integer value) {
    this.PrevBillDateSort = value;
  }
  /** Retrieve SortOrder for field: PrevBillDate (CMF.prev_bill_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrevBillDateSortOrder () {
    return this.PrevBillDateSort;
  }
  /** Set the sort direction for field: PrevBillDate (CMF.prev_bill_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrevBillDateSortDirection (boolean ascending) {
    this.PrevBillDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrevBillDate (CMF.prev_bill_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrevBillDateSortDirection () {
    return this.PrevBillDateSortAscending;
  }
  /** Set the field level filters for field: PrevBillDate (CMF.prev_bill_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrevBillDateFilter (DateFilter[] value) throws ServiceException {
    this.PrevBillDate = value;
  }
  /** Retrieve filter for field: PrevBillDate (CMF.prev_bill_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPrevBillDateFilter () {
    return this.PrevBillDate;
  }

  /**
   * Retrieves the PrevBillDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevBillDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevBillDateFilter field
   */
  public String[] getPrevBillDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBillDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrevBillDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevBillDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevBillDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevBillDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrevBillDateFilter filter value from a formatted string
   *
   * @param _value the PrevBillDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrevBillDateFilter filter field
   */
  public void setPrevBillDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevBillDateFilterFromFormattedString");
    try {
      this.setPrevBillDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevBillDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevBillDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevBillDateFilterFromFormattedString");
  }

  /**
   * Retrieves the PrevBillDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevBillDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevBillDateFilter field
   */
  public String[] getPrevBillDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBillDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrevBillDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevBillDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevBillDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevBillDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PrevBillDateFilter filter value from a formatted string
   *
   * @param _value the PrevBillDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrevBillDateFilter filter field
   */
  public void setPrevBillDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevBillDateFilterFromFormattedDateTimeString");
    try {
      this.setPrevBillDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevBillDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevBillDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevBillDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: NextBillDate (CMF.next_bill_date)
   * @param fetch whether to fetch this field or not
   */
  public void setNextBillDateFetch (boolean fetch) {
    this.NextBillDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: NextBillDate (CMF.next_bill_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getNextBillDateFetch () {
    return this.NextBillDateFetch;
  }
  /** Set the SortOrder for field: NextBillDate (CMF.next_bill_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNextBillDateSortOrder (Integer value) {
    this.NextBillDateSort = value;
  }
  /** Retrieve SortOrder for field: NextBillDate (CMF.next_bill_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNextBillDateSortOrder () {
    return this.NextBillDateSort;
  }
  /** Set the sort direction for field: NextBillDate (CMF.next_bill_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNextBillDateSortDirection (boolean ascending) {
    this.NextBillDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NextBillDate (CMF.next_bill_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNextBillDateSortDirection () {
    return this.NextBillDateSortAscending;
  }
  /** Set the field level filters for field: NextBillDate (CMF.next_bill_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNextBillDateFilter (DateFilter[] value) throws ServiceException {
    this.NextBillDate = value;
  }
  /** Retrieve filter for field: NextBillDate (CMF.next_bill_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getNextBillDateFilter () {
    return this.NextBillDate;
  }

  /**
   * Retrieves the NextBillDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NextBillDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NextBillDateFilter field
   */
  public String[] getNextBillDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextBillDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNextBillDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNextBillDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextBillDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNextBillDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NextBillDateFilter filter value from a formatted string
   *
   * @param _value the NextBillDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NextBillDateFilter filter field
   */
  public void setNextBillDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNextBillDateFilterFromFormattedString");
    try {
      this.setNextBillDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextBillDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNextBillDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNextBillDateFilterFromFormattedString");
  }

  /**
   * Retrieves the NextBillDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NextBillDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the NextBillDateFilter field
   */
  public String[] getNextBillDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextBillDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNextBillDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNextBillDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextBillDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNextBillDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the NextBillDateFilter filter value from a formatted string
   *
   * @param _value the NextBillDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NextBillDateFilter filter field
   */
  public void setNextBillDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNextBillDateFilterFromFormattedDateTimeString");
    try {
      this.setNextBillDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextBillDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNextBillDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNextBillDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: PrevBillRefno (CMF.prev_bill_refno)
   * @param fetch whether to fetch this field or not
   */
  public void setPrevBillRefnoFetch (boolean fetch) {
    this.PrevBillRefnoFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrevBillRefno (CMF.prev_bill_refno)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrevBillRefnoFetch () {
    return this.PrevBillRefnoFetch;
  }
  /** Set the SortOrder for field: PrevBillRefno (CMF.prev_bill_refno)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrevBillRefnoSortOrder (Integer value) {
    this.PrevBillRefnoSort = value;
  }
  /** Retrieve SortOrder for field: PrevBillRefno (CMF.prev_bill_refno)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrevBillRefnoSortOrder () {
    return this.PrevBillRefnoSort;
  }
  /** Set the sort direction for field: PrevBillRefno (CMF.prev_bill_refno)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrevBillRefnoSortDirection (boolean ascending) {
    this.PrevBillRefnoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrevBillRefno (CMF.prev_bill_refno)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrevBillRefnoSortDirection () {
    return this.PrevBillRefnoSortAscending;
  }
  /** Set the field level filters for field: PrevBillRefno (CMF.prev_bill_refno)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrevBillRefnoFilter (IntegerFilter[] value) throws ServiceException {
    this.PrevBillRefno = value;
  }
  /** Retrieve filter for field: PrevBillRefno (CMF.prev_bill_refno)
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

  /** Set the field level Fetch value for field: PrevBillRefResets (CMF.prev_bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setPrevBillRefResetsFetch (boolean fetch) {
    this.PrevBillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrevBillRefResets (CMF.prev_bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrevBillRefResetsFetch () {
    return this.PrevBillRefResetsFetch;
  }
  /** Set the SortOrder for field: PrevBillRefResets (CMF.prev_bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrevBillRefResetsSortOrder (Integer value) {
    this.PrevBillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: PrevBillRefResets (CMF.prev_bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrevBillRefResetsSortOrder () {
    return this.PrevBillRefResetsSort;
  }
  /** Set the sort direction for field: PrevBillRefResets (CMF.prev_bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrevBillRefResetsSortDirection (boolean ascending) {
    this.PrevBillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrevBillRefResets (CMF.prev_bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrevBillRefResetsSortDirection () {
    return this.PrevBillRefResetsSortAscending;
  }
  /** Set the field level filters for field: PrevBillRefResets (CMF.prev_bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrevBillRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.PrevBillRefResets = value;
  }
  /** Retrieve filter for field: PrevBillRefResets (CMF.prev_bill_ref_resets)
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

  /** Set the field level Fetch value for field: PrevBalanceRefno (CMF.prev_balance_refno)
   * @param fetch whether to fetch this field or not
   */
  public void setPrevBalanceRefnoFetch (boolean fetch) {
    this.PrevBalanceRefnoFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrevBalanceRefno (CMF.prev_balance_refno)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrevBalanceRefnoFetch () {
    return this.PrevBalanceRefnoFetch;
  }
  /** Set the SortOrder for field: PrevBalanceRefno (CMF.prev_balance_refno)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrevBalanceRefnoSortOrder (Integer value) {
    this.PrevBalanceRefnoSort = value;
  }
  /** Retrieve SortOrder for field: PrevBalanceRefno (CMF.prev_balance_refno)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrevBalanceRefnoSortOrder () {
    return this.PrevBalanceRefnoSort;
  }
  /** Set the sort direction for field: PrevBalanceRefno (CMF.prev_balance_refno)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrevBalanceRefnoSortDirection (boolean ascending) {
    this.PrevBalanceRefnoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrevBalanceRefno (CMF.prev_balance_refno)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrevBalanceRefnoSortDirection () {
    return this.PrevBalanceRefnoSortAscending;
  }
  /** Set the field level filters for field: PrevBalanceRefno (CMF.prev_balance_refno)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrevBalanceRefnoFilter (IntegerFilter[] value) throws ServiceException {
    this.PrevBalanceRefno = value;
  }
  /** Retrieve filter for field: PrevBalanceRefno (CMF.prev_balance_refno)
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

  /** Set the field level Fetch value for field: PrevBalanceRefResets (CMF.prev_balance_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setPrevBalanceRefResetsFetch (boolean fetch) {
    this.PrevBalanceRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrevBalanceRefResets (CMF.prev_balance_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrevBalanceRefResetsFetch () {
    return this.PrevBalanceRefResetsFetch;
  }
  /** Set the SortOrder for field: PrevBalanceRefResets (CMF.prev_balance_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrevBalanceRefResetsSortOrder (Integer value) {
    this.PrevBalanceRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: PrevBalanceRefResets (CMF.prev_balance_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrevBalanceRefResetsSortOrder () {
    return this.PrevBalanceRefResetsSort;
  }
  /** Set the sort direction for field: PrevBalanceRefResets (CMF.prev_balance_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrevBalanceRefResetsSortDirection (boolean ascending) {
    this.PrevBalanceRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrevBalanceRefResets (CMF.prev_balance_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrevBalanceRefResetsSortDirection () {
    return this.PrevBalanceRefResetsSortAscending;
  }
  /** Set the field level filters for field: PrevBalanceRefResets (CMF.prev_balance_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrevBalanceRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.PrevBalanceRefResets = value;
  }
  /** Retrieve filter for field: PrevBalanceRefResets (CMF.prev_balance_ref_resets)
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

  /** Set the field level Fetch value for field: BillNamePre (CMF.bill_name_pre)
   * @param fetch whether to fetch this field or not
   */
  public void setBillNamePreFetch (boolean fetch) {
    this.BillNamePreFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillNamePre (CMF.bill_name_pre)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillNamePreFetch () {
    return this.BillNamePreFetch;
  }
  /** Set the SortOrder for field: BillNamePre (CMF.bill_name_pre)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillNamePreSortOrder (Integer value) {
    this.BillNamePreSort = value;
  }
  /** Retrieve SortOrder for field: BillNamePre (CMF.bill_name_pre)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillNamePreSortOrder () {
    return this.BillNamePreSort;
  }
  /** Set the sort direction for field: BillNamePre (CMF.bill_name_pre)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillNamePreSortDirection (boolean ascending) {
    this.BillNamePreSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillNamePre (CMF.bill_name_pre)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillNamePreSortDirection () {
    return this.BillNamePreSortAscending;
  }
  /** Set the case insensitive for field: BillNamePre (CMF.bill_name_pre)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillNamePreCaseInsensitive (boolean ascending) {
    this.BillNamePreCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillNamePre (CMF.bill_name_pre)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillNamePreCaseInsensitive () {
    return this.BillNamePreCaseInsensitive;
  }
  /** Set the field level filters for field: BillNamePre (CMF.bill_name_pre)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillNamePreFilter (StringFilter[] value) throws ServiceException {
    this.BillNamePre = value;
  }
  /** Retrieve filter for field: BillNamePre (CMF.bill_name_pre)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillNamePreFilter () {
    return this.BillNamePre;
  }

  /**
   * Retrieves the BillNamePreFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillNamePreFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillNamePreFilter field
   */
  public String[] getBillNamePreFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillNamePreFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillNamePreFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillNamePreFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillNamePreFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillNamePreFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillNamePreFilter filter value from a formatted string
   *
   * @param _value the BillNamePreFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillNamePreFilter filter field
   */
  public void setBillNamePreFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillNamePreFilterFromFormattedString");
    try {
      this.setBillNamePreFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillNamePreFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillNamePreFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillNamePreFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillFname (CMF.bill_fname)
   * @param fetch whether to fetch this field or not
   */
  public void setBillFnameFetch (boolean fetch) {
    this.BillFnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillFname (CMF.bill_fname)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillFnameFetch () {
    return this.BillFnameFetch;
  }
  /** Set the SortOrder for field: BillFname (CMF.bill_fname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillFnameSortOrder (Integer value) {
    this.BillFnameSort = value;
  }
  /** Retrieve SortOrder for field: BillFname (CMF.bill_fname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillFnameSortOrder () {
    return this.BillFnameSort;
  }
  /** Set the sort direction for field: BillFname (CMF.bill_fname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillFnameSortDirection (boolean ascending) {
    this.BillFnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillFname (CMF.bill_fname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillFnameSortDirection () {
    return this.BillFnameSortAscending;
  }
  /** Set the case insensitive for field: BillFname (CMF.bill_fname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillFnameCaseInsensitive (boolean ascending) {
    this.BillFnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillFname (CMF.bill_fname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillFnameCaseInsensitive () {
    return this.BillFnameCaseInsensitive;
  }
  /** Set the field level filters for field: BillFname (CMF.bill_fname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillFnameFilter (StringFilter[] value) throws ServiceException {
    this.BillFname = value;
  }
  /** Retrieve filter for field: BillFname (CMF.bill_fname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillFnameFilter () {
    return this.BillFname;
  }

  /**
   * Retrieves the BillFnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillFnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillFnameFilter field
   */
  public String[] getBillFnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillFnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillFnameFilter filter value from a formatted string
   *
   * @param _value the BillFnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillFnameFilter filter field
   */
  public void setBillFnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillFnameFilterFromFormattedString");
    try {
      this.setBillFnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillFnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillFnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillMinit (CMF.bill_minit)
   * @param fetch whether to fetch this field or not
   */
  public void setBillMinitFetch (boolean fetch) {
    this.BillMinitFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillMinit (CMF.bill_minit)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillMinitFetch () {
    return this.BillMinitFetch;
  }
  /** Set the SortOrder for field: BillMinit (CMF.bill_minit)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillMinitSortOrder (Integer value) {
    this.BillMinitSort = value;
  }
  /** Retrieve SortOrder for field: BillMinit (CMF.bill_minit)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillMinitSortOrder () {
    return this.BillMinitSort;
  }
  /** Set the sort direction for field: BillMinit (CMF.bill_minit)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillMinitSortDirection (boolean ascending) {
    this.BillMinitSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillMinit (CMF.bill_minit)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillMinitSortDirection () {
    return this.BillMinitSortAscending;
  }
  /** Set the case insensitive for field: BillMinit (CMF.bill_minit)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillMinitCaseInsensitive (boolean ascending) {
    this.BillMinitCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillMinit (CMF.bill_minit)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillMinitCaseInsensitive () {
    return this.BillMinitCaseInsensitive;
  }
  /** Set the field level filters for field: BillMinit (CMF.bill_minit)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillMinitFilter (StringFilter[] value) throws ServiceException {
    this.BillMinit = value;
  }
  /** Retrieve filter for field: BillMinit (CMF.bill_minit)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillMinitFilter () {
    return this.BillMinit;
  }

  /**
   * Retrieves the BillMinitFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillMinitFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillMinitFilter field
   */
  public String[] getBillMinitFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillMinitFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillMinitFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillMinitFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillMinitFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillMinitFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillMinitFilter filter value from a formatted string
   *
   * @param _value the BillMinitFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillMinitFilter filter field
   */
  public void setBillMinitFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillMinitFilterFromFormattedString");
    try {
      this.setBillMinitFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillMinitFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillMinitFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillMinitFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillLname (CMF.bill_lname)
   * @param fetch whether to fetch this field or not
   */
  public void setBillLnameFetch (boolean fetch) {
    this.BillLnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillLname (CMF.bill_lname)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillLnameFetch () {
    return this.BillLnameFetch;
  }
  /** Set the SortOrder for field: BillLname (CMF.bill_lname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillLnameSortOrder (Integer value) {
    this.BillLnameSort = value;
  }
  /** Retrieve SortOrder for field: BillLname (CMF.bill_lname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillLnameSortOrder () {
    return this.BillLnameSort;
  }
  /** Set the sort direction for field: BillLname (CMF.bill_lname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillLnameSortDirection (boolean ascending) {
    this.BillLnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillLname (CMF.bill_lname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillLnameSortDirection () {
    return this.BillLnameSortAscending;
  }
  /** Set the case insensitive for field: BillLname (CMF.bill_lname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillLnameCaseInsensitive (boolean ascending) {
    this.BillLnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillLname (CMF.bill_lname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillLnameCaseInsensitive () {
    return this.BillLnameCaseInsensitive;
  }
  /** Set the field level filters for field: BillLname (CMF.bill_lname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillLnameFilter (StringFilter[] value) throws ServiceException {
    this.BillLname = value;
  }
  /** Retrieve filter for field: BillLname (CMF.bill_lname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillLnameFilter () {
    return this.BillLname;
  }

  /**
   * Retrieves the BillLnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillLnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillLnameFilter field
   */
  public String[] getBillLnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillLnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillLnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillLnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillLnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillLnameFilter filter value from a formatted string
   *
   * @param _value the BillLnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillLnameFilter filter field
   */
  public void setBillLnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillLnameFilterFromFormattedString");
    try {
      this.setBillLnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillLnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillLnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillNameGeneration (CMF.bill_name_generation)
   * @param fetch whether to fetch this field or not
   */
  public void setBillNameGenerationFetch (boolean fetch) {
    this.BillNameGenerationFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillNameGeneration (CMF.bill_name_generation)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillNameGenerationFetch () {
    return this.BillNameGenerationFetch;
  }
  /** Set the SortOrder for field: BillNameGeneration (CMF.bill_name_generation)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillNameGenerationSortOrder (Integer value) {
    this.BillNameGenerationSort = value;
  }
  /** Retrieve SortOrder for field: BillNameGeneration (CMF.bill_name_generation)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillNameGenerationSortOrder () {
    return this.BillNameGenerationSort;
  }
  /** Set the sort direction for field: BillNameGeneration (CMF.bill_name_generation)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillNameGenerationSortDirection (boolean ascending) {
    this.BillNameGenerationSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillNameGeneration (CMF.bill_name_generation)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillNameGenerationSortDirection () {
    return this.BillNameGenerationSortAscending;
  }
  /** Set the case insensitive for field: BillNameGeneration (CMF.bill_name_generation)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillNameGenerationCaseInsensitive (boolean ascending) {
    this.BillNameGenerationCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillNameGeneration (CMF.bill_name_generation)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillNameGenerationCaseInsensitive () {
    return this.BillNameGenerationCaseInsensitive;
  }
  /** Set the field level filters for field: BillNameGeneration (CMF.bill_name_generation)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillNameGenerationFilter (StringFilter[] value) throws ServiceException {
    this.BillNameGeneration = value;
  }
  /** Retrieve filter for field: BillNameGeneration (CMF.bill_name_generation)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillNameGenerationFilter () {
    return this.BillNameGeneration;
  }

  /**
   * Retrieves the BillNameGenerationFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillNameGenerationFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillNameGenerationFilter field
   */
  public String[] getBillNameGenerationFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillNameGenerationFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillNameGenerationFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillNameGenerationFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillNameGenerationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillNameGenerationFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillNameGenerationFilter filter value from a formatted string
   *
   * @param _value the BillNameGenerationFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillNameGenerationFilter filter field
   */
  public void setBillNameGenerationFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillNameGenerationFilterFromFormattedString");
    try {
      this.setBillNameGenerationFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillNameGenerationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillNameGenerationFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillNameGenerationFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillTitle (CMF.bill_title)
   * @param fetch whether to fetch this field or not
   */
  public void setBillTitleFetch (boolean fetch) {
    this.BillTitleFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillTitle (CMF.bill_title)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillTitleFetch () {
    return this.BillTitleFetch;
  }
  /** Set the SortOrder for field: BillTitle (CMF.bill_title)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillTitleSortOrder (Integer value) {
    this.BillTitleSort = value;
  }
  /** Retrieve SortOrder for field: BillTitle (CMF.bill_title)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillTitleSortOrder () {
    return this.BillTitleSort;
  }
  /** Set the sort direction for field: BillTitle (CMF.bill_title)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillTitleSortDirection (boolean ascending) {
    this.BillTitleSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillTitle (CMF.bill_title)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillTitleSortDirection () {
    return this.BillTitleSortAscending;
  }
  /** Set the case insensitive for field: BillTitle (CMF.bill_title)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillTitleCaseInsensitive (boolean ascending) {
    this.BillTitleCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillTitle (CMF.bill_title)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillTitleCaseInsensitive () {
    return this.BillTitleCaseInsensitive;
  }
  /** Set the field level filters for field: BillTitle (CMF.bill_title)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillTitleFilter (StringFilter[] value) throws ServiceException {
    this.BillTitle = value;
  }
  /** Retrieve filter for field: BillTitle (CMF.bill_title)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillTitleFilter () {
    return this.BillTitle;
  }

  /**
   * Retrieves the BillTitleFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillTitleFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillTitleFilter field
   */
  public String[] getBillTitleFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillTitleFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillTitleFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillTitleFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillTitleFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillTitleFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillTitleFilter filter value from a formatted string
   *
   * @param _value the BillTitleFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillTitleFilter filter field
   */
  public void setBillTitleFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillTitleFilterFromFormattedString");
    try {
      this.setBillTitleFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillTitleFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillTitleFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillTitleFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillCompany (CMF.bill_company)
   * @param fetch whether to fetch this field or not
   */
  public void setBillCompanyFetch (boolean fetch) {
    this.BillCompanyFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillCompany (CMF.bill_company)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillCompanyFetch () {
    return this.BillCompanyFetch;
  }
  /** Set the SortOrder for field: BillCompany (CMF.bill_company)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillCompanySortOrder (Integer value) {
    this.BillCompanySort = value;
  }
  /** Retrieve SortOrder for field: BillCompany (CMF.bill_company)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillCompanySortOrder () {
    return this.BillCompanySort;
  }
  /** Set the sort direction for field: BillCompany (CMF.bill_company)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillCompanySortDirection (boolean ascending) {
    this.BillCompanySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillCompany (CMF.bill_company)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillCompanySortDirection () {
    return this.BillCompanySortAscending;
  }
  /** Set the case insensitive for field: BillCompany (CMF.bill_company)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillCompanyCaseInsensitive (boolean ascending) {
    this.BillCompanyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillCompany (CMF.bill_company)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillCompanyCaseInsensitive () {
    return this.BillCompanyCaseInsensitive;
  }
  /** Set the field level filters for field: BillCompany (CMF.bill_company)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillCompanyFilter (StringFilter[] value) throws ServiceException {
    this.BillCompany = value;
  }
  /** Retrieve filter for field: BillCompany (CMF.bill_company)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillCompanyFilter () {
    return this.BillCompany;
  }

  /**
   * Retrieves the BillCompanyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillCompanyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCompanyFilter field
   */
  public String[] getBillCompanyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCompanyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillCompanyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCompanyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCompanyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCompanyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillCompanyFilter filter value from a formatted string
   *
   * @param _value the BillCompanyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillCompanyFilter filter field
   */
  public void setBillCompanyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillCompanyFilterFromFormattedString");
    try {
      this.setBillCompanyFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCompanyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCompanyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCompanyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustAddress1 (CMF.cust_address1)
   * @param fetch whether to fetch this field or not
   */
  public void setCustAddress1Fetch (boolean fetch) {
    this.CustAddress1Fetch = fetch;
  }
  /** Retrieve Fetch value for field: CustAddress1 (CMF.cust_address1)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustAddress1Fetch () {
    return this.CustAddress1Fetch;
  }
  /** Set the SortOrder for field: CustAddress1 (CMF.cust_address1)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustAddress1SortOrder (Integer value) {
    this.CustAddress1Sort = value;
  }
  /** Retrieve SortOrder for field: CustAddress1 (CMF.cust_address1)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustAddress1SortOrder () {
    return this.CustAddress1Sort;
  }
  /** Set the sort direction for field: CustAddress1 (CMF.cust_address1)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustAddress1SortDirection (boolean ascending) {
    this.CustAddress1SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustAddress1 (CMF.cust_address1)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustAddress1SortDirection () {
    return this.CustAddress1SortAscending;
  }
  /** Set the case insensitive for field: CustAddress1 (CMF.cust_address1)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustAddress1CaseInsensitive (boolean ascending) {
    this.CustAddress1CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustAddress1 (CMF.cust_address1)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustAddress1CaseInsensitive () {
    return this.CustAddress1CaseInsensitive;
  }
  /** Set the field level filters for field: CustAddress1 (CMF.cust_address1)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustAddress1Filter (StringFilter[] value) throws ServiceException {
    this.CustAddress1 = value;
  }
  /** Retrieve filter for field: CustAddress1 (CMF.cust_address1)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustAddress1Filter () {
    return this.CustAddress1;
  }

  /**
   * Retrieves the CustAddress1Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustAddress1Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustAddress1Filter field
   */
  public String[] getCustAddress1FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustAddress1FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustAddress1Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustAddress1FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustAddress1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustAddress1FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustAddress1Filter filter value from a formatted string
   *
   * @param _value the CustAddress1Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustAddress1Filter filter field
   */
  public void setCustAddress1FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustAddress1FilterFromFormattedString");
    try {
      this.setCustAddress1Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustAddress1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustAddress1FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustAddress1FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustAddress2 (CMF.cust_address2)
   * @param fetch whether to fetch this field or not
   */
  public void setCustAddress2Fetch (boolean fetch) {
    this.CustAddress2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: CustAddress2 (CMF.cust_address2)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustAddress2Fetch () {
    return this.CustAddress2Fetch;
  }
  /** Set the SortOrder for field: CustAddress2 (CMF.cust_address2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustAddress2SortOrder (Integer value) {
    this.CustAddress2Sort = value;
  }
  /** Retrieve SortOrder for field: CustAddress2 (CMF.cust_address2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustAddress2SortOrder () {
    return this.CustAddress2Sort;
  }
  /** Set the sort direction for field: CustAddress2 (CMF.cust_address2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustAddress2SortDirection (boolean ascending) {
    this.CustAddress2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustAddress2 (CMF.cust_address2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustAddress2SortDirection () {
    return this.CustAddress2SortAscending;
  }
  /** Set the case insensitive for field: CustAddress2 (CMF.cust_address2)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustAddress2CaseInsensitive (boolean ascending) {
    this.CustAddress2CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustAddress2 (CMF.cust_address2)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustAddress2CaseInsensitive () {
    return this.CustAddress2CaseInsensitive;
  }
  /** Set the field level filters for field: CustAddress2 (CMF.cust_address2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustAddress2Filter (StringFilter[] value) throws ServiceException {
    this.CustAddress2 = value;
  }
  /** Retrieve filter for field: CustAddress2 (CMF.cust_address2)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustAddress2Filter () {
    return this.CustAddress2;
  }

  /**
   * Retrieves the CustAddress2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustAddress2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustAddress2Filter field
   */
  public String[] getCustAddress2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustAddress2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustAddress2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustAddress2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustAddress2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustAddress2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustAddress2Filter filter value from a formatted string
   *
   * @param _value the CustAddress2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustAddress2Filter filter field
   */
  public void setCustAddress2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustAddress2FilterFromFormattedString");
    try {
      this.setCustAddress2Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustAddress2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustAddress2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustAddress2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustAddress3 (CMF.cust_address3)
   * @param fetch whether to fetch this field or not
   */
  public void setCustAddress3Fetch (boolean fetch) {
    this.CustAddress3Fetch = fetch;
  }
  /** Retrieve Fetch value for field: CustAddress3 (CMF.cust_address3)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustAddress3Fetch () {
    return this.CustAddress3Fetch;
  }
  /** Set the SortOrder for field: CustAddress3 (CMF.cust_address3)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustAddress3SortOrder (Integer value) {
    this.CustAddress3Sort = value;
  }
  /** Retrieve SortOrder for field: CustAddress3 (CMF.cust_address3)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustAddress3SortOrder () {
    return this.CustAddress3Sort;
  }
  /** Set the sort direction for field: CustAddress3 (CMF.cust_address3)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustAddress3SortDirection (boolean ascending) {
    this.CustAddress3SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustAddress3 (CMF.cust_address3)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustAddress3SortDirection () {
    return this.CustAddress3SortAscending;
  }
  /** Set the case insensitive for field: CustAddress3 (CMF.cust_address3)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustAddress3CaseInsensitive (boolean ascending) {
    this.CustAddress3CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustAddress3 (CMF.cust_address3)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustAddress3CaseInsensitive () {
    return this.CustAddress3CaseInsensitive;
  }
  /** Set the field level filters for field: CustAddress3 (CMF.cust_address3)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustAddress3Filter (StringFilter[] value) throws ServiceException {
    this.CustAddress3 = value;
  }
  /** Retrieve filter for field: CustAddress3 (CMF.cust_address3)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustAddress3Filter () {
    return this.CustAddress3;
  }

  /**
   * Retrieves the CustAddress3Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustAddress3Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustAddress3Filter field
   */
  public String[] getCustAddress3FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustAddress3FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustAddress3Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustAddress3FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustAddress3Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustAddress3FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustAddress3Filter filter value from a formatted string
   *
   * @param _value the CustAddress3Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustAddress3Filter filter field
   */
  public void setCustAddress3FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustAddress3FilterFromFormattedString");
    try {
      this.setCustAddress3Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustAddress3Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustAddress3FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustAddress3FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustCity (CMF.cust_city)
   * @param fetch whether to fetch this field or not
   */
  public void setCustCityFetch (boolean fetch) {
    this.CustCityFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustCity (CMF.cust_city)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustCityFetch () {
    return this.CustCityFetch;
  }
  /** Set the SortOrder for field: CustCity (CMF.cust_city)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustCitySortOrder (Integer value) {
    this.CustCitySort = value;
  }
  /** Retrieve SortOrder for field: CustCity (CMF.cust_city)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustCitySortOrder () {
    return this.CustCitySort;
  }
  /** Set the sort direction for field: CustCity (CMF.cust_city)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustCitySortDirection (boolean ascending) {
    this.CustCitySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustCity (CMF.cust_city)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustCitySortDirection () {
    return this.CustCitySortAscending;
  }
  /** Set the case insensitive for field: CustCity (CMF.cust_city)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustCityCaseInsensitive (boolean ascending) {
    this.CustCityCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustCity (CMF.cust_city)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustCityCaseInsensitive () {
    return this.CustCityCaseInsensitive;
  }
  /** Set the field level filters for field: CustCity (CMF.cust_city)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustCityFilter (StringFilter[] value) throws ServiceException {
    this.CustCity = value;
  }
  /** Retrieve filter for field: CustCity (CMF.cust_city)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustCityFilter () {
    return this.CustCity;
  }

  /**
   * Retrieves the CustCityFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustCityFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustCityFilter field
   */
  public String[] getCustCityFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustCityFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustCityFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustCityFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustCityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustCityFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustCityFilter filter value from a formatted string
   *
   * @param _value the CustCityFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustCityFilter filter field
   */
  public void setCustCityFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustCityFilterFromFormattedString");
    try {
      this.setCustCityFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustCityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustCityFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustCityFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustState (CMF.cust_state)
   * @param fetch whether to fetch this field or not
   */
  public void setCustStateFetch (boolean fetch) {
    this.CustStateFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustState (CMF.cust_state)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustStateFetch () {
    return this.CustStateFetch;
  }
  /** Set the SortOrder for field: CustState (CMF.cust_state)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustStateSortOrder (Integer value) {
    this.CustStateSort = value;
  }
  /** Retrieve SortOrder for field: CustState (CMF.cust_state)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustStateSortOrder () {
    return this.CustStateSort;
  }
  /** Set the sort direction for field: CustState (CMF.cust_state)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustStateSortDirection (boolean ascending) {
    this.CustStateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustState (CMF.cust_state)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustStateSortDirection () {
    return this.CustStateSortAscending;
  }
  /** Set the case insensitive for field: CustState (CMF.cust_state)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustStateCaseInsensitive (boolean ascending) {
    this.CustStateCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustState (CMF.cust_state)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustStateCaseInsensitive () {
    return this.CustStateCaseInsensitive;
  }
  /** Set the field level filters for field: CustState (CMF.cust_state)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustStateFilter (StringFilter[] value) throws ServiceException {
    this.CustState = value;
  }
  /** Retrieve filter for field: CustState (CMF.cust_state)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustStateFilter () {
    return this.CustState;
  }

  /**
   * Retrieves the CustStateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustStateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustStateFilter field
   */
  public String[] getCustStateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustStateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustStateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustStateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustStateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustStateFilter filter value from a formatted string
   *
   * @param _value the CustStateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustStateFilter filter field
   */
  public void setCustStateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustStateFilterFromFormattedString");
    try {
      this.setCustStateFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustStateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustStateFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated CustStateFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CustStateFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CustStateFilter filter field
   */
  public String[] getCustStateFilterDisplayValue(Locale _locale, IntegerEquals CountryCode) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustStateFilterDisplayValue");
    EnumerationFilter enumFilter = new EnumerationFilter();
    enumFilter.addFilterCondition("CountryCode", CountryCode);

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getCustStateFilter(), "StateProvince", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustStateFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustStateFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated CustStateFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the CustStateFilter filter field
   */
  public void setCustStateFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale, IntegerEquals CountryCode) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustStateFilterFromDisplayValue");
    EnumerationFilter enumFilter = new EnumerationFilter();
    enumFilter.addFilterCondition("CountryCode", CountryCode);

    try {
      this.setCustStateFilter((StringFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "CustState", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustStateFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustStateFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: CustZip (CMF.cust_zip)
   * @param fetch whether to fetch this field or not
   */
  public void setCustZipFetch (boolean fetch) {
    this.CustZipFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustZip (CMF.cust_zip)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustZipFetch () {
    return this.CustZipFetch;
  }
  /** Set the SortOrder for field: CustZip (CMF.cust_zip)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustZipSortOrder (Integer value) {
    this.CustZipSort = value;
  }
  /** Retrieve SortOrder for field: CustZip (CMF.cust_zip)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustZipSortOrder () {
    return this.CustZipSort;
  }
  /** Set the sort direction for field: CustZip (CMF.cust_zip)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustZipSortDirection (boolean ascending) {
    this.CustZipSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustZip (CMF.cust_zip)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustZipSortDirection () {
    return this.CustZipSortAscending;
  }
  /** Set the case insensitive for field: CustZip (CMF.cust_zip)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustZipCaseInsensitive (boolean ascending) {
    this.CustZipCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustZip (CMF.cust_zip)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustZipCaseInsensitive () {
    return this.CustZipCaseInsensitive;
  }
  /** Set the field level filters for field: CustZip (CMF.cust_zip)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustZipFilter (StringFilter[] value) throws ServiceException {
    this.CustZip = value;
  }
  /** Retrieve filter for field: CustZip (CMF.cust_zip)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustZipFilter () {
    return this.CustZip;
  }

  /**
   * Retrieves the CustZipFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustZipFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustZipFilter field
   */
  public String[] getCustZipFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustZipFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustZipFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustZipFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustZipFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustZipFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustZipFilter filter value from a formatted string
   *
   * @param _value the CustZipFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustZipFilter filter field
   */
  public void setCustZipFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustZipFilterFromFormattedString");
    try {
      this.setCustZipFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustZipFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustZipFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustZipFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustCountryCode (CMF.cust_country_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCustCountryCodeFetch (boolean fetch) {
    this.CustCountryCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustCountryCode (CMF.cust_country_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustCountryCodeFetch () {
    return this.CustCountryCodeFetch;
  }
  /** Set the SortOrder for field: CustCountryCode (CMF.cust_country_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustCountryCodeSortOrder (Integer value) {
    this.CustCountryCodeSort = value;
  }
  /** Retrieve SortOrder for field: CustCountryCode (CMF.cust_country_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustCountryCodeSortOrder () {
    return this.CustCountryCodeSort;
  }
  /** Set the sort direction for field: CustCountryCode (CMF.cust_country_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustCountryCodeSortDirection (boolean ascending) {
    this.CustCountryCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustCountryCode (CMF.cust_country_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustCountryCodeSortDirection () {
    return this.CustCountryCodeSortAscending;
  }
  /** Set the field level filters for field: CustCountryCode (CMF.cust_country_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustCountryCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CustCountryCode = value;
  }
  /** Retrieve filter for field: CustCountryCode (CMF.cust_country_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCustCountryCodeFilter () {
    return this.CustCountryCode;
  }

  /**
   * Retrieves the CustCountryCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustCountryCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustCountryCodeFilter field
   */
  public String[] getCustCountryCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustCountryCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustCountryCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustCountryCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustCountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustCountryCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustCountryCodeFilter filter value from a formatted string
   *
   * @param _value the CustCountryCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustCountryCodeFilter filter field
   */
  public void setCustCountryCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustCountryCodeFilterFromFormattedString");
    try {
      this.setCustCountryCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustCountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustCountryCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustCountryCodeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated CustCountryCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CustCountryCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CustCountryCodeFilter filter field
   */
  public String[] getCustCountryCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustCountryCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getCustCountryCodeFilter(), "CountryCode", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustCountryCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustCountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustCountryCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated CustCountryCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the CustCountryCodeFilter filter field
   */
  public void setCustCountryCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustCountryCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setCustCountryCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "CustCountryCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustCountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustCountryCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustCountryCodeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: CustFranchiseTaxCode (CMF.cust_franchise_tax_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCustFranchiseTaxCodeFetch (boolean fetch) {
    this.CustFranchiseTaxCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustFranchiseTaxCode (CMF.cust_franchise_tax_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustFranchiseTaxCodeFetch () {
    return this.CustFranchiseTaxCodeFetch;
  }
  /** Set the SortOrder for field: CustFranchiseTaxCode (CMF.cust_franchise_tax_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustFranchiseTaxCodeSortOrder (Integer value) {
    this.CustFranchiseTaxCodeSort = value;
  }
  /** Retrieve SortOrder for field: CustFranchiseTaxCode (CMF.cust_franchise_tax_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustFranchiseTaxCodeSortOrder () {
    return this.CustFranchiseTaxCodeSort;
  }
  /** Set the sort direction for field: CustFranchiseTaxCode (CMF.cust_franchise_tax_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustFranchiseTaxCodeSortDirection (boolean ascending) {
    this.CustFranchiseTaxCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustFranchiseTaxCode (CMF.cust_franchise_tax_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustFranchiseTaxCodeSortDirection () {
    return this.CustFranchiseTaxCodeSortAscending;
  }
  /** Set the field level filters for field: CustFranchiseTaxCode (CMF.cust_franchise_tax_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustFranchiseTaxCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CustFranchiseTaxCode = value;
  }
  /** Retrieve filter for field: CustFranchiseTaxCode (CMF.cust_franchise_tax_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCustFranchiseTaxCodeFilter () {
    return this.CustFranchiseTaxCode;
  }

  /**
   * Retrieves the CustFranchiseTaxCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustFranchiseTaxCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustFranchiseTaxCodeFilter field
   */
  public String[] getCustFranchiseTaxCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustFranchiseTaxCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustFranchiseTaxCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustFranchiseTaxCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustFranchiseTaxCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustFranchiseTaxCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustFranchiseTaxCodeFilter filter value from a formatted string
   *
   * @param _value the CustFranchiseTaxCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustFranchiseTaxCodeFilter filter field
   */
  public void setCustFranchiseTaxCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustFranchiseTaxCodeFilterFromFormattedString");
    try {
      this.setCustFranchiseTaxCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustFranchiseTaxCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustFranchiseTaxCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustFranchiseTaxCodeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated CustFranchiseTaxCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CustFranchiseTaxCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CustFranchiseTaxCodeFilter filter field
   */
  public String[] getCustFranchiseTaxCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustFranchiseTaxCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getCustFranchiseTaxCodeFilter(), "FranchiseCode", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustFranchiseTaxCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustFranchiseTaxCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustFranchiseTaxCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated CustFranchiseTaxCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the CustFranchiseTaxCodeFilter filter field
   */
  public void setCustFranchiseTaxCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustFranchiseTaxCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setCustFranchiseTaxCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "CustFranchiseTaxCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustFranchiseTaxCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustFranchiseTaxCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustFranchiseTaxCodeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: CustGeocode (CMF.cust_geocode)
   * @param fetch whether to fetch this field or not
   */
  public void setCustGeocodeFetch (boolean fetch) {
    this.CustGeocodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustGeocode (CMF.cust_geocode)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustGeocodeFetch () {
    return this.CustGeocodeFetch;
  }
  /** Set the SortOrder for field: CustGeocode (CMF.cust_geocode)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustGeocodeSortOrder (Integer value) {
    this.CustGeocodeSort = value;
  }
  /** Retrieve SortOrder for field: CustGeocode (CMF.cust_geocode)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustGeocodeSortOrder () {
    return this.CustGeocodeSort;
  }
  /** Set the sort direction for field: CustGeocode (CMF.cust_geocode)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustGeocodeSortDirection (boolean ascending) {
    this.CustGeocodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustGeocode (CMF.cust_geocode)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustGeocodeSortDirection () {
    return this.CustGeocodeSortAscending;
  }
  /** Set the case insensitive for field: CustGeocode (CMF.cust_geocode)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustGeocodeCaseInsensitive (boolean ascending) {
    this.CustGeocodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustGeocode (CMF.cust_geocode)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustGeocodeCaseInsensitive () {
    return this.CustGeocodeCaseInsensitive;
  }
  /** Set the field level filters for field: CustGeocode (CMF.cust_geocode)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustGeocodeFilter (StringFilter[] value) throws ServiceException {
    this.CustGeocode = value;
  }
  /** Retrieve filter for field: CustGeocode (CMF.cust_geocode)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustGeocodeFilter () {
    return this.CustGeocode;
  }

  /**
   * Retrieves the CustGeocodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustGeocodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustGeocodeFilter field
   */
  public String[] getCustGeocodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustGeocodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustGeocodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustGeocodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustGeocodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustGeocodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustGeocodeFilter filter value from a formatted string
   *
   * @param _value the CustGeocodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustGeocodeFilter filter field
   */
  public void setCustGeocodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustGeocodeFilterFromFormattedString");
    try {
      this.setCustGeocodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustGeocodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustGeocodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustGeocodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustCounty (CMF.cust_county)
   * @param fetch whether to fetch this field or not
   */
  public void setCustCountyFetch (boolean fetch) {
    this.CustCountyFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustCounty (CMF.cust_county)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustCountyFetch () {
    return this.CustCountyFetch;
  }
  /** Set the SortOrder for field: CustCounty (CMF.cust_county)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustCountySortOrder (Integer value) {
    this.CustCountySort = value;
  }
  /** Retrieve SortOrder for field: CustCounty (CMF.cust_county)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustCountySortOrder () {
    return this.CustCountySort;
  }
  /** Set the sort direction for field: CustCounty (CMF.cust_county)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustCountySortDirection (boolean ascending) {
    this.CustCountySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustCounty (CMF.cust_county)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustCountySortDirection () {
    return this.CustCountySortAscending;
  }
  /** Set the case insensitive for field: CustCounty (CMF.cust_county)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustCountyCaseInsensitive (boolean ascending) {
    this.CustCountyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustCounty (CMF.cust_county)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustCountyCaseInsensitive () {
    return this.CustCountyCaseInsensitive;
  }
  /** Set the field level filters for field: CustCounty (CMF.cust_county)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustCountyFilter (StringFilter[] value) throws ServiceException {
    this.CustCounty = value;
  }
  /** Retrieve filter for field: CustCounty (CMF.cust_county)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustCountyFilter () {
    return this.CustCounty;
  }

  /**
   * Retrieves the CustCountyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustCountyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustCountyFilter field
   */
  public String[] getCustCountyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustCountyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustCountyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustCountyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustCountyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustCountyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustCountyFilter filter value from a formatted string
   *
   * @param _value the CustCountyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustCountyFilter filter field
   */
  public void setCustCountyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustCountyFilterFromFormattedString");
    try {
      this.setCustCountyFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustCountyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustCountyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustCountyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustPhone1 (CMF.cust_phone1)
   * @param fetch whether to fetch this field or not
   */
  public void setCustPhone1Fetch (boolean fetch) {
    this.CustPhone1Fetch = fetch;
  }
  /** Retrieve Fetch value for field: CustPhone1 (CMF.cust_phone1)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustPhone1Fetch () {
    return this.CustPhone1Fetch;
  }
  /** Set the SortOrder for field: CustPhone1 (CMF.cust_phone1)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustPhone1SortOrder (Integer value) {
    this.CustPhone1Sort = value;
  }
  /** Retrieve SortOrder for field: CustPhone1 (CMF.cust_phone1)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustPhone1SortOrder () {
    return this.CustPhone1Sort;
  }
  /** Set the sort direction for field: CustPhone1 (CMF.cust_phone1)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustPhone1SortDirection (boolean ascending) {
    this.CustPhone1SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustPhone1 (CMF.cust_phone1)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustPhone1SortDirection () {
    return this.CustPhone1SortAscending;
  }
  /** Set the case insensitive for field: CustPhone1 (CMF.cust_phone1)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustPhone1CaseInsensitive (boolean ascending) {
    this.CustPhone1CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustPhone1 (CMF.cust_phone1)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustPhone1CaseInsensitive () {
    return this.CustPhone1CaseInsensitive;
  }
  /** Set the field level filters for field: CustPhone1 (CMF.cust_phone1)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustPhone1Filter (StringFilter[] value) throws ServiceException {
    this.CustPhone1 = value;
  }
  /** Retrieve filter for field: CustPhone1 (CMF.cust_phone1)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustPhone1Filter () {
    return this.CustPhone1;
  }

  /**
   * Retrieves the CustPhone1Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustPhone1Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustPhone1Filter field
   */
  public String[] getCustPhone1FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustPhone1FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustPhone1Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustPhone1FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustPhone1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustPhone1FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustPhone1Filter filter value from a formatted string
   *
   * @param _value the CustPhone1Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustPhone1Filter filter field
   */
  public void setCustPhone1FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustPhone1FilterFromFormattedString");
    try {
      this.setCustPhone1Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustPhone1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustPhone1FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustPhone1FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustPhone2 (CMF.cust_phone2)
   * @param fetch whether to fetch this field or not
   */
  public void setCustPhone2Fetch (boolean fetch) {
    this.CustPhone2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: CustPhone2 (CMF.cust_phone2)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustPhone2Fetch () {
    return this.CustPhone2Fetch;
  }
  /** Set the SortOrder for field: CustPhone2 (CMF.cust_phone2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustPhone2SortOrder (Integer value) {
    this.CustPhone2Sort = value;
  }
  /** Retrieve SortOrder for field: CustPhone2 (CMF.cust_phone2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustPhone2SortOrder () {
    return this.CustPhone2Sort;
  }
  /** Set the sort direction for field: CustPhone2 (CMF.cust_phone2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustPhone2SortDirection (boolean ascending) {
    this.CustPhone2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustPhone2 (CMF.cust_phone2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustPhone2SortDirection () {
    return this.CustPhone2SortAscending;
  }
  /** Set the case insensitive for field: CustPhone2 (CMF.cust_phone2)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustPhone2CaseInsensitive (boolean ascending) {
    this.CustPhone2CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustPhone2 (CMF.cust_phone2)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustPhone2CaseInsensitive () {
    return this.CustPhone2CaseInsensitive;
  }
  /** Set the field level filters for field: CustPhone2 (CMF.cust_phone2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustPhone2Filter (StringFilter[] value) throws ServiceException {
    this.CustPhone2 = value;
  }
  /** Retrieve filter for field: CustPhone2 (CMF.cust_phone2)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustPhone2Filter () {
    return this.CustPhone2;
  }

  /**
   * Retrieves the CustPhone2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustPhone2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustPhone2Filter field
   */
  public String[] getCustPhone2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustPhone2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustPhone2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustPhone2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustPhone2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustPhone2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustPhone2Filter filter value from a formatted string
   *
   * @param _value the CustPhone2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustPhone2Filter filter field
   */
  public void setCustPhone2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustPhone2FilterFromFormattedString");
    try {
      this.setCustPhone2Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustPhone2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustPhone2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustPhone2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillAddress1 (CMF.bill_address1)
   * @param fetch whether to fetch this field or not
   */
  public void setBillAddress1Fetch (boolean fetch) {
    this.BillAddress1Fetch = fetch;
  }
  /** Retrieve Fetch value for field: BillAddress1 (CMF.bill_address1)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillAddress1Fetch () {
    return this.BillAddress1Fetch;
  }
  /** Set the SortOrder for field: BillAddress1 (CMF.bill_address1)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillAddress1SortOrder (Integer value) {
    this.BillAddress1Sort = value;
  }
  /** Retrieve SortOrder for field: BillAddress1 (CMF.bill_address1)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillAddress1SortOrder () {
    return this.BillAddress1Sort;
  }
  /** Set the sort direction for field: BillAddress1 (CMF.bill_address1)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillAddress1SortDirection (boolean ascending) {
    this.BillAddress1SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillAddress1 (CMF.bill_address1)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillAddress1SortDirection () {
    return this.BillAddress1SortAscending;
  }
  /** Set the case insensitive for field: BillAddress1 (CMF.bill_address1)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillAddress1CaseInsensitive (boolean ascending) {
    this.BillAddress1CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillAddress1 (CMF.bill_address1)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillAddress1CaseInsensitive () {
    return this.BillAddress1CaseInsensitive;
  }
  /** Set the field level filters for field: BillAddress1 (CMF.bill_address1)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillAddress1Filter (StringFilter[] value) throws ServiceException {
    this.BillAddress1 = value;
  }
  /** Retrieve filter for field: BillAddress1 (CMF.bill_address1)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillAddress1Filter () {
    return this.BillAddress1;
  }

  /**
   * Retrieves the BillAddress1Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillAddress1Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillAddress1Filter field
   */
  public String[] getBillAddress1FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillAddress1FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillAddress1Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillAddress1FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillAddress1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillAddress1FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillAddress1Filter filter value from a formatted string
   *
   * @param _value the BillAddress1Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillAddress1Filter filter field
   */
  public void setBillAddress1FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillAddress1FilterFromFormattedString");
    try {
      this.setBillAddress1Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillAddress1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillAddress1FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillAddress1FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillAddress2 (CMF.bill_address2)
   * @param fetch whether to fetch this field or not
   */
  public void setBillAddress2Fetch (boolean fetch) {
    this.BillAddress2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: BillAddress2 (CMF.bill_address2)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillAddress2Fetch () {
    return this.BillAddress2Fetch;
  }
  /** Set the SortOrder for field: BillAddress2 (CMF.bill_address2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillAddress2SortOrder (Integer value) {
    this.BillAddress2Sort = value;
  }
  /** Retrieve SortOrder for field: BillAddress2 (CMF.bill_address2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillAddress2SortOrder () {
    return this.BillAddress2Sort;
  }
  /** Set the sort direction for field: BillAddress2 (CMF.bill_address2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillAddress2SortDirection (boolean ascending) {
    this.BillAddress2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillAddress2 (CMF.bill_address2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillAddress2SortDirection () {
    return this.BillAddress2SortAscending;
  }
  /** Set the case insensitive for field: BillAddress2 (CMF.bill_address2)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillAddress2CaseInsensitive (boolean ascending) {
    this.BillAddress2CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillAddress2 (CMF.bill_address2)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillAddress2CaseInsensitive () {
    return this.BillAddress2CaseInsensitive;
  }
  /** Set the field level filters for field: BillAddress2 (CMF.bill_address2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillAddress2Filter (StringFilter[] value) throws ServiceException {
    this.BillAddress2 = value;
  }
  /** Retrieve filter for field: BillAddress2 (CMF.bill_address2)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillAddress2Filter () {
    return this.BillAddress2;
  }

  /**
   * Retrieves the BillAddress2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillAddress2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillAddress2Filter field
   */
  public String[] getBillAddress2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillAddress2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillAddress2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillAddress2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillAddress2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillAddress2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillAddress2Filter filter value from a formatted string
   *
   * @param _value the BillAddress2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillAddress2Filter filter field
   */
  public void setBillAddress2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillAddress2FilterFromFormattedString");
    try {
      this.setBillAddress2Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillAddress2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillAddress2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillAddress2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillAddress3 (CMF.bill_address3)
   * @param fetch whether to fetch this field or not
   */
  public void setBillAddress3Fetch (boolean fetch) {
    this.BillAddress3Fetch = fetch;
  }
  /** Retrieve Fetch value for field: BillAddress3 (CMF.bill_address3)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillAddress3Fetch () {
    return this.BillAddress3Fetch;
  }
  /** Set the SortOrder for field: BillAddress3 (CMF.bill_address3)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillAddress3SortOrder (Integer value) {
    this.BillAddress3Sort = value;
  }
  /** Retrieve SortOrder for field: BillAddress3 (CMF.bill_address3)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillAddress3SortOrder () {
    return this.BillAddress3Sort;
  }
  /** Set the sort direction for field: BillAddress3 (CMF.bill_address3)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillAddress3SortDirection (boolean ascending) {
    this.BillAddress3SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillAddress3 (CMF.bill_address3)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillAddress3SortDirection () {
    return this.BillAddress3SortAscending;
  }
  /** Set the case insensitive for field: BillAddress3 (CMF.bill_address3)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillAddress3CaseInsensitive (boolean ascending) {
    this.BillAddress3CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillAddress3 (CMF.bill_address3)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillAddress3CaseInsensitive () {
    return this.BillAddress3CaseInsensitive;
  }
  /** Set the field level filters for field: BillAddress3 (CMF.bill_address3)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillAddress3Filter (StringFilter[] value) throws ServiceException {
    this.BillAddress3 = value;
  }
  /** Retrieve filter for field: BillAddress3 (CMF.bill_address3)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillAddress3Filter () {
    return this.BillAddress3;
  }

  /**
   * Retrieves the BillAddress3Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillAddress3Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillAddress3Filter field
   */
  public String[] getBillAddress3FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillAddress3FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillAddress3Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillAddress3FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillAddress3Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillAddress3FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillAddress3Filter filter value from a formatted string
   *
   * @param _value the BillAddress3Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillAddress3Filter filter field
   */
  public void setBillAddress3FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillAddress3FilterFromFormattedString");
    try {
      this.setBillAddress3Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillAddress3Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillAddress3FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillAddress3FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillCity (CMF.bill_city)
   * @param fetch whether to fetch this field or not
   */
  public void setBillCityFetch (boolean fetch) {
    this.BillCityFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillCity (CMF.bill_city)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillCityFetch () {
    return this.BillCityFetch;
  }
  /** Set the SortOrder for field: BillCity (CMF.bill_city)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillCitySortOrder (Integer value) {
    this.BillCitySort = value;
  }
  /** Retrieve SortOrder for field: BillCity (CMF.bill_city)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillCitySortOrder () {
    return this.BillCitySort;
  }
  /** Set the sort direction for field: BillCity (CMF.bill_city)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillCitySortDirection (boolean ascending) {
    this.BillCitySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillCity (CMF.bill_city)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillCitySortDirection () {
    return this.BillCitySortAscending;
  }
  /** Set the case insensitive for field: BillCity (CMF.bill_city)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillCityCaseInsensitive (boolean ascending) {
    this.BillCityCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillCity (CMF.bill_city)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillCityCaseInsensitive () {
    return this.BillCityCaseInsensitive;
  }
  /** Set the field level filters for field: BillCity (CMF.bill_city)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillCityFilter (StringFilter[] value) throws ServiceException {
    this.BillCity = value;
  }
  /** Retrieve filter for field: BillCity (CMF.bill_city)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillCityFilter () {
    return this.BillCity;
  }

  /**
   * Retrieves the BillCityFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillCityFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCityFilter field
   */
  public String[] getBillCityFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCityFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillCityFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCityFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCityFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillCityFilter filter value from a formatted string
   *
   * @param _value the BillCityFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillCityFilter filter field
   */
  public void setBillCityFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillCityFilterFromFormattedString");
    try {
      this.setBillCityFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCityFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCityFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillState (CMF.bill_state)
   * @param fetch whether to fetch this field or not
   */
  public void setBillStateFetch (boolean fetch) {
    this.BillStateFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillState (CMF.bill_state)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillStateFetch () {
    return this.BillStateFetch;
  }
  /** Set the SortOrder for field: BillState (CMF.bill_state)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillStateSortOrder (Integer value) {
    this.BillStateSort = value;
  }
  /** Retrieve SortOrder for field: BillState (CMF.bill_state)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillStateSortOrder () {
    return this.BillStateSort;
  }
  /** Set the sort direction for field: BillState (CMF.bill_state)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillStateSortDirection (boolean ascending) {
    this.BillStateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillState (CMF.bill_state)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillStateSortDirection () {
    return this.BillStateSortAscending;
  }
  /** Set the case insensitive for field: BillState (CMF.bill_state)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillStateCaseInsensitive (boolean ascending) {
    this.BillStateCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillState (CMF.bill_state)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillStateCaseInsensitive () {
    return this.BillStateCaseInsensitive;
  }
  /** Set the field level filters for field: BillState (CMF.bill_state)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillStateFilter (StringFilter[] value) throws ServiceException {
    this.BillState = value;
  }
  /** Retrieve filter for field: BillState (CMF.bill_state)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillStateFilter () {
    return this.BillState;
  }

  /**
   * Retrieves the BillStateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillStateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillStateFilter field
   */
  public String[] getBillStateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillStateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillStateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillStateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillStateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillStateFilter filter value from a formatted string
   *
   * @param _value the BillStateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillStateFilter filter field
   */
  public void setBillStateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillStateFilterFromFormattedString");
    try {
      this.setBillStateFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillStateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillStateFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated BillStateFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillStateFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillStateFilter filter field
   */
  public String[] getBillStateFilterDisplayValue(Locale _locale, IntegerEquals CountryCode) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillStateFilterDisplayValue");
    EnumerationFilter enumFilter = new EnumerationFilter();
    enumFilter.addFilterCondition("CountryCode", CountryCode);

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getBillStateFilter(), "StateProvince", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillStateFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillStateFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated BillStateFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BillStateFilter filter field
   */
  public void setBillStateFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale, IntegerEquals CountryCode) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillStateFilterFromDisplayValue");
    EnumerationFilter enumFilter = new EnumerationFilter();
    enumFilter.addFilterCondition("CountryCode", CountryCode);

    try {
      this.setBillStateFilter((StringFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "BillState", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillStateFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillStateFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: BillZip (CMF.bill_zip)
   * @param fetch whether to fetch this field or not
   */
  public void setBillZipFetch (boolean fetch) {
    this.BillZipFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillZip (CMF.bill_zip)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillZipFetch () {
    return this.BillZipFetch;
  }
  /** Set the SortOrder for field: BillZip (CMF.bill_zip)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillZipSortOrder (Integer value) {
    this.BillZipSort = value;
  }
  /** Retrieve SortOrder for field: BillZip (CMF.bill_zip)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillZipSortOrder () {
    return this.BillZipSort;
  }
  /** Set the sort direction for field: BillZip (CMF.bill_zip)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillZipSortDirection (boolean ascending) {
    this.BillZipSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillZip (CMF.bill_zip)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillZipSortDirection () {
    return this.BillZipSortAscending;
  }
  /** Set the case insensitive for field: BillZip (CMF.bill_zip)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillZipCaseInsensitive (boolean ascending) {
    this.BillZipCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillZip (CMF.bill_zip)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillZipCaseInsensitive () {
    return this.BillZipCaseInsensitive;
  }
  /** Set the field level filters for field: BillZip (CMF.bill_zip)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillZipFilter (StringFilter[] value) throws ServiceException {
    this.BillZip = value;
  }
  /** Retrieve filter for field: BillZip (CMF.bill_zip)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillZipFilter () {
    return this.BillZip;
  }

  /**
   * Retrieves the BillZipFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillZipFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillZipFilter field
   */
  public String[] getBillZipFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillZipFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillZipFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillZipFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillZipFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillZipFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillZipFilter filter value from a formatted string
   *
   * @param _value the BillZipFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillZipFilter filter field
   */
  public void setBillZipFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillZipFilterFromFormattedString");
    try {
      this.setBillZipFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillZipFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillZipFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillZipFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillCountryCode (CMF.bill_country_code)
   * @param fetch whether to fetch this field or not
   */
  public void setBillCountryCodeFetch (boolean fetch) {
    this.BillCountryCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillCountryCode (CMF.bill_country_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillCountryCodeFetch () {
    return this.BillCountryCodeFetch;
  }
  /** Set the SortOrder for field: BillCountryCode (CMF.bill_country_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillCountryCodeSortOrder (Integer value) {
    this.BillCountryCodeSort = value;
  }
  /** Retrieve SortOrder for field: BillCountryCode (CMF.bill_country_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillCountryCodeSortOrder () {
    return this.BillCountryCodeSort;
  }
  /** Set the sort direction for field: BillCountryCode (CMF.bill_country_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillCountryCodeSortDirection (boolean ascending) {
    this.BillCountryCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillCountryCode (CMF.bill_country_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillCountryCodeSortDirection () {
    return this.BillCountryCodeSortAscending;
  }
  /** Set the field level filters for field: BillCountryCode (CMF.bill_country_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillCountryCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.BillCountryCode = value;
  }
  /** Retrieve filter for field: BillCountryCode (CMF.bill_country_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillCountryCodeFilter () {
    return this.BillCountryCode;
  }

  /**
   * Retrieves the BillCountryCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillCountryCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCountryCodeFilter field
   */
  public String[] getBillCountryCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCountryCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillCountryCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCountryCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCountryCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillCountryCodeFilter filter value from a formatted string
   *
   * @param _value the BillCountryCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillCountryCodeFilter filter field
   */
  public void setBillCountryCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillCountryCodeFilterFromFormattedString");
    try {
      this.setBillCountryCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCountryCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCountryCodeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated BillCountryCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillCountryCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillCountryCodeFilter filter field
   */
  public String[] getBillCountryCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCountryCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getBillCountryCodeFilter(), "CountryCode", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCountryCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCountryCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated BillCountryCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BillCountryCodeFilter filter field
   */
  public void setBillCountryCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillCountryCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setBillCountryCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "BillCountryCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCountryCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCountryCodeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: BillFranchiseTaxCode (CMF.bill_franchise_tax_code)
   * @param fetch whether to fetch this field or not
   */
  public void setBillFranchiseTaxCodeFetch (boolean fetch) {
    this.BillFranchiseTaxCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillFranchiseTaxCode (CMF.bill_franchise_tax_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillFranchiseTaxCodeFetch () {
    return this.BillFranchiseTaxCodeFetch;
  }
  /** Set the SortOrder for field: BillFranchiseTaxCode (CMF.bill_franchise_tax_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillFranchiseTaxCodeSortOrder (Integer value) {
    this.BillFranchiseTaxCodeSort = value;
  }
  /** Retrieve SortOrder for field: BillFranchiseTaxCode (CMF.bill_franchise_tax_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillFranchiseTaxCodeSortOrder () {
    return this.BillFranchiseTaxCodeSort;
  }
  /** Set the sort direction for field: BillFranchiseTaxCode (CMF.bill_franchise_tax_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillFranchiseTaxCodeSortDirection (boolean ascending) {
    this.BillFranchiseTaxCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillFranchiseTaxCode (CMF.bill_franchise_tax_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillFranchiseTaxCodeSortDirection () {
    return this.BillFranchiseTaxCodeSortAscending;
  }
  /** Set the field level filters for field: BillFranchiseTaxCode (CMF.bill_franchise_tax_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillFranchiseTaxCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.BillFranchiseTaxCode = value;
  }
  /** Retrieve filter for field: BillFranchiseTaxCode (CMF.bill_franchise_tax_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillFranchiseTaxCodeFilter () {
    return this.BillFranchiseTaxCode;
  }

  /**
   * Retrieves the BillFranchiseTaxCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillFranchiseTaxCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillFranchiseTaxCodeFilter field
   */
  public String[] getBillFranchiseTaxCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFranchiseTaxCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillFranchiseTaxCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFranchiseTaxCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFranchiseTaxCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFranchiseTaxCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillFranchiseTaxCodeFilter filter value from a formatted string
   *
   * @param _value the BillFranchiseTaxCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillFranchiseTaxCodeFilter filter field
   */
  public void setBillFranchiseTaxCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillFranchiseTaxCodeFilterFromFormattedString");
    try {
      this.setBillFranchiseTaxCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFranchiseTaxCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillFranchiseTaxCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillFranchiseTaxCodeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated BillFranchiseTaxCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillFranchiseTaxCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillFranchiseTaxCodeFilter filter field
   */
  public String[] getBillFranchiseTaxCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFranchiseTaxCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getBillFranchiseTaxCodeFilter(), "FranchiseCode", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFranchiseTaxCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFranchiseTaxCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFranchiseTaxCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated BillFranchiseTaxCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BillFranchiseTaxCodeFilter filter field
   */
  public void setBillFranchiseTaxCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillFranchiseTaxCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setBillFranchiseTaxCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "BillFranchiseTaxCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFranchiseTaxCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillFranchiseTaxCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillFranchiseTaxCodeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: BillCounty (CMF.bill_county)
   * @param fetch whether to fetch this field or not
   */
  public void setBillCountyFetch (boolean fetch) {
    this.BillCountyFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillCounty (CMF.bill_county)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillCountyFetch () {
    return this.BillCountyFetch;
  }
  /** Set the SortOrder for field: BillCounty (CMF.bill_county)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillCountySortOrder (Integer value) {
    this.BillCountySort = value;
  }
  /** Retrieve SortOrder for field: BillCounty (CMF.bill_county)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillCountySortOrder () {
    return this.BillCountySort;
  }
  /** Set the sort direction for field: BillCounty (CMF.bill_county)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillCountySortDirection (boolean ascending) {
    this.BillCountySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillCounty (CMF.bill_county)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillCountySortDirection () {
    return this.BillCountySortAscending;
  }
  /** Set the case insensitive for field: BillCounty (CMF.bill_county)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillCountyCaseInsensitive (boolean ascending) {
    this.BillCountyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillCounty (CMF.bill_county)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillCountyCaseInsensitive () {
    return this.BillCountyCaseInsensitive;
  }
  /** Set the field level filters for field: BillCounty (CMF.bill_county)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillCountyFilter (StringFilter[] value) throws ServiceException {
    this.BillCounty = value;
  }
  /** Retrieve filter for field: BillCounty (CMF.bill_county)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillCountyFilter () {
    return this.BillCounty;
  }

  /**
   * Retrieves the BillCountyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillCountyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCountyFilter field
   */
  public String[] getBillCountyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCountyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillCountyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCountyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCountyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCountyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillCountyFilter filter value from a formatted string
   *
   * @param _value the BillCountyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillCountyFilter filter field
   */
  public void setBillCountyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillCountyFilterFromFormattedString");
    try {
      this.setBillCountyFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCountyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCountyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCountyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillGeocode (CMF.bill_geocode)
   * @param fetch whether to fetch this field or not
   */
  public void setBillGeocodeFetch (boolean fetch) {
    this.BillGeocodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillGeocode (CMF.bill_geocode)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillGeocodeFetch () {
    return this.BillGeocodeFetch;
  }
  /** Set the SortOrder for field: BillGeocode (CMF.bill_geocode)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillGeocodeSortOrder (Integer value) {
    this.BillGeocodeSort = value;
  }
  /** Retrieve SortOrder for field: BillGeocode (CMF.bill_geocode)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillGeocodeSortOrder () {
    return this.BillGeocodeSort;
  }
  /** Set the sort direction for field: BillGeocode (CMF.bill_geocode)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillGeocodeSortDirection (boolean ascending) {
    this.BillGeocodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillGeocode (CMF.bill_geocode)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillGeocodeSortDirection () {
    return this.BillGeocodeSortAscending;
  }
  /** Set the case insensitive for field: BillGeocode (CMF.bill_geocode)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillGeocodeCaseInsensitive (boolean ascending) {
    this.BillGeocodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillGeocode (CMF.bill_geocode)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillGeocodeCaseInsensitive () {
    return this.BillGeocodeCaseInsensitive;
  }
  /** Set the field level filters for field: BillGeocode (CMF.bill_geocode)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillGeocodeFilter (StringFilter[] value) throws ServiceException {
    this.BillGeocode = value;
  }
  /** Retrieve filter for field: BillGeocode (CMF.bill_geocode)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillGeocodeFilter () {
    return this.BillGeocode;
  }

  /**
   * Retrieves the BillGeocodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillGeocodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillGeocodeFilter field
   */
  public String[] getBillGeocodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillGeocodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillGeocodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillGeocodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillGeocodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillGeocodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillGeocodeFilter filter value from a formatted string
   *
   * @param _value the BillGeocodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillGeocodeFilter filter field
   */
  public void setBillGeocodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillGeocodeFilterFromFormattedString");
    try {
      this.setBillGeocodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillGeocodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillGeocodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillGeocodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Ssn (CMF.ssn)
   * @param fetch whether to fetch this field or not
   */
  public void setSsnFetch (boolean fetch) {
    this.SsnFetch = fetch;
  }
  /** Retrieve Fetch value for field: Ssn (CMF.ssn)
   * @return boolean the Fetch value for this field
   */
  public boolean getSsnFetch () {
    return this.SsnFetch;
  }
  /** Set the SortOrder for field: Ssn (CMF.ssn)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSsnSortOrder (Integer value) {
    this.SsnSort = value;
  }
  /** Retrieve SortOrder for field: Ssn (CMF.ssn)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSsnSortOrder () {
    return this.SsnSort;
  }
  /** Set the sort direction for field: Ssn (CMF.ssn)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSsnSortDirection (boolean ascending) {
    this.SsnSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Ssn (CMF.ssn)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSsnSortDirection () {
    return this.SsnSortAscending;
  }
  /** Set the case insensitive for field: Ssn (CMF.ssn)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setSsnCaseInsensitive (boolean ascending) {
    this.SsnCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Ssn (CMF.ssn)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getSsnCaseInsensitive () {
    return this.SsnCaseInsensitive;
  }
  /** Set the field level filters for field: Ssn (CMF.ssn)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSsnFilter (StringFilter[] value) throws ServiceException {
    this.Ssn = value;
  }
  /** Retrieve filter for field: Ssn (CMF.ssn)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getSsnFilter () {
    return this.Ssn;
  }

  /**
   * Retrieves the SsnFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SsnFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SsnFilter field
   */
  public String[] getSsnFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSsnFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSsnFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSsnFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SsnFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSsnFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SsnFilter filter value from a formatted string
   *
   * @param _value the SsnFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SsnFilter filter field
   */
  public void setSsnFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSsnFilterFromFormattedString");
    try {
      this.setSsnFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SsnFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSsnFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSsnFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Contact1Name (CMF.contact1_name)
   * @param fetch whether to fetch this field or not
   */
  public void setContact1NameFetch (boolean fetch) {
    this.Contact1NameFetch = fetch;
  }
  /** Retrieve Fetch value for field: Contact1Name (CMF.contact1_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getContact1NameFetch () {
    return this.Contact1NameFetch;
  }
  /** Set the SortOrder for field: Contact1Name (CMF.contact1_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContact1NameSortOrder (Integer value) {
    this.Contact1NameSort = value;
  }
  /** Retrieve SortOrder for field: Contact1Name (CMF.contact1_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContact1NameSortOrder () {
    return this.Contact1NameSort;
  }
  /** Set the sort direction for field: Contact1Name (CMF.contact1_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContact1NameSortDirection (boolean ascending) {
    this.Contact1NameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Contact1Name (CMF.contact1_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContact1NameSortDirection () {
    return this.Contact1NameSortAscending;
  }
  /** Set the case insensitive for field: Contact1Name (CMF.contact1_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setContact1NameCaseInsensitive (boolean ascending) {
    this.Contact1NameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Contact1Name (CMF.contact1_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getContact1NameCaseInsensitive () {
    return this.Contact1NameCaseInsensitive;
  }
  /** Set the field level filters for field: Contact1Name (CMF.contact1_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContact1NameFilter (StringFilter[] value) throws ServiceException {
    this.Contact1Name = value;
  }
  /** Retrieve filter for field: Contact1Name (CMF.contact1_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getContact1NameFilter () {
    return this.Contact1Name;
  }

  /**
   * Retrieves the Contact1NameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The Contact1NameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Contact1NameFilter field
   */
  public String[] getContact1NameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContact1NameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContact1NameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContact1NameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Contact1NameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContact1NameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the Contact1NameFilter filter value from a formatted string
   *
   * @param _value the Contact1NameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the Contact1NameFilter filter field
   */
  public void setContact1NameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContact1NameFilterFromFormattedString");
    try {
      this.setContact1NameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Contact1NameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContact1NameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContact1NameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Contact2Name (CMF.contact2_name)
   * @param fetch whether to fetch this field or not
   */
  public void setContact2NameFetch (boolean fetch) {
    this.Contact2NameFetch = fetch;
  }
  /** Retrieve Fetch value for field: Contact2Name (CMF.contact2_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getContact2NameFetch () {
    return this.Contact2NameFetch;
  }
  /** Set the SortOrder for field: Contact2Name (CMF.contact2_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContact2NameSortOrder (Integer value) {
    this.Contact2NameSort = value;
  }
  /** Retrieve SortOrder for field: Contact2Name (CMF.contact2_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContact2NameSortOrder () {
    return this.Contact2NameSort;
  }
  /** Set the sort direction for field: Contact2Name (CMF.contact2_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContact2NameSortDirection (boolean ascending) {
    this.Contact2NameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Contact2Name (CMF.contact2_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContact2NameSortDirection () {
    return this.Contact2NameSortAscending;
  }
  /** Set the case insensitive for field: Contact2Name (CMF.contact2_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setContact2NameCaseInsensitive (boolean ascending) {
    this.Contact2NameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Contact2Name (CMF.contact2_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getContact2NameCaseInsensitive () {
    return this.Contact2NameCaseInsensitive;
  }
  /** Set the field level filters for field: Contact2Name (CMF.contact2_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContact2NameFilter (StringFilter[] value) throws ServiceException {
    this.Contact2Name = value;
  }
  /** Retrieve filter for field: Contact2Name (CMF.contact2_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getContact2NameFilter () {
    return this.Contact2Name;
  }

  /**
   * Retrieves the Contact2NameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The Contact2NameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Contact2NameFilter field
   */
  public String[] getContact2NameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContact2NameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContact2NameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContact2NameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Contact2NameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContact2NameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the Contact2NameFilter filter value from a formatted string
   *
   * @param _value the Contact2NameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the Contact2NameFilter filter field
   */
  public void setContact2NameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContact2NameFilterFromFormattedString");
    try {
      this.setContact2NameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Contact2NameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContact2NameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContact2NameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Contact1Phone (CMF.contact1_phone)
   * @param fetch whether to fetch this field or not
   */
  public void setContact1PhoneFetch (boolean fetch) {
    this.Contact1PhoneFetch = fetch;
  }
  /** Retrieve Fetch value for field: Contact1Phone (CMF.contact1_phone)
   * @return boolean the Fetch value for this field
   */
  public boolean getContact1PhoneFetch () {
    return this.Contact1PhoneFetch;
  }
  /** Set the SortOrder for field: Contact1Phone (CMF.contact1_phone)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContact1PhoneSortOrder (Integer value) {
    this.Contact1PhoneSort = value;
  }
  /** Retrieve SortOrder for field: Contact1Phone (CMF.contact1_phone)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContact1PhoneSortOrder () {
    return this.Contact1PhoneSort;
  }
  /** Set the sort direction for field: Contact1Phone (CMF.contact1_phone)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContact1PhoneSortDirection (boolean ascending) {
    this.Contact1PhoneSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Contact1Phone (CMF.contact1_phone)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContact1PhoneSortDirection () {
    return this.Contact1PhoneSortAscending;
  }
  /** Set the case insensitive for field: Contact1Phone (CMF.contact1_phone)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setContact1PhoneCaseInsensitive (boolean ascending) {
    this.Contact1PhoneCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Contact1Phone (CMF.contact1_phone)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getContact1PhoneCaseInsensitive () {
    return this.Contact1PhoneCaseInsensitive;
  }
  /** Set the field level filters for field: Contact1Phone (CMF.contact1_phone)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContact1PhoneFilter (StringFilter[] value) throws ServiceException {
    this.Contact1Phone = value;
  }
  /** Retrieve filter for field: Contact1Phone (CMF.contact1_phone)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getContact1PhoneFilter () {
    return this.Contact1Phone;
  }

  /**
   * Retrieves the Contact1PhoneFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The Contact1PhoneFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Contact1PhoneFilter field
   */
  public String[] getContact1PhoneFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContact1PhoneFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContact1PhoneFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContact1PhoneFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Contact1PhoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContact1PhoneFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the Contact1PhoneFilter filter value from a formatted string
   *
   * @param _value the Contact1PhoneFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the Contact1PhoneFilter filter field
   */
  public void setContact1PhoneFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContact1PhoneFilterFromFormattedString");
    try {
      this.setContact1PhoneFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Contact1PhoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContact1PhoneFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContact1PhoneFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Contact2Phone (CMF.contact2_phone)
   * @param fetch whether to fetch this field or not
   */
  public void setContact2PhoneFetch (boolean fetch) {
    this.Contact2PhoneFetch = fetch;
  }
  /** Retrieve Fetch value for field: Contact2Phone (CMF.contact2_phone)
   * @return boolean the Fetch value for this field
   */
  public boolean getContact2PhoneFetch () {
    return this.Contact2PhoneFetch;
  }
  /** Set the SortOrder for field: Contact2Phone (CMF.contact2_phone)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContact2PhoneSortOrder (Integer value) {
    this.Contact2PhoneSort = value;
  }
  /** Retrieve SortOrder for field: Contact2Phone (CMF.contact2_phone)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContact2PhoneSortOrder () {
    return this.Contact2PhoneSort;
  }
  /** Set the sort direction for field: Contact2Phone (CMF.contact2_phone)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContact2PhoneSortDirection (boolean ascending) {
    this.Contact2PhoneSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Contact2Phone (CMF.contact2_phone)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContact2PhoneSortDirection () {
    return this.Contact2PhoneSortAscending;
  }
  /** Set the case insensitive for field: Contact2Phone (CMF.contact2_phone)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setContact2PhoneCaseInsensitive (boolean ascending) {
    this.Contact2PhoneCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Contact2Phone (CMF.contact2_phone)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getContact2PhoneCaseInsensitive () {
    return this.Contact2PhoneCaseInsensitive;
  }
  /** Set the field level filters for field: Contact2Phone (CMF.contact2_phone)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContact2PhoneFilter (StringFilter[] value) throws ServiceException {
    this.Contact2Phone = value;
  }
  /** Retrieve filter for field: Contact2Phone (CMF.contact2_phone)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getContact2PhoneFilter () {
    return this.Contact2Phone;
  }

  /**
   * Retrieves the Contact2PhoneFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The Contact2PhoneFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Contact2PhoneFilter field
   */
  public String[] getContact2PhoneFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContact2PhoneFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContact2PhoneFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContact2PhoneFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Contact2PhoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContact2PhoneFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the Contact2PhoneFilter filter value from a formatted string
   *
   * @param _value the Contact2PhoneFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the Contact2PhoneFilter filter field
   */
  public void setContact2PhoneFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContact2PhoneFilterFromFormattedString");
    try {
      this.setContact2PhoneFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Contact2PhoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContact2PhoneFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContact2PhoneFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustFaxno (CMF.cust_faxno)
   * @param fetch whether to fetch this field or not
   */
  public void setCustFaxnoFetch (boolean fetch) {
    this.CustFaxnoFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustFaxno (CMF.cust_faxno)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustFaxnoFetch () {
    return this.CustFaxnoFetch;
  }
  /** Set the SortOrder for field: CustFaxno (CMF.cust_faxno)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustFaxnoSortOrder (Integer value) {
    this.CustFaxnoSort = value;
  }
  /** Retrieve SortOrder for field: CustFaxno (CMF.cust_faxno)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustFaxnoSortOrder () {
    return this.CustFaxnoSort;
  }
  /** Set the sort direction for field: CustFaxno (CMF.cust_faxno)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustFaxnoSortDirection (boolean ascending) {
    this.CustFaxnoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustFaxno (CMF.cust_faxno)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustFaxnoSortDirection () {
    return this.CustFaxnoSortAscending;
  }
  /** Set the case insensitive for field: CustFaxno (CMF.cust_faxno)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustFaxnoCaseInsensitive (boolean ascending) {
    this.CustFaxnoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustFaxno (CMF.cust_faxno)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustFaxnoCaseInsensitive () {
    return this.CustFaxnoCaseInsensitive;
  }
  /** Set the field level filters for field: CustFaxno (CMF.cust_faxno)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustFaxnoFilter (StringFilter[] value) throws ServiceException {
    this.CustFaxno = value;
  }
  /** Retrieve filter for field: CustFaxno (CMF.cust_faxno)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustFaxnoFilter () {
    return this.CustFaxno;
  }

  /**
   * Retrieves the CustFaxnoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustFaxnoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustFaxnoFilter field
   */
  public String[] getCustFaxnoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustFaxnoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustFaxnoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustFaxnoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustFaxnoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustFaxnoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustFaxnoFilter filter value from a formatted string
   *
   * @param _value the CustFaxnoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustFaxnoFilter filter field
   */
  public void setCustFaxnoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustFaxnoFilterFromFormattedString");
    try {
      this.setCustFaxnoFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustFaxnoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustFaxnoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustFaxnoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: StatementToFaxno (CMF.statement_to_faxno)
   * @param fetch whether to fetch this field or not
   */
  public void setStatementToFaxnoFetch (boolean fetch) {
    this.StatementToFaxnoFetch = fetch;
  }
  /** Retrieve Fetch value for field: StatementToFaxno (CMF.statement_to_faxno)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatementToFaxnoFetch () {
    return this.StatementToFaxnoFetch;
  }
  /** Set the SortOrder for field: StatementToFaxno (CMF.statement_to_faxno)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatementToFaxnoSortOrder (Integer value) {
    this.StatementToFaxnoSort = value;
  }
  /** Retrieve SortOrder for field: StatementToFaxno (CMF.statement_to_faxno)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatementToFaxnoSortOrder () {
    return this.StatementToFaxnoSort;
  }
  /** Set the sort direction for field: StatementToFaxno (CMF.statement_to_faxno)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatementToFaxnoSortDirection (boolean ascending) {
    this.StatementToFaxnoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StatementToFaxno (CMF.statement_to_faxno)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatementToFaxnoSortDirection () {
    return this.StatementToFaxnoSortAscending;
  }
  /** Set the case insensitive for field: StatementToFaxno (CMF.statement_to_faxno)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setStatementToFaxnoCaseInsensitive (boolean ascending) {
    this.StatementToFaxnoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: StatementToFaxno (CMF.statement_to_faxno)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getStatementToFaxnoCaseInsensitive () {
    return this.StatementToFaxnoCaseInsensitive;
  }
  /** Set the field level filters for field: StatementToFaxno (CMF.statement_to_faxno)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatementToFaxnoFilter (StringFilter[] value) throws ServiceException {
    this.StatementToFaxno = value;
  }
  /** Retrieve filter for field: StatementToFaxno (CMF.statement_to_faxno)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getStatementToFaxnoFilter () {
    return this.StatementToFaxno;
  }

  /**
   * Retrieves the StatementToFaxnoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatementToFaxnoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementToFaxnoFilter field
   */
  public String[] getStatementToFaxnoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementToFaxnoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatementToFaxnoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementToFaxnoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementToFaxnoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementToFaxnoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatementToFaxnoFilter filter value from a formatted string
   *
   * @param _value the StatementToFaxnoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatementToFaxnoFilter filter field
   */
  public void setStatementToFaxnoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatementToFaxnoFilterFromFormattedString");
    try {
      this.setStatementToFaxnoFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementToFaxnoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementToFaxnoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatementToFaxnoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CreditThresh (CMF.credit_thresh)
   * @param fetch whether to fetch this field or not
   */
  public void setCreditThreshFetch (boolean fetch) {
    this.CreditThreshFetch = fetch;
  }
  /** Retrieve Fetch value for field: CreditThresh (CMF.credit_thresh)
   * @return boolean the Fetch value for this field
   */
  public boolean getCreditThreshFetch () {
    return this.CreditThreshFetch;
  }
  /** Set the SortOrder for field: CreditThresh (CMF.credit_thresh)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCreditThreshSortOrder (Integer value) {
    this.CreditThreshSort = value;
  }
  /** Retrieve SortOrder for field: CreditThresh (CMF.credit_thresh)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCreditThreshSortOrder () {
    return this.CreditThreshSort;
  }
  /** Set the sort direction for field: CreditThresh (CMF.credit_thresh)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCreditThreshSortDirection (boolean ascending) {
    this.CreditThreshSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CreditThresh (CMF.credit_thresh)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCreditThreshSortDirection () {
    return this.CreditThreshSortAscending;
  }
  /** Set the field level filters for field: CreditThresh (CMF.credit_thresh)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCreditThreshFilter (BigIntegerFilter[] value) throws ServiceException {
    this.CreditThresh = value;
  }
  /** Retrieve filter for field: CreditThresh (CMF.credit_thresh)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCreditThreshFilter () {
    return this.CreditThresh;
  }

  /**
   * Retrieves the CreditThreshFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CreditThreshFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreditThreshFilter field
   */
  public String[] getCreditThreshFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditThreshFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCreditThreshFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditThreshFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreditThreshFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreditThreshFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CreditThreshFilter filter value from a formatted string
   *
   * @param _value the CreditThreshFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CreditThreshFilter filter field
   */
  public void setCreditThreshFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCreditThreshFilterFromFormattedString");
    try {
      this.setCreditThreshFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreditThreshFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreditThreshFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreditThreshFilterFromFormattedString");
  }

  /**
   * Sets the CreditThreshFilter filter value from a formatted string
   *
   * @param _value the CreditThreshFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CreditThreshFilter filter field
   */
  public void setCreditThreshFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCreditThreshFilterFromFormattedCurrencyString");
    try {
      this.setCreditThreshFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreditThreshFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreditThreshFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreditThreshFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the CreditThreshFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CreditThreshFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreditThreshFilter field
   */

  public String[] getCreditThreshFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditThreshFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCreditThreshFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditThreshFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreditThreshFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreditThreshFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: CredStatus (CMF.cred_status)
   * @param fetch whether to fetch this field or not
   */
  public void setCredStatusFetch (boolean fetch) {
    this.CredStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: CredStatus (CMF.cred_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getCredStatusFetch () {
    return this.CredStatusFetch;
  }
  /** Set the SortOrder for field: CredStatus (CMF.cred_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCredStatusSortOrder (Integer value) {
    this.CredStatusSort = value;
  }
  /** Retrieve SortOrder for field: CredStatus (CMF.cred_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCredStatusSortOrder () {
    return this.CredStatusSort;
  }
  /** Set the sort direction for field: CredStatus (CMF.cred_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCredStatusSortDirection (boolean ascending) {
    this.CredStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CredStatus (CMF.cred_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCredStatusSortDirection () {
    return this.CredStatusSortAscending;
  }
  /** Set the field level filters for field: CredStatus (CMF.cred_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCredStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.CredStatus = value;
  }
  /** Retrieve filter for field: CredStatus (CMF.cred_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCredStatusFilter () {
    return this.CredStatus;
  }

  /**
   * Retrieves the CredStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CredStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CredStatusFilter field
   */
  public String[] getCredStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCredStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCredStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCredStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CredStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCredStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CredStatusFilter filter value from a formatted string
   *
   * @param _value the CredStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CredStatusFilter filter field
   */
  public void setCredStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCredStatusFilterFromFormattedString");
    try {
      this.setCredStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CredStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCredStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCredStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CreditRating (CMF.credit_rating)
   * @param fetch whether to fetch this field or not
   */
  public void setCreditRatingFetch (boolean fetch) {
    this.CreditRatingFetch = fetch;
  }
  /** Retrieve Fetch value for field: CreditRating (CMF.credit_rating)
   * @return boolean the Fetch value for this field
   */
  public boolean getCreditRatingFetch () {
    return this.CreditRatingFetch;
  }
  /** Set the SortOrder for field: CreditRating (CMF.credit_rating)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCreditRatingSortOrder (Integer value) {
    this.CreditRatingSort = value;
  }
  /** Retrieve SortOrder for field: CreditRating (CMF.credit_rating)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCreditRatingSortOrder () {
    return this.CreditRatingSort;
  }
  /** Set the sort direction for field: CreditRating (CMF.credit_rating)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCreditRatingSortDirection (boolean ascending) {
    this.CreditRatingSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CreditRating (CMF.credit_rating)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCreditRatingSortDirection () {
    return this.CreditRatingSortAscending;
  }
  /** Set the field level filters for field: CreditRating (CMF.credit_rating)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCreditRatingFilter (IntegerFilter[] value) throws ServiceException {
    this.CreditRating = value;
  }
  /** Retrieve filter for field: CreditRating (CMF.credit_rating)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCreditRatingFilter () {
    return this.CreditRating;
  }

  /**
   * Retrieves the CreditRatingFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CreditRatingFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreditRatingFilter field
   */
  public String[] getCreditRatingFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditRatingFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCreditRatingFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditRatingFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreditRatingFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreditRatingFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CreditRatingFilter filter value from a formatted string
   *
   * @param _value the CreditRatingFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CreditRatingFilter filter field
   */
  public void setCreditRatingFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCreditRatingFilterFromFormattedString");
    try {
      this.setCreditRatingFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreditRatingFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreditRatingFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreditRatingFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DisconnectReason (CMF.disconnect_reason)
   * @param fetch whether to fetch this field or not
   */
  public void setDisconnectReasonFetch (boolean fetch) {
    this.DisconnectReasonFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisconnectReason (CMF.disconnect_reason)
   * @return boolean the Fetch value for this field
   */
  public boolean getDisconnectReasonFetch () {
    return this.DisconnectReasonFetch;
  }
  /** Set the SortOrder for field: DisconnectReason (CMF.disconnect_reason)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisconnectReasonSortOrder (Integer value) {
    this.DisconnectReasonSort = value;
  }
  /** Retrieve SortOrder for field: DisconnectReason (CMF.disconnect_reason)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisconnectReasonSortOrder () {
    return this.DisconnectReasonSort;
  }
  /** Set the sort direction for field: DisconnectReason (CMF.disconnect_reason)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisconnectReasonSortDirection (boolean ascending) {
    this.DisconnectReasonSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisconnectReason (CMF.disconnect_reason)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisconnectReasonSortDirection () {
    return this.DisconnectReasonSortAscending;
  }
  /** Set the field level filters for field: DisconnectReason (CMF.disconnect_reason)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisconnectReasonFilter (IntegerFilter[] value) throws ServiceException {
    this.DisconnectReason = value;
  }
  /** Retrieve filter for field: DisconnectReason (CMF.disconnect_reason)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDisconnectReasonFilter () {
    return this.DisconnectReason;
  }

  /**
   * Retrieves the DisconnectReasonFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DisconnectReasonFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisconnectReasonFilter field
   */
  public String[] getDisconnectReasonFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisconnectReasonFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDisconnectReasonFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisconnectReasonFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisconnectReasonFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisconnectReasonFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DisconnectReasonFilter filter value from a formatted string
   *
   * @param _value the DisconnectReasonFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DisconnectReasonFilter filter field
   */
  public void setDisconnectReasonFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDisconnectReasonFilterFromFormattedString");
    try {
      this.setDisconnectReasonFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisconnectReasonFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisconnectReasonFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisconnectReasonFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated DisconnectReasonFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the DisconnectReasonFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the DisconnectReasonFilter filter field
   */
  public String[] getDisconnectReasonFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisconnectReasonFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getDisconnectReasonFilter(), "DiscReason", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisconnectReasonFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisconnectReasonFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisconnectReasonFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated DisconnectReasonFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the DisconnectReasonFilter filter field
   */
  public void setDisconnectReasonFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDisconnectReasonFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setDisconnectReasonFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "DisconnectReason", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisconnectReasonFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisconnectReasonFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisconnectReasonFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: DiscRcvOpt (CMF.disc_rcv_opt)
   * @param fetch whether to fetch this field or not
   */
  public void setDiscRcvOptFetch (boolean fetch) {
    this.DiscRcvOptFetch = fetch;
  }
  /** Retrieve Fetch value for field: DiscRcvOpt (CMF.disc_rcv_opt)
   * @return boolean the Fetch value for this field
   */
  public boolean getDiscRcvOptFetch () {
    return this.DiscRcvOptFetch;
  }
  /** Set the SortOrder for field: DiscRcvOpt (CMF.disc_rcv_opt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDiscRcvOptSortOrder (Integer value) {
    this.DiscRcvOptSort = value;
  }
  /** Retrieve SortOrder for field: DiscRcvOpt (CMF.disc_rcv_opt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDiscRcvOptSortOrder () {
    return this.DiscRcvOptSort;
  }
  /** Set the sort direction for field: DiscRcvOpt (CMF.disc_rcv_opt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDiscRcvOptSortDirection (boolean ascending) {
    this.DiscRcvOptSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DiscRcvOpt (CMF.disc_rcv_opt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDiscRcvOptSortDirection () {
    return this.DiscRcvOptSortAscending;
  }
  /** Set the field level filters for field: DiscRcvOpt (CMF.disc_rcv_opt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDiscRcvOptFilter (IntegerFilter[] value) throws ServiceException {
    this.DiscRcvOpt = value;
  }
  /** Retrieve filter for field: DiscRcvOpt (CMF.disc_rcv_opt)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDiscRcvOptFilter () {
    return this.DiscRcvOpt;
  }

  /**
   * Retrieves the DiscRcvOptFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DiscRcvOptFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscRcvOptFilter field
   */
  public String[] getDiscRcvOptFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscRcvOptFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDiscRcvOptFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscRcvOptFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscRcvOptFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscRcvOptFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DiscRcvOptFilter filter value from a formatted string
   *
   * @param _value the DiscRcvOptFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DiscRcvOptFilter filter field
   */
  public void setDiscRcvOptFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscRcvOptFilterFromFormattedString");
    try {
      this.setDiscRcvOptFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscRcvOptFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscRcvOptFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscRcvOptFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ThreshRef (CMF.thresh_ref)
   * @param fetch whether to fetch this field or not
   */
  public void setThreshRefFetch (boolean fetch) {
    this.ThreshRefFetch = fetch;
  }
  /** Retrieve Fetch value for field: ThreshRef (CMF.thresh_ref)
   * @return boolean the Fetch value for this field
   */
  public boolean getThreshRefFetch () {
    return this.ThreshRefFetch;
  }
  /** Set the SortOrder for field: ThreshRef (CMF.thresh_ref)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setThreshRefSortOrder (Integer value) {
    this.ThreshRefSort = value;
  }
  /** Retrieve SortOrder for field: ThreshRef (CMF.thresh_ref)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getThreshRefSortOrder () {
    return this.ThreshRefSort;
  }
  /** Set the sort direction for field: ThreshRef (CMF.thresh_ref)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setThreshRefSortDirection (boolean ascending) {
    this.ThreshRefSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ThreshRef (CMF.thresh_ref)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getThreshRefSortDirection () {
    return this.ThreshRefSortAscending;
  }
  /** Set the field level filters for field: ThreshRef (CMF.thresh_ref)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setThreshRefFilter (IntegerFilter[] value) throws ServiceException {
    this.ThreshRef = value;
  }
  /** Retrieve filter for field: ThreshRef (CMF.thresh_ref)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getThreshRefFilter () {
    return this.ThreshRef;
  }

  /**
   * Retrieves the ThreshRefFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ThreshRefFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ThreshRefFilter field
   */
  public String[] getThreshRefFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThreshRefFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getThreshRefFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getThreshRefFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ThreshRefFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getThreshRefFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ThreshRefFilter filter value from a formatted string
   *
   * @param _value the ThreshRefFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ThreshRefFilter filter field
   */
  public void setThreshRefFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setThreshRefFilterFromFormattedString");
    try {
      this.setThreshRefFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ThreshRefFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setThreshRefFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setThreshRefFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillPeriod (CMF.bill_period)
   * @param fetch whether to fetch this field or not
   */
  public void setBillPeriodFetch (boolean fetch) {
    this.BillPeriodFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillPeriod (CMF.bill_period)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillPeriodFetch () {
    return this.BillPeriodFetch;
  }
  /** Set the SortOrder for field: BillPeriod (CMF.bill_period)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillPeriodSortOrder (Integer value) {
    this.BillPeriodSort = value;
  }
  /** Retrieve SortOrder for field: BillPeriod (CMF.bill_period)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillPeriodSortOrder () {
    return this.BillPeriodSort;
  }
  /** Set the sort direction for field: BillPeriod (CMF.bill_period)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillPeriodSortDirection (boolean ascending) {
    this.BillPeriodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillPeriod (CMF.bill_period)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillPeriodSortDirection () {
    return this.BillPeriodSortAscending;
  }
  /** Set the case insensitive for field: BillPeriod (CMF.bill_period)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillPeriodCaseInsensitive (boolean ascending) {
    this.BillPeriodCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillPeriod (CMF.bill_period)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillPeriodCaseInsensitive () {
    return this.BillPeriodCaseInsensitive;
  }
  /** Set the field level filters for field: BillPeriod (CMF.bill_period)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillPeriodFilter (StringFilter[] value) throws ServiceException {
    this.BillPeriod = value;
  }
  /** Retrieve filter for field: BillPeriod (CMF.bill_period)
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


  /** Set the field level Fetch value for field: BillingFrequency (CMF.billing_frequency)
   * @param fetch whether to fetch this field or not
   */
  public void setBillingFrequencyFetch (boolean fetch) {
    this.BillingFrequencyFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillingFrequency (CMF.billing_frequency)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillingFrequencyFetch () {
    return this.BillingFrequencyFetch;
  }
  /** Set the SortOrder for field: BillingFrequency (CMF.billing_frequency)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillingFrequencySortOrder (Integer value) {
    this.BillingFrequencySort = value;
  }
  /** Retrieve SortOrder for field: BillingFrequency (CMF.billing_frequency)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillingFrequencySortOrder () {
    return this.BillingFrequencySort;
  }
  /** Set the sort direction for field: BillingFrequency (CMF.billing_frequency)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillingFrequencySortDirection (boolean ascending) {
    this.BillingFrequencySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillingFrequency (CMF.billing_frequency)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillingFrequencySortDirection () {
    return this.BillingFrequencySortAscending;
  }
  /** Set the field level filters for field: BillingFrequency (CMF.billing_frequency)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillingFrequencyFilter (IntegerFilter[] value) throws ServiceException {
    this.BillingFrequency = value;
  }
  /** Retrieve filter for field: BillingFrequency (CMF.billing_frequency)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillingFrequencyFilter () {
    return this.BillingFrequency;
  }

  /**
   * Retrieves the BillingFrequencyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillingFrequencyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingFrequencyFilter field
   */
  public String[] getBillingFrequencyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingFrequencyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillingFrequencyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingFrequencyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingFrequencyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingFrequencyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillingFrequencyFilter filter value from a formatted string
   *
   * @param _value the BillingFrequencyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillingFrequencyFilter filter field
   */
  public void setBillingFrequencyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingFrequencyFilterFromFormattedString");
    try {
      this.setBillingFrequencyFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingFrequencyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingFrequencyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingFrequencyFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated BillingFrequencyFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillingFrequencyFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillingFrequencyFilter filter field
   */
  public String[] getBillingFrequencyFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingFrequencyFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getBillingFrequencyFilter(), "BillingFrequency", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingFrequencyFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingFrequencyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingFrequencyFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated BillingFrequencyFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BillingFrequencyFilter filter field
   */
  public void setBillingFrequencyFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingFrequencyFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setBillingFrequencyFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "BillingFrequency", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingFrequencyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingFrequencyFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingFrequencyFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: BillFmtOpt (CMF.bill_fmt_opt)
   * @param fetch whether to fetch this field or not
   */
  public void setBillFmtOptFetch (boolean fetch) {
    this.BillFmtOptFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillFmtOpt (CMF.bill_fmt_opt)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillFmtOptFetch () {
    return this.BillFmtOptFetch;
  }
  /** Set the SortOrder for field: BillFmtOpt (CMF.bill_fmt_opt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillFmtOptSortOrder (Integer value) {
    this.BillFmtOptSort = value;
  }
  /** Retrieve SortOrder for field: BillFmtOpt (CMF.bill_fmt_opt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillFmtOptSortOrder () {
    return this.BillFmtOptSort;
  }
  /** Set the sort direction for field: BillFmtOpt (CMF.bill_fmt_opt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillFmtOptSortDirection (boolean ascending) {
    this.BillFmtOptSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillFmtOpt (CMF.bill_fmt_opt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillFmtOptSortDirection () {
    return this.BillFmtOptSortAscending;
  }
  /** Set the field level filters for field: BillFmtOpt (CMF.bill_fmt_opt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillFmtOptFilter (IntegerFilter[] value) throws ServiceException {
    this.BillFmtOpt = value;
  }
  /** Retrieve filter for field: BillFmtOpt (CMF.bill_fmt_opt)
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

  /**
   * Retrieves the display value for the enumerated BillFmtOptFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillFmtOptFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillFmtOptFilter filter field
   */
  public String[] getBillFmtOptFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFmtOptFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getBillFmtOptFilter(), "BillFormatOption", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFmtOptFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFmtOptFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFmtOptFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated BillFmtOptFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BillFmtOptFilter filter field
   */
  public void setBillFmtOptFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillFmtOptFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setBillFmtOptFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "BillFmtOpt", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFmtOptFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillFmtOptFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillFmtOptFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: BillDispMeth (CMF.bill_disp_meth)
   * @param fetch whether to fetch this field or not
   */
  public void setBillDispMethFetch (boolean fetch) {
    this.BillDispMethFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillDispMeth (CMF.bill_disp_meth)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillDispMethFetch () {
    return this.BillDispMethFetch;
  }
  /** Set the SortOrder for field: BillDispMeth (CMF.bill_disp_meth)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillDispMethSortOrder (Integer value) {
    this.BillDispMethSort = value;
  }
  /** Retrieve SortOrder for field: BillDispMeth (CMF.bill_disp_meth)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillDispMethSortOrder () {
    return this.BillDispMethSort;
  }
  /** Set the sort direction for field: BillDispMeth (CMF.bill_disp_meth)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillDispMethSortDirection (boolean ascending) {
    this.BillDispMethSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillDispMeth (CMF.bill_disp_meth)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillDispMethSortDirection () {
    return this.BillDispMethSortAscending;
  }
  /** Set the field level filters for field: BillDispMeth (CMF.bill_disp_meth)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillDispMethFilter (IntegerFilter[] value) throws ServiceException {
    this.BillDispMeth = value;
  }
  /** Retrieve filter for field: BillDispMeth (CMF.bill_disp_meth)
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


  /** Set the field level Fetch value for field: BillHoldCode (CMF.bill_hold_code)
   * @param fetch whether to fetch this field or not
   */
  public void setBillHoldCodeFetch (boolean fetch) {
    this.BillHoldCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillHoldCode (CMF.bill_hold_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillHoldCodeFetch () {
    return this.BillHoldCodeFetch;
  }
  /** Set the SortOrder for field: BillHoldCode (CMF.bill_hold_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillHoldCodeSortOrder (Integer value) {
    this.BillHoldCodeSort = value;
  }
  /** Retrieve SortOrder for field: BillHoldCode (CMF.bill_hold_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillHoldCodeSortOrder () {
    return this.BillHoldCodeSort;
  }
  /** Set the sort direction for field: BillHoldCode (CMF.bill_hold_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillHoldCodeSortDirection (boolean ascending) {
    this.BillHoldCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillHoldCode (CMF.bill_hold_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillHoldCodeSortDirection () {
    return this.BillHoldCodeSortAscending;
  }
  /** Set the field level filters for field: BillHoldCode (CMF.bill_hold_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillHoldCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.BillHoldCode = value;
  }
  /** Retrieve filter for field: BillHoldCode (CMF.bill_hold_code)
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

  /** Set the field level Fetch value for field: MsgGrpId (CMF.msg_grp_id)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgGrpIdFetch (boolean fetch) {
    this.MsgGrpIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgGrpId (CMF.msg_grp_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgGrpIdFetch () {
    return this.MsgGrpIdFetch;
  }
  /** Set the SortOrder for field: MsgGrpId (CMF.msg_grp_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgGrpIdSortOrder (Integer value) {
    this.MsgGrpIdSort = value;
  }
  /** Retrieve SortOrder for field: MsgGrpId (CMF.msg_grp_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgGrpIdSortOrder () {
    return this.MsgGrpIdSort;
  }
  /** Set the sort direction for field: MsgGrpId (CMF.msg_grp_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgGrpIdSortDirection (boolean ascending) {
    this.MsgGrpIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgGrpId (CMF.msg_grp_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgGrpIdSortDirection () {
    return this.MsgGrpIdSortAscending;
  }
  /** Set the field level filters for field: MsgGrpId (CMF.msg_grp_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgGrpIdFilter (IntegerFilter[] value) throws ServiceException {
    this.MsgGrpId = value;
  }
  /** Retrieve filter for field: MsgGrpId (CMF.msg_grp_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgGrpIdFilter () {
    return this.MsgGrpId;
  }

  /**
   * Retrieves the MsgGrpIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MsgGrpIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgGrpIdFilter field
   */
  public String[] getMsgGrpIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgGrpIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMsgGrpIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgGrpIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgGrpIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgGrpIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MsgGrpIdFilter filter value from a formatted string
   *
   * @param _value the MsgGrpIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MsgGrpIdFilter filter field
   */
  public void setMsgGrpIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMsgGrpIdFilterFromFormattedString");
    try {
      this.setMsgGrpIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgGrpIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgGrpIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgGrpIdFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated MsgGrpIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the MsgGrpIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the MsgGrpIdFilter filter field
   */
  public String[] getMsgGrpIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgGrpIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getMsgGrpIdFilter(), "BillMessageGroup", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgGrpIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgGrpIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgGrpIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated MsgGrpIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the MsgGrpIdFilter filter field
   */
  public void setMsgGrpIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMsgGrpIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setMsgGrpIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "MsgGrpId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgGrpIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgGrpIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgGrpIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: InsertGrpId (CMF.insert_grp_id)
   * @param fetch whether to fetch this field or not
   */
  public void setInsertGrpIdFetch (boolean fetch) {
    this.InsertGrpIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: InsertGrpId (CMF.insert_grp_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getInsertGrpIdFetch () {
    return this.InsertGrpIdFetch;
  }
  /** Set the SortOrder for field: InsertGrpId (CMF.insert_grp_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInsertGrpIdSortOrder (Integer value) {
    this.InsertGrpIdSort = value;
  }
  /** Retrieve SortOrder for field: InsertGrpId (CMF.insert_grp_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInsertGrpIdSortOrder () {
    return this.InsertGrpIdSort;
  }
  /** Set the sort direction for field: InsertGrpId (CMF.insert_grp_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInsertGrpIdSortDirection (boolean ascending) {
    this.InsertGrpIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InsertGrpId (CMF.insert_grp_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInsertGrpIdSortDirection () {
    return this.InsertGrpIdSortAscending;
  }
  /** Set the field level filters for field: InsertGrpId (CMF.insert_grp_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInsertGrpIdFilter (IntegerFilter[] value) throws ServiceException {
    this.InsertGrpId = value;
  }
  /** Retrieve filter for field: InsertGrpId (CMF.insert_grp_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getInsertGrpIdFilter () {
    return this.InsertGrpId;
  }

  /**
   * Retrieves the InsertGrpIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InsertGrpIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InsertGrpIdFilter field
   */
  public String[] getInsertGrpIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertGrpIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInsertGrpIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInsertGrpIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InsertGrpIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInsertGrpIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InsertGrpIdFilter filter value from a formatted string
   *
   * @param _value the InsertGrpIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InsertGrpIdFilter filter field
   */
  public void setInsertGrpIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInsertGrpIdFilterFromFormattedString");
    try {
      this.setInsertGrpIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InsertGrpIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInsertGrpIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInsertGrpIdFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated InsertGrpIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the InsertGrpIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the InsertGrpIdFilter filter field
   */
  public String[] getInsertGrpIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertGrpIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getInsertGrpIdFilter(), "BillInsertGroup", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInsertGrpIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InsertGrpIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInsertGrpIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated InsertGrpIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the InsertGrpIdFilter filter field
   */
  public void setInsertGrpIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInsertGrpIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setInsertGrpIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "InsertGrpId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InsertGrpIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInsertGrpIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInsertGrpIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: RateClassDefault (CMF.rate_class_default)
   * @param fetch whether to fetch this field or not
   */
  public void setRateClassDefaultFetch (boolean fetch) {
    this.RateClassDefaultFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateClassDefault (CMF.rate_class_default)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateClassDefaultFetch () {
    return this.RateClassDefaultFetch;
  }
  /** Set the SortOrder for field: RateClassDefault (CMF.rate_class_default)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateClassDefaultSortOrder (Integer value) {
    this.RateClassDefaultSort = value;
  }
  /** Retrieve SortOrder for field: RateClassDefault (CMF.rate_class_default)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateClassDefaultSortOrder () {
    return this.RateClassDefaultSort;
  }
  /** Set the sort direction for field: RateClassDefault (CMF.rate_class_default)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateClassDefaultSortDirection (boolean ascending) {
    this.RateClassDefaultSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateClassDefault (CMF.rate_class_default)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateClassDefaultSortDirection () {
    return this.RateClassDefaultSortAscending;
  }
  /** Set the field level filters for field: RateClassDefault (CMF.rate_class_default)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateClassDefaultFilter (IntegerFilter[] value) throws ServiceException {
    this.RateClassDefault = value;
  }
  /** Retrieve filter for field: RateClassDefault (CMF.rate_class_default)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRateClassDefaultFilter () {
    return this.RateClassDefault;
  }

  /**
   * Retrieves the RateClassDefaultFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateClassDefaultFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateClassDefaultFilter field
   */
  public String[] getRateClassDefaultFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassDefaultFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateClassDefaultFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassDefaultFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassDefaultFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassDefaultFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateClassDefaultFilter filter value from a formatted string
   *
   * @param _value the RateClassDefaultFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateClassDefaultFilter filter field
   */
  public void setRateClassDefaultFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateClassDefaultFilterFromFormattedString");
    try {
      this.setRateClassDefaultFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassDefaultFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassDefaultFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateClassDefaultFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated RateClassDefaultFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the RateClassDefaultFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RateClassDefaultFilter filter field
   */
  public String[] getRateClassDefaultFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassDefaultFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getRateClassDefaultFilter(), "RateClass", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassDefaultFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassDefaultFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassDefaultFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated RateClassDefaultFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the RateClassDefaultFilter filter field
   */
  public void setRateClassDefaultFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateClassDefaultFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setRateClassDefaultFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "RateClassDefault", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassDefaultFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassDefaultFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateClassDefaultFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: RateClassSpecial (CMF.rate_class_special)
   * @param fetch whether to fetch this field or not
   */
  public void setRateClassSpecialFetch (boolean fetch) {
    this.RateClassSpecialFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateClassSpecial (CMF.rate_class_special)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateClassSpecialFetch () {
    return this.RateClassSpecialFetch;
  }
  /** Set the SortOrder for field: RateClassSpecial (CMF.rate_class_special)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateClassSpecialSortOrder (Integer value) {
    this.RateClassSpecialSort = value;
  }
  /** Retrieve SortOrder for field: RateClassSpecial (CMF.rate_class_special)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateClassSpecialSortOrder () {
    return this.RateClassSpecialSort;
  }
  /** Set the sort direction for field: RateClassSpecial (CMF.rate_class_special)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateClassSpecialSortDirection (boolean ascending) {
    this.RateClassSpecialSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateClassSpecial (CMF.rate_class_special)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateClassSpecialSortDirection () {
    return this.RateClassSpecialSortAscending;
  }
  /** Set the field level filters for field: RateClassSpecial (CMF.rate_class_special)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateClassSpecialFilter (IntegerFilter[] value) throws ServiceException {
    this.RateClassSpecial = value;
  }
  /** Retrieve filter for field: RateClassSpecial (CMF.rate_class_special)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRateClassSpecialFilter () {
    return this.RateClassSpecial;
  }

  /**
   * Retrieves the RateClassSpecialFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateClassSpecialFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateClassSpecialFilter field
   */
  public String[] getRateClassSpecialFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassSpecialFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateClassSpecialFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassSpecialFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassSpecialFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassSpecialFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateClassSpecialFilter filter value from a formatted string
   *
   * @param _value the RateClassSpecialFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateClassSpecialFilter filter field
   */
  public void setRateClassSpecialFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateClassSpecialFilterFromFormattedString");
    try {
      this.setRateClassSpecialFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassSpecialFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassSpecialFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateClassSpecialFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated RateClassSpecialFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the RateClassSpecialFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RateClassSpecialFilter filter field
   */
  public String[] getRateClassSpecialFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassSpecialFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getRateClassSpecialFilter(), "RateClass", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassSpecialFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassSpecialFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassSpecialFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated RateClassSpecialFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the RateClassSpecialFilter filter field
   */
  public void setRateClassSpecialFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateClassSpecialFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setRateClassSpecialFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "RateClassSpecial", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassSpecialFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassSpecialFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateClassSpecialFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: ExrateClass (CMF.exrate_class)
   * @param fetch whether to fetch this field or not
   */
  public void setExrateClassFetch (boolean fetch) {
    this.ExrateClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExrateClass (CMF.exrate_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getExrateClassFetch () {
    return this.ExrateClassFetch;
  }
  /** Set the SortOrder for field: ExrateClass (CMF.exrate_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExrateClassSortOrder (Integer value) {
    this.ExrateClassSort = value;
  }
  /** Retrieve SortOrder for field: ExrateClass (CMF.exrate_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExrateClassSortOrder () {
    return this.ExrateClassSort;
  }
  /** Set the sort direction for field: ExrateClass (CMF.exrate_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExrateClassSortDirection (boolean ascending) {
    this.ExrateClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExrateClass (CMF.exrate_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExrateClassSortDirection () {
    return this.ExrateClassSortAscending;
  }
  /** Set the field level filters for field: ExrateClass (CMF.exrate_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExrateClassFilter (IntegerFilter[] value) throws ServiceException {
    this.ExrateClass = value;
  }
  /** Retrieve filter for field: ExrateClass (CMF.exrate_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getExrateClassFilter () {
    return this.ExrateClass;
  }

  /**
   * Retrieves the ExrateClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExrateClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExrateClassFilter field
   */
  public String[] getExrateClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExrateClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExrateClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExrateClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExrateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExrateClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExrateClassFilter filter value from a formatted string
   *
   * @param _value the ExrateClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExrateClassFilter filter field
   */
  public void setExrateClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExrateClassFilterFromFormattedString");
    try {
      this.setExrateClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExrateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExrateClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExrateClassFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated ExrateClassFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ExrateClassFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ExrateClassFilter filter field
   */
  public String[] getExrateClassFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExrateClassFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getExrateClassFilter(), "ExchangeRateClass", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExrateClassFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExrateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExrateClassFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated ExrateClassFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the ExrateClassFilter filter field
   */
  public void setExrateClassFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExrateClassFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setExrateClassFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "ExrateClass", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExrateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExrateClassFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExrateClassFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: PlanIdDiscount (CMF.plan_id_discount)
   * @param fetch whether to fetch this field or not
   */
  public void setPlanIdDiscountFetch (boolean fetch) {
    this.PlanIdDiscountFetch = fetch;
  }
  /** Retrieve Fetch value for field: PlanIdDiscount (CMF.plan_id_discount)
   * @return boolean the Fetch value for this field
   */
  public boolean getPlanIdDiscountFetch () {
    return this.PlanIdDiscountFetch;
  }
  /** Set the SortOrder for field: PlanIdDiscount (CMF.plan_id_discount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPlanIdDiscountSortOrder (Integer value) {
    this.PlanIdDiscountSort = value;
  }
  /** Retrieve SortOrder for field: PlanIdDiscount (CMF.plan_id_discount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPlanIdDiscountSortOrder () {
    return this.PlanIdDiscountSort;
  }
  /** Set the sort direction for field: PlanIdDiscount (CMF.plan_id_discount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPlanIdDiscountSortDirection (boolean ascending) {
    this.PlanIdDiscountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PlanIdDiscount (CMF.plan_id_discount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPlanIdDiscountSortDirection () {
    return this.PlanIdDiscountSortAscending;
  }
  /** Set the field level filters for field: PlanIdDiscount (CMF.plan_id_discount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPlanIdDiscountFilter (IntegerFilter[] value) throws ServiceException {
    this.PlanIdDiscount = value;
  }
  /** Retrieve filter for field: PlanIdDiscount (CMF.plan_id_discount)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPlanIdDiscountFilter () {
    return this.PlanIdDiscount;
  }

  /**
   * Retrieves the PlanIdDiscountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PlanIdDiscountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PlanIdDiscountFilter field
   */
  public String[] getPlanIdDiscountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPlanIdDiscountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPlanIdDiscountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPlanIdDiscountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PlanIdDiscountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPlanIdDiscountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PlanIdDiscountFilter filter value from a formatted string
   *
   * @param _value the PlanIdDiscountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PlanIdDiscountFilter filter field
   */
  public void setPlanIdDiscountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPlanIdDiscountFilterFromFormattedString");
    try {
      this.setPlanIdDiscountFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PlanIdDiscountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPlanIdDiscountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPlanIdDiscountFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated PlanIdDiscountFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the PlanIdDiscountFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PlanIdDiscountFilter filter field
   */
  public String[] getPlanIdDiscountFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPlanIdDiscountFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getPlanIdDiscountFilter(), "DiscountPlanType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPlanIdDiscountFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PlanIdDiscountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPlanIdDiscountFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated PlanIdDiscountFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the PlanIdDiscountFilter filter field
   */
  public void setPlanIdDiscountFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPlanIdDiscountFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setPlanIdDiscountFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "PlanIdDiscount", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PlanIdDiscountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPlanIdDiscountFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPlanIdDiscountFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: PlanIdCredit (CMF.plan_id_credit)
   * @param fetch whether to fetch this field or not
   */
  public void setPlanIdCreditFetch (boolean fetch) {
    this.PlanIdCreditFetch = fetch;
  }
  /** Retrieve Fetch value for field: PlanIdCredit (CMF.plan_id_credit)
   * @return boolean the Fetch value for this field
   */
  public boolean getPlanIdCreditFetch () {
    return this.PlanIdCreditFetch;
  }
  /** Set the SortOrder for field: PlanIdCredit (CMF.plan_id_credit)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPlanIdCreditSortOrder (Integer value) {
    this.PlanIdCreditSort = value;
  }
  /** Retrieve SortOrder for field: PlanIdCredit (CMF.plan_id_credit)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPlanIdCreditSortOrder () {
    return this.PlanIdCreditSort;
  }
  /** Set the sort direction for field: PlanIdCredit (CMF.plan_id_credit)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPlanIdCreditSortDirection (boolean ascending) {
    this.PlanIdCreditSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PlanIdCredit (CMF.plan_id_credit)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPlanIdCreditSortDirection () {
    return this.PlanIdCreditSortAscending;
  }
  /** Set the field level filters for field: PlanIdCredit (CMF.plan_id_credit)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPlanIdCreditFilter (IntegerFilter[] value) throws ServiceException {
    this.PlanIdCredit = value;
  }
  /** Retrieve filter for field: PlanIdCredit (CMF.plan_id_credit)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPlanIdCreditFilter () {
    return this.PlanIdCredit;
  }

  /**
   * Retrieves the PlanIdCreditFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PlanIdCreditFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PlanIdCreditFilter field
   */
  public String[] getPlanIdCreditFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPlanIdCreditFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPlanIdCreditFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPlanIdCreditFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PlanIdCreditFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPlanIdCreditFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PlanIdCreditFilter filter value from a formatted string
   *
   * @param _value the PlanIdCreditFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PlanIdCreditFilter filter field
   */
  public void setPlanIdCreditFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPlanIdCreditFilterFromFormattedString");
    try {
      this.setPlanIdCreditFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PlanIdCreditFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPlanIdCreditFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPlanIdCreditFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated PlanIdCreditFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the PlanIdCreditFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PlanIdCreditFilter filter field
   */
  public String[] getPlanIdCreditFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPlanIdCreditFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getPlanIdCreditFilter(), "UsageCreditPlanType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPlanIdCreditFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PlanIdCreditFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPlanIdCreditFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated PlanIdCreditFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the PlanIdCreditFilter filter field
   */
  public void setPlanIdCreditFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPlanIdCreditFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setPlanIdCreditFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "PlanIdCredit", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PlanIdCreditFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPlanIdCreditFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPlanIdCreditFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: AccountStatus (CMF.account_status)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountStatusFetch (boolean fetch) {
    this.AccountStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountStatus (CMF.account_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountStatusFetch () {
    return this.AccountStatusFetch;
  }
  /** Set the SortOrder for field: AccountStatus (CMF.account_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountStatusSortOrder (Integer value) {
    this.AccountStatusSort = value;
  }
  /** Retrieve SortOrder for field: AccountStatus (CMF.account_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountStatusSortOrder () {
    return this.AccountStatusSort;
  }
  /** Set the sort direction for field: AccountStatus (CMF.account_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountStatusSortDirection (boolean ascending) {
    this.AccountStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountStatus (CMF.account_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountStatusSortDirection () {
    return this.AccountStatusSortAscending;
  }
  /** Set the field level filters for field: AccountStatus (CMF.account_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountStatus = value;
  }
  /** Retrieve filter for field: AccountStatus (CMF.account_status)
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


  /** Set the field level Fetch value for field: AccountStatusDt (CMF.account_status_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountStatusDtFetch (boolean fetch) {
    this.AccountStatusDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountStatusDt (CMF.account_status_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountStatusDtFetch () {
    return this.AccountStatusDtFetch;
  }
  /** Set the SortOrder for field: AccountStatusDt (CMF.account_status_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountStatusDtSortOrder (Integer value) {
    this.AccountStatusDtSort = value;
  }
  /** Retrieve SortOrder for field: AccountStatusDt (CMF.account_status_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountStatusDtSortOrder () {
    return this.AccountStatusDtSort;
  }
  /** Set the sort direction for field: AccountStatusDt (CMF.account_status_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountStatusDtSortDirection (boolean ascending) {
    this.AccountStatusDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountStatusDt (CMF.account_status_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountStatusDtSortDirection () {
    return this.AccountStatusDtSortAscending;
  }
  /** Set the field level filters for field: AccountStatusDt (CMF.account_status_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountStatusDtFilter (DateFilter[] value) throws ServiceException {
    this.AccountStatusDt = value;
  }
  /** Retrieve filter for field: AccountStatusDt (CMF.account_status_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getAccountStatusDtFilter () {
    return this.AccountStatusDt;
  }

  /**
   * Retrieves the AccountStatusDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountStatusDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountStatusDtFilter field
   */
  public String[] getAccountStatusDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountStatusDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountStatusDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountStatusDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountStatusDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountStatusDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountStatusDtFilter filter value from a formatted string
   *
   * @param _value the AccountStatusDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountStatusDtFilter filter field
   */
  public void setAccountStatusDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountStatusDtFilterFromFormattedString");
    try {
      this.setAccountStatusDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountStatusDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountStatusDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountStatusDtFilterFromFormattedString");
  }

  /**
   * Retrieves the AccountStatusDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountStatusDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountStatusDtFilter field
   */
  public String[] getAccountStatusDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountStatusDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountStatusDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountStatusDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountStatusDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountStatusDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the AccountStatusDtFilter filter value from a formatted string
   *
   * @param _value the AccountStatusDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountStatusDtFilter filter field
   */
  public void setAccountStatusDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountStatusDtFilterFromFormattedDateTimeString");
    try {
      this.setAccountStatusDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountStatusDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountStatusDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountStatusDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: DistrChan (CMF.distr_chan)
   * @param fetch whether to fetch this field or not
   */
  public void setDistrChanFetch (boolean fetch) {
    this.DistrChanFetch = fetch;
  }
  /** Retrieve Fetch value for field: DistrChan (CMF.distr_chan)
   * @return boolean the Fetch value for this field
   */
  public boolean getDistrChanFetch () {
    return this.DistrChanFetch;
  }
  /** Set the SortOrder for field: DistrChan (CMF.distr_chan)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDistrChanSortOrder (Integer value) {
    this.DistrChanSort = value;
  }
  /** Retrieve SortOrder for field: DistrChan (CMF.distr_chan)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDistrChanSortOrder () {
    return this.DistrChanSort;
  }
  /** Set the sort direction for field: DistrChan (CMF.distr_chan)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDistrChanSortDirection (boolean ascending) {
    this.DistrChanSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DistrChan (CMF.distr_chan)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDistrChanSortDirection () {
    return this.DistrChanSortAscending;
  }
  /** Set the case insensitive for field: DistrChan (CMF.distr_chan)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDistrChanCaseInsensitive (boolean ascending) {
    this.DistrChanCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DistrChan (CMF.distr_chan)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDistrChanCaseInsensitive () {
    return this.DistrChanCaseInsensitive;
  }
  /** Set the field level filters for field: DistrChan (CMF.distr_chan)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDistrChanFilter (StringFilter[] value) throws ServiceException {
    this.DistrChan = value;
  }
  /** Retrieve filter for field: DistrChan (CMF.distr_chan)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDistrChanFilter () {
    return this.DistrChan;
  }

  /**
   * Retrieves the DistrChanFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DistrChanFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DistrChanFilter field
   */
  public String[] getDistrChanFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistrChanFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDistrChanFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDistrChanFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistrChanFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDistrChanFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DistrChanFilter filter value from a formatted string
   *
   * @param _value the DistrChanFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DistrChanFilter filter field
   */
  public void setDistrChanFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDistrChanFilterFromFormattedString");
    try {
      this.setDistrChanFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistrChanFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDistrChanFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDistrChanFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SalesCode (CMF.sales_code)
   * @param fetch whether to fetch this field or not
   */
  public void setSalesCodeFetch (boolean fetch) {
    this.SalesCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: SalesCode (CMF.sales_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getSalesCodeFetch () {
    return this.SalesCodeFetch;
  }
  /** Set the SortOrder for field: SalesCode (CMF.sales_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSalesCodeSortOrder (Integer value) {
    this.SalesCodeSort = value;
  }
  /** Retrieve SortOrder for field: SalesCode (CMF.sales_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSalesCodeSortOrder () {
    return this.SalesCodeSort;
  }
  /** Set the sort direction for field: SalesCode (CMF.sales_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSalesCodeSortDirection (boolean ascending) {
    this.SalesCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SalesCode (CMF.sales_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSalesCodeSortDirection () {
    return this.SalesCodeSortAscending;
  }
  /** Set the case insensitive for field: SalesCode (CMF.sales_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setSalesCodeCaseInsensitive (boolean ascending) {
    this.SalesCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: SalesCode (CMF.sales_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getSalesCodeCaseInsensitive () {
    return this.SalesCodeCaseInsensitive;
  }
  /** Set the field level filters for field: SalesCode (CMF.sales_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSalesCodeFilter (StringFilter[] value) throws ServiceException {
    this.SalesCode = value;
  }
  /** Retrieve filter for field: SalesCode (CMF.sales_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getSalesCodeFilter () {
    return this.SalesCode;
  }

  /**
   * Retrieves the SalesCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SalesCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SalesCodeFilter field
   */
  public String[] getSalesCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSalesCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSalesCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSalesCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SalesCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSalesCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SalesCodeFilter filter value from a formatted string
   *
   * @param _value the SalesCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SalesCodeFilter filter field
   */
  public void setSalesCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSalesCodeFilterFromFormattedString");
    try {
      this.setSalesCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SalesCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSalesCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSalesCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MktCode (CMF.mkt_code)
   * @param fetch whether to fetch this field or not
   */
  public void setMktCodeFetch (boolean fetch) {
    this.MktCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: MktCode (CMF.mkt_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getMktCodeFetch () {
    return this.MktCodeFetch;
  }
  /** Set the SortOrder for field: MktCode (CMF.mkt_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMktCodeSortOrder (Integer value) {
    this.MktCodeSort = value;
  }
  /** Retrieve SortOrder for field: MktCode (CMF.mkt_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMktCodeSortOrder () {
    return this.MktCodeSort;
  }
  /** Set the sort direction for field: MktCode (CMF.mkt_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMktCodeSortDirection (boolean ascending) {
    this.MktCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MktCode (CMF.mkt_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMktCodeSortDirection () {
    return this.MktCodeSortAscending;
  }
  /** Set the field level filters for field: MktCode (CMF.mkt_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMktCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.MktCode = value;
  }
  /** Retrieve filter for field: MktCode (CMF.mkt_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMktCodeFilter () {
    return this.MktCode;
  }

  /**
   * Retrieves the MktCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MktCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MktCodeFilter field
   */
  public String[] getMktCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMktCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMktCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMktCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MktCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMktCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MktCodeFilter filter value from a formatted string
   *
   * @param _value the MktCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MktCodeFilter filter field
   */
  public void setMktCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMktCodeFilterFromFormattedString");
    try {
      this.setMktCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MktCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMktCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMktCodeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated MktCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the MktCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the MktCodeFilter filter field
   */
  public String[] getMktCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMktCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getMktCodeFilter(), "MarketCode", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMktCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MktCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMktCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated MktCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the MktCodeFilter filter field
   */
  public void setMktCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMktCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setMktCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "MktCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MktCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMktCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMktCodeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: SicCode (CMF.sic_code)
   * @param fetch whether to fetch this field or not
   */
  public void setSicCodeFetch (boolean fetch) {
    this.SicCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: SicCode (CMF.sic_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getSicCodeFetch () {
    return this.SicCodeFetch;
  }
  /** Set the SortOrder for field: SicCode (CMF.sic_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSicCodeSortOrder (Integer value) {
    this.SicCodeSort = value;
  }
  /** Retrieve SortOrder for field: SicCode (CMF.sic_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSicCodeSortOrder () {
    return this.SicCodeSort;
  }
  /** Set the sort direction for field: SicCode (CMF.sic_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSicCodeSortDirection (boolean ascending) {
    this.SicCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SicCode (CMF.sic_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSicCodeSortDirection () {
    return this.SicCodeSortAscending;
  }
  /** Set the field level filters for field: SicCode (CMF.sic_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSicCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.SicCode = value;
  }
  /** Retrieve filter for field: SicCode (CMF.sic_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSicCodeFilter () {
    return this.SicCode;
  }

  /**
   * Retrieves the SicCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SicCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SicCodeFilter field
   */
  public String[] getSicCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSicCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSicCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSicCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SicCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSicCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SicCodeFilter filter value from a formatted string
   *
   * @param _value the SicCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SicCodeFilter filter field
   */
  public void setSicCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSicCodeFilterFromFormattedString");
    try {
      this.setSicCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SicCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSicCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSicCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: InUse (CMF.in_use)
   * @param fetch whether to fetch this field or not
   */
  public void setInUseFetch (boolean fetch) {
    this.InUseFetch = fetch;
  }
  /** Retrieve Fetch value for field: InUse (CMF.in_use)
   * @return boolean the Fetch value for this field
   */
  public boolean getInUseFetch () {
    return this.InUseFetch;
  }
  /** Set the SortOrder for field: InUse (CMF.in_use)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInUseSortOrder (Integer value) {
    this.InUseSort = value;
  }
  /** Retrieve SortOrder for field: InUse (CMF.in_use)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInUseSortOrder () {
    return this.InUseSort;
  }
  /** Set the sort direction for field: InUse (CMF.in_use)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInUseSortDirection (boolean ascending) {
    this.InUseSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InUse (CMF.in_use)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInUseSortDirection () {
    return this.InUseSortAscending;
  }
  /** Set the case insensitive for field: InUse (CMF.in_use)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setInUseCaseInsensitive (boolean ascending) {
    this.InUseCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: InUse (CMF.in_use)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getInUseCaseInsensitive () {
    return this.InUseCaseInsensitive;
  }
  /** Set the field level filters for field: InUse (CMF.in_use)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInUseFilter (StringFilter[] value) throws ServiceException {
    this.InUse = value;
  }
  /** Retrieve filter for field: InUse (CMF.in_use)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getInUseFilter () {
    return this.InUse;
  }

  /**
   * Retrieves the InUseFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InUseFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InUseFilter field
   */
  public String[] getInUseFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInUseFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInUseFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInUseFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InUseFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInUseFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InUseFilter filter value from a formatted string
   *
   * @param _value the InUseFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InUseFilter filter field
   */
  public void setInUseFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInUseFilterFromFormattedString");
    try {
      this.setInUseFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InUseFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInUseFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInUseFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CollectionIndicator (CMF.collection_indicator)
   * @param fetch whether to fetch this field or not
   */
  public void setCollectionIndicatorFetch (boolean fetch) {
    this.CollectionIndicatorFetch = fetch;
  }
  /** Retrieve Fetch value for field: CollectionIndicator (CMF.collection_indicator)
   * @return boolean the Fetch value for this field
   */
  public boolean getCollectionIndicatorFetch () {
    return this.CollectionIndicatorFetch;
  }
  /** Set the SortOrder for field: CollectionIndicator (CMF.collection_indicator)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCollectionIndicatorSortOrder (Integer value) {
    this.CollectionIndicatorSort = value;
  }
  /** Retrieve SortOrder for field: CollectionIndicator (CMF.collection_indicator)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCollectionIndicatorSortOrder () {
    return this.CollectionIndicatorSort;
  }
  /** Set the sort direction for field: CollectionIndicator (CMF.collection_indicator)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCollectionIndicatorSortDirection (boolean ascending) {
    this.CollectionIndicatorSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CollectionIndicator (CMF.collection_indicator)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCollectionIndicatorSortDirection () {
    return this.CollectionIndicatorSortAscending;
  }
  /** Set the field level filters for field: CollectionIndicator (CMF.collection_indicator)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCollectionIndicatorFilter (IntegerFilter[] value) throws ServiceException {
    this.CollectionIndicator = value;
  }
  /** Retrieve filter for field: CollectionIndicator (CMF.collection_indicator)
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

  /** Set the field level Fetch value for field: CollectionStatus (CMF.collection_status)
   * @param fetch whether to fetch this field or not
   */
  public void setCollectionStatusFetch (boolean fetch) {
    this.CollectionStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: CollectionStatus (CMF.collection_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getCollectionStatusFetch () {
    return this.CollectionStatusFetch;
  }
  /** Set the SortOrder for field: CollectionStatus (CMF.collection_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCollectionStatusSortOrder (Integer value) {
    this.CollectionStatusSort = value;
  }
  /** Retrieve SortOrder for field: CollectionStatus (CMF.collection_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCollectionStatusSortOrder () {
    return this.CollectionStatusSort;
  }
  /** Set the sort direction for field: CollectionStatus (CMF.collection_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCollectionStatusSortDirection (boolean ascending) {
    this.CollectionStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CollectionStatus (CMF.collection_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCollectionStatusSortDirection () {
    return this.CollectionStatusSortAscending;
  }
  /** Set the field level filters for field: CollectionStatus (CMF.collection_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCollectionStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.CollectionStatus = value;
  }
  /** Retrieve filter for field: CollectionStatus (CMF.collection_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCollectionStatusFilter () {
    return this.CollectionStatus;
  }

  /**
   * Retrieves the CollectionStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CollectionStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CollectionStatusFilter field
   */
  public String[] getCollectionStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCollectionStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCollectionStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCollectionStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CollectionStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCollectionStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CollectionStatusFilter filter value from a formatted string
   *
   * @param _value the CollectionStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CollectionStatusFilter filter field
   */
  public void setCollectionStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCollectionStatusFilterFromFormattedString");
    try {
      this.setCollectionStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CollectionStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCollectionStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCollectionStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CollectionHistory (CMF.collection_history)
   * @param fetch whether to fetch this field or not
   */
  public void setCollectionHistoryFetch (boolean fetch) {
    this.CollectionHistoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: CollectionHistory (CMF.collection_history)
   * @return boolean the Fetch value for this field
   */
  public boolean getCollectionHistoryFetch () {
    return this.CollectionHistoryFetch;
  }
  /** Set the SortOrder for field: CollectionHistory (CMF.collection_history)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCollectionHistorySortOrder (Integer value) {
    this.CollectionHistorySort = value;
  }
  /** Retrieve SortOrder for field: CollectionHistory (CMF.collection_history)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCollectionHistorySortOrder () {
    return this.CollectionHistorySort;
  }
  /** Set the sort direction for field: CollectionHistory (CMF.collection_history)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCollectionHistorySortDirection (boolean ascending) {
    this.CollectionHistorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CollectionHistory (CMF.collection_history)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCollectionHistorySortDirection () {
    return this.CollectionHistorySortAscending;
  }
  /** Set the case insensitive for field: CollectionHistory (CMF.collection_history)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCollectionHistoryCaseInsensitive (boolean ascending) {
    this.CollectionHistoryCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CollectionHistory (CMF.collection_history)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCollectionHistoryCaseInsensitive () {
    return this.CollectionHistoryCaseInsensitive;
  }
  /** Set the field level filters for field: CollectionHistory (CMF.collection_history)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCollectionHistoryFilter (StringFilter[] value) throws ServiceException {
    this.CollectionHistory = value;
  }
  /** Retrieve filter for field: CollectionHistory (CMF.collection_history)
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

  /** Set the field level Fetch value for field: VipCode (CMF.vip_code)
   * @param fetch whether to fetch this field or not
   */
  public void setVipCodeFetch (boolean fetch) {
    this.VipCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: VipCode (CMF.vip_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getVipCodeFetch () {
    return this.VipCodeFetch;
  }
  /** Set the SortOrder for field: VipCode (CMF.vip_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setVipCodeSortOrder (Integer value) {
    this.VipCodeSort = value;
  }
  /** Retrieve SortOrder for field: VipCode (CMF.vip_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getVipCodeSortOrder () {
    return this.VipCodeSort;
  }
  /** Set the sort direction for field: VipCode (CMF.vip_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setVipCodeSortDirection (boolean ascending) {
    this.VipCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: VipCode (CMF.vip_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getVipCodeSortDirection () {
    return this.VipCodeSortAscending;
  }
  /** Set the field level filters for field: VipCode (CMF.vip_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setVipCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.VipCode = value;
  }
  /** Retrieve filter for field: VipCode (CMF.vip_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getVipCodeFilter () {
    return this.VipCode;
  }

  /**
   * Retrieves the VipCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The VipCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the VipCodeFilter field
   */
  public String[] getVipCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVipCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getVipCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getVipCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("VipCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getVipCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the VipCodeFilter filter value from a formatted string
   *
   * @param _value the VipCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the VipCodeFilter filter field
   */
  public void setVipCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setVipCodeFilterFromFormattedString");
    try {
      this.setVipCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("VipCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setVipCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setVipCodeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated VipCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the VipCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the VipCodeFilter filter field
   */
  public String[] getVipCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVipCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getVipCodeFilter(), "VipCode", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getVipCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("VipCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getVipCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated VipCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the VipCodeFilter filter field
   */
  public void setVipCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setVipCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setVipCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "VipCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("VipCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setVipCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setVipCodeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: PurchaseOrder (CMF.purchase_order)
   * @param fetch whether to fetch this field or not
   */
  public void setPurchaseOrderFetch (boolean fetch) {
    this.PurchaseOrderFetch = fetch;
  }
  /** Retrieve Fetch value for field: PurchaseOrder (CMF.purchase_order)
   * @return boolean the Fetch value for this field
   */
  public boolean getPurchaseOrderFetch () {
    return this.PurchaseOrderFetch;
  }
  /** Set the SortOrder for field: PurchaseOrder (CMF.purchase_order)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPurchaseOrderSortOrder (Integer value) {
    this.PurchaseOrderSort = value;
  }
  /** Retrieve SortOrder for field: PurchaseOrder (CMF.purchase_order)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPurchaseOrderSortOrder () {
    return this.PurchaseOrderSort;
  }
  /** Set the sort direction for field: PurchaseOrder (CMF.purchase_order)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPurchaseOrderSortDirection (boolean ascending) {
    this.PurchaseOrderSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PurchaseOrder (CMF.purchase_order)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPurchaseOrderSortDirection () {
    return this.PurchaseOrderSortAscending;
  }
  /** Set the case insensitive for field: PurchaseOrder (CMF.purchase_order)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPurchaseOrderCaseInsensitive (boolean ascending) {
    this.PurchaseOrderCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PurchaseOrder (CMF.purchase_order)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPurchaseOrderCaseInsensitive () {
    return this.PurchaseOrderCaseInsensitive;
  }
  /** Set the field level filters for field: PurchaseOrder (CMF.purchase_order)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPurchaseOrderFilter (StringFilter[] value) throws ServiceException {
    this.PurchaseOrder = value;
  }
  /** Retrieve filter for field: PurchaseOrder (CMF.purchase_order)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPurchaseOrderFilter () {
    return this.PurchaseOrder;
  }

  /**
   * Retrieves the PurchaseOrderFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PurchaseOrderFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PurchaseOrderFilter field
   */
  public String[] getPurchaseOrderFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPurchaseOrderFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPurchaseOrderFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPurchaseOrderFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PurchaseOrderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPurchaseOrderFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PurchaseOrderFilter filter value from a formatted string
   *
   * @param _value the PurchaseOrderFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PurchaseOrderFilter filter field
   */
  public void setPurchaseOrderFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPurchaseOrderFilterFromFormattedString");
    try {
      this.setPurchaseOrderFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PurchaseOrderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPurchaseOrderFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPurchaseOrderFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Codeword (CMF.codeword)
   * @param fetch whether to fetch this field or not
   */
  public void setCodewordFetch (boolean fetch) {
    this.CodewordFetch = fetch;
  }
  /** Retrieve Fetch value for field: Codeword (CMF.codeword)
   * @return boolean the Fetch value for this field
   */
  public boolean getCodewordFetch () {
    return this.CodewordFetch;
  }
  /** Set the SortOrder for field: Codeword (CMF.codeword)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCodewordSortOrder (Integer value) {
    this.CodewordSort = value;
  }
  /** Retrieve SortOrder for field: Codeword (CMF.codeword)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCodewordSortOrder () {
    return this.CodewordSort;
  }
  /** Set the sort direction for field: Codeword (CMF.codeword)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCodewordSortDirection (boolean ascending) {
    this.CodewordSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Codeword (CMF.codeword)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCodewordSortDirection () {
    return this.CodewordSortAscending;
  }
  /** Set the case insensitive for field: Codeword (CMF.codeword)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCodewordCaseInsensitive (boolean ascending) {
    this.CodewordCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Codeword (CMF.codeword)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCodewordCaseInsensitive () {
    return this.CodewordCaseInsensitive;
  }
  /** Set the field level filters for field: Codeword (CMF.codeword)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCodewordFilter (StringFilter[] value) throws ServiceException {
    this.Codeword = value;
  }
  /** Retrieve filter for field: Codeword (CMF.codeword)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCodewordFilter () {
    return this.Codeword;
  }

  /**
   * Retrieves the CodewordFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CodewordFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CodewordFilter field
   */
  public String[] getCodewordFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCodewordFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCodewordFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCodewordFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CodewordFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCodewordFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CodewordFilter filter value from a formatted string
   *
   * @param _value the CodewordFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CodewordFilter filter field
   */
  public void setCodewordFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCodewordFilterFromFormattedString");
    try {
      this.setCodewordFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CodewordFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCodewordFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCodewordFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Remark (CMF.remark)
   * @param fetch whether to fetch this field or not
   */
  public void setRemarkFetch (boolean fetch) {
    this.RemarkFetch = fetch;
  }
  /** Retrieve Fetch value for field: Remark (CMF.remark)
   * @return boolean the Fetch value for this field
   */
  public boolean getRemarkFetch () {
    return this.RemarkFetch;
  }
  /** Set the SortOrder for field: Remark (CMF.remark)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRemarkSortOrder (Integer value) {
    this.RemarkSort = value;
  }
  /** Retrieve SortOrder for field: Remark (CMF.remark)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRemarkSortOrder () {
    return this.RemarkSort;
  }
  /** Set the sort direction for field: Remark (CMF.remark)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRemarkSortDirection (boolean ascending) {
    this.RemarkSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Remark (CMF.remark)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRemarkSortDirection () {
    return this.RemarkSortAscending;
  }
  /** Set the case insensitive for field: Remark (CMF.remark)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setRemarkCaseInsensitive (boolean ascending) {
    this.RemarkCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Remark (CMF.remark)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getRemarkCaseInsensitive () {
    return this.RemarkCaseInsensitive;
  }
  /** Set the field level filters for field: Remark (CMF.remark)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRemarkFilter (StringFilter[] value) throws ServiceException {
    this.Remark = value;
  }
  /** Retrieve filter for field: Remark (CMF.remark)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getRemarkFilter () {
    return this.Remark;
  }

  /**
   * Retrieves the RemarkFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RemarkFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RemarkFilter field
   */
  public String[] getRemarkFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRemarkFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRemarkFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRemarkFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RemarkFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRemarkFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RemarkFilter filter value from a formatted string
   *
   * @param _value the RemarkFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RemarkFilter filter field
   */
  public void setRemarkFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRemarkFilterFromFormattedString");
    try {
      this.setRemarkFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RemarkFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRemarkFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRemarkFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustEmail (CMF.cust_email)
   * @param fetch whether to fetch this field or not
   */
  public void setCustEmailFetch (boolean fetch) {
    this.CustEmailFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustEmail (CMF.cust_email)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustEmailFetch () {
    return this.CustEmailFetch;
  }
  /** Set the SortOrder for field: CustEmail (CMF.cust_email)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustEmailSortOrder (Integer value) {
    this.CustEmailSort = value;
  }
  /** Retrieve SortOrder for field: CustEmail (CMF.cust_email)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustEmailSortOrder () {
    return this.CustEmailSort;
  }
  /** Set the sort direction for field: CustEmail (CMF.cust_email)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustEmailSortDirection (boolean ascending) {
    this.CustEmailSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustEmail (CMF.cust_email)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustEmailSortDirection () {
    return this.CustEmailSortAscending;
  }
  /** Set the case insensitive for field: CustEmail (CMF.cust_email)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustEmailCaseInsensitive (boolean ascending) {
    this.CustEmailCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustEmail (CMF.cust_email)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustEmailCaseInsensitive () {
    return this.CustEmailCaseInsensitive;
  }
  /** Set the field level filters for field: CustEmail (CMF.cust_email)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustEmailFilter (StringFilter[] value) throws ServiceException {
    this.CustEmail = value;
  }
  /** Retrieve filter for field: CustEmail (CMF.cust_email)
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

  /** Set the field level Fetch value for field: StatementToEmail (CMF.statement_to_email)
   * @param fetch whether to fetch this field or not
   */
  public void setStatementToEmailFetch (boolean fetch) {
    this.StatementToEmailFetch = fetch;
  }
  /** Retrieve Fetch value for field: StatementToEmail (CMF.statement_to_email)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatementToEmailFetch () {
    return this.StatementToEmailFetch;
  }
  /** Set the SortOrder for field: StatementToEmail (CMF.statement_to_email)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatementToEmailSortOrder (Integer value) {
    this.StatementToEmailSort = value;
  }
  /** Retrieve SortOrder for field: StatementToEmail (CMF.statement_to_email)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatementToEmailSortOrder () {
    return this.StatementToEmailSort;
  }
  /** Set the sort direction for field: StatementToEmail (CMF.statement_to_email)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatementToEmailSortDirection (boolean ascending) {
    this.StatementToEmailSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StatementToEmail (CMF.statement_to_email)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatementToEmailSortDirection () {
    return this.StatementToEmailSortAscending;
  }
  /** Set the case insensitive for field: StatementToEmail (CMF.statement_to_email)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setStatementToEmailCaseInsensitive (boolean ascending) {
    this.StatementToEmailCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: StatementToEmail (CMF.statement_to_email)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getStatementToEmailCaseInsensitive () {
    return this.StatementToEmailCaseInsensitive;
  }
  /** Set the field level filters for field: StatementToEmail (CMF.statement_to_email)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatementToEmailFilter (StringFilter[] value) throws ServiceException {
    this.StatementToEmail = value;
  }
  /** Retrieve filter for field: StatementToEmail (CMF.statement_to_email)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getStatementToEmailFilter () {
    return this.StatementToEmail;
  }

  /**
   * Retrieves the StatementToEmailFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatementToEmailFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementToEmailFilter field
   */
  public String[] getStatementToEmailFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementToEmailFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatementToEmailFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementToEmailFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementToEmailFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementToEmailFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatementToEmailFilter filter value from a formatted string
   *
   * @param _value the StatementToEmailFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatementToEmailFilter filter field
   */
  public void setStatementToEmailFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatementToEmailFilterFromFormattedString");
    try {
      this.setStatementToEmailFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementToEmailFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementToEmailFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatementToEmailFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ChgWho (CMF.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (CMF.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (CMF.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (CMF.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (CMF.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (CMF.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (CMF.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (CMF.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (CMF.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (CMF.chg_who)
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

  /** Set the field level Fetch value for field: ChgDate (CMF.chg_date)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDateFetch (boolean fetch) {
    this.ChgDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDate (CMF.chg_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDateFetch () {
    return this.ChgDateFetch;
  }
  /** Set the SortOrder for field: ChgDate (CMF.chg_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDateSortOrder (Integer value) {
    this.ChgDateSort = value;
  }
  /** Retrieve SortOrder for field: ChgDate (CMF.chg_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDateSortOrder () {
    return this.ChgDateSort;
  }
  /** Set the sort direction for field: ChgDate (CMF.chg_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDateSortDirection (boolean ascending) {
    this.ChgDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDate (CMF.chg_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDateSortDirection () {
    return this.ChgDateSortAscending;
  }
  /** Set the field level filters for field: ChgDate (CMF.chg_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDateFilter (DateFilter[] value) throws ServiceException {
    this.ChgDate = value;
  }
  /** Retrieve filter for field: ChgDate (CMF.chg_date)
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


  /** Set the field level Fetch value for field: DateCreated (CMF.date_created)
   * @param fetch whether to fetch this field or not
   */
  public void setDateCreatedFetch (boolean fetch) {
    this.DateCreatedFetch = fetch;
  }
  /** Retrieve Fetch value for field: DateCreated (CMF.date_created)
   * @return boolean the Fetch value for this field
   */
  public boolean getDateCreatedFetch () {
    return this.DateCreatedFetch;
  }
  /** Set the SortOrder for field: DateCreated (CMF.date_created)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDateCreatedSortOrder (Integer value) {
    this.DateCreatedSort = value;
  }
  /** Retrieve SortOrder for field: DateCreated (CMF.date_created)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDateCreatedSortOrder () {
    return this.DateCreatedSort;
  }
  /** Set the sort direction for field: DateCreated (CMF.date_created)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDateCreatedSortDirection (boolean ascending) {
    this.DateCreatedSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DateCreated (CMF.date_created)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDateCreatedSortDirection () {
    return this.DateCreatedSortAscending;
  }
  /** Set the field level filters for field: DateCreated (CMF.date_created)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDateCreatedFilter (DateFilter[] value) throws ServiceException {
    this.DateCreated = value;
  }
  /** Retrieve filter for field: DateCreated (CMF.date_created)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getDateCreatedFilter () {
    return this.DateCreated;
  }

  /**
   * Retrieves the DateCreatedFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateCreatedFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateCreatedFilter field
   */
  public String[] getDateCreatedFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateCreatedFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateCreatedFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateCreatedFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateCreatedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateCreatedFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DateCreatedFilter filter value from a formatted string
   *
   * @param _value the DateCreatedFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateCreatedFilter filter field
   */
  public void setDateCreatedFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateCreatedFilterFromFormattedString");
    try {
      this.setDateCreatedFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateCreatedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateCreatedFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateCreatedFilterFromFormattedString");
  }

  /**
   * Retrieves the DateCreatedFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateCreatedFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateCreatedFilter field
   */
  public String[] getDateCreatedFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateCreatedFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateCreatedFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateCreatedFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateCreatedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateCreatedFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateCreatedFilter filter value from a formatted string
   *
   * @param _value the DateCreatedFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateCreatedFilter filter field
   */
  public void setDateCreatedFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateCreatedFilterFromFormattedDateTimeString");
    try {
      this.setDateCreatedFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateCreatedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateCreatedFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateCreatedFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: DateActive (CMF.date_active)
   * @param fetch whether to fetch this field or not
   */
  public void setDateActiveFetch (boolean fetch) {
    this.DateActiveFetch = fetch;
  }
  /** Retrieve Fetch value for field: DateActive (CMF.date_active)
   * @return boolean the Fetch value for this field
   */
  public boolean getDateActiveFetch () {
    return this.DateActiveFetch;
  }
  /** Set the SortOrder for field: DateActive (CMF.date_active)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDateActiveSortOrder (Integer value) {
    this.DateActiveSort = value;
  }
  /** Retrieve SortOrder for field: DateActive (CMF.date_active)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDateActiveSortOrder () {
    return this.DateActiveSort;
  }
  /** Set the sort direction for field: DateActive (CMF.date_active)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDateActiveSortDirection (boolean ascending) {
    this.DateActiveSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DateActive (CMF.date_active)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDateActiveSortDirection () {
    return this.DateActiveSortAscending;
  }
  /** Set the field level filters for field: DateActive (CMF.date_active)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDateActiveFilter (DateFilter[] value) throws ServiceException {
    this.DateActive = value;
  }
  /** Retrieve filter for field: DateActive (CMF.date_active)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getDateActiveFilter () {
    return this.DateActive;
  }

  /**
   * Retrieves the DateActiveFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateActiveFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateActiveFilter field
   */
  public String[] getDateActiveFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateActiveFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateActiveFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateActiveFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateActiveFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DateActiveFilter filter value from a formatted string
   *
   * @param _value the DateActiveFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateActiveFilter filter field
   */
  public void setDateActiveFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateActiveFilterFromFormattedString");
    try {
      this.setDateActiveFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateActiveFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateActiveFilterFromFormattedString");
  }

  /**
   * Retrieves the DateActiveFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateActiveFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateActiveFilter field
   */
  public String[] getDateActiveFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateActiveFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateActiveFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateActiveFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateActiveFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateActiveFilter filter value from a formatted string
   *
   * @param _value the DateActiveFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateActiveFilter filter field
   */
  public void setDateActiveFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateActiveFilterFromFormattedDateTimeString");
    try {
      this.setDateActiveFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateActiveFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateActiveFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: DateInactive (CMF.date_inactive)
   * @param fetch whether to fetch this field or not
   */
  public void setDateInactiveFetch (boolean fetch) {
    this.DateInactiveFetch = fetch;
  }
  /** Retrieve Fetch value for field: DateInactive (CMF.date_inactive)
   * @return boolean the Fetch value for this field
   */
  public boolean getDateInactiveFetch () {
    return this.DateInactiveFetch;
  }
  /** Set the SortOrder for field: DateInactive (CMF.date_inactive)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDateInactiveSortOrder (Integer value) {
    this.DateInactiveSort = value;
  }
  /** Retrieve SortOrder for field: DateInactive (CMF.date_inactive)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDateInactiveSortOrder () {
    return this.DateInactiveSort;
  }
  /** Set the sort direction for field: DateInactive (CMF.date_inactive)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDateInactiveSortDirection (boolean ascending) {
    this.DateInactiveSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DateInactive (CMF.date_inactive)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDateInactiveSortDirection () {
    return this.DateInactiveSortAscending;
  }
  /** Set the field level filters for field: DateInactive (CMF.date_inactive)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDateInactiveFilter (DateFilter[] value) throws ServiceException {
    this.DateInactive = value;
  }
  /** Retrieve filter for field: DateInactive (CMF.date_inactive)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getDateInactiveFilter () {
    return this.DateInactive;
  }

  /**
   * Retrieves the DateInactiveFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateInactiveFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateInactiveFilter field
   */
  public String[] getDateInactiveFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateInactiveFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateInactiveFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateInactiveFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DateInactiveFilter filter value from a formatted string
   *
   * @param _value the DateInactiveFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateInactiveFilter filter field
   */
  public void setDateInactiveFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateInactiveFilterFromFormattedString");
    try {
      this.setDateInactiveFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateInactiveFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateInactiveFilterFromFormattedString");
  }

  /**
   * Retrieves the DateInactiveFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateInactiveFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateInactiveFilter field
   */
  public String[] getDateInactiveFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateInactiveFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateInactiveFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateInactiveFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateInactiveFilter filter value from a formatted string
   *
   * @param _value the DateInactiveFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateInactiveFilter filter field
   */
  public void setDateInactiveFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateInactiveFilterFromFormattedDateTimeString");
    try {
      this.setDateInactiveFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateInactiveFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateInactiveFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: OwningCostCtr (CMF.owning_cost_ctr)
   * @param fetch whether to fetch this field or not
   */
  public void setOwningCostCtrFetch (boolean fetch) {
    this.OwningCostCtrFetch = fetch;
  }
  /** Retrieve Fetch value for field: OwningCostCtr (CMF.owning_cost_ctr)
   * @return boolean the Fetch value for this field
   */
  public boolean getOwningCostCtrFetch () {
    return this.OwningCostCtrFetch;
  }
  /** Set the SortOrder for field: OwningCostCtr (CMF.owning_cost_ctr)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOwningCostCtrSortOrder (Integer value) {
    this.OwningCostCtrSort = value;
  }
  /** Retrieve SortOrder for field: OwningCostCtr (CMF.owning_cost_ctr)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOwningCostCtrSortOrder () {
    return this.OwningCostCtrSort;
  }
  /** Set the sort direction for field: OwningCostCtr (CMF.owning_cost_ctr)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOwningCostCtrSortDirection (boolean ascending) {
    this.OwningCostCtrSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OwningCostCtr (CMF.owning_cost_ctr)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOwningCostCtrSortDirection () {
    return this.OwningCostCtrSortAscending;
  }
  /** Set the field level filters for field: OwningCostCtr (CMF.owning_cost_ctr)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOwningCostCtrFilter (IntegerFilter[] value) throws ServiceException {
    this.OwningCostCtr = value;
  }
  /** Retrieve filter for field: OwningCostCtr (CMF.owning_cost_ctr)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOwningCostCtrFilter () {
    return this.OwningCostCtr;
  }

  /**
   * Retrieves the OwningCostCtrFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OwningCostCtrFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OwningCostCtrFilter field
   */
  public String[] getOwningCostCtrFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningCostCtrFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOwningCostCtrFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningCostCtrFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwningCostCtrFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwningCostCtrFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OwningCostCtrFilter filter value from a formatted string
   *
   * @param _value the OwningCostCtrFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OwningCostCtrFilter filter field
   */
  public void setOwningCostCtrFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOwningCostCtrFilterFromFormattedString");
    try {
      this.setOwningCostCtrFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwningCostCtrFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwningCostCtrFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwningCostCtrFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated OwningCostCtrFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the OwningCostCtrFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OwningCostCtrFilter filter field
   */
  public String[] getOwningCostCtrFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningCostCtrFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getOwningCostCtrFilter(), "OwningCostCenter", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningCostCtrFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwningCostCtrFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwningCostCtrFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated OwningCostCtrFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the OwningCostCtrFilter filter field
   */
  public void setOwningCostCtrFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOwningCostCtrFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setOwningCostCtrFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "OwningCostCtr", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwningCostCtrFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwningCostCtrFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwningCostCtrFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: AcctSegId (CMF.acct_seg_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAcctSegIdFetch (boolean fetch) {
    this.AcctSegIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AcctSegId (CMF.acct_seg_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAcctSegIdFetch () {
    return this.AcctSegIdFetch;
  }
  /** Set the SortOrder for field: AcctSegId (CMF.acct_seg_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAcctSegIdSortOrder (Integer value) {
    this.AcctSegIdSort = value;
  }
  /** Retrieve SortOrder for field: AcctSegId (CMF.acct_seg_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAcctSegIdSortOrder () {
    return this.AcctSegIdSort;
  }
  /** Set the sort direction for field: AcctSegId (CMF.acct_seg_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAcctSegIdSortDirection (boolean ascending) {
    this.AcctSegIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AcctSegId (CMF.acct_seg_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAcctSegIdSortDirection () {
    return this.AcctSegIdSortAscending;
  }
  /** Set the field level filters for field: AcctSegId (CMF.acct_seg_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAcctSegIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AcctSegId = value;
  }
  /** Retrieve filter for field: AcctSegId (CMF.acct_seg_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAcctSegIdFilter () {
    return this.AcctSegId;
  }

  /**
   * Retrieves the AcctSegIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AcctSegIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcctSegIdFilter field
   */
  public String[] getAcctSegIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcctSegIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAcctSegIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcctSegIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcctSegIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcctSegIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AcctSegIdFilter filter value from a formatted string
   *
   * @param _value the AcctSegIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AcctSegIdFilter filter field
   */
  public void setAcctSegIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAcctSegIdFilterFromFormattedString");
    try {
      this.setAcctSegIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcctSegIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcctSegIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcctSegIdFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated AcctSegIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AcctSegIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AcctSegIdFilter filter field
   */
  public String[] getAcctSegIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcctSegIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getAcctSegIdFilter(), "AccountSegment", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcctSegIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcctSegIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcctSegIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated AcctSegIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the AcctSegIdFilter filter field
   */
  public void setAcctSegIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAcctSegIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setAcctSegIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "AcctSegId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcctSegIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcctSegIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcctSegIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: Converted (CMF.converted)
   * @param fetch whether to fetch this field or not
   */
  public void setConvertedFetch (boolean fetch) {
    this.ConvertedFetch = fetch;
  }
  /** Retrieve Fetch value for field: Converted (CMF.converted)
   * @return boolean the Fetch value for this field
   */
  public boolean getConvertedFetch () {
    return this.ConvertedFetch;
  }
  /** Set the SortOrder for field: Converted (CMF.converted)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConvertedSortOrder (Integer value) {
    this.ConvertedSort = value;
  }
  /** Retrieve SortOrder for field: Converted (CMF.converted)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConvertedSortOrder () {
    return this.ConvertedSort;
  }
  /** Set the sort direction for field: Converted (CMF.converted)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConvertedSortDirection (boolean ascending) {
    this.ConvertedSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Converted (CMF.converted)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConvertedSortDirection () {
    return this.ConvertedSortAscending;
  }
  /** Set the field level filters for field: Converted (CMF.converted)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConvertedFilter (IntegerFilter[] value) throws ServiceException {
    this.Converted = value;
  }
  /** Retrieve filter for field: Converted (CMF.converted)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getConvertedFilter () {
    return this.Converted;
  }

  /**
   * Retrieves the ConvertedFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ConvertedFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConvertedFilter field
   */
  public String[] getConvertedFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConvertedFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getConvertedFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConvertedFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConvertedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getConvertedFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ConvertedFilter filter value from a formatted string
   *
   * @param _value the ConvertedFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ConvertedFilter filter field
   */
  public void setConvertedFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setConvertedFilterFromFormattedString");
    try {
      this.setConvertedFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConvertedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setConvertedFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConvertedFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ChargeThreshold (CMF.charge_threshold)
   * @param fetch whether to fetch this field or not
   */
  public void setChargeThresholdFetch (boolean fetch) {
    this.ChargeThresholdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChargeThreshold (CMF.charge_threshold)
   * @return boolean the Fetch value for this field
   */
  public boolean getChargeThresholdFetch () {
    return this.ChargeThresholdFetch;
  }
  /** Set the SortOrder for field: ChargeThreshold (CMF.charge_threshold)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChargeThresholdSortOrder (Integer value) {
    this.ChargeThresholdSort = value;
  }
  /** Retrieve SortOrder for field: ChargeThreshold (CMF.charge_threshold)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChargeThresholdSortOrder () {
    return this.ChargeThresholdSort;
  }
  /** Set the sort direction for field: ChargeThreshold (CMF.charge_threshold)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChargeThresholdSortDirection (boolean ascending) {
    this.ChargeThresholdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChargeThreshold (CMF.charge_threshold)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChargeThresholdSortDirection () {
    return this.ChargeThresholdSortAscending;
  }
  /** Set the field level filters for field: ChargeThreshold (CMF.charge_threshold)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChargeThresholdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ChargeThreshold = value;
  }
  /** Retrieve filter for field: ChargeThreshold (CMF.charge_threshold)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getChargeThresholdFilter () {
    return this.ChargeThreshold;
  }

  /**
   * Retrieves the ChargeThresholdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChargeThresholdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChargeThresholdFilter field
   */
  public String[] getChargeThresholdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeThresholdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChargeThresholdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeThresholdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChargeThresholdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChargeThresholdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChargeThresholdFilter filter value from a formatted string
   *
   * @param _value the ChargeThresholdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChargeThresholdFilter filter field
   */
  public void setChargeThresholdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChargeThresholdFilterFromFormattedString");
    try {
      this.setChargeThresholdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChargeThresholdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChargeThresholdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChargeThresholdFilterFromFormattedString");
  }

  /**
   * Sets the ChargeThresholdFilter filter value from a formatted string
   *
   * @param _value the ChargeThresholdFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChargeThresholdFilter filter field
   */
  public void setChargeThresholdFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChargeThresholdFilterFromFormattedCurrencyString");
    try {
      this.setChargeThresholdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChargeThresholdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChargeThresholdFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChargeThresholdFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the ChargeThresholdFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChargeThresholdFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChargeThresholdFilter field
   */

  public String[] getChargeThresholdFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeThresholdFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChargeThresholdFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeThresholdFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChargeThresholdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChargeThresholdFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: Threshold (CMF.threshold)
   * @param fetch whether to fetch this field or not
   */
  public void setThresholdFetch (boolean fetch) {
    this.ThresholdFetch = fetch;
  }
  /** Retrieve Fetch value for field: Threshold (CMF.threshold)
   * @return boolean the Fetch value for this field
   */
  public boolean getThresholdFetch () {
    return this.ThresholdFetch;
  }
  /** Set the SortOrder for field: Threshold (CMF.threshold)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setThresholdSortOrder (Integer value) {
    this.ThresholdSort = value;
  }
  /** Retrieve SortOrder for field: Threshold (CMF.threshold)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getThresholdSortOrder () {
    return this.ThresholdSort;
  }
  /** Set the sort direction for field: Threshold (CMF.threshold)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setThresholdSortDirection (boolean ascending) {
    this.ThresholdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Threshold (CMF.threshold)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getThresholdSortDirection () {
    return this.ThresholdSortAscending;
  }
  /** Set the field level filters for field: Threshold (CMF.threshold)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setThresholdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.Threshold = value;
  }
  /** Retrieve filter for field: Threshold (CMF.threshold)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getThresholdFilter () {
    return this.Threshold;
  }

  /**
   * Retrieves the ThresholdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ThresholdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ThresholdFilter field
   */
  public String[] getThresholdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThresholdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getThresholdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getThresholdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ThresholdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getThresholdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ThresholdFilter filter value from a formatted string
   *
   * @param _value the ThresholdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ThresholdFilter filter field
   */
  public void setThresholdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setThresholdFilterFromFormattedString");
    try {
      this.setThresholdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ThresholdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setThresholdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setThresholdFilterFromFormattedString");
  }

  /**
   * Sets the ThresholdFilter filter value from a formatted string
   *
   * @param _value the ThresholdFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ThresholdFilter filter field
   */
  public void setThresholdFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setThresholdFilterFromFormattedCurrencyString");
    try {
      this.setThresholdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ThresholdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setThresholdFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setThresholdFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the ThresholdFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ThresholdFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the ThresholdFilter field
   */

  public String[] getThresholdFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThresholdFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getThresholdFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getThresholdFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ThresholdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getThresholdFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: CyclicalThreshold (CMF.cyclical_threshold)
   * @param fetch whether to fetch this field or not
   */
  public void setCyclicalThresholdFetch (boolean fetch) {
    this.CyclicalThresholdFetch = fetch;
  }
  /** Retrieve Fetch value for field: CyclicalThreshold (CMF.cyclical_threshold)
   * @return boolean the Fetch value for this field
   */
  public boolean getCyclicalThresholdFetch () {
    return this.CyclicalThresholdFetch;
  }
  /** Set the SortOrder for field: CyclicalThreshold (CMF.cyclical_threshold)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCyclicalThresholdSortOrder (Integer value) {
    this.CyclicalThresholdSort = value;
  }
  /** Retrieve SortOrder for field: CyclicalThreshold (CMF.cyclical_threshold)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCyclicalThresholdSortOrder () {
    return this.CyclicalThresholdSort;
  }
  /** Set the sort direction for field: CyclicalThreshold (CMF.cyclical_threshold)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCyclicalThresholdSortDirection (boolean ascending) {
    this.CyclicalThresholdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CyclicalThreshold (CMF.cyclical_threshold)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCyclicalThresholdSortDirection () {
    return this.CyclicalThresholdSortAscending;
  }
  /** Set the field level filters for field: CyclicalThreshold (CMF.cyclical_threshold)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCyclicalThresholdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.CyclicalThreshold = value;
  }
  /** Retrieve filter for field: CyclicalThreshold (CMF.cyclical_threshold)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCyclicalThresholdFilter () {
    return this.CyclicalThreshold;
  }

  /**
   * Retrieves the CyclicalThresholdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CyclicalThresholdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CyclicalThresholdFilter field
   */
  public String[] getCyclicalThresholdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCyclicalThresholdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCyclicalThresholdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCyclicalThresholdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CyclicalThresholdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCyclicalThresholdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CyclicalThresholdFilter filter value from a formatted string
   *
   * @param _value the CyclicalThresholdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CyclicalThresholdFilter filter field
   */
  public void setCyclicalThresholdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCyclicalThresholdFilterFromFormattedString");
    try {
      this.setCyclicalThresholdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CyclicalThresholdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCyclicalThresholdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCyclicalThresholdFilterFromFormattedString");
  }

  /**
   * Sets the CyclicalThresholdFilter filter value from a formatted string
   *
   * @param _value the CyclicalThresholdFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CyclicalThresholdFilter filter field
   */
  public void setCyclicalThresholdFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCyclicalThresholdFilterFromFormattedCurrencyString");
    try {
      this.setCyclicalThresholdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CyclicalThresholdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCyclicalThresholdFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCyclicalThresholdFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the CyclicalThresholdFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CyclicalThresholdFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the CyclicalThresholdFilter field
   */

  public String[] getCyclicalThresholdFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCyclicalThresholdFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCyclicalThresholdFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCyclicalThresholdFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CyclicalThresholdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCyclicalThresholdFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: UsgAmtLimit (CMF.usg_amt_limit)
   * @param fetch whether to fetch this field or not
   */
  public void setUsgAmtLimitFetch (boolean fetch) {
    this.UsgAmtLimitFetch = fetch;
  }
  /** Retrieve Fetch value for field: UsgAmtLimit (CMF.usg_amt_limit)
   * @return boolean the Fetch value for this field
   */
  public boolean getUsgAmtLimitFetch () {
    return this.UsgAmtLimitFetch;
  }
  /** Set the SortOrder for field: UsgAmtLimit (CMF.usg_amt_limit)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUsgAmtLimitSortOrder (Integer value) {
    this.UsgAmtLimitSort = value;
  }
  /** Retrieve SortOrder for field: UsgAmtLimit (CMF.usg_amt_limit)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUsgAmtLimitSortOrder () {
    return this.UsgAmtLimitSort;
  }
  /** Set the sort direction for field: UsgAmtLimit (CMF.usg_amt_limit)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUsgAmtLimitSortDirection (boolean ascending) {
    this.UsgAmtLimitSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UsgAmtLimit (CMF.usg_amt_limit)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUsgAmtLimitSortDirection () {
    return this.UsgAmtLimitSortAscending;
  }
  /** Set the field level filters for field: UsgAmtLimit (CMF.usg_amt_limit)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUsgAmtLimitFilter (BigIntegerFilter[] value) throws ServiceException {
    this.UsgAmtLimit = value;
  }
  /** Retrieve filter for field: UsgAmtLimit (CMF.usg_amt_limit)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getUsgAmtLimitFilter () {
    return this.UsgAmtLimit;
  }

  /**
   * Retrieves the UsgAmtLimitFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UsgAmtLimitFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsgAmtLimitFilter field
   */
  public String[] getUsgAmtLimitFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsgAmtLimitFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUsgAmtLimitFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsgAmtLimitFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsgAmtLimitFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsgAmtLimitFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UsgAmtLimitFilter filter value from a formatted string
   *
   * @param _value the UsgAmtLimitFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UsgAmtLimitFilter filter field
   */
  public void setUsgAmtLimitFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUsgAmtLimitFilterFromFormattedString");
    try {
      this.setUsgAmtLimitFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsgAmtLimitFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsgAmtLimitFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsgAmtLimitFilterFromFormattedString");
  }

  /**
   * Sets the UsgAmtLimitFilter filter value from a formatted string
   *
   * @param _value the UsgAmtLimitFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UsgAmtLimitFilter filter field
   */
  public void setUsgAmtLimitFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUsgAmtLimitFilterFromFormattedCurrencyString");
    try {
      this.setUsgAmtLimitFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsgAmtLimitFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsgAmtLimitFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsgAmtLimitFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the UsgAmtLimitFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UsgAmtLimitFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsgAmtLimitFilter field
   */

  public String[] getUsgAmtLimitFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsgAmtLimitFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUsgAmtLimitFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsgAmtLimitFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsgAmtLimitFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsgAmtLimitFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: UsgUnitsLimit (CMF.usg_units_limit)
   * @param fetch whether to fetch this field or not
   */
  public void setUsgUnitsLimitFetch (boolean fetch) {
    this.UsgUnitsLimitFetch = fetch;
  }
  /** Retrieve Fetch value for field: UsgUnitsLimit (CMF.usg_units_limit)
   * @return boolean the Fetch value for this field
   */
  public boolean getUsgUnitsLimitFetch () {
    return this.UsgUnitsLimitFetch;
  }
  /** Set the SortOrder for field: UsgUnitsLimit (CMF.usg_units_limit)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUsgUnitsLimitSortOrder (Integer value) {
    this.UsgUnitsLimitSort = value;
  }
  /** Retrieve SortOrder for field: UsgUnitsLimit (CMF.usg_units_limit)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUsgUnitsLimitSortOrder () {
    return this.UsgUnitsLimitSort;
  }
  /** Set the sort direction for field: UsgUnitsLimit (CMF.usg_units_limit)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUsgUnitsLimitSortDirection (boolean ascending) {
    this.UsgUnitsLimitSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UsgUnitsLimit (CMF.usg_units_limit)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUsgUnitsLimitSortDirection () {
    return this.UsgUnitsLimitSortAscending;
  }
  /** Set the field level filters for field: UsgUnitsLimit (CMF.usg_units_limit)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUsgUnitsLimitFilter (BigIntegerFilter[] value) throws ServiceException {
    this.UsgUnitsLimit = value;
  }
  /** Retrieve filter for field: UsgUnitsLimit (CMF.usg_units_limit)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getUsgUnitsLimitFilter () {
    return this.UsgUnitsLimit;
  }

  /**
   * Retrieves the UsgUnitsLimitFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UsgUnitsLimitFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsgUnitsLimitFilter field
   */
  public String[] getUsgUnitsLimitFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsgUnitsLimitFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUsgUnitsLimitFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsgUnitsLimitFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsgUnitsLimitFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsgUnitsLimitFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UsgUnitsLimitFilter filter value from a formatted string
   *
   * @param _value the UsgUnitsLimitFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UsgUnitsLimitFilter filter field
   */
  public void setUsgUnitsLimitFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUsgUnitsLimitFilterFromFormattedString");
    try {
      this.setUsgUnitsLimitFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsgUnitsLimitFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsgUnitsLimitFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsgUnitsLimitFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RegulatoryId (CMF.regulatory_id)
   * @param fetch whether to fetch this field or not
   */
  public void setRegulatoryIdFetch (boolean fetch) {
    this.RegulatoryIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: RegulatoryId (CMF.regulatory_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getRegulatoryIdFetch () {
    return this.RegulatoryIdFetch;
  }
  /** Set the SortOrder for field: RegulatoryId (CMF.regulatory_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRegulatoryIdSortOrder (Integer value) {
    this.RegulatoryIdSort = value;
  }
  /** Retrieve SortOrder for field: RegulatoryId (CMF.regulatory_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRegulatoryIdSortOrder () {
    return this.RegulatoryIdSort;
  }
  /** Set the sort direction for field: RegulatoryId (CMF.regulatory_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRegulatoryIdSortDirection (boolean ascending) {
    this.RegulatoryIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RegulatoryId (CMF.regulatory_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRegulatoryIdSortDirection () {
    return this.RegulatoryIdSortAscending;
  }
  /** Set the field level filters for field: RegulatoryId (CMF.regulatory_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRegulatoryIdFilter (IntegerFilter[] value) throws ServiceException {
    this.RegulatoryId = value;
  }
  /** Retrieve filter for field: RegulatoryId (CMF.regulatory_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRegulatoryIdFilter () {
    return this.RegulatoryId;
  }

  /**
   * Retrieves the RegulatoryIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RegulatoryIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RegulatoryIdFilter field
   */
  public String[] getRegulatoryIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRegulatoryIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRegulatoryIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRegulatoryIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RegulatoryIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRegulatoryIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RegulatoryIdFilter filter value from a formatted string
   *
   * @param _value the RegulatoryIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RegulatoryIdFilter filter field
   */
  public void setRegulatoryIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRegulatoryIdFilterFromFormattedString");
    try {
      this.setRegulatoryIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RegulatoryIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRegulatoryIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRegulatoryIdFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated RegulatoryIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the RegulatoryIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RegulatoryIdFilter filter field
   */
  public String[] getRegulatoryIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRegulatoryIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getRegulatoryIdFilter(), "RegulatoryId", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRegulatoryIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RegulatoryIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRegulatoryIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated RegulatoryIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the RegulatoryIdFilter filter field
   */
  public void setRegulatoryIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRegulatoryIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setRegulatoryIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "RegulatoryId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RegulatoryIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRegulatoryIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRegulatoryIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: GlobalContractStatus (CMF.global_contract_status)
   * @param fetch whether to fetch this field or not
   */
  public void setGlobalContractStatusFetch (boolean fetch) {
    this.GlobalContractStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: GlobalContractStatus (CMF.global_contract_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getGlobalContractStatusFetch () {
    return this.GlobalContractStatusFetch;
  }
  /** Set the SortOrder for field: GlobalContractStatus (CMF.global_contract_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGlobalContractStatusSortOrder (Integer value) {
    this.GlobalContractStatusSort = value;
  }
  /** Retrieve SortOrder for field: GlobalContractStatus (CMF.global_contract_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGlobalContractStatusSortOrder () {
    return this.GlobalContractStatusSort;
  }
  /** Set the sort direction for field: GlobalContractStatus (CMF.global_contract_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGlobalContractStatusSortDirection (boolean ascending) {
    this.GlobalContractStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GlobalContractStatus (CMF.global_contract_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGlobalContractStatusSortDirection () {
    return this.GlobalContractStatusSortAscending;
  }
  /** Set the field level filters for field: GlobalContractStatus (CMF.global_contract_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGlobalContractStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.GlobalContractStatus = value;
  }
  /** Retrieve filter for field: GlobalContractStatus (CMF.global_contract_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getGlobalContractStatusFilter () {
    return this.GlobalContractStatus;
  }

  /**
   * Retrieves the GlobalContractStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GlobalContractStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GlobalContractStatusFilter field
   */
  public String[] getGlobalContractStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlobalContractStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGlobalContractStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGlobalContractStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GlobalContractStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGlobalContractStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GlobalContractStatusFilter filter value from a formatted string
   *
   * @param _value the GlobalContractStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GlobalContractStatusFilter filter field
   */
  public void setGlobalContractStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGlobalContractStatusFilterFromFormattedString");
    try {
      this.setGlobalContractStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GlobalContractStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGlobalContractStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGlobalContractStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AltLname (CMF.alt_lname)
   * @param fetch whether to fetch this field or not
   */
  public void setAltLnameFetch (boolean fetch) {
    this.AltLnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: AltLname (CMF.alt_lname)
   * @return boolean the Fetch value for this field
   */
  public boolean getAltLnameFetch () {
    return this.AltLnameFetch;
  }
  /** Set the SortOrder for field: AltLname (CMF.alt_lname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAltLnameSortOrder (Integer value) {
    this.AltLnameSort = value;
  }
  /** Retrieve SortOrder for field: AltLname (CMF.alt_lname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAltLnameSortOrder () {
    return this.AltLnameSort;
  }
  /** Set the sort direction for field: AltLname (CMF.alt_lname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAltLnameSortDirection (boolean ascending) {
    this.AltLnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AltLname (CMF.alt_lname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAltLnameSortDirection () {
    return this.AltLnameSortAscending;
  }
  /** Set the case insensitive for field: AltLname (CMF.alt_lname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAltLnameCaseInsensitive (boolean ascending) {
    this.AltLnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AltLname (CMF.alt_lname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAltLnameCaseInsensitive () {
    return this.AltLnameCaseInsensitive;
  }
  /** Set the field level filters for field: AltLname (CMF.alt_lname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAltLnameFilter (StringFilter[] value) throws ServiceException {
    this.AltLname = value;
  }
  /** Retrieve filter for field: AltLname (CMF.alt_lname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAltLnameFilter () {
    return this.AltLname;
  }

  /**
   * Retrieves the AltLnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AltLnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AltLnameFilter field
   */
  public String[] getAltLnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltLnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAltLnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAltLnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AltLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAltLnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AltLnameFilter filter value from a formatted string
   *
   * @param _value the AltLnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AltLnameFilter filter field
   */
  public void setAltLnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAltLnameFilterFromFormattedString");
    try {
      this.setAltLnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AltLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAltLnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAltLnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AltFname (CMF.alt_fname)
   * @param fetch whether to fetch this field or not
   */
  public void setAltFnameFetch (boolean fetch) {
    this.AltFnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: AltFname (CMF.alt_fname)
   * @return boolean the Fetch value for this field
   */
  public boolean getAltFnameFetch () {
    return this.AltFnameFetch;
  }
  /** Set the SortOrder for field: AltFname (CMF.alt_fname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAltFnameSortOrder (Integer value) {
    this.AltFnameSort = value;
  }
  /** Retrieve SortOrder for field: AltFname (CMF.alt_fname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAltFnameSortOrder () {
    return this.AltFnameSort;
  }
  /** Set the sort direction for field: AltFname (CMF.alt_fname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAltFnameSortDirection (boolean ascending) {
    this.AltFnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AltFname (CMF.alt_fname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAltFnameSortDirection () {
    return this.AltFnameSortAscending;
  }
  /** Set the case insensitive for field: AltFname (CMF.alt_fname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAltFnameCaseInsensitive (boolean ascending) {
    this.AltFnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AltFname (CMF.alt_fname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAltFnameCaseInsensitive () {
    return this.AltFnameCaseInsensitive;
  }
  /** Set the field level filters for field: AltFname (CMF.alt_fname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAltFnameFilter (StringFilter[] value) throws ServiceException {
    this.AltFname = value;
  }
  /** Retrieve filter for field: AltFname (CMF.alt_fname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAltFnameFilter () {
    return this.AltFname;
  }

  /**
   * Retrieves the AltFnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AltFnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AltFnameFilter field
   */
  public String[] getAltFnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltFnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAltFnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAltFnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AltFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAltFnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AltFnameFilter filter value from a formatted string
   *
   * @param _value the AltFnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AltFnameFilter filter field
   */
  public void setAltFnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAltFnameFilterFromFormattedString");
    try {
      this.setAltFnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AltFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAltFnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAltFnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AltCompanyName (CMF.alt_company_name)
   * @param fetch whether to fetch this field or not
   */
  public void setAltCompanyNameFetch (boolean fetch) {
    this.AltCompanyNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: AltCompanyName (CMF.alt_company_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getAltCompanyNameFetch () {
    return this.AltCompanyNameFetch;
  }
  /** Set the SortOrder for field: AltCompanyName (CMF.alt_company_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAltCompanyNameSortOrder (Integer value) {
    this.AltCompanyNameSort = value;
  }
  /** Retrieve SortOrder for field: AltCompanyName (CMF.alt_company_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAltCompanyNameSortOrder () {
    return this.AltCompanyNameSort;
  }
  /** Set the sort direction for field: AltCompanyName (CMF.alt_company_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAltCompanyNameSortDirection (boolean ascending) {
    this.AltCompanyNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AltCompanyName (CMF.alt_company_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAltCompanyNameSortDirection () {
    return this.AltCompanyNameSortAscending;
  }
  /** Set the case insensitive for field: AltCompanyName (CMF.alt_company_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAltCompanyNameCaseInsensitive (boolean ascending) {
    this.AltCompanyNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AltCompanyName (CMF.alt_company_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAltCompanyNameCaseInsensitive () {
    return this.AltCompanyNameCaseInsensitive;
  }
  /** Set the field level filters for field: AltCompanyName (CMF.alt_company_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAltCompanyNameFilter (StringFilter[] value) throws ServiceException {
    this.AltCompanyName = value;
  }
  /** Retrieve filter for field: AltCompanyName (CMF.alt_company_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAltCompanyNameFilter () {
    return this.AltCompanyName;
  }

  /**
   * Retrieves the AltCompanyNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AltCompanyNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AltCompanyNameFilter field
   */
  public String[] getAltCompanyNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltCompanyNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAltCompanyNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAltCompanyNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AltCompanyNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAltCompanyNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AltCompanyNameFilter filter value from a formatted string
   *
   * @param _value the AltCompanyNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AltCompanyNameFilter filter field
   */
  public void setAltCompanyNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAltCompanyNameFilterFromFormattedString");
    try {
      this.setAltCompanyNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AltCompanyNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAltCompanyNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAltCompanyNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Gender (CMF.gender)
   * @param fetch whether to fetch this field or not
   */
  public void setGenderFetch (boolean fetch) {
    this.GenderFetch = fetch;
  }
  /** Retrieve Fetch value for field: Gender (CMF.gender)
   * @return boolean the Fetch value for this field
   */
  public boolean getGenderFetch () {
    return this.GenderFetch;
  }
  /** Set the SortOrder for field: Gender (CMF.gender)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGenderSortOrder (Integer value) {
    this.GenderSort = value;
  }
  /** Retrieve SortOrder for field: Gender (CMF.gender)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGenderSortOrder () {
    return this.GenderSort;
  }
  /** Set the sort direction for field: Gender (CMF.gender)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGenderSortDirection (boolean ascending) {
    this.GenderSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Gender (CMF.gender)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGenderSortDirection () {
    return this.GenderSortAscending;
  }
  /** Set the field level filters for field: Gender (CMF.gender)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGenderFilter (IntegerFilter[] value) throws ServiceException {
    this.Gender = value;
  }
  /** Retrieve filter for field: Gender (CMF.gender)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getGenderFilter () {
    return this.Gender;
  }

  /**
   * Retrieves the GenderFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GenderFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GenderFilter field
   */
  public String[] getGenderFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGenderFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGenderFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGenderFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GenderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGenderFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GenderFilter filter value from a formatted string
   *
   * @param _value the GenderFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GenderFilter filter field
   */
  public void setGenderFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGenderFilterFromFormattedString");
    try {
      this.setGenderFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GenderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGenderFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGenderFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Dept (CMF.dept)
   * @param fetch whether to fetch this field or not
   */
  public void setDeptFetch (boolean fetch) {
    this.DeptFetch = fetch;
  }
  /** Retrieve Fetch value for field: Dept (CMF.dept)
   * @return boolean the Fetch value for this field
   */
  public boolean getDeptFetch () {
    return this.DeptFetch;
  }
  /** Set the SortOrder for field: Dept (CMF.dept)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDeptSortOrder (Integer value) {
    this.DeptSort = value;
  }
  /** Retrieve SortOrder for field: Dept (CMF.dept)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDeptSortOrder () {
    return this.DeptSort;
  }
  /** Set the sort direction for field: Dept (CMF.dept)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDeptSortDirection (boolean ascending) {
    this.DeptSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Dept (CMF.dept)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDeptSortDirection () {
    return this.DeptSortAscending;
  }
  /** Set the case insensitive for field: Dept (CMF.dept)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDeptCaseInsensitive (boolean ascending) {
    this.DeptCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Dept (CMF.dept)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDeptCaseInsensitive () {
    return this.DeptCaseInsensitive;
  }
  /** Set the field level filters for field: Dept (CMF.dept)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDeptFilter (StringFilter[] value) throws ServiceException {
    this.Dept = value;
  }
  /** Retrieve filter for field: Dept (CMF.dept)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDeptFilter () {
    return this.Dept;
  }

  /**
   * Retrieves the DeptFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DeptFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DeptFilter field
   */
  public String[] getDeptFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDeptFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDeptFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDeptFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DeptFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDeptFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DeptFilter filter value from a formatted string
   *
   * @param _value the DeptFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DeptFilter filter field
   */
  public void setDeptFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDeptFilterFromFormattedString");
    try {
      this.setDeptFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DeptFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDeptFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDeptFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Title (CMF.title)
   * @param fetch whether to fetch this field or not
   */
  public void setTitleFetch (boolean fetch) {
    this.TitleFetch = fetch;
  }
  /** Retrieve Fetch value for field: Title (CMF.title)
   * @return boolean the Fetch value for this field
   */
  public boolean getTitleFetch () {
    return this.TitleFetch;
  }
  /** Set the SortOrder for field: Title (CMF.title)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTitleSortOrder (Integer value) {
    this.TitleSort = value;
  }
  /** Retrieve SortOrder for field: Title (CMF.title)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTitleSortOrder () {
    return this.TitleSort;
  }
  /** Set the sort direction for field: Title (CMF.title)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTitleSortDirection (boolean ascending) {
    this.TitleSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Title (CMF.title)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTitleSortDirection () {
    return this.TitleSortAscending;
  }
  /** Set the case insensitive for field: Title (CMF.title)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setTitleCaseInsensitive (boolean ascending) {
    this.TitleCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Title (CMF.title)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getTitleCaseInsensitive () {
    return this.TitleCaseInsensitive;
  }
  /** Set the field level filters for field: Title (CMF.title)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTitleFilter (StringFilter[] value) throws ServiceException {
    this.Title = value;
  }
  /** Retrieve filter for field: Title (CMF.title)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getTitleFilter () {
    return this.Title;
  }

  /**
   * Retrieves the TitleFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TitleFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TitleFilter field
   */
  public String[] getTitleFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTitleFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTitleFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTitleFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TitleFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTitleFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TitleFilter filter value from a formatted string
   *
   * @param _value the TitleFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TitleFilter filter field
   */
  public void setTitleFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTitleFilterFromFormattedString");
    try {
      this.setTitleFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TitleFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTitleFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTitleFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PaymentProfileId (CMF.payment_profile_id)
   * @param fetch whether to fetch this field or not
   */
  public void setPaymentProfileIdFetch (boolean fetch) {
    this.PaymentProfileIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PaymentProfileId (CMF.payment_profile_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getPaymentProfileIdFetch () {
    return this.PaymentProfileIdFetch;
  }
  /** Set the SortOrder for field: PaymentProfileId (CMF.payment_profile_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPaymentProfileIdSortOrder (Integer value) {
    this.PaymentProfileIdSort = value;
  }
  /** Retrieve SortOrder for field: PaymentProfileId (CMF.payment_profile_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPaymentProfileIdSortOrder () {
    return this.PaymentProfileIdSort;
  }
  /** Set the sort direction for field: PaymentProfileId (CMF.payment_profile_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPaymentProfileIdSortDirection (boolean ascending) {
    this.PaymentProfileIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PaymentProfileId (CMF.payment_profile_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPaymentProfileIdSortDirection () {
    return this.PaymentProfileIdSortAscending;
  }
  /** Set the field level filters for field: PaymentProfileId (CMF.payment_profile_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPaymentProfileIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.PaymentProfileId = value;
  }
  /** Retrieve filter for field: PaymentProfileId (CMF.payment_profile_id)
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

  /** Set the field level Fetch value for field: AccountProcessFlag (CMF.account_process_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountProcessFlagFetch (boolean fetch) {
    this.AccountProcessFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountProcessFlag (CMF.account_process_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountProcessFlagFetch () {
    return this.AccountProcessFlagFetch;
  }
  /** Set the SortOrder for field: AccountProcessFlag (CMF.account_process_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountProcessFlagSortOrder (Integer value) {
    this.AccountProcessFlagSort = value;
  }
  /** Retrieve SortOrder for field: AccountProcessFlag (CMF.account_process_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountProcessFlagSortOrder () {
    return this.AccountProcessFlagSort;
  }
  /** Set the sort direction for field: AccountProcessFlag (CMF.account_process_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountProcessFlagSortDirection (boolean ascending) {
    this.AccountProcessFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountProcessFlag (CMF.account_process_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountProcessFlagSortDirection () {
    return this.AccountProcessFlagSortAscending;
  }
  /** Set the field level filters for field: AccountProcessFlag (CMF.account_process_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountProcessFlagFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountProcessFlag = value;
  }
  /** Retrieve filter for field: AccountProcessFlag (CMF.account_process_flag)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountProcessFlagFilter () {
    return this.AccountProcessFlag;
  }

  /**
   * Retrieves the AccountProcessFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountProcessFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountProcessFlagFilter field
   */
  public String[] getAccountProcessFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountProcessFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountProcessFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountProcessFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountProcessFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountProcessFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountProcessFlagFilter filter value from a formatted string
   *
   * @param _value the AccountProcessFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountProcessFlagFilter filter field
   */
  public void setAccountProcessFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountProcessFlagFilterFromFormattedString");
    try {
      this.setAccountProcessFlagFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountProcessFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountProcessFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountProcessFlagFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SdAgencyId (CMF.sd_agency_id)
   * @param fetch whether to fetch this field or not
   */
  public void setSdAgencyIdFetch (boolean fetch) {
    this.SdAgencyIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: SdAgencyId (CMF.sd_agency_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getSdAgencyIdFetch () {
    return this.SdAgencyIdFetch;
  }
  /** Set the SortOrder for field: SdAgencyId (CMF.sd_agency_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSdAgencyIdSortOrder (Integer value) {
    this.SdAgencyIdSort = value;
  }
  /** Retrieve SortOrder for field: SdAgencyId (CMF.sd_agency_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSdAgencyIdSortOrder () {
    return this.SdAgencyIdSort;
  }
  /** Set the sort direction for field: SdAgencyId (CMF.sd_agency_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSdAgencyIdSortDirection (boolean ascending) {
    this.SdAgencyIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SdAgencyId (CMF.sd_agency_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSdAgencyIdSortDirection () {
    return this.SdAgencyIdSortAscending;
  }
  /** Set the case insensitive for field: SdAgencyId (CMF.sd_agency_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setSdAgencyIdCaseInsensitive (boolean ascending) {
    this.SdAgencyIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: SdAgencyId (CMF.sd_agency_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getSdAgencyIdCaseInsensitive () {
    return this.SdAgencyIdCaseInsensitive;
  }
  /** Set the field level filters for field: SdAgencyId (CMF.sd_agency_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSdAgencyIdFilter (StringFilter[] value) throws ServiceException {
    this.SdAgencyId = value;
  }
  /** Retrieve filter for field: SdAgencyId (CMF.sd_agency_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getSdAgencyIdFilter () {
    return this.SdAgencyId;
  }

  /**
   * Retrieves the SdAgencyIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SdAgencyIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SdAgencyIdFilter field
   */
  public String[] getSdAgencyIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSdAgencyIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSdAgencyIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSdAgencyIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SdAgencyIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSdAgencyIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SdAgencyIdFilter filter value from a formatted string
   *
   * @param _value the SdAgencyIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SdAgencyIdFilter filter field
   */
  public void setSdAgencyIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSdAgencyIdFilterFromFormattedString");
    try {
      this.setSdAgencyIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SdAgencyIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSdAgencyIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSdAgencyIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustomerLifetimeId (CMF.customer_lifetime_id)
   * @param fetch whether to fetch this field or not
   */
  public void setCustomerLifetimeIdFetch (boolean fetch) {
    this.CustomerLifetimeIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustomerLifetimeId (CMF.customer_lifetime_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustomerLifetimeIdFetch () {
    return this.CustomerLifetimeIdFetch;
  }
  /** Set the SortOrder for field: CustomerLifetimeId (CMF.customer_lifetime_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustomerLifetimeIdSortOrder (Integer value) {
    this.CustomerLifetimeIdSort = value;
  }
  /** Retrieve SortOrder for field: CustomerLifetimeId (CMF.customer_lifetime_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustomerLifetimeIdSortOrder () {
    return this.CustomerLifetimeIdSort;
  }
  /** Set the sort direction for field: CustomerLifetimeId (CMF.customer_lifetime_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustomerLifetimeIdSortDirection (boolean ascending) {
    this.CustomerLifetimeIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustomerLifetimeId (CMF.customer_lifetime_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustomerLifetimeIdSortDirection () {
    return this.CustomerLifetimeIdSortAscending;
  }
  /** Set the field level filters for field: CustomerLifetimeId (CMF.customer_lifetime_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustomerLifetimeIdFilter (IntegerFilter[] value) throws ServiceException {
    this.CustomerLifetimeId = value;
  }
  /** Retrieve filter for field: CustomerLifetimeId (CMF.customer_lifetime_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCustomerLifetimeIdFilter () {
    return this.CustomerLifetimeId;
  }

  /**
   * Retrieves the CustomerLifetimeIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustomerLifetimeIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustomerLifetimeIdFilter field
   */
  public String[] getCustomerLifetimeIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerLifetimeIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustomerLifetimeIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerLifetimeIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustomerLifetimeIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustomerLifetimeIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustomerLifetimeIdFilter filter value from a formatted string
   *
   * @param _value the CustomerLifetimeIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustomerLifetimeIdFilter filter field
   */
  public void setCustomerLifetimeIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustomerLifetimeIdFilterFromFormattedString");
    try {
      this.setCustomerLifetimeIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustomerLifetimeIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustomerLifetimeIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustomerLifetimeIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CustomerLifetimeId2 (CMF.customer_lifetime_id2)
   * @param fetch whether to fetch this field or not
   */
  public void setCustomerLifetimeId2Fetch (boolean fetch) {
    this.CustomerLifetimeId2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: CustomerLifetimeId2 (CMF.customer_lifetime_id2)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustomerLifetimeId2Fetch () {
    return this.CustomerLifetimeId2Fetch;
  }
  /** Set the SortOrder for field: CustomerLifetimeId2 (CMF.customer_lifetime_id2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustomerLifetimeId2SortOrder (Integer value) {
    this.CustomerLifetimeId2Sort = value;
  }
  /** Retrieve SortOrder for field: CustomerLifetimeId2 (CMF.customer_lifetime_id2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustomerLifetimeId2SortOrder () {
    return this.CustomerLifetimeId2Sort;
  }
  /** Set the sort direction for field: CustomerLifetimeId2 (CMF.customer_lifetime_id2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustomerLifetimeId2SortDirection (boolean ascending) {
    this.CustomerLifetimeId2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustomerLifetimeId2 (CMF.customer_lifetime_id2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustomerLifetimeId2SortDirection () {
    return this.CustomerLifetimeId2SortAscending;
  }
  /** Set the field level filters for field: CustomerLifetimeId2 (CMF.customer_lifetime_id2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustomerLifetimeId2Filter (IntegerFilter[] value) throws ServiceException {
    this.CustomerLifetimeId2 = value;
  }
  /** Retrieve filter for field: CustomerLifetimeId2 (CMF.customer_lifetime_id2)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCustomerLifetimeId2Filter () {
    return this.CustomerLifetimeId2;
  }

  /**
   * Retrieves the CustomerLifetimeId2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustomerLifetimeId2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustomerLifetimeId2Filter field
   */
  public String[] getCustomerLifetimeId2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerLifetimeId2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustomerLifetimeId2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerLifetimeId2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustomerLifetimeId2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustomerLifetimeId2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustomerLifetimeId2Filter filter value from a formatted string
   *
   * @param _value the CustomerLifetimeId2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustomerLifetimeId2Filter filter field
   */
  public void setCustomerLifetimeId2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustomerLifetimeId2FilterFromFormattedString");
    try {
      this.setCustomerLifetimeId2Filter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustomerLifetimeId2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustomerLifetimeId2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustomerLifetimeId2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AutoWriteoffStatus (CMF.auto_writeoff_status)
   * @param fetch whether to fetch this field or not
   */
  public void setAutoWriteoffStatusFetch (boolean fetch) {
    this.AutoWriteoffStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: AutoWriteoffStatus (CMF.auto_writeoff_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getAutoWriteoffStatusFetch () {
    return this.AutoWriteoffStatusFetch;
  }
  /** Set the SortOrder for field: AutoWriteoffStatus (CMF.auto_writeoff_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAutoWriteoffStatusSortOrder (Integer value) {
    this.AutoWriteoffStatusSort = value;
  }
  /** Retrieve SortOrder for field: AutoWriteoffStatus (CMF.auto_writeoff_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAutoWriteoffStatusSortOrder () {
    return this.AutoWriteoffStatusSort;
  }
  /** Set the sort direction for field: AutoWriteoffStatus (CMF.auto_writeoff_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAutoWriteoffStatusSortDirection (boolean ascending) {
    this.AutoWriteoffStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AutoWriteoffStatus (CMF.auto_writeoff_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAutoWriteoffStatusSortDirection () {
    return this.AutoWriteoffStatusSortAscending;
  }
  /** Set the field level filters for field: AutoWriteoffStatus (CMF.auto_writeoff_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAutoWriteoffStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.AutoWriteoffStatus = value;
  }
  /** Retrieve filter for field: AutoWriteoffStatus (CMF.auto_writeoff_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAutoWriteoffStatusFilter () {
    return this.AutoWriteoffStatus;
  }

  /**
   * Retrieves the AutoWriteoffStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AutoWriteoffStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AutoWriteoffStatusFilter field
   */
  public String[] getAutoWriteoffStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAutoWriteoffStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAutoWriteoffStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAutoWriteoffStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AutoWriteoffStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAutoWriteoffStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AutoWriteoffStatusFilter filter value from a formatted string
   *
   * @param _value the AutoWriteoffStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AutoWriteoffStatusFilter filter field
   */
  public void setAutoWriteoffStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAutoWriteoffStatusFilterFromFormattedString");
    try {
      this.setAutoWriteoffStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AutoWriteoffStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAutoWriteoffStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAutoWriteoffStatusFilterFromFormattedString");
  }

  /** Constructor to copy base class fields. 
   * @param other the object to copy
   */
  public BilledUsageAccountObjectFilter (BilledUsageObjectFilter other)
  {
    super (other);

  }

  public String toString() {
    return BilledUsageAccountObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return BilledUsageAccountObjectHelper.toMap(this, null);
  }
}
