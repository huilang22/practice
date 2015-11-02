/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: UnbilledUsageObjectFilter.java
 * Definition File: Customer/UnbilledUsage.xml
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
public class UnbilledUsageObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public UnbilledUsageObjectKeyFilter Key = null;
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
  /** raw field */
  public    IntegerFilter[] ServerId  = null;
  protected boolean ServerIdFetch = false;
  protected boolean ServerIdSortAscending = true;
  protected Integer ServerIdSort = null;
  /** raw field for: CDR_UNBILLED.cdr_data_partition_key) */
  public    DateFilter[] CdrDataPartitionKey  = null;
  protected boolean CdrDataPartitionKeyFetch = false;
  protected boolean CdrDataPartitionKeySortAscending = true;
  protected Integer CdrDataPartitionKeySort = null;
  /** raw field for: CDR_UNBILLED.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: CDR_UNBILLED.subscr_no) */
  public    IntegerFilter[] ServiceInternalId  = null;
  protected boolean ServiceInternalIdFetch = false;
  protected boolean ServiceInternalIdSortAscending = true;
  protected Integer ServiceInternalIdSort = null;
  /** raw field for: CDR_UNBILLED.subscr_no_resets) */
  public    IntegerFilter[] ServiceInternalIdResets  = null;
  protected boolean ServiceInternalIdResetsFetch = false;
  protected boolean ServiceInternalIdResetsSortAscending = true;
  protected Integer ServiceInternalIdResetsSort = null;
  /** raw field for: CDR_UNBILLED.type_id_usg) */
  public    IntegerFilter[] TypeIdUsg  = null;
  protected boolean TypeIdUsgFetch = false;
  protected boolean TypeIdUsgSortAscending = true;
  protected Integer TypeIdUsgSort = null;
  /** raw field for: CDR_UNBILLED.trans_dt) */
  public    DateFilter[] TransDt  = null;
  protected boolean TransDtFetch = false;
  protected boolean TransDtSortAscending = true;
  protected Integer TransDtSort = null;
  /** raw field for: CDR_UNBILLED.rate_dt) */
  public    DateFilter[] RateDt  = null;
  protected boolean RateDtFetch = false;
  protected boolean RateDtSortAscending = true;
  protected Integer RateDtSort = null;
  /** raw field for: CDR_DATA.ext_tracking_id) */
  public    StringFilter[] ExtTrackingId  = null;
  protected boolean ExtTrackingIdFetch = false;
  protected boolean ExtTrackingIdSortAscending = true;
  protected boolean ExtTrackingIdCaseInsensitive = false;
  protected Integer ExtTrackingIdSort = null;
  /** raw field for: CDR_DATA.trans_id) */
  public    StringFilter[] TransId  = null;
  protected boolean TransIdFetch = false;
  protected boolean TransIdSortAscending = true;
  protected boolean TransIdCaseInsensitive = false;
  protected Integer TransIdSort = null;
  /** raw field for: CDR_DATA.element_id) */
  public    IntegerFilter[] ElementId  = null;
  protected boolean ElementIdFetch = false;
  protected boolean ElementIdSortAscending = true;
  protected Integer ElementIdSort = null;
  /** raw field for: CDR_DATA.rate_class) */
  public    IntegerFilter[] RateClass  = null;
  protected boolean RateClassFetch = false;
  protected boolean RateClassSortAscending = true;
  protected Integer RateClassSort = null;
  /** raw field for: CDR_DATA.bill_class) */
  public    IntegerFilter[] BillClass  = null;
  protected boolean BillClassFetch = false;
  protected boolean BillClassSortAscending = true;
  protected Integer BillClassSort = null;
  /** raw field for: CDR_DATA.provider_id) */
  public    IntegerFilter[] ProviderId  = null;
  protected boolean ProviderIdFetch = false;
  protected boolean ProviderIdSortAscending = true;
  protected Integer ProviderIdSort = null;
  /** raw field for: CDR_DATA.jurisdiction) */
  public    IntegerFilter[] Jurisdiction  = null;
  protected boolean JurisdictionFetch = false;
  protected boolean JurisdictionSortAscending = true;
  protected Integer JurisdictionSort = null;
  /** raw field for: CDR_DATA.rate_currency_code) */
  public    IntegerFilter[] RateCurrencyCode  = null;
  protected boolean RateCurrencyCodeFetch = false;
  protected boolean RateCurrencyCodeSortAscending = true;
  protected Integer RateCurrencyCodeSort = null;
  /** raw field for: CDR_DATA.external_id) */
  public    StringFilter[] ExternalId  = null;
  protected boolean ExternalIdFetch = false;
  protected boolean ExternalIdSortAscending = true;
  protected boolean ExternalIdCaseInsensitive = false;
  protected Integer ExternalIdSort = null;
  /** raw field for: CDR_DATA.external_id_type) */
  public    IntegerFilter[] ExternalIdType  = null;
  protected boolean ExternalIdTypeFetch = false;
  protected boolean ExternalIdTypeSortAscending = true;
  protected Integer ExternalIdTypeSort = null;
  /** raw field for: CDR_DATA.point_origin) */
  public    StringFilter[] PointOrigin  = null;
  protected boolean PointOriginFetch = false;
  protected boolean PointOriginSortAscending = true;
  protected boolean PointOriginCaseInsensitive = false;
  protected Integer PointOriginSort = null;
  /** raw field for: CDR_DATA.country_code_origin) */
  public    IntegerFilter[] CountryCodeOrigin  = null;
  protected boolean CountryCodeOriginFetch = false;
  protected boolean CountryCodeOriginSortAscending = true;
  protected Integer CountryCodeOriginSort = null;
  /** raw field for: CDR_DATA.country_dial_code_origin) */
  public    StringFilter[] CountryDialCodeOrigin  = null;
  protected boolean CountryDialCodeOriginFetch = false;
  protected boolean CountryDialCodeOriginSortAscending = true;
  protected boolean CountryDialCodeOriginCaseInsensitive = false;
  protected Integer CountryDialCodeOriginSort = null;
  /** raw field for: CDR_DATA.point_id_origin) */
  public    IntegerFilter[] PointIdOrigin  = null;
  protected boolean PointIdOriginFetch = false;
  protected boolean PointIdOriginSortAscending = true;
  protected Integer PointIdOriginSort = null;
  /** raw field for: CDR_DATA.point_tax_code_origin) */
  public    StringFilter[] PointTaxCodeOrigin  = null;
  protected boolean PointTaxCodeOriginFetch = false;
  protected boolean PointTaxCodeOriginSortAscending = true;
  protected boolean PointTaxCodeOriginCaseInsensitive = false;
  protected Integer PointTaxCodeOriginSort = null;
  /** raw field for: CDR_DATA.point_tax_code_type_origin) */
  public    IntegerFilter[] PointTaxCodeTypeOrigin  = null;
  protected boolean PointTaxCodeTypeOriginFetch = false;
  protected boolean PointTaxCodeTypeOriginSortAscending = true;
  protected Integer PointTaxCodeTypeOriginSort = null;
  /** raw field for: CDR_DATA.point_target) */
  public    StringFilter[] PointTarget  = null;
  protected boolean PointTargetFetch = false;
  protected boolean PointTargetSortAscending = true;
  protected boolean PointTargetCaseInsensitive = false;
  protected Integer PointTargetSort = null;
  /** raw field for: CDR_DATA.country_code_target) */
  public    IntegerFilter[] CountryCodeTarget  = null;
  protected boolean CountryCodeTargetFetch = false;
  protected boolean CountryCodeTargetSortAscending = true;
  protected Integer CountryCodeTargetSort = null;
  /** raw field for: CDR_DATA.point_id_target) */
  public    IntegerFilter[] PointIdTarget  = null;
  protected boolean PointIdTargetFetch = false;
  protected boolean PointIdTargetSortAscending = true;
  protected Integer PointIdTargetSort = null;
  /** raw field for: CDR_DATA.point_tax_code_target) */
  public    StringFilter[] PointTaxCodeTarget  = null;
  protected boolean PointTaxCodeTargetFetch = false;
  protected boolean PointTaxCodeTargetSortAscending = true;
  protected boolean PointTaxCodeTargetCaseInsensitive = false;
  protected Integer PointTaxCodeTargetSort = null;
  /** raw field for: CDR_DATA.point_tax_code_type_target) */
  public    IntegerFilter[] PointTaxCodeTypeTarget  = null;
  protected boolean PointTaxCodeTypeTargetFetch = false;
  protected boolean PointTaxCodeTypeTargetSortAscending = true;
  protected Integer PointTaxCodeTypeTargetSort = null;
  /** raw field for: CDR_DATA.base_amt) */
  public    BigIntegerFilter[] BaseAmt  = null;
  protected boolean BaseAmtFetch = false;
  protected boolean BaseAmtSortAscending = true;
  protected Integer BaseAmtSort = null;
  /** raw field for: CDR_DATA.second_dt) */
  public    DateFilter[] SecondDt  = null;
  protected boolean SecondDtFetch = false;
  protected boolean SecondDtSortAscending = true;
  protected Integer SecondDtSort = null;
  /** raw field for: CDR_DATA.tax_rate_active_dt) */
  public    DateFilter[] TaxRateActiveDt  = null;
  protected boolean TaxRateActiveDtFetch = false;
  protected boolean TaxRateActiveDtSortAscending = true;
  protected Integer TaxRateActiveDtSort = null;
  /** raw field for: CDR_DATA.tax_rate_inactive_dt) */
  public    DateFilter[] TaxRateInactiveDt  = null;
  protected boolean TaxRateInactiveDtFetch = false;
  protected boolean TaxRateInactiveDtSortAscending = true;
  protected Integer TaxRateInactiveDtSort = null;
  /** raw field for: CDR_DATA.timezone) */
  public    IntegerFilter[] Timezone  = null;
  protected boolean TimezoneFetch = false;
  protected boolean TimezoneSortAscending = true;
  protected Integer TimezoneSort = null;
  /** raw field for: CDR_DATA.primary_units) */
  public    BigIntegerFilter[] PrimaryUnits  = null;
  protected boolean PrimaryUnitsFetch = false;
  protected boolean PrimaryUnitsSortAscending = true;
  protected Integer PrimaryUnitsSort = null;
  /** raw field for: CDR_DATA.second_units) */
  public    BigIntegerFilter[] SecondUnits  = null;
  protected boolean SecondUnitsFetch = false;
  protected boolean SecondUnitsSortAscending = true;
  protected Integer SecondUnitsSort = null;
  /** raw field for: CDR_DATA.third_units) */
  public    BigIntegerFilter[] ThirdUnits  = null;
  protected boolean ThirdUnitsFetch = false;
  protected boolean ThirdUnitsSortAscending = true;
  protected Integer ThirdUnitsSort = null;
  /** raw field for: CDR_DATA.units_currency_code) */
  public    IntegerFilter[] UnitsCurrencyCode  = null;
  protected boolean UnitsCurrencyCodeFetch = false;
  protected boolean UnitsCurrencyCodeSortAscending = true;
  protected Integer UnitsCurrencyCodeSort = null;
  /** raw field for: CDR_DATA.billing_units_type) */
  public    IntegerFilter[] BillingUnitsType  = null;
  protected boolean BillingUnitsTypeFetch = false;
  protected boolean BillingUnitsTypeSortAscending = true;
  protected Integer BillingUnitsTypeSort = null;
  /** raw field for: CDR_DATA.profile_id) */
  public    BigIntegerFilter[] ProfileId  = null;
  protected boolean ProfileIdFetch = false;
  protected boolean ProfileIdSortAscending = true;
  protected Integer ProfileIdSort = null;
  /** raw field for: CDR_DATA.annotation) */
  public    StringFilter[] Annotation  = null;
  protected boolean AnnotationFetch = false;
  protected boolean AnnotationSortAscending = true;
  protected boolean AnnotationCaseInsensitive = false;
  protected Integer AnnotationSort = null;
  /** raw field for: CDR_DATA.customer_tag) */
  public    StringFilter[] CustomerTag  = null;
  protected boolean CustomerTagFetch = false;
  protected boolean CustomerTagSortAscending = true;
  protected boolean CustomerTagCaseInsensitive = false;
  protected Integer CustomerTagSort = null;
  /** raw field for: CDR_DATA.rated_units) */
  public    BigIntegerFilter[] RatedUnits  = null;
  protected boolean RatedUnitsFetch = false;
  protected boolean RatedUnitsSortAscending = true;
  protected Integer RatedUnitsSort = null;
  /** raw field for: CDR_DATA.amount) */
  public    BigIntegerFilter[] Amount  = null;
  protected boolean AmountFetch = false;
  protected boolean AmountSortAscending = true;
  protected Integer AmountSort = null;
  /** raw field for: CDR_DATA.foreign_amount) */
  public    BigIntegerFilter[] ForeignAmount  = null;
  protected boolean ForeignAmountFetch = false;
  protected boolean ForeignAmountSortAscending = true;
  protected Integer ForeignAmountSort = null;
  /** raw field for: CDR_DATA.rate_period) */
  public    StringFilter[] RatePeriod  = null;
  protected boolean RatePeriodFetch = false;
  protected boolean RatePeriodSortAscending = true;
  protected boolean RatePeriodCaseInsensitive = false;
  protected Integer RatePeriodSort = null;
  /** raw field for: CDR_DATA.no_bill) */
  public    BooleanFilter[] NoBill  = null;
  protected boolean NoBillFetch = false;
  protected boolean NoBillSortAscending = true;
  protected Integer NoBillSort = null;
  /** raw field for: CDR_DATA.comp_status) */
  public    IntegerFilter[] CompStatus  = null;
  protected boolean CompStatusFetch = false;
  protected boolean CompStatusSortAscending = true;
  protected Integer CompStatusSort = null;
  /** raw field for: CDR_DATA.cdr_status) */
  public    IntegerFilter[] CdrStatus  = null;
  protected boolean CdrStatusFetch = false;
  protected boolean CdrStatusSortAscending = true;
  protected Integer CdrStatusSort = null;
  /** raw field for: CDR_DATA.file_id) */
  public    IntegerFilter[] FileId  = null;
  protected boolean FileIdFetch = false;
  protected boolean FileIdSortAscending = true;
  protected Integer FileIdSort = null;
  /** raw field for: CDR_DATA.file_id_serv) */
  public    IntegerFilter[] FileIdServ  = null;
  protected boolean FileIdServFetch = false;
  protected boolean FileIdServSortAscending = true;
  protected Integer FileIdServSort = null;
  /** raw field for: CDR_DATA.rev_rcv_cost_ctr) */
  public    IntegerFilter[] RevRcvCostCtr  = null;
  protected boolean RevRcvCostCtrFetch = false;
  protected boolean RevRcvCostCtrSortAscending = true;
  protected Integer RevRcvCostCtrSort = null;
  /** raw field for: CDR_DATA.arch_flag) */
  public    BooleanFilter[] ArchFlag  = null;
  protected boolean ArchFlagFetch = false;
  protected boolean ArchFlagSortAscending = true;
  protected Integer ArchFlagSort = null;
  /** raw field for: CDR_DATA.unrounded_amount) */
  public    BigIntegerFilter[] UnroundedAmount  = null;
  protected boolean UnroundedAmountFetch = false;
  protected boolean UnroundedAmountSortAscending = true;
  protected Integer UnroundedAmountSort = null;
  /** raw field for: CDR_DATA.corridor_plan_id) */
  public    IntegerFilter[] CorridorPlanId  = null;
  protected boolean CorridorPlanIdFetch = false;
  protected boolean CorridorPlanIdSortAscending = true;
  protected Integer CorridorPlanIdSort = null;
  /** raw field for: CDR_DATA.cell_id_origin) */
  public    IntegerFilter[] CellIdOrigin  = null;
  protected boolean CellIdOriginFetch = false;
  protected boolean CellIdOriginSortAscending = true;
  protected Integer CellIdOriginSort = null;
  /** raw field for: CDR_DATA.orig_type_id_usg) */
  public    IntegerFilter[] OrigTypeIdUsg  = null;
  protected boolean OrigTypeIdUsgFetch = false;
  protected boolean OrigTypeIdUsgSortAscending = true;
  protected Integer OrigTypeIdUsgSort = null;
  /** raw field for: CDR_DATA.access_region_origin) */
  public    StringFilter[] AccessRegionOrigin  = null;
  protected boolean AccessRegionOriginFetch = false;
  protected boolean AccessRegionOriginSortAscending = true;
  protected boolean AccessRegionOriginCaseInsensitive = false;
  protected Integer AccessRegionOriginSort = null;
  /** raw field for: CDR_DATA.access_region_target) */
  public    StringFilter[] AccessRegionTarget  = null;
  protected boolean AccessRegionTargetFetch = false;
  protected boolean AccessRegionTargetSortAscending = true;
  protected boolean AccessRegionTargetCaseInsensitive = false;
  protected Integer AccessRegionTargetSort = null;
  /** raw field for: CDR_DATA.open_item_id) */
  public    IntegerFilter[] OpenItemId  = null;
  protected boolean OpenItemIdFetch = false;
  protected boolean OpenItemIdSortAscending = true;
  protected Integer OpenItemIdSort = null;
  /** raw field for: CDR_DATA.num_records) */
  public    IntegerFilter[] NumRecords  = null;
  protected boolean NumRecordsFetch = false;
  protected boolean NumRecordsSortAscending = true;
  protected Integer NumRecordsSort = null;
  /** raw field for: CDR_DATA.amount_reduction) */
  public    BigIntegerFilter[] AmountReduction  = null;
  protected boolean AmountReductionFetch = false;
  protected boolean AmountReductionSortAscending = true;
  protected Integer AmountReductionSort = null;
  /** raw field for: CDR_DATA.amount_reduction_id) */
  public    IntegerFilter[] AmountReductionId  = null;
  protected boolean AmountReductionIdFetch = false;
  protected boolean AmountReductionIdSortAscending = true;
  protected Integer AmountReductionIdSort = null;
  /** raw field for: CDR_DATA.seqnum_rate_usage) */
  public    IntegerFilter[] SeqnumRateUsage  = null;
  protected boolean SeqnumRateUsageFetch = false;
  protected boolean SeqnumRateUsageSortAscending = true;
  protected Integer SeqnumRateUsageSort = null;
  /** raw field for: CDR_DATA.seqnum_rate_usage_overrides) */
  public    IntegerFilter[] SeqnumRateUsageOverrides  = null;
  protected boolean SeqnumRateUsageOverridesFetch = false;
  protected boolean SeqnumRateUsageOverridesSortAscending = true;
  protected Integer SeqnumRateUsageOverridesSort = null;
  /** raw field for: CDR_DATA.raw_units) */
  public    BigIntegerFilter[] RawUnits  = null;
  protected boolean RawUnitsFetch = false;
  protected boolean RawUnitsSortAscending = true;
  protected Integer RawUnitsSort = null;
  /** raw field for: CDR_DATA.raw_units_rounded) */
  public    BigIntegerFilter[] RawUnitsRounded  = null;
  protected boolean RawUnitsRoundedFetch = false;
  protected boolean RawUnitsRoundedSortAscending = true;
  protected Integer RawUnitsRoundedSort = null;
  /** raw field for: CDR_DATA.aggr_usage_id) */
  public    IntegerFilter[] AggrUsageId  = null;
  protected boolean AggrUsageIdFetch = false;
  protected boolean AggrUsageIdSortAscending = true;
  protected Integer AggrUsageIdSort = null;
  /** raw field for: CDR_DATA.zone_class) */
  public    IntegerFilter[] ZoneClass  = null;
  protected boolean ZoneClassFetch = false;
  protected boolean ZoneClassSortAscending = true;
  protected Integer ZoneClassSort = null;
  /** raw field for: CDR_DATA.point_class_origin) */
  public    IntegerFilter[] PointClassOrigin  = null;
  protected boolean PointClassOriginFetch = false;
  protected boolean PointClassOriginSortAscending = true;
  protected Integer PointClassOriginSort = null;
  /** raw field for: CDR_DATA.point_class_target) */
  public    IntegerFilter[] PointClassTarget  = null;
  protected boolean PointClassTargetFetch = false;
  protected boolean PointClassTargetSortAscending = true;
  protected Integer PointClassTargetSort = null;
  /** raw field for: CDR_DATA.equip_class_code) */
  public    IntegerFilter[] EquipClassCode  = null;
  protected boolean EquipClassCodeFetch = false;
  protected boolean EquipClassCodeSortAscending = true;
  protected Integer EquipClassCodeSort = null;
  /** raw field for: CDR_DATA.component_id) */
  public    IntegerFilter[] ComponentId  = null;
  protected boolean ComponentIdFetch = false;
  protected boolean ComponentIdSortAscending = true;
  protected Integer ComponentIdSort = null;
  /** raw field for: CDR_DATA.tax_pkg_count) */
  public    IntegerFilter[] TaxPkgCount  = null;
  protected boolean TaxPkgCountFetch = false;
  protected boolean TaxPkgCountSortAscending = true;
  protected Integer TaxPkgCountSort = null;
  /** raw field for: CDR_DATA.geocode) */
  public    StringFilter[] Geocode  = null;
  protected boolean GeocodeFetch = false;
  protected boolean GeocodeSortAscending = true;
  protected boolean GeocodeCaseInsensitive = false;
  protected Integer GeocodeSort = null;
  /** raw field for: CDR_DATA.add_implied_decimal) */
  public    IntegerFilter[] AddImpliedDecimal  = null;
  protected boolean AddImpliedDecimalFetch = false;
  protected boolean AddImpliedDecimalSortAscending = true;
  protected Integer AddImpliedDecimalSort = null;
  /** raw field for: CDR_DATA.rerated_dt) */
  public    DateFilter[] ReratedDt  = null;
  protected boolean ReratedDtFetch = false;
  protected boolean ReratedDtSortAscending = true;
  protected Integer ReratedDtSort = null;
  /** raw field for: CDR_DATA.external_invoice_id) */
  public    BigIntegerFilter[] ExternalInvoiceId  = null;
  protected boolean ExternalInvoiceIdFetch = false;
  protected boolean ExternalInvoiceIdSortAscending = true;
  protected Integer ExternalInvoiceIdSort = null;
  /** raw field for: CDR_DATA.invoice_record_seq) */
  public    BigIntegerFilter[] InvoiceRecordSeq  = null;
  protected boolean InvoiceRecordSeqFetch = false;
  protected boolean InvoiceRecordSeqSortAscending = true;
  protected Integer InvoiceRecordSeqSort = null;
  /** raw field for: CDR_DATA.lob_id) */
  public    BigIntegerFilter[] LobId  = null;
  protected boolean LobIdFetch = false;
  protected boolean LobIdSortAscending = true;
  protected Integer LobIdSort = null;
  /** raw field for: CDR_DATA.transaction_id) */
  public    BigIntegerFilter[] TransactionId  = null;
  protected boolean TransactionIdFetch = false;
  protected boolean TransactionIdSortAscending = true;
  protected Integer TransactionIdSort = null;
  /** raw field for: USAGE_TYPES.guide_to) */
  public    IntegerFilter[] GuideTo  = null;
  protected boolean GuideToFetch = false;
  protected boolean GuideToSortAscending = true;
  protected Integer GuideToSort = null;
  /** raw field for: USAGE_TYPES.point_category) */
  public    IntegerFilter[] PointCategory  = null;
  protected boolean PointCategoryFetch = false;
  protected boolean PointCategorySortAscending = true;
  protected Integer PointCategorySort = null;
  /** raw field for: USAGE_TYPES.origin_country_dial_code_req) */
  public    IntegerFilter[] OriginCountryDialCodeReq  = null;
  protected boolean OriginCountryDialCodeReqFetch = false;
  protected boolean OriginCountryDialCodeReqSortAscending = true;
  protected Integer OriginCountryDialCodeReqSort = null;
  /** raw field for: USAGE_TYPES.tax_code_origin_req) */
  public    IntegerFilter[] TaxCodeOriginReq  = null;
  protected boolean TaxCodeOriginReqFetch = false;
  protected boolean TaxCodeOriginReqSortAscending = true;
  protected Integer TaxCodeOriginReqSort = null;
  /** raw field for: USAGE_TYPES.tax_code_target_req) */
  public    IntegerFilter[] TaxCodeTargetReq  = null;
  protected boolean TaxCodeTargetReqFetch = false;
  protected boolean TaxCodeTargetReqSortAscending = true;
  protected Integer TaxCodeTargetReqSort = null;
  /** raw field for: USAGE_TYPES.description_code) */
  public    IntegerFilter[] DescriptionCode  = null;
  protected boolean DescriptionCodeFetch = false;
  protected boolean DescriptionCodeSortAscending = true;
  protected Integer DescriptionCodeSort = null;
  /** raw field for: USAGE_TYPES.tax_class) */
  public    IntegerFilter[] TaxClass  = null;
  protected boolean TaxClassFetch = false;
  protected boolean TaxClassSortAscending = true;
  protected Integer TaxClassSort = null;
  /** raw field for: USAGE_TYPES.tax_location_usg) */
  public    IntegerFilter[] TaxLocationUsg  = null;
  protected boolean TaxLocationUsgFetch = false;
  protected boolean TaxLocationUsgSortAscending = true;
  protected Integer TaxLocationUsgSort = null;
  /** raw field for: USAGE_TYPES.tax_location_outcollect) */
  public    IntegerFilter[] TaxLocationOutcollect  = null;
  protected boolean TaxLocationOutcollectFetch = false;
  protected boolean TaxLocationOutcollectSortAscending = true;
  protected Integer TaxLocationOutcollectSort = null;
  /** raw field for: USAGE_TYPES.usg_class) */
  public    IntegerFilter[] UsgClass  = null;
  protected boolean UsgClassFetch = false;
  protected boolean UsgClassSortAscending = true;
  protected Integer UsgClassSort = null;
  /** raw field for: USAGE_TYPES.free_usg) */
  public    BooleanFilter[] FreeUsg  = null;
  protected boolean FreeUsgFetch = false;
  protected boolean FreeUsgSortAscending = true;
  protected Integer FreeUsgSort = null;
  /** raw field for: USAGE_TYPES.product_line_id) */
  public    IntegerFilter[] ProductLineId  = null;
  protected boolean ProductLineIdFetch = false;
  protected boolean ProductLineIdSortAscending = true;
  protected Integer ProductLineIdSort = null;
  /** raw field for: USAGE_TYPES.bill_aggr_level) */
  public    IntegerFilter[] BillAggrLevel  = null;
  protected boolean BillAggrLevelFetch = false;
  protected boolean BillAggrLevelSortAscending = true;
  protected Integer BillAggrLevelSort = null;
  /** raw field for: USAGE_TYPES.derive_jurisdiction) */
  public    IntegerFilter[] DeriveJurisdiction  = null;
  protected boolean DeriveJurisdictionFetch = false;
  protected boolean DeriveJurisdictionSortAscending = true;
  protected Integer DeriveJurisdictionSort = null;
  /** raw field for: USAGE_TYPES.units_indicator) */
  public    IntegerFilter[] UnitsIndicator  = null;
  protected boolean UnitsIndicatorFetch = false;
  protected boolean UnitsIndicatorSortAscending = true;
  protected Integer UnitsIndicatorSort = null;
  /** raw field for: USAGE_TYPES.ratable_unit_class) */
  public    IntegerFilter[] RatableUnitClass  = null;
  protected boolean RatableUnitClassFetch = false;
  protected boolean RatableUnitClassSortAscending = true;
  protected Integer RatableUnitClassSort = null;
  /** raw field for: USAGE_TYPES.duration_flag) */
  public    BooleanFilter[] DurationFlag  = null;
  protected boolean DurationFlagFetch = false;
  protected boolean DurationFlagSortAscending = true;
  protected Integer DurationFlagSort = null;
  /** raw field for: USAGE_TYPES.derive_distance_units) */
  public    IntegerFilter[] DeriveDistanceUnits  = null;
  protected boolean DeriveDistanceUnitsFetch = false;
  protected boolean DeriveDistanceUnitsSortAscending = true;
  protected Integer DeriveDistanceUnitsSort = null;
  /** raw field for: USAGE_TYPES.vh_minor_threshold) */
  public    IntegerFilter[] VhMinorThreshold  = null;
  protected boolean VhMinorThresholdFetch = false;
  protected boolean VhMinorThresholdSortAscending = true;
  protected Integer VhMinorThresholdSort = null;
  /** raw field for: USAGE_TYPES.distance_units_indicator) */
  public    IntegerFilter[] DistanceUnitsIndicator  = null;
  protected boolean DistanceUnitsIndicatorFetch = false;
  protected boolean DistanceUnitsIndicatorSortAscending = true;
  protected Integer DistanceUnitsIndicatorSort = null;
  /** raw field for: USAGE_TYPES.guide_to_provider) */
  public    IntegerFilter[] GuideToProvider  = null;
  protected boolean GuideToProviderFetch = false;
  protected boolean GuideToProviderSortAscending = true;
  protected Integer GuideToProviderSort = null;
  /** raw field for: USAGE_TYPES.is_prerated) */
  public    BooleanFilter[] IsPrerated  = null;
  protected boolean IsPreratedFetch = false;
  protected boolean IsPreratedSortAscending = true;
  protected Integer IsPreratedSort = null;
  /** raw field for: USAGE_TYPES.keep_running_total) */
  public    BooleanFilter[] KeepRunningTotal  = null;
  protected boolean KeepRunningTotalFetch = false;
  protected boolean KeepRunningTotalSortAscending = true;
  protected Integer KeepRunningTotalSort = null;
  /** raw field for: USAGE_TYPES.rounding_method) */
  public    IntegerFilter[] RoundingMethod  = null;
  protected boolean RoundingMethodFetch = false;
  protected boolean RoundingMethodSortAscending = true;
  protected Integer RoundingMethodSort = null;
  /** raw field for: USAGE_TYPES.raw_units_type) */
  public    IntegerFilter[] RawUnitsType  = null;
  protected boolean RawUnitsTypeFetch = false;
  protected boolean RawUnitsTypeSortAscending = true;
  protected Integer RawUnitsTypeSort = null;
  /** raw field for: USAGE_TYPES.use_rate_class) */
  public    IntegerFilter[] UseRateClass  = null;
  protected boolean UseRateClassFetch = false;
  protected boolean UseRateClassSortAscending = true;
  protected Integer UseRateClassSort = null;
  /** raw field for: USAGE_TYPES.use_bill_class) */
  public    IntegerFilter[] UseBillClass  = null;
  protected boolean UseBillClassFetch = false;
  protected boolean UseBillClassSortAscending = true;
  protected Integer UseBillClassSort = null;
  /** raw field for: USAGE_TYPES.use_jurisdiction) */
  public    IntegerFilter[] UseJurisdiction  = null;
  protected boolean UseJurisdictionFetch = false;
  protected boolean UseJurisdictionSortAscending = true;
  protected Integer UseJurisdictionSort = null;
  /** raw field for: USAGE_TYPES.use_point_class_origin) */
  public    IntegerFilter[] UsePointClassOrigin  = null;
  protected boolean UsePointClassOriginFetch = false;
  protected boolean UsePointClassOriginSortAscending = true;
  protected Integer UsePointClassOriginSort = null;
  /** raw field for: USAGE_TYPES.use_point_class_target) */
  public    IntegerFilter[] UsePointClassTarget  = null;
  protected boolean UsePointClassTargetFetch = false;
  protected boolean UsePointClassTargetSortAscending = true;
  protected Integer UsePointClassTargetSort = null;
  /** raw field for: USAGE_TYPES.use_provider_class) */
  public    IntegerFilter[] UseProviderClass  = null;
  protected boolean UseProviderClassFetch = false;
  protected boolean UseProviderClassSortAscending = true;
  protected Integer UseProviderClassSort = null;
  /** raw field for: USAGE_TYPES.use_rate_period) */
  public    IntegerFilter[] UseRatePeriod  = null;
  protected boolean UseRatePeriodFetch = false;
  protected boolean UseRatePeriodSortAscending = true;
  protected Integer UseRatePeriodSort = null;
  /** raw field for: USAGE_TYPES.use_element_id) */
  public    IntegerFilter[] UseElementId  = null;
  protected boolean UseElementIdFetch = false;
  protected boolean UseElementIdSortAscending = true;
  protected Integer UseElementIdSort = null;
  /** raw field for: USAGE_TYPES.use_equip_type_code) */
  public    IntegerFilter[] UseEquipTypeCode  = null;
  protected boolean UseEquipTypeCodeFetch = false;
  protected boolean UseEquipTypeCodeSortAscending = true;
  protected Integer UseEquipTypeCodeSort = null;
  /** raw field for: USAGE_TYPES.use_equip_class_code) */
  public    IntegerFilter[] UseEquipClassCode  = null;
  protected boolean UseEquipClassCodeFetch = false;
  protected boolean UseEquipClassCodeSortAscending = true;
  protected Integer UseEquipClassCodeSort = null;
  /** raw field for: USAGE_TYPES.use_class_of_service_code) */
  public    IntegerFilter[] UseClassOfServiceCode  = null;
  protected boolean UseClassOfServiceCodeFetch = false;
  protected boolean UseClassOfServiceCodeSortAscending = true;
  protected Integer UseClassOfServiceCodeSort = null;
  /** raw field for: USAGE_TYPES.use_distance_band_id) */
  public    IntegerFilter[] UseDistanceBandId  = null;
  protected boolean UseDistanceBandIdFetch = false;
  protected boolean UseDistanceBandIdSortAscending = true;
  protected Integer UseDistanceBandIdSort = null;
  /** raw field for: USAGE_TYPES.use_default_rate_type) */
  public    IntegerFilter[] UseDefaultRateType  = null;
  protected boolean UseDefaultRateTypeFetch = false;
  protected boolean UseDefaultRateTypeSortAscending = true;
  protected Integer UseDefaultRateTypeSort = null;
  /** raw field for: USAGE_TYPES.rate_currency_location) */
  public    IntegerFilter[] RateCurrencyLocation  = null;
  protected boolean RateCurrencyLocationFetch = false;
  protected boolean RateCurrencyLocationSortAscending = true;
  protected Integer RateCurrencyLocationSort = null;
  /** raw field for: USAGE_TYPES.rate_period_rounding) */
  public    IntegerFilter[] RatePeriodRounding  = null;
  protected boolean RatePeriodRoundingFetch = false;
  protected boolean RatePeriodRoundingSortAscending = true;
  protected Integer RatePeriodRoundingSort = null;
  /** raw field for: USAGE_TYPES.rate_minimum_duration) */
  public    IntegerFilter[] RateMinimumDuration  = null;
  protected boolean RateMinimumDurationFetch = false;
  protected boolean RateMinimumDurationSortAscending = true;
  protected Integer RateMinimumDurationSort = null;
  /** raw field for: USAGE_TYPES.use_component_id) */
  public    IntegerFilter[] UseComponentId  = null;
  protected boolean UseComponentIdFetch = false;
  protected boolean UseComponentIdSortAscending = true;
  protected Integer UseComponentIdSort = null;
  /** raw field for: USAGE_TYPES.min_billing_units) */
  public    BigIntegerFilter[] MinBillingUnits  = null;
  protected boolean MinBillingUnitsFetch = false;
  protected boolean MinBillingUnitsSortAscending = true;
  protected Integer MinBillingUnitsSort = null;
  /** raw field for: USAGE_TYPES.consolidate_usage) */
  public    BooleanFilter[] ConsolidateUsage  = null;
  protected boolean ConsolidateUsageFetch = false;
  protected boolean ConsolidateUsageSortAscending = true;
  protected Integer ConsolidateUsageSort = null;
  /** raw field for: USAGE_TYPES.network_delay) */
  public    IntegerFilter[] NetworkDelay  = null;
  protected boolean NetworkDelayFetch = false;
  protected boolean NetworkDelaySortAscending = true;
  protected Integer NetworkDelaySort = null;
  /** raw field for: USAGE_TYPES.rating_method) */
  public    IntegerFilter[] RatingMethod  = null;
  protected boolean RatingMethodFetch = false;
  protected boolean RatingMethodSortAscending = true;
  protected Integer RatingMethodSort = null;
  /** raw field for: USAGE_TYPES.use_zone_class) */
  public    IntegerFilter[] UseZoneClass  = null;
  protected boolean UseZoneClassFetch = false;
  protected boolean UseZoneClassSortAscending = true;
  protected Integer UseZoneClassSort = null;
  private String _objName = "UnbilledUsageObjectFilter";
  /** default constructor */
  public UnbilledUsageObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public UnbilledUsageObjectFilter (UnbilledUsageObjectFilter other)
  {
    if (other == null) return;
    this.Key = new UnbilledUsageObjectKeyFilter (other.Key);
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
    this.ServerId = other.ServerId;
    this.ServerIdFetch = other.ServerIdFetch;
    this.ServerIdSort = other.ServerIdSort;
    this.ServerIdSortAscending = other.ServerIdSortAscending;
    this.CdrDataPartitionKey = other.CdrDataPartitionKey;
    this.CdrDataPartitionKeyFetch = other.CdrDataPartitionKeyFetch;
    this.CdrDataPartitionKeySort = other.CdrDataPartitionKeySort;
    this.CdrDataPartitionKeySortAscending = other.CdrDataPartitionKeySortAscending;
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
    this.TypeIdUsg = other.TypeIdUsg;
    this.TypeIdUsgFetch = other.TypeIdUsgFetch;
    this.TypeIdUsgSort = other.TypeIdUsgSort;
    this.TypeIdUsgSortAscending = other.TypeIdUsgSortAscending;
    this.TransDt = other.TransDt;
    this.TransDtFetch = other.TransDtFetch;
    this.TransDtSort = other.TransDtSort;
    this.TransDtSortAscending = other.TransDtSortAscending;
    this.RateDt = other.RateDt;
    this.RateDtFetch = other.RateDtFetch;
    this.RateDtSort = other.RateDtSort;
    this.RateDtSortAscending = other.RateDtSortAscending;
    this.ExtTrackingId = other.ExtTrackingId;
    this.ExtTrackingIdFetch = other.ExtTrackingIdFetch;
    this.ExtTrackingIdSort = other.ExtTrackingIdSort;
    this.ExtTrackingIdCaseInsensitive = other.ExtTrackingIdCaseInsensitive;
    this.ExtTrackingIdSortAscending = other.ExtTrackingIdSortAscending;
    this.TransId = other.TransId;
    this.TransIdFetch = other.TransIdFetch;
    this.TransIdSort = other.TransIdSort;
    this.TransIdCaseInsensitive = other.TransIdCaseInsensitive;
    this.TransIdSortAscending = other.TransIdSortAscending;
    this.ElementId = other.ElementId;
    this.ElementIdFetch = other.ElementIdFetch;
    this.ElementIdSort = other.ElementIdSort;
    this.ElementIdSortAscending = other.ElementIdSortAscending;
    this.RateClass = other.RateClass;
    this.RateClassFetch = other.RateClassFetch;
    this.RateClassSort = other.RateClassSort;
    this.RateClassSortAscending = other.RateClassSortAscending;
    this.BillClass = other.BillClass;
    this.BillClassFetch = other.BillClassFetch;
    this.BillClassSort = other.BillClassSort;
    this.BillClassSortAscending = other.BillClassSortAscending;
    this.ProviderId = other.ProviderId;
    this.ProviderIdFetch = other.ProviderIdFetch;
    this.ProviderIdSort = other.ProviderIdSort;
    this.ProviderIdSortAscending = other.ProviderIdSortAscending;
    this.Jurisdiction = other.Jurisdiction;
    this.JurisdictionFetch = other.JurisdictionFetch;
    this.JurisdictionSort = other.JurisdictionSort;
    this.JurisdictionSortAscending = other.JurisdictionSortAscending;
    this.RateCurrencyCode = other.RateCurrencyCode;
    this.RateCurrencyCodeFetch = other.RateCurrencyCodeFetch;
    this.RateCurrencyCodeSort = other.RateCurrencyCodeSort;
    this.RateCurrencyCodeSortAscending = other.RateCurrencyCodeSortAscending;
    this.ExternalId = other.ExternalId;
    this.ExternalIdFetch = other.ExternalIdFetch;
    this.ExternalIdSort = other.ExternalIdSort;
    this.ExternalIdCaseInsensitive = other.ExternalIdCaseInsensitive;
    this.ExternalIdSortAscending = other.ExternalIdSortAscending;
    this.ExternalIdType = other.ExternalIdType;
    this.ExternalIdTypeFetch = other.ExternalIdTypeFetch;
    this.ExternalIdTypeSort = other.ExternalIdTypeSort;
    this.ExternalIdTypeSortAscending = other.ExternalIdTypeSortAscending;
    this.PointOrigin = other.PointOrigin;
    this.PointOriginFetch = other.PointOriginFetch;
    this.PointOriginSort = other.PointOriginSort;
    this.PointOriginCaseInsensitive = other.PointOriginCaseInsensitive;
    this.PointOriginSortAscending = other.PointOriginSortAscending;
    this.CountryCodeOrigin = other.CountryCodeOrigin;
    this.CountryCodeOriginFetch = other.CountryCodeOriginFetch;
    this.CountryCodeOriginSort = other.CountryCodeOriginSort;
    this.CountryCodeOriginSortAscending = other.CountryCodeOriginSortAscending;
    this.CountryDialCodeOrigin = other.CountryDialCodeOrigin;
    this.CountryDialCodeOriginFetch = other.CountryDialCodeOriginFetch;
    this.CountryDialCodeOriginSort = other.CountryDialCodeOriginSort;
    this.CountryDialCodeOriginCaseInsensitive = other.CountryDialCodeOriginCaseInsensitive;
    this.CountryDialCodeOriginSortAscending = other.CountryDialCodeOriginSortAscending;
    this.PointIdOrigin = other.PointIdOrigin;
    this.PointIdOriginFetch = other.PointIdOriginFetch;
    this.PointIdOriginSort = other.PointIdOriginSort;
    this.PointIdOriginSortAscending = other.PointIdOriginSortAscending;
    this.PointTaxCodeOrigin = other.PointTaxCodeOrigin;
    this.PointTaxCodeOriginFetch = other.PointTaxCodeOriginFetch;
    this.PointTaxCodeOriginSort = other.PointTaxCodeOriginSort;
    this.PointTaxCodeOriginCaseInsensitive = other.PointTaxCodeOriginCaseInsensitive;
    this.PointTaxCodeOriginSortAscending = other.PointTaxCodeOriginSortAscending;
    this.PointTaxCodeTypeOrigin = other.PointTaxCodeTypeOrigin;
    this.PointTaxCodeTypeOriginFetch = other.PointTaxCodeTypeOriginFetch;
    this.PointTaxCodeTypeOriginSort = other.PointTaxCodeTypeOriginSort;
    this.PointTaxCodeTypeOriginSortAscending = other.PointTaxCodeTypeOriginSortAscending;
    this.PointTarget = other.PointTarget;
    this.PointTargetFetch = other.PointTargetFetch;
    this.PointTargetSort = other.PointTargetSort;
    this.PointTargetCaseInsensitive = other.PointTargetCaseInsensitive;
    this.PointTargetSortAscending = other.PointTargetSortAscending;
    this.CountryCodeTarget = other.CountryCodeTarget;
    this.CountryCodeTargetFetch = other.CountryCodeTargetFetch;
    this.CountryCodeTargetSort = other.CountryCodeTargetSort;
    this.CountryCodeTargetSortAscending = other.CountryCodeTargetSortAscending;
    this.PointIdTarget = other.PointIdTarget;
    this.PointIdTargetFetch = other.PointIdTargetFetch;
    this.PointIdTargetSort = other.PointIdTargetSort;
    this.PointIdTargetSortAscending = other.PointIdTargetSortAscending;
    this.PointTaxCodeTarget = other.PointTaxCodeTarget;
    this.PointTaxCodeTargetFetch = other.PointTaxCodeTargetFetch;
    this.PointTaxCodeTargetSort = other.PointTaxCodeTargetSort;
    this.PointTaxCodeTargetCaseInsensitive = other.PointTaxCodeTargetCaseInsensitive;
    this.PointTaxCodeTargetSortAscending = other.PointTaxCodeTargetSortAscending;
    this.PointTaxCodeTypeTarget = other.PointTaxCodeTypeTarget;
    this.PointTaxCodeTypeTargetFetch = other.PointTaxCodeTypeTargetFetch;
    this.PointTaxCodeTypeTargetSort = other.PointTaxCodeTypeTargetSort;
    this.PointTaxCodeTypeTargetSortAscending = other.PointTaxCodeTypeTargetSortAscending;
    this.BaseAmt = other.BaseAmt;
    this.BaseAmtFetch = other.BaseAmtFetch;
    this.BaseAmtSort = other.BaseAmtSort;
    this.BaseAmtSortAscending = other.BaseAmtSortAscending;
    this.SecondDt = other.SecondDt;
    this.SecondDtFetch = other.SecondDtFetch;
    this.SecondDtSort = other.SecondDtSort;
    this.SecondDtSortAscending = other.SecondDtSortAscending;
    this.TaxRateActiveDt = other.TaxRateActiveDt;
    this.TaxRateActiveDtFetch = other.TaxRateActiveDtFetch;
    this.TaxRateActiveDtSort = other.TaxRateActiveDtSort;
    this.TaxRateActiveDtSortAscending = other.TaxRateActiveDtSortAscending;
    this.TaxRateInactiveDt = other.TaxRateInactiveDt;
    this.TaxRateInactiveDtFetch = other.TaxRateInactiveDtFetch;
    this.TaxRateInactiveDtSort = other.TaxRateInactiveDtSort;
    this.TaxRateInactiveDtSortAscending = other.TaxRateInactiveDtSortAscending;
    this.Timezone = other.Timezone;
    this.TimezoneFetch = other.TimezoneFetch;
    this.TimezoneSort = other.TimezoneSort;
    this.TimezoneSortAscending = other.TimezoneSortAscending;
    this.PrimaryUnits = other.PrimaryUnits;
    this.PrimaryUnitsFetch = other.PrimaryUnitsFetch;
    this.PrimaryUnitsSort = other.PrimaryUnitsSort;
    this.PrimaryUnitsSortAscending = other.PrimaryUnitsSortAscending;
    this.SecondUnits = other.SecondUnits;
    this.SecondUnitsFetch = other.SecondUnitsFetch;
    this.SecondUnitsSort = other.SecondUnitsSort;
    this.SecondUnitsSortAscending = other.SecondUnitsSortAscending;
    this.ThirdUnits = other.ThirdUnits;
    this.ThirdUnitsFetch = other.ThirdUnitsFetch;
    this.ThirdUnitsSort = other.ThirdUnitsSort;
    this.ThirdUnitsSortAscending = other.ThirdUnitsSortAscending;
    this.UnitsCurrencyCode = other.UnitsCurrencyCode;
    this.UnitsCurrencyCodeFetch = other.UnitsCurrencyCodeFetch;
    this.UnitsCurrencyCodeSort = other.UnitsCurrencyCodeSort;
    this.UnitsCurrencyCodeSortAscending = other.UnitsCurrencyCodeSortAscending;
    this.BillingUnitsType = other.BillingUnitsType;
    this.BillingUnitsTypeFetch = other.BillingUnitsTypeFetch;
    this.BillingUnitsTypeSort = other.BillingUnitsTypeSort;
    this.BillingUnitsTypeSortAscending = other.BillingUnitsTypeSortAscending;
    this.ProfileId = other.ProfileId;
    this.ProfileIdFetch = other.ProfileIdFetch;
    this.ProfileIdSort = other.ProfileIdSort;
    this.ProfileIdSortAscending = other.ProfileIdSortAscending;
    this.Annotation = other.Annotation;
    this.AnnotationFetch = other.AnnotationFetch;
    this.AnnotationSort = other.AnnotationSort;
    this.AnnotationCaseInsensitive = other.AnnotationCaseInsensitive;
    this.AnnotationSortAscending = other.AnnotationSortAscending;
    this.CustomerTag = other.CustomerTag;
    this.CustomerTagFetch = other.CustomerTagFetch;
    this.CustomerTagSort = other.CustomerTagSort;
    this.CustomerTagCaseInsensitive = other.CustomerTagCaseInsensitive;
    this.CustomerTagSortAscending = other.CustomerTagSortAscending;
    this.RatedUnits = other.RatedUnits;
    this.RatedUnitsFetch = other.RatedUnitsFetch;
    this.RatedUnitsSort = other.RatedUnitsSort;
    this.RatedUnitsSortAscending = other.RatedUnitsSortAscending;
    this.Amount = other.Amount;
    this.AmountFetch = other.AmountFetch;
    this.AmountSort = other.AmountSort;
    this.AmountSortAscending = other.AmountSortAscending;
    this.ForeignAmount = other.ForeignAmount;
    this.ForeignAmountFetch = other.ForeignAmountFetch;
    this.ForeignAmountSort = other.ForeignAmountSort;
    this.ForeignAmountSortAscending = other.ForeignAmountSortAscending;
    this.RatePeriod = other.RatePeriod;
    this.RatePeriodFetch = other.RatePeriodFetch;
    this.RatePeriodSort = other.RatePeriodSort;
    this.RatePeriodCaseInsensitive = other.RatePeriodCaseInsensitive;
    this.RatePeriodSortAscending = other.RatePeriodSortAscending;
    this.NoBill = other.NoBill;
    this.NoBillFetch = other.NoBillFetch;
    this.NoBillSort = other.NoBillSort;
    this.NoBillSortAscending = other.NoBillSortAscending;
    this.CompStatus = other.CompStatus;
    this.CompStatusFetch = other.CompStatusFetch;
    this.CompStatusSort = other.CompStatusSort;
    this.CompStatusSortAscending = other.CompStatusSortAscending;
    this.CdrStatus = other.CdrStatus;
    this.CdrStatusFetch = other.CdrStatusFetch;
    this.CdrStatusSort = other.CdrStatusSort;
    this.CdrStatusSortAscending = other.CdrStatusSortAscending;
    this.FileId = other.FileId;
    this.FileIdFetch = other.FileIdFetch;
    this.FileIdSort = other.FileIdSort;
    this.FileIdSortAscending = other.FileIdSortAscending;
    this.FileIdServ = other.FileIdServ;
    this.FileIdServFetch = other.FileIdServFetch;
    this.FileIdServSort = other.FileIdServSort;
    this.FileIdServSortAscending = other.FileIdServSortAscending;
    this.RevRcvCostCtr = other.RevRcvCostCtr;
    this.RevRcvCostCtrFetch = other.RevRcvCostCtrFetch;
    this.RevRcvCostCtrSort = other.RevRcvCostCtrSort;
    this.RevRcvCostCtrSortAscending = other.RevRcvCostCtrSortAscending;
    this.ArchFlag = other.ArchFlag;
    this.ArchFlagFetch = other.ArchFlagFetch;
    this.ArchFlagSort = other.ArchFlagSort;
    this.ArchFlagSortAscending = other.ArchFlagSortAscending;
    this.UnroundedAmount = other.UnroundedAmount;
    this.UnroundedAmountFetch = other.UnroundedAmountFetch;
    this.UnroundedAmountSort = other.UnroundedAmountSort;
    this.UnroundedAmountSortAscending = other.UnroundedAmountSortAscending;
    this.CorridorPlanId = other.CorridorPlanId;
    this.CorridorPlanIdFetch = other.CorridorPlanIdFetch;
    this.CorridorPlanIdSort = other.CorridorPlanIdSort;
    this.CorridorPlanIdSortAscending = other.CorridorPlanIdSortAscending;
    this.CellIdOrigin = other.CellIdOrigin;
    this.CellIdOriginFetch = other.CellIdOriginFetch;
    this.CellIdOriginSort = other.CellIdOriginSort;
    this.CellIdOriginSortAscending = other.CellIdOriginSortAscending;
    this.OrigTypeIdUsg = other.OrigTypeIdUsg;
    this.OrigTypeIdUsgFetch = other.OrigTypeIdUsgFetch;
    this.OrigTypeIdUsgSort = other.OrigTypeIdUsgSort;
    this.OrigTypeIdUsgSortAscending = other.OrigTypeIdUsgSortAscending;
    this.AccessRegionOrigin = other.AccessRegionOrigin;
    this.AccessRegionOriginFetch = other.AccessRegionOriginFetch;
    this.AccessRegionOriginSort = other.AccessRegionOriginSort;
    this.AccessRegionOriginCaseInsensitive = other.AccessRegionOriginCaseInsensitive;
    this.AccessRegionOriginSortAscending = other.AccessRegionOriginSortAscending;
    this.AccessRegionTarget = other.AccessRegionTarget;
    this.AccessRegionTargetFetch = other.AccessRegionTargetFetch;
    this.AccessRegionTargetSort = other.AccessRegionTargetSort;
    this.AccessRegionTargetCaseInsensitive = other.AccessRegionTargetCaseInsensitive;
    this.AccessRegionTargetSortAscending = other.AccessRegionTargetSortAscending;
    this.OpenItemId = other.OpenItemId;
    this.OpenItemIdFetch = other.OpenItemIdFetch;
    this.OpenItemIdSort = other.OpenItemIdSort;
    this.OpenItemIdSortAscending = other.OpenItemIdSortAscending;
    this.NumRecords = other.NumRecords;
    this.NumRecordsFetch = other.NumRecordsFetch;
    this.NumRecordsSort = other.NumRecordsSort;
    this.NumRecordsSortAscending = other.NumRecordsSortAscending;
    this.AmountReduction = other.AmountReduction;
    this.AmountReductionFetch = other.AmountReductionFetch;
    this.AmountReductionSort = other.AmountReductionSort;
    this.AmountReductionSortAscending = other.AmountReductionSortAscending;
    this.AmountReductionId = other.AmountReductionId;
    this.AmountReductionIdFetch = other.AmountReductionIdFetch;
    this.AmountReductionIdSort = other.AmountReductionIdSort;
    this.AmountReductionIdSortAscending = other.AmountReductionIdSortAscending;
    this.SeqnumRateUsage = other.SeqnumRateUsage;
    this.SeqnumRateUsageFetch = other.SeqnumRateUsageFetch;
    this.SeqnumRateUsageSort = other.SeqnumRateUsageSort;
    this.SeqnumRateUsageSortAscending = other.SeqnumRateUsageSortAscending;
    this.SeqnumRateUsageOverrides = other.SeqnumRateUsageOverrides;
    this.SeqnumRateUsageOverridesFetch = other.SeqnumRateUsageOverridesFetch;
    this.SeqnumRateUsageOverridesSort = other.SeqnumRateUsageOverridesSort;
    this.SeqnumRateUsageOverridesSortAscending = other.SeqnumRateUsageOverridesSortAscending;
    this.RawUnits = other.RawUnits;
    this.RawUnitsFetch = other.RawUnitsFetch;
    this.RawUnitsSort = other.RawUnitsSort;
    this.RawUnitsSortAscending = other.RawUnitsSortAscending;
    this.RawUnitsRounded = other.RawUnitsRounded;
    this.RawUnitsRoundedFetch = other.RawUnitsRoundedFetch;
    this.RawUnitsRoundedSort = other.RawUnitsRoundedSort;
    this.RawUnitsRoundedSortAscending = other.RawUnitsRoundedSortAscending;
    this.AggrUsageId = other.AggrUsageId;
    this.AggrUsageIdFetch = other.AggrUsageIdFetch;
    this.AggrUsageIdSort = other.AggrUsageIdSort;
    this.AggrUsageIdSortAscending = other.AggrUsageIdSortAscending;
    this.ZoneClass = other.ZoneClass;
    this.ZoneClassFetch = other.ZoneClassFetch;
    this.ZoneClassSort = other.ZoneClassSort;
    this.ZoneClassSortAscending = other.ZoneClassSortAscending;
    this.PointClassOrigin = other.PointClassOrigin;
    this.PointClassOriginFetch = other.PointClassOriginFetch;
    this.PointClassOriginSort = other.PointClassOriginSort;
    this.PointClassOriginSortAscending = other.PointClassOriginSortAscending;
    this.PointClassTarget = other.PointClassTarget;
    this.PointClassTargetFetch = other.PointClassTargetFetch;
    this.PointClassTargetSort = other.PointClassTargetSort;
    this.PointClassTargetSortAscending = other.PointClassTargetSortAscending;
    this.EquipClassCode = other.EquipClassCode;
    this.EquipClassCodeFetch = other.EquipClassCodeFetch;
    this.EquipClassCodeSort = other.EquipClassCodeSort;
    this.EquipClassCodeSortAscending = other.EquipClassCodeSortAscending;
    this.ComponentId = other.ComponentId;
    this.ComponentIdFetch = other.ComponentIdFetch;
    this.ComponentIdSort = other.ComponentIdSort;
    this.ComponentIdSortAscending = other.ComponentIdSortAscending;
    this.TaxPkgCount = other.TaxPkgCount;
    this.TaxPkgCountFetch = other.TaxPkgCountFetch;
    this.TaxPkgCountSort = other.TaxPkgCountSort;
    this.TaxPkgCountSortAscending = other.TaxPkgCountSortAscending;
    this.Geocode = other.Geocode;
    this.GeocodeFetch = other.GeocodeFetch;
    this.GeocodeSort = other.GeocodeSort;
    this.GeocodeCaseInsensitive = other.GeocodeCaseInsensitive;
    this.GeocodeSortAscending = other.GeocodeSortAscending;
    this.AddImpliedDecimal = other.AddImpliedDecimal;
    this.AddImpliedDecimalFetch = other.AddImpliedDecimalFetch;
    this.AddImpliedDecimalSort = other.AddImpliedDecimalSort;
    this.AddImpliedDecimalSortAscending = other.AddImpliedDecimalSortAscending;
    this.ReratedDt = other.ReratedDt;
    this.ReratedDtFetch = other.ReratedDtFetch;
    this.ReratedDtSort = other.ReratedDtSort;
    this.ReratedDtSortAscending = other.ReratedDtSortAscending;
    this.ExternalInvoiceId = other.ExternalInvoiceId;
    this.ExternalInvoiceIdFetch = other.ExternalInvoiceIdFetch;
    this.ExternalInvoiceIdSort = other.ExternalInvoiceIdSort;
    this.ExternalInvoiceIdSortAscending = other.ExternalInvoiceIdSortAscending;
    this.InvoiceRecordSeq = other.InvoiceRecordSeq;
    this.InvoiceRecordSeqFetch = other.InvoiceRecordSeqFetch;
    this.InvoiceRecordSeqSort = other.InvoiceRecordSeqSort;
    this.InvoiceRecordSeqSortAscending = other.InvoiceRecordSeqSortAscending;
    this.LobId = other.LobId;
    this.LobIdFetch = other.LobIdFetch;
    this.LobIdSort = other.LobIdSort;
    this.LobIdSortAscending = other.LobIdSortAscending;
    this.TransactionId = other.TransactionId;
    this.TransactionIdFetch = other.TransactionIdFetch;
    this.TransactionIdSort = other.TransactionIdSort;
    this.TransactionIdSortAscending = other.TransactionIdSortAscending;
    this.GuideTo = other.GuideTo;
    this.GuideToFetch = other.GuideToFetch;
    this.GuideToSort = other.GuideToSort;
    this.GuideToSortAscending = other.GuideToSortAscending;
    this.PointCategory = other.PointCategory;
    this.PointCategoryFetch = other.PointCategoryFetch;
    this.PointCategorySort = other.PointCategorySort;
    this.PointCategorySortAscending = other.PointCategorySortAscending;
    this.OriginCountryDialCodeReq = other.OriginCountryDialCodeReq;
    this.OriginCountryDialCodeReqFetch = other.OriginCountryDialCodeReqFetch;
    this.OriginCountryDialCodeReqSort = other.OriginCountryDialCodeReqSort;
    this.OriginCountryDialCodeReqSortAscending = other.OriginCountryDialCodeReqSortAscending;
    this.TaxCodeOriginReq = other.TaxCodeOriginReq;
    this.TaxCodeOriginReqFetch = other.TaxCodeOriginReqFetch;
    this.TaxCodeOriginReqSort = other.TaxCodeOriginReqSort;
    this.TaxCodeOriginReqSortAscending = other.TaxCodeOriginReqSortAscending;
    this.TaxCodeTargetReq = other.TaxCodeTargetReq;
    this.TaxCodeTargetReqFetch = other.TaxCodeTargetReqFetch;
    this.TaxCodeTargetReqSort = other.TaxCodeTargetReqSort;
    this.TaxCodeTargetReqSortAscending = other.TaxCodeTargetReqSortAscending;
    this.DescriptionCode = other.DescriptionCode;
    this.DescriptionCodeFetch = other.DescriptionCodeFetch;
    this.DescriptionCodeSort = other.DescriptionCodeSort;
    this.DescriptionCodeSortAscending = other.DescriptionCodeSortAscending;
    this.TaxClass = other.TaxClass;
    this.TaxClassFetch = other.TaxClassFetch;
    this.TaxClassSort = other.TaxClassSort;
    this.TaxClassSortAscending = other.TaxClassSortAscending;
    this.TaxLocationUsg = other.TaxLocationUsg;
    this.TaxLocationUsgFetch = other.TaxLocationUsgFetch;
    this.TaxLocationUsgSort = other.TaxLocationUsgSort;
    this.TaxLocationUsgSortAscending = other.TaxLocationUsgSortAscending;
    this.TaxLocationOutcollect = other.TaxLocationOutcollect;
    this.TaxLocationOutcollectFetch = other.TaxLocationOutcollectFetch;
    this.TaxLocationOutcollectSort = other.TaxLocationOutcollectSort;
    this.TaxLocationOutcollectSortAscending = other.TaxLocationOutcollectSortAscending;
    this.UsgClass = other.UsgClass;
    this.UsgClassFetch = other.UsgClassFetch;
    this.UsgClassSort = other.UsgClassSort;
    this.UsgClassSortAscending = other.UsgClassSortAscending;
    this.FreeUsg = other.FreeUsg;
    this.FreeUsgFetch = other.FreeUsgFetch;
    this.FreeUsgSort = other.FreeUsgSort;
    this.FreeUsgSortAscending = other.FreeUsgSortAscending;
    this.ProductLineId = other.ProductLineId;
    this.ProductLineIdFetch = other.ProductLineIdFetch;
    this.ProductLineIdSort = other.ProductLineIdSort;
    this.ProductLineIdSortAscending = other.ProductLineIdSortAscending;
    this.BillAggrLevel = other.BillAggrLevel;
    this.BillAggrLevelFetch = other.BillAggrLevelFetch;
    this.BillAggrLevelSort = other.BillAggrLevelSort;
    this.BillAggrLevelSortAscending = other.BillAggrLevelSortAscending;
    this.DeriveJurisdiction = other.DeriveJurisdiction;
    this.DeriveJurisdictionFetch = other.DeriveJurisdictionFetch;
    this.DeriveJurisdictionSort = other.DeriveJurisdictionSort;
    this.DeriveJurisdictionSortAscending = other.DeriveJurisdictionSortAscending;
    this.UnitsIndicator = other.UnitsIndicator;
    this.UnitsIndicatorFetch = other.UnitsIndicatorFetch;
    this.UnitsIndicatorSort = other.UnitsIndicatorSort;
    this.UnitsIndicatorSortAscending = other.UnitsIndicatorSortAscending;
    this.RatableUnitClass = other.RatableUnitClass;
    this.RatableUnitClassFetch = other.RatableUnitClassFetch;
    this.RatableUnitClassSort = other.RatableUnitClassSort;
    this.RatableUnitClassSortAscending = other.RatableUnitClassSortAscending;
    this.DurationFlag = other.DurationFlag;
    this.DurationFlagFetch = other.DurationFlagFetch;
    this.DurationFlagSort = other.DurationFlagSort;
    this.DurationFlagSortAscending = other.DurationFlagSortAscending;
    this.DeriveDistanceUnits = other.DeriveDistanceUnits;
    this.DeriveDistanceUnitsFetch = other.DeriveDistanceUnitsFetch;
    this.DeriveDistanceUnitsSort = other.DeriveDistanceUnitsSort;
    this.DeriveDistanceUnitsSortAscending = other.DeriveDistanceUnitsSortAscending;
    this.VhMinorThreshold = other.VhMinorThreshold;
    this.VhMinorThresholdFetch = other.VhMinorThresholdFetch;
    this.VhMinorThresholdSort = other.VhMinorThresholdSort;
    this.VhMinorThresholdSortAscending = other.VhMinorThresholdSortAscending;
    this.DistanceUnitsIndicator = other.DistanceUnitsIndicator;
    this.DistanceUnitsIndicatorFetch = other.DistanceUnitsIndicatorFetch;
    this.DistanceUnitsIndicatorSort = other.DistanceUnitsIndicatorSort;
    this.DistanceUnitsIndicatorSortAscending = other.DistanceUnitsIndicatorSortAscending;
    this.GuideToProvider = other.GuideToProvider;
    this.GuideToProviderFetch = other.GuideToProviderFetch;
    this.GuideToProviderSort = other.GuideToProviderSort;
    this.GuideToProviderSortAscending = other.GuideToProviderSortAscending;
    this.IsPrerated = other.IsPrerated;
    this.IsPreratedFetch = other.IsPreratedFetch;
    this.IsPreratedSort = other.IsPreratedSort;
    this.IsPreratedSortAscending = other.IsPreratedSortAscending;
    this.KeepRunningTotal = other.KeepRunningTotal;
    this.KeepRunningTotalFetch = other.KeepRunningTotalFetch;
    this.KeepRunningTotalSort = other.KeepRunningTotalSort;
    this.KeepRunningTotalSortAscending = other.KeepRunningTotalSortAscending;
    this.RoundingMethod = other.RoundingMethod;
    this.RoundingMethodFetch = other.RoundingMethodFetch;
    this.RoundingMethodSort = other.RoundingMethodSort;
    this.RoundingMethodSortAscending = other.RoundingMethodSortAscending;
    this.RawUnitsType = other.RawUnitsType;
    this.RawUnitsTypeFetch = other.RawUnitsTypeFetch;
    this.RawUnitsTypeSort = other.RawUnitsTypeSort;
    this.RawUnitsTypeSortAscending = other.RawUnitsTypeSortAscending;
    this.UseRateClass = other.UseRateClass;
    this.UseRateClassFetch = other.UseRateClassFetch;
    this.UseRateClassSort = other.UseRateClassSort;
    this.UseRateClassSortAscending = other.UseRateClassSortAscending;
    this.UseBillClass = other.UseBillClass;
    this.UseBillClassFetch = other.UseBillClassFetch;
    this.UseBillClassSort = other.UseBillClassSort;
    this.UseBillClassSortAscending = other.UseBillClassSortAscending;
    this.UseJurisdiction = other.UseJurisdiction;
    this.UseJurisdictionFetch = other.UseJurisdictionFetch;
    this.UseJurisdictionSort = other.UseJurisdictionSort;
    this.UseJurisdictionSortAscending = other.UseJurisdictionSortAscending;
    this.UsePointClassOrigin = other.UsePointClassOrigin;
    this.UsePointClassOriginFetch = other.UsePointClassOriginFetch;
    this.UsePointClassOriginSort = other.UsePointClassOriginSort;
    this.UsePointClassOriginSortAscending = other.UsePointClassOriginSortAscending;
    this.UsePointClassTarget = other.UsePointClassTarget;
    this.UsePointClassTargetFetch = other.UsePointClassTargetFetch;
    this.UsePointClassTargetSort = other.UsePointClassTargetSort;
    this.UsePointClassTargetSortAscending = other.UsePointClassTargetSortAscending;
    this.UseProviderClass = other.UseProviderClass;
    this.UseProviderClassFetch = other.UseProviderClassFetch;
    this.UseProviderClassSort = other.UseProviderClassSort;
    this.UseProviderClassSortAscending = other.UseProviderClassSortAscending;
    this.UseRatePeriod = other.UseRatePeriod;
    this.UseRatePeriodFetch = other.UseRatePeriodFetch;
    this.UseRatePeriodSort = other.UseRatePeriodSort;
    this.UseRatePeriodSortAscending = other.UseRatePeriodSortAscending;
    this.UseElementId = other.UseElementId;
    this.UseElementIdFetch = other.UseElementIdFetch;
    this.UseElementIdSort = other.UseElementIdSort;
    this.UseElementIdSortAscending = other.UseElementIdSortAscending;
    this.UseEquipTypeCode = other.UseEquipTypeCode;
    this.UseEquipTypeCodeFetch = other.UseEquipTypeCodeFetch;
    this.UseEquipTypeCodeSort = other.UseEquipTypeCodeSort;
    this.UseEquipTypeCodeSortAscending = other.UseEquipTypeCodeSortAscending;
    this.UseEquipClassCode = other.UseEquipClassCode;
    this.UseEquipClassCodeFetch = other.UseEquipClassCodeFetch;
    this.UseEquipClassCodeSort = other.UseEquipClassCodeSort;
    this.UseEquipClassCodeSortAscending = other.UseEquipClassCodeSortAscending;
    this.UseClassOfServiceCode = other.UseClassOfServiceCode;
    this.UseClassOfServiceCodeFetch = other.UseClassOfServiceCodeFetch;
    this.UseClassOfServiceCodeSort = other.UseClassOfServiceCodeSort;
    this.UseClassOfServiceCodeSortAscending = other.UseClassOfServiceCodeSortAscending;
    this.UseDistanceBandId = other.UseDistanceBandId;
    this.UseDistanceBandIdFetch = other.UseDistanceBandIdFetch;
    this.UseDistanceBandIdSort = other.UseDistanceBandIdSort;
    this.UseDistanceBandIdSortAscending = other.UseDistanceBandIdSortAscending;
    this.UseDefaultRateType = other.UseDefaultRateType;
    this.UseDefaultRateTypeFetch = other.UseDefaultRateTypeFetch;
    this.UseDefaultRateTypeSort = other.UseDefaultRateTypeSort;
    this.UseDefaultRateTypeSortAscending = other.UseDefaultRateTypeSortAscending;
    this.RateCurrencyLocation = other.RateCurrencyLocation;
    this.RateCurrencyLocationFetch = other.RateCurrencyLocationFetch;
    this.RateCurrencyLocationSort = other.RateCurrencyLocationSort;
    this.RateCurrencyLocationSortAscending = other.RateCurrencyLocationSortAscending;
    this.RatePeriodRounding = other.RatePeriodRounding;
    this.RatePeriodRoundingFetch = other.RatePeriodRoundingFetch;
    this.RatePeriodRoundingSort = other.RatePeriodRoundingSort;
    this.RatePeriodRoundingSortAscending = other.RatePeriodRoundingSortAscending;
    this.RateMinimumDuration = other.RateMinimumDuration;
    this.RateMinimumDurationFetch = other.RateMinimumDurationFetch;
    this.RateMinimumDurationSort = other.RateMinimumDurationSort;
    this.RateMinimumDurationSortAscending = other.RateMinimumDurationSortAscending;
    this.UseComponentId = other.UseComponentId;
    this.UseComponentIdFetch = other.UseComponentIdFetch;
    this.UseComponentIdSort = other.UseComponentIdSort;
    this.UseComponentIdSortAscending = other.UseComponentIdSortAscending;
    this.MinBillingUnits = other.MinBillingUnits;
    this.MinBillingUnitsFetch = other.MinBillingUnitsFetch;
    this.MinBillingUnitsSort = other.MinBillingUnitsSort;
    this.MinBillingUnitsSortAscending = other.MinBillingUnitsSortAscending;
    this.ConsolidateUsage = other.ConsolidateUsage;
    this.ConsolidateUsageFetch = other.ConsolidateUsageFetch;
    this.ConsolidateUsageSort = other.ConsolidateUsageSort;
    this.ConsolidateUsageSortAscending = other.ConsolidateUsageSortAscending;
    this.NetworkDelay = other.NetworkDelay;
    this.NetworkDelayFetch = other.NetworkDelayFetch;
    this.NetworkDelaySort = other.NetworkDelaySort;
    this.NetworkDelaySortAscending = other.NetworkDelaySortAscending;
    this.RatingMethod = other.RatingMethod;
    this.RatingMethodFetch = other.RatingMethodFetch;
    this.RatingMethodSort = other.RatingMethodSort;
    this.RatingMethodSortAscending = other.RatingMethodSortAscending;
    this.UseZoneClass = other.UseZoneClass;
    this.UseZoneClassFetch = other.UseZoneClassFetch;
    this.UseZoneClassSort = other.UseZoneClassSort;
    this.UseZoneClassSortAscending = other.UseZoneClassSortAscending;  }
  /** get the filter for this object's key
   * @return UnbilledUsageObjectKeyFilter
   */
  public UnbilledUsageObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (UnbilledUsageObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: MsgId (CDR_DATA.msg_id)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new UnbilledUsageObjectKeyFilter ();
    this.Key.MsgIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgId (CDR_DATA.msg_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.MsgIdFetch;
  }
  /** Set the SortOrder for field: MsgId (CDR_DATA.msg_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new UnbilledUsageObjectKeyFilter ();
    this.Key.MsgIdSort = value;
  }
  /** Retrieve SortOrder for field: MsgId (CDR_DATA.msg_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.MsgIdSort;
  }
  /** Set the sort direction for field: MsgId (CDR_DATA.msg_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new UnbilledUsageObjectKeyFilter ();
    this.Key.MsgIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgId (CDR_DATA.msg_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.MsgIdSortAscending;
  }
  /** Set the field level filters for field: MsgId (CDR_DATA.msg_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new UnbilledUsageObjectKeyFilter ();
    this.Key.MsgId = value;
  }
  /** Retrieve filter for field: MsgId (CDR_DATA.msg_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.MsgId;
  }
  /** Set the field level Fetch value for field: MsgId2 (CDR_DATA.msg_id2)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgId2Fetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new UnbilledUsageObjectKeyFilter ();
    this.Key.MsgId2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgId2 (CDR_DATA.msg_id2)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgId2Fetch ()
  {
    if (this.Key == null) return true;
    return this.Key.MsgId2Fetch;
  }
  /** Set the SortOrder for field: MsgId2 (CDR_DATA.msg_id2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgId2SortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new UnbilledUsageObjectKeyFilter ();
    this.Key.MsgId2Sort = value;
  }
  /** Retrieve SortOrder for field: MsgId2 (CDR_DATA.msg_id2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgId2SortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.MsgId2Sort;
  }
  /** Set the sort direction for field: MsgId2 (CDR_DATA.msg_id2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgId2SortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new UnbilledUsageObjectKeyFilter ();
    this.Key.MsgId2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgId2 (CDR_DATA.msg_id2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgId2SortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.MsgId2SortAscending;
  }
  /** Set the field level filters for field: MsgId2 (CDR_DATA.msg_id2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgId2Filter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new UnbilledUsageObjectKeyFilter ();
    this.Key.MsgId2 = value;
  }
  /** Retrieve filter for field: MsgId2 (CDR_DATA.msg_id2)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgId2Filter ()
  {
    if (this.Key == null) return null;
    return this.Key.MsgId2;
  }
  /** Set the field level Fetch value for field: MsgIdServ (CDR_DATA.msg_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new UnbilledUsageObjectKeyFilter ();
    this.Key.MsgIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgIdServ (CDR_DATA.msg_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.MsgIdServFetch;
  }
  /** Set the SortOrder for field: MsgIdServ (CDR_DATA.msg_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new UnbilledUsageObjectKeyFilter ();
    this.Key.MsgIdServSort = value;
  }
  /** Retrieve SortOrder for field: MsgIdServ (CDR_DATA.msg_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.MsgIdServSort;
  }
  /** Set the sort direction for field: MsgIdServ (CDR_DATA.msg_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new UnbilledUsageObjectKeyFilter ();
    this.Key.MsgIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgIdServ (CDR_DATA.msg_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.MsgIdServSortAscending;
  }
  /** Set the field level filters for field: MsgIdServ (CDR_DATA.msg_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new UnbilledUsageObjectKeyFilter ();
    this.Key.MsgIdServ = value;
  }
  /** Retrieve filter for field: MsgIdServ (CDR_DATA.msg_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.MsgIdServ;
  }
  /** Set the field level Fetch value for field: SplitRowNum (CDR_DATA.split_row_num)
   * @param fetch whether to fetch this field or not
   */
  public void setSplitRowNumFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new UnbilledUsageObjectKeyFilter ();
    this.Key.SplitRowNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: SplitRowNum (CDR_DATA.split_row_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getSplitRowNumFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.SplitRowNumFetch;
  }
  /** Set the SortOrder for field: SplitRowNum (CDR_DATA.split_row_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSplitRowNumSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new UnbilledUsageObjectKeyFilter ();
    this.Key.SplitRowNumSort = value;
  }
  /** Retrieve SortOrder for field: SplitRowNum (CDR_DATA.split_row_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSplitRowNumSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.SplitRowNumSort;
  }
  /** Set the sort direction for field: SplitRowNum (CDR_DATA.split_row_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSplitRowNumSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new UnbilledUsageObjectKeyFilter ();
    this.Key.SplitRowNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SplitRowNum (CDR_DATA.split_row_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSplitRowNumSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.SplitRowNumSortAscending;
  }
  /** Set the field level filters for field: SplitRowNum (CDR_DATA.split_row_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSplitRowNumFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new UnbilledUsageObjectKeyFilter ();
    this.Key.SplitRowNum = value;
  }
  /** Retrieve filter for field: SplitRowNum (CDR_DATA.split_row_num)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSplitRowNumFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.SplitRowNum;
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
  /** Set the field level Fetch value for field: CdrDataPartitionKey (CDR_UNBILLED.cdr_data_partition_key)
   * @param fetch whether to fetch this field or not
   */
  public void setCdrDataPartitionKeyFetch (boolean fetch) {
    this.CdrDataPartitionKeyFetch = fetch;
  }
  /** Retrieve Fetch value for field: CdrDataPartitionKey (CDR_UNBILLED.cdr_data_partition_key)
   * @return boolean the Fetch value for this field
   */
  public boolean getCdrDataPartitionKeyFetch () {
    return this.CdrDataPartitionKeyFetch;
  }
  /** Set the SortOrder for field: CdrDataPartitionKey (CDR_UNBILLED.cdr_data_partition_key)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCdrDataPartitionKeySortOrder (Integer value) {
    this.CdrDataPartitionKeySort = value;
  }
  /** Retrieve SortOrder for field: CdrDataPartitionKey (CDR_UNBILLED.cdr_data_partition_key)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCdrDataPartitionKeySortOrder () {
    return this.CdrDataPartitionKeySort;
  }
  /** Set the sort direction for field: CdrDataPartitionKey (CDR_UNBILLED.cdr_data_partition_key)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCdrDataPartitionKeySortDirection (boolean ascending) {
    this.CdrDataPartitionKeySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CdrDataPartitionKey (CDR_UNBILLED.cdr_data_partition_key)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCdrDataPartitionKeySortDirection () {
    return this.CdrDataPartitionKeySortAscending;
  }
  /** Set the field level filters for field: CdrDataPartitionKey (CDR_UNBILLED.cdr_data_partition_key)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCdrDataPartitionKeyFilter (DateFilter[] value) throws ServiceException {
    this.CdrDataPartitionKey = value;
  }
  /** Retrieve filter for field: CdrDataPartitionKey (CDR_UNBILLED.cdr_data_partition_key)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getCdrDataPartitionKeyFilter () {
    return this.CdrDataPartitionKey;
  }

  /**
   * Retrieves the CdrDataPartitionKeyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CdrDataPartitionKeyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CdrDataPartitionKeyFilter field
   */
  public String[] getCdrDataPartitionKeyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCdrDataPartitionKeyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCdrDataPartitionKeyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCdrDataPartitionKeyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CdrDataPartitionKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCdrDataPartitionKeyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CdrDataPartitionKeyFilter filter value from a formatted string
   *
   * @param _value the CdrDataPartitionKeyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CdrDataPartitionKeyFilter filter field
   */
  public void setCdrDataPartitionKeyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCdrDataPartitionKeyFilterFromFormattedString");
    try {
      this.setCdrDataPartitionKeyFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CdrDataPartitionKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCdrDataPartitionKeyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCdrDataPartitionKeyFilterFromFormattedString");
  }

  /**
   * Retrieves the CdrDataPartitionKeyFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CdrDataPartitionKeyFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CdrDataPartitionKeyFilter field
   */
  public String[] getCdrDataPartitionKeyFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCdrDataPartitionKeyFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCdrDataPartitionKeyFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCdrDataPartitionKeyFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CdrDataPartitionKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCdrDataPartitionKeyFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CdrDataPartitionKeyFilter filter value from a formatted string
   *
   * @param _value the CdrDataPartitionKeyFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CdrDataPartitionKeyFilter filter field
   */
  public void setCdrDataPartitionKeyFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCdrDataPartitionKeyFilterFromFormattedDateTimeString");
    try {
      this.setCdrDataPartitionKeyFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CdrDataPartitionKeyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCdrDataPartitionKeyFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCdrDataPartitionKeyFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: AccountInternalId (CDR_UNBILLED.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (CDR_UNBILLED.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (CDR_UNBILLED.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (CDR_UNBILLED.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (CDR_UNBILLED.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (CDR_UNBILLED.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (CDR_UNBILLED.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (CDR_UNBILLED.account_no)
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

  /** Set the field level Fetch value for field: ServiceInternalId (CDR_UNBILLED.subscr_no)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdFetch (boolean fetch) {
    this.ServiceInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalId (CDR_UNBILLED.subscr_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdFetch () {
    return this.ServiceInternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceInternalId (CDR_UNBILLED.subscr_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdSortOrder (Integer value) {
    this.ServiceInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalId (CDR_UNBILLED.subscr_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdSortOrder () {
    return this.ServiceInternalIdSort;
  }
  /** Set the sort direction for field: ServiceInternalId (CDR_UNBILLED.subscr_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdSortDirection (boolean ascending) {
    this.ServiceInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalId (CDR_UNBILLED.subscr_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdSortDirection () {
    return this.ServiceInternalIdSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalId (CDR_UNBILLED.subscr_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalId = value;
  }
  /** Retrieve filter for field: ServiceInternalId (CDR_UNBILLED.subscr_no)
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

  /** Set the field level Fetch value for field: ServiceInternalIdResets (CDR_UNBILLED.subscr_no_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdResetsFetch (boolean fetch) {
    this.ServiceInternalIdResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalIdResets (CDR_UNBILLED.subscr_no_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdResetsFetch () {
    return this.ServiceInternalIdResetsFetch;
  }
  /** Set the SortOrder for field: ServiceInternalIdResets (CDR_UNBILLED.subscr_no_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdResetsSortOrder (Integer value) {
    this.ServiceInternalIdResetsSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalIdResets (CDR_UNBILLED.subscr_no_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdResetsSortOrder () {
    return this.ServiceInternalIdResetsSort;
  }
  /** Set the sort direction for field: ServiceInternalIdResets (CDR_UNBILLED.subscr_no_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdResetsSortDirection (boolean ascending) {
    this.ServiceInternalIdResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalIdResets (CDR_UNBILLED.subscr_no_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdResetsSortDirection () {
    return this.ServiceInternalIdResetsSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalIdResets (CDR_UNBILLED.subscr_no_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalIdResets = value;
  }
  /** Retrieve filter for field: ServiceInternalIdResets (CDR_UNBILLED.subscr_no_resets)
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

  /** Set the field level Fetch value for field: TypeIdUsg (CDR_UNBILLED.type_id_usg)
   * @param fetch whether to fetch this field or not
   */
  public void setTypeIdUsgFetch (boolean fetch) {
    this.TypeIdUsgFetch = fetch;
  }
  /** Retrieve Fetch value for field: TypeIdUsg (CDR_UNBILLED.type_id_usg)
   * @return boolean the Fetch value for this field
   */
  public boolean getTypeIdUsgFetch () {
    return this.TypeIdUsgFetch;
  }
  /** Set the SortOrder for field: TypeIdUsg (CDR_UNBILLED.type_id_usg)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTypeIdUsgSortOrder (Integer value) {
    this.TypeIdUsgSort = value;
  }
  /** Retrieve SortOrder for field: TypeIdUsg (CDR_UNBILLED.type_id_usg)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTypeIdUsgSortOrder () {
    return this.TypeIdUsgSort;
  }
  /** Set the sort direction for field: TypeIdUsg (CDR_UNBILLED.type_id_usg)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTypeIdUsgSortDirection (boolean ascending) {
    this.TypeIdUsgSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TypeIdUsg (CDR_UNBILLED.type_id_usg)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTypeIdUsgSortDirection () {
    return this.TypeIdUsgSortAscending;
  }
  /** Set the field level filters for field: TypeIdUsg (CDR_UNBILLED.type_id_usg)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTypeIdUsgFilter (IntegerFilter[] value) throws ServiceException {
    this.TypeIdUsg = value;
  }
  /** Retrieve filter for field: TypeIdUsg (CDR_UNBILLED.type_id_usg)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTypeIdUsgFilter () {
    return this.TypeIdUsg;
  }

  /**
   * Retrieves the TypeIdUsgFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TypeIdUsgFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TypeIdUsgFilter field
   */
  public String[] getTypeIdUsgFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTypeIdUsgFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTypeIdUsgFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTypeIdUsgFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TypeIdUsgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTypeIdUsgFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TypeIdUsgFilter filter value from a formatted string
   *
   * @param _value the TypeIdUsgFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TypeIdUsgFilter filter field
   */
  public void setTypeIdUsgFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTypeIdUsgFilterFromFormattedString");
    try {
      this.setTypeIdUsgFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TypeIdUsgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTypeIdUsgFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTypeIdUsgFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated TypeIdUsgFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the TypeIdUsgFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the TypeIdUsgFilter filter field
   */
  public String[] getTypeIdUsgFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTypeIdUsgFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getTypeIdUsgFilter(), "UsageType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTypeIdUsgFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TypeIdUsgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTypeIdUsgFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated TypeIdUsgFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the TypeIdUsgFilter filter field
   */
  public void setTypeIdUsgFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTypeIdUsgFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setTypeIdUsgFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "TypeIdUsg", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TypeIdUsgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTypeIdUsgFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTypeIdUsgFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: TransDt (CDR_UNBILLED.trans_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setTransDtFetch (boolean fetch) {
    this.TransDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransDt (CDR_UNBILLED.trans_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransDtFetch () {
    return this.TransDtFetch;
  }
  /** Set the SortOrder for field: TransDt (CDR_UNBILLED.trans_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransDtSortOrder (Integer value) {
    this.TransDtSort = value;
  }
  /** Retrieve SortOrder for field: TransDt (CDR_UNBILLED.trans_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransDtSortOrder () {
    return this.TransDtSort;
  }
  /** Set the sort direction for field: TransDt (CDR_UNBILLED.trans_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransDtSortDirection (boolean ascending) {
    this.TransDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransDt (CDR_UNBILLED.trans_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransDtSortDirection () {
    return this.TransDtSortAscending;
  }
  /** Set the field level filters for field: TransDt (CDR_UNBILLED.trans_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransDtFilter (DateFilter[] value) throws ServiceException {
    this.TransDt = value;
  }
  /** Retrieve filter for field: TransDt (CDR_UNBILLED.trans_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getTransDtFilter () {
    return this.TransDt;
  }

  /**
   * Retrieves the TransDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDtFilter field
   */
  public String[] getTransDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransDtFilter filter value from a formatted string
   *
   * @param _value the TransDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransDtFilter filter field
   */
  public void setTransDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDtFilterFromFormattedString");
    try {
      this.setTransDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDtFilterFromFormattedString");
  }

  /**
   * Retrieves the TransDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDtFilter field
   */
  public String[] getTransDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TransDtFilter filter value from a formatted string
   *
   * @param _value the TransDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransDtFilter filter field
   */
  public void setTransDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDtFilterFromFormattedDateTimeString");
    try {
      this.setTransDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: RateDt (CDR_UNBILLED.rate_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setRateDtFetch (boolean fetch) {
    this.RateDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateDt (CDR_UNBILLED.rate_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateDtFetch () {
    return this.RateDtFetch;
  }
  /** Set the SortOrder for field: RateDt (CDR_UNBILLED.rate_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateDtSortOrder (Integer value) {
    this.RateDtSort = value;
  }
  /** Retrieve SortOrder for field: RateDt (CDR_UNBILLED.rate_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateDtSortOrder () {
    return this.RateDtSort;
  }
  /** Set the sort direction for field: RateDt (CDR_UNBILLED.rate_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateDtSortDirection (boolean ascending) {
    this.RateDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateDt (CDR_UNBILLED.rate_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateDtSortDirection () {
    return this.RateDtSortAscending;
  }
  /** Set the field level filters for field: RateDt (CDR_UNBILLED.rate_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateDtFilter (DateFilter[] value) throws ServiceException {
    this.RateDt = value;
  }
  /** Retrieve filter for field: RateDt (CDR_UNBILLED.rate_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getRateDtFilter () {
    return this.RateDt;
  }

  /**
   * Retrieves the RateDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateDtFilter field
   */
  public String[] getRateDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateDtFilter filter value from a formatted string
   *
   * @param _value the RateDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateDtFilter filter field
   */
  public void setRateDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateDtFilterFromFormattedString");
    try {
      this.setRateDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateDtFilterFromFormattedString");
  }

  /**
   * Retrieves the RateDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateDtFilter field
   */
  public String[] getRateDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the RateDtFilter filter value from a formatted string
   *
   * @param _value the RateDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateDtFilter filter field
   */
  public void setRateDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateDtFilterFromFormattedDateTimeString");
    try {
      this.setRateDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ExtTrackingId (CDR_DATA.ext_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setExtTrackingIdFetch (boolean fetch) {
    this.ExtTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExtTrackingId (CDR_DATA.ext_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getExtTrackingIdFetch () {
    return this.ExtTrackingIdFetch;
  }
  /** Set the SortOrder for field: ExtTrackingId (CDR_DATA.ext_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExtTrackingIdSortOrder (Integer value) {
    this.ExtTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: ExtTrackingId (CDR_DATA.ext_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExtTrackingIdSortOrder () {
    return this.ExtTrackingIdSort;
  }
  /** Set the sort direction for field: ExtTrackingId (CDR_DATA.ext_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExtTrackingIdSortDirection (boolean ascending) {
    this.ExtTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExtTrackingId (CDR_DATA.ext_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExtTrackingIdSortDirection () {
    return this.ExtTrackingIdSortAscending;
  }
  /** Set the case insensitive for field: ExtTrackingId (CDR_DATA.ext_tracking_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setExtTrackingIdCaseInsensitive (boolean ascending) {
    this.ExtTrackingIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ExtTrackingId (CDR_DATA.ext_tracking_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getExtTrackingIdCaseInsensitive () {
    return this.ExtTrackingIdCaseInsensitive;
  }
  /** Set the field level filters for field: ExtTrackingId (CDR_DATA.ext_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExtTrackingIdFilter (StringFilter[] value) throws ServiceException {
    this.ExtTrackingId = value;
  }
  /** Retrieve filter for field: ExtTrackingId (CDR_DATA.ext_tracking_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getExtTrackingIdFilter () {
    return this.ExtTrackingId;
  }

  /**
   * Retrieves the ExtTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExtTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExtTrackingIdFilter field
   */
  public String[] getExtTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExtTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExtTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExtTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExtTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExtTrackingIdFilter filter value from a formatted string
   *
   * @param _value the ExtTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExtTrackingIdFilter filter field
   */
  public void setExtTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExtTrackingIdFilterFromFormattedString");
    try {
      this.setExtTrackingIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExtTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExtTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExtTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransId (CDR_DATA.trans_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTransIdFetch (boolean fetch) {
    this.TransIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransId (CDR_DATA.trans_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransIdFetch () {
    return this.TransIdFetch;
  }
  /** Set the SortOrder for field: TransId (CDR_DATA.trans_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransIdSortOrder (Integer value) {
    this.TransIdSort = value;
  }
  /** Retrieve SortOrder for field: TransId (CDR_DATA.trans_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransIdSortOrder () {
    return this.TransIdSort;
  }
  /** Set the sort direction for field: TransId (CDR_DATA.trans_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransIdSortDirection (boolean ascending) {
    this.TransIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransId (CDR_DATA.trans_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransIdSortDirection () {
    return this.TransIdSortAscending;
  }
  /** Set the case insensitive for field: TransId (CDR_DATA.trans_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setTransIdCaseInsensitive (boolean ascending) {
    this.TransIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: TransId (CDR_DATA.trans_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getTransIdCaseInsensitive () {
    return this.TransIdCaseInsensitive;
  }
  /** Set the field level filters for field: TransId (CDR_DATA.trans_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransIdFilter (StringFilter[] value) throws ServiceException {
    this.TransId = value;
  }
  /** Retrieve filter for field: TransId (CDR_DATA.trans_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getTransIdFilter () {
    return this.TransId;
  }

  /**
   * Retrieves the TransIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransIdFilter field
   */
  public String[] getTransIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransIdFilter filter value from a formatted string
   *
   * @param _value the TransIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransIdFilter filter field
   */
  public void setTransIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransIdFilterFromFormattedString");
    try {
      this.setTransIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ElementId (CDR_DATA.element_id)
   * @param fetch whether to fetch this field or not
   */
  public void setElementIdFetch (boolean fetch) {
    this.ElementIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ElementId (CDR_DATA.element_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getElementIdFetch () {
    return this.ElementIdFetch;
  }
  /** Set the SortOrder for field: ElementId (CDR_DATA.element_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setElementIdSortOrder (Integer value) {
    this.ElementIdSort = value;
  }
  /** Retrieve SortOrder for field: ElementId (CDR_DATA.element_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getElementIdSortOrder () {
    return this.ElementIdSort;
  }
  /** Set the sort direction for field: ElementId (CDR_DATA.element_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setElementIdSortDirection (boolean ascending) {
    this.ElementIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ElementId (CDR_DATA.element_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getElementIdSortDirection () {
    return this.ElementIdSortAscending;
  }
  /** Set the field level filters for field: ElementId (CDR_DATA.element_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setElementIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ElementId = value;
  }
  /** Retrieve filter for field: ElementId (CDR_DATA.element_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getElementIdFilter () {
    return this.ElementId;
  }

  /**
   * Retrieves the ElementIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ElementIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ElementIdFilter field
   */
  public String[] getElementIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getElementIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getElementIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getElementIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ElementIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getElementIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ElementIdFilter filter value from a formatted string
   *
   * @param _value the ElementIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ElementIdFilter filter field
   */
  public void setElementIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setElementIdFilterFromFormattedString");
    try {
      this.setElementIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ElementIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setElementIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setElementIdFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated ElementIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ElementIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ElementIdFilter filter field
   */
  public String[] getElementIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getElementIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getElementIdFilter(), "ProductType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getElementIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ElementIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getElementIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated ElementIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the ElementIdFilter filter field
   */
  public void setElementIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setElementIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setElementIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "ElementId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ElementIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setElementIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setElementIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: RateClass (CDR_DATA.rate_class)
   * @param fetch whether to fetch this field or not
   */
  public void setRateClassFetch (boolean fetch) {
    this.RateClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateClass (CDR_DATA.rate_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateClassFetch () {
    return this.RateClassFetch;
  }
  /** Set the SortOrder for field: RateClass (CDR_DATA.rate_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateClassSortOrder (Integer value) {
    this.RateClassSort = value;
  }
  /** Retrieve SortOrder for field: RateClass (CDR_DATA.rate_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateClassSortOrder () {
    return this.RateClassSort;
  }
  /** Set the sort direction for field: RateClass (CDR_DATA.rate_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateClassSortDirection (boolean ascending) {
    this.RateClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateClass (CDR_DATA.rate_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateClassSortDirection () {
    return this.RateClassSortAscending;
  }
  /** Set the field level filters for field: RateClass (CDR_DATA.rate_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateClassFilter (IntegerFilter[] value) throws ServiceException {
    this.RateClass = value;
  }
  /** Retrieve filter for field: RateClass (CDR_DATA.rate_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRateClassFilter () {
    return this.RateClass;
  }

  /**
   * Retrieves the RateClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateClassFilter field
   */
  public String[] getRateClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateClassFilter filter value from a formatted string
   *
   * @param _value the RateClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateClassFilter filter field
   */
  public void setRateClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateClassFilterFromFormattedString");
    try {
      this.setRateClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateClassFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated RateClassFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the RateClassFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RateClassFilter filter field
   */
  public String[] getRateClassFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getRateClassFilter(), "RateClass", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated RateClassFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the RateClassFilter filter field
   */
  public void setRateClassFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateClassFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setRateClassFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "RateClass", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateClassFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: BillClass (CDR_DATA.bill_class)
   * @param fetch whether to fetch this field or not
   */
  public void setBillClassFetch (boolean fetch) {
    this.BillClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillClass (CDR_DATA.bill_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillClassFetch () {
    return this.BillClassFetch;
  }
  /** Set the SortOrder for field: BillClass (CDR_DATA.bill_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillClassSortOrder (Integer value) {
    this.BillClassSort = value;
  }
  /** Retrieve SortOrder for field: BillClass (CDR_DATA.bill_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillClassSortOrder () {
    return this.BillClassSort;
  }
  /** Set the sort direction for field: BillClass (CDR_DATA.bill_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillClassSortDirection (boolean ascending) {
    this.BillClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillClass (CDR_DATA.bill_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillClassSortDirection () {
    return this.BillClassSortAscending;
  }
  /** Set the field level filters for field: BillClass (CDR_DATA.bill_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillClassFilter (IntegerFilter[] value) throws ServiceException {
    this.BillClass = value;
  }
  /** Retrieve filter for field: BillClass (CDR_DATA.bill_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillClassFilter () {
    return this.BillClass;
  }

  /**
   * Retrieves the BillClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillClassFilter field
   */
  public String[] getBillClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillClassFilter filter value from a formatted string
   *
   * @param _value the BillClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillClassFilter filter field
   */
  public void setBillClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillClassFilterFromFormattedString");
    try {
      this.setBillClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillClassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProviderId (CDR_DATA.provider_id)
   * @param fetch whether to fetch this field or not
   */
  public void setProviderIdFetch (boolean fetch) {
    this.ProviderIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProviderId (CDR_DATA.provider_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getProviderIdFetch () {
    return this.ProviderIdFetch;
  }
  /** Set the SortOrder for field: ProviderId (CDR_DATA.provider_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProviderIdSortOrder (Integer value) {
    this.ProviderIdSort = value;
  }
  /** Retrieve SortOrder for field: ProviderId (CDR_DATA.provider_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProviderIdSortOrder () {
    return this.ProviderIdSort;
  }
  /** Set the sort direction for field: ProviderId (CDR_DATA.provider_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProviderIdSortDirection (boolean ascending) {
    this.ProviderIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProviderId (CDR_DATA.provider_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProviderIdSortDirection () {
    return this.ProviderIdSortAscending;
  }
  /** Set the field level filters for field: ProviderId (CDR_DATA.provider_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProviderIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ProviderId = value;
  }
  /** Retrieve filter for field: ProviderId (CDR_DATA.provider_id)
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


  /** Set the field level Fetch value for field: Jurisdiction (CDR_DATA.jurisdiction)
   * @param fetch whether to fetch this field or not
   */
  public void setJurisdictionFetch (boolean fetch) {
    this.JurisdictionFetch = fetch;
  }
  /** Retrieve Fetch value for field: Jurisdiction (CDR_DATA.jurisdiction)
   * @return boolean the Fetch value for this field
   */
  public boolean getJurisdictionFetch () {
    return this.JurisdictionFetch;
  }
  /** Set the SortOrder for field: Jurisdiction (CDR_DATA.jurisdiction)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setJurisdictionSortOrder (Integer value) {
    this.JurisdictionSort = value;
  }
  /** Retrieve SortOrder for field: Jurisdiction (CDR_DATA.jurisdiction)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getJurisdictionSortOrder () {
    return this.JurisdictionSort;
  }
  /** Set the sort direction for field: Jurisdiction (CDR_DATA.jurisdiction)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setJurisdictionSortDirection (boolean ascending) {
    this.JurisdictionSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Jurisdiction (CDR_DATA.jurisdiction)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getJurisdictionSortDirection () {
    return this.JurisdictionSortAscending;
  }
  /** Set the field level filters for field: Jurisdiction (CDR_DATA.jurisdiction)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setJurisdictionFilter (IntegerFilter[] value) throws ServiceException {
    this.Jurisdiction = value;
  }
  /** Retrieve filter for field: Jurisdiction (CDR_DATA.jurisdiction)
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


  /** Set the field level Fetch value for field: RateCurrencyCode (CDR_DATA.rate_currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setRateCurrencyCodeFetch (boolean fetch) {
    this.RateCurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateCurrencyCode (CDR_DATA.rate_currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateCurrencyCodeFetch () {
    return this.RateCurrencyCodeFetch;
  }
  /** Set the SortOrder for field: RateCurrencyCode (CDR_DATA.rate_currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateCurrencyCodeSortOrder (Integer value) {
    this.RateCurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: RateCurrencyCode (CDR_DATA.rate_currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateCurrencyCodeSortOrder () {
    return this.RateCurrencyCodeSort;
  }
  /** Set the sort direction for field: RateCurrencyCode (CDR_DATA.rate_currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateCurrencyCodeSortDirection (boolean ascending) {
    this.RateCurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateCurrencyCode (CDR_DATA.rate_currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateCurrencyCodeSortDirection () {
    return this.RateCurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: RateCurrencyCode (CDR_DATA.rate_currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.RateCurrencyCode = value;
  }
  /** Retrieve filter for field: RateCurrencyCode (CDR_DATA.rate_currency_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRateCurrencyCodeFilter () {
    return this.RateCurrencyCode;
  }

  /**
   * Retrieves the RateCurrencyCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateCurrencyCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateCurrencyCodeFilter field
   */
  public String[] getRateCurrencyCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateCurrencyCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateCurrencyCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateCurrencyCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateCurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateCurrencyCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateCurrencyCodeFilter filter value from a formatted string
   *
   * @param _value the RateCurrencyCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateCurrencyCodeFilter filter field
   */
  public void setRateCurrencyCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateCurrencyCodeFilterFromFormattedString");
    try {
      this.setRateCurrencyCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateCurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateCurrencyCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateCurrencyCodeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated RateCurrencyCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the RateCurrencyCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RateCurrencyCodeFilter filter field
   */
  public String[] getRateCurrencyCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateCurrencyCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getRateCurrencyCodeFilter(), "Currency", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateCurrencyCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateCurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateCurrencyCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated RateCurrencyCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the RateCurrencyCodeFilter filter field
   */
  public void setRateCurrencyCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateCurrencyCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setRateCurrencyCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "RateCurrencyCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateCurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateCurrencyCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateCurrencyCodeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: ExternalId (CDR_DATA.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setExternalIdFetch (boolean fetch) {
    this.ExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExternalId (CDR_DATA.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getExternalIdFetch () {
    return this.ExternalIdFetch;
  }
  /** Set the SortOrder for field: ExternalId (CDR_DATA.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExternalIdSortOrder (Integer value) {
    this.ExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ExternalId (CDR_DATA.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExternalIdSortOrder () {
    return this.ExternalIdSort;
  }
  /** Set the sort direction for field: ExternalId (CDR_DATA.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExternalIdSortDirection (boolean ascending) {
    this.ExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExternalId (CDR_DATA.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExternalIdSortDirection () {
    return this.ExternalIdSortAscending;
  }
  /** Set the case insensitive for field: ExternalId (CDR_DATA.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setExternalIdCaseInsensitive (boolean ascending) {
    this.ExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ExternalId (CDR_DATA.external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getExternalIdCaseInsensitive () {
    return this.ExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: ExternalId (CDR_DATA.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.ExternalId = value;
  }
  /** Retrieve filter for field: ExternalId (CDR_DATA.external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getExternalIdFilter () {
    return this.ExternalId;
  }

  /**
   * Retrieves the ExternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalIdFilter field
   */
  public String[] getExternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExternalIdFilter filter value from a formatted string
   *
   * @param _value the ExternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExternalIdFilter filter field
   */
  public void setExternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalIdFilterFromFormattedString");
    try {
      this.setExternalIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ExternalIdType (CDR_DATA.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setExternalIdTypeFetch (boolean fetch) {
    this.ExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExternalIdType (CDR_DATA.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getExternalIdTypeFetch () {
    return this.ExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: ExternalIdType (CDR_DATA.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExternalIdTypeSortOrder (Integer value) {
    this.ExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: ExternalIdType (CDR_DATA.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExternalIdTypeSortOrder () {
    return this.ExternalIdTypeSort;
  }
  /** Set the sort direction for field: ExternalIdType (CDR_DATA.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExternalIdTypeSortDirection (boolean ascending) {
    this.ExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExternalIdType (CDR_DATA.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExternalIdTypeSortDirection () {
    return this.ExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: ExternalIdType (CDR_DATA.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ExternalIdType = value;
  }
  /** Retrieve filter for field: ExternalIdType (CDR_DATA.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getExternalIdTypeFilter () {
    return this.ExternalIdType;
  }

  /**
   * Retrieves the ExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalIdTypeFilter field
   */
  public String[] getExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the ExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExternalIdTypeFilter filter field
   */
  public void setExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalIdTypeFilterFromFormattedString");
    try {
      this.setExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalIdTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PointOrigin (CDR_DATA.point_origin)
   * @param fetch whether to fetch this field or not
   */
  public void setPointOriginFetch (boolean fetch) {
    this.PointOriginFetch = fetch;
  }
  /** Retrieve Fetch value for field: PointOrigin (CDR_DATA.point_origin)
   * @return boolean the Fetch value for this field
   */
  public boolean getPointOriginFetch () {
    return this.PointOriginFetch;
  }
  /** Set the SortOrder for field: PointOrigin (CDR_DATA.point_origin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPointOriginSortOrder (Integer value) {
    this.PointOriginSort = value;
  }
  /** Retrieve SortOrder for field: PointOrigin (CDR_DATA.point_origin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPointOriginSortOrder () {
    return this.PointOriginSort;
  }
  /** Set the sort direction for field: PointOrigin (CDR_DATA.point_origin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPointOriginSortDirection (boolean ascending) {
    this.PointOriginSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PointOrigin (CDR_DATA.point_origin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPointOriginSortDirection () {
    return this.PointOriginSortAscending;
  }
  /** Set the case insensitive for field: PointOrigin (CDR_DATA.point_origin)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPointOriginCaseInsensitive (boolean ascending) {
    this.PointOriginCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PointOrigin (CDR_DATA.point_origin)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPointOriginCaseInsensitive () {
    return this.PointOriginCaseInsensitive;
  }
  /** Set the field level filters for field: PointOrigin (CDR_DATA.point_origin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPointOriginFilter (StringFilter[] value) throws ServiceException {
    this.PointOrigin = value;
  }
  /** Retrieve filter for field: PointOrigin (CDR_DATA.point_origin)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPointOriginFilter () {
    return this.PointOrigin;
  }

  /**
   * Retrieves the PointOriginFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PointOriginFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointOriginFilter field
   */
  public String[] getPointOriginFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointOriginFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPointOriginFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointOriginFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointOriginFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PointOriginFilter filter value from a formatted string
   *
   * @param _value the PointOriginFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PointOriginFilter filter field
   */
  public void setPointOriginFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointOriginFilterFromFormattedString");
    try {
      this.setPointOriginFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointOriginFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointOriginFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CountryCodeOrigin (CDR_DATA.country_code_origin)
   * @param fetch whether to fetch this field or not
   */
  public void setCountryCodeOriginFetch (boolean fetch) {
    this.CountryCodeOriginFetch = fetch;
  }
  /** Retrieve Fetch value for field: CountryCodeOrigin (CDR_DATA.country_code_origin)
   * @return boolean the Fetch value for this field
   */
  public boolean getCountryCodeOriginFetch () {
    return this.CountryCodeOriginFetch;
  }
  /** Set the SortOrder for field: CountryCodeOrigin (CDR_DATA.country_code_origin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCountryCodeOriginSortOrder (Integer value) {
    this.CountryCodeOriginSort = value;
  }
  /** Retrieve SortOrder for field: CountryCodeOrigin (CDR_DATA.country_code_origin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCountryCodeOriginSortOrder () {
    return this.CountryCodeOriginSort;
  }
  /** Set the sort direction for field: CountryCodeOrigin (CDR_DATA.country_code_origin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCountryCodeOriginSortDirection (boolean ascending) {
    this.CountryCodeOriginSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CountryCodeOrigin (CDR_DATA.country_code_origin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCountryCodeOriginSortDirection () {
    return this.CountryCodeOriginSortAscending;
  }
  /** Set the field level filters for field: CountryCodeOrigin (CDR_DATA.country_code_origin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCountryCodeOriginFilter (IntegerFilter[] value) throws ServiceException {
    this.CountryCodeOrigin = value;
  }
  /** Retrieve filter for field: CountryCodeOrigin (CDR_DATA.country_code_origin)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCountryCodeOriginFilter () {
    return this.CountryCodeOrigin;
  }

  /**
   * Retrieves the CountryCodeOriginFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CountryCodeOriginFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountryCodeOriginFilter field
   */
  public String[] getCountryCodeOriginFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeOriginFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCountryCodeOriginFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeOriginFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeOriginFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CountryCodeOriginFilter filter value from a formatted string
   *
   * @param _value the CountryCodeOriginFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CountryCodeOriginFilter filter field
   */
  public void setCountryCodeOriginFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountryCodeOriginFilterFromFormattedString");
    try {
      this.setCountryCodeOriginFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryCodeOriginFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountryCodeOriginFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated CountryCodeOriginFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CountryCodeOriginFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CountryCodeOriginFilter filter field
   */
  public String[] getCountryCodeOriginFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeOriginFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getCountryCodeOriginFilter(), "CountryCode", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeOriginFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeOriginFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated CountryCodeOriginFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the CountryCodeOriginFilter filter field
   */
  public void setCountryCodeOriginFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountryCodeOriginFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setCountryCodeOriginFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "CountryCodeOrigin", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryCodeOriginFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountryCodeOriginFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: CountryDialCodeOrigin (CDR_DATA.country_dial_code_origin)
   * @param fetch whether to fetch this field or not
   */
  public void setCountryDialCodeOriginFetch (boolean fetch) {
    this.CountryDialCodeOriginFetch = fetch;
  }
  /** Retrieve Fetch value for field: CountryDialCodeOrigin (CDR_DATA.country_dial_code_origin)
   * @return boolean the Fetch value for this field
   */
  public boolean getCountryDialCodeOriginFetch () {
    return this.CountryDialCodeOriginFetch;
  }
  /** Set the SortOrder for field: CountryDialCodeOrigin (CDR_DATA.country_dial_code_origin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCountryDialCodeOriginSortOrder (Integer value) {
    this.CountryDialCodeOriginSort = value;
  }
  /** Retrieve SortOrder for field: CountryDialCodeOrigin (CDR_DATA.country_dial_code_origin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCountryDialCodeOriginSortOrder () {
    return this.CountryDialCodeOriginSort;
  }
  /** Set the sort direction for field: CountryDialCodeOrigin (CDR_DATA.country_dial_code_origin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCountryDialCodeOriginSortDirection (boolean ascending) {
    this.CountryDialCodeOriginSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CountryDialCodeOrigin (CDR_DATA.country_dial_code_origin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCountryDialCodeOriginSortDirection () {
    return this.CountryDialCodeOriginSortAscending;
  }
  /** Set the case insensitive for field: CountryDialCodeOrigin (CDR_DATA.country_dial_code_origin)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCountryDialCodeOriginCaseInsensitive (boolean ascending) {
    this.CountryDialCodeOriginCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CountryDialCodeOrigin (CDR_DATA.country_dial_code_origin)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCountryDialCodeOriginCaseInsensitive () {
    return this.CountryDialCodeOriginCaseInsensitive;
  }
  /** Set the field level filters for field: CountryDialCodeOrigin (CDR_DATA.country_dial_code_origin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCountryDialCodeOriginFilter (StringFilter[] value) throws ServiceException {
    this.CountryDialCodeOrigin = value;
  }
  /** Retrieve filter for field: CountryDialCodeOrigin (CDR_DATA.country_dial_code_origin)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCountryDialCodeOriginFilter () {
    return this.CountryDialCodeOrigin;
  }

  /**
   * Retrieves the CountryDialCodeOriginFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CountryDialCodeOriginFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountryDialCodeOriginFilter field
   */
  public String[] getCountryDialCodeOriginFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryDialCodeOriginFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCountryDialCodeOriginFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryDialCodeOriginFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryDialCodeOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryDialCodeOriginFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CountryDialCodeOriginFilter filter value from a formatted string
   *
   * @param _value the CountryDialCodeOriginFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CountryDialCodeOriginFilter filter field
   */
  public void setCountryDialCodeOriginFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountryDialCodeOriginFilterFromFormattedString");
    try {
      this.setCountryDialCodeOriginFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryDialCodeOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryDialCodeOriginFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountryDialCodeOriginFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PointIdOrigin (CDR_DATA.point_id_origin)
   * @param fetch whether to fetch this field or not
   */
  public void setPointIdOriginFetch (boolean fetch) {
    this.PointIdOriginFetch = fetch;
  }
  /** Retrieve Fetch value for field: PointIdOrigin (CDR_DATA.point_id_origin)
   * @return boolean the Fetch value for this field
   */
  public boolean getPointIdOriginFetch () {
    return this.PointIdOriginFetch;
  }
  /** Set the SortOrder for field: PointIdOrigin (CDR_DATA.point_id_origin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPointIdOriginSortOrder (Integer value) {
    this.PointIdOriginSort = value;
  }
  /** Retrieve SortOrder for field: PointIdOrigin (CDR_DATA.point_id_origin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPointIdOriginSortOrder () {
    return this.PointIdOriginSort;
  }
  /** Set the sort direction for field: PointIdOrigin (CDR_DATA.point_id_origin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPointIdOriginSortDirection (boolean ascending) {
    this.PointIdOriginSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PointIdOrigin (CDR_DATA.point_id_origin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPointIdOriginSortDirection () {
    return this.PointIdOriginSortAscending;
  }
  /** Set the field level filters for field: PointIdOrigin (CDR_DATA.point_id_origin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPointIdOriginFilter (IntegerFilter[] value) throws ServiceException {
    this.PointIdOrigin = value;
  }
  /** Retrieve filter for field: PointIdOrigin (CDR_DATA.point_id_origin)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPointIdOriginFilter () {
    return this.PointIdOrigin;
  }

  /**
   * Retrieves the PointIdOriginFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PointIdOriginFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointIdOriginFilter field
   */
  public String[] getPointIdOriginFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointIdOriginFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPointIdOriginFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointIdOriginFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointIdOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointIdOriginFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PointIdOriginFilter filter value from a formatted string
   *
   * @param _value the PointIdOriginFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PointIdOriginFilter filter field
   */
  public void setPointIdOriginFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointIdOriginFilterFromFormattedString");
    try {
      this.setPointIdOriginFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointIdOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointIdOriginFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointIdOriginFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated PointIdOriginFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the PointIdOriginFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PointIdOriginFilter filter field
   */
  public String[] getPointIdOriginFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointIdOriginFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getPointIdOriginFilter(), "UsagePoint", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointIdOriginFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointIdOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointIdOriginFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated PointIdOriginFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the PointIdOriginFilter filter field
   */
  public void setPointIdOriginFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointIdOriginFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setPointIdOriginFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "PointIdOrigin", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointIdOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointIdOriginFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointIdOriginFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: PointTaxCodeOrigin (CDR_DATA.point_tax_code_origin)
   * @param fetch whether to fetch this field or not
   */
  public void setPointTaxCodeOriginFetch (boolean fetch) {
    this.PointTaxCodeOriginFetch = fetch;
  }
  /** Retrieve Fetch value for field: PointTaxCodeOrigin (CDR_DATA.point_tax_code_origin)
   * @return boolean the Fetch value for this field
   */
  public boolean getPointTaxCodeOriginFetch () {
    return this.PointTaxCodeOriginFetch;
  }
  /** Set the SortOrder for field: PointTaxCodeOrigin (CDR_DATA.point_tax_code_origin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPointTaxCodeOriginSortOrder (Integer value) {
    this.PointTaxCodeOriginSort = value;
  }
  /** Retrieve SortOrder for field: PointTaxCodeOrigin (CDR_DATA.point_tax_code_origin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPointTaxCodeOriginSortOrder () {
    return this.PointTaxCodeOriginSort;
  }
  /** Set the sort direction for field: PointTaxCodeOrigin (CDR_DATA.point_tax_code_origin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPointTaxCodeOriginSortDirection (boolean ascending) {
    this.PointTaxCodeOriginSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PointTaxCodeOrigin (CDR_DATA.point_tax_code_origin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPointTaxCodeOriginSortDirection () {
    return this.PointTaxCodeOriginSortAscending;
  }
  /** Set the case insensitive for field: PointTaxCodeOrigin (CDR_DATA.point_tax_code_origin)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPointTaxCodeOriginCaseInsensitive (boolean ascending) {
    this.PointTaxCodeOriginCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PointTaxCodeOrigin (CDR_DATA.point_tax_code_origin)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPointTaxCodeOriginCaseInsensitive () {
    return this.PointTaxCodeOriginCaseInsensitive;
  }
  /** Set the field level filters for field: PointTaxCodeOrigin (CDR_DATA.point_tax_code_origin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPointTaxCodeOriginFilter (StringFilter[] value) throws ServiceException {
    this.PointTaxCodeOrigin = value;
  }
  /** Retrieve filter for field: PointTaxCodeOrigin (CDR_DATA.point_tax_code_origin)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPointTaxCodeOriginFilter () {
    return this.PointTaxCodeOrigin;
  }

  /**
   * Retrieves the PointTaxCodeOriginFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PointTaxCodeOriginFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointTaxCodeOriginFilter field
   */
  public String[] getPointTaxCodeOriginFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTaxCodeOriginFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPointTaxCodeOriginFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointTaxCodeOriginFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointTaxCodeOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointTaxCodeOriginFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PointTaxCodeOriginFilter filter value from a formatted string
   *
   * @param _value the PointTaxCodeOriginFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PointTaxCodeOriginFilter filter field
   */
  public void setPointTaxCodeOriginFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointTaxCodeOriginFilterFromFormattedString");
    try {
      this.setPointTaxCodeOriginFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointTaxCodeOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointTaxCodeOriginFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointTaxCodeOriginFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PointTaxCodeTypeOrigin (CDR_DATA.point_tax_code_type_origin)
   * @param fetch whether to fetch this field or not
   */
  public void setPointTaxCodeTypeOriginFetch (boolean fetch) {
    this.PointTaxCodeTypeOriginFetch = fetch;
  }
  /** Retrieve Fetch value for field: PointTaxCodeTypeOrigin (CDR_DATA.point_tax_code_type_origin)
   * @return boolean the Fetch value for this field
   */
  public boolean getPointTaxCodeTypeOriginFetch () {
    return this.PointTaxCodeTypeOriginFetch;
  }
  /** Set the SortOrder for field: PointTaxCodeTypeOrigin (CDR_DATA.point_tax_code_type_origin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPointTaxCodeTypeOriginSortOrder (Integer value) {
    this.PointTaxCodeTypeOriginSort = value;
  }
  /** Retrieve SortOrder for field: PointTaxCodeTypeOrigin (CDR_DATA.point_tax_code_type_origin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPointTaxCodeTypeOriginSortOrder () {
    return this.PointTaxCodeTypeOriginSort;
  }
  /** Set the sort direction for field: PointTaxCodeTypeOrigin (CDR_DATA.point_tax_code_type_origin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPointTaxCodeTypeOriginSortDirection (boolean ascending) {
    this.PointTaxCodeTypeOriginSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PointTaxCodeTypeOrigin (CDR_DATA.point_tax_code_type_origin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPointTaxCodeTypeOriginSortDirection () {
    return this.PointTaxCodeTypeOriginSortAscending;
  }
  /** Set the field level filters for field: PointTaxCodeTypeOrigin (CDR_DATA.point_tax_code_type_origin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPointTaxCodeTypeOriginFilter (IntegerFilter[] value) throws ServiceException {
    this.PointTaxCodeTypeOrigin = value;
  }
  /** Retrieve filter for field: PointTaxCodeTypeOrigin (CDR_DATA.point_tax_code_type_origin)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPointTaxCodeTypeOriginFilter () {
    return this.PointTaxCodeTypeOrigin;
  }

  /**
   * Retrieves the PointTaxCodeTypeOriginFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PointTaxCodeTypeOriginFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointTaxCodeTypeOriginFilter field
   */
  public String[] getPointTaxCodeTypeOriginFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTaxCodeTypeOriginFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPointTaxCodeTypeOriginFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointTaxCodeTypeOriginFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointTaxCodeTypeOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointTaxCodeTypeOriginFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PointTaxCodeTypeOriginFilter filter value from a formatted string
   *
   * @param _value the PointTaxCodeTypeOriginFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PointTaxCodeTypeOriginFilter filter field
   */
  public void setPointTaxCodeTypeOriginFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointTaxCodeTypeOriginFilterFromFormattedString");
    try {
      this.setPointTaxCodeTypeOriginFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointTaxCodeTypeOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointTaxCodeTypeOriginFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointTaxCodeTypeOriginFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PointTarget (CDR_DATA.point_target)
   * @param fetch whether to fetch this field or not
   */
  public void setPointTargetFetch (boolean fetch) {
    this.PointTargetFetch = fetch;
  }
  /** Retrieve Fetch value for field: PointTarget (CDR_DATA.point_target)
   * @return boolean the Fetch value for this field
   */
  public boolean getPointTargetFetch () {
    return this.PointTargetFetch;
  }
  /** Set the SortOrder for field: PointTarget (CDR_DATA.point_target)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPointTargetSortOrder (Integer value) {
    this.PointTargetSort = value;
  }
  /** Retrieve SortOrder for field: PointTarget (CDR_DATA.point_target)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPointTargetSortOrder () {
    return this.PointTargetSort;
  }
  /** Set the sort direction for field: PointTarget (CDR_DATA.point_target)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPointTargetSortDirection (boolean ascending) {
    this.PointTargetSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PointTarget (CDR_DATA.point_target)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPointTargetSortDirection () {
    return this.PointTargetSortAscending;
  }
  /** Set the case insensitive for field: PointTarget (CDR_DATA.point_target)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPointTargetCaseInsensitive (boolean ascending) {
    this.PointTargetCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PointTarget (CDR_DATA.point_target)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPointTargetCaseInsensitive () {
    return this.PointTargetCaseInsensitive;
  }
  /** Set the field level filters for field: PointTarget (CDR_DATA.point_target)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPointTargetFilter (StringFilter[] value) throws ServiceException {
    this.PointTarget = value;
  }
  /** Retrieve filter for field: PointTarget (CDR_DATA.point_target)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPointTargetFilter () {
    return this.PointTarget;
  }

  /**
   * Retrieves the PointTargetFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PointTargetFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointTargetFilter field
   */
  public String[] getPointTargetFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTargetFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPointTargetFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointTargetFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointTargetFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PointTargetFilter filter value from a formatted string
   *
   * @param _value the PointTargetFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PointTargetFilter filter field
   */
  public void setPointTargetFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointTargetFilterFromFormattedString");
    try {
      this.setPointTargetFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointTargetFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointTargetFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CountryCodeTarget (CDR_DATA.country_code_target)
   * @param fetch whether to fetch this field or not
   */
  public void setCountryCodeTargetFetch (boolean fetch) {
    this.CountryCodeTargetFetch = fetch;
  }
  /** Retrieve Fetch value for field: CountryCodeTarget (CDR_DATA.country_code_target)
   * @return boolean the Fetch value for this field
   */
  public boolean getCountryCodeTargetFetch () {
    return this.CountryCodeTargetFetch;
  }
  /** Set the SortOrder for field: CountryCodeTarget (CDR_DATA.country_code_target)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCountryCodeTargetSortOrder (Integer value) {
    this.CountryCodeTargetSort = value;
  }
  /** Retrieve SortOrder for field: CountryCodeTarget (CDR_DATA.country_code_target)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCountryCodeTargetSortOrder () {
    return this.CountryCodeTargetSort;
  }
  /** Set the sort direction for field: CountryCodeTarget (CDR_DATA.country_code_target)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCountryCodeTargetSortDirection (boolean ascending) {
    this.CountryCodeTargetSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CountryCodeTarget (CDR_DATA.country_code_target)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCountryCodeTargetSortDirection () {
    return this.CountryCodeTargetSortAscending;
  }
  /** Set the field level filters for field: CountryCodeTarget (CDR_DATA.country_code_target)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCountryCodeTargetFilter (IntegerFilter[] value) throws ServiceException {
    this.CountryCodeTarget = value;
  }
  /** Retrieve filter for field: CountryCodeTarget (CDR_DATA.country_code_target)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCountryCodeTargetFilter () {
    return this.CountryCodeTarget;
  }

  /**
   * Retrieves the CountryCodeTargetFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CountryCodeTargetFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountryCodeTargetFilter field
   */
  public String[] getCountryCodeTargetFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeTargetFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCountryCodeTargetFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeTargetFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeTargetFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CountryCodeTargetFilter filter value from a formatted string
   *
   * @param _value the CountryCodeTargetFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CountryCodeTargetFilter filter field
   */
  public void setCountryCodeTargetFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountryCodeTargetFilterFromFormattedString");
    try {
      this.setCountryCodeTargetFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryCodeTargetFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountryCodeTargetFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated CountryCodeTargetFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CountryCodeTargetFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CountryCodeTargetFilter filter field
   */
  public String[] getCountryCodeTargetFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeTargetFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getCountryCodeTargetFilter(), "CountryCode", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeTargetFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeTargetFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated CountryCodeTargetFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the CountryCodeTargetFilter filter field
   */
  public void setCountryCodeTargetFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountryCodeTargetFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setCountryCodeTargetFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "CountryCodeTarget", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryCodeTargetFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountryCodeTargetFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: PointIdTarget (CDR_DATA.point_id_target)
   * @param fetch whether to fetch this field or not
   */
  public void setPointIdTargetFetch (boolean fetch) {
    this.PointIdTargetFetch = fetch;
  }
  /** Retrieve Fetch value for field: PointIdTarget (CDR_DATA.point_id_target)
   * @return boolean the Fetch value for this field
   */
  public boolean getPointIdTargetFetch () {
    return this.PointIdTargetFetch;
  }
  /** Set the SortOrder for field: PointIdTarget (CDR_DATA.point_id_target)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPointIdTargetSortOrder (Integer value) {
    this.PointIdTargetSort = value;
  }
  /** Retrieve SortOrder for field: PointIdTarget (CDR_DATA.point_id_target)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPointIdTargetSortOrder () {
    return this.PointIdTargetSort;
  }
  /** Set the sort direction for field: PointIdTarget (CDR_DATA.point_id_target)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPointIdTargetSortDirection (boolean ascending) {
    this.PointIdTargetSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PointIdTarget (CDR_DATA.point_id_target)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPointIdTargetSortDirection () {
    return this.PointIdTargetSortAscending;
  }
  /** Set the field level filters for field: PointIdTarget (CDR_DATA.point_id_target)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPointIdTargetFilter (IntegerFilter[] value) throws ServiceException {
    this.PointIdTarget = value;
  }
  /** Retrieve filter for field: PointIdTarget (CDR_DATA.point_id_target)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPointIdTargetFilter () {
    return this.PointIdTarget;
  }

  /**
   * Retrieves the PointIdTargetFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PointIdTargetFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointIdTargetFilter field
   */
  public String[] getPointIdTargetFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointIdTargetFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPointIdTargetFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointIdTargetFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointIdTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointIdTargetFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PointIdTargetFilter filter value from a formatted string
   *
   * @param _value the PointIdTargetFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PointIdTargetFilter filter field
   */
  public void setPointIdTargetFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointIdTargetFilterFromFormattedString");
    try {
      this.setPointIdTargetFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointIdTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointIdTargetFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointIdTargetFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated PointIdTargetFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the PointIdTargetFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PointIdTargetFilter filter field
   */
  public String[] getPointIdTargetFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointIdTargetFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getPointIdTargetFilter(), "UsagePoint", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointIdTargetFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointIdTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointIdTargetFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated PointIdTargetFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the PointIdTargetFilter filter field
   */
  public void setPointIdTargetFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointIdTargetFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setPointIdTargetFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "PointIdTarget", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointIdTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointIdTargetFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointIdTargetFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: PointTaxCodeTarget (CDR_DATA.point_tax_code_target)
   * @param fetch whether to fetch this field or not
   */
  public void setPointTaxCodeTargetFetch (boolean fetch) {
    this.PointTaxCodeTargetFetch = fetch;
  }
  /** Retrieve Fetch value for field: PointTaxCodeTarget (CDR_DATA.point_tax_code_target)
   * @return boolean the Fetch value for this field
   */
  public boolean getPointTaxCodeTargetFetch () {
    return this.PointTaxCodeTargetFetch;
  }
  /** Set the SortOrder for field: PointTaxCodeTarget (CDR_DATA.point_tax_code_target)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPointTaxCodeTargetSortOrder (Integer value) {
    this.PointTaxCodeTargetSort = value;
  }
  /** Retrieve SortOrder for field: PointTaxCodeTarget (CDR_DATA.point_tax_code_target)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPointTaxCodeTargetSortOrder () {
    return this.PointTaxCodeTargetSort;
  }
  /** Set the sort direction for field: PointTaxCodeTarget (CDR_DATA.point_tax_code_target)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPointTaxCodeTargetSortDirection (boolean ascending) {
    this.PointTaxCodeTargetSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PointTaxCodeTarget (CDR_DATA.point_tax_code_target)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPointTaxCodeTargetSortDirection () {
    return this.PointTaxCodeTargetSortAscending;
  }
  /** Set the case insensitive for field: PointTaxCodeTarget (CDR_DATA.point_tax_code_target)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPointTaxCodeTargetCaseInsensitive (boolean ascending) {
    this.PointTaxCodeTargetCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PointTaxCodeTarget (CDR_DATA.point_tax_code_target)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPointTaxCodeTargetCaseInsensitive () {
    return this.PointTaxCodeTargetCaseInsensitive;
  }
  /** Set the field level filters for field: PointTaxCodeTarget (CDR_DATA.point_tax_code_target)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPointTaxCodeTargetFilter (StringFilter[] value) throws ServiceException {
    this.PointTaxCodeTarget = value;
  }
  /** Retrieve filter for field: PointTaxCodeTarget (CDR_DATA.point_tax_code_target)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPointTaxCodeTargetFilter () {
    return this.PointTaxCodeTarget;
  }

  /**
   * Retrieves the PointTaxCodeTargetFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PointTaxCodeTargetFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointTaxCodeTargetFilter field
   */
  public String[] getPointTaxCodeTargetFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTaxCodeTargetFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPointTaxCodeTargetFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointTaxCodeTargetFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointTaxCodeTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointTaxCodeTargetFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PointTaxCodeTargetFilter filter value from a formatted string
   *
   * @param _value the PointTaxCodeTargetFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PointTaxCodeTargetFilter filter field
   */
  public void setPointTaxCodeTargetFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointTaxCodeTargetFilterFromFormattedString");
    try {
      this.setPointTaxCodeTargetFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointTaxCodeTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointTaxCodeTargetFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointTaxCodeTargetFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PointTaxCodeTypeTarget (CDR_DATA.point_tax_code_type_target)
   * @param fetch whether to fetch this field or not
   */
  public void setPointTaxCodeTypeTargetFetch (boolean fetch) {
    this.PointTaxCodeTypeTargetFetch = fetch;
  }
  /** Retrieve Fetch value for field: PointTaxCodeTypeTarget (CDR_DATA.point_tax_code_type_target)
   * @return boolean the Fetch value for this field
   */
  public boolean getPointTaxCodeTypeTargetFetch () {
    return this.PointTaxCodeTypeTargetFetch;
  }
  /** Set the SortOrder for field: PointTaxCodeTypeTarget (CDR_DATA.point_tax_code_type_target)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPointTaxCodeTypeTargetSortOrder (Integer value) {
    this.PointTaxCodeTypeTargetSort = value;
  }
  /** Retrieve SortOrder for field: PointTaxCodeTypeTarget (CDR_DATA.point_tax_code_type_target)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPointTaxCodeTypeTargetSortOrder () {
    return this.PointTaxCodeTypeTargetSort;
  }
  /** Set the sort direction for field: PointTaxCodeTypeTarget (CDR_DATA.point_tax_code_type_target)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPointTaxCodeTypeTargetSortDirection (boolean ascending) {
    this.PointTaxCodeTypeTargetSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PointTaxCodeTypeTarget (CDR_DATA.point_tax_code_type_target)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPointTaxCodeTypeTargetSortDirection () {
    return this.PointTaxCodeTypeTargetSortAscending;
  }
  /** Set the field level filters for field: PointTaxCodeTypeTarget (CDR_DATA.point_tax_code_type_target)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPointTaxCodeTypeTargetFilter (IntegerFilter[] value) throws ServiceException {
    this.PointTaxCodeTypeTarget = value;
  }
  /** Retrieve filter for field: PointTaxCodeTypeTarget (CDR_DATA.point_tax_code_type_target)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPointTaxCodeTypeTargetFilter () {
    return this.PointTaxCodeTypeTarget;
  }

  /**
   * Retrieves the PointTaxCodeTypeTargetFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PointTaxCodeTypeTargetFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointTaxCodeTypeTargetFilter field
   */
  public String[] getPointTaxCodeTypeTargetFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTaxCodeTypeTargetFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPointTaxCodeTypeTargetFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointTaxCodeTypeTargetFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointTaxCodeTypeTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointTaxCodeTypeTargetFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PointTaxCodeTypeTargetFilter filter value from a formatted string
   *
   * @param _value the PointTaxCodeTypeTargetFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PointTaxCodeTypeTargetFilter filter field
   */
  public void setPointTaxCodeTypeTargetFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointTaxCodeTypeTargetFilterFromFormattedString");
    try {
      this.setPointTaxCodeTypeTargetFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointTaxCodeTypeTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointTaxCodeTypeTargetFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointTaxCodeTypeTargetFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BaseAmt (CDR_DATA.base_amt)
   * @param fetch whether to fetch this field or not
   */
  public void setBaseAmtFetch (boolean fetch) {
    this.BaseAmtFetch = fetch;
  }
  /** Retrieve Fetch value for field: BaseAmt (CDR_DATA.base_amt)
   * @return boolean the Fetch value for this field
   */
  public boolean getBaseAmtFetch () {
    return this.BaseAmtFetch;
  }
  /** Set the SortOrder for field: BaseAmt (CDR_DATA.base_amt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBaseAmtSortOrder (Integer value) {
    this.BaseAmtSort = value;
  }
  /** Retrieve SortOrder for field: BaseAmt (CDR_DATA.base_amt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBaseAmtSortOrder () {
    return this.BaseAmtSort;
  }
  /** Set the sort direction for field: BaseAmt (CDR_DATA.base_amt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBaseAmtSortDirection (boolean ascending) {
    this.BaseAmtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BaseAmt (CDR_DATA.base_amt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBaseAmtSortDirection () {
    return this.BaseAmtSortAscending;
  }
  /** Set the field level filters for field: BaseAmt (CDR_DATA.base_amt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBaseAmtFilter (BigIntegerFilter[] value) throws ServiceException {
    this.BaseAmt = value;
  }
  /** Retrieve filter for field: BaseAmt (CDR_DATA.base_amt)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getBaseAmtFilter () {
    return this.BaseAmt;
  }

  /**
   * Retrieves the BaseAmtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BaseAmtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BaseAmtFilter field
   */
  public String[] getBaseAmtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBaseAmtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBaseAmtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBaseAmtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BaseAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBaseAmtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BaseAmtFilter filter value from a formatted string
   *
   * @param _value the BaseAmtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BaseAmtFilter filter field
   */
  public void setBaseAmtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBaseAmtFilterFromFormattedString");
    try {
      this.setBaseAmtFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BaseAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBaseAmtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBaseAmtFilterFromFormattedString");
  }

  /**
   * Sets the BaseAmtFilter filter value from a formatted string
   *
   * @param _value the BaseAmtFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BaseAmtFilter filter field
   */
  public void setBaseAmtFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBaseAmtFilterFromFormattedCurrencyString");
    try {
      this.setBaseAmtFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BaseAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBaseAmtFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBaseAmtFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the BaseAmtFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BaseAmtFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the BaseAmtFilter field
   */

  public String[] getBaseAmtFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBaseAmtFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBaseAmtFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBaseAmtFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BaseAmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBaseAmtFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: SecondDt (CDR_DATA.second_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setSecondDtFetch (boolean fetch) {
    this.SecondDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: SecondDt (CDR_DATA.second_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getSecondDtFetch () {
    return this.SecondDtFetch;
  }
  /** Set the SortOrder for field: SecondDt (CDR_DATA.second_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSecondDtSortOrder (Integer value) {
    this.SecondDtSort = value;
  }
  /** Retrieve SortOrder for field: SecondDt (CDR_DATA.second_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSecondDtSortOrder () {
    return this.SecondDtSort;
  }
  /** Set the sort direction for field: SecondDt (CDR_DATA.second_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSecondDtSortDirection (boolean ascending) {
    this.SecondDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SecondDt (CDR_DATA.second_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSecondDtSortDirection () {
    return this.SecondDtSortAscending;
  }
  /** Set the field level filters for field: SecondDt (CDR_DATA.second_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSecondDtFilter (DateFilter[] value) throws ServiceException {
    this.SecondDt = value;
  }
  /** Retrieve filter for field: SecondDt (CDR_DATA.second_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getSecondDtFilter () {
    return this.SecondDt;
  }

  /**
   * Retrieves the SecondDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SecondDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SecondDtFilter field
   */
  public String[] getSecondDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecondDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSecondDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSecondDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SecondDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSecondDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SecondDtFilter filter value from a formatted string
   *
   * @param _value the SecondDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SecondDtFilter filter field
   */
  public void setSecondDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSecondDtFilterFromFormattedString");
    try {
      this.setSecondDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SecondDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSecondDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSecondDtFilterFromFormattedString");
  }

  /**
   * Retrieves the SecondDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SecondDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the SecondDtFilter field
   */
  public String[] getSecondDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecondDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSecondDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSecondDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SecondDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSecondDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the SecondDtFilter filter value from a formatted string
   *
   * @param _value the SecondDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SecondDtFilter filter field
   */
  public void setSecondDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSecondDtFilterFromFormattedDateTimeString");
    try {
      this.setSecondDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SecondDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSecondDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSecondDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: TaxRateActiveDt (CDR_DATA.tax_rate_active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxRateActiveDtFetch (boolean fetch) {
    this.TaxRateActiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxRateActiveDt (CDR_DATA.tax_rate_active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxRateActiveDtFetch () {
    return this.TaxRateActiveDtFetch;
  }
  /** Set the SortOrder for field: TaxRateActiveDt (CDR_DATA.tax_rate_active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxRateActiveDtSortOrder (Integer value) {
    this.TaxRateActiveDtSort = value;
  }
  /** Retrieve SortOrder for field: TaxRateActiveDt (CDR_DATA.tax_rate_active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxRateActiveDtSortOrder () {
    return this.TaxRateActiveDtSort;
  }
  /** Set the sort direction for field: TaxRateActiveDt (CDR_DATA.tax_rate_active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxRateActiveDtSortDirection (boolean ascending) {
    this.TaxRateActiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxRateActiveDt (CDR_DATA.tax_rate_active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxRateActiveDtSortDirection () {
    return this.TaxRateActiveDtSortAscending;
  }
  /** Set the field level filters for field: TaxRateActiveDt (CDR_DATA.tax_rate_active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxRateActiveDtFilter (DateFilter[] value) throws ServiceException {
    this.TaxRateActiveDt = value;
  }
  /** Retrieve filter for field: TaxRateActiveDt (CDR_DATA.tax_rate_active_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getTaxRateActiveDtFilter () {
    return this.TaxRateActiveDt;
  }

  /**
   * Retrieves the TaxRateActiveDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxRateActiveDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxRateActiveDtFilter field
   */
  public String[] getTaxRateActiveDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxRateActiveDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxRateActiveDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxRateActiveDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxRateActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxRateActiveDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxRateActiveDtFilter filter value from a formatted string
   *
   * @param _value the TaxRateActiveDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxRateActiveDtFilter filter field
   */
  public void setTaxRateActiveDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxRateActiveDtFilterFromFormattedString");
    try {
      this.setTaxRateActiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxRateActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxRateActiveDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxRateActiveDtFilterFromFormattedString");
  }

  /**
   * Retrieves the TaxRateActiveDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxRateActiveDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxRateActiveDtFilter field
   */
  public String[] getTaxRateActiveDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxRateActiveDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxRateActiveDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxRateActiveDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxRateActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxRateActiveDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TaxRateActiveDtFilter filter value from a formatted string
   *
   * @param _value the TaxRateActiveDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxRateActiveDtFilter filter field
   */
  public void setTaxRateActiveDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxRateActiveDtFilterFromFormattedDateTimeString");
    try {
      this.setTaxRateActiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxRateActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxRateActiveDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxRateActiveDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: TaxRateInactiveDt (CDR_DATA.tax_rate_inactive_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxRateInactiveDtFetch (boolean fetch) {
    this.TaxRateInactiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxRateInactiveDt (CDR_DATA.tax_rate_inactive_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxRateInactiveDtFetch () {
    return this.TaxRateInactiveDtFetch;
  }
  /** Set the SortOrder for field: TaxRateInactiveDt (CDR_DATA.tax_rate_inactive_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxRateInactiveDtSortOrder (Integer value) {
    this.TaxRateInactiveDtSort = value;
  }
  /** Retrieve SortOrder for field: TaxRateInactiveDt (CDR_DATA.tax_rate_inactive_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxRateInactiveDtSortOrder () {
    return this.TaxRateInactiveDtSort;
  }
  /** Set the sort direction for field: TaxRateInactiveDt (CDR_DATA.tax_rate_inactive_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxRateInactiveDtSortDirection (boolean ascending) {
    this.TaxRateInactiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxRateInactiveDt (CDR_DATA.tax_rate_inactive_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxRateInactiveDtSortDirection () {
    return this.TaxRateInactiveDtSortAscending;
  }
  /** Set the field level filters for field: TaxRateInactiveDt (CDR_DATA.tax_rate_inactive_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxRateInactiveDtFilter (DateFilter[] value) throws ServiceException {
    this.TaxRateInactiveDt = value;
  }
  /** Retrieve filter for field: TaxRateInactiveDt (CDR_DATA.tax_rate_inactive_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getTaxRateInactiveDtFilter () {
    return this.TaxRateInactiveDt;
  }

  /**
   * Retrieves the TaxRateInactiveDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxRateInactiveDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxRateInactiveDtFilter field
   */
  public String[] getTaxRateInactiveDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxRateInactiveDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxRateInactiveDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxRateInactiveDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxRateInactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxRateInactiveDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxRateInactiveDtFilter filter value from a formatted string
   *
   * @param _value the TaxRateInactiveDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxRateInactiveDtFilter filter field
   */
  public void setTaxRateInactiveDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxRateInactiveDtFilterFromFormattedString");
    try {
      this.setTaxRateInactiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxRateInactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxRateInactiveDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxRateInactiveDtFilterFromFormattedString");
  }

  /**
   * Retrieves the TaxRateInactiveDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxRateInactiveDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxRateInactiveDtFilter field
   */
  public String[] getTaxRateInactiveDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxRateInactiveDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxRateInactiveDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxRateInactiveDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxRateInactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxRateInactiveDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TaxRateInactiveDtFilter filter value from a formatted string
   *
   * @param _value the TaxRateInactiveDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxRateInactiveDtFilter filter field
   */
  public void setTaxRateInactiveDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxRateInactiveDtFilterFromFormattedDateTimeString");
    try {
      this.setTaxRateInactiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxRateInactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxRateInactiveDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxRateInactiveDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: Timezone (CDR_DATA.timezone)
   * @param fetch whether to fetch this field or not
   */
  public void setTimezoneFetch (boolean fetch) {
    this.TimezoneFetch = fetch;
  }
  /** Retrieve Fetch value for field: Timezone (CDR_DATA.timezone)
   * @return boolean the Fetch value for this field
   */
  public boolean getTimezoneFetch () {
    return this.TimezoneFetch;
  }
  /** Set the SortOrder for field: Timezone (CDR_DATA.timezone)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTimezoneSortOrder (Integer value) {
    this.TimezoneSort = value;
  }
  /** Retrieve SortOrder for field: Timezone (CDR_DATA.timezone)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTimezoneSortOrder () {
    return this.TimezoneSort;
  }
  /** Set the sort direction for field: Timezone (CDR_DATA.timezone)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTimezoneSortDirection (boolean ascending) {
    this.TimezoneSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Timezone (CDR_DATA.timezone)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTimezoneSortDirection () {
    return this.TimezoneSortAscending;
  }
  /** Set the field level filters for field: Timezone (CDR_DATA.timezone)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTimezoneFilter (IntegerFilter[] value) throws ServiceException {
    this.Timezone = value;
  }
  /** Retrieve filter for field: Timezone (CDR_DATA.timezone)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTimezoneFilter () {
    return this.Timezone;
  }

  /**
   * Retrieves the TimezoneFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TimezoneFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TimezoneFilter field
   */
  public String[] getTimezoneFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTimezoneFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTimezoneFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTimezoneFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TimezoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTimezoneFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TimezoneFilter filter value from a formatted string
   *
   * @param _value the TimezoneFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TimezoneFilter filter field
   */
  public void setTimezoneFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTimezoneFilterFromFormattedString");
    try {
      this.setTimezoneFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TimezoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTimezoneFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTimezoneFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated TimezoneFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the TimezoneFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the TimezoneFilter filter field
   */
  public String[] getTimezoneFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTimezoneFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getTimezoneFilter(), "Timezone", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTimezoneFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TimezoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTimezoneFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated TimezoneFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the TimezoneFilter filter field
   */
  public void setTimezoneFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTimezoneFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setTimezoneFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "Timezone", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TimezoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTimezoneFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTimezoneFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: PrimaryUnits (CDR_DATA.primary_units)
   * @param fetch whether to fetch this field or not
   */
  public void setPrimaryUnitsFetch (boolean fetch) {
    this.PrimaryUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrimaryUnits (CDR_DATA.primary_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrimaryUnitsFetch () {
    return this.PrimaryUnitsFetch;
  }
  /** Set the SortOrder for field: PrimaryUnits (CDR_DATA.primary_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrimaryUnitsSortOrder (Integer value) {
    this.PrimaryUnitsSort = value;
  }
  /** Retrieve SortOrder for field: PrimaryUnits (CDR_DATA.primary_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrimaryUnitsSortOrder () {
    return this.PrimaryUnitsSort;
  }
  /** Set the sort direction for field: PrimaryUnits (CDR_DATA.primary_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrimaryUnitsSortDirection (boolean ascending) {
    this.PrimaryUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrimaryUnits (CDR_DATA.primary_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrimaryUnitsSortDirection () {
    return this.PrimaryUnitsSortAscending;
  }
  /** Set the field level filters for field: PrimaryUnits (CDR_DATA.primary_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrimaryUnitsFilter (BigIntegerFilter[] value) throws ServiceException {
    this.PrimaryUnits = value;
  }
  /** Retrieve filter for field: PrimaryUnits (CDR_DATA.primary_units)
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

  /** Set the field level Fetch value for field: SecondUnits (CDR_DATA.second_units)
   * @param fetch whether to fetch this field or not
   */
  public void setSecondUnitsFetch (boolean fetch) {
    this.SecondUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: SecondUnits (CDR_DATA.second_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getSecondUnitsFetch () {
    return this.SecondUnitsFetch;
  }
  /** Set the SortOrder for field: SecondUnits (CDR_DATA.second_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSecondUnitsSortOrder (Integer value) {
    this.SecondUnitsSort = value;
  }
  /** Retrieve SortOrder for field: SecondUnits (CDR_DATA.second_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSecondUnitsSortOrder () {
    return this.SecondUnitsSort;
  }
  /** Set the sort direction for field: SecondUnits (CDR_DATA.second_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSecondUnitsSortDirection (boolean ascending) {
    this.SecondUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SecondUnits (CDR_DATA.second_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSecondUnitsSortDirection () {
    return this.SecondUnitsSortAscending;
  }
  /** Set the field level filters for field: SecondUnits (CDR_DATA.second_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSecondUnitsFilter (BigIntegerFilter[] value) throws ServiceException {
    this.SecondUnits = value;
  }
  /** Retrieve filter for field: SecondUnits (CDR_DATA.second_units)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getSecondUnitsFilter () {
    return this.SecondUnits;
  }

  /**
   * Retrieves the SecondUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SecondUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SecondUnitsFilter field
   */
  public String[] getSecondUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecondUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSecondUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSecondUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SecondUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSecondUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SecondUnitsFilter filter value from a formatted string
   *
   * @param _value the SecondUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SecondUnitsFilter filter field
   */
  public void setSecondUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSecondUnitsFilterFromFormattedString");
    try {
      this.setSecondUnitsFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SecondUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSecondUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSecondUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ThirdUnits (CDR_DATA.third_units)
   * @param fetch whether to fetch this field or not
   */
  public void setThirdUnitsFetch (boolean fetch) {
    this.ThirdUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: ThirdUnits (CDR_DATA.third_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getThirdUnitsFetch () {
    return this.ThirdUnitsFetch;
  }
  /** Set the SortOrder for field: ThirdUnits (CDR_DATA.third_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setThirdUnitsSortOrder (Integer value) {
    this.ThirdUnitsSort = value;
  }
  /** Retrieve SortOrder for field: ThirdUnits (CDR_DATA.third_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getThirdUnitsSortOrder () {
    return this.ThirdUnitsSort;
  }
  /** Set the sort direction for field: ThirdUnits (CDR_DATA.third_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setThirdUnitsSortDirection (boolean ascending) {
    this.ThirdUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ThirdUnits (CDR_DATA.third_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getThirdUnitsSortDirection () {
    return this.ThirdUnitsSortAscending;
  }
  /** Set the field level filters for field: ThirdUnits (CDR_DATA.third_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setThirdUnitsFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ThirdUnits = value;
  }
  /** Retrieve filter for field: ThirdUnits (CDR_DATA.third_units)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getThirdUnitsFilter () {
    return this.ThirdUnits;
  }

  /**
   * Retrieves the ThirdUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ThirdUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ThirdUnitsFilter field
   */
  public String[] getThirdUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThirdUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getThirdUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getThirdUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ThirdUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getThirdUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ThirdUnitsFilter filter value from a formatted string
   *
   * @param _value the ThirdUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ThirdUnitsFilter filter field
   */
  public void setThirdUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setThirdUnitsFilterFromFormattedString");
    try {
      this.setThirdUnitsFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ThirdUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setThirdUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setThirdUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UnitsCurrencyCode (CDR_DATA.units_currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setUnitsCurrencyCodeFetch (boolean fetch) {
    this.UnitsCurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: UnitsCurrencyCode (CDR_DATA.units_currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getUnitsCurrencyCodeFetch () {
    return this.UnitsCurrencyCodeFetch;
  }
  /** Set the SortOrder for field: UnitsCurrencyCode (CDR_DATA.units_currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnitsCurrencyCodeSortOrder (Integer value) {
    this.UnitsCurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: UnitsCurrencyCode (CDR_DATA.units_currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnitsCurrencyCodeSortOrder () {
    return this.UnitsCurrencyCodeSort;
  }
  /** Set the sort direction for field: UnitsCurrencyCode (CDR_DATA.units_currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnitsCurrencyCodeSortDirection (boolean ascending) {
    this.UnitsCurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UnitsCurrencyCode (CDR_DATA.units_currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnitsCurrencyCodeSortDirection () {
    return this.UnitsCurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: UnitsCurrencyCode (CDR_DATA.units_currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnitsCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.UnitsCurrencyCode = value;
  }
  /** Retrieve filter for field: UnitsCurrencyCode (CDR_DATA.units_currency_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUnitsCurrencyCodeFilter () {
    return this.UnitsCurrencyCode;
  }

  /**
   * Retrieves the UnitsCurrencyCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UnitsCurrencyCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitsCurrencyCodeFilter field
   */
  public String[] getUnitsCurrencyCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsCurrencyCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUnitsCurrencyCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsCurrencyCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsCurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsCurrencyCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UnitsCurrencyCodeFilter filter value from a formatted string
   *
   * @param _value the UnitsCurrencyCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UnitsCurrencyCodeFilter filter field
   */
  public void setUnitsCurrencyCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnitsCurrencyCodeFilterFromFormattedString");
    try {
      this.setUnitsCurrencyCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsCurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsCurrencyCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsCurrencyCodeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated UnitsCurrencyCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the UnitsCurrencyCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the UnitsCurrencyCodeFilter filter field
   */
  public String[] getUnitsCurrencyCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsCurrencyCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getUnitsCurrencyCodeFilter(), "Currency", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsCurrencyCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsCurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsCurrencyCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated UnitsCurrencyCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the UnitsCurrencyCodeFilter filter field
   */
  public void setUnitsCurrencyCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnitsCurrencyCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setUnitsCurrencyCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "UnitsCurrencyCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsCurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsCurrencyCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsCurrencyCodeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: BillingUnitsType (CDR_DATA.billing_units_type)
   * @param fetch whether to fetch this field or not
   */
  public void setBillingUnitsTypeFetch (boolean fetch) {
    this.BillingUnitsTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillingUnitsType (CDR_DATA.billing_units_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillingUnitsTypeFetch () {
    return this.BillingUnitsTypeFetch;
  }
  /** Set the SortOrder for field: BillingUnitsType (CDR_DATA.billing_units_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillingUnitsTypeSortOrder (Integer value) {
    this.BillingUnitsTypeSort = value;
  }
  /** Retrieve SortOrder for field: BillingUnitsType (CDR_DATA.billing_units_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillingUnitsTypeSortOrder () {
    return this.BillingUnitsTypeSort;
  }
  /** Set the sort direction for field: BillingUnitsType (CDR_DATA.billing_units_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillingUnitsTypeSortDirection (boolean ascending) {
    this.BillingUnitsTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillingUnitsType (CDR_DATA.billing_units_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillingUnitsTypeSortDirection () {
    return this.BillingUnitsTypeSortAscending;
  }
  /** Set the field level filters for field: BillingUnitsType (CDR_DATA.billing_units_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillingUnitsTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.BillingUnitsType = value;
  }
  /** Retrieve filter for field: BillingUnitsType (CDR_DATA.billing_units_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillingUnitsTypeFilter () {
    return this.BillingUnitsType;
  }

  /**
   * Retrieves the BillingUnitsTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillingUnitsTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingUnitsTypeFilter field
   */
  public String[] getBillingUnitsTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingUnitsTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillingUnitsTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingUnitsTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingUnitsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingUnitsTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillingUnitsTypeFilter filter value from a formatted string
   *
   * @param _value the BillingUnitsTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillingUnitsTypeFilter filter field
   */
  public void setBillingUnitsTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingUnitsTypeFilterFromFormattedString");
    try {
      this.setBillingUnitsTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingUnitsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingUnitsTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingUnitsTypeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated BillingUnitsTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillingUnitsTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillingUnitsTypeFilter filter field
   */
  public String[] getBillingUnitsTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingUnitsTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getBillingUnitsTypeFilter(), "UnitsType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingUnitsTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingUnitsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingUnitsTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated BillingUnitsTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BillingUnitsTypeFilter filter field
   */
  public void setBillingUnitsTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingUnitsTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setBillingUnitsTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "BillingUnitsType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingUnitsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingUnitsTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingUnitsTypeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: ProfileId (CDR_DATA.profile_id)
   * @param fetch whether to fetch this field or not
   */
  public void setProfileIdFetch (boolean fetch) {
    this.ProfileIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProfileId (CDR_DATA.profile_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getProfileIdFetch () {
    return this.ProfileIdFetch;
  }
  /** Set the SortOrder for field: ProfileId (CDR_DATA.profile_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProfileIdSortOrder (Integer value) {
    this.ProfileIdSort = value;
  }
  /** Retrieve SortOrder for field: ProfileId (CDR_DATA.profile_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProfileIdSortOrder () {
    return this.ProfileIdSort;
  }
  /** Set the sort direction for field: ProfileId (CDR_DATA.profile_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProfileIdSortDirection (boolean ascending) {
    this.ProfileIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProfileId (CDR_DATA.profile_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProfileIdSortDirection () {
    return this.ProfileIdSortAscending;
  }
  /** Set the field level filters for field: ProfileId (CDR_DATA.profile_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProfileIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ProfileId = value;
  }
  /** Retrieve filter for field: ProfileId (CDR_DATA.profile_id)
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

  /** Set the field level Fetch value for field: Annotation (CDR_DATA.annotation)
   * @param fetch whether to fetch this field or not
   */
  public void setAnnotationFetch (boolean fetch) {
    this.AnnotationFetch = fetch;
  }
  /** Retrieve Fetch value for field: Annotation (CDR_DATA.annotation)
   * @return boolean the Fetch value for this field
   */
  public boolean getAnnotationFetch () {
    return this.AnnotationFetch;
  }
  /** Set the SortOrder for field: Annotation (CDR_DATA.annotation)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAnnotationSortOrder (Integer value) {
    this.AnnotationSort = value;
  }
  /** Retrieve SortOrder for field: Annotation (CDR_DATA.annotation)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAnnotationSortOrder () {
    return this.AnnotationSort;
  }
  /** Set the sort direction for field: Annotation (CDR_DATA.annotation)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAnnotationSortDirection (boolean ascending) {
    this.AnnotationSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Annotation (CDR_DATA.annotation)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAnnotationSortDirection () {
    return this.AnnotationSortAscending;
  }
  /** Set the case insensitive for field: Annotation (CDR_DATA.annotation)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAnnotationCaseInsensitive (boolean ascending) {
    this.AnnotationCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Annotation (CDR_DATA.annotation)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAnnotationCaseInsensitive () {
    return this.AnnotationCaseInsensitive;
  }
  /** Set the field level filters for field: Annotation (CDR_DATA.annotation)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAnnotationFilter (StringFilter[] value) throws ServiceException {
    this.Annotation = value;
  }
  /** Retrieve filter for field: Annotation (CDR_DATA.annotation)
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

  /** Set the field level Fetch value for field: CustomerTag (CDR_DATA.customer_tag)
   * @param fetch whether to fetch this field or not
   */
  public void setCustomerTagFetch (boolean fetch) {
    this.CustomerTagFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustomerTag (CDR_DATA.customer_tag)
   * @return boolean the Fetch value for this field
   */
  public boolean getCustomerTagFetch () {
    return this.CustomerTagFetch;
  }
  /** Set the SortOrder for field: CustomerTag (CDR_DATA.customer_tag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustomerTagSortOrder (Integer value) {
    this.CustomerTagSort = value;
  }
  /** Retrieve SortOrder for field: CustomerTag (CDR_DATA.customer_tag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustomerTagSortOrder () {
    return this.CustomerTagSort;
  }
  /** Set the sort direction for field: CustomerTag (CDR_DATA.customer_tag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustomerTagSortDirection (boolean ascending) {
    this.CustomerTagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustomerTag (CDR_DATA.customer_tag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustomerTagSortDirection () {
    return this.CustomerTagSortAscending;
  }
  /** Set the case insensitive for field: CustomerTag (CDR_DATA.customer_tag)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustomerTagCaseInsensitive (boolean ascending) {
    this.CustomerTagCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustomerTag (CDR_DATA.customer_tag)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCustomerTagCaseInsensitive () {
    return this.CustomerTagCaseInsensitive;
  }
  /** Set the field level filters for field: CustomerTag (CDR_DATA.customer_tag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustomerTagFilter (StringFilter[] value) throws ServiceException {
    this.CustomerTag = value;
  }
  /** Retrieve filter for field: CustomerTag (CDR_DATA.customer_tag)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustomerTagFilter () {
    return this.CustomerTag;
  }

  /**
   * Retrieves the CustomerTagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CustomerTagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustomerTagFilter field
   */
  public String[] getCustomerTagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerTagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCustomerTagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerTagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustomerTagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustomerTagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CustomerTagFilter filter value from a formatted string
   *
   * @param _value the CustomerTagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CustomerTagFilter filter field
   */
  public void setCustomerTagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCustomerTagFilterFromFormattedString");
    try {
      this.setCustomerTagFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CustomerTagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustomerTagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustomerTagFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RatedUnits (CDR_DATA.rated_units)
   * @param fetch whether to fetch this field or not
   */
  public void setRatedUnitsFetch (boolean fetch) {
    this.RatedUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: RatedUnits (CDR_DATA.rated_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getRatedUnitsFetch () {
    return this.RatedUnitsFetch;
  }
  /** Set the SortOrder for field: RatedUnits (CDR_DATA.rated_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRatedUnitsSortOrder (Integer value) {
    this.RatedUnitsSort = value;
  }
  /** Retrieve SortOrder for field: RatedUnits (CDR_DATA.rated_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRatedUnitsSortOrder () {
    return this.RatedUnitsSort;
  }
  /** Set the sort direction for field: RatedUnits (CDR_DATA.rated_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRatedUnitsSortDirection (boolean ascending) {
    this.RatedUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RatedUnits (CDR_DATA.rated_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRatedUnitsSortDirection () {
    return this.RatedUnitsSortAscending;
  }
  /** Set the field level filters for field: RatedUnits (CDR_DATA.rated_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRatedUnitsFilter (BigIntegerFilter[] value) throws ServiceException {
    this.RatedUnits = value;
  }
  /** Retrieve filter for field: RatedUnits (CDR_DATA.rated_units)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getRatedUnitsFilter () {
    return this.RatedUnits;
  }

  /**
   * Retrieves the RatedUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RatedUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatedUnitsFilter field
   */
  public String[] getRatedUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatedUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRatedUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatedUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatedUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatedUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RatedUnitsFilter filter value from a formatted string
   *
   * @param _value the RatedUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RatedUnitsFilter filter field
   */
  public void setRatedUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRatedUnitsFilterFromFormattedString");
    try {
      this.setRatedUnitsFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatedUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatedUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatedUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Amount (CDR_DATA.amount)
   * @param fetch whether to fetch this field or not
   */
  public void setAmountFetch (boolean fetch) {
    this.AmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: Amount (CDR_DATA.amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getAmountFetch () {
    return this.AmountFetch;
  }
  /** Set the SortOrder for field: Amount (CDR_DATA.amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAmountSortOrder (Integer value) {
    this.AmountSort = value;
  }
  /** Retrieve SortOrder for field: Amount (CDR_DATA.amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAmountSortOrder () {
    return this.AmountSort;
  }
  /** Set the sort direction for field: Amount (CDR_DATA.amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAmountSortDirection (boolean ascending) {
    this.AmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Amount (CDR_DATA.amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAmountSortDirection () {
    return this.AmountSortAscending;
  }
  /** Set the field level filters for field: Amount (CDR_DATA.amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.Amount = value;
  }
  /** Retrieve filter for field: Amount (CDR_DATA.amount)
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


  /** Set the field level Fetch value for field: ForeignAmount (CDR_DATA.foreign_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setForeignAmountFetch (boolean fetch) {
    this.ForeignAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: ForeignAmount (CDR_DATA.foreign_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getForeignAmountFetch () {
    return this.ForeignAmountFetch;
  }
  /** Set the SortOrder for field: ForeignAmount (CDR_DATA.foreign_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setForeignAmountSortOrder (Integer value) {
    this.ForeignAmountSort = value;
  }
  /** Retrieve SortOrder for field: ForeignAmount (CDR_DATA.foreign_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getForeignAmountSortOrder () {
    return this.ForeignAmountSort;
  }
  /** Set the sort direction for field: ForeignAmount (CDR_DATA.foreign_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setForeignAmountSortDirection (boolean ascending) {
    this.ForeignAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ForeignAmount (CDR_DATA.foreign_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getForeignAmountSortDirection () {
    return this.ForeignAmountSortAscending;
  }
  /** Set the field level filters for field: ForeignAmount (CDR_DATA.foreign_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setForeignAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ForeignAmount = value;
  }
  /** Retrieve filter for field: ForeignAmount (CDR_DATA.foreign_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getForeignAmountFilter () {
    return this.ForeignAmount;
  }

  /**
   * Retrieves the ForeignAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ForeignAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ForeignAmountFilter field
   */
  public String[] getForeignAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getForeignAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getForeignAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getForeignAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ForeignAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getForeignAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ForeignAmountFilter filter value from a formatted string
   *
   * @param _value the ForeignAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ForeignAmountFilter filter field
   */
  public void setForeignAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setForeignAmountFilterFromFormattedString");
    try {
      this.setForeignAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ForeignAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setForeignAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setForeignAmountFilterFromFormattedString");
  }

  /**
   * Sets the ForeignAmountFilter filter value from a formatted string
   *
   * @param _value the ForeignAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ForeignAmountFilter filter field
   */
  public void setForeignAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setForeignAmountFilterFromFormattedCurrencyString");
    try {
      this.setForeignAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ForeignAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setForeignAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setForeignAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the ForeignAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ForeignAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the ForeignAmountFilter field
   */

  public String[] getForeignAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getForeignAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getForeignAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getForeignAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ForeignAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getForeignAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: RatePeriod (CDR_DATA.rate_period)
   * @param fetch whether to fetch this field or not
   */
  public void setRatePeriodFetch (boolean fetch) {
    this.RatePeriodFetch = fetch;
  }
  /** Retrieve Fetch value for field: RatePeriod (CDR_DATA.rate_period)
   * @return boolean the Fetch value for this field
   */
  public boolean getRatePeriodFetch () {
    return this.RatePeriodFetch;
  }
  /** Set the SortOrder for field: RatePeriod (CDR_DATA.rate_period)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRatePeriodSortOrder (Integer value) {
    this.RatePeriodSort = value;
  }
  /** Retrieve SortOrder for field: RatePeriod (CDR_DATA.rate_period)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRatePeriodSortOrder () {
    return this.RatePeriodSort;
  }
  /** Set the sort direction for field: RatePeriod (CDR_DATA.rate_period)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRatePeriodSortDirection (boolean ascending) {
    this.RatePeriodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RatePeriod (CDR_DATA.rate_period)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRatePeriodSortDirection () {
    return this.RatePeriodSortAscending;
  }
  /** Set the case insensitive for field: RatePeriod (CDR_DATA.rate_period)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setRatePeriodCaseInsensitive (boolean ascending) {
    this.RatePeriodCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: RatePeriod (CDR_DATA.rate_period)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getRatePeriodCaseInsensitive () {
    return this.RatePeriodCaseInsensitive;
  }
  /** Set the field level filters for field: RatePeriod (CDR_DATA.rate_period)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRatePeriodFilter (StringFilter[] value) throws ServiceException {
    this.RatePeriod = value;
  }
  /** Retrieve filter for field: RatePeriod (CDR_DATA.rate_period)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getRatePeriodFilter () {
    return this.RatePeriod;
  }

  /**
   * Retrieves the RatePeriodFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RatePeriodFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatePeriodFilter field
   */
  public String[] getRatePeriodFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatePeriodFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRatePeriodFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatePeriodFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatePeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatePeriodFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RatePeriodFilter filter value from a formatted string
   *
   * @param _value the RatePeriodFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RatePeriodFilter filter field
   */
  public void setRatePeriodFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRatePeriodFilterFromFormattedString");
    try {
      this.setRatePeriodFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatePeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatePeriodFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatePeriodFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated RatePeriodFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the RatePeriodFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RatePeriodFilter filter field
   */
  public String[] getRatePeriodFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatePeriodFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getRatePeriodFilter(), "RatePeriod", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatePeriodFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatePeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatePeriodFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated RatePeriodFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the RatePeriodFilter filter field
   */
  public void setRatePeriodFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRatePeriodFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setRatePeriodFilter((StringFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "RatePeriod", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatePeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatePeriodFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatePeriodFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: NoBill (CDR_DATA.no_bill)
   * @param fetch whether to fetch this field or not
   */
  public void setNoBillFetch (boolean fetch) {
    this.NoBillFetch = fetch;
  }
  /** Retrieve Fetch value for field: NoBill (CDR_DATA.no_bill)
   * @return boolean the Fetch value for this field
   */
  public boolean getNoBillFetch () {
    return this.NoBillFetch;
  }
  /** Set the SortOrder for field: NoBill (CDR_DATA.no_bill)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNoBillSortOrder (Integer value) {
    this.NoBillSort = value;
  }
  /** Retrieve SortOrder for field: NoBill (CDR_DATA.no_bill)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNoBillSortOrder () {
    return this.NoBillSort;
  }
  /** Set the sort direction for field: NoBill (CDR_DATA.no_bill)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNoBillSortDirection (boolean ascending) {
    this.NoBillSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NoBill (CDR_DATA.no_bill)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNoBillSortDirection () {
    return this.NoBillSortAscending;
  }
  /** Set the field level filters for field: NoBill (CDR_DATA.no_bill)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNoBillFilter (BooleanFilter[] value) throws ServiceException {
    this.NoBill = value;
  }
  /** Retrieve filter for field: NoBill (CDR_DATA.no_bill)
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

  /** Set the field level Fetch value for field: CompStatus (CDR_DATA.comp_status)
   * @param fetch whether to fetch this field or not
   */
  public void setCompStatusFetch (boolean fetch) {
    this.CompStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: CompStatus (CDR_DATA.comp_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getCompStatusFetch () {
    return this.CompStatusFetch;
  }
  /** Set the SortOrder for field: CompStatus (CDR_DATA.comp_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCompStatusSortOrder (Integer value) {
    this.CompStatusSort = value;
  }
  /** Retrieve SortOrder for field: CompStatus (CDR_DATA.comp_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCompStatusSortOrder () {
    return this.CompStatusSort;
  }
  /** Set the sort direction for field: CompStatus (CDR_DATA.comp_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCompStatusSortDirection (boolean ascending) {
    this.CompStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CompStatus (CDR_DATA.comp_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCompStatusSortDirection () {
    return this.CompStatusSortAscending;
  }
  /** Set the field level filters for field: CompStatus (CDR_DATA.comp_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCompStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.CompStatus = value;
  }
  /** Retrieve filter for field: CompStatus (CDR_DATA.comp_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCompStatusFilter () {
    return this.CompStatus;
  }

  /**
   * Retrieves the CompStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CompStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CompStatusFilter field
   */
  public String[] getCompStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCompStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCompStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCompStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CompStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCompStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CompStatusFilter filter value from a formatted string
   *
   * @param _value the CompStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CompStatusFilter filter field
   */
  public void setCompStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCompStatusFilterFromFormattedString");
    try {
      this.setCompStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CompStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCompStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCompStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CdrStatus (CDR_DATA.cdr_status)
   * @param fetch whether to fetch this field or not
   */
  public void setCdrStatusFetch (boolean fetch) {
    this.CdrStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: CdrStatus (CDR_DATA.cdr_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getCdrStatusFetch () {
    return this.CdrStatusFetch;
  }
  /** Set the SortOrder for field: CdrStatus (CDR_DATA.cdr_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCdrStatusSortOrder (Integer value) {
    this.CdrStatusSort = value;
  }
  /** Retrieve SortOrder for field: CdrStatus (CDR_DATA.cdr_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCdrStatusSortOrder () {
    return this.CdrStatusSort;
  }
  /** Set the sort direction for field: CdrStatus (CDR_DATA.cdr_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCdrStatusSortDirection (boolean ascending) {
    this.CdrStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CdrStatus (CDR_DATA.cdr_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCdrStatusSortDirection () {
    return this.CdrStatusSortAscending;
  }
  /** Set the field level filters for field: CdrStatus (CDR_DATA.cdr_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCdrStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.CdrStatus = value;
  }
  /** Retrieve filter for field: CdrStatus (CDR_DATA.cdr_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCdrStatusFilter () {
    return this.CdrStatus;
  }

  /**
   * Retrieves the CdrStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CdrStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CdrStatusFilter field
   */
  public String[] getCdrStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCdrStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCdrStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCdrStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CdrStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCdrStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CdrStatusFilter filter value from a formatted string
   *
   * @param _value the CdrStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CdrStatusFilter filter field
   */
  public void setCdrStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCdrStatusFilterFromFormattedString");
    try {
      this.setCdrStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CdrStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCdrStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCdrStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FileId (CDR_DATA.file_id)
   * @param fetch whether to fetch this field or not
   */
  public void setFileIdFetch (boolean fetch) {
    this.FileIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: FileId (CDR_DATA.file_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getFileIdFetch () {
    return this.FileIdFetch;
  }
  /** Set the SortOrder for field: FileId (CDR_DATA.file_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFileIdSortOrder (Integer value) {
    this.FileIdSort = value;
  }
  /** Retrieve SortOrder for field: FileId (CDR_DATA.file_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFileIdSortOrder () {
    return this.FileIdSort;
  }
  /** Set the sort direction for field: FileId (CDR_DATA.file_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFileIdSortDirection (boolean ascending) {
    this.FileIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FileId (CDR_DATA.file_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFileIdSortDirection () {
    return this.FileIdSortAscending;
  }
  /** Set the field level filters for field: FileId (CDR_DATA.file_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFileIdFilter (IntegerFilter[] value) throws ServiceException {
    this.FileId = value;
  }
  /** Retrieve filter for field: FileId (CDR_DATA.file_id)
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

  /** Set the field level Fetch value for field: FileIdServ (CDR_DATA.file_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setFileIdServFetch (boolean fetch) {
    this.FileIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: FileIdServ (CDR_DATA.file_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getFileIdServFetch () {
    return this.FileIdServFetch;
  }
  /** Set the SortOrder for field: FileIdServ (CDR_DATA.file_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFileIdServSortOrder (Integer value) {
    this.FileIdServSort = value;
  }
  /** Retrieve SortOrder for field: FileIdServ (CDR_DATA.file_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFileIdServSortOrder () {
    return this.FileIdServSort;
  }
  /** Set the sort direction for field: FileIdServ (CDR_DATA.file_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFileIdServSortDirection (boolean ascending) {
    this.FileIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FileIdServ (CDR_DATA.file_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFileIdServSortDirection () {
    return this.FileIdServSortAscending;
  }
  /** Set the field level filters for field: FileIdServ (CDR_DATA.file_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFileIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.FileIdServ = value;
  }
  /** Retrieve filter for field: FileIdServ (CDR_DATA.file_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getFileIdServFilter () {
    return this.FileIdServ;
  }

  /**
   * Retrieves the FileIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FileIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FileIdServFilter field
   */
  public String[] getFileIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFileIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFileIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFileIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FileIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFileIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FileIdServFilter filter value from a formatted string
   *
   * @param _value the FileIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FileIdServFilter filter field
   */
  public void setFileIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFileIdServFilterFromFormattedString");
    try {
      this.setFileIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FileIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFileIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFileIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RevRcvCostCtr (CDR_DATA.rev_rcv_cost_ctr)
   * @param fetch whether to fetch this field or not
   */
  public void setRevRcvCostCtrFetch (boolean fetch) {
    this.RevRcvCostCtrFetch = fetch;
  }
  /** Retrieve Fetch value for field: RevRcvCostCtr (CDR_DATA.rev_rcv_cost_ctr)
   * @return boolean the Fetch value for this field
   */
  public boolean getRevRcvCostCtrFetch () {
    return this.RevRcvCostCtrFetch;
  }
  /** Set the SortOrder for field: RevRcvCostCtr (CDR_DATA.rev_rcv_cost_ctr)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRevRcvCostCtrSortOrder (Integer value) {
    this.RevRcvCostCtrSort = value;
  }
  /** Retrieve SortOrder for field: RevRcvCostCtr (CDR_DATA.rev_rcv_cost_ctr)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRevRcvCostCtrSortOrder () {
    return this.RevRcvCostCtrSort;
  }
  /** Set the sort direction for field: RevRcvCostCtr (CDR_DATA.rev_rcv_cost_ctr)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRevRcvCostCtrSortDirection (boolean ascending) {
    this.RevRcvCostCtrSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RevRcvCostCtr (CDR_DATA.rev_rcv_cost_ctr)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRevRcvCostCtrSortDirection () {
    return this.RevRcvCostCtrSortAscending;
  }
  /** Set the field level filters for field: RevRcvCostCtr (CDR_DATA.rev_rcv_cost_ctr)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRevRcvCostCtrFilter (IntegerFilter[] value) throws ServiceException {
    this.RevRcvCostCtr = value;
  }
  /** Retrieve filter for field: RevRcvCostCtr (CDR_DATA.rev_rcv_cost_ctr)
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


  /** Set the field level Fetch value for field: ArchFlag (CDR_DATA.arch_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setArchFlagFetch (boolean fetch) {
    this.ArchFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: ArchFlag (CDR_DATA.arch_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getArchFlagFetch () {
    return this.ArchFlagFetch;
  }
  /** Set the SortOrder for field: ArchFlag (CDR_DATA.arch_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setArchFlagSortOrder (Integer value) {
    this.ArchFlagSort = value;
  }
  /** Retrieve SortOrder for field: ArchFlag (CDR_DATA.arch_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getArchFlagSortOrder () {
    return this.ArchFlagSort;
  }
  /** Set the sort direction for field: ArchFlag (CDR_DATA.arch_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setArchFlagSortDirection (boolean ascending) {
    this.ArchFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ArchFlag (CDR_DATA.arch_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getArchFlagSortDirection () {
    return this.ArchFlagSortAscending;
  }
  /** Set the field level filters for field: ArchFlag (CDR_DATA.arch_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setArchFlagFilter (BooleanFilter[] value) throws ServiceException {
    this.ArchFlag = value;
  }
  /** Retrieve filter for field: ArchFlag (CDR_DATA.arch_flag)
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

  /** Set the field level Fetch value for field: UnroundedAmount (CDR_DATA.unrounded_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setUnroundedAmountFetch (boolean fetch) {
    this.UnroundedAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: UnroundedAmount (CDR_DATA.unrounded_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getUnroundedAmountFetch () {
    return this.UnroundedAmountFetch;
  }
  /** Set the SortOrder for field: UnroundedAmount (CDR_DATA.unrounded_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnroundedAmountSortOrder (Integer value) {
    this.UnroundedAmountSort = value;
  }
  /** Retrieve SortOrder for field: UnroundedAmount (CDR_DATA.unrounded_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnroundedAmountSortOrder () {
    return this.UnroundedAmountSort;
  }
  /** Set the sort direction for field: UnroundedAmount (CDR_DATA.unrounded_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnroundedAmountSortDirection (boolean ascending) {
    this.UnroundedAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UnroundedAmount (CDR_DATA.unrounded_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnroundedAmountSortDirection () {
    return this.UnroundedAmountSortAscending;
  }
  /** Set the field level filters for field: UnroundedAmount (CDR_DATA.unrounded_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnroundedAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.UnroundedAmount = value;
  }
  /** Retrieve filter for field: UnroundedAmount (CDR_DATA.unrounded_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getUnroundedAmountFilter () {
    return this.UnroundedAmount;
  }

  /**
   * Retrieves the UnroundedAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UnroundedAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnroundedAmountFilter field
   */
  public String[] getUnroundedAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnroundedAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUnroundedAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnroundedAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnroundedAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnroundedAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UnroundedAmountFilter filter value from a formatted string
   *
   * @param _value the UnroundedAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UnroundedAmountFilter filter field
   */
  public void setUnroundedAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnroundedAmountFilterFromFormattedString");
    try {
      this.setUnroundedAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnroundedAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnroundedAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnroundedAmountFilterFromFormattedString");
  }

  /**
   * Sets the UnroundedAmountFilter filter value from a formatted string
   *
   * @param _value the UnroundedAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UnroundedAmountFilter filter field
   */
  public void setUnroundedAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnroundedAmountFilterFromFormattedCurrencyString");
    try {
      this.setUnroundedAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnroundedAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnroundedAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnroundedAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the UnroundedAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UnroundedAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnroundedAmountFilter field
   */

  public String[] getUnroundedAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnroundedAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUnroundedAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnroundedAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnroundedAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnroundedAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: CorridorPlanId (CDR_DATA.corridor_plan_id)
   * @param fetch whether to fetch this field or not
   */
  public void setCorridorPlanIdFetch (boolean fetch) {
    this.CorridorPlanIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: CorridorPlanId (CDR_DATA.corridor_plan_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getCorridorPlanIdFetch () {
    return this.CorridorPlanIdFetch;
  }
  /** Set the SortOrder for field: CorridorPlanId (CDR_DATA.corridor_plan_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCorridorPlanIdSortOrder (Integer value) {
    this.CorridorPlanIdSort = value;
  }
  /** Retrieve SortOrder for field: CorridorPlanId (CDR_DATA.corridor_plan_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCorridorPlanIdSortOrder () {
    return this.CorridorPlanIdSort;
  }
  /** Set the sort direction for field: CorridorPlanId (CDR_DATA.corridor_plan_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCorridorPlanIdSortDirection (boolean ascending) {
    this.CorridorPlanIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CorridorPlanId (CDR_DATA.corridor_plan_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCorridorPlanIdSortDirection () {
    return this.CorridorPlanIdSortAscending;
  }
  /** Set the field level filters for field: CorridorPlanId (CDR_DATA.corridor_plan_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCorridorPlanIdFilter (IntegerFilter[] value) throws ServiceException {
    this.CorridorPlanId = value;
  }
  /** Retrieve filter for field: CorridorPlanId (CDR_DATA.corridor_plan_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCorridorPlanIdFilter () {
    return this.CorridorPlanId;
  }

  /**
   * Retrieves the CorridorPlanIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CorridorPlanIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CorridorPlanIdFilter field
   */
  public String[] getCorridorPlanIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorPlanIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCorridorPlanIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorPlanIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorPlanIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCorridorPlanIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CorridorPlanIdFilter filter value from a formatted string
   *
   * @param _value the CorridorPlanIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CorridorPlanIdFilter filter field
   */
  public void setCorridorPlanIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCorridorPlanIdFilterFromFormattedString");
    try {
      this.setCorridorPlanIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorPlanIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCorridorPlanIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCorridorPlanIdFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated CorridorPlanIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CorridorPlanIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CorridorPlanIdFilter filter field
   */
  public String[] getCorridorPlanIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorPlanIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getCorridorPlanIdFilter(), "CorridorPlan", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorPlanIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorPlanIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCorridorPlanIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated CorridorPlanIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the CorridorPlanIdFilter filter field
   */
  public void setCorridorPlanIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCorridorPlanIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setCorridorPlanIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "CorridorPlanId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorPlanIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCorridorPlanIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCorridorPlanIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: CellIdOrigin (CDR_DATA.cell_id_origin)
   * @param fetch whether to fetch this field or not
   */
  public void setCellIdOriginFetch (boolean fetch) {
    this.CellIdOriginFetch = fetch;
  }
  /** Retrieve Fetch value for field: CellIdOrigin (CDR_DATA.cell_id_origin)
   * @return boolean the Fetch value for this field
   */
  public boolean getCellIdOriginFetch () {
    return this.CellIdOriginFetch;
  }
  /** Set the SortOrder for field: CellIdOrigin (CDR_DATA.cell_id_origin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCellIdOriginSortOrder (Integer value) {
    this.CellIdOriginSort = value;
  }
  /** Retrieve SortOrder for field: CellIdOrigin (CDR_DATA.cell_id_origin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCellIdOriginSortOrder () {
    return this.CellIdOriginSort;
  }
  /** Set the sort direction for field: CellIdOrigin (CDR_DATA.cell_id_origin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCellIdOriginSortDirection (boolean ascending) {
    this.CellIdOriginSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CellIdOrigin (CDR_DATA.cell_id_origin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCellIdOriginSortDirection () {
    return this.CellIdOriginSortAscending;
  }
  /** Set the field level filters for field: CellIdOrigin (CDR_DATA.cell_id_origin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCellIdOriginFilter (IntegerFilter[] value) throws ServiceException {
    this.CellIdOrigin = value;
  }
  /** Retrieve filter for field: CellIdOrigin (CDR_DATA.cell_id_origin)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCellIdOriginFilter () {
    return this.CellIdOrigin;
  }

  /**
   * Retrieves the CellIdOriginFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CellIdOriginFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CellIdOriginFilter field
   */
  public String[] getCellIdOriginFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCellIdOriginFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCellIdOriginFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCellIdOriginFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CellIdOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCellIdOriginFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CellIdOriginFilter filter value from a formatted string
   *
   * @param _value the CellIdOriginFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CellIdOriginFilter filter field
   */
  public void setCellIdOriginFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCellIdOriginFilterFromFormattedString");
    try {
      this.setCellIdOriginFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CellIdOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCellIdOriginFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCellIdOriginFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OrigTypeIdUsg (CDR_DATA.orig_type_id_usg)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigTypeIdUsgFetch (boolean fetch) {
    this.OrigTypeIdUsgFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigTypeIdUsg (CDR_DATA.orig_type_id_usg)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigTypeIdUsgFetch () {
    return this.OrigTypeIdUsgFetch;
  }
  /** Set the SortOrder for field: OrigTypeIdUsg (CDR_DATA.orig_type_id_usg)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigTypeIdUsgSortOrder (Integer value) {
    this.OrigTypeIdUsgSort = value;
  }
  /** Retrieve SortOrder for field: OrigTypeIdUsg (CDR_DATA.orig_type_id_usg)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigTypeIdUsgSortOrder () {
    return this.OrigTypeIdUsgSort;
  }
  /** Set the sort direction for field: OrigTypeIdUsg (CDR_DATA.orig_type_id_usg)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigTypeIdUsgSortDirection (boolean ascending) {
    this.OrigTypeIdUsgSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigTypeIdUsg (CDR_DATA.orig_type_id_usg)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigTypeIdUsgSortDirection () {
    return this.OrigTypeIdUsgSortAscending;
  }
  /** Set the field level filters for field: OrigTypeIdUsg (CDR_DATA.orig_type_id_usg)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigTypeIdUsgFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigTypeIdUsg = value;
  }
  /** Retrieve filter for field: OrigTypeIdUsg (CDR_DATA.orig_type_id_usg)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigTypeIdUsgFilter () {
    return this.OrigTypeIdUsg;
  }

  /**
   * Retrieves the OrigTypeIdUsgFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigTypeIdUsgFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigTypeIdUsgFilter field
   */
  public String[] getOrigTypeIdUsgFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTypeIdUsgFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigTypeIdUsgFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTypeIdUsgFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTypeIdUsgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTypeIdUsgFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigTypeIdUsgFilter filter value from a formatted string
   *
   * @param _value the OrigTypeIdUsgFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigTypeIdUsgFilter filter field
   */
  public void setOrigTypeIdUsgFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigTypeIdUsgFilterFromFormattedString");
    try {
      this.setOrigTypeIdUsgFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTypeIdUsgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTypeIdUsgFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigTypeIdUsgFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccessRegionOrigin (CDR_DATA.access_region_origin)
   * @param fetch whether to fetch this field or not
   */
  public void setAccessRegionOriginFetch (boolean fetch) {
    this.AccessRegionOriginFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccessRegionOrigin (CDR_DATA.access_region_origin)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccessRegionOriginFetch () {
    return this.AccessRegionOriginFetch;
  }
  /** Set the SortOrder for field: AccessRegionOrigin (CDR_DATA.access_region_origin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccessRegionOriginSortOrder (Integer value) {
    this.AccessRegionOriginSort = value;
  }
  /** Retrieve SortOrder for field: AccessRegionOrigin (CDR_DATA.access_region_origin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccessRegionOriginSortOrder () {
    return this.AccessRegionOriginSort;
  }
  /** Set the sort direction for field: AccessRegionOrigin (CDR_DATA.access_region_origin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccessRegionOriginSortDirection (boolean ascending) {
    this.AccessRegionOriginSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccessRegionOrigin (CDR_DATA.access_region_origin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccessRegionOriginSortDirection () {
    return this.AccessRegionOriginSortAscending;
  }
  /** Set the case insensitive for field: AccessRegionOrigin (CDR_DATA.access_region_origin)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAccessRegionOriginCaseInsensitive (boolean ascending) {
    this.AccessRegionOriginCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AccessRegionOrigin (CDR_DATA.access_region_origin)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAccessRegionOriginCaseInsensitive () {
    return this.AccessRegionOriginCaseInsensitive;
  }
  /** Set the field level filters for field: AccessRegionOrigin (CDR_DATA.access_region_origin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccessRegionOriginFilter (StringFilter[] value) throws ServiceException {
    this.AccessRegionOrigin = value;
  }
  /** Retrieve filter for field: AccessRegionOrigin (CDR_DATA.access_region_origin)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAccessRegionOriginFilter () {
    return this.AccessRegionOrigin;
  }

  /**
   * Retrieves the AccessRegionOriginFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccessRegionOriginFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccessRegionOriginFilter field
   */
  public String[] getAccessRegionOriginFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccessRegionOriginFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccessRegionOriginFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccessRegionOriginFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccessRegionOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccessRegionOriginFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccessRegionOriginFilter filter value from a formatted string
   *
   * @param _value the AccessRegionOriginFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccessRegionOriginFilter filter field
   */
  public void setAccessRegionOriginFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccessRegionOriginFilterFromFormattedString");
    try {
      this.setAccessRegionOriginFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccessRegionOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccessRegionOriginFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccessRegionOriginFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccessRegionTarget (CDR_DATA.access_region_target)
   * @param fetch whether to fetch this field or not
   */
  public void setAccessRegionTargetFetch (boolean fetch) {
    this.AccessRegionTargetFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccessRegionTarget (CDR_DATA.access_region_target)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccessRegionTargetFetch () {
    return this.AccessRegionTargetFetch;
  }
  /** Set the SortOrder for field: AccessRegionTarget (CDR_DATA.access_region_target)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccessRegionTargetSortOrder (Integer value) {
    this.AccessRegionTargetSort = value;
  }
  /** Retrieve SortOrder for field: AccessRegionTarget (CDR_DATA.access_region_target)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccessRegionTargetSortOrder () {
    return this.AccessRegionTargetSort;
  }
  /** Set the sort direction for field: AccessRegionTarget (CDR_DATA.access_region_target)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccessRegionTargetSortDirection (boolean ascending) {
    this.AccessRegionTargetSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccessRegionTarget (CDR_DATA.access_region_target)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccessRegionTargetSortDirection () {
    return this.AccessRegionTargetSortAscending;
  }
  /** Set the case insensitive for field: AccessRegionTarget (CDR_DATA.access_region_target)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAccessRegionTargetCaseInsensitive (boolean ascending) {
    this.AccessRegionTargetCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AccessRegionTarget (CDR_DATA.access_region_target)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAccessRegionTargetCaseInsensitive () {
    return this.AccessRegionTargetCaseInsensitive;
  }
  /** Set the field level filters for field: AccessRegionTarget (CDR_DATA.access_region_target)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccessRegionTargetFilter (StringFilter[] value) throws ServiceException {
    this.AccessRegionTarget = value;
  }
  /** Retrieve filter for field: AccessRegionTarget (CDR_DATA.access_region_target)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAccessRegionTargetFilter () {
    return this.AccessRegionTarget;
  }

  /**
   * Retrieves the AccessRegionTargetFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccessRegionTargetFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccessRegionTargetFilter field
   */
  public String[] getAccessRegionTargetFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccessRegionTargetFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccessRegionTargetFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccessRegionTargetFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccessRegionTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccessRegionTargetFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccessRegionTargetFilter filter value from a formatted string
   *
   * @param _value the AccessRegionTargetFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccessRegionTargetFilter filter field
   */
  public void setAccessRegionTargetFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccessRegionTargetFilterFromFormattedString");
    try {
      this.setAccessRegionTargetFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccessRegionTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccessRegionTargetFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccessRegionTargetFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OpenItemId (CDR_DATA.open_item_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOpenItemIdFetch (boolean fetch) {
    this.OpenItemIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OpenItemId (CDR_DATA.open_item_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOpenItemIdFetch () {
    return this.OpenItemIdFetch;
  }
  /** Set the SortOrder for field: OpenItemId (CDR_DATA.open_item_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOpenItemIdSortOrder (Integer value) {
    this.OpenItemIdSort = value;
  }
  /** Retrieve SortOrder for field: OpenItemId (CDR_DATA.open_item_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOpenItemIdSortOrder () {
    return this.OpenItemIdSort;
  }
  /** Set the sort direction for field: OpenItemId (CDR_DATA.open_item_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOpenItemIdSortDirection (boolean ascending) {
    this.OpenItemIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OpenItemId (CDR_DATA.open_item_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOpenItemIdSortDirection () {
    return this.OpenItemIdSortAscending;
  }
  /** Set the field level filters for field: OpenItemId (CDR_DATA.open_item_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOpenItemIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OpenItemId = value;
  }
  /** Retrieve filter for field: OpenItemId (CDR_DATA.open_item_id)
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


  /** Set the field level Fetch value for field: NumRecords (CDR_DATA.num_records)
   * @param fetch whether to fetch this field or not
   */
  public void setNumRecordsFetch (boolean fetch) {
    this.NumRecordsFetch = fetch;
  }
  /** Retrieve Fetch value for field: NumRecords (CDR_DATA.num_records)
   * @return boolean the Fetch value for this field
   */
  public boolean getNumRecordsFetch () {
    return this.NumRecordsFetch;
  }
  /** Set the SortOrder for field: NumRecords (CDR_DATA.num_records)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNumRecordsSortOrder (Integer value) {
    this.NumRecordsSort = value;
  }
  /** Retrieve SortOrder for field: NumRecords (CDR_DATA.num_records)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNumRecordsSortOrder () {
    return this.NumRecordsSort;
  }
  /** Set the sort direction for field: NumRecords (CDR_DATA.num_records)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNumRecordsSortDirection (boolean ascending) {
    this.NumRecordsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NumRecords (CDR_DATA.num_records)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNumRecordsSortDirection () {
    return this.NumRecordsSortAscending;
  }
  /** Set the field level filters for field: NumRecords (CDR_DATA.num_records)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNumRecordsFilter (IntegerFilter[] value) throws ServiceException {
    this.NumRecords = value;
  }
  /** Retrieve filter for field: NumRecords (CDR_DATA.num_records)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getNumRecordsFilter () {
    return this.NumRecords;
  }

  /**
   * Retrieves the NumRecordsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NumRecordsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NumRecordsFilter field
   */
  public String[] getNumRecordsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNumRecordsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNumRecordsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNumRecordsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NumRecordsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNumRecordsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NumRecordsFilter filter value from a formatted string
   *
   * @param _value the NumRecordsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NumRecordsFilter filter field
   */
  public void setNumRecordsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNumRecordsFilterFromFormattedString");
    try {
      this.setNumRecordsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NumRecordsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNumRecordsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNumRecordsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AmountReduction (CDR_DATA.amount_reduction)
   * @param fetch whether to fetch this field or not
   */
  public void setAmountReductionFetch (boolean fetch) {
    this.AmountReductionFetch = fetch;
  }
  /** Retrieve Fetch value for field: AmountReduction (CDR_DATA.amount_reduction)
   * @return boolean the Fetch value for this field
   */
  public boolean getAmountReductionFetch () {
    return this.AmountReductionFetch;
  }
  /** Set the SortOrder for field: AmountReduction (CDR_DATA.amount_reduction)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAmountReductionSortOrder (Integer value) {
    this.AmountReductionSort = value;
  }
  /** Retrieve SortOrder for field: AmountReduction (CDR_DATA.amount_reduction)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAmountReductionSortOrder () {
    return this.AmountReductionSort;
  }
  /** Set the sort direction for field: AmountReduction (CDR_DATA.amount_reduction)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAmountReductionSortDirection (boolean ascending) {
    this.AmountReductionSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AmountReduction (CDR_DATA.amount_reduction)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAmountReductionSortDirection () {
    return this.AmountReductionSortAscending;
  }
  /** Set the field level filters for field: AmountReduction (CDR_DATA.amount_reduction)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAmountReductionFilter (BigIntegerFilter[] value) throws ServiceException {
    this.AmountReduction = value;
  }
  /** Retrieve filter for field: AmountReduction (CDR_DATA.amount_reduction)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAmountReductionFilter () {
    return this.AmountReduction;
  }

  /**
   * Retrieves the AmountReductionFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AmountReductionFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountReductionFilter field
   */
  public String[] getAmountReductionFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountReductionFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAmountReductionFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountReductionFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountReductionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountReductionFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AmountReductionFilter filter value from a formatted string
   *
   * @param _value the AmountReductionFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AmountReductionFilter filter field
   */
  public void setAmountReductionFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountReductionFilterFromFormattedString");
    try {
      this.setAmountReductionFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountReductionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountReductionFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountReductionFilterFromFormattedString");
  }

  /**
   * Sets the AmountReductionFilter filter value from a formatted string
   *
   * @param _value the AmountReductionFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AmountReductionFilter filter field
   */
  public void setAmountReductionFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountReductionFilterFromFormattedCurrencyString");
    try {
      this.setAmountReductionFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountReductionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountReductionFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountReductionFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the AmountReductionFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AmountReductionFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountReductionFilter field
   */

  public String[] getAmountReductionFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountReductionFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAmountReductionFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountReductionFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountReductionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountReductionFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: AmountReductionId (CDR_DATA.amount_reduction_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAmountReductionIdFetch (boolean fetch) {
    this.AmountReductionIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AmountReductionId (CDR_DATA.amount_reduction_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAmountReductionIdFetch () {
    return this.AmountReductionIdFetch;
  }
  /** Set the SortOrder for field: AmountReductionId (CDR_DATA.amount_reduction_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAmountReductionIdSortOrder (Integer value) {
    this.AmountReductionIdSort = value;
  }
  /** Retrieve SortOrder for field: AmountReductionId (CDR_DATA.amount_reduction_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAmountReductionIdSortOrder () {
    return this.AmountReductionIdSort;
  }
  /** Set the sort direction for field: AmountReductionId (CDR_DATA.amount_reduction_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAmountReductionIdSortDirection (boolean ascending) {
    this.AmountReductionIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AmountReductionId (CDR_DATA.amount_reduction_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAmountReductionIdSortDirection () {
    return this.AmountReductionIdSortAscending;
  }
  /** Set the field level filters for field: AmountReductionId (CDR_DATA.amount_reduction_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAmountReductionIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AmountReductionId = value;
  }
  /** Retrieve filter for field: AmountReductionId (CDR_DATA.amount_reduction_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAmountReductionIdFilter () {
    return this.AmountReductionId;
  }

  /**
   * Retrieves the AmountReductionIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AmountReductionIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountReductionIdFilter field
   */
  public String[] getAmountReductionIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountReductionIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAmountReductionIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountReductionIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountReductionIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountReductionIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AmountReductionIdFilter filter value from a formatted string
   *
   * @param _value the AmountReductionIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AmountReductionIdFilter filter field
   */
  public void setAmountReductionIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountReductionIdFilterFromFormattedString");
    try {
      this.setAmountReductionIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountReductionIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountReductionIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountReductionIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SeqnumRateUsage (CDR_DATA.seqnum_rate_usage)
   * @param fetch whether to fetch this field or not
   */
  public void setSeqnumRateUsageFetch (boolean fetch) {
    this.SeqnumRateUsageFetch = fetch;
  }
  /** Retrieve Fetch value for field: SeqnumRateUsage (CDR_DATA.seqnum_rate_usage)
   * @return boolean the Fetch value for this field
   */
  public boolean getSeqnumRateUsageFetch () {
    return this.SeqnumRateUsageFetch;
  }
  /** Set the SortOrder for field: SeqnumRateUsage (CDR_DATA.seqnum_rate_usage)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSeqnumRateUsageSortOrder (Integer value) {
    this.SeqnumRateUsageSort = value;
  }
  /** Retrieve SortOrder for field: SeqnumRateUsage (CDR_DATA.seqnum_rate_usage)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSeqnumRateUsageSortOrder () {
    return this.SeqnumRateUsageSort;
  }
  /** Set the sort direction for field: SeqnumRateUsage (CDR_DATA.seqnum_rate_usage)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSeqnumRateUsageSortDirection (boolean ascending) {
    this.SeqnumRateUsageSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SeqnumRateUsage (CDR_DATA.seqnum_rate_usage)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSeqnumRateUsageSortDirection () {
    return this.SeqnumRateUsageSortAscending;
  }
  /** Set the field level filters for field: SeqnumRateUsage (CDR_DATA.seqnum_rate_usage)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSeqnumRateUsageFilter (IntegerFilter[] value) throws ServiceException {
    this.SeqnumRateUsage = value;
  }
  /** Retrieve filter for field: SeqnumRateUsage (CDR_DATA.seqnum_rate_usage)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSeqnumRateUsageFilter () {
    return this.SeqnumRateUsage;
  }

  /**
   * Retrieves the SeqnumRateUsageFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SeqnumRateUsageFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SeqnumRateUsageFilter field
   */
  public String[] getSeqnumRateUsageFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSeqnumRateUsageFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSeqnumRateUsageFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSeqnumRateUsageFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SeqnumRateUsageFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSeqnumRateUsageFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SeqnumRateUsageFilter filter value from a formatted string
   *
   * @param _value the SeqnumRateUsageFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SeqnumRateUsageFilter filter field
   */
  public void setSeqnumRateUsageFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSeqnumRateUsageFilterFromFormattedString");
    try {
      this.setSeqnumRateUsageFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SeqnumRateUsageFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSeqnumRateUsageFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSeqnumRateUsageFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SeqnumRateUsageOverrides (CDR_DATA.seqnum_rate_usage_overrides)
   * @param fetch whether to fetch this field or not
   */
  public void setSeqnumRateUsageOverridesFetch (boolean fetch) {
    this.SeqnumRateUsageOverridesFetch = fetch;
  }
  /** Retrieve Fetch value for field: SeqnumRateUsageOverrides (CDR_DATA.seqnum_rate_usage_overrides)
   * @return boolean the Fetch value for this field
   */
  public boolean getSeqnumRateUsageOverridesFetch () {
    return this.SeqnumRateUsageOverridesFetch;
  }
  /** Set the SortOrder for field: SeqnumRateUsageOverrides (CDR_DATA.seqnum_rate_usage_overrides)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSeqnumRateUsageOverridesSortOrder (Integer value) {
    this.SeqnumRateUsageOverridesSort = value;
  }
  /** Retrieve SortOrder for field: SeqnumRateUsageOverrides (CDR_DATA.seqnum_rate_usage_overrides)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSeqnumRateUsageOverridesSortOrder () {
    return this.SeqnumRateUsageOverridesSort;
  }
  /** Set the sort direction for field: SeqnumRateUsageOverrides (CDR_DATA.seqnum_rate_usage_overrides)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSeqnumRateUsageOverridesSortDirection (boolean ascending) {
    this.SeqnumRateUsageOverridesSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SeqnumRateUsageOverrides (CDR_DATA.seqnum_rate_usage_overrides)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSeqnumRateUsageOverridesSortDirection () {
    return this.SeqnumRateUsageOverridesSortAscending;
  }
  /** Set the field level filters for field: SeqnumRateUsageOverrides (CDR_DATA.seqnum_rate_usage_overrides)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSeqnumRateUsageOverridesFilter (IntegerFilter[] value) throws ServiceException {
    this.SeqnumRateUsageOverrides = value;
  }
  /** Retrieve filter for field: SeqnumRateUsageOverrides (CDR_DATA.seqnum_rate_usage_overrides)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSeqnumRateUsageOverridesFilter () {
    return this.SeqnumRateUsageOverrides;
  }

  /**
   * Retrieves the SeqnumRateUsageOverridesFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SeqnumRateUsageOverridesFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SeqnumRateUsageOverridesFilter field
   */
  public String[] getSeqnumRateUsageOverridesFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSeqnumRateUsageOverridesFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSeqnumRateUsageOverridesFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSeqnumRateUsageOverridesFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SeqnumRateUsageOverridesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSeqnumRateUsageOverridesFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SeqnumRateUsageOverridesFilter filter value from a formatted string
   *
   * @param _value the SeqnumRateUsageOverridesFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SeqnumRateUsageOverridesFilter filter field
   */
  public void setSeqnumRateUsageOverridesFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSeqnumRateUsageOverridesFilterFromFormattedString");
    try {
      this.setSeqnumRateUsageOverridesFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SeqnumRateUsageOverridesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSeqnumRateUsageOverridesFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSeqnumRateUsageOverridesFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RawUnits (CDR_DATA.raw_units)
   * @param fetch whether to fetch this field or not
   */
  public void setRawUnitsFetch (boolean fetch) {
    this.RawUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: RawUnits (CDR_DATA.raw_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getRawUnitsFetch () {
    return this.RawUnitsFetch;
  }
  /** Set the SortOrder for field: RawUnits (CDR_DATA.raw_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRawUnitsSortOrder (Integer value) {
    this.RawUnitsSort = value;
  }
  /** Retrieve SortOrder for field: RawUnits (CDR_DATA.raw_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRawUnitsSortOrder () {
    return this.RawUnitsSort;
  }
  /** Set the sort direction for field: RawUnits (CDR_DATA.raw_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRawUnitsSortDirection (boolean ascending) {
    this.RawUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RawUnits (CDR_DATA.raw_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRawUnitsSortDirection () {
    return this.RawUnitsSortAscending;
  }
  /** Set the field level filters for field: RawUnits (CDR_DATA.raw_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRawUnitsFilter (BigIntegerFilter[] value) throws ServiceException {
    this.RawUnits = value;
  }
  /** Retrieve filter for field: RawUnits (CDR_DATA.raw_units)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getRawUnitsFilter () {
    return this.RawUnits;
  }

  /**
   * Retrieves the RawUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RawUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RawUnitsFilter field
   */
  public String[] getRawUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRawUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRawUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRawUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RawUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRawUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RawUnitsFilter filter value from a formatted string
   *
   * @param _value the RawUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RawUnitsFilter filter field
   */
  public void setRawUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRawUnitsFilterFromFormattedString");
    try {
      this.setRawUnitsFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RawUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRawUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRawUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RawUnitsRounded (CDR_DATA.raw_units_rounded)
   * @param fetch whether to fetch this field or not
   */
  public void setRawUnitsRoundedFetch (boolean fetch) {
    this.RawUnitsRoundedFetch = fetch;
  }
  /** Retrieve Fetch value for field: RawUnitsRounded (CDR_DATA.raw_units_rounded)
   * @return boolean the Fetch value for this field
   */
  public boolean getRawUnitsRoundedFetch () {
    return this.RawUnitsRoundedFetch;
  }
  /** Set the SortOrder for field: RawUnitsRounded (CDR_DATA.raw_units_rounded)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRawUnitsRoundedSortOrder (Integer value) {
    this.RawUnitsRoundedSort = value;
  }
  /** Retrieve SortOrder for field: RawUnitsRounded (CDR_DATA.raw_units_rounded)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRawUnitsRoundedSortOrder () {
    return this.RawUnitsRoundedSort;
  }
  /** Set the sort direction for field: RawUnitsRounded (CDR_DATA.raw_units_rounded)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRawUnitsRoundedSortDirection (boolean ascending) {
    this.RawUnitsRoundedSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RawUnitsRounded (CDR_DATA.raw_units_rounded)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRawUnitsRoundedSortDirection () {
    return this.RawUnitsRoundedSortAscending;
  }
  /** Set the field level filters for field: RawUnitsRounded (CDR_DATA.raw_units_rounded)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRawUnitsRoundedFilter (BigIntegerFilter[] value) throws ServiceException {
    this.RawUnitsRounded = value;
  }
  /** Retrieve filter for field: RawUnitsRounded (CDR_DATA.raw_units_rounded)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getRawUnitsRoundedFilter () {
    return this.RawUnitsRounded;
  }

  /**
   * Retrieves the RawUnitsRoundedFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RawUnitsRoundedFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RawUnitsRoundedFilter field
   */
  public String[] getRawUnitsRoundedFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRawUnitsRoundedFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRawUnitsRoundedFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRawUnitsRoundedFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RawUnitsRoundedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRawUnitsRoundedFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RawUnitsRoundedFilter filter value from a formatted string
   *
   * @param _value the RawUnitsRoundedFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RawUnitsRoundedFilter filter field
   */
  public void setRawUnitsRoundedFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRawUnitsRoundedFilterFromFormattedString");
    try {
      this.setRawUnitsRoundedFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RawUnitsRoundedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRawUnitsRoundedFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRawUnitsRoundedFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AggrUsageId (CDR_DATA.aggr_usage_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAggrUsageIdFetch (boolean fetch) {
    this.AggrUsageIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AggrUsageId (CDR_DATA.aggr_usage_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAggrUsageIdFetch () {
    return this.AggrUsageIdFetch;
  }
  /** Set the SortOrder for field: AggrUsageId (CDR_DATA.aggr_usage_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAggrUsageIdSortOrder (Integer value) {
    this.AggrUsageIdSort = value;
  }
  /** Retrieve SortOrder for field: AggrUsageId (CDR_DATA.aggr_usage_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAggrUsageIdSortOrder () {
    return this.AggrUsageIdSort;
  }
  /** Set the sort direction for field: AggrUsageId (CDR_DATA.aggr_usage_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAggrUsageIdSortDirection (boolean ascending) {
    this.AggrUsageIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AggrUsageId (CDR_DATA.aggr_usage_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAggrUsageIdSortDirection () {
    return this.AggrUsageIdSortAscending;
  }
  /** Set the field level filters for field: AggrUsageId (CDR_DATA.aggr_usage_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAggrUsageIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AggrUsageId = value;
  }
  /** Retrieve filter for field: AggrUsageId (CDR_DATA.aggr_usage_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAggrUsageIdFilter () {
    return this.AggrUsageId;
  }

  /**
   * Retrieves the AggrUsageIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AggrUsageIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AggrUsageIdFilter field
   */
  public String[] getAggrUsageIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAggrUsageIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAggrUsageIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAggrUsageIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AggrUsageIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAggrUsageIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AggrUsageIdFilter filter value from a formatted string
   *
   * @param _value the AggrUsageIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AggrUsageIdFilter filter field
   */
  public void setAggrUsageIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAggrUsageIdFilterFromFormattedString");
    try {
      this.setAggrUsageIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AggrUsageIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAggrUsageIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAggrUsageIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ZoneClass (CDR_DATA.zone_class)
   * @param fetch whether to fetch this field or not
   */
  public void setZoneClassFetch (boolean fetch) {
    this.ZoneClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: ZoneClass (CDR_DATA.zone_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getZoneClassFetch () {
    return this.ZoneClassFetch;
  }
  /** Set the SortOrder for field: ZoneClass (CDR_DATA.zone_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setZoneClassSortOrder (Integer value) {
    this.ZoneClassSort = value;
  }
  /** Retrieve SortOrder for field: ZoneClass (CDR_DATA.zone_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getZoneClassSortOrder () {
    return this.ZoneClassSort;
  }
  /** Set the sort direction for field: ZoneClass (CDR_DATA.zone_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setZoneClassSortDirection (boolean ascending) {
    this.ZoneClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ZoneClass (CDR_DATA.zone_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getZoneClassSortDirection () {
    return this.ZoneClassSortAscending;
  }
  /** Set the field level filters for field: ZoneClass (CDR_DATA.zone_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setZoneClassFilter (IntegerFilter[] value) throws ServiceException {
    this.ZoneClass = value;
  }
  /** Retrieve filter for field: ZoneClass (CDR_DATA.zone_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getZoneClassFilter () {
    return this.ZoneClass;
  }

  /**
   * Retrieves the ZoneClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ZoneClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ZoneClassFilter field
   */
  public String[] getZoneClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getZoneClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getZoneClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getZoneClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ZoneClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getZoneClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ZoneClassFilter filter value from a formatted string
   *
   * @param _value the ZoneClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ZoneClassFilter filter field
   */
  public void setZoneClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setZoneClassFilterFromFormattedString");
    try {
      this.setZoneClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ZoneClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setZoneClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setZoneClassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PointClassOrigin (CDR_DATA.point_class_origin)
   * @param fetch whether to fetch this field or not
   */
  public void setPointClassOriginFetch (boolean fetch) {
    this.PointClassOriginFetch = fetch;
  }
  /** Retrieve Fetch value for field: PointClassOrigin (CDR_DATA.point_class_origin)
   * @return boolean the Fetch value for this field
   */
  public boolean getPointClassOriginFetch () {
    return this.PointClassOriginFetch;
  }
  /** Set the SortOrder for field: PointClassOrigin (CDR_DATA.point_class_origin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPointClassOriginSortOrder (Integer value) {
    this.PointClassOriginSort = value;
  }
  /** Retrieve SortOrder for field: PointClassOrigin (CDR_DATA.point_class_origin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPointClassOriginSortOrder () {
    return this.PointClassOriginSort;
  }
  /** Set the sort direction for field: PointClassOrigin (CDR_DATA.point_class_origin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPointClassOriginSortDirection (boolean ascending) {
    this.PointClassOriginSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PointClassOrigin (CDR_DATA.point_class_origin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPointClassOriginSortDirection () {
    return this.PointClassOriginSortAscending;
  }
  /** Set the field level filters for field: PointClassOrigin (CDR_DATA.point_class_origin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPointClassOriginFilter (IntegerFilter[] value) throws ServiceException {
    this.PointClassOrigin = value;
  }
  /** Retrieve filter for field: PointClassOrigin (CDR_DATA.point_class_origin)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPointClassOriginFilter () {
    return this.PointClassOrigin;
  }

  /**
   * Retrieves the PointClassOriginFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PointClassOriginFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointClassOriginFilter field
   */
  public String[] getPointClassOriginFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointClassOriginFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPointClassOriginFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointClassOriginFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointClassOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointClassOriginFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PointClassOriginFilter filter value from a formatted string
   *
   * @param _value the PointClassOriginFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PointClassOriginFilter filter field
   */
  public void setPointClassOriginFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointClassOriginFilterFromFormattedString");
    try {
      this.setPointClassOriginFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointClassOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointClassOriginFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointClassOriginFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PointClassTarget (CDR_DATA.point_class_target)
   * @param fetch whether to fetch this field or not
   */
  public void setPointClassTargetFetch (boolean fetch) {
    this.PointClassTargetFetch = fetch;
  }
  /** Retrieve Fetch value for field: PointClassTarget (CDR_DATA.point_class_target)
   * @return boolean the Fetch value for this field
   */
  public boolean getPointClassTargetFetch () {
    return this.PointClassTargetFetch;
  }
  /** Set the SortOrder for field: PointClassTarget (CDR_DATA.point_class_target)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPointClassTargetSortOrder (Integer value) {
    this.PointClassTargetSort = value;
  }
  /** Retrieve SortOrder for field: PointClassTarget (CDR_DATA.point_class_target)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPointClassTargetSortOrder () {
    return this.PointClassTargetSort;
  }
  /** Set the sort direction for field: PointClassTarget (CDR_DATA.point_class_target)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPointClassTargetSortDirection (boolean ascending) {
    this.PointClassTargetSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PointClassTarget (CDR_DATA.point_class_target)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPointClassTargetSortDirection () {
    return this.PointClassTargetSortAscending;
  }
  /** Set the field level filters for field: PointClassTarget (CDR_DATA.point_class_target)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPointClassTargetFilter (IntegerFilter[] value) throws ServiceException {
    this.PointClassTarget = value;
  }
  /** Retrieve filter for field: PointClassTarget (CDR_DATA.point_class_target)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPointClassTargetFilter () {
    return this.PointClassTarget;
  }

  /**
   * Retrieves the PointClassTargetFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PointClassTargetFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointClassTargetFilter field
   */
  public String[] getPointClassTargetFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointClassTargetFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPointClassTargetFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointClassTargetFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointClassTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointClassTargetFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PointClassTargetFilter filter value from a formatted string
   *
   * @param _value the PointClassTargetFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PointClassTargetFilter filter field
   */
  public void setPointClassTargetFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointClassTargetFilterFromFormattedString");
    try {
      this.setPointClassTargetFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointClassTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointClassTargetFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointClassTargetFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EquipClassCode (CDR_DATA.equip_class_code)
   * @param fetch whether to fetch this field or not
   */
  public void setEquipClassCodeFetch (boolean fetch) {
    this.EquipClassCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: EquipClassCode (CDR_DATA.equip_class_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getEquipClassCodeFetch () {
    return this.EquipClassCodeFetch;
  }
  /** Set the SortOrder for field: EquipClassCode (CDR_DATA.equip_class_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEquipClassCodeSortOrder (Integer value) {
    this.EquipClassCodeSort = value;
  }
  /** Retrieve SortOrder for field: EquipClassCode (CDR_DATA.equip_class_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEquipClassCodeSortOrder () {
    return this.EquipClassCodeSort;
  }
  /** Set the sort direction for field: EquipClassCode (CDR_DATA.equip_class_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEquipClassCodeSortDirection (boolean ascending) {
    this.EquipClassCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EquipClassCode (CDR_DATA.equip_class_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEquipClassCodeSortDirection () {
    return this.EquipClassCodeSortAscending;
  }
  /** Set the field level filters for field: EquipClassCode (CDR_DATA.equip_class_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEquipClassCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.EquipClassCode = value;
  }
  /** Retrieve filter for field: EquipClassCode (CDR_DATA.equip_class_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEquipClassCodeFilter () {
    return this.EquipClassCode;
  }

  /**
   * Retrieves the EquipClassCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EquipClassCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EquipClassCodeFilter field
   */
  public String[] getEquipClassCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEquipClassCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEquipClassCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEquipClassCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EquipClassCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEquipClassCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EquipClassCodeFilter filter value from a formatted string
   *
   * @param _value the EquipClassCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EquipClassCodeFilter filter field
   */
  public void setEquipClassCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEquipClassCodeFilterFromFormattedString");
    try {
      this.setEquipClassCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EquipClassCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEquipClassCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEquipClassCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ComponentId (CDR_DATA.component_id)
   * @param fetch whether to fetch this field or not
   */
  public void setComponentIdFetch (boolean fetch) {
    this.ComponentIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ComponentId (CDR_DATA.component_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getComponentIdFetch () {
    return this.ComponentIdFetch;
  }
  /** Set the SortOrder for field: ComponentId (CDR_DATA.component_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setComponentIdSortOrder (Integer value) {
    this.ComponentIdSort = value;
  }
  /** Retrieve SortOrder for field: ComponentId (CDR_DATA.component_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getComponentIdSortOrder () {
    return this.ComponentIdSort;
  }
  /** Set the sort direction for field: ComponentId (CDR_DATA.component_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setComponentIdSortDirection (boolean ascending) {
    this.ComponentIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ComponentId (CDR_DATA.component_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getComponentIdSortDirection () {
    return this.ComponentIdSortAscending;
  }
  /** Set the field level filters for field: ComponentId (CDR_DATA.component_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setComponentIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ComponentId = value;
  }
  /** Retrieve filter for field: ComponentId (CDR_DATA.component_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getComponentIdFilter () {
    return this.ComponentId;
  }

  /**
   * Retrieves the ComponentIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ComponentIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ComponentIdFilter field
   */
  public String[] getComponentIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getComponentIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getComponentIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getComponentIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ComponentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getComponentIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ComponentIdFilter filter value from a formatted string
   *
   * @param _value the ComponentIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ComponentIdFilter filter field
   */
  public void setComponentIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setComponentIdFilterFromFormattedString");
    try {
      this.setComponentIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ComponentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setComponentIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setComponentIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TaxPkgCount (CDR_DATA.tax_pkg_count)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxPkgCountFetch (boolean fetch) {
    this.TaxPkgCountFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxPkgCount (CDR_DATA.tax_pkg_count)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxPkgCountFetch () {
    return this.TaxPkgCountFetch;
  }
  /** Set the SortOrder for field: TaxPkgCount (CDR_DATA.tax_pkg_count)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxPkgCountSortOrder (Integer value) {
    this.TaxPkgCountSort = value;
  }
  /** Retrieve SortOrder for field: TaxPkgCount (CDR_DATA.tax_pkg_count)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxPkgCountSortOrder () {
    return this.TaxPkgCountSort;
  }
  /** Set the sort direction for field: TaxPkgCount (CDR_DATA.tax_pkg_count)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxPkgCountSortDirection (boolean ascending) {
    this.TaxPkgCountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxPkgCount (CDR_DATA.tax_pkg_count)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxPkgCountSortDirection () {
    return this.TaxPkgCountSortAscending;
  }
  /** Set the field level filters for field: TaxPkgCount (CDR_DATA.tax_pkg_count)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxPkgCountFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxPkgCount = value;
  }
  /** Retrieve filter for field: TaxPkgCount (CDR_DATA.tax_pkg_count)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxPkgCountFilter () {
    return this.TaxPkgCount;
  }

  /**
   * Retrieves the TaxPkgCountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxPkgCountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxPkgCountFilter field
   */
  public String[] getTaxPkgCountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgCountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxPkgCountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPkgCountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxPkgCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxPkgCountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxPkgCountFilter filter value from a formatted string
   *
   * @param _value the TaxPkgCountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxPkgCountFilter filter field
   */
  public void setTaxPkgCountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxPkgCountFilterFromFormattedString");
    try {
      this.setTaxPkgCountFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxPkgCountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxPkgCountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxPkgCountFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Geocode (CDR_DATA.geocode)
   * @param fetch whether to fetch this field or not
   */
  public void setGeocodeFetch (boolean fetch) {
    this.GeocodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: Geocode (CDR_DATA.geocode)
   * @return boolean the Fetch value for this field
   */
  public boolean getGeocodeFetch () {
    return this.GeocodeFetch;
  }
  /** Set the SortOrder for field: Geocode (CDR_DATA.geocode)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGeocodeSortOrder (Integer value) {
    this.GeocodeSort = value;
  }
  /** Retrieve SortOrder for field: Geocode (CDR_DATA.geocode)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGeocodeSortOrder () {
    return this.GeocodeSort;
  }
  /** Set the sort direction for field: Geocode (CDR_DATA.geocode)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGeocodeSortDirection (boolean ascending) {
    this.GeocodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Geocode (CDR_DATA.geocode)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGeocodeSortDirection () {
    return this.GeocodeSortAscending;
  }
  /** Set the case insensitive for field: Geocode (CDR_DATA.geocode)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setGeocodeCaseInsensitive (boolean ascending) {
    this.GeocodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Geocode (CDR_DATA.geocode)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getGeocodeCaseInsensitive () {
    return this.GeocodeCaseInsensitive;
  }
  /** Set the field level filters for field: Geocode (CDR_DATA.geocode)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGeocodeFilter (StringFilter[] value) throws ServiceException {
    this.Geocode = value;
  }
  /** Retrieve filter for field: Geocode (CDR_DATA.geocode)
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

  /** Set the field level Fetch value for field: AddImpliedDecimal (CDR_DATA.add_implied_decimal)
   * @param fetch whether to fetch this field or not
   */
  public void setAddImpliedDecimalFetch (boolean fetch) {
    this.AddImpliedDecimalFetch = fetch;
  }
  /** Retrieve Fetch value for field: AddImpliedDecimal (CDR_DATA.add_implied_decimal)
   * @return boolean the Fetch value for this field
   */
  public boolean getAddImpliedDecimalFetch () {
    return this.AddImpliedDecimalFetch;
  }
  /** Set the SortOrder for field: AddImpliedDecimal (CDR_DATA.add_implied_decimal)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAddImpliedDecimalSortOrder (Integer value) {
    this.AddImpliedDecimalSort = value;
  }
  /** Retrieve SortOrder for field: AddImpliedDecimal (CDR_DATA.add_implied_decimal)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAddImpliedDecimalSortOrder () {
    return this.AddImpliedDecimalSort;
  }
  /** Set the sort direction for field: AddImpliedDecimal (CDR_DATA.add_implied_decimal)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAddImpliedDecimalSortDirection (boolean ascending) {
    this.AddImpliedDecimalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AddImpliedDecimal (CDR_DATA.add_implied_decimal)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAddImpliedDecimalSortDirection () {
    return this.AddImpliedDecimalSortAscending;
  }
  /** Set the field level filters for field: AddImpliedDecimal (CDR_DATA.add_implied_decimal)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAddImpliedDecimalFilter (IntegerFilter[] value) throws ServiceException {
    this.AddImpliedDecimal = value;
  }
  /** Retrieve filter for field: AddImpliedDecimal (CDR_DATA.add_implied_decimal)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAddImpliedDecimalFilter () {
    return this.AddImpliedDecimal;
  }

  /**
   * Retrieves the AddImpliedDecimalFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AddImpliedDecimalFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddImpliedDecimalFilter field
   */
  public String[] getAddImpliedDecimalFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddImpliedDecimalFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAddImpliedDecimalFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddImpliedDecimalFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddImpliedDecimalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddImpliedDecimalFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AddImpliedDecimalFilter filter value from a formatted string
   *
   * @param _value the AddImpliedDecimalFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AddImpliedDecimalFilter filter field
   */
  public void setAddImpliedDecimalFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAddImpliedDecimalFilterFromFormattedString");
    try {
      this.setAddImpliedDecimalFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddImpliedDecimalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddImpliedDecimalFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddImpliedDecimalFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ReratedDt (CDR_DATA.rerated_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setReratedDtFetch (boolean fetch) {
    this.ReratedDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ReratedDt (CDR_DATA.rerated_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getReratedDtFetch () {
    return this.ReratedDtFetch;
  }
  /** Set the SortOrder for field: ReratedDt (CDR_DATA.rerated_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setReratedDtSortOrder (Integer value) {
    this.ReratedDtSort = value;
  }
  /** Retrieve SortOrder for field: ReratedDt (CDR_DATA.rerated_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getReratedDtSortOrder () {
    return this.ReratedDtSort;
  }
  /** Set the sort direction for field: ReratedDt (CDR_DATA.rerated_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setReratedDtSortDirection (boolean ascending) {
    this.ReratedDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ReratedDt (CDR_DATA.rerated_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getReratedDtSortDirection () {
    return this.ReratedDtSortAscending;
  }
  /** Set the field level filters for field: ReratedDt (CDR_DATA.rerated_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setReratedDtFilter (DateFilter[] value) throws ServiceException {
    this.ReratedDt = value;
  }
  /** Retrieve filter for field: ReratedDt (CDR_DATA.rerated_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getReratedDtFilter () {
    return this.ReratedDt;
  }

  /**
   * Retrieves the ReratedDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ReratedDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ReratedDtFilter field
   */
  public String[] getReratedDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReratedDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getReratedDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getReratedDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReratedDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getReratedDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ReratedDtFilter filter value from a formatted string
   *
   * @param _value the ReratedDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ReratedDtFilter filter field
   */
  public void setReratedDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setReratedDtFilterFromFormattedString");
    try {
      this.setReratedDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReratedDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setReratedDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setReratedDtFilterFromFormattedString");
  }

  /**
   * Retrieves the ReratedDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ReratedDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ReratedDtFilter field
   */
  public String[] getReratedDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReratedDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getReratedDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getReratedDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReratedDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getReratedDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ReratedDtFilter filter value from a formatted string
   *
   * @param _value the ReratedDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ReratedDtFilter filter field
   */
  public void setReratedDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setReratedDtFilterFromFormattedDateTimeString");
    try {
      this.setReratedDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReratedDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setReratedDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setReratedDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ExternalInvoiceId (CDR_DATA.external_invoice_id)
   * @param fetch whether to fetch this field or not
   */
  public void setExternalInvoiceIdFetch (boolean fetch) {
    this.ExternalInvoiceIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExternalInvoiceId (CDR_DATA.external_invoice_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getExternalInvoiceIdFetch () {
    return this.ExternalInvoiceIdFetch;
  }
  /** Set the SortOrder for field: ExternalInvoiceId (CDR_DATA.external_invoice_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExternalInvoiceIdSortOrder (Integer value) {
    this.ExternalInvoiceIdSort = value;
  }
  /** Retrieve SortOrder for field: ExternalInvoiceId (CDR_DATA.external_invoice_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExternalInvoiceIdSortOrder () {
    return this.ExternalInvoiceIdSort;
  }
  /** Set the sort direction for field: ExternalInvoiceId (CDR_DATA.external_invoice_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExternalInvoiceIdSortDirection (boolean ascending) {
    this.ExternalInvoiceIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExternalInvoiceId (CDR_DATA.external_invoice_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExternalInvoiceIdSortDirection () {
    return this.ExternalInvoiceIdSortAscending;
  }
  /** Set the field level filters for field: ExternalInvoiceId (CDR_DATA.external_invoice_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExternalInvoiceIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ExternalInvoiceId = value;
  }
  /** Retrieve filter for field: ExternalInvoiceId (CDR_DATA.external_invoice_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getExternalInvoiceIdFilter () {
    return this.ExternalInvoiceId;
  }

  /**
   * Retrieves the ExternalInvoiceIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalInvoiceIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalInvoiceIdFilter field
   */
  public String[] getExternalInvoiceIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalInvoiceIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExternalInvoiceIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalInvoiceIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalInvoiceIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalInvoiceIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExternalInvoiceIdFilter filter value from a formatted string
   *
   * @param _value the ExternalInvoiceIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExternalInvoiceIdFilter filter field
   */
  public void setExternalInvoiceIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalInvoiceIdFilterFromFormattedString");
    try {
      this.setExternalInvoiceIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalInvoiceIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalInvoiceIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalInvoiceIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: InvoiceRecordSeq (CDR_DATA.invoice_record_seq)
   * @param fetch whether to fetch this field or not
   */
  public void setInvoiceRecordSeqFetch (boolean fetch) {
    this.InvoiceRecordSeqFetch = fetch;
  }
  /** Retrieve Fetch value for field: InvoiceRecordSeq (CDR_DATA.invoice_record_seq)
   * @return boolean the Fetch value for this field
   */
  public boolean getInvoiceRecordSeqFetch () {
    return this.InvoiceRecordSeqFetch;
  }
  /** Set the SortOrder for field: InvoiceRecordSeq (CDR_DATA.invoice_record_seq)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInvoiceRecordSeqSortOrder (Integer value) {
    this.InvoiceRecordSeqSort = value;
  }
  /** Retrieve SortOrder for field: InvoiceRecordSeq (CDR_DATA.invoice_record_seq)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInvoiceRecordSeqSortOrder () {
    return this.InvoiceRecordSeqSort;
  }
  /** Set the sort direction for field: InvoiceRecordSeq (CDR_DATA.invoice_record_seq)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInvoiceRecordSeqSortDirection (boolean ascending) {
    this.InvoiceRecordSeqSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InvoiceRecordSeq (CDR_DATA.invoice_record_seq)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInvoiceRecordSeqSortDirection () {
    return this.InvoiceRecordSeqSortAscending;
  }
  /** Set the field level filters for field: InvoiceRecordSeq (CDR_DATA.invoice_record_seq)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInvoiceRecordSeqFilter (BigIntegerFilter[] value) throws ServiceException {
    this.InvoiceRecordSeq = value;
  }
  /** Retrieve filter for field: InvoiceRecordSeq (CDR_DATA.invoice_record_seq)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getInvoiceRecordSeqFilter () {
    return this.InvoiceRecordSeq;
  }

  /**
   * Retrieves the InvoiceRecordSeqFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InvoiceRecordSeqFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InvoiceRecordSeqFilter field
   */
  public String[] getInvoiceRecordSeqFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceRecordSeqFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInvoiceRecordSeqFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceRecordSeqFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InvoiceRecordSeqFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInvoiceRecordSeqFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InvoiceRecordSeqFilter filter value from a formatted string
   *
   * @param _value the InvoiceRecordSeqFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InvoiceRecordSeqFilter filter field
   */
  public void setInvoiceRecordSeqFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInvoiceRecordSeqFilterFromFormattedString");
    try {
      this.setInvoiceRecordSeqFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InvoiceRecordSeqFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInvoiceRecordSeqFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInvoiceRecordSeqFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LobId (CDR_DATA.lob_id)
   * @param fetch whether to fetch this field or not
   */
  public void setLobIdFetch (boolean fetch) {
    this.LobIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: LobId (CDR_DATA.lob_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getLobIdFetch () {
    return this.LobIdFetch;
  }
  /** Set the SortOrder for field: LobId (CDR_DATA.lob_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLobIdSortOrder (Integer value) {
    this.LobIdSort = value;
  }
  /** Retrieve SortOrder for field: LobId (CDR_DATA.lob_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLobIdSortOrder () {
    return this.LobIdSort;
  }
  /** Set the sort direction for field: LobId (CDR_DATA.lob_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLobIdSortDirection (boolean ascending) {
    this.LobIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LobId (CDR_DATA.lob_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLobIdSortDirection () {
    return this.LobIdSortAscending;
  }
  /** Set the field level filters for field: LobId (CDR_DATA.lob_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLobIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.LobId = value;
  }
  /** Retrieve filter for field: LobId (CDR_DATA.lob_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getLobIdFilter () {
    return this.LobId;
  }

  /**
   * Retrieves the LobIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LobIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LobIdFilter field
   */
  public String[] getLobIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLobIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLobIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLobIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LobIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLobIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LobIdFilter filter value from a formatted string
   *
   * @param _value the LobIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LobIdFilter filter field
   */
  public void setLobIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLobIdFilterFromFormattedString");
    try {
      this.setLobIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LobIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLobIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLobIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransactionId (CDR_DATA.transaction_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTransactionIdFetch (boolean fetch) {
    this.TransactionIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransactionId (CDR_DATA.transaction_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransactionIdFetch () {
    return this.TransactionIdFetch;
  }
  /** Set the SortOrder for field: TransactionId (CDR_DATA.transaction_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransactionIdSortOrder (Integer value) {
    this.TransactionIdSort = value;
  }
  /** Retrieve SortOrder for field: TransactionId (CDR_DATA.transaction_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransactionIdSortOrder () {
    return this.TransactionIdSort;
  }
  /** Set the sort direction for field: TransactionId (CDR_DATA.transaction_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransactionIdSortDirection (boolean ascending) {
    this.TransactionIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransactionId (CDR_DATA.transaction_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransactionIdSortDirection () {
    return this.TransactionIdSortAscending;
  }
  /** Set the field level filters for field: TransactionId (CDR_DATA.transaction_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransactionIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.TransactionId = value;
  }
  /** Retrieve filter for field: TransactionId (CDR_DATA.transaction_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTransactionIdFilter () {
    return this.TransactionId;
  }

  /**
   * Retrieves the TransactionIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransactionIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransactionIdFilter field
   */
  public String[] getTransactionIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransactionIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransactionIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransactionIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransactionIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransactionIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransactionIdFilter filter value from a formatted string
   *
   * @param _value the TransactionIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransactionIdFilter filter field
   */
  public void setTransactionIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransactionIdFilterFromFormattedString");
    try {
      this.setTransactionIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransactionIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransactionIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransactionIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: GuideTo (USAGE_TYPES.guide_to)
   * @param fetch whether to fetch this field or not
   */
  public void setGuideToFetch (boolean fetch) {
    this.GuideToFetch = fetch;
  }
  /** Retrieve Fetch value for field: GuideTo (USAGE_TYPES.guide_to)
   * @return boolean the Fetch value for this field
   */
  public boolean getGuideToFetch () {
    return this.GuideToFetch;
  }
  /** Set the SortOrder for field: GuideTo (USAGE_TYPES.guide_to)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGuideToSortOrder (Integer value) {
    this.GuideToSort = value;
  }
  /** Retrieve SortOrder for field: GuideTo (USAGE_TYPES.guide_to)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGuideToSortOrder () {
    return this.GuideToSort;
  }
  /** Set the sort direction for field: GuideTo (USAGE_TYPES.guide_to)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGuideToSortDirection (boolean ascending) {
    this.GuideToSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GuideTo (USAGE_TYPES.guide_to)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGuideToSortDirection () {
    return this.GuideToSortAscending;
  }
  /** Set the field level filters for field: GuideTo (USAGE_TYPES.guide_to)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGuideToFilter (IntegerFilter[] value) throws ServiceException {
    this.GuideTo = value;
  }
  /** Retrieve filter for field: GuideTo (USAGE_TYPES.guide_to)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getGuideToFilter () {
    return this.GuideTo;
  }

  /**
   * Retrieves the GuideToFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GuideToFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GuideToFilter field
   */
  public String[] getGuideToFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGuideToFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGuideToFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGuideToFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GuideToFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGuideToFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GuideToFilter filter value from a formatted string
   *
   * @param _value the GuideToFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GuideToFilter filter field
   */
  public void setGuideToFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGuideToFilterFromFormattedString");
    try {
      this.setGuideToFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GuideToFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGuideToFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGuideToFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PointCategory (USAGE_TYPES.point_category)
   * @param fetch whether to fetch this field or not
   */
  public void setPointCategoryFetch (boolean fetch) {
    this.PointCategoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: PointCategory (USAGE_TYPES.point_category)
   * @return boolean the Fetch value for this field
   */
  public boolean getPointCategoryFetch () {
    return this.PointCategoryFetch;
  }
  /** Set the SortOrder for field: PointCategory (USAGE_TYPES.point_category)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPointCategorySortOrder (Integer value) {
    this.PointCategorySort = value;
  }
  /** Retrieve SortOrder for field: PointCategory (USAGE_TYPES.point_category)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPointCategorySortOrder () {
    return this.PointCategorySort;
  }
  /** Set the sort direction for field: PointCategory (USAGE_TYPES.point_category)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPointCategorySortDirection (boolean ascending) {
    this.PointCategorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PointCategory (USAGE_TYPES.point_category)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPointCategorySortDirection () {
    return this.PointCategorySortAscending;
  }
  /** Set the field level filters for field: PointCategory (USAGE_TYPES.point_category)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPointCategoryFilter (IntegerFilter[] value) throws ServiceException {
    this.PointCategory = value;
  }
  /** Retrieve filter for field: PointCategory (USAGE_TYPES.point_category)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPointCategoryFilter () {
    return this.PointCategory;
  }

  /**
   * Retrieves the PointCategoryFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PointCategoryFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointCategoryFilter field
   */
  public String[] getPointCategoryFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointCategoryFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPointCategoryFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointCategoryFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointCategoryFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PointCategoryFilter filter value from a formatted string
   *
   * @param _value the PointCategoryFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PointCategoryFilter filter field
   */
  public void setPointCategoryFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointCategoryFilterFromFormattedString");
    try {
      this.setPointCategoryFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointCategoryFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointCategoryFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OriginCountryDialCodeReq (USAGE_TYPES.origin_country_dial_code_req)
   * @param fetch whether to fetch this field or not
   */
  public void setOriginCountryDialCodeReqFetch (boolean fetch) {
    this.OriginCountryDialCodeReqFetch = fetch;
  }
  /** Retrieve Fetch value for field: OriginCountryDialCodeReq (USAGE_TYPES.origin_country_dial_code_req)
   * @return boolean the Fetch value for this field
   */
  public boolean getOriginCountryDialCodeReqFetch () {
    return this.OriginCountryDialCodeReqFetch;
  }
  /** Set the SortOrder for field: OriginCountryDialCodeReq (USAGE_TYPES.origin_country_dial_code_req)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOriginCountryDialCodeReqSortOrder (Integer value) {
    this.OriginCountryDialCodeReqSort = value;
  }
  /** Retrieve SortOrder for field: OriginCountryDialCodeReq (USAGE_TYPES.origin_country_dial_code_req)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOriginCountryDialCodeReqSortOrder () {
    return this.OriginCountryDialCodeReqSort;
  }
  /** Set the sort direction for field: OriginCountryDialCodeReq (USAGE_TYPES.origin_country_dial_code_req)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOriginCountryDialCodeReqSortDirection (boolean ascending) {
    this.OriginCountryDialCodeReqSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OriginCountryDialCodeReq (USAGE_TYPES.origin_country_dial_code_req)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOriginCountryDialCodeReqSortDirection () {
    return this.OriginCountryDialCodeReqSortAscending;
  }
  /** Set the field level filters for field: OriginCountryDialCodeReq (USAGE_TYPES.origin_country_dial_code_req)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOriginCountryDialCodeReqFilter (IntegerFilter[] value) throws ServiceException {
    this.OriginCountryDialCodeReq = value;
  }
  /** Retrieve filter for field: OriginCountryDialCodeReq (USAGE_TYPES.origin_country_dial_code_req)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOriginCountryDialCodeReqFilter () {
    return this.OriginCountryDialCodeReq;
  }

  /**
   * Retrieves the OriginCountryDialCodeReqFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OriginCountryDialCodeReqFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OriginCountryDialCodeReqFilter field
   */
  public String[] getOriginCountryDialCodeReqFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOriginCountryDialCodeReqFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOriginCountryDialCodeReqFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOriginCountryDialCodeReqFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OriginCountryDialCodeReqFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOriginCountryDialCodeReqFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OriginCountryDialCodeReqFilter filter value from a formatted string
   *
   * @param _value the OriginCountryDialCodeReqFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OriginCountryDialCodeReqFilter filter field
   */
  public void setOriginCountryDialCodeReqFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOriginCountryDialCodeReqFilterFromFormattedString");
    try {
      this.setOriginCountryDialCodeReqFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OriginCountryDialCodeReqFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOriginCountryDialCodeReqFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOriginCountryDialCodeReqFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TaxCodeOriginReq (USAGE_TYPES.tax_code_origin_req)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxCodeOriginReqFetch (boolean fetch) {
    this.TaxCodeOriginReqFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxCodeOriginReq (USAGE_TYPES.tax_code_origin_req)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxCodeOriginReqFetch () {
    return this.TaxCodeOriginReqFetch;
  }
  /** Set the SortOrder for field: TaxCodeOriginReq (USAGE_TYPES.tax_code_origin_req)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxCodeOriginReqSortOrder (Integer value) {
    this.TaxCodeOriginReqSort = value;
  }
  /** Retrieve SortOrder for field: TaxCodeOriginReq (USAGE_TYPES.tax_code_origin_req)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxCodeOriginReqSortOrder () {
    return this.TaxCodeOriginReqSort;
  }
  /** Set the sort direction for field: TaxCodeOriginReq (USAGE_TYPES.tax_code_origin_req)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxCodeOriginReqSortDirection (boolean ascending) {
    this.TaxCodeOriginReqSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxCodeOriginReq (USAGE_TYPES.tax_code_origin_req)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxCodeOriginReqSortDirection () {
    return this.TaxCodeOriginReqSortAscending;
  }
  /** Set the field level filters for field: TaxCodeOriginReq (USAGE_TYPES.tax_code_origin_req)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxCodeOriginReqFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxCodeOriginReq = value;
  }
  /** Retrieve filter for field: TaxCodeOriginReq (USAGE_TYPES.tax_code_origin_req)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxCodeOriginReqFilter () {
    return this.TaxCodeOriginReq;
  }

  /**
   * Retrieves the TaxCodeOriginReqFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxCodeOriginReqFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxCodeOriginReqFilter field
   */
  public String[] getTaxCodeOriginReqFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxCodeOriginReqFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxCodeOriginReqFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxCodeOriginReqFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxCodeOriginReqFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxCodeOriginReqFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxCodeOriginReqFilter filter value from a formatted string
   *
   * @param _value the TaxCodeOriginReqFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxCodeOriginReqFilter filter field
   */
  public void setTaxCodeOriginReqFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxCodeOriginReqFilterFromFormattedString");
    try {
      this.setTaxCodeOriginReqFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxCodeOriginReqFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxCodeOriginReqFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxCodeOriginReqFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TaxCodeTargetReq (USAGE_TYPES.tax_code_target_req)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxCodeTargetReqFetch (boolean fetch) {
    this.TaxCodeTargetReqFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxCodeTargetReq (USAGE_TYPES.tax_code_target_req)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxCodeTargetReqFetch () {
    return this.TaxCodeTargetReqFetch;
  }
  /** Set the SortOrder for field: TaxCodeTargetReq (USAGE_TYPES.tax_code_target_req)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxCodeTargetReqSortOrder (Integer value) {
    this.TaxCodeTargetReqSort = value;
  }
  /** Retrieve SortOrder for field: TaxCodeTargetReq (USAGE_TYPES.tax_code_target_req)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxCodeTargetReqSortOrder () {
    return this.TaxCodeTargetReqSort;
  }
  /** Set the sort direction for field: TaxCodeTargetReq (USAGE_TYPES.tax_code_target_req)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxCodeTargetReqSortDirection (boolean ascending) {
    this.TaxCodeTargetReqSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxCodeTargetReq (USAGE_TYPES.tax_code_target_req)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxCodeTargetReqSortDirection () {
    return this.TaxCodeTargetReqSortAscending;
  }
  /** Set the field level filters for field: TaxCodeTargetReq (USAGE_TYPES.tax_code_target_req)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxCodeTargetReqFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxCodeTargetReq = value;
  }
  /** Retrieve filter for field: TaxCodeTargetReq (USAGE_TYPES.tax_code_target_req)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxCodeTargetReqFilter () {
    return this.TaxCodeTargetReq;
  }

  /**
   * Retrieves the TaxCodeTargetReqFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxCodeTargetReqFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxCodeTargetReqFilter field
   */
  public String[] getTaxCodeTargetReqFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxCodeTargetReqFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxCodeTargetReqFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxCodeTargetReqFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxCodeTargetReqFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxCodeTargetReqFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxCodeTargetReqFilter filter value from a formatted string
   *
   * @param _value the TaxCodeTargetReqFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxCodeTargetReqFilter filter field
   */
  public void setTaxCodeTargetReqFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxCodeTargetReqFilterFromFormattedString");
    try {
      this.setTaxCodeTargetReqFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxCodeTargetReqFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxCodeTargetReqFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxCodeTargetReqFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DescriptionCode (USAGE_TYPES.description_code)
   * @param fetch whether to fetch this field or not
   */
  public void setDescriptionCodeFetch (boolean fetch) {
    this.DescriptionCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: DescriptionCode (USAGE_TYPES.description_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getDescriptionCodeFetch () {
    return this.DescriptionCodeFetch;
  }
  /** Set the SortOrder for field: DescriptionCode (USAGE_TYPES.description_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDescriptionCodeSortOrder (Integer value) {
    this.DescriptionCodeSort = value;
  }
  /** Retrieve SortOrder for field: DescriptionCode (USAGE_TYPES.description_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDescriptionCodeSortOrder () {
    return this.DescriptionCodeSort;
  }
  /** Set the sort direction for field: DescriptionCode (USAGE_TYPES.description_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDescriptionCodeSortDirection (boolean ascending) {
    this.DescriptionCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DescriptionCode (USAGE_TYPES.description_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDescriptionCodeSortDirection () {
    return this.DescriptionCodeSortAscending;
  }
  /** Set the field level filters for field: DescriptionCode (USAGE_TYPES.description_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDescriptionCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.DescriptionCode = value;
  }
  /** Retrieve filter for field: DescriptionCode (USAGE_TYPES.description_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDescriptionCodeFilter () {
    return this.DescriptionCode;
  }

  /**
   * Retrieves the DescriptionCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DescriptionCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DescriptionCodeFilter field
   */
  public String[] getDescriptionCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDescriptionCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDescriptionCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DescriptionCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDescriptionCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DescriptionCodeFilter filter value from a formatted string
   *
   * @param _value the DescriptionCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DescriptionCodeFilter filter field
   */
  public void setDescriptionCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDescriptionCodeFilterFromFormattedString");
    try {
      this.setDescriptionCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DescriptionCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDescriptionCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDescriptionCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TaxClass (USAGE_TYPES.tax_class)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxClassFetch (boolean fetch) {
    this.TaxClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxClass (USAGE_TYPES.tax_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxClassFetch () {
    return this.TaxClassFetch;
  }
  /** Set the SortOrder for field: TaxClass (USAGE_TYPES.tax_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxClassSortOrder (Integer value) {
    this.TaxClassSort = value;
  }
  /** Retrieve SortOrder for field: TaxClass (USAGE_TYPES.tax_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxClassSortOrder () {
    return this.TaxClassSort;
  }
  /** Set the sort direction for field: TaxClass (USAGE_TYPES.tax_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxClassSortDirection (boolean ascending) {
    this.TaxClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxClass (USAGE_TYPES.tax_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxClassSortDirection () {
    return this.TaxClassSortAscending;
  }
  /** Set the field level filters for field: TaxClass (USAGE_TYPES.tax_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxClassFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxClass = value;
  }
  /** Retrieve filter for field: TaxClass (USAGE_TYPES.tax_class)
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

  /** Set the field level Fetch value for field: TaxLocationUsg (USAGE_TYPES.tax_location_usg)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxLocationUsgFetch (boolean fetch) {
    this.TaxLocationUsgFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxLocationUsg (USAGE_TYPES.tax_location_usg)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxLocationUsgFetch () {
    return this.TaxLocationUsgFetch;
  }
  /** Set the SortOrder for field: TaxLocationUsg (USAGE_TYPES.tax_location_usg)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxLocationUsgSortOrder (Integer value) {
    this.TaxLocationUsgSort = value;
  }
  /** Retrieve SortOrder for field: TaxLocationUsg (USAGE_TYPES.tax_location_usg)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxLocationUsgSortOrder () {
    return this.TaxLocationUsgSort;
  }
  /** Set the sort direction for field: TaxLocationUsg (USAGE_TYPES.tax_location_usg)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxLocationUsgSortDirection (boolean ascending) {
    this.TaxLocationUsgSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxLocationUsg (USAGE_TYPES.tax_location_usg)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxLocationUsgSortDirection () {
    return this.TaxLocationUsgSortAscending;
  }
  /** Set the field level filters for field: TaxLocationUsg (USAGE_TYPES.tax_location_usg)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxLocationUsgFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxLocationUsg = value;
  }
  /** Retrieve filter for field: TaxLocationUsg (USAGE_TYPES.tax_location_usg)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxLocationUsgFilter () {
    return this.TaxLocationUsg;
  }

  /**
   * Retrieves the TaxLocationUsgFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxLocationUsgFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxLocationUsgFilter field
   */
  public String[] getTaxLocationUsgFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxLocationUsgFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxLocationUsgFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxLocationUsgFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxLocationUsgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxLocationUsgFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxLocationUsgFilter filter value from a formatted string
   *
   * @param _value the TaxLocationUsgFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxLocationUsgFilter filter field
   */
  public void setTaxLocationUsgFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxLocationUsgFilterFromFormattedString");
    try {
      this.setTaxLocationUsgFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxLocationUsgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxLocationUsgFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxLocationUsgFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TaxLocationOutcollect (USAGE_TYPES.tax_location_outcollect)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxLocationOutcollectFetch (boolean fetch) {
    this.TaxLocationOutcollectFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxLocationOutcollect (USAGE_TYPES.tax_location_outcollect)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxLocationOutcollectFetch () {
    return this.TaxLocationOutcollectFetch;
  }
  /** Set the SortOrder for field: TaxLocationOutcollect (USAGE_TYPES.tax_location_outcollect)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxLocationOutcollectSortOrder (Integer value) {
    this.TaxLocationOutcollectSort = value;
  }
  /** Retrieve SortOrder for field: TaxLocationOutcollect (USAGE_TYPES.tax_location_outcollect)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxLocationOutcollectSortOrder () {
    return this.TaxLocationOutcollectSort;
  }
  /** Set the sort direction for field: TaxLocationOutcollect (USAGE_TYPES.tax_location_outcollect)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxLocationOutcollectSortDirection (boolean ascending) {
    this.TaxLocationOutcollectSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxLocationOutcollect (USAGE_TYPES.tax_location_outcollect)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxLocationOutcollectSortDirection () {
    return this.TaxLocationOutcollectSortAscending;
  }
  /** Set the field level filters for field: TaxLocationOutcollect (USAGE_TYPES.tax_location_outcollect)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxLocationOutcollectFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxLocationOutcollect = value;
  }
  /** Retrieve filter for field: TaxLocationOutcollect (USAGE_TYPES.tax_location_outcollect)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxLocationOutcollectFilter () {
    return this.TaxLocationOutcollect;
  }

  /**
   * Retrieves the TaxLocationOutcollectFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxLocationOutcollectFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxLocationOutcollectFilter field
   */
  public String[] getTaxLocationOutcollectFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxLocationOutcollectFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxLocationOutcollectFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxLocationOutcollectFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxLocationOutcollectFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxLocationOutcollectFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxLocationOutcollectFilter filter value from a formatted string
   *
   * @param _value the TaxLocationOutcollectFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxLocationOutcollectFilter filter field
   */
  public void setTaxLocationOutcollectFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxLocationOutcollectFilterFromFormattedString");
    try {
      this.setTaxLocationOutcollectFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxLocationOutcollectFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxLocationOutcollectFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxLocationOutcollectFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UsgClass (USAGE_TYPES.usg_class)
   * @param fetch whether to fetch this field or not
   */
  public void setUsgClassFetch (boolean fetch) {
    this.UsgClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: UsgClass (USAGE_TYPES.usg_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getUsgClassFetch () {
    return this.UsgClassFetch;
  }
  /** Set the SortOrder for field: UsgClass (USAGE_TYPES.usg_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUsgClassSortOrder (Integer value) {
    this.UsgClassSort = value;
  }
  /** Retrieve SortOrder for field: UsgClass (USAGE_TYPES.usg_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUsgClassSortOrder () {
    return this.UsgClassSort;
  }
  /** Set the sort direction for field: UsgClass (USAGE_TYPES.usg_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUsgClassSortDirection (boolean ascending) {
    this.UsgClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UsgClass (USAGE_TYPES.usg_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUsgClassSortDirection () {
    return this.UsgClassSortAscending;
  }
  /** Set the field level filters for field: UsgClass (USAGE_TYPES.usg_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUsgClassFilter (IntegerFilter[] value) throws ServiceException {
    this.UsgClass = value;
  }
  /** Retrieve filter for field: UsgClass (USAGE_TYPES.usg_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUsgClassFilter () {
    return this.UsgClass;
  }

  /**
   * Retrieves the UsgClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UsgClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsgClassFilter field
   */
  public String[] getUsgClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsgClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUsgClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsgClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsgClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsgClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UsgClassFilter filter value from a formatted string
   *
   * @param _value the UsgClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UsgClassFilter filter field
   */
  public void setUsgClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUsgClassFilterFromFormattedString");
    try {
      this.setUsgClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsgClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsgClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsgClassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FreeUsg (USAGE_TYPES.free_usg)
   * @param fetch whether to fetch this field or not
   */
  public void setFreeUsgFetch (boolean fetch) {
    this.FreeUsgFetch = fetch;
  }
  /** Retrieve Fetch value for field: FreeUsg (USAGE_TYPES.free_usg)
   * @return boolean the Fetch value for this field
   */
  public boolean getFreeUsgFetch () {
    return this.FreeUsgFetch;
  }
  /** Set the SortOrder for field: FreeUsg (USAGE_TYPES.free_usg)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFreeUsgSortOrder (Integer value) {
    this.FreeUsgSort = value;
  }
  /** Retrieve SortOrder for field: FreeUsg (USAGE_TYPES.free_usg)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFreeUsgSortOrder () {
    return this.FreeUsgSort;
  }
  /** Set the sort direction for field: FreeUsg (USAGE_TYPES.free_usg)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFreeUsgSortDirection (boolean ascending) {
    this.FreeUsgSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FreeUsg (USAGE_TYPES.free_usg)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFreeUsgSortDirection () {
    return this.FreeUsgSortAscending;
  }
  /** Set the field level filters for field: FreeUsg (USAGE_TYPES.free_usg)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFreeUsgFilter (BooleanFilter[] value) throws ServiceException {
    this.FreeUsg = value;
  }
  /** Retrieve filter for field: FreeUsg (USAGE_TYPES.free_usg)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getFreeUsgFilter () {
    return this.FreeUsg;
  }

  /**
   * Retrieves the FreeUsgFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FreeUsgFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FreeUsgFilter field
   */
  public String[] getFreeUsgFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFreeUsgFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFreeUsgFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFreeUsgFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FreeUsgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFreeUsgFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FreeUsgFilter filter value from a formatted string
   *
   * @param _value the FreeUsgFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FreeUsgFilter filter field
   */
  public void setFreeUsgFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFreeUsgFilterFromFormattedString");
    try {
      this.setFreeUsgFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FreeUsgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFreeUsgFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFreeUsgFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProductLineId (USAGE_TYPES.product_line_id)
   * @param fetch whether to fetch this field or not
   */
  public void setProductLineIdFetch (boolean fetch) {
    this.ProductLineIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProductLineId (USAGE_TYPES.product_line_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getProductLineIdFetch () {
    return this.ProductLineIdFetch;
  }
  /** Set the SortOrder for field: ProductLineId (USAGE_TYPES.product_line_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProductLineIdSortOrder (Integer value) {
    this.ProductLineIdSort = value;
  }
  /** Retrieve SortOrder for field: ProductLineId (USAGE_TYPES.product_line_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProductLineIdSortOrder () {
    return this.ProductLineIdSort;
  }
  /** Set the sort direction for field: ProductLineId (USAGE_TYPES.product_line_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProductLineIdSortDirection (boolean ascending) {
    this.ProductLineIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProductLineId (USAGE_TYPES.product_line_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProductLineIdSortDirection () {
    return this.ProductLineIdSortAscending;
  }
  /** Set the field level filters for field: ProductLineId (USAGE_TYPES.product_line_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProductLineIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ProductLineId = value;
  }
  /** Retrieve filter for field: ProductLineId (USAGE_TYPES.product_line_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getProductLineIdFilter () {
    return this.ProductLineId;
  }

  /**
   * Retrieves the ProductLineIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProductLineIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProductLineIdFilter field
   */
  public String[] getProductLineIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductLineIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProductLineIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProductLineIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProductLineIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProductLineIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProductLineIdFilter filter value from a formatted string
   *
   * @param _value the ProductLineIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProductLineIdFilter filter field
   */
  public void setProductLineIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProductLineIdFilterFromFormattedString");
    try {
      this.setProductLineIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProductLineIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProductLineIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProductLineIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillAggrLevel (USAGE_TYPES.bill_aggr_level)
   * @param fetch whether to fetch this field or not
   */
  public void setBillAggrLevelFetch (boolean fetch) {
    this.BillAggrLevelFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillAggrLevel (USAGE_TYPES.bill_aggr_level)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillAggrLevelFetch () {
    return this.BillAggrLevelFetch;
  }
  /** Set the SortOrder for field: BillAggrLevel (USAGE_TYPES.bill_aggr_level)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillAggrLevelSortOrder (Integer value) {
    this.BillAggrLevelSort = value;
  }
  /** Retrieve SortOrder for field: BillAggrLevel (USAGE_TYPES.bill_aggr_level)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillAggrLevelSortOrder () {
    return this.BillAggrLevelSort;
  }
  /** Set the sort direction for field: BillAggrLevel (USAGE_TYPES.bill_aggr_level)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillAggrLevelSortDirection (boolean ascending) {
    this.BillAggrLevelSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillAggrLevel (USAGE_TYPES.bill_aggr_level)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillAggrLevelSortDirection () {
    return this.BillAggrLevelSortAscending;
  }
  /** Set the field level filters for field: BillAggrLevel (USAGE_TYPES.bill_aggr_level)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillAggrLevelFilter (IntegerFilter[] value) throws ServiceException {
    this.BillAggrLevel = value;
  }
  /** Retrieve filter for field: BillAggrLevel (USAGE_TYPES.bill_aggr_level)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillAggrLevelFilter () {
    return this.BillAggrLevel;
  }

  /**
   * Retrieves the BillAggrLevelFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillAggrLevelFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillAggrLevelFilter field
   */
  public String[] getBillAggrLevelFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillAggrLevelFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillAggrLevelFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillAggrLevelFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillAggrLevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillAggrLevelFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillAggrLevelFilter filter value from a formatted string
   *
   * @param _value the BillAggrLevelFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillAggrLevelFilter filter field
   */
  public void setBillAggrLevelFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillAggrLevelFilterFromFormattedString");
    try {
      this.setBillAggrLevelFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillAggrLevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillAggrLevelFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillAggrLevelFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DeriveJurisdiction (USAGE_TYPES.derive_jurisdiction)
   * @param fetch whether to fetch this field or not
   */
  public void setDeriveJurisdictionFetch (boolean fetch) {
    this.DeriveJurisdictionFetch = fetch;
  }
  /** Retrieve Fetch value for field: DeriveJurisdiction (USAGE_TYPES.derive_jurisdiction)
   * @return boolean the Fetch value for this field
   */
  public boolean getDeriveJurisdictionFetch () {
    return this.DeriveJurisdictionFetch;
  }
  /** Set the SortOrder for field: DeriveJurisdiction (USAGE_TYPES.derive_jurisdiction)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDeriveJurisdictionSortOrder (Integer value) {
    this.DeriveJurisdictionSort = value;
  }
  /** Retrieve SortOrder for field: DeriveJurisdiction (USAGE_TYPES.derive_jurisdiction)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDeriveJurisdictionSortOrder () {
    return this.DeriveJurisdictionSort;
  }
  /** Set the sort direction for field: DeriveJurisdiction (USAGE_TYPES.derive_jurisdiction)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDeriveJurisdictionSortDirection (boolean ascending) {
    this.DeriveJurisdictionSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DeriveJurisdiction (USAGE_TYPES.derive_jurisdiction)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDeriveJurisdictionSortDirection () {
    return this.DeriveJurisdictionSortAscending;
  }
  /** Set the field level filters for field: DeriveJurisdiction (USAGE_TYPES.derive_jurisdiction)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDeriveJurisdictionFilter (IntegerFilter[] value) throws ServiceException {
    this.DeriveJurisdiction = value;
  }
  /** Retrieve filter for field: DeriveJurisdiction (USAGE_TYPES.derive_jurisdiction)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDeriveJurisdictionFilter () {
    return this.DeriveJurisdiction;
  }

  /**
   * Retrieves the DeriveJurisdictionFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DeriveJurisdictionFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DeriveJurisdictionFilter field
   */
  public String[] getDeriveJurisdictionFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDeriveJurisdictionFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDeriveJurisdictionFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDeriveJurisdictionFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DeriveJurisdictionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDeriveJurisdictionFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DeriveJurisdictionFilter filter value from a formatted string
   *
   * @param _value the DeriveJurisdictionFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DeriveJurisdictionFilter filter field
   */
  public void setDeriveJurisdictionFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDeriveJurisdictionFilterFromFormattedString");
    try {
      this.setDeriveJurisdictionFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DeriveJurisdictionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDeriveJurisdictionFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDeriveJurisdictionFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UnitsIndicator (USAGE_TYPES.units_indicator)
   * @param fetch whether to fetch this field or not
   */
  public void setUnitsIndicatorFetch (boolean fetch) {
    this.UnitsIndicatorFetch = fetch;
  }
  /** Retrieve Fetch value for field: UnitsIndicator (USAGE_TYPES.units_indicator)
   * @return boolean the Fetch value for this field
   */
  public boolean getUnitsIndicatorFetch () {
    return this.UnitsIndicatorFetch;
  }
  /** Set the SortOrder for field: UnitsIndicator (USAGE_TYPES.units_indicator)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnitsIndicatorSortOrder (Integer value) {
    this.UnitsIndicatorSort = value;
  }
  /** Retrieve SortOrder for field: UnitsIndicator (USAGE_TYPES.units_indicator)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnitsIndicatorSortOrder () {
    return this.UnitsIndicatorSort;
  }
  /** Set the sort direction for field: UnitsIndicator (USAGE_TYPES.units_indicator)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnitsIndicatorSortDirection (boolean ascending) {
    this.UnitsIndicatorSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UnitsIndicator (USAGE_TYPES.units_indicator)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnitsIndicatorSortDirection () {
    return this.UnitsIndicatorSortAscending;
  }
  /** Set the field level filters for field: UnitsIndicator (USAGE_TYPES.units_indicator)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnitsIndicatorFilter (IntegerFilter[] value) throws ServiceException {
    this.UnitsIndicator = value;
  }
  /** Retrieve filter for field: UnitsIndicator (USAGE_TYPES.units_indicator)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUnitsIndicatorFilter () {
    return this.UnitsIndicator;
  }

  /**
   * Retrieves the UnitsIndicatorFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UnitsIndicatorFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitsIndicatorFilter field
   */
  public String[] getUnitsIndicatorFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsIndicatorFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUnitsIndicatorFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsIndicatorFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsIndicatorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsIndicatorFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UnitsIndicatorFilter filter value from a formatted string
   *
   * @param _value the UnitsIndicatorFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UnitsIndicatorFilter filter field
   */
  public void setUnitsIndicatorFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnitsIndicatorFilterFromFormattedString");
    try {
      this.setUnitsIndicatorFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsIndicatorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsIndicatorFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsIndicatorFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RatableUnitClass (USAGE_TYPES.ratable_unit_class)
   * @param fetch whether to fetch this field or not
   */
  public void setRatableUnitClassFetch (boolean fetch) {
    this.RatableUnitClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: RatableUnitClass (USAGE_TYPES.ratable_unit_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getRatableUnitClassFetch () {
    return this.RatableUnitClassFetch;
  }
  /** Set the SortOrder for field: RatableUnitClass (USAGE_TYPES.ratable_unit_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRatableUnitClassSortOrder (Integer value) {
    this.RatableUnitClassSort = value;
  }
  /** Retrieve SortOrder for field: RatableUnitClass (USAGE_TYPES.ratable_unit_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRatableUnitClassSortOrder () {
    return this.RatableUnitClassSort;
  }
  /** Set the sort direction for field: RatableUnitClass (USAGE_TYPES.ratable_unit_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRatableUnitClassSortDirection (boolean ascending) {
    this.RatableUnitClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RatableUnitClass (USAGE_TYPES.ratable_unit_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRatableUnitClassSortDirection () {
    return this.RatableUnitClassSortAscending;
  }
  /** Set the field level filters for field: RatableUnitClass (USAGE_TYPES.ratable_unit_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRatableUnitClassFilter (IntegerFilter[] value) throws ServiceException {
    this.RatableUnitClass = value;
  }
  /** Retrieve filter for field: RatableUnitClass (USAGE_TYPES.ratable_unit_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRatableUnitClassFilter () {
    return this.RatableUnitClass;
  }

  /**
   * Retrieves the RatableUnitClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RatableUnitClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatableUnitClassFilter field
   */
  public String[] getRatableUnitClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatableUnitClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRatableUnitClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatableUnitClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatableUnitClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatableUnitClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RatableUnitClassFilter filter value from a formatted string
   *
   * @param _value the RatableUnitClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RatableUnitClassFilter filter field
   */
  public void setRatableUnitClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRatableUnitClassFilterFromFormattedString");
    try {
      this.setRatableUnitClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatableUnitClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatableUnitClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatableUnitClassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DurationFlag (USAGE_TYPES.duration_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setDurationFlagFetch (boolean fetch) {
    this.DurationFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: DurationFlag (USAGE_TYPES.duration_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getDurationFlagFetch () {
    return this.DurationFlagFetch;
  }
  /** Set the SortOrder for field: DurationFlag (USAGE_TYPES.duration_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDurationFlagSortOrder (Integer value) {
    this.DurationFlagSort = value;
  }
  /** Retrieve SortOrder for field: DurationFlag (USAGE_TYPES.duration_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDurationFlagSortOrder () {
    return this.DurationFlagSort;
  }
  /** Set the sort direction for field: DurationFlag (USAGE_TYPES.duration_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDurationFlagSortDirection (boolean ascending) {
    this.DurationFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DurationFlag (USAGE_TYPES.duration_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDurationFlagSortDirection () {
    return this.DurationFlagSortAscending;
  }
  /** Set the field level filters for field: DurationFlag (USAGE_TYPES.duration_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDurationFlagFilter (BooleanFilter[] value) throws ServiceException {
    this.DurationFlag = value;
  }
  /** Retrieve filter for field: DurationFlag (USAGE_TYPES.duration_flag)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getDurationFlagFilter () {
    return this.DurationFlag;
  }

  /**
   * Retrieves the DurationFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DurationFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DurationFlagFilter field
   */
  public String[] getDurationFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDurationFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDurationFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDurationFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DurationFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDurationFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DurationFlagFilter filter value from a formatted string
   *
   * @param _value the DurationFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DurationFlagFilter filter field
   */
  public void setDurationFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDurationFlagFilterFromFormattedString");
    try {
      this.setDurationFlagFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DurationFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDurationFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDurationFlagFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DeriveDistanceUnits (USAGE_TYPES.derive_distance_units)
   * @param fetch whether to fetch this field or not
   */
  public void setDeriveDistanceUnitsFetch (boolean fetch) {
    this.DeriveDistanceUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: DeriveDistanceUnits (USAGE_TYPES.derive_distance_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getDeriveDistanceUnitsFetch () {
    return this.DeriveDistanceUnitsFetch;
  }
  /** Set the SortOrder for field: DeriveDistanceUnits (USAGE_TYPES.derive_distance_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDeriveDistanceUnitsSortOrder (Integer value) {
    this.DeriveDistanceUnitsSort = value;
  }
  /** Retrieve SortOrder for field: DeriveDistanceUnits (USAGE_TYPES.derive_distance_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDeriveDistanceUnitsSortOrder () {
    return this.DeriveDistanceUnitsSort;
  }
  /** Set the sort direction for field: DeriveDistanceUnits (USAGE_TYPES.derive_distance_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDeriveDistanceUnitsSortDirection (boolean ascending) {
    this.DeriveDistanceUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DeriveDistanceUnits (USAGE_TYPES.derive_distance_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDeriveDistanceUnitsSortDirection () {
    return this.DeriveDistanceUnitsSortAscending;
  }
  /** Set the field level filters for field: DeriveDistanceUnits (USAGE_TYPES.derive_distance_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDeriveDistanceUnitsFilter (IntegerFilter[] value) throws ServiceException {
    this.DeriveDistanceUnits = value;
  }
  /** Retrieve filter for field: DeriveDistanceUnits (USAGE_TYPES.derive_distance_units)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDeriveDistanceUnitsFilter () {
    return this.DeriveDistanceUnits;
  }

  /**
   * Retrieves the DeriveDistanceUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DeriveDistanceUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DeriveDistanceUnitsFilter field
   */
  public String[] getDeriveDistanceUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDeriveDistanceUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDeriveDistanceUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDeriveDistanceUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DeriveDistanceUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDeriveDistanceUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DeriveDistanceUnitsFilter filter value from a formatted string
   *
   * @param _value the DeriveDistanceUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DeriveDistanceUnitsFilter filter field
   */
  public void setDeriveDistanceUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDeriveDistanceUnitsFilterFromFormattedString");
    try {
      this.setDeriveDistanceUnitsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DeriveDistanceUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDeriveDistanceUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDeriveDistanceUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: VhMinorThreshold (USAGE_TYPES.vh_minor_threshold)
   * @param fetch whether to fetch this field or not
   */
  public void setVhMinorThresholdFetch (boolean fetch) {
    this.VhMinorThresholdFetch = fetch;
  }
  /** Retrieve Fetch value for field: VhMinorThreshold (USAGE_TYPES.vh_minor_threshold)
   * @return boolean the Fetch value for this field
   */
  public boolean getVhMinorThresholdFetch () {
    return this.VhMinorThresholdFetch;
  }
  /** Set the SortOrder for field: VhMinorThreshold (USAGE_TYPES.vh_minor_threshold)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setVhMinorThresholdSortOrder (Integer value) {
    this.VhMinorThresholdSort = value;
  }
  /** Retrieve SortOrder for field: VhMinorThreshold (USAGE_TYPES.vh_minor_threshold)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getVhMinorThresholdSortOrder () {
    return this.VhMinorThresholdSort;
  }
  /** Set the sort direction for field: VhMinorThreshold (USAGE_TYPES.vh_minor_threshold)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setVhMinorThresholdSortDirection (boolean ascending) {
    this.VhMinorThresholdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: VhMinorThreshold (USAGE_TYPES.vh_minor_threshold)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getVhMinorThresholdSortDirection () {
    return this.VhMinorThresholdSortAscending;
  }
  /** Set the field level filters for field: VhMinorThreshold (USAGE_TYPES.vh_minor_threshold)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setVhMinorThresholdFilter (IntegerFilter[] value) throws ServiceException {
    this.VhMinorThreshold = value;
  }
  /** Retrieve filter for field: VhMinorThreshold (USAGE_TYPES.vh_minor_threshold)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getVhMinorThresholdFilter () {
    return this.VhMinorThreshold;
  }

  /**
   * Retrieves the VhMinorThresholdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The VhMinorThresholdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the VhMinorThresholdFilter field
   */
  public String[] getVhMinorThresholdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVhMinorThresholdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getVhMinorThresholdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getVhMinorThresholdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("VhMinorThresholdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getVhMinorThresholdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the VhMinorThresholdFilter filter value from a formatted string
   *
   * @param _value the VhMinorThresholdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the VhMinorThresholdFilter filter field
   */
  public void setVhMinorThresholdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setVhMinorThresholdFilterFromFormattedString");
    try {
      this.setVhMinorThresholdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("VhMinorThresholdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setVhMinorThresholdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setVhMinorThresholdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DistanceUnitsIndicator (USAGE_TYPES.distance_units_indicator)
   * @param fetch whether to fetch this field or not
   */
  public void setDistanceUnitsIndicatorFetch (boolean fetch) {
    this.DistanceUnitsIndicatorFetch = fetch;
  }
  /** Retrieve Fetch value for field: DistanceUnitsIndicator (USAGE_TYPES.distance_units_indicator)
   * @return boolean the Fetch value for this field
   */
  public boolean getDistanceUnitsIndicatorFetch () {
    return this.DistanceUnitsIndicatorFetch;
  }
  /** Set the SortOrder for field: DistanceUnitsIndicator (USAGE_TYPES.distance_units_indicator)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDistanceUnitsIndicatorSortOrder (Integer value) {
    this.DistanceUnitsIndicatorSort = value;
  }
  /** Retrieve SortOrder for field: DistanceUnitsIndicator (USAGE_TYPES.distance_units_indicator)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDistanceUnitsIndicatorSortOrder () {
    return this.DistanceUnitsIndicatorSort;
  }
  /** Set the sort direction for field: DistanceUnitsIndicator (USAGE_TYPES.distance_units_indicator)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDistanceUnitsIndicatorSortDirection (boolean ascending) {
    this.DistanceUnitsIndicatorSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DistanceUnitsIndicator (USAGE_TYPES.distance_units_indicator)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDistanceUnitsIndicatorSortDirection () {
    return this.DistanceUnitsIndicatorSortAscending;
  }
  /** Set the field level filters for field: DistanceUnitsIndicator (USAGE_TYPES.distance_units_indicator)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDistanceUnitsIndicatorFilter (IntegerFilter[] value) throws ServiceException {
    this.DistanceUnitsIndicator = value;
  }
  /** Retrieve filter for field: DistanceUnitsIndicator (USAGE_TYPES.distance_units_indicator)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDistanceUnitsIndicatorFilter () {
    return this.DistanceUnitsIndicator;
  }

  /**
   * Retrieves the DistanceUnitsIndicatorFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DistanceUnitsIndicatorFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DistanceUnitsIndicatorFilter field
   */
  public String[] getDistanceUnitsIndicatorFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistanceUnitsIndicatorFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDistanceUnitsIndicatorFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDistanceUnitsIndicatorFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistanceUnitsIndicatorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDistanceUnitsIndicatorFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DistanceUnitsIndicatorFilter filter value from a formatted string
   *
   * @param _value the DistanceUnitsIndicatorFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DistanceUnitsIndicatorFilter filter field
   */
  public void setDistanceUnitsIndicatorFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDistanceUnitsIndicatorFilterFromFormattedString");
    try {
      this.setDistanceUnitsIndicatorFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistanceUnitsIndicatorFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDistanceUnitsIndicatorFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDistanceUnitsIndicatorFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: GuideToProvider (USAGE_TYPES.guide_to_provider)
   * @param fetch whether to fetch this field or not
   */
  public void setGuideToProviderFetch (boolean fetch) {
    this.GuideToProviderFetch = fetch;
  }
  /** Retrieve Fetch value for field: GuideToProvider (USAGE_TYPES.guide_to_provider)
   * @return boolean the Fetch value for this field
   */
  public boolean getGuideToProviderFetch () {
    return this.GuideToProviderFetch;
  }
  /** Set the SortOrder for field: GuideToProvider (USAGE_TYPES.guide_to_provider)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGuideToProviderSortOrder (Integer value) {
    this.GuideToProviderSort = value;
  }
  /** Retrieve SortOrder for field: GuideToProvider (USAGE_TYPES.guide_to_provider)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGuideToProviderSortOrder () {
    return this.GuideToProviderSort;
  }
  /** Set the sort direction for field: GuideToProvider (USAGE_TYPES.guide_to_provider)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGuideToProviderSortDirection (boolean ascending) {
    this.GuideToProviderSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GuideToProvider (USAGE_TYPES.guide_to_provider)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGuideToProviderSortDirection () {
    return this.GuideToProviderSortAscending;
  }
  /** Set the field level filters for field: GuideToProvider (USAGE_TYPES.guide_to_provider)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGuideToProviderFilter (IntegerFilter[] value) throws ServiceException {
    this.GuideToProvider = value;
  }
  /** Retrieve filter for field: GuideToProvider (USAGE_TYPES.guide_to_provider)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getGuideToProviderFilter () {
    return this.GuideToProvider;
  }

  /**
   * Retrieves the GuideToProviderFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GuideToProviderFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GuideToProviderFilter field
   */
  public String[] getGuideToProviderFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGuideToProviderFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGuideToProviderFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGuideToProviderFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GuideToProviderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGuideToProviderFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GuideToProviderFilter filter value from a formatted string
   *
   * @param _value the GuideToProviderFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GuideToProviderFilter filter field
   */
  public void setGuideToProviderFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGuideToProviderFilterFromFormattedString");
    try {
      this.setGuideToProviderFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GuideToProviderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGuideToProviderFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGuideToProviderFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsPrerated (USAGE_TYPES.is_prerated)
   * @param fetch whether to fetch this field or not
   */
  public void setIsPreratedFetch (boolean fetch) {
    this.IsPreratedFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsPrerated (USAGE_TYPES.is_prerated)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsPreratedFetch () {
    return this.IsPreratedFetch;
  }
  /** Set the SortOrder for field: IsPrerated (USAGE_TYPES.is_prerated)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsPreratedSortOrder (Integer value) {
    this.IsPreratedSort = value;
  }
  /** Retrieve SortOrder for field: IsPrerated (USAGE_TYPES.is_prerated)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsPreratedSortOrder () {
    return this.IsPreratedSort;
  }
  /** Set the sort direction for field: IsPrerated (USAGE_TYPES.is_prerated)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsPreratedSortDirection (boolean ascending) {
    this.IsPreratedSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsPrerated (USAGE_TYPES.is_prerated)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsPreratedSortDirection () {
    return this.IsPreratedSortAscending;
  }
  /** Set the field level filters for field: IsPrerated (USAGE_TYPES.is_prerated)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsPreratedFilter (BooleanFilter[] value) throws ServiceException {
    this.IsPrerated = value;
  }
  /** Retrieve filter for field: IsPrerated (USAGE_TYPES.is_prerated)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsPreratedFilter () {
    return this.IsPrerated;
  }

  /**
   * Retrieves the IsPreratedFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsPreratedFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsPreratedFilter field
   */
  public String[] getIsPreratedFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsPreratedFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsPreratedFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsPreratedFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsPreratedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsPreratedFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsPreratedFilter filter value from a formatted string
   *
   * @param _value the IsPreratedFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsPreratedFilter filter field
   */
  public void setIsPreratedFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsPreratedFilterFromFormattedString");
    try {
      this.setIsPreratedFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsPreratedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsPreratedFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsPreratedFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: KeepRunningTotal (USAGE_TYPES.keep_running_total)
   * @param fetch whether to fetch this field or not
   */
  public void setKeepRunningTotalFetch (boolean fetch) {
    this.KeepRunningTotalFetch = fetch;
  }
  /** Retrieve Fetch value for field: KeepRunningTotal (USAGE_TYPES.keep_running_total)
   * @return boolean the Fetch value for this field
   */
  public boolean getKeepRunningTotalFetch () {
    return this.KeepRunningTotalFetch;
  }
  /** Set the SortOrder for field: KeepRunningTotal (USAGE_TYPES.keep_running_total)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setKeepRunningTotalSortOrder (Integer value) {
    this.KeepRunningTotalSort = value;
  }
  /** Retrieve SortOrder for field: KeepRunningTotal (USAGE_TYPES.keep_running_total)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getKeepRunningTotalSortOrder () {
    return this.KeepRunningTotalSort;
  }
  /** Set the sort direction for field: KeepRunningTotal (USAGE_TYPES.keep_running_total)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setKeepRunningTotalSortDirection (boolean ascending) {
    this.KeepRunningTotalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: KeepRunningTotal (USAGE_TYPES.keep_running_total)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getKeepRunningTotalSortDirection () {
    return this.KeepRunningTotalSortAscending;
  }
  /** Set the field level filters for field: KeepRunningTotal (USAGE_TYPES.keep_running_total)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setKeepRunningTotalFilter (BooleanFilter[] value) throws ServiceException {
    this.KeepRunningTotal = value;
  }
  /** Retrieve filter for field: KeepRunningTotal (USAGE_TYPES.keep_running_total)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getKeepRunningTotalFilter () {
    return this.KeepRunningTotal;
  }

  /**
   * Retrieves the KeepRunningTotalFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The KeepRunningTotalFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the KeepRunningTotalFilter field
   */
  public String[] getKeepRunningTotalFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getKeepRunningTotalFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getKeepRunningTotalFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getKeepRunningTotalFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("KeepRunningTotalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getKeepRunningTotalFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the KeepRunningTotalFilter filter value from a formatted string
   *
   * @param _value the KeepRunningTotalFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the KeepRunningTotalFilter filter field
   */
  public void setKeepRunningTotalFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setKeepRunningTotalFilterFromFormattedString");
    try {
      this.setKeepRunningTotalFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("KeepRunningTotalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setKeepRunningTotalFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setKeepRunningTotalFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RoundingMethod (USAGE_TYPES.rounding_method)
   * @param fetch whether to fetch this field or not
   */
  public void setRoundingMethodFetch (boolean fetch) {
    this.RoundingMethodFetch = fetch;
  }
  /** Retrieve Fetch value for field: RoundingMethod (USAGE_TYPES.rounding_method)
   * @return boolean the Fetch value for this field
   */
  public boolean getRoundingMethodFetch () {
    return this.RoundingMethodFetch;
  }
  /** Set the SortOrder for field: RoundingMethod (USAGE_TYPES.rounding_method)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRoundingMethodSortOrder (Integer value) {
    this.RoundingMethodSort = value;
  }
  /** Retrieve SortOrder for field: RoundingMethod (USAGE_TYPES.rounding_method)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRoundingMethodSortOrder () {
    return this.RoundingMethodSort;
  }
  /** Set the sort direction for field: RoundingMethod (USAGE_TYPES.rounding_method)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRoundingMethodSortDirection (boolean ascending) {
    this.RoundingMethodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RoundingMethod (USAGE_TYPES.rounding_method)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRoundingMethodSortDirection () {
    return this.RoundingMethodSortAscending;
  }
  /** Set the field level filters for field: RoundingMethod (USAGE_TYPES.rounding_method)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRoundingMethodFilter (IntegerFilter[] value) throws ServiceException {
    this.RoundingMethod = value;
  }
  /** Retrieve filter for field: RoundingMethod (USAGE_TYPES.rounding_method)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRoundingMethodFilter () {
    return this.RoundingMethod;
  }

  /**
   * Retrieves the RoundingMethodFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RoundingMethodFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RoundingMethodFilter field
   */
  public String[] getRoundingMethodFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRoundingMethodFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRoundingMethodFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRoundingMethodFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RoundingMethodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRoundingMethodFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RoundingMethodFilter filter value from a formatted string
   *
   * @param _value the RoundingMethodFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RoundingMethodFilter filter field
   */
  public void setRoundingMethodFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRoundingMethodFilterFromFormattedString");
    try {
      this.setRoundingMethodFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RoundingMethodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRoundingMethodFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRoundingMethodFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RawUnitsType (USAGE_TYPES.raw_units_type)
   * @param fetch whether to fetch this field or not
   */
  public void setRawUnitsTypeFetch (boolean fetch) {
    this.RawUnitsTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: RawUnitsType (USAGE_TYPES.raw_units_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getRawUnitsTypeFetch () {
    return this.RawUnitsTypeFetch;
  }
  /** Set the SortOrder for field: RawUnitsType (USAGE_TYPES.raw_units_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRawUnitsTypeSortOrder (Integer value) {
    this.RawUnitsTypeSort = value;
  }
  /** Retrieve SortOrder for field: RawUnitsType (USAGE_TYPES.raw_units_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRawUnitsTypeSortOrder () {
    return this.RawUnitsTypeSort;
  }
  /** Set the sort direction for field: RawUnitsType (USAGE_TYPES.raw_units_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRawUnitsTypeSortDirection (boolean ascending) {
    this.RawUnitsTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RawUnitsType (USAGE_TYPES.raw_units_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRawUnitsTypeSortDirection () {
    return this.RawUnitsTypeSortAscending;
  }
  /** Set the field level filters for field: RawUnitsType (USAGE_TYPES.raw_units_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRawUnitsTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.RawUnitsType = value;
  }
  /** Retrieve filter for field: RawUnitsType (USAGE_TYPES.raw_units_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRawUnitsTypeFilter () {
    return this.RawUnitsType;
  }

  /**
   * Retrieves the RawUnitsTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RawUnitsTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RawUnitsTypeFilter field
   */
  public String[] getRawUnitsTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRawUnitsTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRawUnitsTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRawUnitsTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RawUnitsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRawUnitsTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RawUnitsTypeFilter filter value from a formatted string
   *
   * @param _value the RawUnitsTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RawUnitsTypeFilter filter field
   */
  public void setRawUnitsTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRawUnitsTypeFilterFromFormattedString");
    try {
      this.setRawUnitsTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RawUnitsTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRawUnitsTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRawUnitsTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UseRateClass (USAGE_TYPES.use_rate_class)
   * @param fetch whether to fetch this field or not
   */
  public void setUseRateClassFetch (boolean fetch) {
    this.UseRateClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: UseRateClass (USAGE_TYPES.use_rate_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getUseRateClassFetch () {
    return this.UseRateClassFetch;
  }
  /** Set the SortOrder for field: UseRateClass (USAGE_TYPES.use_rate_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUseRateClassSortOrder (Integer value) {
    this.UseRateClassSort = value;
  }
  /** Retrieve SortOrder for field: UseRateClass (USAGE_TYPES.use_rate_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUseRateClassSortOrder () {
    return this.UseRateClassSort;
  }
  /** Set the sort direction for field: UseRateClass (USAGE_TYPES.use_rate_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUseRateClassSortDirection (boolean ascending) {
    this.UseRateClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UseRateClass (USAGE_TYPES.use_rate_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUseRateClassSortDirection () {
    return this.UseRateClassSortAscending;
  }
  /** Set the field level filters for field: UseRateClass (USAGE_TYPES.use_rate_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUseRateClassFilter (IntegerFilter[] value) throws ServiceException {
    this.UseRateClass = value;
  }
  /** Retrieve filter for field: UseRateClass (USAGE_TYPES.use_rate_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUseRateClassFilter () {
    return this.UseRateClass;
  }

  /**
   * Retrieves the UseRateClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UseRateClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseRateClassFilter field
   */
  public String[] getUseRateClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseRateClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUseRateClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseRateClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseRateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseRateClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UseRateClassFilter filter value from a formatted string
   *
   * @param _value the UseRateClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UseRateClassFilter filter field
   */
  public void setUseRateClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUseRateClassFilterFromFormattedString");
    try {
      this.setUseRateClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseRateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseRateClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseRateClassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UseBillClass (USAGE_TYPES.use_bill_class)
   * @param fetch whether to fetch this field or not
   */
  public void setUseBillClassFetch (boolean fetch) {
    this.UseBillClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: UseBillClass (USAGE_TYPES.use_bill_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getUseBillClassFetch () {
    return this.UseBillClassFetch;
  }
  /** Set the SortOrder for field: UseBillClass (USAGE_TYPES.use_bill_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUseBillClassSortOrder (Integer value) {
    this.UseBillClassSort = value;
  }
  /** Retrieve SortOrder for field: UseBillClass (USAGE_TYPES.use_bill_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUseBillClassSortOrder () {
    return this.UseBillClassSort;
  }
  /** Set the sort direction for field: UseBillClass (USAGE_TYPES.use_bill_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUseBillClassSortDirection (boolean ascending) {
    this.UseBillClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UseBillClass (USAGE_TYPES.use_bill_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUseBillClassSortDirection () {
    return this.UseBillClassSortAscending;
  }
  /** Set the field level filters for field: UseBillClass (USAGE_TYPES.use_bill_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUseBillClassFilter (IntegerFilter[] value) throws ServiceException {
    this.UseBillClass = value;
  }
  /** Retrieve filter for field: UseBillClass (USAGE_TYPES.use_bill_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUseBillClassFilter () {
    return this.UseBillClass;
  }

  /**
   * Retrieves the UseBillClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UseBillClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseBillClassFilter field
   */
  public String[] getUseBillClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseBillClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUseBillClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseBillClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseBillClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseBillClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UseBillClassFilter filter value from a formatted string
   *
   * @param _value the UseBillClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UseBillClassFilter filter field
   */
  public void setUseBillClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUseBillClassFilterFromFormattedString");
    try {
      this.setUseBillClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseBillClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseBillClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseBillClassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UseJurisdiction (USAGE_TYPES.use_jurisdiction)
   * @param fetch whether to fetch this field or not
   */
  public void setUseJurisdictionFetch (boolean fetch) {
    this.UseJurisdictionFetch = fetch;
  }
  /** Retrieve Fetch value for field: UseJurisdiction (USAGE_TYPES.use_jurisdiction)
   * @return boolean the Fetch value for this field
   */
  public boolean getUseJurisdictionFetch () {
    return this.UseJurisdictionFetch;
  }
  /** Set the SortOrder for field: UseJurisdiction (USAGE_TYPES.use_jurisdiction)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUseJurisdictionSortOrder (Integer value) {
    this.UseJurisdictionSort = value;
  }
  /** Retrieve SortOrder for field: UseJurisdiction (USAGE_TYPES.use_jurisdiction)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUseJurisdictionSortOrder () {
    return this.UseJurisdictionSort;
  }
  /** Set the sort direction for field: UseJurisdiction (USAGE_TYPES.use_jurisdiction)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUseJurisdictionSortDirection (boolean ascending) {
    this.UseJurisdictionSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UseJurisdiction (USAGE_TYPES.use_jurisdiction)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUseJurisdictionSortDirection () {
    return this.UseJurisdictionSortAscending;
  }
  /** Set the field level filters for field: UseJurisdiction (USAGE_TYPES.use_jurisdiction)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUseJurisdictionFilter (IntegerFilter[] value) throws ServiceException {
    this.UseJurisdiction = value;
  }
  /** Retrieve filter for field: UseJurisdiction (USAGE_TYPES.use_jurisdiction)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUseJurisdictionFilter () {
    return this.UseJurisdiction;
  }

  /**
   * Retrieves the UseJurisdictionFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UseJurisdictionFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseJurisdictionFilter field
   */
  public String[] getUseJurisdictionFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseJurisdictionFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUseJurisdictionFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseJurisdictionFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseJurisdictionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseJurisdictionFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UseJurisdictionFilter filter value from a formatted string
   *
   * @param _value the UseJurisdictionFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UseJurisdictionFilter filter field
   */
  public void setUseJurisdictionFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUseJurisdictionFilterFromFormattedString");
    try {
      this.setUseJurisdictionFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseJurisdictionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseJurisdictionFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseJurisdictionFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UsePointClassOrigin (USAGE_TYPES.use_point_class_origin)
   * @param fetch whether to fetch this field or not
   */
  public void setUsePointClassOriginFetch (boolean fetch) {
    this.UsePointClassOriginFetch = fetch;
  }
  /** Retrieve Fetch value for field: UsePointClassOrigin (USAGE_TYPES.use_point_class_origin)
   * @return boolean the Fetch value for this field
   */
  public boolean getUsePointClassOriginFetch () {
    return this.UsePointClassOriginFetch;
  }
  /** Set the SortOrder for field: UsePointClassOrigin (USAGE_TYPES.use_point_class_origin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUsePointClassOriginSortOrder (Integer value) {
    this.UsePointClassOriginSort = value;
  }
  /** Retrieve SortOrder for field: UsePointClassOrigin (USAGE_TYPES.use_point_class_origin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUsePointClassOriginSortOrder () {
    return this.UsePointClassOriginSort;
  }
  /** Set the sort direction for field: UsePointClassOrigin (USAGE_TYPES.use_point_class_origin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUsePointClassOriginSortDirection (boolean ascending) {
    this.UsePointClassOriginSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UsePointClassOrigin (USAGE_TYPES.use_point_class_origin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUsePointClassOriginSortDirection () {
    return this.UsePointClassOriginSortAscending;
  }
  /** Set the field level filters for field: UsePointClassOrigin (USAGE_TYPES.use_point_class_origin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUsePointClassOriginFilter (IntegerFilter[] value) throws ServiceException {
    this.UsePointClassOrigin = value;
  }
  /** Retrieve filter for field: UsePointClassOrigin (USAGE_TYPES.use_point_class_origin)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUsePointClassOriginFilter () {
    return this.UsePointClassOrigin;
  }

  /**
   * Retrieves the UsePointClassOriginFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UsePointClassOriginFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsePointClassOriginFilter field
   */
  public String[] getUsePointClassOriginFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsePointClassOriginFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUsePointClassOriginFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsePointClassOriginFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsePointClassOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsePointClassOriginFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UsePointClassOriginFilter filter value from a formatted string
   *
   * @param _value the UsePointClassOriginFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UsePointClassOriginFilter filter field
   */
  public void setUsePointClassOriginFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUsePointClassOriginFilterFromFormattedString");
    try {
      this.setUsePointClassOriginFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsePointClassOriginFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsePointClassOriginFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsePointClassOriginFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UsePointClassTarget (USAGE_TYPES.use_point_class_target)
   * @param fetch whether to fetch this field or not
   */
  public void setUsePointClassTargetFetch (boolean fetch) {
    this.UsePointClassTargetFetch = fetch;
  }
  /** Retrieve Fetch value for field: UsePointClassTarget (USAGE_TYPES.use_point_class_target)
   * @return boolean the Fetch value for this field
   */
  public boolean getUsePointClassTargetFetch () {
    return this.UsePointClassTargetFetch;
  }
  /** Set the SortOrder for field: UsePointClassTarget (USAGE_TYPES.use_point_class_target)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUsePointClassTargetSortOrder (Integer value) {
    this.UsePointClassTargetSort = value;
  }
  /** Retrieve SortOrder for field: UsePointClassTarget (USAGE_TYPES.use_point_class_target)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUsePointClassTargetSortOrder () {
    return this.UsePointClassTargetSort;
  }
  /** Set the sort direction for field: UsePointClassTarget (USAGE_TYPES.use_point_class_target)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUsePointClassTargetSortDirection (boolean ascending) {
    this.UsePointClassTargetSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UsePointClassTarget (USAGE_TYPES.use_point_class_target)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUsePointClassTargetSortDirection () {
    return this.UsePointClassTargetSortAscending;
  }
  /** Set the field level filters for field: UsePointClassTarget (USAGE_TYPES.use_point_class_target)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUsePointClassTargetFilter (IntegerFilter[] value) throws ServiceException {
    this.UsePointClassTarget = value;
  }
  /** Retrieve filter for field: UsePointClassTarget (USAGE_TYPES.use_point_class_target)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUsePointClassTargetFilter () {
    return this.UsePointClassTarget;
  }

  /**
   * Retrieves the UsePointClassTargetFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UsePointClassTargetFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsePointClassTargetFilter field
   */
  public String[] getUsePointClassTargetFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsePointClassTargetFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUsePointClassTargetFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsePointClassTargetFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsePointClassTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsePointClassTargetFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UsePointClassTargetFilter filter value from a formatted string
   *
   * @param _value the UsePointClassTargetFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UsePointClassTargetFilter filter field
   */
  public void setUsePointClassTargetFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUsePointClassTargetFilterFromFormattedString");
    try {
      this.setUsePointClassTargetFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UsePointClassTargetFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsePointClassTargetFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsePointClassTargetFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UseProviderClass (USAGE_TYPES.use_provider_class)
   * @param fetch whether to fetch this field or not
   */
  public void setUseProviderClassFetch (boolean fetch) {
    this.UseProviderClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: UseProviderClass (USAGE_TYPES.use_provider_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getUseProviderClassFetch () {
    return this.UseProviderClassFetch;
  }
  /** Set the SortOrder for field: UseProviderClass (USAGE_TYPES.use_provider_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUseProviderClassSortOrder (Integer value) {
    this.UseProviderClassSort = value;
  }
  /** Retrieve SortOrder for field: UseProviderClass (USAGE_TYPES.use_provider_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUseProviderClassSortOrder () {
    return this.UseProviderClassSort;
  }
  /** Set the sort direction for field: UseProviderClass (USAGE_TYPES.use_provider_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUseProviderClassSortDirection (boolean ascending) {
    this.UseProviderClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UseProviderClass (USAGE_TYPES.use_provider_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUseProviderClassSortDirection () {
    return this.UseProviderClassSortAscending;
  }
  /** Set the field level filters for field: UseProviderClass (USAGE_TYPES.use_provider_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUseProviderClassFilter (IntegerFilter[] value) throws ServiceException {
    this.UseProviderClass = value;
  }
  /** Retrieve filter for field: UseProviderClass (USAGE_TYPES.use_provider_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUseProviderClassFilter () {
    return this.UseProviderClass;
  }

  /**
   * Retrieves the UseProviderClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UseProviderClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseProviderClassFilter field
   */
  public String[] getUseProviderClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseProviderClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUseProviderClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseProviderClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseProviderClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseProviderClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UseProviderClassFilter filter value from a formatted string
   *
   * @param _value the UseProviderClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UseProviderClassFilter filter field
   */
  public void setUseProviderClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUseProviderClassFilterFromFormattedString");
    try {
      this.setUseProviderClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseProviderClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseProviderClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseProviderClassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UseRatePeriod (USAGE_TYPES.use_rate_period)
   * @param fetch whether to fetch this field or not
   */
  public void setUseRatePeriodFetch (boolean fetch) {
    this.UseRatePeriodFetch = fetch;
  }
  /** Retrieve Fetch value for field: UseRatePeriod (USAGE_TYPES.use_rate_period)
   * @return boolean the Fetch value for this field
   */
  public boolean getUseRatePeriodFetch () {
    return this.UseRatePeriodFetch;
  }
  /** Set the SortOrder for field: UseRatePeriod (USAGE_TYPES.use_rate_period)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUseRatePeriodSortOrder (Integer value) {
    this.UseRatePeriodSort = value;
  }
  /** Retrieve SortOrder for field: UseRatePeriod (USAGE_TYPES.use_rate_period)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUseRatePeriodSortOrder () {
    return this.UseRatePeriodSort;
  }
  /** Set the sort direction for field: UseRatePeriod (USAGE_TYPES.use_rate_period)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUseRatePeriodSortDirection (boolean ascending) {
    this.UseRatePeriodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UseRatePeriod (USAGE_TYPES.use_rate_period)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUseRatePeriodSortDirection () {
    return this.UseRatePeriodSortAscending;
  }
  /** Set the field level filters for field: UseRatePeriod (USAGE_TYPES.use_rate_period)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUseRatePeriodFilter (IntegerFilter[] value) throws ServiceException {
    this.UseRatePeriod = value;
  }
  /** Retrieve filter for field: UseRatePeriod (USAGE_TYPES.use_rate_period)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUseRatePeriodFilter () {
    return this.UseRatePeriod;
  }

  /**
   * Retrieves the UseRatePeriodFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UseRatePeriodFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseRatePeriodFilter field
   */
  public String[] getUseRatePeriodFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseRatePeriodFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUseRatePeriodFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseRatePeriodFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseRatePeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseRatePeriodFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UseRatePeriodFilter filter value from a formatted string
   *
   * @param _value the UseRatePeriodFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UseRatePeriodFilter filter field
   */
  public void setUseRatePeriodFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUseRatePeriodFilterFromFormattedString");
    try {
      this.setUseRatePeriodFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseRatePeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseRatePeriodFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseRatePeriodFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UseElementId (USAGE_TYPES.use_element_id)
   * @param fetch whether to fetch this field or not
   */
  public void setUseElementIdFetch (boolean fetch) {
    this.UseElementIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: UseElementId (USAGE_TYPES.use_element_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getUseElementIdFetch () {
    return this.UseElementIdFetch;
  }
  /** Set the SortOrder for field: UseElementId (USAGE_TYPES.use_element_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUseElementIdSortOrder (Integer value) {
    this.UseElementIdSort = value;
  }
  /** Retrieve SortOrder for field: UseElementId (USAGE_TYPES.use_element_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUseElementIdSortOrder () {
    return this.UseElementIdSort;
  }
  /** Set the sort direction for field: UseElementId (USAGE_TYPES.use_element_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUseElementIdSortDirection (boolean ascending) {
    this.UseElementIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UseElementId (USAGE_TYPES.use_element_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUseElementIdSortDirection () {
    return this.UseElementIdSortAscending;
  }
  /** Set the field level filters for field: UseElementId (USAGE_TYPES.use_element_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUseElementIdFilter (IntegerFilter[] value) throws ServiceException {
    this.UseElementId = value;
  }
  /** Retrieve filter for field: UseElementId (USAGE_TYPES.use_element_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUseElementIdFilter () {
    return this.UseElementId;
  }

  /**
   * Retrieves the UseElementIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UseElementIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseElementIdFilter field
   */
  public String[] getUseElementIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseElementIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUseElementIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseElementIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseElementIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseElementIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UseElementIdFilter filter value from a formatted string
   *
   * @param _value the UseElementIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UseElementIdFilter filter field
   */
  public void setUseElementIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUseElementIdFilterFromFormattedString");
    try {
      this.setUseElementIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseElementIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseElementIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseElementIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UseEquipTypeCode (USAGE_TYPES.use_equip_type_code)
   * @param fetch whether to fetch this field or not
   */
  public void setUseEquipTypeCodeFetch (boolean fetch) {
    this.UseEquipTypeCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: UseEquipTypeCode (USAGE_TYPES.use_equip_type_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getUseEquipTypeCodeFetch () {
    return this.UseEquipTypeCodeFetch;
  }
  /** Set the SortOrder for field: UseEquipTypeCode (USAGE_TYPES.use_equip_type_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUseEquipTypeCodeSortOrder (Integer value) {
    this.UseEquipTypeCodeSort = value;
  }
  /** Retrieve SortOrder for field: UseEquipTypeCode (USAGE_TYPES.use_equip_type_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUseEquipTypeCodeSortOrder () {
    return this.UseEquipTypeCodeSort;
  }
  /** Set the sort direction for field: UseEquipTypeCode (USAGE_TYPES.use_equip_type_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUseEquipTypeCodeSortDirection (boolean ascending) {
    this.UseEquipTypeCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UseEquipTypeCode (USAGE_TYPES.use_equip_type_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUseEquipTypeCodeSortDirection () {
    return this.UseEquipTypeCodeSortAscending;
  }
  /** Set the field level filters for field: UseEquipTypeCode (USAGE_TYPES.use_equip_type_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUseEquipTypeCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.UseEquipTypeCode = value;
  }
  /** Retrieve filter for field: UseEquipTypeCode (USAGE_TYPES.use_equip_type_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUseEquipTypeCodeFilter () {
    return this.UseEquipTypeCode;
  }

  /**
   * Retrieves the UseEquipTypeCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UseEquipTypeCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseEquipTypeCodeFilter field
   */
  public String[] getUseEquipTypeCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseEquipTypeCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUseEquipTypeCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseEquipTypeCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseEquipTypeCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseEquipTypeCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UseEquipTypeCodeFilter filter value from a formatted string
   *
   * @param _value the UseEquipTypeCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UseEquipTypeCodeFilter filter field
   */
  public void setUseEquipTypeCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUseEquipTypeCodeFilterFromFormattedString");
    try {
      this.setUseEquipTypeCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseEquipTypeCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseEquipTypeCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseEquipTypeCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UseEquipClassCode (USAGE_TYPES.use_equip_class_code)
   * @param fetch whether to fetch this field or not
   */
  public void setUseEquipClassCodeFetch (boolean fetch) {
    this.UseEquipClassCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: UseEquipClassCode (USAGE_TYPES.use_equip_class_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getUseEquipClassCodeFetch () {
    return this.UseEquipClassCodeFetch;
  }
  /** Set the SortOrder for field: UseEquipClassCode (USAGE_TYPES.use_equip_class_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUseEquipClassCodeSortOrder (Integer value) {
    this.UseEquipClassCodeSort = value;
  }
  /** Retrieve SortOrder for field: UseEquipClassCode (USAGE_TYPES.use_equip_class_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUseEquipClassCodeSortOrder () {
    return this.UseEquipClassCodeSort;
  }
  /** Set the sort direction for field: UseEquipClassCode (USAGE_TYPES.use_equip_class_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUseEquipClassCodeSortDirection (boolean ascending) {
    this.UseEquipClassCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UseEquipClassCode (USAGE_TYPES.use_equip_class_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUseEquipClassCodeSortDirection () {
    return this.UseEquipClassCodeSortAscending;
  }
  /** Set the field level filters for field: UseEquipClassCode (USAGE_TYPES.use_equip_class_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUseEquipClassCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.UseEquipClassCode = value;
  }
  /** Retrieve filter for field: UseEquipClassCode (USAGE_TYPES.use_equip_class_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUseEquipClassCodeFilter () {
    return this.UseEquipClassCode;
  }

  /**
   * Retrieves the UseEquipClassCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UseEquipClassCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseEquipClassCodeFilter field
   */
  public String[] getUseEquipClassCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseEquipClassCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUseEquipClassCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseEquipClassCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseEquipClassCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseEquipClassCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UseEquipClassCodeFilter filter value from a formatted string
   *
   * @param _value the UseEquipClassCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UseEquipClassCodeFilter filter field
   */
  public void setUseEquipClassCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUseEquipClassCodeFilterFromFormattedString");
    try {
      this.setUseEquipClassCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseEquipClassCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseEquipClassCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseEquipClassCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UseClassOfServiceCode (USAGE_TYPES.use_class_of_service_code)
   * @param fetch whether to fetch this field or not
   */
  public void setUseClassOfServiceCodeFetch (boolean fetch) {
    this.UseClassOfServiceCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: UseClassOfServiceCode (USAGE_TYPES.use_class_of_service_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getUseClassOfServiceCodeFetch () {
    return this.UseClassOfServiceCodeFetch;
  }
  /** Set the SortOrder for field: UseClassOfServiceCode (USAGE_TYPES.use_class_of_service_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUseClassOfServiceCodeSortOrder (Integer value) {
    this.UseClassOfServiceCodeSort = value;
  }
  /** Retrieve SortOrder for field: UseClassOfServiceCode (USAGE_TYPES.use_class_of_service_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUseClassOfServiceCodeSortOrder () {
    return this.UseClassOfServiceCodeSort;
  }
  /** Set the sort direction for field: UseClassOfServiceCode (USAGE_TYPES.use_class_of_service_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUseClassOfServiceCodeSortDirection (boolean ascending) {
    this.UseClassOfServiceCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UseClassOfServiceCode (USAGE_TYPES.use_class_of_service_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUseClassOfServiceCodeSortDirection () {
    return this.UseClassOfServiceCodeSortAscending;
  }
  /** Set the field level filters for field: UseClassOfServiceCode (USAGE_TYPES.use_class_of_service_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUseClassOfServiceCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.UseClassOfServiceCode = value;
  }
  /** Retrieve filter for field: UseClassOfServiceCode (USAGE_TYPES.use_class_of_service_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUseClassOfServiceCodeFilter () {
    return this.UseClassOfServiceCode;
  }

  /**
   * Retrieves the UseClassOfServiceCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UseClassOfServiceCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseClassOfServiceCodeFilter field
   */
  public String[] getUseClassOfServiceCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseClassOfServiceCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUseClassOfServiceCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseClassOfServiceCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseClassOfServiceCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseClassOfServiceCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UseClassOfServiceCodeFilter filter value from a formatted string
   *
   * @param _value the UseClassOfServiceCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UseClassOfServiceCodeFilter filter field
   */
  public void setUseClassOfServiceCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUseClassOfServiceCodeFilterFromFormattedString");
    try {
      this.setUseClassOfServiceCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseClassOfServiceCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseClassOfServiceCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseClassOfServiceCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UseDistanceBandId (USAGE_TYPES.use_distance_band_id)
   * @param fetch whether to fetch this field or not
   */
  public void setUseDistanceBandIdFetch (boolean fetch) {
    this.UseDistanceBandIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: UseDistanceBandId (USAGE_TYPES.use_distance_band_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getUseDistanceBandIdFetch () {
    return this.UseDistanceBandIdFetch;
  }
  /** Set the SortOrder for field: UseDistanceBandId (USAGE_TYPES.use_distance_band_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUseDistanceBandIdSortOrder (Integer value) {
    this.UseDistanceBandIdSort = value;
  }
  /** Retrieve SortOrder for field: UseDistanceBandId (USAGE_TYPES.use_distance_band_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUseDistanceBandIdSortOrder () {
    return this.UseDistanceBandIdSort;
  }
  /** Set the sort direction for field: UseDistanceBandId (USAGE_TYPES.use_distance_band_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUseDistanceBandIdSortDirection (boolean ascending) {
    this.UseDistanceBandIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UseDistanceBandId (USAGE_TYPES.use_distance_band_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUseDistanceBandIdSortDirection () {
    return this.UseDistanceBandIdSortAscending;
  }
  /** Set the field level filters for field: UseDistanceBandId (USAGE_TYPES.use_distance_band_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUseDistanceBandIdFilter (IntegerFilter[] value) throws ServiceException {
    this.UseDistanceBandId = value;
  }
  /** Retrieve filter for field: UseDistanceBandId (USAGE_TYPES.use_distance_band_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUseDistanceBandIdFilter () {
    return this.UseDistanceBandId;
  }

  /**
   * Retrieves the UseDistanceBandIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UseDistanceBandIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseDistanceBandIdFilter field
   */
  public String[] getUseDistanceBandIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseDistanceBandIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUseDistanceBandIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseDistanceBandIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseDistanceBandIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseDistanceBandIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UseDistanceBandIdFilter filter value from a formatted string
   *
   * @param _value the UseDistanceBandIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UseDistanceBandIdFilter filter field
   */
  public void setUseDistanceBandIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUseDistanceBandIdFilterFromFormattedString");
    try {
      this.setUseDistanceBandIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseDistanceBandIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseDistanceBandIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseDistanceBandIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UseDefaultRateType (USAGE_TYPES.use_default_rate_type)
   * @param fetch whether to fetch this field or not
   */
  public void setUseDefaultRateTypeFetch (boolean fetch) {
    this.UseDefaultRateTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: UseDefaultRateType (USAGE_TYPES.use_default_rate_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getUseDefaultRateTypeFetch () {
    return this.UseDefaultRateTypeFetch;
  }
  /** Set the SortOrder for field: UseDefaultRateType (USAGE_TYPES.use_default_rate_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUseDefaultRateTypeSortOrder (Integer value) {
    this.UseDefaultRateTypeSort = value;
  }
  /** Retrieve SortOrder for field: UseDefaultRateType (USAGE_TYPES.use_default_rate_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUseDefaultRateTypeSortOrder () {
    return this.UseDefaultRateTypeSort;
  }
  /** Set the sort direction for field: UseDefaultRateType (USAGE_TYPES.use_default_rate_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUseDefaultRateTypeSortDirection (boolean ascending) {
    this.UseDefaultRateTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UseDefaultRateType (USAGE_TYPES.use_default_rate_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUseDefaultRateTypeSortDirection () {
    return this.UseDefaultRateTypeSortAscending;
  }
  /** Set the field level filters for field: UseDefaultRateType (USAGE_TYPES.use_default_rate_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUseDefaultRateTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.UseDefaultRateType = value;
  }
  /** Retrieve filter for field: UseDefaultRateType (USAGE_TYPES.use_default_rate_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUseDefaultRateTypeFilter () {
    return this.UseDefaultRateType;
  }

  /**
   * Retrieves the UseDefaultRateTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UseDefaultRateTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseDefaultRateTypeFilter field
   */
  public String[] getUseDefaultRateTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseDefaultRateTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUseDefaultRateTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseDefaultRateTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseDefaultRateTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseDefaultRateTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UseDefaultRateTypeFilter filter value from a formatted string
   *
   * @param _value the UseDefaultRateTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UseDefaultRateTypeFilter filter field
   */
  public void setUseDefaultRateTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUseDefaultRateTypeFilterFromFormattedString");
    try {
      this.setUseDefaultRateTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseDefaultRateTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseDefaultRateTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseDefaultRateTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RateCurrencyLocation (USAGE_TYPES.rate_currency_location)
   * @param fetch whether to fetch this field or not
   */
  public void setRateCurrencyLocationFetch (boolean fetch) {
    this.RateCurrencyLocationFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateCurrencyLocation (USAGE_TYPES.rate_currency_location)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateCurrencyLocationFetch () {
    return this.RateCurrencyLocationFetch;
  }
  /** Set the SortOrder for field: RateCurrencyLocation (USAGE_TYPES.rate_currency_location)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateCurrencyLocationSortOrder (Integer value) {
    this.RateCurrencyLocationSort = value;
  }
  /** Retrieve SortOrder for field: RateCurrencyLocation (USAGE_TYPES.rate_currency_location)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateCurrencyLocationSortOrder () {
    return this.RateCurrencyLocationSort;
  }
  /** Set the sort direction for field: RateCurrencyLocation (USAGE_TYPES.rate_currency_location)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateCurrencyLocationSortDirection (boolean ascending) {
    this.RateCurrencyLocationSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateCurrencyLocation (USAGE_TYPES.rate_currency_location)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateCurrencyLocationSortDirection () {
    return this.RateCurrencyLocationSortAscending;
  }
  /** Set the field level filters for field: RateCurrencyLocation (USAGE_TYPES.rate_currency_location)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateCurrencyLocationFilter (IntegerFilter[] value) throws ServiceException {
    this.RateCurrencyLocation = value;
  }
  /** Retrieve filter for field: RateCurrencyLocation (USAGE_TYPES.rate_currency_location)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRateCurrencyLocationFilter () {
    return this.RateCurrencyLocation;
  }

  /**
   * Retrieves the RateCurrencyLocationFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateCurrencyLocationFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateCurrencyLocationFilter field
   */
  public String[] getRateCurrencyLocationFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateCurrencyLocationFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateCurrencyLocationFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateCurrencyLocationFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateCurrencyLocationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateCurrencyLocationFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateCurrencyLocationFilter filter value from a formatted string
   *
   * @param _value the RateCurrencyLocationFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateCurrencyLocationFilter filter field
   */
  public void setRateCurrencyLocationFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateCurrencyLocationFilterFromFormattedString");
    try {
      this.setRateCurrencyLocationFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateCurrencyLocationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateCurrencyLocationFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateCurrencyLocationFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RatePeriodRounding (USAGE_TYPES.rate_period_rounding)
   * @param fetch whether to fetch this field or not
   */
  public void setRatePeriodRoundingFetch (boolean fetch) {
    this.RatePeriodRoundingFetch = fetch;
  }
  /** Retrieve Fetch value for field: RatePeriodRounding (USAGE_TYPES.rate_period_rounding)
   * @return boolean the Fetch value for this field
   */
  public boolean getRatePeriodRoundingFetch () {
    return this.RatePeriodRoundingFetch;
  }
  /** Set the SortOrder for field: RatePeriodRounding (USAGE_TYPES.rate_period_rounding)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRatePeriodRoundingSortOrder (Integer value) {
    this.RatePeriodRoundingSort = value;
  }
  /** Retrieve SortOrder for field: RatePeriodRounding (USAGE_TYPES.rate_period_rounding)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRatePeriodRoundingSortOrder () {
    return this.RatePeriodRoundingSort;
  }
  /** Set the sort direction for field: RatePeriodRounding (USAGE_TYPES.rate_period_rounding)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRatePeriodRoundingSortDirection (boolean ascending) {
    this.RatePeriodRoundingSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RatePeriodRounding (USAGE_TYPES.rate_period_rounding)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRatePeriodRoundingSortDirection () {
    return this.RatePeriodRoundingSortAscending;
  }
  /** Set the field level filters for field: RatePeriodRounding (USAGE_TYPES.rate_period_rounding)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRatePeriodRoundingFilter (IntegerFilter[] value) throws ServiceException {
    this.RatePeriodRounding = value;
  }
  /** Retrieve filter for field: RatePeriodRounding (USAGE_TYPES.rate_period_rounding)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRatePeriodRoundingFilter () {
    return this.RatePeriodRounding;
  }

  /**
   * Retrieves the RatePeriodRoundingFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RatePeriodRoundingFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatePeriodRoundingFilter field
   */
  public String[] getRatePeriodRoundingFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatePeriodRoundingFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRatePeriodRoundingFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatePeriodRoundingFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatePeriodRoundingFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatePeriodRoundingFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RatePeriodRoundingFilter filter value from a formatted string
   *
   * @param _value the RatePeriodRoundingFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RatePeriodRoundingFilter filter field
   */
  public void setRatePeriodRoundingFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRatePeriodRoundingFilterFromFormattedString");
    try {
      this.setRatePeriodRoundingFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatePeriodRoundingFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatePeriodRoundingFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatePeriodRoundingFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RateMinimumDuration (USAGE_TYPES.rate_minimum_duration)
   * @param fetch whether to fetch this field or not
   */
  public void setRateMinimumDurationFetch (boolean fetch) {
    this.RateMinimumDurationFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateMinimumDuration (USAGE_TYPES.rate_minimum_duration)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateMinimumDurationFetch () {
    return this.RateMinimumDurationFetch;
  }
  /** Set the SortOrder for field: RateMinimumDuration (USAGE_TYPES.rate_minimum_duration)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateMinimumDurationSortOrder (Integer value) {
    this.RateMinimumDurationSort = value;
  }
  /** Retrieve SortOrder for field: RateMinimumDuration (USAGE_TYPES.rate_minimum_duration)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateMinimumDurationSortOrder () {
    return this.RateMinimumDurationSort;
  }
  /** Set the sort direction for field: RateMinimumDuration (USAGE_TYPES.rate_minimum_duration)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateMinimumDurationSortDirection (boolean ascending) {
    this.RateMinimumDurationSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateMinimumDuration (USAGE_TYPES.rate_minimum_duration)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateMinimumDurationSortDirection () {
    return this.RateMinimumDurationSortAscending;
  }
  /** Set the field level filters for field: RateMinimumDuration (USAGE_TYPES.rate_minimum_duration)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateMinimumDurationFilter (IntegerFilter[] value) throws ServiceException {
    this.RateMinimumDuration = value;
  }
  /** Retrieve filter for field: RateMinimumDuration (USAGE_TYPES.rate_minimum_duration)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRateMinimumDurationFilter () {
    return this.RateMinimumDuration;
  }

  /**
   * Retrieves the RateMinimumDurationFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateMinimumDurationFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateMinimumDurationFilter field
   */
  public String[] getRateMinimumDurationFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateMinimumDurationFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateMinimumDurationFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateMinimumDurationFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateMinimumDurationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateMinimumDurationFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateMinimumDurationFilter filter value from a formatted string
   *
   * @param _value the RateMinimumDurationFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateMinimumDurationFilter filter field
   */
  public void setRateMinimumDurationFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateMinimumDurationFilterFromFormattedString");
    try {
      this.setRateMinimumDurationFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateMinimumDurationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateMinimumDurationFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateMinimumDurationFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UseComponentId (USAGE_TYPES.use_component_id)
   * @param fetch whether to fetch this field or not
   */
  public void setUseComponentIdFetch (boolean fetch) {
    this.UseComponentIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: UseComponentId (USAGE_TYPES.use_component_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getUseComponentIdFetch () {
    return this.UseComponentIdFetch;
  }
  /** Set the SortOrder for field: UseComponentId (USAGE_TYPES.use_component_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUseComponentIdSortOrder (Integer value) {
    this.UseComponentIdSort = value;
  }
  /** Retrieve SortOrder for field: UseComponentId (USAGE_TYPES.use_component_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUseComponentIdSortOrder () {
    return this.UseComponentIdSort;
  }
  /** Set the sort direction for field: UseComponentId (USAGE_TYPES.use_component_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUseComponentIdSortDirection (boolean ascending) {
    this.UseComponentIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UseComponentId (USAGE_TYPES.use_component_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUseComponentIdSortDirection () {
    return this.UseComponentIdSortAscending;
  }
  /** Set the field level filters for field: UseComponentId (USAGE_TYPES.use_component_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUseComponentIdFilter (IntegerFilter[] value) throws ServiceException {
    this.UseComponentId = value;
  }
  /** Retrieve filter for field: UseComponentId (USAGE_TYPES.use_component_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUseComponentIdFilter () {
    return this.UseComponentId;
  }

  /**
   * Retrieves the UseComponentIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UseComponentIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseComponentIdFilter field
   */
  public String[] getUseComponentIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseComponentIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUseComponentIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseComponentIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseComponentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseComponentIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UseComponentIdFilter filter value from a formatted string
   *
   * @param _value the UseComponentIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UseComponentIdFilter filter field
   */
  public void setUseComponentIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUseComponentIdFilterFromFormattedString");
    try {
      this.setUseComponentIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseComponentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseComponentIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseComponentIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MinBillingUnits (USAGE_TYPES.min_billing_units)
   * @param fetch whether to fetch this field or not
   */
  public void setMinBillingUnitsFetch (boolean fetch) {
    this.MinBillingUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: MinBillingUnits (USAGE_TYPES.min_billing_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getMinBillingUnitsFetch () {
    return this.MinBillingUnitsFetch;
  }
  /** Set the SortOrder for field: MinBillingUnits (USAGE_TYPES.min_billing_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMinBillingUnitsSortOrder (Integer value) {
    this.MinBillingUnitsSort = value;
  }
  /** Retrieve SortOrder for field: MinBillingUnits (USAGE_TYPES.min_billing_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMinBillingUnitsSortOrder () {
    return this.MinBillingUnitsSort;
  }
  /** Set the sort direction for field: MinBillingUnits (USAGE_TYPES.min_billing_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMinBillingUnitsSortDirection (boolean ascending) {
    this.MinBillingUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MinBillingUnits (USAGE_TYPES.min_billing_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMinBillingUnitsSortDirection () {
    return this.MinBillingUnitsSortAscending;
  }
  /** Set the field level filters for field: MinBillingUnits (USAGE_TYPES.min_billing_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMinBillingUnitsFilter (BigIntegerFilter[] value) throws ServiceException {
    this.MinBillingUnits = value;
  }
  /** Retrieve filter for field: MinBillingUnits (USAGE_TYPES.min_billing_units)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getMinBillingUnitsFilter () {
    return this.MinBillingUnits;
  }

  /**
   * Retrieves the MinBillingUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MinBillingUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinBillingUnitsFilter field
   */
  public String[] getMinBillingUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinBillingUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMinBillingUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinBillingUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinBillingUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinBillingUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MinBillingUnitsFilter filter value from a formatted string
   *
   * @param _value the MinBillingUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MinBillingUnitsFilter filter field
   */
  public void setMinBillingUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMinBillingUnitsFilterFromFormattedString");
    try {
      this.setMinBillingUnitsFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinBillingUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinBillingUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinBillingUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConsolidateUsage (USAGE_TYPES.consolidate_usage)
   * @param fetch whether to fetch this field or not
   */
  public void setConsolidateUsageFetch (boolean fetch) {
    this.ConsolidateUsageFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConsolidateUsage (USAGE_TYPES.consolidate_usage)
   * @return boolean the Fetch value for this field
   */
  public boolean getConsolidateUsageFetch () {
    return this.ConsolidateUsageFetch;
  }
  /** Set the SortOrder for field: ConsolidateUsage (USAGE_TYPES.consolidate_usage)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConsolidateUsageSortOrder (Integer value) {
    this.ConsolidateUsageSort = value;
  }
  /** Retrieve SortOrder for field: ConsolidateUsage (USAGE_TYPES.consolidate_usage)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConsolidateUsageSortOrder () {
    return this.ConsolidateUsageSort;
  }
  /** Set the sort direction for field: ConsolidateUsage (USAGE_TYPES.consolidate_usage)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConsolidateUsageSortDirection (boolean ascending) {
    this.ConsolidateUsageSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConsolidateUsage (USAGE_TYPES.consolidate_usage)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConsolidateUsageSortDirection () {
    return this.ConsolidateUsageSortAscending;
  }
  /** Set the field level filters for field: ConsolidateUsage (USAGE_TYPES.consolidate_usage)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConsolidateUsageFilter (BooleanFilter[] value) throws ServiceException {
    this.ConsolidateUsage = value;
  }
  /** Retrieve filter for field: ConsolidateUsage (USAGE_TYPES.consolidate_usage)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getConsolidateUsageFilter () {
    return this.ConsolidateUsage;
  }

  /**
   * Retrieves the ConsolidateUsageFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ConsolidateUsageFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConsolidateUsageFilter field
   */
  public String[] getConsolidateUsageFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConsolidateUsageFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getConsolidateUsageFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConsolidateUsageFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConsolidateUsageFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getConsolidateUsageFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ConsolidateUsageFilter filter value from a formatted string
   *
   * @param _value the ConsolidateUsageFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ConsolidateUsageFilter filter field
   */
  public void setConsolidateUsageFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setConsolidateUsageFilterFromFormattedString");
    try {
      this.setConsolidateUsageFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConsolidateUsageFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setConsolidateUsageFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConsolidateUsageFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NetworkDelay (USAGE_TYPES.network_delay)
   * @param fetch whether to fetch this field or not
   */
  public void setNetworkDelayFetch (boolean fetch) {
    this.NetworkDelayFetch = fetch;
  }
  /** Retrieve Fetch value for field: NetworkDelay (USAGE_TYPES.network_delay)
   * @return boolean the Fetch value for this field
   */
  public boolean getNetworkDelayFetch () {
    return this.NetworkDelayFetch;
  }
  /** Set the SortOrder for field: NetworkDelay (USAGE_TYPES.network_delay)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNetworkDelaySortOrder (Integer value) {
    this.NetworkDelaySort = value;
  }
  /** Retrieve SortOrder for field: NetworkDelay (USAGE_TYPES.network_delay)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNetworkDelaySortOrder () {
    return this.NetworkDelaySort;
  }
  /** Set the sort direction for field: NetworkDelay (USAGE_TYPES.network_delay)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNetworkDelaySortDirection (boolean ascending) {
    this.NetworkDelaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NetworkDelay (USAGE_TYPES.network_delay)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNetworkDelaySortDirection () {
    return this.NetworkDelaySortAscending;
  }
  /** Set the field level filters for field: NetworkDelay (USAGE_TYPES.network_delay)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNetworkDelayFilter (IntegerFilter[] value) throws ServiceException {
    this.NetworkDelay = value;
  }
  /** Retrieve filter for field: NetworkDelay (USAGE_TYPES.network_delay)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getNetworkDelayFilter () {
    return this.NetworkDelay;
  }

  /**
   * Retrieves the NetworkDelayFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NetworkDelayFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NetworkDelayFilter field
   */
  public String[] getNetworkDelayFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetworkDelayFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNetworkDelayFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNetworkDelayFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NetworkDelayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNetworkDelayFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NetworkDelayFilter filter value from a formatted string
   *
   * @param _value the NetworkDelayFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NetworkDelayFilter filter field
   */
  public void setNetworkDelayFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNetworkDelayFilterFromFormattedString");
    try {
      this.setNetworkDelayFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NetworkDelayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNetworkDelayFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNetworkDelayFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RatingMethod (USAGE_TYPES.rating_method)
   * @param fetch whether to fetch this field or not
   */
  public void setRatingMethodFetch (boolean fetch) {
    this.RatingMethodFetch = fetch;
  }
  /** Retrieve Fetch value for field: RatingMethod (USAGE_TYPES.rating_method)
   * @return boolean the Fetch value for this field
   */
  public boolean getRatingMethodFetch () {
    return this.RatingMethodFetch;
  }
  /** Set the SortOrder for field: RatingMethod (USAGE_TYPES.rating_method)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRatingMethodSortOrder (Integer value) {
    this.RatingMethodSort = value;
  }
  /** Retrieve SortOrder for field: RatingMethod (USAGE_TYPES.rating_method)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRatingMethodSortOrder () {
    return this.RatingMethodSort;
  }
  /** Set the sort direction for field: RatingMethod (USAGE_TYPES.rating_method)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRatingMethodSortDirection (boolean ascending) {
    this.RatingMethodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RatingMethod (USAGE_TYPES.rating_method)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRatingMethodSortDirection () {
    return this.RatingMethodSortAscending;
  }
  /** Set the field level filters for field: RatingMethod (USAGE_TYPES.rating_method)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRatingMethodFilter (IntegerFilter[] value) throws ServiceException {
    this.RatingMethod = value;
  }
  /** Retrieve filter for field: RatingMethod (USAGE_TYPES.rating_method)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRatingMethodFilter () {
    return this.RatingMethod;
  }

  /**
   * Retrieves the RatingMethodFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RatingMethodFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatingMethodFilter field
   */
  public String[] getRatingMethodFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatingMethodFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRatingMethodFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatingMethodFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatingMethodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatingMethodFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RatingMethodFilter filter value from a formatted string
   *
   * @param _value the RatingMethodFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RatingMethodFilter filter field
   */
  public void setRatingMethodFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRatingMethodFilterFromFormattedString");
    try {
      this.setRatingMethodFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatingMethodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatingMethodFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatingMethodFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UseZoneClass (USAGE_TYPES.use_zone_class)
   * @param fetch whether to fetch this field or not
   */
  public void setUseZoneClassFetch (boolean fetch) {
    this.UseZoneClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: UseZoneClass (USAGE_TYPES.use_zone_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getUseZoneClassFetch () {
    return this.UseZoneClassFetch;
  }
  /** Set the SortOrder for field: UseZoneClass (USAGE_TYPES.use_zone_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUseZoneClassSortOrder (Integer value) {
    this.UseZoneClassSort = value;
  }
  /** Retrieve SortOrder for field: UseZoneClass (USAGE_TYPES.use_zone_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUseZoneClassSortOrder () {
    return this.UseZoneClassSort;
  }
  /** Set the sort direction for field: UseZoneClass (USAGE_TYPES.use_zone_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUseZoneClassSortDirection (boolean ascending) {
    this.UseZoneClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UseZoneClass (USAGE_TYPES.use_zone_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUseZoneClassSortDirection () {
    return this.UseZoneClassSortAscending;
  }
  /** Set the field level filters for field: UseZoneClass (USAGE_TYPES.use_zone_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUseZoneClassFilter (IntegerFilter[] value) throws ServiceException {
    this.UseZoneClass = value;
  }
  /** Retrieve filter for field: UseZoneClass (USAGE_TYPES.use_zone_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getUseZoneClassFilter () {
    return this.UseZoneClass;
  }

  /**
   * Retrieves the UseZoneClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UseZoneClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseZoneClassFilter field
   */
  public String[] getUseZoneClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseZoneClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUseZoneClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseZoneClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseZoneClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseZoneClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UseZoneClassFilter filter value from a formatted string
   *
   * @param _value the UseZoneClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UseZoneClassFilter filter field
   */
  public void setUseZoneClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUseZoneClassFilterFromFormattedString");
    try {
      this.setUseZoneClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseZoneClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseZoneClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseZoneClassFilterFromFormattedString");
  }

  public String toString() {
    return UnbilledUsageObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return UnbilledUsageObjectHelper.toMap(this, null);
  }
}
