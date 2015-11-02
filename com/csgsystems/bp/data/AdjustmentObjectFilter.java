/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AdjustmentObjectFilter.java
 * Definition File: Customer/Adjustment.xml
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
public class AdjustmentObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public AdjustmentObjectKeyFilter Key = null;
  /** raw field for: PAYMENT_PROFILE.card_account) */
  public    StringFilter[] CcardAccount  = null;
  protected boolean CcardAccountFetch = false;
  protected boolean CcardAccountSortAscending = true;
  protected boolean CcardAccountCaseInsensitive = false;
  protected Integer CcardAccountSort = null;
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
  /** raw field for: PAYMENT_PROFILE.card_carrier) */
  public    StringFilter[] CcardCarrier  = null;
  protected boolean CcardCarrierFetch = false;
  protected boolean CcardCarrierSortAscending = true;
  protected boolean CcardCarrierCaseInsensitive = false;
  protected Integer CcardCarrierSort = null;
  /** raw field for: PAYMENT_PROFILE.card_expire) */
  public    StringFilter[] CcardExpire  = null;
  protected boolean CcardExpireFetch = false;
  protected boolean CcardExpireSortAscending = true;
  protected boolean CcardExpireCaseInsensitive = false;
  protected Integer CcardExpireSort = null;
  /** raw field for: PAYMENT_PROFILE.avs_address_id) */
  public    IntegerFilter[] AvsAddressId  = null;
  protected boolean AvsAddressIdFetch = false;
  protected boolean AvsAddressIdSortAscending = true;
  protected Integer AvsAddressIdSort = null;
  /** raw field for: PAYMENT_PROFILE.clearing_house_id) */
  public    StringFilter[] ClearingHouseId  = null;
  protected boolean ClearingHouseIdFetch = false;
  protected boolean ClearingHouseIdSortAscending = true;
  protected boolean ClearingHouseIdCaseInsensitive = false;
  protected Integer ClearingHouseIdSort = null;
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
  /** raw field for: CUSTOMER_ID_EQUIP_MAP_VIEW.external_id) */
  public    StringFilter[] ServiceExternalId  = null;
  protected boolean ServiceExternalIdFetch = false;
  protected boolean ServiceExternalIdSortAscending = true;
  protected boolean ServiceExternalIdCaseInsensitive = false;
  protected Integer ServiceExternalIdSort = null;
  /** raw field for: CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type) */
  public    IntegerFilter[] ServiceExternalIdType  = null;
  protected boolean ServiceExternalIdTypeFetch = false;
  protected boolean ServiceExternalIdTypeSortAscending = true;
  protected Integer ServiceExternalIdTypeSort = null;
  /** raw field for: ACCOUNT_BALANCES.balance_desc) */
  public    StringFilter[] PrepayBalanceDesc  = null;
  protected boolean PrepayBalanceDescFetch = false;
  protected boolean PrepayBalanceDescSortAscending = true;
  protected boolean PrepayBalanceDescCaseInsensitive = false;
  protected Integer PrepayBalanceDescSort = null;
  /** raw field for: ADJ_TRANS_DESCR.trans_sign) */
  public    IntegerFilter[] TransSign  = null;
  protected boolean TransSignFetch = false;
  protected boolean TransSignSortAscending = true;
  protected Integer TransSignSort = null;
  /** raw field for: ADJ_TRANS_DESCR.billing_category) */
  public    IntegerFilter[] BillingCategory  = null;
  protected boolean BillingCategoryFetch = false;
  protected boolean BillingCategorySortAscending = true;
  protected Integer BillingCategorySort = null;
  /** raw field for: ADJ_TRANS_DESCR.trans_target_type) */
  public    IntegerFilter[] TransTargetType  = null;
  protected boolean TransTargetTypeFetch = false;
  protected boolean TransTargetTypeSortAscending = true;
  protected Integer TransTargetTypeSort = null;
  /** raw field for: ADJ_TRANS_DESCR.is_negative_bill_adj) */
  public    BooleanFilter[] IsNegativeBillAdj  = null;
  protected boolean IsNegativeBillAdjFetch = false;
  protected boolean IsNegativeBillAdjSortAscending = true;
  protected Integer IsNegativeBillAdjSort = null;
  /** raw field */
  public    IntegerFilter[] ServerId  = null;
  protected boolean ServerIdFetch = false;
  protected boolean ServerIdSortAscending = true;
  protected Integer ServerIdSort = null;
  /** raw field for: ADJ.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: ADJ.subscr_no) */
  public    IntegerFilter[] ServiceInternalId  = null;
  protected boolean ServiceInternalIdFetch = false;
  protected boolean ServiceInternalIdSortAscending = true;
  protected Integer ServiceInternalIdSort = null;
  /** raw field for: ADJ.subscr_no_resets) */
  public    IntegerFilter[] ServiceInternalIdResets  = null;
  protected boolean ServiceInternalIdResetsFetch = false;
  protected boolean ServiceInternalIdResetsSortAscending = true;
  protected Integer ServiceInternalIdResetsSort = null;
  /** raw field for: ADJ.adj_trans_code) */
  public    IntegerFilter[] TransCode  = null;
  protected boolean TransCodeFetch = false;
  protected boolean TransCodeSortAscending = true;
  protected Integer TransCodeSort = null;
  /** raw field for: ADJ.orig_trans_code) */
  public    IntegerFilter[] OrigTransCode  = null;
  protected boolean OrigTransCodeFetch = false;
  protected boolean OrigTransCodeSortAscending = true;
  protected Integer OrigTransCodeSort = null;
  /** raw field for: ADJ.annotation) */
  public    StringFilter[] Annotation  = null;
  protected boolean AnnotationFetch = false;
  protected boolean AnnotationSortAscending = true;
  protected boolean AnnotationCaseInsensitive = false;
  protected Integer AnnotationSort = null;
  /** raw field for: ADJ.primary_units_type) */
  public    IntegerFilter[] PrimaryUnitsType  = null;
  protected boolean PrimaryUnitsTypeFetch = false;
  protected boolean PrimaryUnitsTypeSortAscending = true;
  protected Integer PrimaryUnitsTypeSort = null;
  /** raw field for: ADJ.primary_units) */
  public    BigIntegerFilter[] PrimaryUnits  = null;
  protected boolean PrimaryUnitsFetch = false;
  protected boolean PrimaryUnitsSortAscending = true;
  protected Integer PrimaryUnitsSort = null;
  /** raw field for: ADJ.transact_date) */
  public    DateFilter[] TransactDate  = null;
  protected boolean TransactDateFetch = false;
  protected boolean TransactDateSortAscending = true;
  protected Integer TransactDateSort = null;
  /** raw field for: ADJ.effective_date) */
  public    DateFilter[] EffectiveDate  = null;
  protected boolean EffectiveDateFetch = false;
  protected boolean EffectiveDateSortAscending = true;
  protected Integer EffectiveDateSort = null;
  /** raw field for: ADJ.end_date) */
  public    DateFilter[] InactiveDate  = null;
  protected boolean InactiveDateFetch = false;
  protected boolean InactiveDateSortAscending = true;
  protected Integer InactiveDateSort = null;
  /** raw field for: ADJ.tracking_id_counter) */
  public    IntegerFilter[] TrackingIdCounter  = null;
  protected boolean TrackingIdCounterFetch = false;
  protected boolean TrackingIdCounterSortAscending = true;
  protected Integer TrackingIdCounterSort = null;
  /** raw field for: ADJ.request_status) */
  public    IntegerFilter[] RequestStatus  = null;
  protected boolean RequestStatusFetch = false;
  protected boolean RequestStatusSortAscending = true;
  protected Integer RequestStatusSort = null;
  /** raw field for: ADJ.review_date) */
  public    DateFilter[] ReviewDate  = null;
  protected boolean ReviewDateFetch = false;
  protected boolean ReviewDateSortAscending = true;
  protected Integer ReviewDateSort = null;
  /** raw field for: ADJ.supervisor_name) */
  public    StringFilter[] SupervisorName  = null;
  protected boolean SupervisorNameFetch = false;
  protected boolean SupervisorNameSortAscending = true;
  protected boolean SupervisorNameCaseInsensitive = false;
  protected Integer SupervisorNameSort = null;
  /** raw field for: ADJ.current_flag) */
  public    BooleanFilter[] CurrentFlag  = null;
  protected boolean CurrentFlagFetch = false;
  protected boolean CurrentFlagSortAscending = true;
  protected Integer CurrentFlagSort = null;
  /** raw field for: ADJ.pending_flag) */
  public    BooleanFilter[] PendingFlag  = null;
  protected boolean PendingFlagFetch = false;
  protected boolean PendingFlagSortAscending = true;
  protected Integer PendingFlagSort = null;
  /** raw field for: ADJ.no_bill) */
  public    BooleanFilter[] NoBill  = null;
  protected boolean NoBillFetch = false;
  protected boolean NoBillSortAscending = true;
  protected Integer NoBillSort = null;
  /** raw field for: ADJ.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: ADJ.total_amt) */
  public    BigIntegerFilter[] TotalAmt  = null;
  protected boolean TotalAmtFetch = false;
  protected boolean TotalAmtSortAscending = true;
  protected Integer TotalAmtSort = null;
  /** raw field for: ADJ.rated_flag) */
  public    BooleanFilter[] RatedFlag  = null;
  protected boolean RatedFlagFetch = false;
  protected boolean RatedFlagSortAscending = true;
  protected Integer RatedFlagSort = null;
  /** raw field for: ADJ.arch_flag) */
  public    BooleanFilter[] ArchFlag  = null;
  protected boolean ArchFlagFetch = false;
  protected boolean ArchFlagSortAscending = true;
  protected Integer ArchFlagSort = null;
  /** raw field for: ADJ.orig_provider_id) */
  public    IntegerFilter[] OrigProviderId  = null;
  protected boolean OrigProviderIdFetch = false;
  protected boolean OrigProviderIdSortAscending = true;
  protected Integer OrigProviderIdSort = null;
  /** raw field for: ADJ.orig_bill_ref_no) */
  public    IntegerFilter[] OrigBillRefNo  = null;
  protected boolean OrigBillRefNoFetch = false;
  protected boolean OrigBillRefNoSortAscending = true;
  protected Integer OrigBillRefNoSort = null;
  /** raw field for: ADJ.orig_bill_ref_resets) */
  public    IntegerFilter[] OrigBillRefResets  = null;
  protected boolean OrigBillRefResetsFetch = false;
  protected boolean OrigBillRefResetsSortAscending = true;
  protected Integer OrigBillRefResetsSort = null;
  /** raw field for: ADJ.orig_bill_invoice_row) */
  public    IntegerFilter[] OrigBillInvoiceRow  = null;
  protected boolean OrigBillInvoiceRowFetch = false;
  protected boolean OrigBillInvoiceRowSortAscending = true;
  protected Integer OrigBillInvoiceRowSort = null;
  /** raw field for: ADJ.orig_type) */
  public    IntegerFilter[] OrigType  = null;
  protected boolean OrigTypeFetch = false;
  protected boolean OrigTypeSortAscending = true;
  protected Integer OrigTypeSort = null;
  /** raw field for: ADJ.orig_subtype) */
  public    IntegerFilter[] OrigSubtype  = null;
  protected boolean OrigSubtypeFetch = false;
  protected boolean OrigSubtypeSortAscending = true;
  protected Integer OrigSubtypeSort = null;
  /** raw field for: ADJ.orig_msg_id) */
  public    IntegerFilter[] OrigMsgId  = null;
  protected boolean OrigMsgIdFetch = false;
  protected boolean OrigMsgIdSortAscending = true;
  protected Integer OrigMsgIdSort = null;
  /** raw field for: ADJ.orig_msg_id2) */
  public    IntegerFilter[] OrigMsgId2  = null;
  protected boolean OrigMsgId2Fetch = false;
  protected boolean OrigMsgId2SortAscending = true;
  protected Integer OrigMsgId2Sort = null;
  /** raw field for: ADJ.orig_msg_id_serv) */
  public    IntegerFilter[] OrigMsgIdServ  = null;
  protected boolean OrigMsgIdServFetch = false;
  protected boolean OrigMsgIdServSortAscending = true;
  protected Integer OrigMsgIdServSort = null;
  /** raw field for: ADJ.orig_tracking_id) */
  public    IntegerFilter[] OrigTrackingId  = null;
  protected boolean OrigTrackingIdFetch = false;
  protected boolean OrigTrackingIdSortAscending = true;
  protected Integer OrigTrackingIdSort = null;
  /** raw field for: ADJ.orig_tracking_id_serv) */
  public    IntegerFilter[] OrigTrackingIdServ  = null;
  protected boolean OrigTrackingIdServFetch = false;
  protected boolean OrigTrackingIdServSortAscending = true;
  protected Integer OrigTrackingIdServSort = null;
  /** raw field for: ADJ.orig_tracking_dt) */
  public    DateFilter[] OrigTrackingDt  = null;
  protected boolean OrigTrackingDtFetch = false;
  protected boolean OrigTrackingDtSortAscending = true;
  protected Integer OrigTrackingDtSort = null;
  /** raw field for: ADJ.orig_rc_from_date) */
  public    DateFilter[] OrigRcFromDate  = null;
  protected boolean OrigRcFromDateFetch = false;
  protected boolean OrigRcFromDateSortAscending = true;
  protected Integer OrigRcFromDateSort = null;
  /** raw field for: ADJ.bill_ref_no) */
  public    IntegerFilter[] BillRefNo  = null;
  protected boolean BillRefNoFetch = false;
  protected boolean BillRefNoSortAscending = true;
  protected Integer BillRefNoSort = null;
  /** raw field for: ADJ.bill_ref_resets) */
  public    IntegerFilter[] BillRefResets  = null;
  protected boolean BillRefResetsFetch = false;
  protected boolean BillRefResetsSortAscending = true;
  protected Integer BillRefResetsSort = null;
  /** raw field for: ADJ.tax_class) */
  public    IntegerFilter[] TaxClass  = null;
  protected boolean TaxClassFetch = false;
  protected boolean TaxClassSortAscending = true;
  protected Integer TaxClassSort = null;
  /** raw field for: ADJ.tax_pkg_inst_id) */
  public    IntegerFilter[] TaxPkgInstId  = null;
  protected boolean TaxPkgInstIdFetch = false;
  protected boolean TaxPkgInstIdSortAscending = true;
  protected Integer TaxPkgInstIdSort = null;
  /** raw field for: ADJ.geocode) */
  public    StringFilter[] Geocode  = null;
  protected boolean GeocodeFetch = false;
  protected boolean GeocodeSortAscending = true;
  protected boolean GeocodeCaseInsensitive = false;
  protected Integer GeocodeSort = null;
  /** raw field for: ADJ.aux_tax_info) */
  public    StringFilter[] AuxTaxInfo  = null;
  protected boolean AuxTaxInfoFetch = false;
  protected boolean AuxTaxInfoSortAscending = true;
  protected boolean AuxTaxInfoCaseInsensitive = false;
  protected Integer AuxTaxInfoSort = null;
  /** raw field for: ADJ.comb_tax_rate) */
  public    IntegerFilter[] CombTaxRate  = null;
  protected boolean CombTaxRateFetch = false;
  protected boolean CombTaxRateSortAscending = true;
  protected Integer CombTaxRateSort = null;
  /** raw field for: ADJ.federal_tax) */
  public    BigIntegerFilter[] FederalTax  = null;
  protected boolean FederalTaxFetch = false;
  protected boolean FederalTaxSortAscending = true;
  protected Integer FederalTaxSort = null;
  /** raw field for: ADJ.state_tax) */
  public    BigIntegerFilter[] StateTax  = null;
  protected boolean StateTaxFetch = false;
  protected boolean StateTaxSortAscending = true;
  protected Integer StateTaxSort = null;
  /** raw field for: ADJ.county_tax) */
  public    BigIntegerFilter[] CountyTax  = null;
  protected boolean CountyTaxFetch = false;
  protected boolean CountyTaxSortAscending = true;
  protected Integer CountyTaxSort = null;
  /** raw field for: ADJ.city_tax) */
  public    BigIntegerFilter[] CityTax  = null;
  protected boolean CityTaxFetch = false;
  protected boolean CityTaxSortAscending = true;
  protected Integer CityTaxSort = null;
  /** raw field for: ADJ.other_tax) */
  public    BigIntegerFilter[] OtherTax  = null;
  protected boolean OtherTaxFetch = false;
  protected boolean OtherTaxSortAscending = true;
  protected Integer OtherTaxSort = null;
  /** raw field for: ADJ.tax_journal_status) */
  public    IntegerFilter[] TaxJournalStatus  = null;
  protected boolean TaxJournalStatusFetch = false;
  protected boolean TaxJournalStatusSortAscending = true;
  protected Integer TaxJournalStatusSort = null;
  /** raw field for: ADJ.discount_amt) */
  public    BigIntegerFilter[] DiscountAmt  = null;
  protected boolean DiscountAmtFetch = false;
  protected boolean DiscountAmtSortAscending = true;
  protected Integer DiscountAmtSort = null;
  /** raw field for: ADJ.profile_id) */
  public    BigIntegerFilter[] ProfileId  = null;
  protected boolean ProfileIdFetch = false;
  protected boolean ProfileIdSortAscending = true;
  protected Integer ProfileIdSort = null;
  /** raw field for: ADJ.adj_reason_code) */
  public    IntegerFilter[] AdjReasonCode  = null;
  protected boolean AdjReasonCodeFetch = false;
  protected boolean AdjReasonCodeSortAscending = true;
  protected Integer AdjReasonCodeSort = null;
  /** raw field for: ADJ.fraud_indicator) */
  public    IntegerFilter[] FraudIndicator  = null;
  protected boolean FraudIndicatorFetch = false;
  protected boolean FraudIndicatorSortAscending = true;
  protected Integer FraudIndicatorSort = null;
  /** raw field for: ADJ.rev_rcv_cost_ctr) */
  public    IntegerFilter[] RevRcvCostCtr  = null;
  protected boolean RevRcvCostCtrFetch = false;
  protected boolean RevRcvCostCtrSortAscending = true;
  protected Integer RevRcvCostCtrSort = null;
  /** raw field for: ADJ.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: ADJ.chg_date) */
  public    DateFilter[] ChgDate  = null;
  protected boolean ChgDateFetch = false;
  protected boolean ChgDateSortAscending = true;
  protected Integer ChgDateSort = null;
  /** raw field for: ADJ.balance_chg_date) */
  public    DateFilter[] BalanceChgDate  = null;
  protected boolean BalanceChgDateFetch = false;
  protected boolean BalanceChgDateSortAscending = true;
  protected Integer BalanceChgDateSort = null;
  /** raw field for: ADJ.b_rev_rcv_cost_ctr) */
  public    IntegerFilter[] BRevRcvCostCtr  = null;
  protected boolean BRevRcvCostCtrFetch = false;
  protected boolean BRevRcvCostCtrSortAscending = true;
  protected Integer BRevRcvCostCtrSort = null;
  /** raw field for: ADJ.orig_split_row_num) */
  public    IntegerFilter[] OrigSplitRowNum  = null;
  protected boolean OrigSplitRowNumFetch = false;
  protected boolean OrigSplitRowNumSortAscending = true;
  protected Integer OrigSplitRowNumSort = null;
  /** raw field for: ADJ.tax_type_code) */
  public    IntegerFilter[] TaxTypeCode  = null;
  protected boolean TaxTypeCodeFetch = false;
  protected boolean TaxTypeCodeSortAscending = true;
  protected Integer TaxTypeCodeSort = null;
  /** raw field for: ADJ.orig_submitter_name) */
  public    StringFilter[] OrigSubmitterName  = null;
  protected boolean OrigSubmitterNameFetch = false;
  protected boolean OrigSubmitterNameSortAscending = true;
  protected boolean OrigSubmitterNameCaseInsensitive = false;
  protected Integer OrigSubmitterNameSort = null;
  /** raw field for: ADJ.last_reviewed_name) */
  public    StringFilter[] LastReviewedName  = null;
  protected boolean LastReviewedNameFetch = false;
  protected boolean LastReviewedNameSortAscending = true;
  protected boolean LastReviewedNameCaseInsensitive = false;
  protected Integer LastReviewedNameSort = null;
  /** raw field for: ADJ.jurisdiction) */
  public    IntegerFilter[] Jurisdiction  = null;
  protected boolean JurisdictionFetch = false;
  protected boolean JurisdictionSortAscending = true;
  protected Integer JurisdictionSort = null;
  /** raw field for: ADJ.open_item_id) */
  public    IntegerFilter[] OpenItemId  = null;
  protected boolean OpenItemIdFetch = false;
  protected boolean OpenItemIdSortAscending = true;
  protected Integer OpenItemIdSort = null;
  /** raw field for: ADJ.bill_order_number) */
  public    StringFilter[] BillOrderNumber  = null;
  protected boolean BillOrderNumberFetch = false;
  protected boolean BillOrderNumberSortAscending = true;
  protected boolean BillOrderNumberCaseInsensitive = false;
  protected Integer BillOrderNumberSort = null;
  /** raw field for: ADJ.request_id) */
  public    BigIntegerFilter[] RequestId  = null;
  protected boolean RequestIdFetch = false;
  protected boolean RequestIdSortAscending = true;
  protected Integer RequestIdSort = null;
  private String _objName = "AdjustmentObjectFilter";
  /** default constructor */
  public AdjustmentObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public AdjustmentObjectFilter (AdjustmentObjectFilter other)
  {
    if (other == null) return;
    this.Key = new AdjustmentObjectKeyFilter (other.Key);
    this.CcardAccount = other.CcardAccount;
    this.CcardAccountFetch = other.CcardAccountFetch;
    this.CcardAccountSort = other.CcardAccountSort;
    this.CcardAccountCaseInsensitive = other.CcardAccountCaseInsensitive;
    this.CcardAccountSortAscending = other.CcardAccountSortAscending;
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
    this.CcardCarrier = other.CcardCarrier;
    this.CcardCarrierFetch = other.CcardCarrierFetch;
    this.CcardCarrierSort = other.CcardCarrierSort;
    this.CcardCarrierCaseInsensitive = other.CcardCarrierCaseInsensitive;
    this.CcardCarrierSortAscending = other.CcardCarrierSortAscending;
    this.CcardExpire = other.CcardExpire;
    this.CcardExpireFetch = other.CcardExpireFetch;
    this.CcardExpireSort = other.CcardExpireSort;
    this.CcardExpireCaseInsensitive = other.CcardExpireCaseInsensitive;
    this.CcardExpireSortAscending = other.CcardExpireSortAscending;
    this.AvsAddressId = other.AvsAddressId;
    this.AvsAddressIdFetch = other.AvsAddressIdFetch;
    this.AvsAddressIdSort = other.AvsAddressIdSort;
    this.AvsAddressIdSortAscending = other.AvsAddressIdSortAscending;
    this.ClearingHouseId = other.ClearingHouseId;
    this.ClearingHouseIdFetch = other.ClearingHouseIdFetch;
    this.ClearingHouseIdSort = other.ClearingHouseIdSort;
    this.ClearingHouseIdCaseInsensitive = other.ClearingHouseIdCaseInsensitive;
    this.ClearingHouseIdSortAscending = other.ClearingHouseIdSortAscending;
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
    this.AccountExternalId = other.AccountExternalId;
    this.AccountExternalIdFetch = other.AccountExternalIdFetch;
    this.AccountExternalIdSort = other.AccountExternalIdSort;
    this.AccountExternalIdCaseInsensitive = other.AccountExternalIdCaseInsensitive;
    this.AccountExternalIdSortAscending = other.AccountExternalIdSortAscending;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this.AccountExternalIdTypeFetch = other.AccountExternalIdTypeFetch;
    this.AccountExternalIdTypeSort = other.AccountExternalIdTypeSort;
    this.AccountExternalIdTypeSortAscending = other.AccountExternalIdTypeSortAscending;
    this.ServiceExternalId = other.ServiceExternalId;
    this.ServiceExternalIdFetch = other.ServiceExternalIdFetch;
    this.ServiceExternalIdSort = other.ServiceExternalIdSort;
    this.ServiceExternalIdCaseInsensitive = other.ServiceExternalIdCaseInsensitive;
    this.ServiceExternalIdSortAscending = other.ServiceExternalIdSortAscending;
    this.ServiceExternalIdType = other.ServiceExternalIdType;
    this.ServiceExternalIdTypeFetch = other.ServiceExternalIdTypeFetch;
    this.ServiceExternalIdTypeSort = other.ServiceExternalIdTypeSort;
    this.ServiceExternalIdTypeSortAscending = other.ServiceExternalIdTypeSortAscending;
    this.PrepayBalanceDesc = other.PrepayBalanceDesc;
    this.PrepayBalanceDescFetch = other.PrepayBalanceDescFetch;
    this.PrepayBalanceDescSort = other.PrepayBalanceDescSort;
    this.PrepayBalanceDescCaseInsensitive = other.PrepayBalanceDescCaseInsensitive;
    this.PrepayBalanceDescSortAscending = other.PrepayBalanceDescSortAscending;
    this.TransSign = other.TransSign;
    this.TransSignFetch = other.TransSignFetch;
    this.TransSignSort = other.TransSignSort;
    this.TransSignSortAscending = other.TransSignSortAscending;
    this.BillingCategory = other.BillingCategory;
    this.BillingCategoryFetch = other.BillingCategoryFetch;
    this.BillingCategorySort = other.BillingCategorySort;
    this.BillingCategorySortAscending = other.BillingCategorySortAscending;
    this.TransTargetType = other.TransTargetType;
    this.TransTargetTypeFetch = other.TransTargetTypeFetch;
    this.TransTargetTypeSort = other.TransTargetTypeSort;
    this.TransTargetTypeSortAscending = other.TransTargetTypeSortAscending;
    this.IsNegativeBillAdj = other.IsNegativeBillAdj;
    this.IsNegativeBillAdjFetch = other.IsNegativeBillAdjFetch;
    this.IsNegativeBillAdjSort = other.IsNegativeBillAdjSort;
    this.IsNegativeBillAdjSortAscending = other.IsNegativeBillAdjSortAscending;
    this.ServerId = other.ServerId;
    this.ServerIdFetch = other.ServerIdFetch;
    this.ServerIdSort = other.ServerIdSort;
    this.ServerIdSortAscending = other.ServerIdSortAscending;
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.ServiceInternalId = other.ServiceInternalId;
    this.ServiceInternalIdFetch = other.ServiceInternalIdFetch;
    this.ServiceInternalIdSort = other.ServiceInternalIdSort;
    this.ServiceInternalIdSortAscending = other.ServiceInternalIdSortAscending;
    this.ServiceInternalIdResets = other.ServiceInternalIdResets;
    this.ServiceInternalIdResetsFetch = other.ServiceInternalIdResetsFetch;
    this.ServiceInternalIdResetsSort = other.ServiceInternalIdResetsSort;
    this.ServiceInternalIdResetsSortAscending = other.ServiceInternalIdResetsSortAscending;
    this.TransCode = other.TransCode;
    this.TransCodeFetch = other.TransCodeFetch;
    this.TransCodeSort = other.TransCodeSort;
    this.TransCodeSortAscending = other.TransCodeSortAscending;
    this.OrigTransCode = other.OrigTransCode;
    this.OrigTransCodeFetch = other.OrigTransCodeFetch;
    this.OrigTransCodeSort = other.OrigTransCodeSort;
    this.OrigTransCodeSortAscending = other.OrigTransCodeSortAscending;
    this.Annotation = other.Annotation;
    this.AnnotationFetch = other.AnnotationFetch;
    this.AnnotationSort = other.AnnotationSort;
    this.AnnotationCaseInsensitive = other.AnnotationCaseInsensitive;
    this.AnnotationSortAscending = other.AnnotationSortAscending;
    this.PrimaryUnitsType = other.PrimaryUnitsType;
    this.PrimaryUnitsTypeFetch = other.PrimaryUnitsTypeFetch;
    this.PrimaryUnitsTypeSort = other.PrimaryUnitsTypeSort;
    this.PrimaryUnitsTypeSortAscending = other.PrimaryUnitsTypeSortAscending;
    this.PrimaryUnits = other.PrimaryUnits;
    this.PrimaryUnitsFetch = other.PrimaryUnitsFetch;
    this.PrimaryUnitsSort = other.PrimaryUnitsSort;
    this.PrimaryUnitsSortAscending = other.PrimaryUnitsSortAscending;
    this.TransactDate = other.TransactDate;
    this.TransactDateFetch = other.TransactDateFetch;
    this.TransactDateSort = other.TransactDateSort;
    this.TransactDateSortAscending = other.TransactDateSortAscending;
    this.EffectiveDate = other.EffectiveDate;
    this.EffectiveDateFetch = other.EffectiveDateFetch;
    this.EffectiveDateSort = other.EffectiveDateSort;
    this.EffectiveDateSortAscending = other.EffectiveDateSortAscending;
    this.InactiveDate = other.InactiveDate;
    this.InactiveDateFetch = other.InactiveDateFetch;
    this.InactiveDateSort = other.InactiveDateSort;
    this.InactiveDateSortAscending = other.InactiveDateSortAscending;
    this.TrackingIdCounter = other.TrackingIdCounter;
    this.TrackingIdCounterFetch = other.TrackingIdCounterFetch;
    this.TrackingIdCounterSort = other.TrackingIdCounterSort;
    this.TrackingIdCounterSortAscending = other.TrackingIdCounterSortAscending;
    this.RequestStatus = other.RequestStatus;
    this.RequestStatusFetch = other.RequestStatusFetch;
    this.RequestStatusSort = other.RequestStatusSort;
    this.RequestStatusSortAscending = other.RequestStatusSortAscending;
    this.ReviewDate = other.ReviewDate;
    this.ReviewDateFetch = other.ReviewDateFetch;
    this.ReviewDateSort = other.ReviewDateSort;
    this.ReviewDateSortAscending = other.ReviewDateSortAscending;
    this.SupervisorName = other.SupervisorName;
    this.SupervisorNameFetch = other.SupervisorNameFetch;
    this.SupervisorNameSort = other.SupervisorNameSort;
    this.SupervisorNameCaseInsensitive = other.SupervisorNameCaseInsensitive;
    this.SupervisorNameSortAscending = other.SupervisorNameSortAscending;
    this.CurrentFlag = other.CurrentFlag;
    this.CurrentFlagFetch = other.CurrentFlagFetch;
    this.CurrentFlagSort = other.CurrentFlagSort;
    this.CurrentFlagSortAscending = other.CurrentFlagSortAscending;
    this.PendingFlag = other.PendingFlag;
    this.PendingFlagFetch = other.PendingFlagFetch;
    this.PendingFlagSort = other.PendingFlagSort;
    this.PendingFlagSortAscending = other.PendingFlagSortAscending;
    this.NoBill = other.NoBill;
    this.NoBillFetch = other.NoBillFetch;
    this.NoBillSort = other.NoBillSort;
    this.NoBillSortAscending = other.NoBillSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.TotalAmt = other.TotalAmt;
    this.TotalAmtFetch = other.TotalAmtFetch;
    this.TotalAmtSort = other.TotalAmtSort;
    this.TotalAmtSortAscending = other.TotalAmtSortAscending;
    this.RatedFlag = other.RatedFlag;
    this.RatedFlagFetch = other.RatedFlagFetch;
    this.RatedFlagSort = other.RatedFlagSort;
    this.RatedFlagSortAscending = other.RatedFlagSortAscending;
    this.ArchFlag = other.ArchFlag;
    this.ArchFlagFetch = other.ArchFlagFetch;
    this.ArchFlagSort = other.ArchFlagSort;
    this.ArchFlagSortAscending = other.ArchFlagSortAscending;
    this.OrigProviderId = other.OrigProviderId;
    this.OrigProviderIdFetch = other.OrigProviderIdFetch;
    this.OrigProviderIdSort = other.OrigProviderIdSort;
    this.OrigProviderIdSortAscending = other.OrigProviderIdSortAscending;
    this.OrigBillRefNo = other.OrigBillRefNo;
    this.OrigBillRefNoFetch = other.OrigBillRefNoFetch;
    this.OrigBillRefNoSort = other.OrigBillRefNoSort;
    this.OrigBillRefNoSortAscending = other.OrigBillRefNoSortAscending;
    this.OrigBillRefResets = other.OrigBillRefResets;
    this.OrigBillRefResetsFetch = other.OrigBillRefResetsFetch;
    this.OrigBillRefResetsSort = other.OrigBillRefResetsSort;
    this.OrigBillRefResetsSortAscending = other.OrigBillRefResetsSortAscending;
    this.OrigBillInvoiceRow = other.OrigBillInvoiceRow;
    this.OrigBillInvoiceRowFetch = other.OrigBillInvoiceRowFetch;
    this.OrigBillInvoiceRowSort = other.OrigBillInvoiceRowSort;
    this.OrigBillInvoiceRowSortAscending = other.OrigBillInvoiceRowSortAscending;
    this.OrigType = other.OrigType;
    this.OrigTypeFetch = other.OrigTypeFetch;
    this.OrigTypeSort = other.OrigTypeSort;
    this.OrigTypeSortAscending = other.OrigTypeSortAscending;
    this.OrigSubtype = other.OrigSubtype;
    this.OrigSubtypeFetch = other.OrigSubtypeFetch;
    this.OrigSubtypeSort = other.OrigSubtypeSort;
    this.OrigSubtypeSortAscending = other.OrigSubtypeSortAscending;
    this.OrigMsgId = other.OrigMsgId;
    this.OrigMsgIdFetch = other.OrigMsgIdFetch;
    this.OrigMsgIdSort = other.OrigMsgIdSort;
    this.OrigMsgIdSortAscending = other.OrigMsgIdSortAscending;
    this.OrigMsgId2 = other.OrigMsgId2;
    this.OrigMsgId2Fetch = other.OrigMsgId2Fetch;
    this.OrigMsgId2Sort = other.OrigMsgId2Sort;
    this.OrigMsgId2SortAscending = other.OrigMsgId2SortAscending;
    this.OrigMsgIdServ = other.OrigMsgIdServ;
    this.OrigMsgIdServFetch = other.OrigMsgIdServFetch;
    this.OrigMsgIdServSort = other.OrigMsgIdServSort;
    this.OrigMsgIdServSortAscending = other.OrigMsgIdServSortAscending;
    this.OrigTrackingId = other.OrigTrackingId;
    this.OrigTrackingIdFetch = other.OrigTrackingIdFetch;
    this.OrigTrackingIdSort = other.OrigTrackingIdSort;
    this.OrigTrackingIdSortAscending = other.OrigTrackingIdSortAscending;
    this.OrigTrackingIdServ = other.OrigTrackingIdServ;
    this.OrigTrackingIdServFetch = other.OrigTrackingIdServFetch;
    this.OrigTrackingIdServSort = other.OrigTrackingIdServSort;
    this.OrigTrackingIdServSortAscending = other.OrigTrackingIdServSortAscending;
    this.OrigTrackingDt = other.OrigTrackingDt;
    this.OrigTrackingDtFetch = other.OrigTrackingDtFetch;
    this.OrigTrackingDtSort = other.OrigTrackingDtSort;
    this.OrigTrackingDtSortAscending = other.OrigTrackingDtSortAscending;
    this.OrigRcFromDate = other.OrigRcFromDate;
    this.OrigRcFromDateFetch = other.OrigRcFromDateFetch;
    this.OrigRcFromDateSort = other.OrigRcFromDateSort;
    this.OrigRcFromDateSortAscending = other.OrigRcFromDateSortAscending;
    this.BillRefNo = other.BillRefNo;
    this.BillRefNoFetch = other.BillRefNoFetch;
    this.BillRefNoSort = other.BillRefNoSort;
    this.BillRefNoSortAscending = other.BillRefNoSortAscending;
    this.BillRefResets = other.BillRefResets;
    this.BillRefResetsFetch = other.BillRefResetsFetch;
    this.BillRefResetsSort = other.BillRefResetsSort;
    this.BillRefResetsSortAscending = other.BillRefResetsSortAscending;
    this.TaxClass = other.TaxClass;
    this.TaxClassFetch = other.TaxClassFetch;
    this.TaxClassSort = other.TaxClassSort;
    this.TaxClassSortAscending = other.TaxClassSortAscending;
    this.TaxPkgInstId = other.TaxPkgInstId;
    this.TaxPkgInstIdFetch = other.TaxPkgInstIdFetch;
    this.TaxPkgInstIdSort = other.TaxPkgInstIdSort;
    this.TaxPkgInstIdSortAscending = other.TaxPkgInstIdSortAscending;
    this.Geocode = other.Geocode;
    this.GeocodeFetch = other.GeocodeFetch;
    this.GeocodeSort = other.GeocodeSort;
    this.GeocodeCaseInsensitive = other.GeocodeCaseInsensitive;
    this.GeocodeSortAscending = other.GeocodeSortAscending;
    this.AuxTaxInfo = other.AuxTaxInfo;
    this.AuxTaxInfoFetch = other.AuxTaxInfoFetch;
    this.AuxTaxInfoSort = other.AuxTaxInfoSort;
    this.AuxTaxInfoCaseInsensitive = other.AuxTaxInfoCaseInsensitive;
    this.AuxTaxInfoSortAscending = other.AuxTaxInfoSortAscending;
    this.CombTaxRate = other.CombTaxRate;
    this.CombTaxRateFetch = other.CombTaxRateFetch;
    this.CombTaxRateSort = other.CombTaxRateSort;
    this.CombTaxRateSortAscending = other.CombTaxRateSortAscending;
    this.FederalTax = other.FederalTax;
    this.FederalTaxFetch = other.FederalTaxFetch;
    this.FederalTaxSort = other.FederalTaxSort;
    this.FederalTaxSortAscending = other.FederalTaxSortAscending;
    this.StateTax = other.StateTax;
    this.StateTaxFetch = other.StateTaxFetch;
    this.StateTaxSort = other.StateTaxSort;
    this.StateTaxSortAscending = other.StateTaxSortAscending;
    this.CountyTax = other.CountyTax;
    this.CountyTaxFetch = other.CountyTaxFetch;
    this.CountyTaxSort = other.CountyTaxSort;
    this.CountyTaxSortAscending = other.CountyTaxSortAscending;
    this.CityTax = other.CityTax;
    this.CityTaxFetch = other.CityTaxFetch;
    this.CityTaxSort = other.CityTaxSort;
    this.CityTaxSortAscending = other.CityTaxSortAscending;
    this.OtherTax = other.OtherTax;
    this.OtherTaxFetch = other.OtherTaxFetch;
    this.OtherTaxSort = other.OtherTaxSort;
    this.OtherTaxSortAscending = other.OtherTaxSortAscending;
    this.TaxJournalStatus = other.TaxJournalStatus;
    this.TaxJournalStatusFetch = other.TaxJournalStatusFetch;
    this.TaxJournalStatusSort = other.TaxJournalStatusSort;
    this.TaxJournalStatusSortAscending = other.TaxJournalStatusSortAscending;
    this.DiscountAmt = other.DiscountAmt;
    this.DiscountAmtFetch = other.DiscountAmtFetch;
    this.DiscountAmtSort = other.DiscountAmtSort;
    this.DiscountAmtSortAscending = other.DiscountAmtSortAscending;
    this.ProfileId = other.ProfileId;
    this.ProfileIdFetch = other.ProfileIdFetch;
    this.ProfileIdSort = other.ProfileIdSort;
    this.ProfileIdSortAscending = other.ProfileIdSortAscending;
    this.AdjReasonCode = other.AdjReasonCode;
    this.AdjReasonCodeFetch = other.AdjReasonCodeFetch;
    this.AdjReasonCodeSort = other.AdjReasonCodeSort;
    this.AdjReasonCodeSortAscending = other.AdjReasonCodeSortAscending;
    this.FraudIndicator = other.FraudIndicator;
    this.FraudIndicatorFetch = other.FraudIndicatorFetch;
    this.FraudIndicatorSort = other.FraudIndicatorSort;
    this.FraudIndicatorSortAscending = other.FraudIndicatorSortAscending;
    this.RevRcvCostCtr = other.RevRcvCostCtr;
    this.RevRcvCostCtrFetch = other.RevRcvCostCtrFetch;
    this.RevRcvCostCtrSort = other.RevRcvCostCtrSort;
    this.RevRcvCostCtrSortAscending = other.RevRcvCostCtrSortAscending;
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;
    this.ChgDate = other.ChgDate;
    this.ChgDateFetch = other.ChgDateFetch;
    this.ChgDateSort = other.ChgDateSort;
    this.ChgDateSortAscending = other.ChgDateSortAscending;
    this.BalanceChgDate = other.BalanceChgDate;
    this.BalanceChgDateFetch = other.BalanceChgDateFetch;
    this.BalanceChgDateSort = other.BalanceChgDateSort;
    this.BalanceChgDateSortAscending = other.BalanceChgDateSortAscending;
    this.BRevRcvCostCtr = other.BRevRcvCostCtr;
    this.BRevRcvCostCtrFetch = other.BRevRcvCostCtrFetch;
    this.BRevRcvCostCtrSort = other.BRevRcvCostCtrSort;
    this.BRevRcvCostCtrSortAscending = other.BRevRcvCostCtrSortAscending;
    this.OrigSplitRowNum = other.OrigSplitRowNum;
    this.OrigSplitRowNumFetch = other.OrigSplitRowNumFetch;
    this.OrigSplitRowNumSort = other.OrigSplitRowNumSort;
    this.OrigSplitRowNumSortAscending = other.OrigSplitRowNumSortAscending;
    this.TaxTypeCode = other.TaxTypeCode;
    this.TaxTypeCodeFetch = other.TaxTypeCodeFetch;
    this.TaxTypeCodeSort = other.TaxTypeCodeSort;
    this.TaxTypeCodeSortAscending = other.TaxTypeCodeSortAscending;
    this.OrigSubmitterName = other.OrigSubmitterName;
    this.OrigSubmitterNameFetch = other.OrigSubmitterNameFetch;
    this.OrigSubmitterNameSort = other.OrigSubmitterNameSort;
    this.OrigSubmitterNameCaseInsensitive = other.OrigSubmitterNameCaseInsensitive;
    this.OrigSubmitterNameSortAscending = other.OrigSubmitterNameSortAscending;
    this.LastReviewedName = other.LastReviewedName;
    this.LastReviewedNameFetch = other.LastReviewedNameFetch;
    this.LastReviewedNameSort = other.LastReviewedNameSort;
    this.LastReviewedNameCaseInsensitive = other.LastReviewedNameCaseInsensitive;
    this.LastReviewedNameSortAscending = other.LastReviewedNameSortAscending;
    this.Jurisdiction = other.Jurisdiction;
    this.JurisdictionFetch = other.JurisdictionFetch;
    this.JurisdictionSort = other.JurisdictionSort;
    this.JurisdictionSortAscending = other.JurisdictionSortAscending;
    this.OpenItemId = other.OpenItemId;
    this.OpenItemIdFetch = other.OpenItemIdFetch;
    this.OpenItemIdSort = other.OpenItemIdSort;
    this.OpenItemIdSortAscending = other.OpenItemIdSortAscending;
    this.BillOrderNumber = other.BillOrderNumber;
    this.BillOrderNumberFetch = other.BillOrderNumberFetch;
    this.BillOrderNumberSort = other.BillOrderNumberSort;
    this.BillOrderNumberCaseInsensitive = other.BillOrderNumberCaseInsensitive;
    this.BillOrderNumberSortAscending = other.BillOrderNumberSortAscending;
    this.RequestId = other.RequestId;
    this.RequestIdFetch = other.RequestIdFetch;
    this.RequestIdSort = other.RequestIdSort;
    this.RequestIdSortAscending = other.RequestIdSortAscending;  }
  /** get the filter for this object's key
   * @return AdjustmentObjectKeyFilter
   */
  public AdjustmentObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (AdjustmentObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TrackingId (ADJ.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AdjustmentObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (ADJ.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (ADJ.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AdjustmentObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (ADJ.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (ADJ.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AdjustmentObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (ADJ.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (ADJ.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AdjustmentObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (ADJ.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (ADJ.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AdjustmentObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (ADJ.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (ADJ.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AdjustmentObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (ADJ.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (ADJ.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AdjustmentObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (ADJ.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (ADJ.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AdjustmentObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (ADJ.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: CcardAccount (PAYMENT_PROFILE.card_account)
   * @param fetch whether to fetch this field or not
   */
  public void setCcardAccountFetch (boolean fetch) {
    this.CcardAccountFetch = fetch;
  }
  /** Retrieve Fetch value for field: CcardAccount (PAYMENT_PROFILE.card_account)
   * @return boolean the Fetch value for this field
   */
  public boolean getCcardAccountFetch () {
    return this.CcardAccountFetch;
  }
  /** Set the SortOrder for field: CcardAccount (PAYMENT_PROFILE.card_account)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCcardAccountSortOrder (Integer value) {
    this.CcardAccountSort = value;
  }
  /** Retrieve SortOrder for field: CcardAccount (PAYMENT_PROFILE.card_account)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCcardAccountSortOrder () {
    return this.CcardAccountSort;
  }
  /** Set the sort direction for field: CcardAccount (PAYMENT_PROFILE.card_account)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCcardAccountSortDirection (boolean ascending) {
    this.CcardAccountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CcardAccount (PAYMENT_PROFILE.card_account)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCcardAccountSortDirection () {
    return this.CcardAccountSortAscending;
  }
  /** Set the case insensitive for field: CcardAccount (PAYMENT_PROFILE.card_account)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCcardAccountCaseInsensitive (boolean ascending) {
    this.CcardAccountCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CcardAccount (PAYMENT_PROFILE.card_account)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCcardAccountCaseInsensitive () {
    return this.CcardAccountCaseInsensitive;
  }
  /** Set the field level filters for field: CcardAccount (PAYMENT_PROFILE.card_account)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCcardAccountFilter (StringFilter[] value) throws ServiceException {
    this.CcardAccount = value;
  }
  /** Retrieve filter for field: CcardAccount (PAYMENT_PROFILE.card_account)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCcardAccountFilter () {
    return this.CcardAccount;
  }

  /**
   * Retrieves the CcardAccountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CcardAccountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CcardAccountFilter field
   */
  public String[] getCcardAccountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardAccountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCcardAccountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcardAccountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardAccountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcardAccountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CcardAccountFilter filter value from a formatted string
   *
   * @param _value the CcardAccountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CcardAccountFilter filter field
   */
  public void setCcardAccountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCcardAccountFilterFromFormattedString");
    try {
      this.setCcardAccountFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardAccountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCcardAccountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCcardAccountFilterFromFormattedString");
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

  /** Set the field level Fetch value for field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @param fetch whether to fetch this field or not
   */
  public void setCcardCarrierFetch (boolean fetch) {
    this.CcardCarrierFetch = fetch;
  }
  /** Retrieve Fetch value for field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @return boolean the Fetch value for this field
   */
  public boolean getCcardCarrierFetch () {
    return this.CcardCarrierFetch;
  }
  /** Set the SortOrder for field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCcardCarrierSortOrder (Integer value) {
    this.CcardCarrierSort = value;
  }
  /** Retrieve SortOrder for field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCcardCarrierSortOrder () {
    return this.CcardCarrierSort;
  }
  /** Set the sort direction for field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCcardCarrierSortDirection (boolean ascending) {
    this.CcardCarrierSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCcardCarrierSortDirection () {
    return this.CcardCarrierSortAscending;
  }
  /** Set the case insensitive for field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCcardCarrierCaseInsensitive (boolean ascending) {
    this.CcardCarrierCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCcardCarrierCaseInsensitive () {
    return this.CcardCarrierCaseInsensitive;
  }
  /** Set the field level filters for field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCcardCarrierFilter (StringFilter[] value) throws ServiceException {
    this.CcardCarrier = value;
  }
  /** Retrieve filter for field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCcardCarrierFilter () {
    return this.CcardCarrier;
  }

  /**
   * Retrieves the CcardCarrierFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CcardCarrierFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CcardCarrierFilter field
   */
  public String[] getCcardCarrierFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardCarrierFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCcardCarrierFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcardCarrierFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardCarrierFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcardCarrierFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CcardCarrierFilter filter value from a formatted string
   *
   * @param _value the CcardCarrierFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CcardCarrierFilter filter field
   */
  public void setCcardCarrierFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCcardCarrierFilterFromFormattedString");
    try {
      this.setCcardCarrierFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardCarrierFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCcardCarrierFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCcardCarrierFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated CcardCarrierFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CcardCarrierFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CcardCarrierFilter filter field
   */
  public String[] getCcardCarrierFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardCarrierFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getCcardCarrierFilter(), "CardTypeCode", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcardCarrierFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardCarrierFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcardCarrierFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated CcardCarrierFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the CcardCarrierFilter filter field
   */
  public void setCcardCarrierFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCcardCarrierFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setCcardCarrierFilter((StringFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "CcardCarrier", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardCarrierFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCcardCarrierFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCcardCarrierFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @param fetch whether to fetch this field or not
   */
  public void setCcardExpireFetch (boolean fetch) {
    this.CcardExpireFetch = fetch;
  }
  /** Retrieve Fetch value for field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @return boolean the Fetch value for this field
   */
  public boolean getCcardExpireFetch () {
    return this.CcardExpireFetch;
  }
  /** Set the SortOrder for field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCcardExpireSortOrder (Integer value) {
    this.CcardExpireSort = value;
  }
  /** Retrieve SortOrder for field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCcardExpireSortOrder () {
    return this.CcardExpireSort;
  }
  /** Set the sort direction for field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCcardExpireSortDirection (boolean ascending) {
    this.CcardExpireSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCcardExpireSortDirection () {
    return this.CcardExpireSortAscending;
  }
  /** Set the case insensitive for field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCcardExpireCaseInsensitive (boolean ascending) {
    this.CcardExpireCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCcardExpireCaseInsensitive () {
    return this.CcardExpireCaseInsensitive;
  }
  /** Set the field level filters for field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCcardExpireFilter (StringFilter[] value) throws ServiceException {
    this.CcardExpire = value;
  }
  /** Retrieve filter for field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCcardExpireFilter () {
    return this.CcardExpire;
  }

  /**
   * Retrieves the CcardExpireFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CcardExpireFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CcardExpireFilter field
   */
  public String[] getCcardExpireFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardExpireFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCcardExpireFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcardExpireFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardExpireFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcardExpireFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CcardExpireFilter filter value from a formatted string
   *
   * @param _value the CcardExpireFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CcardExpireFilter filter field
   */
  public void setCcardExpireFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCcardExpireFilterFromFormattedString");
    try {
      this.setCcardExpireFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardExpireFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCcardExpireFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCcardExpireFilterFromFormattedString");
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


  /** Set the field level Fetch value for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceExternalIdFetch (boolean fetch) {
    this.ServiceExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceExternalIdFetch () {
    return this.ServiceExternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceExternalIdSortOrder (Integer value) {
    this.ServiceExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceExternalIdSortOrder () {
    return this.ServiceExternalIdSort;
  }
  /** Set the sort direction for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceExternalIdSortDirection (boolean ascending) {
    this.ServiceExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceExternalIdSortDirection () {
    return this.ServiceExternalIdSortAscending;
  }
  /** Set the case insensitive for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setServiceExternalIdCaseInsensitive (boolean ascending) {
    this.ServiceExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getServiceExternalIdCaseInsensitive () {
    return this.ServiceExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.ServiceExternalId = value;
  }
  /** Retrieve filter for field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getServiceExternalIdFilter () {
    return this.ServiceExternalId;
  }

  /**
   * Retrieves the ServiceExternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceExternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceExternalIdFilter field
   */
  public String[] getServiceExternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceExternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceExternalIdFilter filter value from a formatted string
   *
   * @param _value the ServiceExternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceExternalIdFilter filter field
   */
  public void setServiceExternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceExternalIdFilterFromFormattedString");
    try {
      this.setServiceExternalIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceExternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceExternalIdTypeFetch (boolean fetch) {
    this.ServiceExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceExternalIdTypeFetch () {
    return this.ServiceExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceExternalIdTypeSortOrder (Integer value) {
    this.ServiceExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceExternalIdTypeSortOrder () {
    return this.ServiceExternalIdTypeSort;
  }
  /** Set the sort direction for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceExternalIdTypeSortDirection (boolean ascending) {
    this.ServiceExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceExternalIdTypeSortDirection () {
    return this.ServiceExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceExternalIdType = value;
  }
  /** Retrieve filter for field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceExternalIdTypeFilter () {
    return this.ServiceExternalIdType;
  }

  /**
   * Retrieves the ServiceExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceExternalIdTypeFilter field
   */
  public String[] getServiceExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the ServiceExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceExternalIdTypeFilter filter field
   */
  public void setServiceExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceExternalIdTypeFilterFromFormattedString");
    try {
      this.setServiceExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceExternalIdTypeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated ServiceExternalIdTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ServiceExternalIdTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ServiceExternalIdTypeFilter filter field
   */
  public String[] getServiceExternalIdTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getServiceExternalIdTypeFilter(), "ExternalIdType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated ServiceExternalIdTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceExternalIdTypeFilter filter field
   */
  public void setServiceExternalIdTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceExternalIdTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setServiceExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "ServiceExternalIdType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceExternalIdTypeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @param fetch whether to fetch this field or not
   */
  public void setPrepayBalanceDescFetch (boolean fetch) {
    this.PrepayBalanceDescFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrepayBalanceDescFetch () {
    return this.PrepayBalanceDescFetch;
  }
  /** Set the SortOrder for field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrepayBalanceDescSortOrder (Integer value) {
    this.PrepayBalanceDescSort = value;
  }
  /** Retrieve SortOrder for field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrepayBalanceDescSortOrder () {
    return this.PrepayBalanceDescSort;
  }
  /** Set the sort direction for field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrepayBalanceDescSortDirection (boolean ascending) {
    this.PrepayBalanceDescSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrepayBalanceDescSortDirection () {
    return this.PrepayBalanceDescSortAscending;
  }
  /** Set the case insensitive for field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPrepayBalanceDescCaseInsensitive (boolean ascending) {
    this.PrepayBalanceDescCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPrepayBalanceDescCaseInsensitive () {
    return this.PrepayBalanceDescCaseInsensitive;
  }
  /** Set the field level filters for field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrepayBalanceDescFilter (StringFilter[] value) throws ServiceException {
    this.PrepayBalanceDesc = value;
  }
  /** Retrieve filter for field: PrepayBalanceDesc (ACCOUNT_BALANCES.balance_desc)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPrepayBalanceDescFilter () {
    return this.PrepayBalanceDesc;
  }

  /**
   * Retrieves the PrepayBalanceDescFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrepayBalanceDescFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepayBalanceDescFilter field
   */
  public String[] getPrepayBalanceDescFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepayBalanceDescFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrepayBalanceDescFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepayBalanceDescFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepayBalanceDescFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepayBalanceDescFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrepayBalanceDescFilter filter value from a formatted string
   *
   * @param _value the PrepayBalanceDescFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrepayBalanceDescFilter filter field
   */
  public void setPrepayBalanceDescFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepayBalanceDescFilterFromFormattedString");
    try {
      this.setPrepayBalanceDescFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepayBalanceDescFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepayBalanceDescFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepayBalanceDescFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransSign (ADJ_TRANS_DESCR.trans_sign)
   * @param fetch whether to fetch this field or not
   */
  public void setTransSignFetch (boolean fetch) {
    this.TransSignFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransSign (ADJ_TRANS_DESCR.trans_sign)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransSignFetch () {
    return this.TransSignFetch;
  }
  /** Set the SortOrder for field: TransSign (ADJ_TRANS_DESCR.trans_sign)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransSignSortOrder (Integer value) {
    this.TransSignSort = value;
  }
  /** Retrieve SortOrder for field: TransSign (ADJ_TRANS_DESCR.trans_sign)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransSignSortOrder () {
    return this.TransSignSort;
  }
  /** Set the sort direction for field: TransSign (ADJ_TRANS_DESCR.trans_sign)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransSignSortDirection (boolean ascending) {
    this.TransSignSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransSign (ADJ_TRANS_DESCR.trans_sign)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransSignSortDirection () {
    return this.TransSignSortAscending;
  }
  /** Set the field level filters for field: TransSign (ADJ_TRANS_DESCR.trans_sign)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransSignFilter (IntegerFilter[] value) throws ServiceException {
    this.TransSign = value;
  }
  /** Retrieve filter for field: TransSign (ADJ_TRANS_DESCR.trans_sign)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTransSignFilter () {
    return this.TransSign;
  }

  /**
   * Retrieves the TransSignFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransSignFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransSignFilter field
   */
  public String[] getTransSignFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSignFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransSignFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSignFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransSignFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransSignFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransSignFilter filter value from a formatted string
   *
   * @param _value the TransSignFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransSignFilter filter field
   */
  public void setTransSignFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransSignFilterFromFormattedString");
    try {
      this.setTransSignFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransSignFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransSignFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransSignFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillingCategory (ADJ_TRANS_DESCR.billing_category)
   * @param fetch whether to fetch this field or not
   */
  public void setBillingCategoryFetch (boolean fetch) {
    this.BillingCategoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillingCategory (ADJ_TRANS_DESCR.billing_category)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillingCategoryFetch () {
    return this.BillingCategoryFetch;
  }
  /** Set the SortOrder for field: BillingCategory (ADJ_TRANS_DESCR.billing_category)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillingCategorySortOrder (Integer value) {
    this.BillingCategorySort = value;
  }
  /** Retrieve SortOrder for field: BillingCategory (ADJ_TRANS_DESCR.billing_category)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillingCategorySortOrder () {
    return this.BillingCategorySort;
  }
  /** Set the sort direction for field: BillingCategory (ADJ_TRANS_DESCR.billing_category)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillingCategorySortDirection (boolean ascending) {
    this.BillingCategorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillingCategory (ADJ_TRANS_DESCR.billing_category)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillingCategorySortDirection () {
    return this.BillingCategorySortAscending;
  }
  /** Set the field level filters for field: BillingCategory (ADJ_TRANS_DESCR.billing_category)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillingCategoryFilter (IntegerFilter[] value) throws ServiceException {
    this.BillingCategory = value;
  }
  /** Retrieve filter for field: BillingCategory (ADJ_TRANS_DESCR.billing_category)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillingCategoryFilter () {
    return this.BillingCategory;
  }

  /**
   * Retrieves the BillingCategoryFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillingCategoryFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingCategoryFilter field
   */
  public String[] getBillingCategoryFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingCategoryFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillingCategoryFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingCategoryFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingCategoryFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillingCategoryFilter filter value from a formatted string
   *
   * @param _value the BillingCategoryFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillingCategoryFilter filter field
   */
  public void setBillingCategoryFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingCategoryFilterFromFormattedString");
    try {
      this.setBillingCategoryFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingCategoryFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingCategoryFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransTargetType (ADJ_TRANS_DESCR.trans_target_type)
   * @param fetch whether to fetch this field or not
   */
  public void setTransTargetTypeFetch (boolean fetch) {
    this.TransTargetTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransTargetType (ADJ_TRANS_DESCR.trans_target_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransTargetTypeFetch () {
    return this.TransTargetTypeFetch;
  }
  /** Set the SortOrder for field: TransTargetType (ADJ_TRANS_DESCR.trans_target_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransTargetTypeSortOrder (Integer value) {
    this.TransTargetTypeSort = value;
  }
  /** Retrieve SortOrder for field: TransTargetType (ADJ_TRANS_DESCR.trans_target_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransTargetTypeSortOrder () {
    return this.TransTargetTypeSort;
  }
  /** Set the sort direction for field: TransTargetType (ADJ_TRANS_DESCR.trans_target_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransTargetTypeSortDirection (boolean ascending) {
    this.TransTargetTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransTargetType (ADJ_TRANS_DESCR.trans_target_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransTargetTypeSortDirection () {
    return this.TransTargetTypeSortAscending;
  }
  /** Set the field level filters for field: TransTargetType (ADJ_TRANS_DESCR.trans_target_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransTargetTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.TransTargetType = value;
  }
  /** Retrieve filter for field: TransTargetType (ADJ_TRANS_DESCR.trans_target_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTransTargetTypeFilter () {
    return this.TransTargetType;
  }

  /**
   * Retrieves the TransTargetTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransTargetTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransTargetTypeFilter field
   */
  public String[] getTransTargetTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransTargetTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransTargetTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransTargetTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransTargetTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransTargetTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransTargetTypeFilter filter value from a formatted string
   *
   * @param _value the TransTargetTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransTargetTypeFilter filter field
   */
  public void setTransTargetTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransTargetTypeFilterFromFormattedString");
    try {
      this.setTransTargetTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransTargetTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransTargetTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransTargetTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsNegativeBillAdj (ADJ_TRANS_DESCR.is_negative_bill_adj)
   * @param fetch whether to fetch this field or not
   */
  public void setIsNegativeBillAdjFetch (boolean fetch) {
    this.IsNegativeBillAdjFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsNegativeBillAdj (ADJ_TRANS_DESCR.is_negative_bill_adj)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsNegativeBillAdjFetch () {
    return this.IsNegativeBillAdjFetch;
  }
  /** Set the SortOrder for field: IsNegativeBillAdj (ADJ_TRANS_DESCR.is_negative_bill_adj)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsNegativeBillAdjSortOrder (Integer value) {
    this.IsNegativeBillAdjSort = value;
  }
  /** Retrieve SortOrder for field: IsNegativeBillAdj (ADJ_TRANS_DESCR.is_negative_bill_adj)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsNegativeBillAdjSortOrder () {
    return this.IsNegativeBillAdjSort;
  }
  /** Set the sort direction for field: IsNegativeBillAdj (ADJ_TRANS_DESCR.is_negative_bill_adj)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsNegativeBillAdjSortDirection (boolean ascending) {
    this.IsNegativeBillAdjSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsNegativeBillAdj (ADJ_TRANS_DESCR.is_negative_bill_adj)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsNegativeBillAdjSortDirection () {
    return this.IsNegativeBillAdjSortAscending;
  }
  /** Set the field level filters for field: IsNegativeBillAdj (ADJ_TRANS_DESCR.is_negative_bill_adj)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsNegativeBillAdjFilter (BooleanFilter[] value) throws ServiceException {
    this.IsNegativeBillAdj = value;
  }
  /** Retrieve filter for field: IsNegativeBillAdj (ADJ_TRANS_DESCR.is_negative_bill_adj)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsNegativeBillAdjFilter () {
    return this.IsNegativeBillAdj;
  }

  /**
   * Retrieves the IsNegativeBillAdjFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsNegativeBillAdjFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsNegativeBillAdjFilter field
   */
  public String[] getIsNegativeBillAdjFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsNegativeBillAdjFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsNegativeBillAdjFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsNegativeBillAdjFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsNegativeBillAdjFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsNegativeBillAdjFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsNegativeBillAdjFilter filter value from a formatted string
   *
   * @param _value the IsNegativeBillAdjFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsNegativeBillAdjFilter filter field
   */
  public void setIsNegativeBillAdjFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsNegativeBillAdjFilterFromFormattedString");
    try {
      this.setIsNegativeBillAdjFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsNegativeBillAdjFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsNegativeBillAdjFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsNegativeBillAdjFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServerId
   * @param fetch whether to fetch this field or not
   */
  public void setServerIdFetch (boolean fetch)
  {
    this.ServerIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServerId
   * @return boolean the Fetch value for this field
   */
  public boolean getServerIdFetch ()
  {
    return this.ServerIdFetch;
  }
  /** Set the SortOrder for field: ServerId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServerIdSortOrder (Integer value)
  {
    this.ServerIdSort = value;
  }
  /** Retrieve SortOrder for field: ServerId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServerIdSortOrder ()
  {
    return this.ServerIdSort;
  }
  /** Set the sort direction for field: ServerId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServerIdSortDirection (boolean ascending)
  {
    this.ServerIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServerId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServerIdSortDirection ()
  {
    return this.ServerIdSortAscending;
  }
  /** Set the field level filters for field: ServerId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServerIdFilter (IntegerFilter[] value) throws ServiceException
  {
    this.ServerId = value;
  }
  /** Retrieve filter for field: ServerId
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServerIdFilter ()
  {
    return this.ServerId;
  }
  /** Set the field level Fetch value for field: AccountInternalId (ADJ.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (ADJ.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (ADJ.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (ADJ.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (ADJ.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (ADJ.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (ADJ.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (ADJ.account_no)
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

  /** Set the field level Fetch value for field: ServiceInternalId (ADJ.subscr_no)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdFetch (boolean fetch) {
    this.ServiceInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalId (ADJ.subscr_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdFetch () {
    return this.ServiceInternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceInternalId (ADJ.subscr_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdSortOrder (Integer value) {
    this.ServiceInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalId (ADJ.subscr_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdSortOrder () {
    return this.ServiceInternalIdSort;
  }
  /** Set the sort direction for field: ServiceInternalId (ADJ.subscr_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdSortDirection (boolean ascending) {
    this.ServiceInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalId (ADJ.subscr_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdSortDirection () {
    return this.ServiceInternalIdSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalId (ADJ.subscr_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalId = value;
  }
  /** Retrieve filter for field: ServiceInternalId (ADJ.subscr_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceInternalIdFilter () {
    return this.ServiceInternalId;
  }

  /**
   * Retrieves the ServiceInternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceInternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalIdFilter field
   */
  public String[] getServiceInternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceInternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceInternalIdFilter filter value from a formatted string
   *
   * @param _value the ServiceInternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceInternalIdFilter filter field
   */
  public void setServiceInternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
    try {
      this.setServiceInternalIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceInternalIdResets (ADJ.subscr_no_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdResetsFetch (boolean fetch) {
    this.ServiceInternalIdResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalIdResets (ADJ.subscr_no_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdResetsFetch () {
    return this.ServiceInternalIdResetsFetch;
  }
  /** Set the SortOrder for field: ServiceInternalIdResets (ADJ.subscr_no_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdResetsSortOrder (Integer value) {
    this.ServiceInternalIdResetsSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalIdResets (ADJ.subscr_no_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdResetsSortOrder () {
    return this.ServiceInternalIdResetsSort;
  }
  /** Set the sort direction for field: ServiceInternalIdResets (ADJ.subscr_no_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdResetsSortDirection (boolean ascending) {
    this.ServiceInternalIdResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalIdResets (ADJ.subscr_no_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdResetsSortDirection () {
    return this.ServiceInternalIdResetsSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalIdResets (ADJ.subscr_no_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalIdResets = value;
  }
  /** Retrieve filter for field: ServiceInternalIdResets (ADJ.subscr_no_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceInternalIdResetsFilter () {
    return this.ServiceInternalIdResets;
  }

  /**
   * Retrieves the ServiceInternalIdResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceInternalIdResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalIdResetsFilter field
   */
  public String[] getServiceInternalIdResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceInternalIdResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceInternalIdResetsFilter filter value from a formatted string
   *
   * @param _value the ServiceInternalIdResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceInternalIdResetsFilter filter field
   */
  public void setServiceInternalIdResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
    try {
      this.setServiceInternalIdResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInternalIdResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransCode (ADJ.adj_trans_code)
   * @param fetch whether to fetch this field or not
   */
  public void setTransCodeFetch (boolean fetch) {
    this.TransCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransCode (ADJ.adj_trans_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransCodeFetch () {
    return this.TransCodeFetch;
  }
  /** Set the SortOrder for field: TransCode (ADJ.adj_trans_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransCodeSortOrder (Integer value) {
    this.TransCodeSort = value;
  }
  /** Retrieve SortOrder for field: TransCode (ADJ.adj_trans_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransCodeSortOrder () {
    return this.TransCodeSort;
  }
  /** Set the sort direction for field: TransCode (ADJ.adj_trans_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransCodeSortDirection (boolean ascending) {
    this.TransCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransCode (ADJ.adj_trans_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransCodeSortDirection () {
    return this.TransCodeSortAscending;
  }
  /** Set the field level filters for field: TransCode (ADJ.adj_trans_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.TransCode = value;
  }
  /** Retrieve filter for field: TransCode (ADJ.adj_trans_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTransCodeFilter () {
    return this.TransCode;
  }

  /**
   * Retrieves the TransCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransCodeFilter field
   */
  public String[] getTransCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransCodeFilter filter value from a formatted string
   *
   * @param _value the TransCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransCodeFilter filter field
   */
  public void setTransCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransCodeFilterFromFormattedString");
    try {
      this.setTransCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransCodeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated TransCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the TransCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the TransCodeFilter filter field
   */
  public String[] getTransCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getTransCodeFilter(), "AdjustmentType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated TransCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the TransCodeFilter filter field
   */
  public void setTransCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setTransCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "TransCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransCodeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: OrigTransCode (ADJ.orig_trans_code)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigTransCodeFetch (boolean fetch) {
    this.OrigTransCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigTransCode (ADJ.orig_trans_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigTransCodeFetch () {
    return this.OrigTransCodeFetch;
  }
  /** Set the SortOrder for field: OrigTransCode (ADJ.orig_trans_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigTransCodeSortOrder (Integer value) {
    this.OrigTransCodeSort = value;
  }
  /** Retrieve SortOrder for field: OrigTransCode (ADJ.orig_trans_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigTransCodeSortOrder () {
    return this.OrigTransCodeSort;
  }
  /** Set the sort direction for field: OrigTransCode (ADJ.orig_trans_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigTransCodeSortDirection (boolean ascending) {
    this.OrigTransCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigTransCode (ADJ.orig_trans_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigTransCodeSortDirection () {
    return this.OrigTransCodeSortAscending;
  }
  /** Set the field level filters for field: OrigTransCode (ADJ.orig_trans_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigTransCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigTransCode = value;
  }
  /** Retrieve filter for field: OrigTransCode (ADJ.orig_trans_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigTransCodeFilter () {
    return this.OrigTransCode;
  }

  /**
   * Retrieves the OrigTransCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigTransCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigTransCodeFilter field
   */
  public String[] getOrigTransCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTransCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigTransCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTransCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTransCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTransCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigTransCodeFilter filter value from a formatted string
   *
   * @param _value the OrigTransCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigTransCodeFilter filter field
   */
  public void setOrigTransCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigTransCodeFilterFromFormattedString");
    try {
      this.setOrigTransCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTransCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTransCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigTransCodeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated OrigTransCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the OrigTransCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OrigTransCodeFilter filter field
   */
  public String[] getOrigTransCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTransCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getOrigTransCodeFilter(), "AdjustmentType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTransCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTransCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTransCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated OrigTransCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigTransCodeFilter filter field
   */
  public void setOrigTransCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigTransCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setOrigTransCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "OrigTransCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTransCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTransCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigTransCodeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: Annotation (ADJ.annotation)
   * @param fetch whether to fetch this field or not
   */
  public void setAnnotationFetch (boolean fetch) {
    this.AnnotationFetch = fetch;
  }
  /** Retrieve Fetch value for field: Annotation (ADJ.annotation)
   * @return boolean the Fetch value for this field
   */
  public boolean getAnnotationFetch () {
    return this.AnnotationFetch;
  }
  /** Set the SortOrder for field: Annotation (ADJ.annotation)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAnnotationSortOrder (Integer value) {
    this.AnnotationSort = value;
  }
  /** Retrieve SortOrder for field: Annotation (ADJ.annotation)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAnnotationSortOrder () {
    return this.AnnotationSort;
  }
  /** Set the sort direction for field: Annotation (ADJ.annotation)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAnnotationSortDirection (boolean ascending) {
    this.AnnotationSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Annotation (ADJ.annotation)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAnnotationSortDirection () {
    return this.AnnotationSortAscending;
  }
  /** Set the case insensitive for field: Annotation (ADJ.annotation)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAnnotationCaseInsensitive (boolean ascending) {
    this.AnnotationCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Annotation (ADJ.annotation)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAnnotationCaseInsensitive () {
    return this.AnnotationCaseInsensitive;
  }
  /** Set the field level filters for field: Annotation (ADJ.annotation)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAnnotationFilter (StringFilter[] value) throws ServiceException {
    this.Annotation = value;
  }
  /** Retrieve filter for field: Annotation (ADJ.annotation)
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

  /** Set the field level Fetch value for field: PrimaryUnitsType (ADJ.primary_units_type)
   * @param fetch whether to fetch this field or not
   */
  public void setPrimaryUnitsTypeFetch (boolean fetch) {
    this.PrimaryUnitsTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrimaryUnitsType (ADJ.primary_units_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrimaryUnitsTypeFetch () {
    return this.PrimaryUnitsTypeFetch;
  }
  /** Set the SortOrder for field: PrimaryUnitsType (ADJ.primary_units_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrimaryUnitsTypeSortOrder (Integer value) {
    this.PrimaryUnitsTypeSort = value;
  }
  /** Retrieve SortOrder for field: PrimaryUnitsType (ADJ.primary_units_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrimaryUnitsTypeSortOrder () {
    return this.PrimaryUnitsTypeSort;
  }
  /** Set the sort direction for field: PrimaryUnitsType (ADJ.primary_units_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrimaryUnitsTypeSortDirection (boolean ascending) {
    this.PrimaryUnitsTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrimaryUnitsType (ADJ.primary_units_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrimaryUnitsTypeSortDirection () {
    return this.PrimaryUnitsTypeSortAscending;
  }
  /** Set the field level filters for field: PrimaryUnitsType (ADJ.primary_units_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrimaryUnitsTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.PrimaryUnitsType = value;
  }
  /** Retrieve filter for field: PrimaryUnitsType (ADJ.primary_units_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPrimaryUnitsTypeFilter () {
    return this.PrimaryUnitsType;
  }

  /**
   * Retrieves the PrimaryUnitsTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrimaryUnitsTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrimaryUnitsTypeFilter field
   */
  public String[] getPrimaryUnitsTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrimaryUnitsTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrimaryUnitsTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrimaryUnitsTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrimaryUnitsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrimaryUnitsTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrimaryUnitsTypeFilter filter value from a formatted string
   *
   * @param _value the PrimaryUnitsTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrimaryUnitsTypeFilter filter field
   */
  public void setPrimaryUnitsTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrimaryUnitsTypeFilterFromFormattedString");
    try {
      this.setPrimaryUnitsTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrimaryUnitsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrimaryUnitsTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrimaryUnitsTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PrimaryUnits (ADJ.primary_units)
   * @param fetch whether to fetch this field or not
   */
  public void setPrimaryUnitsFetch (boolean fetch) {
    this.PrimaryUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrimaryUnits (ADJ.primary_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrimaryUnitsFetch () {
    return this.PrimaryUnitsFetch;
  }
  /** Set the SortOrder for field: PrimaryUnits (ADJ.primary_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrimaryUnitsSortOrder (Integer value) {
    this.PrimaryUnitsSort = value;
  }
  /** Retrieve SortOrder for field: PrimaryUnits (ADJ.primary_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrimaryUnitsSortOrder () {
    return this.PrimaryUnitsSort;
  }
  /** Set the sort direction for field: PrimaryUnits (ADJ.primary_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrimaryUnitsSortDirection (boolean ascending) {
    this.PrimaryUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrimaryUnits (ADJ.primary_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrimaryUnitsSortDirection () {
    return this.PrimaryUnitsSortAscending;
  }
  /** Set the field level filters for field: PrimaryUnits (ADJ.primary_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrimaryUnitsFilter (BigIntegerFilter[] value) throws ServiceException {
    this.PrimaryUnits = value;
  }
  /** Retrieve filter for field: PrimaryUnits (ADJ.primary_units)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getPrimaryUnitsFilter () {
    return this.PrimaryUnits;
  }

  /**
   * Retrieves the PrimaryUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrimaryUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrimaryUnitsFilter field
   */
  public String[] getPrimaryUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrimaryUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrimaryUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrimaryUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrimaryUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrimaryUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrimaryUnitsFilter filter value from a formatted string
   *
   * @param _value the PrimaryUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrimaryUnitsFilter filter field
   */
  public void setPrimaryUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrimaryUnitsFilterFromFormattedString");
    try {
      this.setPrimaryUnitsFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrimaryUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrimaryUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrimaryUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransactDate (ADJ.transact_date)
   * @param fetch whether to fetch this field or not
   */
  public void setTransactDateFetch (boolean fetch) {
    this.TransactDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransactDate (ADJ.transact_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransactDateFetch () {
    return this.TransactDateFetch;
  }
  /** Set the SortOrder for field: TransactDate (ADJ.transact_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransactDateSortOrder (Integer value) {
    this.TransactDateSort = value;
  }
  /** Retrieve SortOrder for field: TransactDate (ADJ.transact_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransactDateSortOrder () {
    return this.TransactDateSort;
  }
  /** Set the sort direction for field: TransactDate (ADJ.transact_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransactDateSortDirection (boolean ascending) {
    this.TransactDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransactDate (ADJ.transact_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransactDateSortDirection () {
    return this.TransactDateSortAscending;
  }
  /** Set the field level filters for field: TransactDate (ADJ.transact_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransactDateFilter (DateFilter[] value) throws ServiceException {
    this.TransactDate = value;
  }
  /** Retrieve filter for field: TransactDate (ADJ.transact_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getTransactDateFilter () {
    return this.TransactDate;
  }

  /**
   * Retrieves the TransactDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransactDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransactDateFilter field
   */
  public String[] getTransactDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransactDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransactDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransactDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransactDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransactDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransactDateFilter filter value from a formatted string
   *
   * @param _value the TransactDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransactDateFilter filter field
   */
  public void setTransactDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransactDateFilterFromFormattedString");
    try {
      this.setTransactDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransactDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransactDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransactDateFilterFromFormattedString");
  }

  /**
   * Retrieves the TransactDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransactDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransactDateFilter field
   */
  public String[] getTransactDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransactDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransactDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransactDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransactDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransactDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TransactDateFilter filter value from a formatted string
   *
   * @param _value the TransactDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransactDateFilter filter field
   */
  public void setTransactDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransactDateFilterFromFormattedDateTimeString");
    try {
      this.setTransactDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransactDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransactDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransactDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: EffectiveDate (ADJ.effective_date)
   * @param fetch whether to fetch this field or not
   */
  public void setEffectiveDateFetch (boolean fetch) {
    this.EffectiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: EffectiveDate (ADJ.effective_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getEffectiveDateFetch () {
    return this.EffectiveDateFetch;
  }
  /** Set the SortOrder for field: EffectiveDate (ADJ.effective_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEffectiveDateSortOrder (Integer value) {
    this.EffectiveDateSort = value;
  }
  /** Retrieve SortOrder for field: EffectiveDate (ADJ.effective_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEffectiveDateSortOrder () {
    return this.EffectiveDateSort;
  }
  /** Set the sort direction for field: EffectiveDate (ADJ.effective_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEffectiveDateSortDirection (boolean ascending) {
    this.EffectiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EffectiveDate (ADJ.effective_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEffectiveDateSortDirection () {
    return this.EffectiveDateSortAscending;
  }
  /** Set the field level filters for field: EffectiveDate (ADJ.effective_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEffectiveDateFilter (DateFilter[] value) throws ServiceException {
    this.EffectiveDate = value;
  }
  /** Retrieve filter for field: EffectiveDate (ADJ.effective_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getEffectiveDateFilter () {
    return this.EffectiveDate;
  }

  /**
   * Retrieves the EffectiveDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EffectiveDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EffectiveDateFilter field
   */
  public String[] getEffectiveDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEffectiveDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEffectiveDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEffectiveDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EffectiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEffectiveDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EffectiveDateFilter filter value from a formatted string
   *
   * @param _value the EffectiveDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EffectiveDateFilter filter field
   */
  public void setEffectiveDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEffectiveDateFilterFromFormattedString");
    try {
      this.setEffectiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EffectiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEffectiveDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEffectiveDateFilterFromFormattedString");
  }

  /**
   * Retrieves the EffectiveDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EffectiveDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the EffectiveDateFilter field
   */
  public String[] getEffectiveDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEffectiveDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEffectiveDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEffectiveDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EffectiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEffectiveDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the EffectiveDateFilter filter value from a formatted string
   *
   * @param _value the EffectiveDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EffectiveDateFilter filter field
   */
  public void setEffectiveDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEffectiveDateFilterFromFormattedDateTimeString");
    try {
      this.setEffectiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EffectiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEffectiveDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEffectiveDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: InactiveDate (ADJ.end_date)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDateFetch (boolean fetch) {
    this.InactiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDate (ADJ.end_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDateFetch () {
    return this.InactiveDateFetch;
  }
  /** Set the SortOrder for field: InactiveDate (ADJ.end_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDateSortOrder (Integer value) {
    this.InactiveDateSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDate (ADJ.end_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDateSortOrder () {
    return this.InactiveDateSort;
  }
  /** Set the sort direction for field: InactiveDate (ADJ.end_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDateSortDirection (boolean ascending) {
    this.InactiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDate (ADJ.end_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDateSortDirection () {
    return this.InactiveDateSortAscending;
  }
  /** Set the field level filters for field: InactiveDate (ADJ.end_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDateFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDate = value;
  }
  /** Retrieve filter for field: InactiveDate (ADJ.end_date)
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


  /** Set the field level Fetch value for field: TrackingIdCounter (ADJ.tracking_id_counter)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdCounterFetch (boolean fetch) {
    this.TrackingIdCounterFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdCounter (ADJ.tracking_id_counter)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdCounterFetch () {
    return this.TrackingIdCounterFetch;
  }
  /** Set the SortOrder for field: TrackingIdCounter (ADJ.tracking_id_counter)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdCounterSortOrder (Integer value) {
    this.TrackingIdCounterSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdCounter (ADJ.tracking_id_counter)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdCounterSortOrder () {
    return this.TrackingIdCounterSort;
  }
  /** Set the sort direction for field: TrackingIdCounter (ADJ.tracking_id_counter)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdCounterSortDirection (boolean ascending) {
    this.TrackingIdCounterSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdCounter (ADJ.tracking_id_counter)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdCounterSortDirection () {
    return this.TrackingIdCounterSortAscending;
  }
  /** Set the field level filters for field: TrackingIdCounter (ADJ.tracking_id_counter)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdCounterFilter (IntegerFilter[] value) throws ServiceException {
    this.TrackingIdCounter = value;
  }
  /** Retrieve filter for field: TrackingIdCounter (ADJ.tracking_id_counter)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdCounterFilter () {
    return this.TrackingIdCounter;
  }

  /**
   * Retrieves the TrackingIdCounterFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TrackingIdCounterFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingIdCounterFilter field
   */
  public String[] getTrackingIdCounterFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdCounterFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTrackingIdCounterFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdCounterFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingIdCounterFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdCounterFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TrackingIdCounterFilter filter value from a formatted string
   *
   * @param _value the TrackingIdCounterFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TrackingIdCounterFilter filter field
   */
  public void setTrackingIdCounterFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTrackingIdCounterFilterFromFormattedString");
    try {
      this.setTrackingIdCounterFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingIdCounterFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdCounterFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdCounterFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RequestStatus (ADJ.request_status)
   * @param fetch whether to fetch this field or not
   */
  public void setRequestStatusFetch (boolean fetch) {
    this.RequestStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: RequestStatus (ADJ.request_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getRequestStatusFetch () {
    return this.RequestStatusFetch;
  }
  /** Set the SortOrder for field: RequestStatus (ADJ.request_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRequestStatusSortOrder (Integer value) {
    this.RequestStatusSort = value;
  }
  /** Retrieve SortOrder for field: RequestStatus (ADJ.request_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRequestStatusSortOrder () {
    return this.RequestStatusSort;
  }
  /** Set the sort direction for field: RequestStatus (ADJ.request_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRequestStatusSortDirection (boolean ascending) {
    this.RequestStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RequestStatus (ADJ.request_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRequestStatusSortDirection () {
    return this.RequestStatusSortAscending;
  }
  /** Set the field level filters for field: RequestStatus (ADJ.request_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRequestStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.RequestStatus = value;
  }
  /** Retrieve filter for field: RequestStatus (ADJ.request_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRequestStatusFilter () {
    return this.RequestStatus;
  }

  /**
   * Retrieves the RequestStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RequestStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RequestStatusFilter field
   */
  public String[] getRequestStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRequestStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRequestStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRequestStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RequestStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRequestStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RequestStatusFilter filter value from a formatted string
   *
   * @param _value the RequestStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RequestStatusFilter filter field
   */
  public void setRequestStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRequestStatusFilterFromFormattedString");
    try {
      this.setRequestStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RequestStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRequestStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRequestStatusFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated RequestStatusFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the RequestStatusFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RequestStatusFilter filter field
   */
  public String[] getRequestStatusFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRequestStatusFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getRequestStatusFilter(), "RequestStatus", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRequestStatusFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RequestStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRequestStatusFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated RequestStatusFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the RequestStatusFilter filter field
   */
  public void setRequestStatusFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRequestStatusFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setRequestStatusFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "RequestStatus", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RequestStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRequestStatusFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRequestStatusFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: ReviewDate (ADJ.review_date)
   * @param fetch whether to fetch this field or not
   */
  public void setReviewDateFetch (boolean fetch) {
    this.ReviewDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ReviewDate (ADJ.review_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getReviewDateFetch () {
    return this.ReviewDateFetch;
  }
  /** Set the SortOrder for field: ReviewDate (ADJ.review_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setReviewDateSortOrder (Integer value) {
    this.ReviewDateSort = value;
  }
  /** Retrieve SortOrder for field: ReviewDate (ADJ.review_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getReviewDateSortOrder () {
    return this.ReviewDateSort;
  }
  /** Set the sort direction for field: ReviewDate (ADJ.review_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setReviewDateSortDirection (boolean ascending) {
    this.ReviewDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ReviewDate (ADJ.review_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getReviewDateSortDirection () {
    return this.ReviewDateSortAscending;
  }
  /** Set the field level filters for field: ReviewDate (ADJ.review_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setReviewDateFilter (DateFilter[] value) throws ServiceException {
    this.ReviewDate = value;
  }
  /** Retrieve filter for field: ReviewDate (ADJ.review_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getReviewDateFilter () {
    return this.ReviewDate;
  }

  /**
   * Retrieves the ReviewDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ReviewDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ReviewDateFilter field
   */
  public String[] getReviewDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReviewDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getReviewDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getReviewDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReviewDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getReviewDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ReviewDateFilter filter value from a formatted string
   *
   * @param _value the ReviewDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ReviewDateFilter filter field
   */
  public void setReviewDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setReviewDateFilterFromFormattedString");
    try {
      this.setReviewDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReviewDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setReviewDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setReviewDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ReviewDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ReviewDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ReviewDateFilter field
   */
  public String[] getReviewDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReviewDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getReviewDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getReviewDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReviewDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getReviewDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ReviewDateFilter filter value from a formatted string
   *
   * @param _value the ReviewDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ReviewDateFilter filter field
   */
  public void setReviewDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setReviewDateFilterFromFormattedDateTimeString");
    try {
      this.setReviewDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReviewDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setReviewDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setReviewDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: SupervisorName (ADJ.supervisor_name)
   * @param fetch whether to fetch this field or not
   */
  public void setSupervisorNameFetch (boolean fetch) {
    this.SupervisorNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: SupervisorName (ADJ.supervisor_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getSupervisorNameFetch () {
    return this.SupervisorNameFetch;
  }
  /** Set the SortOrder for field: SupervisorName (ADJ.supervisor_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSupervisorNameSortOrder (Integer value) {
    this.SupervisorNameSort = value;
  }
  /** Retrieve SortOrder for field: SupervisorName (ADJ.supervisor_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSupervisorNameSortOrder () {
    return this.SupervisorNameSort;
  }
  /** Set the sort direction for field: SupervisorName (ADJ.supervisor_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSupervisorNameSortDirection (boolean ascending) {
    this.SupervisorNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SupervisorName (ADJ.supervisor_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSupervisorNameSortDirection () {
    return this.SupervisorNameSortAscending;
  }
  /** Set the case insensitive for field: SupervisorName (ADJ.supervisor_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setSupervisorNameCaseInsensitive (boolean ascending) {
    this.SupervisorNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: SupervisorName (ADJ.supervisor_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getSupervisorNameCaseInsensitive () {
    return this.SupervisorNameCaseInsensitive;
  }
  /** Set the field level filters for field: SupervisorName (ADJ.supervisor_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSupervisorNameFilter (StringFilter[] value) throws ServiceException {
    this.SupervisorName = value;
  }
  /** Retrieve filter for field: SupervisorName (ADJ.supervisor_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getSupervisorNameFilter () {
    return this.SupervisorName;
  }

  /**
   * Retrieves the SupervisorNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SupervisorNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SupervisorNameFilter field
   */
  public String[] getSupervisorNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSupervisorNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSupervisorNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSupervisorNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SupervisorNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSupervisorNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SupervisorNameFilter filter value from a formatted string
   *
   * @param _value the SupervisorNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SupervisorNameFilter filter field
   */
  public void setSupervisorNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSupervisorNameFilterFromFormattedString");
    try {
      this.setSupervisorNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SupervisorNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSupervisorNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSupervisorNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CurrentFlag (ADJ.current_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrentFlagFetch (boolean fetch) {
    this.CurrentFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrentFlag (ADJ.current_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrentFlagFetch () {
    return this.CurrentFlagFetch;
  }
  /** Set the SortOrder for field: CurrentFlag (ADJ.current_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrentFlagSortOrder (Integer value) {
    this.CurrentFlagSort = value;
  }
  /** Retrieve SortOrder for field: CurrentFlag (ADJ.current_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrentFlagSortOrder () {
    return this.CurrentFlagSort;
  }
  /** Set the sort direction for field: CurrentFlag (ADJ.current_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrentFlagSortDirection (boolean ascending) {
    this.CurrentFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrentFlag (ADJ.current_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrentFlagSortDirection () {
    return this.CurrentFlagSortAscending;
  }
  /** Set the field level filters for field: CurrentFlag (ADJ.current_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrentFlagFilter (BooleanFilter[] value) throws ServiceException {
    this.CurrentFlag = value;
  }
  /** Retrieve filter for field: CurrentFlag (ADJ.current_flag)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getCurrentFlagFilter () {
    return this.CurrentFlag;
  }

  /**
   * Retrieves the CurrentFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CurrentFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrentFlagFilter field
   */
  public String[] getCurrentFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrentFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCurrentFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrentFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrentFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrentFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CurrentFlagFilter filter value from a formatted string
   *
   * @param _value the CurrentFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CurrentFlagFilter filter field
   */
  public void setCurrentFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrentFlagFilterFromFormattedString");
    try {
      this.setCurrentFlagFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrentFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrentFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrentFlagFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PendingFlag (ADJ.pending_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setPendingFlagFetch (boolean fetch) {
    this.PendingFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: PendingFlag (ADJ.pending_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getPendingFlagFetch () {
    return this.PendingFlagFetch;
  }
  /** Set the SortOrder for field: PendingFlag (ADJ.pending_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPendingFlagSortOrder (Integer value) {
    this.PendingFlagSort = value;
  }
  /** Retrieve SortOrder for field: PendingFlag (ADJ.pending_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPendingFlagSortOrder () {
    return this.PendingFlagSort;
  }
  /** Set the sort direction for field: PendingFlag (ADJ.pending_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPendingFlagSortDirection (boolean ascending) {
    this.PendingFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PendingFlag (ADJ.pending_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPendingFlagSortDirection () {
    return this.PendingFlagSortAscending;
  }
  /** Set the field level filters for field: PendingFlag (ADJ.pending_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPendingFlagFilter (BooleanFilter[] value) throws ServiceException {
    this.PendingFlag = value;
  }
  /** Retrieve filter for field: PendingFlag (ADJ.pending_flag)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getPendingFlagFilter () {
    return this.PendingFlag;
  }

  /**
   * Retrieves the PendingFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PendingFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PendingFlagFilter field
   */
  public String[] getPendingFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPendingFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPendingFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPendingFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PendingFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPendingFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PendingFlagFilter filter value from a formatted string
   *
   * @param _value the PendingFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PendingFlagFilter filter field
   */
  public void setPendingFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPendingFlagFilterFromFormattedString");
    try {
      this.setPendingFlagFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PendingFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPendingFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPendingFlagFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NoBill (ADJ.no_bill)
   * @param fetch whether to fetch this field or not
   */
  public void setNoBillFetch (boolean fetch) {
    this.NoBillFetch = fetch;
  }
  /** Retrieve Fetch value for field: NoBill (ADJ.no_bill)
   * @return boolean the Fetch value for this field
   */
  public boolean getNoBillFetch () {
    return this.NoBillFetch;
  }
  /** Set the SortOrder for field: NoBill (ADJ.no_bill)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNoBillSortOrder (Integer value) {
    this.NoBillSort = value;
  }
  /** Retrieve SortOrder for field: NoBill (ADJ.no_bill)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNoBillSortOrder () {
    return this.NoBillSort;
  }
  /** Set the sort direction for field: NoBill (ADJ.no_bill)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNoBillSortDirection (boolean ascending) {
    this.NoBillSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NoBill (ADJ.no_bill)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNoBillSortDirection () {
    return this.NoBillSortAscending;
  }
  /** Set the field level filters for field: NoBill (ADJ.no_bill)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNoBillFilter (BooleanFilter[] value) throws ServiceException {
    this.NoBill = value;
  }
  /** Retrieve filter for field: NoBill (ADJ.no_bill)
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

  /** Set the field level Fetch value for field: CurrencyCode (ADJ.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (ADJ.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (ADJ.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (ADJ.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (ADJ.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (ADJ.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (ADJ.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (ADJ.currency_code)
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


  /** Set the field level Fetch value for field: TotalAmt (ADJ.total_amt)
   * @param fetch whether to fetch this field or not
   */
  public void setTotalAmtFetch (boolean fetch) {
    this.TotalAmtFetch = fetch;
  }
  /** Retrieve Fetch value for field: TotalAmt (ADJ.total_amt)
   * @return boolean the Fetch value for this field
   */
  public boolean getTotalAmtFetch () {
    return this.TotalAmtFetch;
  }
  /** Set the SortOrder for field: TotalAmt (ADJ.total_amt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTotalAmtSortOrder (Integer value) {
    this.TotalAmtSort = value;
  }
  /** Retrieve SortOrder for field: TotalAmt (ADJ.total_amt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTotalAmtSortOrder () {
    return this.TotalAmtSort;
  }
  /** Set the sort direction for field: TotalAmt (ADJ.total_amt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTotalAmtSortDirection (boolean ascending) {
    this.TotalAmtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TotalAmt (ADJ.total_amt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTotalAmtSortDirection () {
    return this.TotalAmtSortAscending;
  }
  /** Set the field level filters for field: TotalAmt (ADJ.total_amt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTotalAmtFilter (BigIntegerFilter[] value) throws ServiceException {
    this.TotalAmt = value;
  }
  /** Retrieve filter for field: TotalAmt (ADJ.total_amt)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTotalAmtFilter () {
    return this.TotalAmt;
  }

  /**
   * Retrieves the TotalAmtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalAmtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalAmtFilter field
   */
  public String[] getTotalAmtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAmtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalAmtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalAmtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalAmtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TotalAmtFilter filter value from a formatted string
   *
   * @param _value the TotalAmtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalAmtFilter filter field
   */
  public void setTotalAmtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalAmtFilterFromFormattedString");
    try {
      this.setTotalAmtFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalAmtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalAmtFilterFromFormattedString");
  }

  /**
   * Sets the TotalAmtFilter filter value from a formatted string
   *
   * @param _value the TotalAmtFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalAmtFilter filter field
   */
  public void setTotalAmtFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalAmtFilterFromFormattedCurrencyString");
    try {
      this.setTotalAmtFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalAmtFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalAmtFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the TotalAmtFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalAmtFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalAmtFilter field
   */

  public String[] getTotalAmtFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAmtFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalAmtFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalAmtFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalAmtFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: RatedFlag (ADJ.rated_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setRatedFlagFetch (boolean fetch) {
    this.RatedFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: RatedFlag (ADJ.rated_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getRatedFlagFetch () {
    return this.RatedFlagFetch;
  }
  /** Set the SortOrder for field: RatedFlag (ADJ.rated_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRatedFlagSortOrder (Integer value) {
    this.RatedFlagSort = value;
  }
  /** Retrieve SortOrder for field: RatedFlag (ADJ.rated_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRatedFlagSortOrder () {
    return this.RatedFlagSort;
  }
  /** Set the sort direction for field: RatedFlag (ADJ.rated_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRatedFlagSortDirection (boolean ascending) {
    this.RatedFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RatedFlag (ADJ.rated_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRatedFlagSortDirection () {
    return this.RatedFlagSortAscending;
  }
  /** Set the field level filters for field: RatedFlag (ADJ.rated_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRatedFlagFilter (BooleanFilter[] value) throws ServiceException {
    this.RatedFlag = value;
  }
  /** Retrieve filter for field: RatedFlag (ADJ.rated_flag)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getRatedFlagFilter () {
    return this.RatedFlag;
  }

  /**
   * Retrieves the RatedFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RatedFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatedFlagFilter field
   */
  public String[] getRatedFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatedFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRatedFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatedFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatedFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatedFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RatedFlagFilter filter value from a formatted string
   *
   * @param _value the RatedFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RatedFlagFilter filter field
   */
  public void setRatedFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRatedFlagFilterFromFormattedString");
    try {
      this.setRatedFlagFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatedFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatedFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatedFlagFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ArchFlag (ADJ.arch_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setArchFlagFetch (boolean fetch) {
    this.ArchFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: ArchFlag (ADJ.arch_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getArchFlagFetch () {
    return this.ArchFlagFetch;
  }
  /** Set the SortOrder for field: ArchFlag (ADJ.arch_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setArchFlagSortOrder (Integer value) {
    this.ArchFlagSort = value;
  }
  /** Retrieve SortOrder for field: ArchFlag (ADJ.arch_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getArchFlagSortOrder () {
    return this.ArchFlagSort;
  }
  /** Set the sort direction for field: ArchFlag (ADJ.arch_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setArchFlagSortDirection (boolean ascending) {
    this.ArchFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ArchFlag (ADJ.arch_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getArchFlagSortDirection () {
    return this.ArchFlagSortAscending;
  }
  /** Set the field level filters for field: ArchFlag (ADJ.arch_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setArchFlagFilter (BooleanFilter[] value) throws ServiceException {
    this.ArchFlag = value;
  }
  /** Retrieve filter for field: ArchFlag (ADJ.arch_flag)
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

  /** Set the field level Fetch value for field: OrigProviderId (ADJ.orig_provider_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigProviderIdFetch (boolean fetch) {
    this.OrigProviderIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigProviderId (ADJ.orig_provider_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigProviderIdFetch () {
    return this.OrigProviderIdFetch;
  }
  /** Set the SortOrder for field: OrigProviderId (ADJ.orig_provider_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigProviderIdSortOrder (Integer value) {
    this.OrigProviderIdSort = value;
  }
  /** Retrieve SortOrder for field: OrigProviderId (ADJ.orig_provider_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigProviderIdSortOrder () {
    return this.OrigProviderIdSort;
  }
  /** Set the sort direction for field: OrigProviderId (ADJ.orig_provider_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigProviderIdSortDirection (boolean ascending) {
    this.OrigProviderIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigProviderId (ADJ.orig_provider_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigProviderIdSortDirection () {
    return this.OrigProviderIdSortAscending;
  }
  /** Set the field level filters for field: OrigProviderId (ADJ.orig_provider_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigProviderIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigProviderId = value;
  }
  /** Retrieve filter for field: OrigProviderId (ADJ.orig_provider_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigProviderIdFilter () {
    return this.OrigProviderId;
  }

  /**
   * Retrieves the OrigProviderIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigProviderIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigProviderIdFilter field
   */
  public String[] getOrigProviderIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigProviderIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigProviderIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigProviderIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigProviderIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigProviderIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigProviderIdFilter filter value from a formatted string
   *
   * @param _value the OrigProviderIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigProviderIdFilter filter field
   */
  public void setOrigProviderIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigProviderIdFilterFromFormattedString");
    try {
      this.setOrigProviderIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigProviderIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigProviderIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigProviderIdFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated OrigProviderIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the OrigProviderIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OrigProviderIdFilter filter field
   */
  public String[] getOrigProviderIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigProviderIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getOrigProviderIdFilter(), "ProviderType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigProviderIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigProviderIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigProviderIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated OrigProviderIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigProviderIdFilter filter field
   */
  public void setOrigProviderIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigProviderIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setOrigProviderIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "OrigProviderId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigProviderIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigProviderIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigProviderIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: OrigBillRefNo (ADJ.orig_bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigBillRefNoFetch (boolean fetch) {
    this.OrigBillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigBillRefNo (ADJ.orig_bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigBillRefNoFetch () {
    return this.OrigBillRefNoFetch;
  }
  /** Set the SortOrder for field: OrigBillRefNo (ADJ.orig_bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigBillRefNoSortOrder (Integer value) {
    this.OrigBillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: OrigBillRefNo (ADJ.orig_bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigBillRefNoSortOrder () {
    return this.OrigBillRefNoSort;
  }
  /** Set the sort direction for field: OrigBillRefNo (ADJ.orig_bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigBillRefNoSortDirection (boolean ascending) {
    this.OrigBillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigBillRefNo (ADJ.orig_bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigBillRefNoSortDirection () {
    return this.OrigBillRefNoSortAscending;
  }
  /** Set the field level filters for field: OrigBillRefNo (ADJ.orig_bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigBillRefNoFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigBillRefNo = value;
  }
  /** Retrieve filter for field: OrigBillRefNo (ADJ.orig_bill_ref_no)
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

  /** Set the field level Fetch value for field: OrigBillRefResets (ADJ.orig_bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigBillRefResetsFetch (boolean fetch) {
    this.OrigBillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigBillRefResets (ADJ.orig_bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigBillRefResetsFetch () {
    return this.OrigBillRefResetsFetch;
  }
  /** Set the SortOrder for field: OrigBillRefResets (ADJ.orig_bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigBillRefResetsSortOrder (Integer value) {
    this.OrigBillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: OrigBillRefResets (ADJ.orig_bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigBillRefResetsSortOrder () {
    return this.OrigBillRefResetsSort;
  }
  /** Set the sort direction for field: OrigBillRefResets (ADJ.orig_bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigBillRefResetsSortDirection (boolean ascending) {
    this.OrigBillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigBillRefResets (ADJ.orig_bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigBillRefResetsSortDirection () {
    return this.OrigBillRefResetsSortAscending;
  }
  /** Set the field level filters for field: OrigBillRefResets (ADJ.orig_bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigBillRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigBillRefResets = value;
  }
  /** Retrieve filter for field: OrigBillRefResets (ADJ.orig_bill_ref_resets)
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

  /** Set the field level Fetch value for field: OrigBillInvoiceRow (ADJ.orig_bill_invoice_row)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigBillInvoiceRowFetch (boolean fetch) {
    this.OrigBillInvoiceRowFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigBillInvoiceRow (ADJ.orig_bill_invoice_row)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigBillInvoiceRowFetch () {
    return this.OrigBillInvoiceRowFetch;
  }
  /** Set the SortOrder for field: OrigBillInvoiceRow (ADJ.orig_bill_invoice_row)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigBillInvoiceRowSortOrder (Integer value) {
    this.OrigBillInvoiceRowSort = value;
  }
  /** Retrieve SortOrder for field: OrigBillInvoiceRow (ADJ.orig_bill_invoice_row)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigBillInvoiceRowSortOrder () {
    return this.OrigBillInvoiceRowSort;
  }
  /** Set the sort direction for field: OrigBillInvoiceRow (ADJ.orig_bill_invoice_row)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigBillInvoiceRowSortDirection (boolean ascending) {
    this.OrigBillInvoiceRowSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigBillInvoiceRow (ADJ.orig_bill_invoice_row)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigBillInvoiceRowSortDirection () {
    return this.OrigBillInvoiceRowSortAscending;
  }
  /** Set the field level filters for field: OrigBillInvoiceRow (ADJ.orig_bill_invoice_row)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigBillInvoiceRowFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigBillInvoiceRow = value;
  }
  /** Retrieve filter for field: OrigBillInvoiceRow (ADJ.orig_bill_invoice_row)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigBillInvoiceRowFilter () {
    return this.OrigBillInvoiceRow;
  }

  /**
   * Retrieves the OrigBillInvoiceRowFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigBillInvoiceRowFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBillInvoiceRowFilter field
   */
  public String[] getOrigBillInvoiceRowFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillInvoiceRowFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigBillInvoiceRowFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBillInvoiceRowFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigBillInvoiceRowFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBillInvoiceRowFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigBillInvoiceRowFilter filter value from a formatted string
   *
   * @param _value the OrigBillInvoiceRowFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigBillInvoiceRowFilter filter field
   */
  public void setOrigBillInvoiceRowFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigBillInvoiceRowFilterFromFormattedString");
    try {
      this.setOrigBillInvoiceRowFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigBillInvoiceRowFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBillInvoiceRowFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBillInvoiceRowFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OrigType (ADJ.orig_type)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigTypeFetch (boolean fetch) {
    this.OrigTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigType (ADJ.orig_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigTypeFetch () {
    return this.OrigTypeFetch;
  }
  /** Set the SortOrder for field: OrigType (ADJ.orig_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigTypeSortOrder (Integer value) {
    this.OrigTypeSort = value;
  }
  /** Retrieve SortOrder for field: OrigType (ADJ.orig_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigTypeSortOrder () {
    return this.OrigTypeSort;
  }
  /** Set the sort direction for field: OrigType (ADJ.orig_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigTypeSortDirection (boolean ascending) {
    this.OrigTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigType (ADJ.orig_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigTypeSortDirection () {
    return this.OrigTypeSortAscending;
  }
  /** Set the field level filters for field: OrigType (ADJ.orig_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigType = value;
  }
  /** Retrieve filter for field: OrigType (ADJ.orig_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigTypeFilter () {
    return this.OrigType;
  }

  /**
   * Retrieves the OrigTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigTypeFilter field
   */
  public String[] getOrigTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigTypeFilter filter value from a formatted string
   *
   * @param _value the OrigTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigTypeFilter filter field
   */
  public void setOrigTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigTypeFilterFromFormattedString");
    try {
      this.setOrigTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OrigSubtype (ADJ.orig_subtype)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigSubtypeFetch (boolean fetch) {
    this.OrigSubtypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigSubtype (ADJ.orig_subtype)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigSubtypeFetch () {
    return this.OrigSubtypeFetch;
  }
  /** Set the SortOrder for field: OrigSubtype (ADJ.orig_subtype)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigSubtypeSortOrder (Integer value) {
    this.OrigSubtypeSort = value;
  }
  /** Retrieve SortOrder for field: OrigSubtype (ADJ.orig_subtype)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigSubtypeSortOrder () {
    return this.OrigSubtypeSort;
  }
  /** Set the sort direction for field: OrigSubtype (ADJ.orig_subtype)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigSubtypeSortDirection (boolean ascending) {
    this.OrigSubtypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigSubtype (ADJ.orig_subtype)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigSubtypeSortDirection () {
    return this.OrigSubtypeSortAscending;
  }
  /** Set the field level filters for field: OrigSubtype (ADJ.orig_subtype)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigSubtypeFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigSubtype = value;
  }
  /** Retrieve filter for field: OrigSubtype (ADJ.orig_subtype)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigSubtypeFilter () {
    return this.OrigSubtype;
  }

  /**
   * Retrieves the OrigSubtypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigSubtypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigSubtypeFilter field
   */
  public String[] getOrigSubtypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigSubtypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigSubtypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigSubtypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigSubtypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigSubtypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigSubtypeFilter filter value from a formatted string
   *
   * @param _value the OrigSubtypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigSubtypeFilter filter field
   */
  public void setOrigSubtypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigSubtypeFilterFromFormattedString");
    try {
      this.setOrigSubtypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigSubtypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigSubtypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigSubtypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OrigMsgId (ADJ.orig_msg_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigMsgIdFetch (boolean fetch) {
    this.OrigMsgIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigMsgId (ADJ.orig_msg_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigMsgIdFetch () {
    return this.OrigMsgIdFetch;
  }
  /** Set the SortOrder for field: OrigMsgId (ADJ.orig_msg_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigMsgIdSortOrder (Integer value) {
    this.OrigMsgIdSort = value;
  }
  /** Retrieve SortOrder for field: OrigMsgId (ADJ.orig_msg_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigMsgIdSortOrder () {
    return this.OrigMsgIdSort;
  }
  /** Set the sort direction for field: OrigMsgId (ADJ.orig_msg_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigMsgIdSortDirection (boolean ascending) {
    this.OrigMsgIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigMsgId (ADJ.orig_msg_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigMsgIdSortDirection () {
    return this.OrigMsgIdSortAscending;
  }
  /** Set the field level filters for field: OrigMsgId (ADJ.orig_msg_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigMsgIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigMsgId = value;
  }
  /** Retrieve filter for field: OrigMsgId (ADJ.orig_msg_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigMsgIdFilter () {
    return this.OrigMsgId;
  }

  /**
   * Retrieves the OrigMsgIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigMsgIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigMsgIdFilter field
   */
  public String[] getOrigMsgIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigMsgIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigMsgIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigMsgIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigMsgIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigMsgIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigMsgIdFilter filter value from a formatted string
   *
   * @param _value the OrigMsgIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigMsgIdFilter filter field
   */
  public void setOrigMsgIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigMsgIdFilterFromFormattedString");
    try {
      this.setOrigMsgIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigMsgIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigMsgIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigMsgIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OrigMsgId2 (ADJ.orig_msg_id2)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigMsgId2Fetch (boolean fetch) {
    this.OrigMsgId2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigMsgId2 (ADJ.orig_msg_id2)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigMsgId2Fetch () {
    return this.OrigMsgId2Fetch;
  }
  /** Set the SortOrder for field: OrigMsgId2 (ADJ.orig_msg_id2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigMsgId2SortOrder (Integer value) {
    this.OrigMsgId2Sort = value;
  }
  /** Retrieve SortOrder for field: OrigMsgId2 (ADJ.orig_msg_id2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigMsgId2SortOrder () {
    return this.OrigMsgId2Sort;
  }
  /** Set the sort direction for field: OrigMsgId2 (ADJ.orig_msg_id2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigMsgId2SortDirection (boolean ascending) {
    this.OrigMsgId2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigMsgId2 (ADJ.orig_msg_id2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigMsgId2SortDirection () {
    return this.OrigMsgId2SortAscending;
  }
  /** Set the field level filters for field: OrigMsgId2 (ADJ.orig_msg_id2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigMsgId2Filter (IntegerFilter[] value) throws ServiceException {
    this.OrigMsgId2 = value;
  }
  /** Retrieve filter for field: OrigMsgId2 (ADJ.orig_msg_id2)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigMsgId2Filter () {
    return this.OrigMsgId2;
  }

  /**
   * Retrieves the OrigMsgId2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigMsgId2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigMsgId2Filter field
   */
  public String[] getOrigMsgId2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigMsgId2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigMsgId2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigMsgId2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigMsgId2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigMsgId2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigMsgId2Filter filter value from a formatted string
   *
   * @param _value the OrigMsgId2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigMsgId2Filter filter field
   */
  public void setOrigMsgId2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigMsgId2FilterFromFormattedString");
    try {
      this.setOrigMsgId2Filter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigMsgId2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigMsgId2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigMsgId2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OrigMsgIdServ (ADJ.orig_msg_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigMsgIdServFetch (boolean fetch) {
    this.OrigMsgIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigMsgIdServ (ADJ.orig_msg_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigMsgIdServFetch () {
    return this.OrigMsgIdServFetch;
  }
  /** Set the SortOrder for field: OrigMsgIdServ (ADJ.orig_msg_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigMsgIdServSortOrder (Integer value) {
    this.OrigMsgIdServSort = value;
  }
  /** Retrieve SortOrder for field: OrigMsgIdServ (ADJ.orig_msg_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigMsgIdServSortOrder () {
    return this.OrigMsgIdServSort;
  }
  /** Set the sort direction for field: OrigMsgIdServ (ADJ.orig_msg_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigMsgIdServSortDirection (boolean ascending) {
    this.OrigMsgIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigMsgIdServ (ADJ.orig_msg_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigMsgIdServSortDirection () {
    return this.OrigMsgIdServSortAscending;
  }
  /** Set the field level filters for field: OrigMsgIdServ (ADJ.orig_msg_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigMsgIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigMsgIdServ = value;
  }
  /** Retrieve filter for field: OrigMsgIdServ (ADJ.orig_msg_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigMsgIdServFilter () {
    return this.OrigMsgIdServ;
  }

  /**
   * Retrieves the OrigMsgIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigMsgIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigMsgIdServFilter field
   */
  public String[] getOrigMsgIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigMsgIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigMsgIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigMsgIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigMsgIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigMsgIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigMsgIdServFilter filter value from a formatted string
   *
   * @param _value the OrigMsgIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigMsgIdServFilter filter field
   */
  public void setOrigMsgIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigMsgIdServFilterFromFormattedString");
    try {
      this.setOrigMsgIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigMsgIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigMsgIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigMsgIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OrigTrackingId (ADJ.orig_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigTrackingIdFetch (boolean fetch) {
    this.OrigTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigTrackingId (ADJ.orig_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigTrackingIdFetch () {
    return this.OrigTrackingIdFetch;
  }
  /** Set the SortOrder for field: OrigTrackingId (ADJ.orig_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigTrackingIdSortOrder (Integer value) {
    this.OrigTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: OrigTrackingId (ADJ.orig_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigTrackingIdSortOrder () {
    return this.OrigTrackingIdSort;
  }
  /** Set the sort direction for field: OrigTrackingId (ADJ.orig_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigTrackingIdSortDirection (boolean ascending) {
    this.OrigTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigTrackingId (ADJ.orig_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigTrackingIdSortDirection () {
    return this.OrigTrackingIdSortAscending;
  }
  /** Set the field level filters for field: OrigTrackingId (ADJ.orig_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigTrackingId = value;
  }
  /** Retrieve filter for field: OrigTrackingId (ADJ.orig_tracking_id)
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

  /** Set the field level Fetch value for field: OrigTrackingIdServ (ADJ.orig_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigTrackingIdServFetch (boolean fetch) {
    this.OrigTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigTrackingIdServ (ADJ.orig_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigTrackingIdServFetch () {
    return this.OrigTrackingIdServFetch;
  }
  /** Set the SortOrder for field: OrigTrackingIdServ (ADJ.orig_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigTrackingIdServSortOrder (Integer value) {
    this.OrigTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: OrigTrackingIdServ (ADJ.orig_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigTrackingIdServSortOrder () {
    return this.OrigTrackingIdServSort;
  }
  /** Set the sort direction for field: OrigTrackingIdServ (ADJ.orig_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigTrackingIdServSortDirection (boolean ascending) {
    this.OrigTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigTrackingIdServ (ADJ.orig_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigTrackingIdServSortDirection () {
    return this.OrigTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: OrigTrackingIdServ (ADJ.orig_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigTrackingIdServ = value;
  }
  /** Retrieve filter for field: OrigTrackingIdServ (ADJ.orig_tracking_id_serv)
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

  /** Set the field level Fetch value for field: OrigTrackingDt (ADJ.orig_tracking_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigTrackingDtFetch (boolean fetch) {
    this.OrigTrackingDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigTrackingDt (ADJ.orig_tracking_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigTrackingDtFetch () {
    return this.OrigTrackingDtFetch;
  }
  /** Set the SortOrder for field: OrigTrackingDt (ADJ.orig_tracking_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigTrackingDtSortOrder (Integer value) {
    this.OrigTrackingDtSort = value;
  }
  /** Retrieve SortOrder for field: OrigTrackingDt (ADJ.orig_tracking_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigTrackingDtSortOrder () {
    return this.OrigTrackingDtSort;
  }
  /** Set the sort direction for field: OrigTrackingDt (ADJ.orig_tracking_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigTrackingDtSortDirection (boolean ascending) {
    this.OrigTrackingDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigTrackingDt (ADJ.orig_tracking_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigTrackingDtSortDirection () {
    return this.OrigTrackingDtSortAscending;
  }
  /** Set the field level filters for field: OrigTrackingDt (ADJ.orig_tracking_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigTrackingDtFilter (DateFilter[] value) throws ServiceException {
    this.OrigTrackingDt = value;
  }
  /** Retrieve filter for field: OrigTrackingDt (ADJ.orig_tracking_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getOrigTrackingDtFilter () {
    return this.OrigTrackingDt;
  }

  /**
   * Retrieves the OrigTrackingDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigTrackingDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigTrackingDtFilter field
   */
  public String[] getOrigTrackingDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTrackingDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigTrackingDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTrackingDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTrackingDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTrackingDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigTrackingDtFilter filter value from a formatted string
   *
   * @param _value the OrigTrackingDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigTrackingDtFilter filter field
   */
  public void setOrigTrackingDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigTrackingDtFilterFromFormattedString");
    try {
      this.setOrigTrackingDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTrackingDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTrackingDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigTrackingDtFilterFromFormattedString");
  }

  /**
   * Retrieves the OrigTrackingDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigTrackingDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigTrackingDtFilter field
   */
  public String[] getOrigTrackingDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTrackingDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigTrackingDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTrackingDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTrackingDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTrackingDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the OrigTrackingDtFilter filter value from a formatted string
   *
   * @param _value the OrigTrackingDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigTrackingDtFilter filter field
   */
  public void setOrigTrackingDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigTrackingDtFilterFromFormattedDateTimeString");
    try {
      this.setOrigTrackingDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTrackingDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTrackingDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigTrackingDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: OrigRcFromDate (ADJ.orig_rc_from_date)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigRcFromDateFetch (boolean fetch) {
    this.OrigRcFromDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigRcFromDate (ADJ.orig_rc_from_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigRcFromDateFetch () {
    return this.OrigRcFromDateFetch;
  }
  /** Set the SortOrder for field: OrigRcFromDate (ADJ.orig_rc_from_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigRcFromDateSortOrder (Integer value) {
    this.OrigRcFromDateSort = value;
  }
  /** Retrieve SortOrder for field: OrigRcFromDate (ADJ.orig_rc_from_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigRcFromDateSortOrder () {
    return this.OrigRcFromDateSort;
  }
  /** Set the sort direction for field: OrigRcFromDate (ADJ.orig_rc_from_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigRcFromDateSortDirection (boolean ascending) {
    this.OrigRcFromDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigRcFromDate (ADJ.orig_rc_from_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigRcFromDateSortDirection () {
    return this.OrigRcFromDateSortAscending;
  }
  /** Set the field level filters for field: OrigRcFromDate (ADJ.orig_rc_from_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigRcFromDateFilter (DateFilter[] value) throws ServiceException {
    this.OrigRcFromDate = value;
  }
  /** Retrieve filter for field: OrigRcFromDate (ADJ.orig_rc_from_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getOrigRcFromDateFilter () {
    return this.OrigRcFromDate;
  }

  /**
   * Retrieves the OrigRcFromDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigRcFromDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigRcFromDateFilter field
   */
  public String[] getOrigRcFromDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigRcFromDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigRcFromDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigRcFromDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigRcFromDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigRcFromDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigRcFromDateFilter filter value from a formatted string
   *
   * @param _value the OrigRcFromDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigRcFromDateFilter filter field
   */
  public void setOrigRcFromDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigRcFromDateFilterFromFormattedString");
    try {
      this.setOrigRcFromDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigRcFromDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigRcFromDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigRcFromDateFilterFromFormattedString");
  }

  /**
   * Retrieves the OrigRcFromDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigRcFromDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigRcFromDateFilter field
   */
  public String[] getOrigRcFromDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigRcFromDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigRcFromDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigRcFromDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigRcFromDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigRcFromDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the OrigRcFromDateFilter filter value from a formatted string
   *
   * @param _value the OrigRcFromDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigRcFromDateFilter filter field
   */
  public void setOrigRcFromDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigRcFromDateFilterFromFormattedDateTimeString");
    try {
      this.setOrigRcFromDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigRcFromDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigRcFromDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigRcFromDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: BillRefNo (ADJ.bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefNoFetch (boolean fetch) {
    this.BillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefNo (ADJ.bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefNoFetch () {
    return this.BillRefNoFetch;
  }
  /** Set the SortOrder for field: BillRefNo (ADJ.bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefNoSortOrder (Integer value) {
    this.BillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: BillRefNo (ADJ.bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefNoSortOrder () {
    return this.BillRefNoSort;
  }
  /** Set the sort direction for field: BillRefNo (ADJ.bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefNoSortDirection (boolean ascending) {
    this.BillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefNo (ADJ.bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefNoSortDirection () {
    return this.BillRefNoSortAscending;
  }
  /** Set the field level filters for field: BillRefNo (ADJ.bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefNoFilter (IntegerFilter[] value) throws ServiceException {
    this.BillRefNo = value;
  }
  /** Retrieve filter for field: BillRefNo (ADJ.bill_ref_no)
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

  /** Set the field level Fetch value for field: BillRefResets (ADJ.bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefResetsFetch (boolean fetch) {
    this.BillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefResets (ADJ.bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefResetsFetch () {
    return this.BillRefResetsFetch;
  }
  /** Set the SortOrder for field: BillRefResets (ADJ.bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefResetsSortOrder (Integer value) {
    this.BillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: BillRefResets (ADJ.bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefResetsSortOrder () {
    return this.BillRefResetsSort;
  }
  /** Set the sort direction for field: BillRefResets (ADJ.bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefResetsSortDirection (boolean ascending) {
    this.BillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefResets (ADJ.bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefResetsSortDirection () {
    return this.BillRefResetsSortAscending;
  }
  /** Set the field level filters for field: BillRefResets (ADJ.bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.BillRefResets = value;
  }
  /** Retrieve filter for field: BillRefResets (ADJ.bill_ref_resets)
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

  /** Set the field level Fetch value for field: TaxClass (ADJ.tax_class)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxClassFetch (boolean fetch) {
    this.TaxClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxClass (ADJ.tax_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxClassFetch () {
    return this.TaxClassFetch;
  }
  /** Set the SortOrder for field: TaxClass (ADJ.tax_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxClassSortOrder (Integer value) {
    this.TaxClassSort = value;
  }
  /** Retrieve SortOrder for field: TaxClass (ADJ.tax_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxClassSortOrder () {
    return this.TaxClassSort;
  }
  /** Set the sort direction for field: TaxClass (ADJ.tax_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxClassSortDirection (boolean ascending) {
    this.TaxClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxClass (ADJ.tax_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxClassSortDirection () {
    return this.TaxClassSortAscending;
  }
  /** Set the field level filters for field: TaxClass (ADJ.tax_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxClassFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxClass = value;
  }
  /** Retrieve filter for field: TaxClass (ADJ.tax_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxClassFilter () {
    return this.TaxClass;
  }

  /**
   * Retrieves the TaxClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxClassFilter field
   */
  public String[] getTaxClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxClassFilter filter value from a formatted string
   *
   * @param _value the TaxClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxClassFilter filter field
   */
  public void setTaxClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxClassFilterFromFormattedString");
    try {
      this.setTaxClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxClassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TaxPkgInstId (ADJ.tax_pkg_inst_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxPkgInstIdFetch (boolean fetch) {
    this.TaxPkgInstIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxPkgInstId (ADJ.tax_pkg_inst_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxPkgInstIdFetch () {
    return this.TaxPkgInstIdFetch;
  }
  /** Set the SortOrder for field: TaxPkgInstId (ADJ.tax_pkg_inst_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxPkgInstIdSortOrder (Integer value) {
    this.TaxPkgInstIdSort = value;
  }
  /** Retrieve SortOrder for field: TaxPkgInstId (ADJ.tax_pkg_inst_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxPkgInstIdSortOrder () {
    return this.TaxPkgInstIdSort;
  }
  /** Set the sort direction for field: TaxPkgInstId (ADJ.tax_pkg_inst_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxPkgInstIdSortDirection (boolean ascending) {
    this.TaxPkgInstIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxPkgInstId (ADJ.tax_pkg_inst_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxPkgInstIdSortDirection () {
    return this.TaxPkgInstIdSortAscending;
  }
  /** Set the field level filters for field: TaxPkgInstId (ADJ.tax_pkg_inst_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxPkgInstIdFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxPkgInstId = value;
  }
  /** Retrieve filter for field: TaxPkgInstId (ADJ.tax_pkg_inst_id)
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


  /** Set the field level Fetch value for field: Geocode (ADJ.geocode)
   * @param fetch whether to fetch this field or not
   */
  public void setGeocodeFetch (boolean fetch) {
    this.GeocodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: Geocode (ADJ.geocode)
   * @return boolean the Fetch value for this field
   */
  public boolean getGeocodeFetch () {
    return this.GeocodeFetch;
  }
  /** Set the SortOrder for field: Geocode (ADJ.geocode)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGeocodeSortOrder (Integer value) {
    this.GeocodeSort = value;
  }
  /** Retrieve SortOrder for field: Geocode (ADJ.geocode)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGeocodeSortOrder () {
    return this.GeocodeSort;
  }
  /** Set the sort direction for field: Geocode (ADJ.geocode)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGeocodeSortDirection (boolean ascending) {
    this.GeocodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Geocode (ADJ.geocode)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGeocodeSortDirection () {
    return this.GeocodeSortAscending;
  }
  /** Set the case insensitive for field: Geocode (ADJ.geocode)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setGeocodeCaseInsensitive (boolean ascending) {
    this.GeocodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Geocode (ADJ.geocode)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getGeocodeCaseInsensitive () {
    return this.GeocodeCaseInsensitive;
  }
  /** Set the field level filters for field: Geocode (ADJ.geocode)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGeocodeFilter (StringFilter[] value) throws ServiceException {
    this.Geocode = value;
  }
  /** Retrieve filter for field: Geocode (ADJ.geocode)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getGeocodeFilter () {
    return this.Geocode;
  }

  /**
   * Retrieves the GeocodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GeocodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GeocodeFilter field
   */
  public String[] getGeocodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeocodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGeocodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGeocodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GeocodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGeocodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GeocodeFilter filter value from a formatted string
   *
   * @param _value the GeocodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GeocodeFilter filter field
   */
  public void setGeocodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGeocodeFilterFromFormattedString");
    try {
      this.setGeocodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GeocodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGeocodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGeocodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AuxTaxInfo (ADJ.aux_tax_info)
   * @param fetch whether to fetch this field or not
   */
  public void setAuxTaxInfoFetch (boolean fetch) {
    this.AuxTaxInfoFetch = fetch;
  }
  /** Retrieve Fetch value for field: AuxTaxInfo (ADJ.aux_tax_info)
   * @return boolean the Fetch value for this field
   */
  public boolean getAuxTaxInfoFetch () {
    return this.AuxTaxInfoFetch;
  }
  /** Set the SortOrder for field: AuxTaxInfo (ADJ.aux_tax_info)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAuxTaxInfoSortOrder (Integer value) {
    this.AuxTaxInfoSort = value;
  }
  /** Retrieve SortOrder for field: AuxTaxInfo (ADJ.aux_tax_info)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAuxTaxInfoSortOrder () {
    return this.AuxTaxInfoSort;
  }
  /** Set the sort direction for field: AuxTaxInfo (ADJ.aux_tax_info)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAuxTaxInfoSortDirection (boolean ascending) {
    this.AuxTaxInfoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AuxTaxInfo (ADJ.aux_tax_info)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAuxTaxInfoSortDirection () {
    return this.AuxTaxInfoSortAscending;
  }
  /** Set the case insensitive for field: AuxTaxInfo (ADJ.aux_tax_info)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAuxTaxInfoCaseInsensitive (boolean ascending) {
    this.AuxTaxInfoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AuxTaxInfo (ADJ.aux_tax_info)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAuxTaxInfoCaseInsensitive () {
    return this.AuxTaxInfoCaseInsensitive;
  }
  /** Set the field level filters for field: AuxTaxInfo (ADJ.aux_tax_info)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAuxTaxInfoFilter (StringFilter[] value) throws ServiceException {
    this.AuxTaxInfo = value;
  }
  /** Retrieve filter for field: AuxTaxInfo (ADJ.aux_tax_info)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAuxTaxInfoFilter () {
    return this.AuxTaxInfo;
  }

  /**
   * Retrieves the AuxTaxInfoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AuxTaxInfoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AuxTaxInfoFilter field
   */
  public String[] getAuxTaxInfoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAuxTaxInfoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAuxTaxInfoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAuxTaxInfoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AuxTaxInfoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAuxTaxInfoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AuxTaxInfoFilter filter value from a formatted string
   *
   * @param _value the AuxTaxInfoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AuxTaxInfoFilter filter field
   */
  public void setAuxTaxInfoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAuxTaxInfoFilterFromFormattedString");
    try {
      this.setAuxTaxInfoFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AuxTaxInfoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAuxTaxInfoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAuxTaxInfoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CombTaxRate (ADJ.comb_tax_rate)
   * @param fetch whether to fetch this field or not
   */
  public void setCombTaxRateFetch (boolean fetch) {
    this.CombTaxRateFetch = fetch;
  }
  /** Retrieve Fetch value for field: CombTaxRate (ADJ.comb_tax_rate)
   * @return boolean the Fetch value for this field
   */
  public boolean getCombTaxRateFetch () {
    return this.CombTaxRateFetch;
  }
  /** Set the SortOrder for field: CombTaxRate (ADJ.comb_tax_rate)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCombTaxRateSortOrder (Integer value) {
    this.CombTaxRateSort = value;
  }
  /** Retrieve SortOrder for field: CombTaxRate (ADJ.comb_tax_rate)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCombTaxRateSortOrder () {
    return this.CombTaxRateSort;
  }
  /** Set the sort direction for field: CombTaxRate (ADJ.comb_tax_rate)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCombTaxRateSortDirection (boolean ascending) {
    this.CombTaxRateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CombTaxRate (ADJ.comb_tax_rate)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCombTaxRateSortDirection () {
    return this.CombTaxRateSortAscending;
  }
  /** Set the field level filters for field: CombTaxRate (ADJ.comb_tax_rate)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCombTaxRateFilter (IntegerFilter[] value) throws ServiceException {
    this.CombTaxRate = value;
  }
  /** Retrieve filter for field: CombTaxRate (ADJ.comb_tax_rate)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCombTaxRateFilter () {
    return this.CombTaxRate;
  }

  /**
   * Retrieves the CombTaxRateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CombTaxRateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CombTaxRateFilter field
   */
  public String[] getCombTaxRateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCombTaxRateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCombTaxRateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCombTaxRateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CombTaxRateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCombTaxRateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CombTaxRateFilter filter value from a formatted string
   *
   * @param _value the CombTaxRateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CombTaxRateFilter filter field
   */
  public void setCombTaxRateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCombTaxRateFilterFromFormattedString");
    try {
      this.setCombTaxRateFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CombTaxRateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCombTaxRateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCombTaxRateFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FederalTax (ADJ.federal_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setFederalTaxFetch (boolean fetch) {
    this.FederalTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: FederalTax (ADJ.federal_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getFederalTaxFetch () {
    return this.FederalTaxFetch;
  }
  /** Set the SortOrder for field: FederalTax (ADJ.federal_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFederalTaxSortOrder (Integer value) {
    this.FederalTaxSort = value;
  }
  /** Retrieve SortOrder for field: FederalTax (ADJ.federal_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFederalTaxSortOrder () {
    return this.FederalTaxSort;
  }
  /** Set the sort direction for field: FederalTax (ADJ.federal_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFederalTaxSortDirection (boolean ascending) {
    this.FederalTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FederalTax (ADJ.federal_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFederalTaxSortDirection () {
    return this.FederalTaxSortAscending;
  }
  /** Set the field level filters for field: FederalTax (ADJ.federal_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFederalTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.FederalTax = value;
  }
  /** Retrieve filter for field: FederalTax (ADJ.federal_tax)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getFederalTaxFilter () {
    return this.FederalTax;
  }

  /**
   * Retrieves the FederalTaxFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FederalTaxFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FederalTaxFilter field
   */
  public String[] getFederalTaxFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFederalTaxFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFederalTaxFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFederalTaxFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FederalTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFederalTaxFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FederalTaxFilter filter value from a formatted string
   *
   * @param _value the FederalTaxFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FederalTaxFilter filter field
   */
  public void setFederalTaxFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFederalTaxFilterFromFormattedString");
    try {
      this.setFederalTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FederalTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFederalTaxFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFederalTaxFilterFromFormattedString");
  }

  /**
   * Sets the FederalTaxFilter filter value from a formatted string
   *
   * @param _value the FederalTaxFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FederalTaxFilter filter field
   */
  public void setFederalTaxFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFederalTaxFilterFromFormattedCurrencyString");
    try {
      this.setFederalTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FederalTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFederalTaxFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFederalTaxFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the FederalTaxFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FederalTaxFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the FederalTaxFilter field
   */

  public String[] getFederalTaxFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFederalTaxFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFederalTaxFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFederalTaxFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FederalTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFederalTaxFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: StateTax (ADJ.state_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setStateTaxFetch (boolean fetch) {
    this.StateTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: StateTax (ADJ.state_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getStateTaxFetch () {
    return this.StateTaxFetch;
  }
  /** Set the SortOrder for field: StateTax (ADJ.state_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStateTaxSortOrder (Integer value) {
    this.StateTaxSort = value;
  }
  /** Retrieve SortOrder for field: StateTax (ADJ.state_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStateTaxSortOrder () {
    return this.StateTaxSort;
  }
  /** Set the sort direction for field: StateTax (ADJ.state_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStateTaxSortDirection (boolean ascending) {
    this.StateTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StateTax (ADJ.state_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStateTaxSortDirection () {
    return this.StateTaxSortAscending;
  }
  /** Set the field level filters for field: StateTax (ADJ.state_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStateTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.StateTax = value;
  }
  /** Retrieve filter for field: StateTax (ADJ.state_tax)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getStateTaxFilter () {
    return this.StateTax;
  }

  /**
   * Retrieves the StateTaxFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StateTaxFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateTaxFilter field
   */
  public String[] getStateTaxFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateTaxFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStateTaxFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateTaxFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateTaxFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StateTaxFilter filter value from a formatted string
   *
   * @param _value the StateTaxFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StateTaxFilter filter field
   */
  public void setStateTaxFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStateTaxFilterFromFormattedString");
    try {
      this.setStateTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateTaxFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateTaxFilterFromFormattedString");
  }

  /**
   * Sets the StateTaxFilter filter value from a formatted string
   *
   * @param _value the StateTaxFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StateTaxFilter filter field
   */
  public void setStateTaxFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStateTaxFilterFromFormattedCurrencyString");
    try {
      this.setStateTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateTaxFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateTaxFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the StateTaxFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StateTaxFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateTaxFilter field
   */

  public String[] getStateTaxFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateTaxFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStateTaxFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateTaxFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateTaxFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: CountyTax (ADJ.county_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setCountyTaxFetch (boolean fetch) {
    this.CountyTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CountyTax (ADJ.county_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getCountyTaxFetch () {
    return this.CountyTaxFetch;
  }
  /** Set the SortOrder for field: CountyTax (ADJ.county_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCountyTaxSortOrder (Integer value) {
    this.CountyTaxSort = value;
  }
  /** Retrieve SortOrder for field: CountyTax (ADJ.county_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCountyTaxSortOrder () {
    return this.CountyTaxSort;
  }
  /** Set the sort direction for field: CountyTax (ADJ.county_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCountyTaxSortDirection (boolean ascending) {
    this.CountyTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CountyTax (ADJ.county_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCountyTaxSortDirection () {
    return this.CountyTaxSortAscending;
  }
  /** Set the field level filters for field: CountyTax (ADJ.county_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCountyTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.CountyTax = value;
  }
  /** Retrieve filter for field: CountyTax (ADJ.county_tax)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCountyTaxFilter () {
    return this.CountyTax;
  }

  /**
   * Retrieves the CountyTaxFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CountyTaxFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountyTaxFilter field
   */
  public String[] getCountyTaxFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyTaxFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCountyTaxFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountyTaxFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountyTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountyTaxFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CountyTaxFilter filter value from a formatted string
   *
   * @param _value the CountyTaxFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CountyTaxFilter filter field
   */
  public void setCountyTaxFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountyTaxFilterFromFormattedString");
    try {
      this.setCountyTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountyTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountyTaxFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountyTaxFilterFromFormattedString");
  }

  /**
   * Sets the CountyTaxFilter filter value from a formatted string
   *
   * @param _value the CountyTaxFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CountyTaxFilter filter field
   */
  public void setCountyTaxFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountyTaxFilterFromFormattedCurrencyString");
    try {
      this.setCountyTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountyTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountyTaxFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountyTaxFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the CountyTaxFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CountyTaxFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountyTaxFilter field
   */

  public String[] getCountyTaxFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyTaxFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCountyTaxFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountyTaxFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountyTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountyTaxFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: CityTax (ADJ.city_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setCityTaxFetch (boolean fetch) {
    this.CityTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CityTax (ADJ.city_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getCityTaxFetch () {
    return this.CityTaxFetch;
  }
  /** Set the SortOrder for field: CityTax (ADJ.city_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCityTaxSortOrder (Integer value) {
    this.CityTaxSort = value;
  }
  /** Retrieve SortOrder for field: CityTax (ADJ.city_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCityTaxSortOrder () {
    return this.CityTaxSort;
  }
  /** Set the sort direction for field: CityTax (ADJ.city_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCityTaxSortDirection (boolean ascending) {
    this.CityTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CityTax (ADJ.city_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCityTaxSortDirection () {
    return this.CityTaxSortAscending;
  }
  /** Set the field level filters for field: CityTax (ADJ.city_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCityTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.CityTax = value;
  }
  /** Retrieve filter for field: CityTax (ADJ.city_tax)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCityTaxFilter () {
    return this.CityTax;
  }

  /**
   * Retrieves the CityTaxFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CityTaxFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CityTaxFilter field
   */
  public String[] getCityTaxFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityTaxFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCityTaxFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCityTaxFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CityTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCityTaxFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CityTaxFilter filter value from a formatted string
   *
   * @param _value the CityTaxFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CityTaxFilter filter field
   */
  public void setCityTaxFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCityTaxFilterFromFormattedString");
    try {
      this.setCityTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CityTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCityTaxFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCityTaxFilterFromFormattedString");
  }

  /**
   * Sets the CityTaxFilter filter value from a formatted string
   *
   * @param _value the CityTaxFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CityTaxFilter filter field
   */
  public void setCityTaxFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCityTaxFilterFromFormattedCurrencyString");
    try {
      this.setCityTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CityTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCityTaxFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCityTaxFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the CityTaxFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CityTaxFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the CityTaxFilter field
   */

  public String[] getCityTaxFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityTaxFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCityTaxFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCityTaxFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CityTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCityTaxFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: OtherTax (ADJ.other_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setOtherTaxFetch (boolean fetch) {
    this.OtherTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: OtherTax (ADJ.other_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getOtherTaxFetch () {
    return this.OtherTaxFetch;
  }
  /** Set the SortOrder for field: OtherTax (ADJ.other_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOtherTaxSortOrder (Integer value) {
    this.OtherTaxSort = value;
  }
  /** Retrieve SortOrder for field: OtherTax (ADJ.other_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOtherTaxSortOrder () {
    return this.OtherTaxSort;
  }
  /** Set the sort direction for field: OtherTax (ADJ.other_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOtherTaxSortDirection (boolean ascending) {
    this.OtherTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OtherTax (ADJ.other_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOtherTaxSortDirection () {
    return this.OtherTaxSortAscending;
  }
  /** Set the field level filters for field: OtherTax (ADJ.other_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOtherTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.OtherTax = value;
  }
  /** Retrieve filter for field: OtherTax (ADJ.other_tax)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getOtherTaxFilter () {
    return this.OtherTax;
  }

  /**
   * Retrieves the OtherTaxFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OtherTaxFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OtherTaxFilter field
   */
  public String[] getOtherTaxFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOtherTaxFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOtherTaxFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOtherTaxFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OtherTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOtherTaxFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OtherTaxFilter filter value from a formatted string
   *
   * @param _value the OtherTaxFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OtherTaxFilter filter field
   */
  public void setOtherTaxFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOtherTaxFilterFromFormattedString");
    try {
      this.setOtherTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OtherTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOtherTaxFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOtherTaxFilterFromFormattedString");
  }

  /**
   * Sets the OtherTaxFilter filter value from a formatted string
   *
   * @param _value the OtherTaxFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OtherTaxFilter filter field
   */
  public void setOtherTaxFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOtherTaxFilterFromFormattedCurrencyString");
    try {
      this.setOtherTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OtherTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOtherTaxFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOtherTaxFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the OtherTaxFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OtherTaxFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the OtherTaxFilter field
   */

  public String[] getOtherTaxFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOtherTaxFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOtherTaxFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOtherTaxFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OtherTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOtherTaxFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: TaxJournalStatus (ADJ.tax_journal_status)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxJournalStatusFetch (boolean fetch) {
    this.TaxJournalStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxJournalStatus (ADJ.tax_journal_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxJournalStatusFetch () {
    return this.TaxJournalStatusFetch;
  }
  /** Set the SortOrder for field: TaxJournalStatus (ADJ.tax_journal_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxJournalStatusSortOrder (Integer value) {
    this.TaxJournalStatusSort = value;
  }
  /** Retrieve SortOrder for field: TaxJournalStatus (ADJ.tax_journal_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxJournalStatusSortOrder () {
    return this.TaxJournalStatusSort;
  }
  /** Set the sort direction for field: TaxJournalStatus (ADJ.tax_journal_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxJournalStatusSortDirection (boolean ascending) {
    this.TaxJournalStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxJournalStatus (ADJ.tax_journal_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxJournalStatusSortDirection () {
    return this.TaxJournalStatusSortAscending;
  }
  /** Set the field level filters for field: TaxJournalStatus (ADJ.tax_journal_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxJournalStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxJournalStatus = value;
  }
  /** Retrieve filter for field: TaxJournalStatus (ADJ.tax_journal_status)
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

  /** Set the field level Fetch value for field: DiscountAmt (ADJ.discount_amt)
   * @param fetch whether to fetch this field or not
   */
  public void setDiscountAmtFetch (boolean fetch) {
    this.DiscountAmtFetch = fetch;
  }
  /** Retrieve Fetch value for field: DiscountAmt (ADJ.discount_amt)
   * @return boolean the Fetch value for this field
   */
  public boolean getDiscountAmtFetch () {
    return this.DiscountAmtFetch;
  }
  /** Set the SortOrder for field: DiscountAmt (ADJ.discount_amt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDiscountAmtSortOrder (Integer value) {
    this.DiscountAmtSort = value;
  }
  /** Retrieve SortOrder for field: DiscountAmt (ADJ.discount_amt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDiscountAmtSortOrder () {
    return this.DiscountAmtSort;
  }
  /** Set the sort direction for field: DiscountAmt (ADJ.discount_amt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDiscountAmtSortDirection (boolean ascending) {
    this.DiscountAmtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DiscountAmt (ADJ.discount_amt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDiscountAmtSortDirection () {
    return this.DiscountAmtSortAscending;
  }
  /** Set the field level filters for field: DiscountAmt (ADJ.discount_amt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDiscountAmtFilter (BigIntegerFilter[] value) throws ServiceException {
    this.DiscountAmt = value;
  }
  /** Retrieve filter for field: DiscountAmt (ADJ.discount_amt)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getDiscountAmtFilter () {
    return this.DiscountAmt;
  }

  /**
   * Retrieves the DiscountAmtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DiscountAmtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountAmtFilter field
   */
  public String[] getDiscountAmtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountAmtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDiscountAmtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountAmtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountAmtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DiscountAmtFilter filter value from a formatted string
   *
   * @param _value the DiscountAmtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DiscountAmtFilter filter field
   */
  public void setDiscountAmtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountAmtFilterFromFormattedString");
    try {
      this.setDiscountAmtFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountAmtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountAmtFilterFromFormattedString");
  }

  /**
   * Sets the DiscountAmtFilter filter value from a formatted string
   *
   * @param _value the DiscountAmtFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DiscountAmtFilter filter field
   */
  public void setDiscountAmtFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountAmtFilterFromFormattedCurrencyString");
    try {
      this.setDiscountAmtFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountAmtFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountAmtFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the DiscountAmtFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DiscountAmtFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountAmtFilter field
   */

  public String[] getDiscountAmtFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountAmtFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDiscountAmtFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountAmtFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountAmtFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: ProfileId (ADJ.profile_id)
   * @param fetch whether to fetch this field or not
   */
  public void setProfileIdFetch (boolean fetch) {
    this.ProfileIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProfileId (ADJ.profile_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getProfileIdFetch () {
    return this.ProfileIdFetch;
  }
  /** Set the SortOrder for field: ProfileId (ADJ.profile_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProfileIdSortOrder (Integer value) {
    this.ProfileIdSort = value;
  }
  /** Retrieve SortOrder for field: ProfileId (ADJ.profile_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProfileIdSortOrder () {
    return this.ProfileIdSort;
  }
  /** Set the sort direction for field: ProfileId (ADJ.profile_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProfileIdSortDirection (boolean ascending) {
    this.ProfileIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProfileId (ADJ.profile_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProfileIdSortDirection () {
    return this.ProfileIdSortAscending;
  }
  /** Set the field level filters for field: ProfileId (ADJ.profile_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProfileIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ProfileId = value;
  }
  /** Retrieve filter for field: ProfileId (ADJ.profile_id)
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

  /** Set the field level Fetch value for field: AdjReasonCode (ADJ.adj_reason_code)
   * @param fetch whether to fetch this field or not
   */
  public void setAdjReasonCodeFetch (boolean fetch) {
    this.AdjReasonCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AdjReasonCode (ADJ.adj_reason_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getAdjReasonCodeFetch () {
    return this.AdjReasonCodeFetch;
  }
  /** Set the SortOrder for field: AdjReasonCode (ADJ.adj_reason_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAdjReasonCodeSortOrder (Integer value) {
    this.AdjReasonCodeSort = value;
  }
  /** Retrieve SortOrder for field: AdjReasonCode (ADJ.adj_reason_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAdjReasonCodeSortOrder () {
    return this.AdjReasonCodeSort;
  }
  /** Set the sort direction for field: AdjReasonCode (ADJ.adj_reason_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAdjReasonCodeSortDirection (boolean ascending) {
    this.AdjReasonCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AdjReasonCode (ADJ.adj_reason_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAdjReasonCodeSortDirection () {
    return this.AdjReasonCodeSortAscending;
  }
  /** Set the field level filters for field: AdjReasonCode (ADJ.adj_reason_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAdjReasonCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.AdjReasonCode = value;
  }
  /** Retrieve filter for field: AdjReasonCode (ADJ.adj_reason_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAdjReasonCodeFilter () {
    return this.AdjReasonCode;
  }

  /**
   * Retrieves the AdjReasonCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AdjReasonCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AdjReasonCodeFilter field
   */
  public String[] getAdjReasonCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjReasonCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAdjReasonCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjReasonCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AdjReasonCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAdjReasonCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AdjReasonCodeFilter filter value from a formatted string
   *
   * @param _value the AdjReasonCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AdjReasonCodeFilter filter field
   */
  public void setAdjReasonCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAdjReasonCodeFilterFromFormattedString");
    try {
      this.setAdjReasonCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AdjReasonCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAdjReasonCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAdjReasonCodeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated AdjReasonCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AdjReasonCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AdjReasonCodeFilter filter field
   */
  public String[] getAdjReasonCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjReasonCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getAdjReasonCodeFilter(), "AdjustmentReason", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjReasonCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AdjReasonCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAdjReasonCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated AdjReasonCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the AdjReasonCodeFilter filter field
   */
  public void setAdjReasonCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAdjReasonCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setAdjReasonCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "AdjReasonCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AdjReasonCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAdjReasonCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAdjReasonCodeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: FraudIndicator (ADJ.fraud_indicator)
   * @param fetch whether to fetch this field or not
   */
  public void setFraudIndicatorFetch (boolean fetch) {
    this.FraudIndicatorFetch = fetch;
  }
  /** Retrieve Fetch value for field: FraudIndicator (ADJ.fraud_indicator)
   * @return boolean the Fetch value for this field
   */
  public boolean getFraudIndicatorFetch () {
    return this.FraudIndicatorFetch;
  }
  /** Set the SortOrder for field: FraudIndicator (ADJ.fraud_indicator)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFraudIndicatorSortOrder (Integer value) {
    this.FraudIndicatorSort = value;
  }
  /** Retrieve SortOrder for field: FraudIndicator (ADJ.fraud_indicator)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFraudIndicatorSortOrder () {
    return this.FraudIndicatorSort;
  }
  /** Set the sort direction for field: FraudIndicator (ADJ.fraud_indicator)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFraudIndicatorSortDirection (boolean ascending) {
    this.FraudIndicatorSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FraudIndicator (ADJ.fraud_indicator)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFraudIndicatorSortDirection () {
    return this.FraudIndicatorSortAscending;
  }
  /** Set the field level filters for field: FraudIndicator (ADJ.fraud_indicator)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFraudIndicatorFilter (IntegerFilter[] value) throws ServiceException {
    this.FraudIndicator = value;
  }
  /** Retrieve filter for field: FraudIndicator (ADJ.fraud_indicator)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getFraudIndicatorFilter () {
    return this.FraudIndicator;
  }

  /**
   * Retrieves the FraudIndicatorFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FraudIndicatorFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FraudIndicatorFilter field
   */
  public String[] getFraudIndicatorFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFraudIndicatorFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFraudIndicatorFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFraudIndicatorFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FraudIndicatorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFraudIndicatorFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FraudIndicatorFilter filter value from a formatted string
   *
   * @param _value the FraudIndicatorFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FraudIndicatorFilter filter field
   */
  public void setFraudIndicatorFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFraudIndicatorFilterFromFormattedString");
    try {
      this.setFraudIndicatorFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FraudIndicatorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFraudIndicatorFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFraudIndicatorFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RevRcvCostCtr (ADJ.rev_rcv_cost_ctr)
   * @param fetch whether to fetch this field or not
   */
  public void setRevRcvCostCtrFetch (boolean fetch) {
    this.RevRcvCostCtrFetch = fetch;
  }
  /** Retrieve Fetch value for field: RevRcvCostCtr (ADJ.rev_rcv_cost_ctr)
   * @return boolean the Fetch value for this field
   */
  public boolean getRevRcvCostCtrFetch () {
    return this.RevRcvCostCtrFetch;
  }
  /** Set the SortOrder for field: RevRcvCostCtr (ADJ.rev_rcv_cost_ctr)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRevRcvCostCtrSortOrder (Integer value) {
    this.RevRcvCostCtrSort = value;
  }
  /** Retrieve SortOrder for field: RevRcvCostCtr (ADJ.rev_rcv_cost_ctr)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRevRcvCostCtrSortOrder () {
    return this.RevRcvCostCtrSort;
  }
  /** Set the sort direction for field: RevRcvCostCtr (ADJ.rev_rcv_cost_ctr)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRevRcvCostCtrSortDirection (boolean ascending) {
    this.RevRcvCostCtrSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RevRcvCostCtr (ADJ.rev_rcv_cost_ctr)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRevRcvCostCtrSortDirection () {
    return this.RevRcvCostCtrSortAscending;
  }
  /** Set the field level filters for field: RevRcvCostCtr (ADJ.rev_rcv_cost_ctr)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRevRcvCostCtrFilter (IntegerFilter[] value) throws ServiceException {
    this.RevRcvCostCtr = value;
  }
  /** Retrieve filter for field: RevRcvCostCtr (ADJ.rev_rcv_cost_ctr)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRevRcvCostCtrFilter () {
    return this.RevRcvCostCtr;
  }

  /**
   * Retrieves the RevRcvCostCtrFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RevRcvCostCtrFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RevRcvCostCtrFilter field
   */
  public String[] getRevRcvCostCtrFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRevRcvCostCtrFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRevRcvCostCtrFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRevRcvCostCtrFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RevRcvCostCtrFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRevRcvCostCtrFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RevRcvCostCtrFilter filter value from a formatted string
   *
   * @param _value the RevRcvCostCtrFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RevRcvCostCtrFilter filter field
   */
  public void setRevRcvCostCtrFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRevRcvCostCtrFilterFromFormattedString");
    try {
      this.setRevRcvCostCtrFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RevRcvCostCtrFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRevRcvCostCtrFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRevRcvCostCtrFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated RevRcvCostCtrFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the RevRcvCostCtrFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RevRcvCostCtrFilter filter field
   */
  public String[] getRevRcvCostCtrFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRevRcvCostCtrFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getRevRcvCostCtrFilter(), "RevRcvCostCenter", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRevRcvCostCtrFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RevRcvCostCtrFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRevRcvCostCtrFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated RevRcvCostCtrFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the RevRcvCostCtrFilter filter field
   */
  public void setRevRcvCostCtrFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRevRcvCostCtrFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setRevRcvCostCtrFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "RevRcvCostCtr", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RevRcvCostCtrFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRevRcvCostCtrFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRevRcvCostCtrFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: ChgWho (ADJ.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (ADJ.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (ADJ.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (ADJ.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (ADJ.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (ADJ.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (ADJ.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (ADJ.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (ADJ.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (ADJ.chg_who)
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

  /** Set the field level Fetch value for field: ChgDate (ADJ.chg_date)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDateFetch (boolean fetch) {
    this.ChgDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDate (ADJ.chg_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDateFetch () {
    return this.ChgDateFetch;
  }
  /** Set the SortOrder for field: ChgDate (ADJ.chg_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDateSortOrder (Integer value) {
    this.ChgDateSort = value;
  }
  /** Retrieve SortOrder for field: ChgDate (ADJ.chg_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDateSortOrder () {
    return this.ChgDateSort;
  }
  /** Set the sort direction for field: ChgDate (ADJ.chg_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDateSortDirection (boolean ascending) {
    this.ChgDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDate (ADJ.chg_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDateSortDirection () {
    return this.ChgDateSortAscending;
  }
  /** Set the field level filters for field: ChgDate (ADJ.chg_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDateFilter (DateFilter[] value) throws ServiceException {
    this.ChgDate = value;
  }
  /** Retrieve filter for field: ChgDate (ADJ.chg_date)
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


  /** Set the field level Fetch value for field: BalanceChgDate (ADJ.balance_chg_date)
   * @param fetch whether to fetch this field or not
   */
  public void setBalanceChgDateFetch (boolean fetch) {
    this.BalanceChgDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: BalanceChgDate (ADJ.balance_chg_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getBalanceChgDateFetch () {
    return this.BalanceChgDateFetch;
  }
  /** Set the SortOrder for field: BalanceChgDate (ADJ.balance_chg_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBalanceChgDateSortOrder (Integer value) {
    this.BalanceChgDateSort = value;
  }
  /** Retrieve SortOrder for field: BalanceChgDate (ADJ.balance_chg_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBalanceChgDateSortOrder () {
    return this.BalanceChgDateSort;
  }
  /** Set the sort direction for field: BalanceChgDate (ADJ.balance_chg_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBalanceChgDateSortDirection (boolean ascending) {
    this.BalanceChgDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BalanceChgDate (ADJ.balance_chg_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBalanceChgDateSortDirection () {
    return this.BalanceChgDateSortAscending;
  }
  /** Set the field level filters for field: BalanceChgDate (ADJ.balance_chg_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBalanceChgDateFilter (DateFilter[] value) throws ServiceException {
    this.BalanceChgDate = value;
  }
  /** Retrieve filter for field: BalanceChgDate (ADJ.balance_chg_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getBalanceChgDateFilter () {
    return this.BalanceChgDate;
  }

  /**
   * Retrieves the BalanceChgDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BalanceChgDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceChgDateFilter field
   */
  public String[] getBalanceChgDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceChgDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBalanceChgDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceChgDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceChgDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BalanceChgDateFilter filter value from a formatted string
   *
   * @param _value the BalanceChgDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceChgDateFilter filter field
   */
  public void setBalanceChgDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBalanceChgDateFilterFromFormattedString");
    try {
      this.setBalanceChgDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceChgDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceChgDateFilterFromFormattedString");
  }

  /**
   * Retrieves the BalanceChgDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BalanceChgDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceChgDateFilter field
   */
  public String[] getBalanceChgDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceChgDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBalanceChgDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceChgDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceChgDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the BalanceChgDateFilter filter value from a formatted string
   *
   * @param _value the BalanceChgDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceChgDateFilter filter field
   */
  public void setBalanceChgDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBalanceChgDateFilterFromFormattedDateTimeString");
    try {
      this.setBalanceChgDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BalanceChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceChgDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceChgDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: BRevRcvCostCtr (ADJ.b_rev_rcv_cost_ctr)
   * @param fetch whether to fetch this field or not
   */
  public void setBRevRcvCostCtrFetch (boolean fetch) {
    this.BRevRcvCostCtrFetch = fetch;
  }
  /** Retrieve Fetch value for field: BRevRcvCostCtr (ADJ.b_rev_rcv_cost_ctr)
   * @return boolean the Fetch value for this field
   */
  public boolean getBRevRcvCostCtrFetch () {
    return this.BRevRcvCostCtrFetch;
  }
  /** Set the SortOrder for field: BRevRcvCostCtr (ADJ.b_rev_rcv_cost_ctr)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBRevRcvCostCtrSortOrder (Integer value) {
    this.BRevRcvCostCtrSort = value;
  }
  /** Retrieve SortOrder for field: BRevRcvCostCtr (ADJ.b_rev_rcv_cost_ctr)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBRevRcvCostCtrSortOrder () {
    return this.BRevRcvCostCtrSort;
  }
  /** Set the sort direction for field: BRevRcvCostCtr (ADJ.b_rev_rcv_cost_ctr)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBRevRcvCostCtrSortDirection (boolean ascending) {
    this.BRevRcvCostCtrSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BRevRcvCostCtr (ADJ.b_rev_rcv_cost_ctr)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBRevRcvCostCtrSortDirection () {
    return this.BRevRcvCostCtrSortAscending;
  }
  /** Set the field level filters for field: BRevRcvCostCtr (ADJ.b_rev_rcv_cost_ctr)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBRevRcvCostCtrFilter (IntegerFilter[] value) throws ServiceException {
    this.BRevRcvCostCtr = value;
  }
  /** Retrieve filter for field: BRevRcvCostCtr (ADJ.b_rev_rcv_cost_ctr)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBRevRcvCostCtrFilter () {
    return this.BRevRcvCostCtr;
  }

  /**
   * Retrieves the BRevRcvCostCtrFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BRevRcvCostCtrFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BRevRcvCostCtrFilter field
   */
  public String[] getBRevRcvCostCtrFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBRevRcvCostCtrFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBRevRcvCostCtrFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBRevRcvCostCtrFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BRevRcvCostCtrFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBRevRcvCostCtrFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BRevRcvCostCtrFilter filter value from a formatted string
   *
   * @param _value the BRevRcvCostCtrFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BRevRcvCostCtrFilter filter field
   */
  public void setBRevRcvCostCtrFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBRevRcvCostCtrFilterFromFormattedString");
    try {
      this.setBRevRcvCostCtrFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BRevRcvCostCtrFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBRevRcvCostCtrFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBRevRcvCostCtrFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated BRevRcvCostCtrFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BRevRcvCostCtrFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BRevRcvCostCtrFilter filter field
   */
  public String[] getBRevRcvCostCtrFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBRevRcvCostCtrFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getBRevRcvCostCtrFilter(), "RevRcvCostCenter", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBRevRcvCostCtrFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BRevRcvCostCtrFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBRevRcvCostCtrFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated BRevRcvCostCtrFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BRevRcvCostCtrFilter filter field
   */
  public void setBRevRcvCostCtrFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBRevRcvCostCtrFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setBRevRcvCostCtrFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "BRevRcvCostCtr", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BRevRcvCostCtrFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBRevRcvCostCtrFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBRevRcvCostCtrFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: OrigSplitRowNum (ADJ.orig_split_row_num)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigSplitRowNumFetch (boolean fetch) {
    this.OrigSplitRowNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigSplitRowNum (ADJ.orig_split_row_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigSplitRowNumFetch () {
    return this.OrigSplitRowNumFetch;
  }
  /** Set the SortOrder for field: OrigSplitRowNum (ADJ.orig_split_row_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigSplitRowNumSortOrder (Integer value) {
    this.OrigSplitRowNumSort = value;
  }
  /** Retrieve SortOrder for field: OrigSplitRowNum (ADJ.orig_split_row_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigSplitRowNumSortOrder () {
    return this.OrigSplitRowNumSort;
  }
  /** Set the sort direction for field: OrigSplitRowNum (ADJ.orig_split_row_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigSplitRowNumSortDirection (boolean ascending) {
    this.OrigSplitRowNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigSplitRowNum (ADJ.orig_split_row_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigSplitRowNumSortDirection () {
    return this.OrigSplitRowNumSortAscending;
  }
  /** Set the field level filters for field: OrigSplitRowNum (ADJ.orig_split_row_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigSplitRowNumFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigSplitRowNum = value;
  }
  /** Retrieve filter for field: OrigSplitRowNum (ADJ.orig_split_row_num)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigSplitRowNumFilter () {
    return this.OrigSplitRowNum;
  }

  /**
   * Retrieves the OrigSplitRowNumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigSplitRowNumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigSplitRowNumFilter field
   */
  public String[] getOrigSplitRowNumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigSplitRowNumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigSplitRowNumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigSplitRowNumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigSplitRowNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigSplitRowNumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigSplitRowNumFilter filter value from a formatted string
   *
   * @param _value the OrigSplitRowNumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigSplitRowNumFilter filter field
   */
  public void setOrigSplitRowNumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigSplitRowNumFilterFromFormattedString");
    try {
      this.setOrigSplitRowNumFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigSplitRowNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigSplitRowNumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigSplitRowNumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TaxTypeCode (ADJ.tax_type_code)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxTypeCodeFetch (boolean fetch) {
    this.TaxTypeCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxTypeCode (ADJ.tax_type_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxTypeCodeFetch () {
    return this.TaxTypeCodeFetch;
  }
  /** Set the SortOrder for field: TaxTypeCode (ADJ.tax_type_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxTypeCodeSortOrder (Integer value) {
    this.TaxTypeCodeSort = value;
  }
  /** Retrieve SortOrder for field: TaxTypeCode (ADJ.tax_type_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxTypeCodeSortOrder () {
    return this.TaxTypeCodeSort;
  }
  /** Set the sort direction for field: TaxTypeCode (ADJ.tax_type_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxTypeCodeSortDirection (boolean ascending) {
    this.TaxTypeCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxTypeCode (ADJ.tax_type_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxTypeCodeSortDirection () {
    return this.TaxTypeCodeSortAscending;
  }
  /** Set the field level filters for field: TaxTypeCode (ADJ.tax_type_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxTypeCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxTypeCode = value;
  }
  /** Retrieve filter for field: TaxTypeCode (ADJ.tax_type_code)
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

  /** Set the field level Fetch value for field: OrigSubmitterName (ADJ.orig_submitter_name)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigSubmitterNameFetch (boolean fetch) {
    this.OrigSubmitterNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigSubmitterName (ADJ.orig_submitter_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigSubmitterNameFetch () {
    return this.OrigSubmitterNameFetch;
  }
  /** Set the SortOrder for field: OrigSubmitterName (ADJ.orig_submitter_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigSubmitterNameSortOrder (Integer value) {
    this.OrigSubmitterNameSort = value;
  }
  /** Retrieve SortOrder for field: OrigSubmitterName (ADJ.orig_submitter_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigSubmitterNameSortOrder () {
    return this.OrigSubmitterNameSort;
  }
  /** Set the sort direction for field: OrigSubmitterName (ADJ.orig_submitter_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigSubmitterNameSortDirection (boolean ascending) {
    this.OrigSubmitterNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigSubmitterName (ADJ.orig_submitter_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigSubmitterNameSortDirection () {
    return this.OrigSubmitterNameSortAscending;
  }
  /** Set the case insensitive for field: OrigSubmitterName (ADJ.orig_submitter_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setOrigSubmitterNameCaseInsensitive (boolean ascending) {
    this.OrigSubmitterNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: OrigSubmitterName (ADJ.orig_submitter_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getOrigSubmitterNameCaseInsensitive () {
    return this.OrigSubmitterNameCaseInsensitive;
  }
  /** Set the field level filters for field: OrigSubmitterName (ADJ.orig_submitter_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigSubmitterNameFilter (StringFilter[] value) throws ServiceException {
    this.OrigSubmitterName = value;
  }
  /** Retrieve filter for field: OrigSubmitterName (ADJ.orig_submitter_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getOrigSubmitterNameFilter () {
    return this.OrigSubmitterName;
  }

  /**
   * Retrieves the OrigSubmitterNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigSubmitterNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigSubmitterNameFilter field
   */
  public String[] getOrigSubmitterNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigSubmitterNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigSubmitterNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigSubmitterNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigSubmitterNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigSubmitterNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigSubmitterNameFilter filter value from a formatted string
   *
   * @param _value the OrigSubmitterNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigSubmitterNameFilter filter field
   */
  public void setOrigSubmitterNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigSubmitterNameFilterFromFormattedString");
    try {
      this.setOrigSubmitterNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigSubmitterNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigSubmitterNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigSubmitterNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LastReviewedName (ADJ.last_reviewed_name)
   * @param fetch whether to fetch this field or not
   */
  public void setLastReviewedNameFetch (boolean fetch) {
    this.LastReviewedNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: LastReviewedName (ADJ.last_reviewed_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getLastReviewedNameFetch () {
    return this.LastReviewedNameFetch;
  }
  /** Set the SortOrder for field: LastReviewedName (ADJ.last_reviewed_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLastReviewedNameSortOrder (Integer value) {
    this.LastReviewedNameSort = value;
  }
  /** Retrieve SortOrder for field: LastReviewedName (ADJ.last_reviewed_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLastReviewedNameSortOrder () {
    return this.LastReviewedNameSort;
  }
  /** Set the sort direction for field: LastReviewedName (ADJ.last_reviewed_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLastReviewedNameSortDirection (boolean ascending) {
    this.LastReviewedNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LastReviewedName (ADJ.last_reviewed_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLastReviewedNameSortDirection () {
    return this.LastReviewedNameSortAscending;
  }
  /** Set the case insensitive for field: LastReviewedName (ADJ.last_reviewed_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setLastReviewedNameCaseInsensitive (boolean ascending) {
    this.LastReviewedNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: LastReviewedName (ADJ.last_reviewed_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getLastReviewedNameCaseInsensitive () {
    return this.LastReviewedNameCaseInsensitive;
  }
  /** Set the field level filters for field: LastReviewedName (ADJ.last_reviewed_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLastReviewedNameFilter (StringFilter[] value) throws ServiceException {
    this.LastReviewedName = value;
  }
  /** Retrieve filter for field: LastReviewedName (ADJ.last_reviewed_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getLastReviewedNameFilter () {
    return this.LastReviewedName;
  }

  /**
   * Retrieves the LastReviewedNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LastReviewedNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LastReviewedNameFilter field
   */
  public String[] getLastReviewedNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLastReviewedNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLastReviewedNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLastReviewedNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LastReviewedNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLastReviewedNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LastReviewedNameFilter filter value from a formatted string
   *
   * @param _value the LastReviewedNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LastReviewedNameFilter filter field
   */
  public void setLastReviewedNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLastReviewedNameFilterFromFormattedString");
    try {
      this.setLastReviewedNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LastReviewedNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLastReviewedNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLastReviewedNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Jurisdiction (ADJ.jurisdiction)
   * @param fetch whether to fetch this field or not
   */
  public void setJurisdictionFetch (boolean fetch) {
    this.JurisdictionFetch = fetch;
  }
  /** Retrieve Fetch value for field: Jurisdiction (ADJ.jurisdiction)
   * @return boolean the Fetch value for this field
   */
  public boolean getJurisdictionFetch () {
    return this.JurisdictionFetch;
  }
  /** Set the SortOrder for field: Jurisdiction (ADJ.jurisdiction)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setJurisdictionSortOrder (Integer value) {
    this.JurisdictionSort = value;
  }
  /** Retrieve SortOrder for field: Jurisdiction (ADJ.jurisdiction)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getJurisdictionSortOrder () {
    return this.JurisdictionSort;
  }
  /** Set the sort direction for field: Jurisdiction (ADJ.jurisdiction)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setJurisdictionSortDirection (boolean ascending) {
    this.JurisdictionSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Jurisdiction (ADJ.jurisdiction)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getJurisdictionSortDirection () {
    return this.JurisdictionSortAscending;
  }
  /** Set the field level filters for field: Jurisdiction (ADJ.jurisdiction)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setJurisdictionFilter (IntegerFilter[] value) throws ServiceException {
    this.Jurisdiction = value;
  }
  /** Retrieve filter for field: Jurisdiction (ADJ.jurisdiction)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getJurisdictionFilter () {
    return this.Jurisdiction;
  }

  /**
   * Retrieves the JurisdictionFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The JurisdictionFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the JurisdictionFilter field
   */
  public String[] getJurisdictionFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJurisdictionFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getJurisdictionFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getJurisdictionFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("JurisdictionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getJurisdictionFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the JurisdictionFilter filter value from a formatted string
   *
   * @param _value the JurisdictionFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the JurisdictionFilter filter field
   */
  public void setJurisdictionFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setJurisdictionFilterFromFormattedString");
    try {
      this.setJurisdictionFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("JurisdictionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setJurisdictionFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setJurisdictionFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated JurisdictionFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the JurisdictionFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the JurisdictionFilter filter field
   */
  public String[] getJurisdictionFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJurisdictionFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getJurisdictionFilter(), "Jurisdiction", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getJurisdictionFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("JurisdictionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getJurisdictionFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated JurisdictionFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the JurisdictionFilter filter field
   */
  public void setJurisdictionFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setJurisdictionFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setJurisdictionFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "Jurisdiction", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("JurisdictionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setJurisdictionFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setJurisdictionFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: OpenItemId (ADJ.open_item_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOpenItemIdFetch (boolean fetch) {
    this.OpenItemIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OpenItemId (ADJ.open_item_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOpenItemIdFetch () {
    return this.OpenItemIdFetch;
  }
  /** Set the SortOrder for field: OpenItemId (ADJ.open_item_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOpenItemIdSortOrder (Integer value) {
    this.OpenItemIdSort = value;
  }
  /** Retrieve SortOrder for field: OpenItemId (ADJ.open_item_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOpenItemIdSortOrder () {
    return this.OpenItemIdSort;
  }
  /** Set the sort direction for field: OpenItemId (ADJ.open_item_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOpenItemIdSortDirection (boolean ascending) {
    this.OpenItemIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OpenItemId (ADJ.open_item_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOpenItemIdSortDirection () {
    return this.OpenItemIdSortAscending;
  }
  /** Set the field level filters for field: OpenItemId (ADJ.open_item_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOpenItemIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OpenItemId = value;
  }
  /** Retrieve filter for field: OpenItemId (ADJ.open_item_id)
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


  /** Set the field level Fetch value for field: BillOrderNumber (ADJ.bill_order_number)
   * @param fetch whether to fetch this field or not
   */
  public void setBillOrderNumberFetch (boolean fetch) {
    this.BillOrderNumberFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillOrderNumber (ADJ.bill_order_number)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillOrderNumberFetch () {
    return this.BillOrderNumberFetch;
  }
  /** Set the SortOrder for field: BillOrderNumber (ADJ.bill_order_number)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillOrderNumberSortOrder (Integer value) {
    this.BillOrderNumberSort = value;
  }
  /** Retrieve SortOrder for field: BillOrderNumber (ADJ.bill_order_number)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillOrderNumberSortOrder () {
    return this.BillOrderNumberSort;
  }
  /** Set the sort direction for field: BillOrderNumber (ADJ.bill_order_number)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillOrderNumberSortDirection (boolean ascending) {
    this.BillOrderNumberSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillOrderNumber (ADJ.bill_order_number)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillOrderNumberSortDirection () {
    return this.BillOrderNumberSortAscending;
  }
  /** Set the case insensitive for field: BillOrderNumber (ADJ.bill_order_number)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillOrderNumberCaseInsensitive (boolean ascending) {
    this.BillOrderNumberCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillOrderNumber (ADJ.bill_order_number)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillOrderNumberCaseInsensitive () {
    return this.BillOrderNumberCaseInsensitive;
  }
  /** Set the field level filters for field: BillOrderNumber (ADJ.bill_order_number)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillOrderNumberFilter (StringFilter[] value) throws ServiceException {
    this.BillOrderNumber = value;
  }
  /** Retrieve filter for field: BillOrderNumber (ADJ.bill_order_number)
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

  /** Set the field level Fetch value for field: RequestId (ADJ.request_id)
   * @param fetch whether to fetch this field or not
   */
  public void setRequestIdFetch (boolean fetch) {
    this.RequestIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: RequestId (ADJ.request_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getRequestIdFetch () {
    return this.RequestIdFetch;
  }
  /** Set the SortOrder for field: RequestId (ADJ.request_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRequestIdSortOrder (Integer value) {
    this.RequestIdSort = value;
  }
  /** Retrieve SortOrder for field: RequestId (ADJ.request_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRequestIdSortOrder () {
    return this.RequestIdSort;
  }
  /** Set the sort direction for field: RequestId (ADJ.request_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRequestIdSortDirection (boolean ascending) {
    this.RequestIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RequestId (ADJ.request_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRequestIdSortDirection () {
    return this.RequestIdSortAscending;
  }
  /** Set the field level filters for field: RequestId (ADJ.request_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRequestIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.RequestId = value;
  }
  /** Retrieve filter for field: RequestId (ADJ.request_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getRequestIdFilter () {
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
      this.setRequestIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RequestIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRequestIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRequestIdFilterFromFormattedString");
  }

  public String toString() {
    return AdjustmentObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AdjustmentObjectHelper.toMap(this, null);
  }
}
